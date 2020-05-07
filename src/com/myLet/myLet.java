package com.myLet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import java.io.PrintWriter;


import java.util.Enumeration;





import javax.servlet.ServletException;


import javax.servlet.annotation.WebServlet;


import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;




@WebServlet("/myLet")


public class myLet extends HttpServlet 
{    

	private static final long serialVersionUID = 1;



	public myLet() {


		super();


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int q=Integer.parseInt(request.getParameter("s_Day"));//Day of the month
		int m=Integer.parseInt(request.getParameter("s_Month"));//The month
		int year =Integer.parseInt(request.getParameter("s_Year"));//The year
		
		
		LocalDate localDate = LocalDate.now();//For reference
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LL yyyy");
	    String formattedString = localDate.format(formatter);
	    
	   
		String x = q + " " + m + " " + year;
		String y = formattedString;
		
		
			 SimpleDateFormat myFormat = new SimpleDateFormat("dd LL yyyy");
			 String dateBeforeString = x;
			 String dateAfterString = y;

			 try {
			       Date dateBefore = myFormat.parse(dateBeforeString);
			       Date dateAfter = myFormat.parse(dateAfterString);
			       long difference = dateBefore.getTime() - dateAfter.getTime() ;
			       long daysBetween = (difference / (1000*60*60*24));
		               /* You can also convert the milliseconds to days using this method
		                * float daysBetween = 
		                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
		                */
			       System.out.println("Number of Days between dates: "+daysBetween);
		
			       System.out.println(formattedString);
			

		
		
		
		
		//Name source
		String Name = request.getParameter("s_Name");
		
		
		
		
		//Zeller's Algorithm
		
		int K=year%100;//Year of the century
		int J=year/100;//The zero-based century
		
		int h=(q+((13*(m+1))/5)+K+(K/4)+(J/4)+(5*J))%7;
		System.out.println(h);
		
		if (h==0)
		{
			String day = "Saturday";
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days difference between today and the date is "+daysBetween );
		}
		else if (h==1)
		{
			String day = ("Sunday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
		}
		
		else if (h==2)
		{
			String day=("Monday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
			
		}
		
		else if (h==3)
		{
			String day=("Tuesday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
			
		}
		
		else if (h==4)
		{
			String day=("Wednesday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
			
		}
		
		else if (h==5)
		{
			String day=("Thursday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
			
		}
		
		else if (h==6)
		{
			String day=("Friday");
			response.getWriter().append("Hi "+ Name +" the day on " + q + "/" + m + "/" + year + " is " + day + " and the days between today and the date is "+daysBetween );
		}

		

		doGet(request, response);


 } catch (Exception e) {
			       e.printStackTrace();
			 }
		


	}





	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	
	}



}