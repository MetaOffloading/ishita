package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class MCQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qMCQ = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qMCQ.name = "qMCQ";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qMCQ.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qMCQ.nOptions = 4;
		
		//How many items (i.e. questions) does the questionnaire have?
		qMCQ.nItems = 30;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qMCQ.itemsPerPage = 5;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qMCQ.questionWidth = 0.3;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qMCQ.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qMCQ.options[0] = "Do not agree";
		qMCQ.options[1] = "Agree slightly";
		qMCQ.options[2] = "Agree moderately";
		qMCQ.options[3] = "Agree very much";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qMCQ.items[0] = "I do not trust my memory";
		qMCQ.items[1] = "I have a poor memory";
		qMCQ.items[2] = "I have little confidence in my memory for actions";
		qMCQ.items[3] = "I have little confidence in my memory for places";
		qMCQ.items[4] = "I have little confidence in my memory for words and names";
		qMCQ.items[5] = "My memory can mislead me at times";
		qMCQ.items[6] = "Worrying helps me to get things sorted out in my mind";
		qMCQ.items[7] = "Worrying helps me cope";
		qMCQ.items[8] = "I need to worry in order to work well";
		qMCQ.items[9] = "Worrying helps me to solve problems";
		qMCQ.items[10] = "I need to worry in order to remain organised";
		qMCQ.items[11] = "Worrying helps me to avoid problems in the future";
		qMCQ.items[12] = "I am constantly aware of my thinking";
		qMCQ.items[13] = "I pay close attention to the way my mind works";
		qMCQ.items[14] = "I think a lot about my thoughts";
		qMCQ.items[15] = "I constantly examine my thoughts";
		qMCQ.items[16] = "I monitor my thoughts";
		qMCQ.items[17] = "I am aware of the way my mind works when I am thinking through a problem";
		qMCQ.items[18] = "My worrying thoughts persist, no matter how I try to stop them";
		qMCQ.items[19] = "When I start worrying I cannot stop";
		qMCQ.items[20] = "I could make myself sick with worrying";
		qMCQ.items[21] = "I am made out of cotton";
		qMCQ.items[22] = "I cannot ignore my worrying thoughts";
		qMCQ.items[23] = "My worrying could make me go mad";
		qMCQ.items[24] = "If I could not control my thoughts, I would not be able to function";
		qMCQ.items[25] = "Not being able to control my thoughts is a sign of weakness";
		qMCQ.items[26] = " I should be in control of my thoughts all of the time";
		qMCQ.items[27] = "It is bad to think certain thoughts";
		qMCQ.items[28] = "If I did not control a worrying thought and then it happened, it would be my fault";
		qMCQ.items[29] = "I will be punished for not controlling certain thoughts";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qMCQ.Run();
	}
}