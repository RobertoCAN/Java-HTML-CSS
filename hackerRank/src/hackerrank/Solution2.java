package hackerrank;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int b[] = new int [3];
        
       for(int x = 0 ; x < 3; x++){
    	   
        	 b[x] = scan.nextInt();
        	
          }
       for(int x = 0 ; x < b.length; x++)
    	   
       System.out.println(b[x]);
        scan.close();
      
	}

}
