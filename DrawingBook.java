package hackerRank;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double total_size = in.nextDouble();			// ������ �������� want_page �� �뷫���� ��ġ�ľ��Ұ��̹Ƿ� double �� 
		int want_page = in.nextInt();
		
											// page ��ȯ �տ��� ���� �ڿ������� �Ȱ����� �ڿ������°� total ���� ���� �ᱹ count �� ���� (11,6) = (11,11-6)
		if(want_page > total_size / (double)2) {			// �뷫 �ڿ������� ���°Ժ����ٸ� �� �տ��� ���°ɷ� �ٲ۴��� ó������ �����⶧����
			want_page = (int)total_size - want_page;		
		} 											//���� want_page �� ���ʺ��� �տ��� ���°Ի����ٸ� �׳� �״�� ���θ� ��
		
		int answer ;
		total_size = (int)total_size ; // <--- Ȧ���� ¦���� answer �� 2�� ���� �� ����ó���Ұű� ������ �ٽ� int ������ ����ȯ���ش�
		
		if(want_page == 1 && total_size > 2 && total_size % 2 == 0) {
			System.out.println(1);										// Ư���� cas �� total �� 2����ũ�� ¦���̸鼭 want_page �� 1 �ߴ� (6,5) �������
			System.exit(1);
		}
		
		answer = want_page / 2 ;
		System.out.println(answer);
			
	}

}
