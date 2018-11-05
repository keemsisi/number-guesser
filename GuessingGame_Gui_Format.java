//this application is a game that guess a game that allows a user to guess a number 
//Author:lasisi akeem adeshina p.k.a IntegralCalculus
		
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
	
public class GuessingGame_Gui_Format {
	private static int range;
	//creating  METHOD THAT WILL HIDE THE ANSWER
	public static int answer(){
		Random rand=new Random();
		
		range= rand.nextInt(50) * rand.nextInt(rand.nextInt(300))+ 0;
		return range;
		
		
	}

		public static void main(String[] args)//main method the program the compiler will call 
		{
			int counter=1;//declaring and initializing counter
			
			Scanner input=new Scanner(System.in);
			
			Random rand=new Random();
			
			String msg1=String.format("%50s","Welcome to integrated Guessing Game!");
			JOptionPane.showMessageDialog(null, msg1);
			
			String name=JOptionPane.showInputDialog("What is your name?");
			
			String msg2=JOptionPane.showInputDialog("Would you like to start the Game? Enter 1...No? Enter 0 to end the game at any time:");
			
			int start=Integer.parseInt(msg2);
			
			
			//getting the user's name
			while(start==1 && counter<=5)
			{
					answer();//calling the static method answer() to regenerate a random number when the condition is still true
					
				 	System.out.println("\nYou can exist at any time:\nExist:Enter \"-1\" ");
					
					System.out.println();
					
					System.out.println("Guess a number between 1 and 50:");
					
					System.out.println();
					
					int  number=input.nextInt();
					
					System.out.println();
					
					counter++;
					if(number==-1){
						System.out.println("Game terminated!");
						break;
					}
					
					while(number!=range && counter<=5){
						
						while (number>50){
							System.out.println("You are wrong and you are too high...Try again");
							
							number=input.nextInt();
							
							counter++;
							
							if(counter<=5)
								break;
					}
						while (number<1){
							if(number==-1){
								break;
							}
						System.out.println("You are wrong and you are too low...Try again");
						number=input.nextInt();
						
						counter++;
					}
					System.out.println("You are wrong...Try guessing again!");
					
					if(number==-1){
						//condition for the game to terminated
						System.out.println("Game terminated!");
						
						System.out.println();
						
						start=0;
						break;//terminating the Game when the condition is true
					}
					number=input.nextInt();//telling the user to enter the number again
					counter++;//increasing the number of trials
					}
					
					if(number==range){
						System.out.println("CONGRATULATIONS!!!...YOU ARE Correct!");
						System.out.println("The correct answer is "+range);
						System.out.println();
						System.out.printf("You guessed the right number in %s trial(s)",counter-1);
						System.out.println();
						
						start=0;
						counter=6;
						
					}
					
					if(counter>5){
						System.out.println("You have used up your trials");
						
						System.out.println();
						System.out.print("Would you love to play again?");
						
						start=input.nextInt();
						if(start==1){
							counter=1;
						}
						
					}
						
						
					
					
					
				}
			
			if(start==0 )
			System.out.printf("Goodbye...%s",name);
			
			
		}
		
	}
		
