import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null, "There once was a kid named Lindsey. He was asleep until he heard a noise outside of his house near the haunted woods. What will he do?", "The Kid Who Disappears", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Go back to sleep", "Go outside and check it out", "Go run to his parents room and tell them what happened" }, null);
	
if(task==0) {
	JOptionPane.showMessageDialog(null,
			"When Lindsey when back to bed someone else was in his bed. It was a dead human body.");
	int bob = JOptionPane.showOptionDialog(null, "What will he do?", "The Kid Who Disappears", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go back to sleep with his parents", "Go outside and check it out who put the body in his bed", "Figure out who's dead body is in his bed." }, null);
}
else if(task==1) {
JOptionPane.showMessageDialog(null,
		"Lindsey soon got out of bed and was trying to find a flashlight under his bed. He soon found the flashlight and when outside to find out who was making the noise. Then he saw a horrible shadow coming towards him.");	
int bob = JOptionPane.showOptionDialog(null, "What will he do?", "The Kid Who Disappears", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Run back into his house and pretended nothing ever happend", "Go up to the horrible shadow and figure what the shadow is", "Run off a cliff and die." }, null);
}
else if(task==2) {
	JOptionPane.showMessageDialog(null,
	"Lindsey got too freaked out and went to his parents room. When he goes to his parents room he saw that both of his parents are not on the bed sleeping. Instead they were in the corner of their room not moving. They were dead.");
	int bob = JOptionPane.showOptionDialog(null, "What will he do?", "The Kid Who Disappears", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Call the police", "Figure out if his parents are ok", "Run outside and find out who killed his parents." }, null);
}

	
	
	
	
	
	
	
	
	
	
	
	}
}