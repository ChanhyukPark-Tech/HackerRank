import java.util.Scanner;

public class NumberLineJumps {

	public static void main(String[] args) {
		int x1; // 첫번째 캥거루 위치
		int v1; // 첫번째 캥거루 속도
		int x2; // 두번째 캥거루 위치
		int v2; // 두번째 캥거루 속도
		int[] arr = new int[2*2];
		Scanner in = new Scanner(System.in);
		// 값을 외부로부터 입력받는작업
		for(int i=0; i<arr.length;i++) {
			arr[i] = in.nextInt();
		} 
		x1 = arr[0];
		v1 = arr[1];
		x2 = arr[2];
		v2 = arr[3];
		
		boolean same = false;
		for(int i=0;i<50000;i++) {
			x1 += v1;
			x2 += v2;
			if(x1==x2) {
				same = true;
			}
		}
		
		if(same) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
	}
}