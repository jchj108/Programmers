package level1.test;

import java.util.Scanner;

public class Squared {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long answer = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i*i==n) {
				answer = (i+1)*(i+1);
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println(answer);
		
		
	}

}
