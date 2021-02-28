
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arCount = in.nextInt();
		int[] ar = new int[arCount];
		
		for(int i=0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		
		int total = 0;
		for(int i =0; i<ar.length; i++ ) {
			total += ar[i];
			
		}
		System.out.println(total);	
	}

}
