package hackerRank;

import java.util.Scanner;

public class DayoftheProgrammer {

	
		
	//¿±≥‚¿Ã∏È 12.09.yyyy
	//¿±≥‚¿Ã æ∆¥œ∏È 13.09.yyyy
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int day , month ;
		
		int year = in.nextInt();
		if(year < 1918) {
			if(year % 4 == 0) {
				System.out.println("12.09." + year);
			} else {
				System.out.println("13.09." + year );

			}
		} else if ( year > 1918) {
			
			if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0 )) {
				System.out.println("12.09." + year );
			} else {
				System.out.println("13.09." + year );
			}
			
		} else if (year == 1918 ) {
			System.out.println( "26.09.year");
		}
	
//		Scanner in = new Scanner(System.in);
//		int year = in.nextInt();
//		boolean is_it_leap = true;
//		
//		if(year % 4 == 0) {
//			
//			
//			if(year % 100 == 0) {
//				is_it_leap = false;
//				if(year % 400 == 0 ) {
//					is_it_leap = true;
//				}
//			}
//		}
//		
//		else {
//			is_it_leap = false;
//		}
//		
		
//		if(is_it_leap) {
//			System.out.println("12.09." + year );
//		} else {
//			System.out.println("13.09." + year );
//		}
		
		
		
		
	
	}

}
