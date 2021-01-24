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
		
		for(int i=0 ; i<arr.length ; i++ ) {             // array에 값을 입력 받는 부분 
			arr[i] = in.nextInt();
		}
		
		// if 를 사용하여 각 배열의 값이 어떤지 판단하여 positive , negative , zero 분류
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
	// 중복제거용 method 정의 double 해서 rate 계산해주고 format 맞춰서 String 으로 출력
	
	
	public static String clear(int format , int size) {
		double rate = Double.valueOf(format) / Double.valueOf(size);
		String df = new DecimalFormat("0.000000").format(rate);
		return df;
	}

}
