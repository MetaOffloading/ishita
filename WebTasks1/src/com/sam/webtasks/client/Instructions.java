package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;

public class Instructions {

	public static String Get(int index) {
		String i = "";

		switch (index) {
		case 0:
			i = "In this experiment you will have a simple task to do.<br><br>"
					+ "You will see several yellow circles inside a box. Inside each circle will be a number. <br><br>"
					+ "You can move them around with your mouse. Your task is to drag them to the bottom of the box in sequence.<br><br>"
					+ " Please start by dragging 1 all the way to the bottom. This will make it disappear. <br><br>"
					+ "Then drag 2 to the bottom, then 3, and so on.";
			break;

		case 1:
			i = "Now you will continue the same task, but sometimes there will be something else to do.<br><br>"
					+ "As well as dragging each circle in turn to the bottom of the screen, there will sometimes be special circles that you should drag in another direction (left or right) instead of towards the bottom.<br><br>"
					+ "These special circles will initially appear in a different colour when they are first shown on the screen, instead of yellow. This is an instruction telling you where they should go.<br><br>"
					+ "For example, suppose that the circle with 7 in it was first shown in blue when it appeared on the screen. That would be an instruction that when you get to 7 in the sequence, you should drag that circle to the blue side of the box (left) instead of the bottom.<br><br>"
					+ "You will still be able to drag any circle to the bottom of the box, but you should try to remember to drag these special circles to the instructed location instead.";
			break;

		case 2:
			i = "Well done, that's correct.<br><br>"
			  		+ "Click below to practice again.<br><br>"
			  		+ "This time the task will be harder. You will always start with a blue circle, "
			  		+ "then you will get several pink circles afterwards. Just try to remember as many as you can.";
			break;
			
		case 3:
			i = "From now on, you will score points every time you drag one of the special circles to the correct location.<br><br>"
					+ "The BLUE circles are worth <b>";
			
			if (Counterbalance.getFactorLevel("conditionOrder")==ExtraNames.LOW_THEN_HIGH) {
				i = i + "more";
			} else {
				i = i + "less";
			}
			
			i = i + "</b> then the PINK circles. Every time you drag a BLUE circle to the LEFT " 
					+ " you will score <b>" + Params.mediumValuePoints + "</b> points. But you will score <b>";
			
			if (Counterbalance.getFactorLevel("conditionOrder")==ExtraNames.LOW_THEN_HIGH) {
				i = i + Params.lowValuePoints + "</b> point";
			} else {
				i = i + Params.highValuePoints + "</b> points";
			}
			
			i = i + " for dragging a PINK circle "
					+ "to the RIGHT.<br><br>Any time you drag an incorrect circle to the left or right, you will lose 1 point.<br><br>"
							+ "These points are worth real money. Your payment at the end of the experiment "
					+ "will be based on how many points you score. You will be paid " + Params.moneyPerPoint + " for each point.<br><br>"
					+ "This means that you can earn up to " + Params.possiblePayment + " for this experiment if you remember all the circles. <br><br>Click below to continue.";
			break;
		case 4:
			i = "Now we are going to explain a strategy that can help you remember the special circles.<br><br>"
					+ "As soon as you see a special circle, you can set a reminder by immediately dragging it next to the corresponding edge of the box (blue or pink). "
					+ "Then, when you get to that circle in the sequence its location would remind you where it is supposed to go.<br><br>"
					+ "You will only be able to do this for the <b>BLUE</b> circles, not the PINK ones.<br><br>"
					+ "Please now try the task again, using this strategy to help you.";
			
			i = i + " Each time you set a reminder you will need "
					+ "to wait " + Params.reminderLockoutString + " before you can continue the task.";
			break;
		case 5:
			i = "Now the experiment will begin for real. The more points you score, the more money you will earn.<br><br>"
					+ "You will start with an initial payment of " + Params.basePayment + " and earn additional money in addition to this.<br><br>"
					+ "It is up to you whether you prefer to use your own memory to remember the special circles, "
					+ "set reminders, or just ignore them if you don't want to earn the extra bonus money. ";
			

			i = i + "<br><br>Click below to start."; 
			break;
			
		case 6:
			i = "One last thing. From now on, the value of the PINK circles will vary each time you do the task. "
					+ "Sometimes they will be worth <b>" + Params.lowValuePoints + "</b> point";
			
			if (Params.lowValuePoints>1) {
				i += "s";
			}
			
			i += " and sometimes they will be worth <b>" + Params.highValuePoints + "</b> points.<br><br>"
					+ "You will always be told how much they are worth, before you start the task. You can "
					+ "use this information to decide how important it is to remember the PINK circles, and "
					+ "whether you would prefer to set a reminder for the BLUE circle. It is completely "
					+ "up to you.<br><br>Click below to start.";
			
			break;
		}

		return (i);
	}

	public static String InfoText() {
		return ("We would like to invite you to participate in this research project. "
				+ "You should only participate if you want to; choosing not to take part "
				+ "will not disadvantage you in any way. Before you decide whether you "
				+ "want to take part, please read the following information carefully and "
				+ "discuss it with others if you wish. Ask us if there is anything that "
				+ "is not clear or you would like more information.<br><br>"
				+ "We are recruiting volunteers from Prolific to "
				+ "take part in an experiment aiming to improve our understanding of human "
				+ "attention and memory. Full instructions will be provided before the experiment begins. "
				+ "The experiment " + "will last approximately 30 minutes. There are no anticipated risks or "
				+ "benefits associated with participation in this study.<br><br>"
				+ "It is up to you to decide whether or not to take part. If you choose "
				+ "not to participate, you won't incur any penalties or lose any "
				+ "benefits to which you might have been entitled. However, if you do "
				+ "decide to take part, you can print out this information sheet and "
				+ "you will be asked to fill out a consent form on the next page. " + "Even after agreeing to take "
				+ "part, you can still withdraw at any time and without giving a reason. "
				+ "<br><br>All data will be collected and stored in accordance with the UK Data "
				+ "Protection Act 1998.");
	}

}
