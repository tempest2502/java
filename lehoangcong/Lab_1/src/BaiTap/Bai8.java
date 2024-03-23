package BaiTap;

import java.util.*;

public class Bai8 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao 1 thang: ");
		n = input.nextInt();
		if (n % 3 == 0)
			System.out.println("Quy: " + n / 3);
		else
			System.out.println("Quy: " + n / (3 + 1));

	}

}
