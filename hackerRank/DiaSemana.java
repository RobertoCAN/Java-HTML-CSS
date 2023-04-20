package hackerRank;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class DiaSemana {

	static List days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

	public static String findDay(int month, int day, int year) {

		int y = year;
		int m = month;
		int d = day;

		Calendar c = Calendar.getInstance();
		c.set(y, m - 1, d);

		int p = c.get(Calendar.DAY_OF_WEEK);
		String s = (String) days.get(p - 1);
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();

		System.out.println(findDay(day, month, year));
	}
}
