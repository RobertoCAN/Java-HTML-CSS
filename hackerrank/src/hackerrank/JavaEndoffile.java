package hackerrank;
/**
 * "In computing, End Of File (commonly abbreviated EOF) is a condition
 *  in a computer operating system where no more data can be read from 
 *  a data source." — (Wikipedia: End-of-file)
 *  https://en.wikipedia.org/wiki/End-of-files
 */
import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (scan.hasNextLine()) {
			System.out.println(i + " " + scan.nextLine());
			i++;
		}
		scan.close();
	}
}