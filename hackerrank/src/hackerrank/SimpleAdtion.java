package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Adionar {
    void add(int... numbers) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for (int num : numbers) {
            sb.append(num + "+");
            sum += num;
        }
        sb.setCharAt(sb.length() - 1, '=');
        sb.append(sum);
        System.out.println(sb);
    }
}

public class SimpleAdtion {

	public static void main(String[] args) {
		 try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            int n1 = Integer.parseInt(br.readLine());
	            int n2 = Integer.parseInt(br.readLine());
	            int n3 = Integer.parseInt(br.readLine());
	            int n4 = Integer.parseInt(br.readLine());
	            int n5 = Integer.parseInt(br.readLine());
	            int n6 = Integer.parseInt(br.readLine());
	            Adionar ob = new Adionar();
	            ob.add(n1,n2);
	            ob.add(n1,n2,n3);
	            ob.add(n1,n2,n3,n4,n5); 
	            ob.add(n1,n2,n3,n4,n5,n6);
	            Method[] methods = Adionar.class.getDeclaredMethods();
	            Set<String> set = new HashSet();
	            boolean overload = false;
	            for (int i = 0; i < methods.length; i++) {
	                if (set.contains(methods[i].getName())) {
	                    overload = true;
	                    break;
	                }
	                set.add(methods[i].getName());
	            }
	            if (overload) {
	                throw new Exception("Overloading not allowed");
	            }
	        } catch(Exception e) {
	                e.printStackTrace();
	        }
	}

}
