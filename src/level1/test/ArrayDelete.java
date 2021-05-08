package level1.test;

import java.util.Arrays;
//import java.util.Collections;

public class ArrayDelete {

	public static int[] solution(int[] arr) {
		int[] copy = arr.clone();
		Arrays.sort(copy);
		int[] Answer = {-1};
		
		if(arr.length<=1) {
			return Answer;
		} else {
			int[] answer = Arrays.copyOfRange(arr, 0, arr.length-1);
			return answer;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr1 = {10};
		int[] copy = arr.clone();
		Arrays.sort(copy);
		
		for(int i : copy) {
			System.out.println(i);
		}
		
		
	}
}
