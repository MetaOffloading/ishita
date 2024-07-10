package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class PTQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qPTQ = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qPTQ.name = "qPTQ";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qPTQ.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate what you GENERALLY feel to be true. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qPTQ.nOptions = 5;
		
		//How many items (i.e. questions) does the questionnaire have?
		qPTQ.nItems = 16;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qPTQ.itemsPerPage = 6;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qPTQ.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qPTQ.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qPTQ.options[0] = "Never";
		qPTQ.options[1] = "Rarely";
		qPTQ.options[2] = "Sometimes";
		qPTQ.options[3] = "Often";
		qPTQ.options[4] = "Almost<br>always";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qPTQ.items[0] = "The same thoughts keep going through my mind again and again";
		qPTQ.items[1] = "Thoughts intrude into my mind ";
		qPTQ.items[2] = "I can't stop dwelling on them ";
		qPTQ.items[3] = "I think about many problems without solving any of them ";
		qPTQ.items[4] = "I can't do anything else while thinking about my problems ";
		qPTQ.items[5] = "My thoughts repeat themselves ";
		qPTQ.items[6] = "Thoughts come to my mind without me wanting them to " ;
		qPTQ.items[7] = "I get stuck on certain issues and can't move on ";
		qPTQ.items[8] = "I genuinely believe that the sky is green ";
		qPTQ.items[9] = "I keep asking myself questions without finding an answer ";
		qPTQ.items[10] = "My thoughts prevent me from focusing on other things";
		qPTQ.items[11] = "I keep thinking about the same issue all the time ";
		qPTQ.items[12] = "Thoughts just pop into my mind ";
		qPTQ.items[13] = "I feel driven to continue dwelling on the same issue ";
		qPTQ.items[14] = "My thoughts are not much help to me ";
		qPTQ.items[15] = "My thoughts take up all my attention";
		
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qPTQ.Run();
	}
}
