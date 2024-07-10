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
		qRTQ.instructionText = "In this questionnaire we are interested in understanding how you respond to "
				+ "distressing situations. Please recall how you tend to respond when you feel distressed "
				+ "or upset.<br><br>How true are each of these statements with respect to your experience "
				+ "<b>when you are distressed or upset</b>?<br><br>Please respond on a scale from 1 to 5, "
				+ "where <b>1</b> means 'Not true at all', <b>2, 3, and 4</b> mean 'Somewhat true', and "
				+ "<b>5</b> means 'Very true'. "; 
		
		//How many response options does the questionnaire have?
		qRTQ.nOptions = 5;
		
		//How many items (i.e. questions) does the questionnaire have?
		qRTQ.nItems = 11;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qRTQ.itemsPerPage = 6;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qRTQ.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qRTQ.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qRTQ.options[0] = "1";
		qRTQ.options[1] = "2";
		qRTQ.options[2] = "3";
		qRTQ.options[3] = "4";
		qRTQ.options[4] = "5";
		
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qRTQ.items[0] = "I have thoughts or images about all my shortcomings, failings, faults, mistakes ";
		qRTQ.items[1] = "I have thoughts or images about events that come into my head even when I do not wish to think about them again ";
		qRTQ.items[2] = "I have thoughts or images that I won't be able to do my job/work because I feel so badly";
		qRTQ.items[3] = "I have thoughts or images that are difficult to forget ";
		qRTQ.items[4] = "Once I start thinking about the situation, I can't stop ";
		qRTQ.items[5] = "I notice that I think about the situation ";
		qRTQ.items[6] = "I have thoughts or images of the situation that I try to resist thinking about  ";
		qRTQ.items[7] = "I turn into a banana";
		qRTQ.items[8] = "I think about the situation all the time";
		qRTQ.items[9] = "I know you shouldn't think about the situation, but can't help it ";
		qRTQ.items[10] = "I have thoughts or images about the situation and wish it would go better ";
	

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qRTQ.Run();
	}
}