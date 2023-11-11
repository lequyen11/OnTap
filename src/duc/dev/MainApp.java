package duc.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap N: ");
		int n = scan.nextInt();
		String star = "*";
		String space = " ";
		String down = "\n";
		/*
		 * Cau a: in ra n dau * tren mot dong
		 */
		System.out.println("Cau a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(star);
		}
		/*
		 * Cau b: in ra n dau *, no di cheo
		 */
		System.out.println(down); 
		System.out.println("Cau b: ");
		String spc = "";
		for (int i = 0; i <= n; i++) {
			System.out.print(spc+star+down);
			spc += space;
		}
		/*
		 * Cau c: Tinh tong n so le dau tien
		 */
		System.out.println(down);
		System.out.println("Cau c");
		int tongNLe = 0;
		int j = 1;
		for (int i = 1; i <= n; i++) {
			tongNLe += j;
			j+=2;
		}
		System.out.println("Tong N so le: " +tongNLe);
		
		/*
		 * Cau d: Tinh n! 1*2*3*...n
		 */
		System.out.println(down);
		long tichNGiaiThua = 1;
		System.out.println("Cau d");
		for (int i = 1; i <= n ; i++) {
			tichNGiaiThua *= i;
		}
		System.out.println("Tich " +n+ "! = " +tichNGiaiThua);
		
		/*
		 * Cau e: 1/1 + 1/2 + ... + 1/n
		 */
		System.out.println(down);
		System.out.println("Cau e");
		float tongCauE = 0;
		if (n >= 1) {
			for (float i = 1; i <= n; i++) {
				tongCauE += (float) (1/i);
			}
			System.out.println("Tong 1/n = " +tongCauE);
		} else {
			System.out.println("Mau so bang 0, nen k ra KQ");
		}
		/*
		 * Cau f: 1/2 + 2/3 + ... + (n-1)/n
		 */
		System.out.println(down);
		System.out.println("Cau f");
		if (n >= 1) {
			float tongCauF = 0;
			for (float i = 1; i <= n; i++) {
				tongCauF += (float) (i-1)/i;
			}
			System.out.println("Tong cau F = " +tongCauF);
		} else {
			System.out.println("Mau so bang 0, nen k ra KQ");
		}
		/*
		 * Cau g: x^n
		 */
		System.out.println(down);
		System.out.println("Cau g");
		System.out.println("Nhap x= ");
		float x = scan.nextFloat();
		float giaiThua = 1;
		if (n == 0) {
			giaiThua = 1;
		}
		for (int i = 1; i <= n; i++) {
			giaiThua *= x;
		}
		System.out.println("Tich x^n = " +giaiThua);
	}
}
