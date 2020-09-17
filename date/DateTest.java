public class DateTest {
	public static void main(String[] args) {
		Date d = new Date(16, 9, 2020);
		d.displayDate();
		d.setDay(23);
		d.setMonth(1);
		d.setYear(1564);
		d.displayDate();
		
		d = new Date(8, 10, 2234);
		d.displayDate();
	}
}