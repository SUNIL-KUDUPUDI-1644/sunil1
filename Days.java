package lab8;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class Days {
	private static final String Calender = null;

	 

	public static void main(String args[]) {
	    Date date = new Date(0);
	    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    int year  = localDate.getYear();
	    int month = localDate.getMonthValue();
	    int day   = localDate.getDayOfMonth();
	    //System.out.println(date.toString());    
	    System.out.println("Current date is " + year+ " "+ month+ " " +day);
	    int uday,umonth,uyear;
	    Scanner sc = new Scanner(System.in);
	    uday = sc.nextInt();
	    umonth = sc.nextInt();
	    uyear = sc.nextInt();
	
	    int divday = (day-uday);
	    int divmonth = (month-umonth);
	    int divyear = (year-uyear);
	    sc.close();
	    System.out.println("difference is " + divday + " " + divmonth + " " + divyear);
	}
	}
	 


