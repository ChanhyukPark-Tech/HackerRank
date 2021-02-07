package hackerRank;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double total_size = in.nextDouble();			// 반으로 나눈다음 want_page 의 대략적인 위치파악할것이므로 double 로 
		int want_page = in.nextInt();
		
											// page 변환 앞에서 세나 뒤에서세나 똑같으니 뒤에서세는거 total 에서 뺴면 결국 count 는 같음 (11,6) = (11,11-6)
		if(want_page > total_size / (double)2) {			// 대략 뒤에서부터 세는게빠르다면 걍 앞에서 세는걸로 바꾼다음 처리해줌 귀찮기때문에
			want_page = (int)total_size - want_page;		
		} 											//만약 want_page 가 태초부터 앞에서 세는게빨랐다면 그냥 그대로 냅두면 됌
		
		int answer ;
		total_size = (int)total_size ; // <--- 홀수든 짝수든 answer 은 2로 나눈 몫 으로처리할거기 때문에 다시 int 형으로 형변환해준다
		
		if(want_page == 1 && total_size > 2 && total_size % 2 == 0) {
			System.out.println(1);										// 특이한 cas 리 total 이 2보다크고 짝수이면서 want_page 가 1 뜨는 (6,5) 같은경우
			System.exit(1);
		}
		
		answer = want_page / 2 ;
		System.out.println(answer);
			
	}

}
