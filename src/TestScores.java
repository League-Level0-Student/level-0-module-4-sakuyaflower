import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {

String score = JOptionPane.showInputDialog(null,"What is your test score?");
int scorez = Integer.parseInt(score);
if(scorez>100) {
JOptionPane.showMessageDialog(null,"You are a true Asian. Keep up the good work");
}
else if(scorez>90) {
JOptionPane.showMessageDialog(null,"Why didn't you study harder.");
}
else if(scorez<90) {
JOptionPane.showMessageDialog(null,"Next time study harder instead of playing games all night.");
}













}
}
