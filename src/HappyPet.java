import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel =0; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String answer= JOptionPane.showInputDialog(null,"What kind of pet do you want to buy?");


		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<6;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you do to make your pet happy?", "Take Better Care of Your Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "exersice", "feed your pet food or water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
            if(task==0) {
            	cuddle();
            }
            else if(task==1) {
            	exersice();
            }
            else if(task==2) {
            	feedyourpetfoodorwater();
            }
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
             if(happinessLevel==30) {
            	JOptionPane.showMessageDialog(null,"Everyone knows you love your pet. Go take a break" );
             }
         	break; 
	}
	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	void cuddle() {
JOptionPane.showMessageDialog(null,"Your pet is happy.");
happinessLevel= +3;
}
static void exersice() {
JOptionPane.showMessageDialog(null,"Your pet is now happier.");	
happinessLevel= +10;
}
static void feedyourpetfoodorwater() {
JOptionPane.showMessageDialog(null,"Your pet is happy.");
happinessLevel= +5;
}
}