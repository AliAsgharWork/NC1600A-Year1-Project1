
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=0 ;
		int a,b,c,d,e,f,x;
		a=5;
		b=2;
		c=2019;
		d=2;
		e=2;
		f=2019;
		x=0;//emp
		while(c!=f || b!=e || a!=d)
			
			

		{
			a++;
			if((b==4)||(b==6)||(b==9)||(b==11))
				f=30;
			else if(b==2)
			{
				if(d%4==0)
					x=29;
				else
					x=28;
			}
			else
				x=31;
			
			if(a>x)
			{
				b++;
				a=1;
			}
			if(b==13)
			{
				c++;
				b=1;
			}
			test++;
	}
		System.out.println(test);

}
}
