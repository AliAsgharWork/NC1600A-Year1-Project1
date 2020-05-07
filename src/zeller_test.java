
public class zeller_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int q=6;//Day of the month
		int m=11;//The month
		int year =2019;//The year
		
		int K=year%100;//Year of the century
		int J=year/100;//The zero-based century
		
		
		//Zeller's Algorithm
		int h=(q+((13*(m+1))/5)+K+(K/4)+(J/4)+(5*J))%7;
		System.out.println(h);
		
		if (h==0)
		{
			String day = "Saturday";
			
		}
		else if (h==1)
		{
			String day = ("Sunday");
			
		}
		
		else if (h==2)
		{
			String day=("Monday");
			
		}
		
		else if (h==3)
		{
			String day=("Tuesday");
			
		}
		
		else if (h==4)
		{
			String day=("Wednesday");
			
		}
		
		else if (h==5)
		{
			String day=("Thursday");
			
		}
		
		else if (h==6)
		{
			String day=("Friday");
			
		}
	}

}
