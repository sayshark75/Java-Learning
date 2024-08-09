package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Until Java 1.7 version the classes present in Java.util package to handle 
// Date and Time (like Date, Calendar, TimeZone, etc.) are not up to the mark
// with respect to convenience and performance.

// To overcome this problem in the 1.8 version oracle people introduced a 
// new date and time API belonging to java.time package.

// This java 8 date API provides various classes and Enums in java.time package, 
// using which we can represent Date and Time in our application efficiently.

// The main important classes of this api is :
// LocalDate :- to represent the Date
// LocalTime :- to represent the Time
// LocalDateTime: to represent both

public class Demo {
	public static void main(String[] args) {
		// get current date yyyy-mm-dd
		LocalDate ld = LocalDate.now();
		System.out.println("Date----------------------------------");
		System.out.println(ld);
		
		// get current time hh:mm:ss.mSec
		LocalTime lt = LocalTime.now();
		System.out.println("Time----------------------------------");
		System.out.println(lt);
		
		// get current date and time yyyy-mm-ddThh:mm:ss.mSec
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("DateAndTime----------------------------------");
		System.out.println(ldt);
		
		// the object is immutable like a string
		// of method: used to create a specific date
		LocalDate ldo = LocalDate.of(1998, 03, 02);
		System.out.println("CustomDate----------------------------------");
		System.out.println(ldo);
		
		// atTime static method: add some more time in current time
		// atDate static method: add some more days, months years in current date
		
		
		// each object has its own methods, some of them are
		System.out.println("Inbulit Object methods-----------------------");

		System.out.println(ldo.getDayOfMonth());
		System.out.println(ldo.getDayOfYear());
		System.out.println(ldo.getMonthValue());
		System.out.println(ldo.isLeapYear());
		System.out.println(ldo.lengthOfMonth());
		System.out.println(ldo.getDayOfWeek());
		System.out.println(ldo.getEra());
		System.out.println(ldo.getChronology());
		// usefull if want to check the date or time is after 
		// or before the given date or time
		System.out.println(ldo.isAfter(ld));
		System.out.println(ld.isAfter(ldo));
		// plus and minus methods to add and subtract some date and time
		
		// Formatting a date-time in user defined format:-
		// --for that we need to use a class "DateTimeFormatter" belongs from 
		// "Java.time.format" package which has static factory method called 
		// "ofPattern(-)" which takes userdefined pattern in the form of String and
		// returns the format in the form of DateTimeFormatter obj.
		// ex:-
		// DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		// We need to create a pattern with the help of following symbols:
			// G - Era(AD BC)
			// y - year(yy(18) or yyyy(2018))
		    // M - Month(M(9)) or MM(09) or MMM(Mar) or MMMM(March)
			// d - day(d(2) or dd(02) or ddd(002))
			// E - day in a week, (E(sun)) or (EEEE--Sunday)
			// a - am / pm
			// h - hour in am or pm (1-12)
			// hh - hour in am or pm (01-12)
			// H - hour of day in 24 hour form (0-23)
			// HH - hour of day in 24 hour form (00-23)
			// m - minute (4)
			// mm - minute (04)
			// s - second (4)
			// ss - second(04)
		
		// --in order to format a LocalDate or LocalTime or LocalDateTime object
		// we need to call "format(-)" method on these object by supplying 
		// DateTimeFormatter object
		
		// always wrap the formatting and parsing in try-catch block
		// LocalDate -----> converted to ----> user defined string :- formating
		
		// String ------> converted to -----> LocalDate :- parsing
		
		// converting userDefined String to the LocalDate object.(parsing)
		// use parse() method of LocalDate class:-
		
		// Note:- this parse() method throws runtime exception but in Old
		// Date api,SimpleDateFormate throws Checked exceptions
		
		// ex: of Formating a string
		System.out.println("Format a Date or time object------------");
		
		LocalDateTime myld = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy | hh-mm-ss:a");
		
		String result = myld.format(df);
		
		System.out.println(result);
		
		// ex: of Parsing a string 
		System.out.println("Parse a String-----------------------");
		
		String dob = "02/03/1998";
		LocalDate a = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(a);
		
		
		// there are various complex things we cna do with the time and date, 
		// we can't cover everything but here are some quite important concepts
				
		//java.time.Period:- It is used to define the difference between dates 
		// in date-based values (years, months, days).
				
		// java.time.Duration:- It is used to define the difference between times
		// in time-based values (hour, minute, second, nanoseconds).
		
		// but there is a better class to find difference between two date and time
		// ChronoUnit:-this enum is the most useful structure in java.time api
		// --this enum belongs to java.time.temporal package
		// --with this enum also we can get difference between two dates in more precise way.
		
		//ex: 
		System.out.println("Difference of Dates------------------");
		LocalDateTime oldDate = LocalDateTime.of(1998,3,2,10,20,30);
		LocalDateTime current = LocalDateTime.now();
		
		System.out.println(ChronoUnit.YEARS.between(oldDate, current));
		System.out.println(ChronoUnit.HOURS.between(oldDate, current));
		System.out.println(ChronoUnit.MONTHS.between(oldDate, current));
		System.out.println(ChronoUnit.WEEKS.between(oldDate, current));
		System.out.println(ChronoUnit.HALF_DAYS.between(oldDate, current));
		System.out.println(ChronoUnit.DAYS.between(oldDate, current));
		
	}
}
