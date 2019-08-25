package calender_assistant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

public class Meeting_date_scheduler {
	public static void main(String[] args) throws ParseException {
		
		    DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		  //  DateTimeFormatter format = DateTimeFormatter
	         //       .ofLocalizedTime(FormatStyle.SHORT);
	        LocalTime time1 = LocalTime.parse("11:00 AM", format);
	        LocalTime time2 = LocalTime.parse("01:00 PM", format);
	        Duration duration = Duration.between(time1, time2);
	        System.out.println(Math.abs(duration.getSeconds() / 3600));
	    
	}
	
}
