package BaiTap;

import java.util.*;

public class Bai4 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a[], n;
		System.out.println("Nhap so phan tu: ");
		n = input.nextInt();
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = input.nextInt();
		}
		System.out.println("Mang vua nhap: ");
		XuatMang(a);
		System.out.println("\nTong cac phan tu: " + Tong(a));
		System.out.println("\nTong cac phan tu le: " + TongLe(a));

	}

	public static void XuatMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
	}

	public static int Tong(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		return tong;
	}

	public static int TongLe(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				tong += a[i];
			}
		}
		return tong;
	}
}
