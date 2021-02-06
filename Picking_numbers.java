package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Picking_numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		int[] ans_arr = new int[size];
		Arrays.sort(arr);
		int count[] = new int[size];
		
		for(int i=0; i<size ; i++) {
			for(int j=0; j<size ; j++) {
//				int count = 0; 					// 이 개념 중요 count 를 중간에서 선언
				
				if((Math.abs(arr[i]-arr[j]) <= 1) && (Math.abs(arr[i] - 1 - arr[j])) != 2) {    // != is shit important !! 2021- 1:42 am i thought!
					count[i]++;
				}
			}
		}
		
		int answer = Arrays.stream(count).max().getAsInt();
		System.out.println(answer);
	}

}
