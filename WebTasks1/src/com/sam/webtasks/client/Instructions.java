package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;

public class Instructions {

	public static String Get(int index) {
		String i = "";

		switch (index) {
		case 0:
			i = "This is the first page of instructions.";
			break;
		case 1:
			i = "This is the second page of instructions<br>with a line break "
					+ "and some <b>bold</b> test.";
			break;

		}

		return (i);
	}

	public static String InfoText() {
		String expDur = "30";
		String eligibility = "All registered users of Prolific ";
		String nVolunteers = "100";
		
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
				+ "so long as it is required for the research project. If we are able to anonumise or pseudonymise "
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
