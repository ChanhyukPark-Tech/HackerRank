import java.util.Scanner;

public class NumberLineJumps {

	public static void main(String[] args) {
		int x1; // ù��° Ļ�ŷ� ��ġ
		int v1; // ù��° Ļ�ŷ� �ӵ�
		int x2; // �ι�° Ļ�ŷ� ��ġ
		int v2; // �ι�° Ļ�ŷ� �ӵ�
		int[] arr = new int[2*2];
		Scanner in = new Scanner(System.in);
		// ���� �ܺηκ��� �Է¹޴��۾�
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