package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Electronics_shop {

	public static void main(String[] args) {
		int budget , k_size , d_size , selected_keyboard=0 , selected_drive=0;
		
		Scanner in = new Scanner(System.in);
		budget = in.nextInt();
		k_size = in.nextInt();
		d_size = in.nextInt();
		
		int[] keyboard = new int[k_size];
		int[] drive = new int[d_size];
		
		for(int i=0 ; i < k_size ;i ++) {
			keyboard[i] = in.nextInt();
		}

		for(int i=0 ; i < d_size ;i ++) {
			drive[i] = in.nextInt();
		}
		
		// ����������ġ ������
		Arrays.sort(keyboard);
		Arrays.sort(drive);
		
//		int i = k_size;
//		int j = d_size;
		boolean keyboard_boolean = true;
		boolean drive_boolean = true;
		int remain = 0;  // Ű���� ��� ������ 
		
		//ù������ �̻����� keyboard ����
		int index = 0;
		//�����
		int result ;
		
		if(keyboard[k_size-1] > drive[d_size -1 ]) {
			
			for(int i = k_size-1 ; i>0 ; i--) {
				
				if(budget % keyboard[i] > 0 && (budget % keyboard[i]) % drive[0] >= 0 ) {			//�Ѵ� �����ؾ� �������� Ű���� Ȯ��
					selected_keyboard = keyboard[i];	
					index = i;
					remain = budget % keyboard[i];
				}
			}
			
			for(int j = d_size-1 ; j>0 ; j--) {
				if(remain / drive[j] > 0) {
					selected_drive = drive[j];
				}
			}
			
			if(selected_keyboard == 0 || selected_drive == 0) {
				result = -1;
			}else {
				result = selected_keyboard + selected_drive;
				
			}
			
			
			System.out.println(result);
//			System.out.println("from keyboard key board : " + selected_keyboard + "drive : " + selected_drive+ "remain : " + remain);

			
		} else { // drive�� ���Ϻ�Ѱ� �� ũ�ٸ�  
			
			
			
			for(int i = d_size-1 ; i>-1 ; i--) {
				
				if(budget % drive[i] > 0 && (budget % drive[i]) % keyboard[0] >= 0 ) {			//�Ѵ� �����ؾ� �������� Ű���� Ȯ��
					selected_drive = drive[i];	
					index = i;
					remain = budget % drive[i];
				}
			}
			
			for(int j = k_size-1 ; j>-1 ; j--) {
				if(remain / keyboard[j] > 0) {
					selected_keyboard = keyboard[j];
				}
			}
			
			if(selected_drive == 0 || selected_keyboard == 0) {
				result = -1;
			}else {
				result = selected_drive + selected_keyboard;
				
			}
			
			
			System.out.println(result);
//			System.out.println("from drive key board : " + selected_keyboard + "drive : " + selected_drive + "remain : " + remain);
			
			
			
		}
		
		
		
		
		
		
	}

}
