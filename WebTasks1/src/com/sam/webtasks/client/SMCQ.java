package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class SMCQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qSMCQ = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qSMCQ.name = "qSMCQ";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qSMCQ.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qSMCQ.nOptions = 2;
		
		//How many items (i.e. questions) does the questionnaire have?
		qSMCQ.nItems = 13;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qSMCQ.itemsPerPage = 5;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qSMCQ.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qSMCQ.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qSMCQ.options[0] = "Yes";
		qSMCQ.options[1] = "No";
		
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qSMCQ.items[0] = "Do you think you have a memory problem?";
		qSMCQ.items[1] = "Do you think that your memory is worse than it used to be?";
		qSMCQ.items[2] = "Do you think that your memory is poorer than that of other people of a similar age?";
		qSMCQ.items[3] = "Do you feel that your everyday life is difficult due to memory decline?";
		qSMCQ.items[4] = "Do you have difficulty in remembering a recent event?";
		qSMCQ.items[5] = "Do you have difficulty in remembering a conversation from a few days ago? ";
		qSMCQ.items[6] = "Do you have difficulty in remembering an appointment made a few days ago?";
		qSMCQ.items[7] = "Do you have difficulty in recognizing familiar people?";
		qSMCQ.items[8] = "Do you have difficulty in remembering where you placed objects?";
		qSMCQ.items[9] = "Do you lose objects more often than you did previously?";
		qSMCQ.items[10] = "Have you become lost near your home?";
		qSMCQ.items[11] = "Do you have difficulty in remembering 2 or 3 items to buy when shopping?";
		qSMCQ.items[12] = "Do you have difficulty in remembering to turn off the gas or lights?";
		qSMCQ.items[13] = "Do you have difficulty in remembering the phone numbers of close friends/relatives?";
		

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qSMCQ.Run();
	}
}

