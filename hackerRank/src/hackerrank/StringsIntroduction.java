package hackerrank;

import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String primeiro = scanner.next();
	        String segundo = scanner.next();
	        
	        scanner.close();
	        
	        int tamanho = primeiro.length() + segundo.length();
	        
	        int res = primeiro.compareTo(segundo);
	       // System.out.println(res);
	        
	        primeiro = primeiro.substring(0, 1).toUpperCase() + primeiro.substring(1);
	        segundo = segundo.substring(0, 1).toUpperCase() + segundo.substring(1);
	        
	        System.out.println( tamanho );
	        if( res > 0 ){
	            System.out.println( "Yes" );    
	        }else{
	            System.out.println( "No" );    
	        }
	        
	        System.out.print( primeiro + " " + segundo );

	}

}
