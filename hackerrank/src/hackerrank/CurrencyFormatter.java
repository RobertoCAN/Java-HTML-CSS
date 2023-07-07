package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		/* Save input */
        Scanner scanner = new Scanner(System.in);
        double formaPagamento = scanner.nextDouble();
        scanner.close();
        
        /* Create custom Locale for India - I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");
        Locale brasilLocale = new Locale("pt_BR","BR");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat brasil = NumberFormat.getCurrencyInstance(brasilLocale);
        
        /* Print output */        
        System.out.println("US: "     + us.format(formaPagamento));
        System.out.println("India: "  + india.format(formaPagamento));
        System.out.println("China: "  + china.format(formaPagamento));
        System.out.println("France: " + france.format(formaPagamento));
        System.out.println("Brasil: " + brasil.format(formaPagamento));


	}

}
