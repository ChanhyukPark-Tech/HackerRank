package hackerRank;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		//�� �迭�� ũ�� �������ص� scanner ��ü ����
		int a_size;
		int b_size;
		Scanner in = new Scanner(System.in);
		
		//�ܺηκ��� �� �迭�� size �޾ƿ� (scanner)�� ����
		a_size = in.nextInt();
		b_size = in.nextInt();
		
		//a �� b array ���� size �� �ܺο��� �޾���
		int[] a = new int[a_size];
		int[] b = new int[b_size];
		
		// a �迭�� �� ���� (�ܺηκ��� �޾ƿ�)
		for(int i=0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		
		// b �迭�� �� ���� (�ܺηκ��� �޾ƿ�)
		for(int i=0;i<b.length;i++) {
			b[i] = in.nextInt();
		}
		
		//---------------------------------�ʱⰪ setting �Ϸ�
		int a_min = Arrays.stream(a).min().getAsInt();			// a �迭�� �ּڰ�
		int a_max = Arrays.stream(a).max().getAsInt();			// a �迭�� �ִ�
		int b_min = Arrays.stream(b).min().getAsInt();			// b �迭�� �ּڰ�
		int[] new_a_arr = new int[305];
			new_a_arr[0] = a_max;
		for(int i=1; i<300;i++) {
			
			new_a_arr[i] = (a_min*(i))*a_max;
		}
		
//		boolean test = false;
		
//		int result = 0;
		boolean test = false ;
		int[] answer = new int[b.length];
		for(int i=0; i<300;i++) {
			if(new_a_arr[i] <= b_min) {
				
				for(int j=0;j<b.length;j++) {
					
					double count =b[j] / new_a_arr[i];
//					System.out.println(b[j] + "  " + new_a_arr[i] + "count : " + count );
							if (count < 0) {
							} else if ((count - (int) count) > 0 || (count - (int) count) < 0) {
							} else {
								test = true;
//								answer[j] = new_a_arr[i];
							}		
							
							if(test=true) {
								answer[j] = new_a_arr[j];

							}
				}
				
				
			}
		}
//		for(int i=0; i<answer.length;i++) {
//	System.out.println("answer�� i ��° " + answer[i]);	
//	}}
		System.out.println(answer.length);

}
}
