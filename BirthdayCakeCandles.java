package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int[] candle = new int[number];
		
		for(int i=0; i<candle.length ; i++) {
			candle[i] = in.nextInt();
		}
		
		int tallest = Arrays.stream(candle).max().getAsInt();
		int answer = 0;
		for(int i=0 ; i<candle.length; i++) {
			if(candle[i] == tallest) {
				answer++;
			}
		}
		System.out.println(answer);	
	}

}
