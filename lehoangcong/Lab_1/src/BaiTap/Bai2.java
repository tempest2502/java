package BaiTap;

import java.util.*;

public class Bai2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int a, b;
			System.out.println("Nhap so a: ");
			a = input.nextInt();
			System.out.println("Nhap so b: ");
			b = input.nextInt();
			if (a == b) {
				System.out.println(a + "=" + b);
			} else if (a > b) {
				System.out.println(a + ">" + b);
			} else if (a < b) {
				System.out.println(a + "<" + b);
			} else {
				System.out.println(a + "<>" + b);
			}
		}

	}

}
