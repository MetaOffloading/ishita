package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class RTQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qRTQ = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qRTQ.name = "qRTQ";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qRTQ.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate what you GENERALLY feel to be true. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qRTQ.nOptions = 3;
		
		//How many items (i.e. questions) does the questionnaire have?
		qRTQ.nItems = 9;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qRTQ.itemsPerPage = 5;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qRTQ.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qRTQ.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qRTQ.options[0] = "Not at all true";
		qRTQ.options[1] = "Somewhat true";
		qRTQ.options[2] = "Very true";
		
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qRTQ.items[0] = "I have thoughts or images about all my shortcomings, failings, faults, mistakes ";
		qRTQ.items[1] = "I have thoughts or images about events that come into my head even when I do not wish to think about them again ";
		qRTQ.items[2] = "I have thoughts or images that I won't be able to do my job/work because I feel so badly";
		qRTQ.items[3] = "I have thoughts or images that are difficult to forget ";
		qRTQ.items[4] = "Once I start thinking about the situation, I can't stop ";
		qRTQ.items[5] = " I notice that I think about the situation ";
		qRTQ.items[6] = " I have thoughts or images of the situation that I try to resist thinking about  ";
		qRTQ.items[7] = "I think about the situation all the time";
		qRTQ.items[8] = "I know you shouldn't think about the situation, but can't help it ";
		qRTQ.items[9] = "I have thoughts or images about the situation and wish it would go better ";
	

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qRTQ.Run();
	}
}