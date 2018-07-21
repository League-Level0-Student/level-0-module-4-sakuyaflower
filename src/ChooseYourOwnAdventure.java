import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null,
				"There once was a kid named Lindsey. He was asleep until he heard a noise outside of his house near the haunted woods. What will he do?",
				"The Kid Who Disappears", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go back to sleep",
						"Go outside and check it out", "Go run to his parents room and tell them what happened" },
				null);

		if (task == 0) {
			JOptionPane.showMessageDialog(null,
					"When Lindsey when back to bed someone else was in his bed. It was a dead human body.");
			int bob = JOptionPane.showOptionDialog(null, "What will he do?", "The Kid Who Disappears", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go back to sleep with his parents",
							"Go outside and check it out who put the body in his bed",
							"Figure out who's dead body is in his bed." },
					null);
			if(task==0) {
			JOptionPane.showMessageDialog(null,
					"Lindsey went to go sleep in his parents room when he notice a man with a knife. Lindsey died in the hands of a criminal. THE END. ");	
			}
			else if(task==2) {
			JOptionPane.showMessageDialog(null,
					 "When Lindsey went to go check out who's body is in his bed he notice it was his girfriend, London. He cried in misery. R.I.P Lindsey. THE END. ")	;
			}
			else if(task==1) {
				JOptionPane.showMessageDialog(null, 
						"When Lindsey went outside to check out who put the a body in his bed, he found a man  smiling. The man's pet killed him. His pet was a wolf. THE END. ");
			}
		} else if (task == 1) {
			JOptionPane.showMessageDialog(null,
					"Lindsey soon got out of bed and was trying to find a flashlight under his bed. He soon found the flashlight and when outside to find out who was making the noise. Then he saw a horrible shadow coming towards him.");
			int bob = JOptionPane.showOptionDialog(null, "What will he do?", "The Kid Who Disappears", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Run back into his house and pretended nothing ever happend",
							"Go up to the horrible shadow and figure what the shadow is", "Run off a cliff and die." },
					null);
			if(bob==0) {
			JOptionPane.showMessageDialog(null,
			"Lindsey ran baack into his house and pretended nothing ever happened. But he heard someone following him and he turned around and found a man standing. After that he didn't see a thing because the man's pet killed him. The man's pet was a wolf. THE END.");
			}
			else if(task==1) {
			JOptionPane.showMessageDialog(null, 
			"Lindsey walked towards the shadow and saw a man standing there. THe man was smiling at him an evil was. Soon Lindsey died because the man's pet killed him. The man's killed was a wolf. THE END.");	
			}
			else if(task==2) {
				JOptionPane.showMessageDialog(null,
					"Lindsey got too scared of the shadow and ran for his life but he didn't notice that he ran towards the end of a cliff. R.I.P Lindsey. THE END.");
			}
		} else if (task == 2) {
			JOptionPane.showMessageDialog(null,
					"When Lindsey when to his parents' room he notice they were not there and there was a man behind him. The man behind him  kill Lindsey. THE END.");
		}

	}
}