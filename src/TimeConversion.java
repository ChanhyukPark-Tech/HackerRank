import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		boolean isPM = s.contains("PM");
		String hours = s.substring(0, 2);
		String not_hours = s.substring(3, 8);
		String answer = "";
		
		if(isPM) {
			if(Integer.parseInt(hours) >= 12) {
				answer = (hours + ":" + not_hours);
			}else {
				
				int new_hours = Integer.parseInt(hours) + 12;
				answer = (new_hours +":"+ not_hours);
			}
		}else {
			int new_hours = Integer.parseInt(hours);
			if(new_hours >= 12) {
				new_hours -= 12;
				answer = ("0" + new_hours +":"+not_hours);
			}else {
				
				answer = (hours +":"+ not_hours);
			}
				
		}
		
		System.out.println(answer);
		in.close();
	}

}
