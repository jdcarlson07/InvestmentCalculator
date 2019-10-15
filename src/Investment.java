import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonths)
	{
		double value = 0;
		int size = this.theContributions.size() - 1;
		for(int i = 0; i < this.theContributions.size(); ++i)
			{
				
				Contribution currCont = this.theContributions.get(i);
				value = value + currCont.amount;
				if(i < size)
				{		
					Contribution nextCont = this.theContributions.get(i + 1);
					for(int j = currCont.monthNumber; j < nextCont.monthNumber; ++j)
					{
						value = value * 1.067;
					}
				}
				else
				{
					for(int j = currCont.monthNumber; j <= afterHowManyMonths; ++j)
					{
						value = value * 1.067;
					}
				}
				
				
			}
		
		return value;
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
	}
	
	
	
	double getTotalContributions()
	{
		double total = 0;
		for(int i = 0; i < this.theContributions.size(); ++i)
		{
			Contribution cont = this.theContributions.get(i);
			total = total + cont.amount;
		}
		return total;
	}
	
}
