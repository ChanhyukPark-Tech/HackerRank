
import java.util.Arrays;
import java.util.Scanner;

public class Electronics_shop_second {

	public static void main(String[] args) {

		
		int budget , k_size , d_size , selected = 0 ;
		int count = 0  ; // for sum_arr
		
		Scanner in = new Scanner(System.in);
		budget = in.nextInt();
		k_size = in.nextInt();
		d_size = in.nextInt();
		
		int[] sum_arr = new int[k_size * d_size ];
		
		
		int[] keyboard = new int[k_size];
		int[] drive = new int[d_size];
		
		//keyboard array make
		for(int i=0 ; i < k_size ;i ++) {
			keyboard[i] = in.nextInt();
		}

		// drive array make
		for(int i=0 ; i < d_size ;i ++) {
			drive[i] = in.nextInt();
		}
		
		// 오름차순복치 난집갈
		Arrays.sort(keyboard);
		Arrays.sort(drive);
		
		//sum_arr 에 숫자밖기 count field variable declration.
		for(int i=0 ; i < k_size ; i++) {
			for(int j=0 ; j<d_size ; j++) {
				sum_arr[count] = keyboard[i] + drive[j];
				count ++;
			}
		}
		
		Arrays.sort(sum_arr);
		
		for(int i=count-1; i > -1 ; i-- ) {
			if(budget >= sum_arr[i] ) {
				selected = sum_arr[i];
				break;
			}else {
				selected = -1;
			}
		}
		
		in.close();
		System.out.println(selected);
		
	}

}
