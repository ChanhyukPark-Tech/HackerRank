package hackerRank;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		int borrow_date , borrow_month , borrow_year , return_date , return_month , return_year ;
		int answer=0;
		
		final int day_pay = 15;  
		final int month_pay = 500;  
		final int year_pay = 10000;  
		Scanner in = new Scanner(System.in);
		return_date = in.nextInt();
		return_month = in.nextInt();
		return_year = in.nextInt();
		borrow_date = in.nextInt();
		borrow_month = in.nextInt();
		borrow_year = in.nextInt();
		
		if(return_year > borrow_year) {
			answer = year_pay;
		}else if(return_month > borrow_month && borrow_year <= return_year ) {
			answer = month_pay * (return_month - borrow_month);
		}else if(return_date > borrow_date && borrow_month <= return_month && borrow_year <= return_year) {
			answer = day_pay * (return_date - borrow_date);
		}
		
		System.out.println(answer);
	}

}
