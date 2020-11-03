package d1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
	       System.out.println(d);
	       
	       LocalTime t=LocalTime.now();
	       System.out.println(t);
	       
	       
	       DateTimeFormatter n=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	       String s=d.format(n);
	       System.out.println(s);
	       
	       
	       DateTimeFormatter m=DateTimeFormatter.ofPattern("hh:mm:ss");
	       String s1=t.format(m);
	       System.out.println(s1);
	}

}
