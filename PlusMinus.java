package hackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		int positive = 0;
		int negative = 0;
		int zero = 0;
		double ratio_positive;
		double ratio_negative;
		double ratio_zero;
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt(); 		 // the length & size of array
		int[] arr = new int[size];
		
		for(int i=0 ; i<arr.length ; i++ ) {             // array�� ���� �Է� �޴� �κ� 
			arr[i] = in.nextInt();
		}
		
		// if �� ����Ͽ� �� �迭�� ���� ��� �Ǵ��Ͽ� positive , negative , zero �з�
		for(int i=0 ; i<arr.length ; i++ ) {
			if(arr[i] == 0) {
				zero++;
			}else if(arr[i] > 0) {
				positive++;
			}else {
				negative++;
			}
		}
//		ratio_positive = Double.valueOf(positive) / Double.valueOf(size);
//		ratio_negative = Double.valueOf(negative) / Double.valueOf(size);
//		ratio_zero = Double.valueOf(zero) / Double.valueOf(size);
//		
//		String df_p =new DecimalFormat("0.000000").format(ratio_positive);
//		String df_n =new DecimalFormat("0.000000").format(ratio_negative);
//		String df_z =new DecimalFormat("0.000000").format(ratio_zero);
		
//		System.out.println(df_p);
//		System.out.println(df_n);
//		System.out.println(df_z);
		
		
		System.out.println(clear(positive,size));
		System.out.println(clear(negative,size));
		System.out.println(clear(zero,size));

	}
	// �ߺ����ſ� method ���� double �ؼ� rate ������ְ� format ���缭 String ���� ���
	
	
	public static String clear(int format , int size) {
		double rate = Double.valueOf(format) / Double.valueOf(size);
		String df = new DecimalFormat("0.000000").format(rate);
		return df;
	}

}
