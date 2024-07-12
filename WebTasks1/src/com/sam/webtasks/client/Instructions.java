package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;

public class Instructions {

	public static String Get(int index) {
		String i = "";

		switch (index) {
		case 0:
            i = "This experiment will be in two parts. First you will complete <b>a web-based task</b> "
            		+ "that will take approximately 20 minutes.<br><br>"
            		+ "In the second part, will be asked to complete five brief questionnaires.<br><br>"
            		+ "After this, you will receive a link that you can click to obtain payment from Prolific.<br><br>"
            		+ "Please only continue when you think "
                    + "you will be free from distractions for the next 20 minutes.";
            break;
        case 1:
        	i="In this part of the experiment you will have a simple task to do.<br><br>"
                    + "You will see </b>several yellow circles</b> inside a box. "
                    + "Inside each circle will be a number. <br><br>"
                    + "You can move them around using your mouse, or drag them with your finger if "
                    + "you are using a touchscreen. </b>Your task is to drag them to the bottom "
                    + "of the box in sequence.</b> "
                    + "Please start by dragging 1 all the way to the bottom. "
                    + "This will make it disappear. Then drag 2 to the bottom, then 3, "
                    + "and so on.<br><br>Click below to practise the task.";

            break;
        case 2:
			i="Now you will continue the same task, but sometimes there will be something else to "
                    + "do.<br><br>As well as dragging each circle in turn to the "
                    + "bottom of the screen, there will sometimes be special "
                    + "circles that initially appear in a different colour. You should drag these "
                    + "special circles, in another direction (left, top, or right) instead of towards the bottom.<br><br>"
                    + "Each circle's initial colour is an instruction telling you where they should go.<br><br>"
                    + "For example, suppose that the circle with 7 in it was first shown in blue "
                    + "when it appeared on the screen. That would be an instruction that "
                    + "when you get to 7 in the sequence, you should drag that circle "
                    + "to the blue side of the box (left) instead of the bottom.<br><br>"
                    + "You will still be able to drag any "
                    + "circle to the bottom of the box, but you should try to "
                    + "remember to drag these special circles to the instructed "
                    + "location instead.<br><br>"
                    + "Click below to practise the task.";
            break;
        case 3:
			i = "Well done. Now it will get more difficult.<br><br>There will be a total of 15 "
	        			+ "circles and " + Params.nTargets + " of them will be special ones that should go to one of the "
	        			+ "coloured sides of the box.<br><br> "
	        			+ "Don't worry if you do not remember all of them. That's fine - "
	        			+ "just try to remember as many as you can.<br><br>"
	        			+ "Click below to practise the task.";
            break;
        case 4:
        	i="Now that you have had some practice with the experiment, we would like you to tell us "
                    + "how <b>confident</b> you are that you can accurately perform the task.<br><br>"
                    + "Please use the scale below to indicate what percentage of "
                    + "the special circles you can correctly drag to the instructed side of the square, on average. 100% "
                    + "would mean that you always get every single one correct. 0% would mean that you can never "
                    + "get any of them correct.";
            break;
        case 5:
        	i="Now we are going to explain a strategy that can make the task easier.<br><br>"
                    + "When you see a special circle, you can </b>set a reminder by immediately dragging it to a "
                    + "different part of the box</b>. For example, if a circle initially appeared in blue, you "
                    + "could immediately drag it next to the blue (left) side of the box. Then, when "
                    + "you get to that circle in the sequence its location would remind you where it is supposed "
                    + "to go.<br><br>Please now try the task again, using this strategy to help you.";
            break;
        case 6:
        	i = "From now on, you will score points every time you drag one of the special circles "  
					+ "to the correct border.<br><br>You should try to score as many points as you can.<br><br>"
					+ "The top 50% of participants will receive an additional bonus payment of £0.50.<br><br>";
        	break;
        case 61:
        	i = "Each time you do the task, you will have a choice between two options. One option will be to "
        	        + "do the task <b>without reminders</b>. If you choose this option, you will always score "
        	        + "10 points for every special circle you remember.<br><br>The other option will be to do the task "
        	        + "<b>with reminders</b>. If you choose this option, each special circle will be worth fewer "
        	        + "points. For example, you might be told that if you want to use reminders, each special "
        	        + "circle will be worth only 5 points.<br><br>You should choose whichever option you think will "
        	        + "score you the most points.<br><br>So if, for example, you thought you would earn more "
        	        + "points by setting reminders and scoring 5 points for each special circle, you should choose "
        	        + "this option. But if you thought you would score more points by just using your own memory "
        	        + "and earning 10 points for each special circle, you should choose this option instead.";
        	break;
        case 62:
        	i = "When you are presented with a choice like this, it is completely up to you. "
                    + "You should do whatever you think will allow you to score the highest number of points. "
                    + "Please keep in mind not only the points, but also how many special circles you are likely to "
                    + "drag to the correct border with/without reminders.<br><br>"
        			+ "If you use reminders, the exact number of points you can win for each special circle will vary, "
        			+ "but it will always be less than 10. You will always be told exactly "
        			+ "how many points the special circles are worth, before you make your choice.<br><br>"
        			+ "Please make your decisions carefully to make sure you score as many points as possible. This "
        			+ "will give you the best chance to earn the additional £0.50 bonus payment.<br><br>"
        			+ "Click below for some more practice.";
        	break;
        case 7:
        	i = "There is one last element to this task, which is that on a random number of blocks, "
        			+ "the computer will overwrite your choices. Regardless of the choice you just "
        			+ "made you will then be told whether reminders are <b>forbidden</b> or whether "
        			+ "they are <b>mandatory</b>. Please pay attention to when this happens and "
        			+ "carefully follow the instructions.<br><br>"
        			+ "Click below to complete one last practice block.";
        	break;
        case 8:
            i = "Now this task will start for real.<br><br>"
                    + "Please perform the task as quickly and accurately as possible.<br><br>"
                    + "You are not expected to remember the special circles every time, "
                    + "just try your best. Please make wise decisions as to whether you would "
                    + "like to use reminders or not so that you can maximise your points.<br><br>"
                    + "From now on, a little timer will indicate how much time you have left to "
                    + "move all circles. Please complete every block within 1 minute.<br><br>"
                    + "One last thing: Sometimes the task will <b>finish early</b>, before any special "
                    + "circles appear. This is not a bug, but intended to speed things up a little.<br><br>"
                    + "You can start the main experiment when you are ready.";
            break;
        case 9:
			i = "You have now completed the experimental blocks, thank you. "
					+ "In the last part, we ask you to complete a "
					+ "brief questionnaire.<br><br>"
					+ "Please start the questionnaire when you are ready.";
			break;
        case 10:
			i = "You have now completed the experiment. "
					+ "Please click on the link below to return to the survey and complete the first session:<br><br>"
					+ "<b><a href=\"" 
 					+ SessionInfo.participantID + "\">"
 					+ "CLICK HERE</a></b>";
			break;
		}

		return (i);
	}

	public static String InfoText() {
		String expDur = "40";
		String eligibility = "All registered users of Prolific ";
		String nVolunteers = "50";
		
		return ("We would like to invite you to participate in this research project. "
				+ "You should only participate if you want to; choosing not to take part "
				+ "will not disadvantage you in any way. Before you decide whether you "
				+ "want to take part, please read the following information carefully and "
				+ "discuss it with others if you wish. Ask us if there is anything that "
				+ "is not clear or you would like more information.<br><br>"
				+ "We are recruiting approximately " + nVolunteers + " volunteers to "
				+ "take part in an experiment aiming to improve our understanding of human "
				+ "attention and memory. " + eligibility + "are eligible "
				+ "to take part. "
				+ "The experiment will last approximately " + expDur + " minutes. During this experiment you "
				+ "will see various shapes on the screen and you will use your mouse or touchscreen "
				+ "to drag them from one location to another. Full instructions will be provided. "
				+ "There are no anticipated risks or "
				+ "benefits associated with participation in this study.<br><br>"
				+ "It is up to you to decide whether or not to take part. If you choose "
				+ "not to participate, you won't incur any penalties or lose any "
				+ "benefits to which you might have been entitled. If you do "
				+ "decide to take part, you can print out this information sheet and "
				+ "you will be asked to fill out a consent form on the next page. " + "Even after agreeing to take "
				+ "part, you can still withdraw at any time and without giving a reason. This will not affect "
				+ "any benefits that you are entitled to. "
				+ "<br><br>All the information that we collect about you during the course of the research will be "
				+ "kept strictly confidential. The personal information that we will collect is your Prolific ID code. This "
				+ "allows us to link you to your data so that we can process any applicable bonus payments. You will not "
				+ "be able to be identified in any ensuing reports "
				+ "or publications. The results of this research may be published in scientific journals. You can "
				+ "contact the investigator to receive a copy of any published results.<br><br>"
				+ "The data controller for this project will be University College London (UCL). The "
				+ "UCL Data Protection Office provices oversight of UCL activities involving the processing "
				+ "of personal data, and can be contacted at <a href=\"mailto: data-protection@ucl.ac.uk\">"
				+ "data-protection@ucl.ac.uk</a>. UCL's Data Protection Officer can also be contacted at "
				+ "<a href=\"data-protection@ucl.ac.uk\">data-protection@ucl.ac.uk</a>.<br><br>"
				+ "Your personal data will be processed for the purposes outlined in this notice. The "
				+ "legal basis that would be used to process your <i>personal data</i> will be "
				+ "performance of a task in the pulic interest. Your personal data will be processed "
				+ "so long as it is required for the research project. If we are able to anonymise or pseudonymise "
				+ "the personal data you provide we will undertake this, and will endeavour to minimise "
				+ "the processing of personal data wherever possible. Data from this project may "
				+ "also be uploaded to a public repository such as <a href=\"https://osf.io\">https://osf.io</a>. "
				+ "Any data uploaded to a public repository will be anonymised so that it will not "
				+ "be possible to identify you from this data. No personal data will be uploaded publically. "
				+ "If you have any concerns or complaints about this research you should "
				+ "<a href=\"mailto: sam.gilbert@ucl.ac.uk\">contact</a> the principal researcher. "
				+ "If you feel that your complaint has not been handled to your satisfaction you can "
				+ "contact the Chair of the UCL Research Ethics Committee - "
				+ "<a href=\"mailto: ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>.");
	}

}
