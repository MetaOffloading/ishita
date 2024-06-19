package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class MFEQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qMFE = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qMFE.name = "qMFE";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qMFE.instructionText = "The following pages show a number statements describing occurrences that people "
				+ "sometimes experience.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how often this happens to you. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qMFE.nOptions = 3;
		
		//How many items (i.e. questions) does the questionnaire have?
		qMFE.nItems = 27;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qMFE.itemsPerPage = 8;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qMFE.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qMFE.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qMFE.options[0] = "Never /<br>rarely";
		qMFE.options[1] = "Sometimes /<br>not often";
		qMFE.options[2] = "Often /<br>frequently";
	
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qMFE.items[0] = "Forgetting where you have put something";
		qMFE.items[1] = "Failing to recognise places";
		qMFE.items[2] = "Finding a television story difficult to follow";
		qMFE.items[3] = "Forgetting a change in your daily routine";
		qMFE.items[4] = "Having to go back to check whether you have done something";
		qMFE.items[5] = "Forgetting when it was that something happened";
		qMFE.items[6] = "Forgetting, leaving things (keys.)";
		qMFE.items[7] = "Forgetting that you were told something yesterday";
		qMFE.items[8] = "Starting to read something without realizing you have already read it before";
		qMFE.items[9] = "Letting yourself ramble on to speak about irrelevant things";
		qMFE.items[10] = "Failing to recognise close relatives or friends";
		qMFE.items[11] = "Having difficulty picking up a new skill";
		qMFE.items[12] = "Finding that a word is \"on the tip of your tongue\"";
		qMFE.items[13] = "Forgetting to do things";
		qMFE.items[14] = "Forgetting important details of what happened to you the day before";
		qMFE.items[15] = "Forgetting what you have just said";
		qMFE.items[16] = "Being unable to follow the thread of a story";
		qMFE.items[17] = "Forgetting to tell somebody something";
		qMFE.items[18] = "Forgetting important details about yourself (where you live,...)";
		qMFE.items[19] = "Getting mixed up and confused what someone has told you";
		qMFE.items[20] = "Telling someone a story or joke that you have told them once already";
		qMFE.items[21] = "Forgetting details of things you do regularly";
		qMFE.items[22] = "Finding that the faces of famous people look unfamiliar";
		qMFE.items[23] = "Forgetting where things are normally kept";
		qMFE.items[24] = "Getting lost in a place where you have often been before";
		qMFE.items[25] = "Getting lost in a place where you have only been once or twice before";
		qMFE.items[26] = "Doing some routine thing twice by mistake";
		qMFE.items[27] = "Repeating to someone what you have just told them";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qMFE.Run();
	}
}