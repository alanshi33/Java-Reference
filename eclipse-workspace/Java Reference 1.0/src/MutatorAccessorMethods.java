import java.util.*;

public class MutatorAccessorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH,1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		for (int i = firstDayOfWeek; i<weekday; i++)
			System.out.print("    ");
		
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d",day);
			
			if(day==today)
				System.out.print("*");
			else
				System.out.print(" ");
			
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			if (weekday == firstDayOfWeek)
				System.out.println();		
		}
		
		while (d.get(Calendar.MONTH)==month);
		
		if(weekday != firstDayOfWeek)
			System.out.println();
	
	
	}

}
