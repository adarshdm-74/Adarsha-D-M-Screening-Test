package Tendemloop.com;
import java.util.*;

class Problem3{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        int lastOdd;

	        if (a % 2 == 0) {
	            lastOdd = a - 1; 
	        } else {
	            lastOdd = a;
	        }

	        int num = 1;

	        while (num <= lastOdd) {
	            System.out.print(num);

	            if (num + 2 <= lastOdd) {
	                System.out.print(", ");
	            }

	            num = num + 2;
	        }
	    }
	}
