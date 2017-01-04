
public class DateTest {
	public static void main(String[] args) {
		//Create a date
		Date date1 = new Date();
		
		//Set the month, day and year (To today's date: Jan. 4, 2017)
		date1.setMonth(1);
		date1.setDay(4);
		date1.setYear(2017);
		
		//Display the date
		date1.displayDate();
	}
}
