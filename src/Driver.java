
public class Driver 
{
	public static void main(String[] args) 
	{
		Investment a = new Investment();
		a.addContribution(new Contribution(1200, 1));



		
		int totalInvestmentTime = 156;
		System.out.println(a.getCurrentValue(totalInvestmentTime));
		System.out.println(a.getTotalContributions());

	}
}
