
public class Date {
int month, day, year;

Date() {
	int month = 1, day = 1, year = 1;
}

void setMonth(int Month){
month = Month;}

void setDay(int Day){
day = Day; }

void setYear (int Year) {
year = Year; }

void displayDate() {
	System.out.printf("%d/%d/%d", month, day, year);
}

}
	

