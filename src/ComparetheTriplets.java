
import java.util.Scanner;

public class ComparetheTriplets {

	public static void main(String[] args) {
		int num = 3;
		int[] alice = new int[num];
		int[] Bob = new int[num];
		int[] score = new int[2]; // return 도 배열로 반환

		Scanner in = new Scanner(System.in);
		for(int i=0; i < alice.length; i++ ) {
			int n = in.nextInt();
			alice[i] = n;
		}
		for(int i=0; i < Bob.length; i++ ) {
			int n = in.nextInt();
			Bob[i] = n;	
		}
		
		// Comparison
		for(int i=0; i < alice.length; i ++) {
			
				if(alice[i] > Bob[i]) {
					score[0] += 1;
				}else if(alice[i] < Bob[i]) {
					score[1] += 1;
				}
			}
			
		}
		
		System.out.print(score[0] + " ");
		System.out.print(score[1]);
}
