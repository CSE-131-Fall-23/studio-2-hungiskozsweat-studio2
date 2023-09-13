import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("Value for win chance?");
		double winChance = in.nextDouble();
		System.out.println("Value for win limit?");
		double winLimit = in.nextDouble();
		
		int totalSimulations = 0;
		
		
		while ((startAmount < winLimit) && (startAmount > 0))
		{
			if (Math.random() <= winChance)
			{
				startAmount++;
				totalSimulations ++;
				System.out.println("Simulation "+totalSimulations+": "+startAmount+" Win");
			}
			else 
			{
				startAmount--;
				totalSimulations ++;
				System.out.println("Simulation "+totalSimulations+": "+startAmount+" Lose");
				
			}
			
		}
		if (startAmount == winLimit)
		{
			System.out.println("Success!!");
		}
		else
		{
			System.out.println("Ruin");
			System.out.println("Total number of simulations: " + totalSimulations);
		}
		double x = ((1-winChance)/winChance);
		if (winChance == .5)
		{
			double expectedRuin = (1-(startAmount/winLimit));
		}
	}

}
