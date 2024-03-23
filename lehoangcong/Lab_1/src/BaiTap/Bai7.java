package BaiTap;

import java.util.*;

public class Bai7 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Nhap a= ");
		a=input.nextInt();
		System.out.println("Nhap b= ");
		b=input.nextInt();
		System.out.println("Nhap c= ");
		c=input.nextInt();
		if(a>b && a>c)
			System.out.println("So nguyen lon nhat la "+a);
		else if(b>a && b>c)
			System.out.println("So nguyen lon nhat la "+b);
		else
			System.out.println("So nguyen lon nhat la "+c);
	}

}
