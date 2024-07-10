//The SequenceHandler is the piece of code that defines the sequence of events
//that constitute the experiment.
//
//SequenceHandler.Next() will run the next step in the sequence.
//
//We can also switch between the main sequence of events and a subsequence
//using the SequenceHandler.SetLoop command. This takes two inputs:
//The first sets which loop we are in. 0 is the main loop. 1 is the first
//subloop. 2 is the second subloop, and so on.
//
//The second input is a Boolean. If this is set to true we initialise the 
//position so that the sequence will start from the beginning. If it is
//set to false, we will continue from whichever position we were currently in.
//
//So SequenceHandler.SetLoop(1,true) will switch to the first subloop,
//starting from the beginning.
//
//SequenceHandler.SetLoop(0,false) will switch to the main loop,
//continuing from where we left off.

package com.sam.webtasks.client;

import java.util.ArrayList;

import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.sam.webtasks.basictools.CheckIdExists;
import com.sam.webtasks.basictools.CheckScreenSize;
import com.sam.webtasks.basictools.ClickPage;
import com.sam.webtasks.basictools.Consent;
import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.basictools.InfoSheet;
import com.sam.webtasks.basictools.Initialise;
import com.sam.webtasks.basictools.Names;
import com.sam.webtasks.basictools.PHP;
import com.sam.webtasks.basictools.ProgressBar;
import com.sam.webtasks.basictools.Slider;
import com.sam.webtasks.basictools.TimeStamp;
import com.sam.webtasks.iotask1.IOtask1Block;
import com.sam.webtasks.iotask1.IOtask1BlockContext;
import com.sam.webtasks.iotask1.IOtask1DisplayParams;
import com.sam.webtasks.iotask1.IOtask1InitialiseTrial;
import com.sam.webtasks.iotask1.IOtask1RunTrial;
import com.sam.webtasks.iotask2.IOtask2Block;
import com.sam.webtasks.iotask2.IOtask2BlockContext;
import com.sam.webtasks.iotask2.IOtask2DisplayParams;
import com.sam.webtasks.iotask2.IOtask2RunTrial;
import com.sam.webtasks.iotask2.IOtask2InitialiseTrial;
import com.sam.webtasks.iotask2.IOtask2PreTrial;

public class SequenceHandler {
	static String response = "";
	
	public static void Next() {	
		// move forward one step in whichever loop we are now in
		sequencePosition.set(whichLoop, sequencePosition.get(whichLoop) + 1);

		switch (whichLoop) {
		case 0: // MAIN LOOP
			switch (sequencePosition.get(0)) {
			/***********************************************************************
			 * The code here defines the main sequence of events in the experiment *
			 ********************************************************************/		
			case 1:
				//STAI.Run();
				//MFEQ.Run();
				RTQ.Run();
				break;
			case 2:
				SMCQ.Run();
				break;
			case 3:
				MCQ.Run();
				break;
			case 4:
				PTQ.Run();
				break;
			case 5:
				RTQ.Run();
				break;
			case 6:
				ClickPage.Run("the end", "end");
				break;
			}
			break;

			
			/********************************************/
			/* no need to edit the code below this line */
			/********************************************/

		case 1: // initialisation loop
			switch (sequencePosition.get(1)) {
			case 1:
				// initialise experiment settings
				Initialise.Run();
				break;
			case 2:
				// make sure that a participant ID has been registered.
				// If not, the participant may not have accepted the HIT
				CheckIdExists.Run();
				break;
			case 3:
				// check the status of this participant ID.
				// have they already accessed or completed the experiment? if so,
				// we may want to block them, depending on the setting of
				// SessionInfo.eligibility
				PHP.CheckStatus();
				break;
			case 4:
				// check whether this participant ID has been used to access a previous experiment
				PHP.CheckStatusPrevExp();
				break;
			case 5:
				// clear screen, now that initial checks have been done
				RootPanel.get().clear();

				// make sure the browser window is big enough
				CheckScreenSize.Run(SessionInfo.minScreenSize, SessionInfo.minScreenSize);
				break;
			case 6:
				if (SessionInfo.runInfoConsentPages) { 
					InfoSheet.Run(Instructions.InfoText());
				} else {
					SequenceHandler.Next();
				}
				break;
			case 7:
				if (SessionInfo.runInfoConsentPages) { 
					Consent.Run();
				} else {
					SequenceHandler.Next();
				}
				break;
			case 8:
				//record the participant's counterbalancing condition in the status table				
				if (!SessionInfo.resume) {
					PHP.UpdateStatus("" + Counterbalance.getCounterbalancingCell());
				} else {
					SequenceHandler.Next();
				}
				break;
			case 9:
				SequenceHandler.SetLoop(0, true); // switch to and initialise the main loop
				SequenceHandler.Next(); // start the loop
				break;
			}
			break;

		case 2: // IOtask1 loop
			switch (sequencePosition.get(2)) {
			/*************************************************************
			 * The code here defines the sequence of events in subloop 2 *
			 * This runs a single trial of IOtask1                       *
			 *************************************************************/
			case 1:
				// first check if the block has ended. If so return control to the main sequence
				// handler
				IOtask1Block block = IOtask1BlockContext.getContext();

				if (block.currentTrial == block.nTrials) {
					SequenceHandler.SetLoop(0, false);
				}

				SequenceHandler.Next();
				break;
			case 2:
				// now initialise trial and present instructions
				IOtask1InitialiseTrial.Run();
				break;
			case 3:
				// now run the trial
				IOtask1RunTrial.Run();
				break;
			case 4:
				// we have reached the end, so we need to restart the loop
				SequenceHandler.SetLoop(2, true);
				SequenceHandler.Next();
				break;
				// TODO: mechanism to give post-trial feedback?

			}
			break;

		case 3: //IOtask2 loop
			switch (sequencePosition.get(3)) {
			/*************************************************************
			 * The code here defines the sequence of events in subloop 3 *
			 * This runs a single trial of IOtask2                       *
			 *************************************************************/
			case 1:
				// first check if the block has ended. If so return control to the main sequence
				// handler
				IOtask2Block block = IOtask2BlockContext.getContext();

				if (block.currentTrial == block.nTrials) {
					SequenceHandler.SetLoop(0,  false);
				}

				SequenceHandler.Next();
				break;
			case 2:
				IOtask2InitialiseTrial.Run();
				break;
			case 3:
				//present the pre-trial choice if appropriate
				if (IOtask2BlockContext.currentTargetValue() > -1) {
					IOtask2PreTrial.Run();
				} else { //otherwise just skip to the start of the block
					if (IOtask2BlockContext.getAnnouncePoints()) {
						int trialNum = IOtask2BlockContext.getTrialNum();

						String msg = "This time, the PINK circles will be worth <b>";

						if (((trialNum+Counterbalance.getFactorLevel("conditionOrder")) % 2) == 0) {
							int[] pointValues = {0,Params.mediumValuePoints,Params.lowValuePoints,0};

							IOtask2BlockContext.setPointValues(pointValues);	

							msg += "" + Params.lowValuePoints + "</b> ";
							
							if (Params.lowValuePoints==1) {
								msg += "point";
							} else {
								msg += "points";
							}
						} else {
							int[] pointValues = {0,Params.mediumValuePoints,Params.highValuePoints,0};

							IOtask2BlockContext.setPointValues(pointValues);	

							msg += "" + Params.highValuePoints + "</b> points";
						}

						msg += ".<br><br>Ready?";	

						ClickPage.Run(msg, "Continue");
					} else {
						SequenceHandler.Next();
					}
				} 

				break;
			case 4:
				//now run the trial
				IOtask2RunTrial.Run();
				break;
			case 5:
				if (IOtask2BlockContext.showPostTrialFeedback()) {
					IOtask2Feedback.Run();
				} else {
					SequenceHandler.Next();
				}
				break;
			case 6:
				//we have reached the end, so we need to restart the loop
				SequenceHandler.SetLoop(3,  true);
				SequenceHandler.Next();
				break;
			}
		
			break;
		case 4: //IOtask1 thoughtprobe
			switch (sequencePosition.get(4)) {
			case 1:
				Slider.Run("Please tell us to what extent your thoughts just now were "
						+ "<b>On Task</b> (totally focused on the circle-dragging memory task), <b>Off Task</b> "
						+ "(totally focused on something else), or somewhere in between.",
						ExtraNames.LeftOption1, ExtraNames.RightOption1);
				break;
			case 2:	
				int sliderValue1 = Slider.getSliderValue();

				if (ExtraNames.probe1reverse) {
					sliderValue1 = 100 - sliderValue1;
				}
				
				String data1 = IOtask1BlockContext.getTrialTimeStamp() + ",";
				data1 = data1 + IOtask1BlockContext.getBlockNum() + ",";
				data1 = data1 + IOtask1BlockContext.getTrialNum() + ",";
				data1 = data1 + IOtask1BlockContext.getNTargets() + ",";
				data1 = data1 + IOtask1BlockContext.getOffloadCondition() + ",";
				data1 = data1 + sliderValue1;
				
				PHP.logData("OffTaskProbe", data1, true);
				break;
			case 3:			
				if (!ExtraNames.THOUGHT_PROBE_PRAC) {
					Slider.Run("Now please tell us to what extent any Off Task thoughts were "
						+ "<b>Intentional</b>, <b>Unintentional</b>, or somewhere in between.",
						ExtraNames.LeftOption2, ExtraNames.RightOption2);
				} else {
					SequenceHandler.Next();
				}
				break;
			case 4:
				int sliderValue2 = Slider.getSliderValue();
				
				if (ExtraNames.probe2reverse) {
					sliderValue2 = 100 - sliderValue2;
				}
				
				String data2 = IOtask1BlockContext.getTrialTimeStamp() + ",";
				data2 = data2 + IOtask1BlockContext.getBlockNum() + ",";
				data2 = data2 + IOtask1BlockContext.getTrialNum() + ",";
				data2 = data2 + IOtask1BlockContext.getNTargets() + ",";
				data2 = data2 + IOtask1BlockContext.getOffloadCondition() + ",";
				data2 = data2 + sliderValue2;
				
				PHP.logData("IntentionalityProbe", data2, true);
				break;
			case 5:
				//go back to task
				SequenceHandler.SetLoop(2,  true);
				SequenceHandler.Next();
			}
		}
	}

	private static ArrayList<Integer> sequencePosition = new ArrayList<Integer>();
	private static int whichLoop;

	public static void SetLoop(int loop, Boolean init) {
		whichLoop = loop;

		while (whichLoop + 1 > sequencePosition.size()) { // is this a new loop?
			// if so, initialise the position in this loop to zero
			sequencePosition.add(0);
		}

		if (init) { // go the beginning of the sequence if init is true
			sequencePosition.set(whichLoop, 0);
		}
	}

	// get current loop
	public static int GetLoop() {
		return (whichLoop);
	}

	// set a new position
	public static void SetPosition(int newPosition) {
		sequencePosition.set(whichLoop, newPosition);
	}

	// get current position
	public static int GetPosition() {
		return (sequencePosition.get(whichLoop));
	}
}
