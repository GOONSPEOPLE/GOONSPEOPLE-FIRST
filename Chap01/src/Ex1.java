//Do it java 데이터 구조, 알고리즘 입문편 1 - Q4

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[4];
		for(int i = 0; i < 4 ; i++) a[i] = stdIn.nextInt();
		
		System.out.println(findmin(a));		
	}
	
	static int findmin(int a[]) {

		int leng = a.length;
		int min = a[0];

		for(int i=0 ; i < leng ; i++) {
			if(min > a[i]) min = a[i];		
		}
		return min;
	}
}
