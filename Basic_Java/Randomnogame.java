import java.util.Random;
import java.util.Scanner;

public class Randomnogame {
	
	public static void main(String[] args) {
//	String[] array = {"1","2","3","4","5"};
	
	
	Scanner s1 = new Scanner(System.in);
	Random random = new Random();
	
	int sec = random.nextInt(5)+1;
	int att = 0;
	int guess;
	
	System.out.println("choose number between 1 to 100");
	
	while(true) {
		System.out.println("enter a no ");
		guess = s1.nextInt();
		att++;
		
		if(guess<sec) 
		{
			System.out.println("too small no");
		}
		else if(guess>sec) {
			System.out.println("too large no");
		}
		else {
			System.out.printf("congrats!! your no is %d is correct in %d attempts",guess,att);
			break;
			
		}
		
	}
	s1.close();
	
	
	
			
  }
}
