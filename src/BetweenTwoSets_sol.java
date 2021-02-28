import java.util.Scanner;

public class BetweenTwoSets_sol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();  			//a 배열크기
	    int m = sc.nextInt();			//b 배열 크기
	    int gcd = 0;

	    int a[] = new int[n];
	    int b[] = new int[m];

	    for (int i = 0; i < n; i++) {   // 돌면서 a 에 값 주입
	      a[i] = sc.nextInt();
	    }
	    int lcm = a[0];					// 첫번째값을 lcm 으로 
	    for (int i = 0; i < m; i++) {
	      b[i] = sc.nextInt();
	      gcd = gcd(b[i], gcd);
	    }
	    for (int i = 0; i < n - 1; i++) {
	      lcm = (lcm * a[i + 1]) / gcd(a[i + 1], lcm);
	    }
	    int count = 0, t = 0;
	    for (int i = 1; i <= gcd && t <= gcd; i++) {
	      t = lcm * i;
	      if (gcd % (lcm * i) == 0) {
	        count++;
	      }
	    }
	    System.out.println(count);
	    sc.close();
	  }
	
	
	
	public static int gcd(int x , int y) {
		if(y==0) {
			return x ;
					}
			return gcd(y,x%y);
	}
	
	public static int lcm(int n1, int n2) {
	    if (n1 == 0 || n2 == 0)
	        return 0;
	      else {
	        int gcd = gcd(n1, n2);
	        return Math.abs(n1 * n2) / gcd;
	      }
	    }

}




