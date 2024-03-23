package BaiTap;

import java.util.*;

public class Bai3 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			float x, y, ketqua = 0;
			String c;
			System.out.println("x= ");
			x = input.nextFloat();
			System.out.println("y= ");
			y = input.nextFloat();
			input.nextLine(); // xoa ky tu xuong dong
			System.out.println("Phep toan: ");
			c = input.nextLine();
			switch (c) {
			case "+":
				ketqua = x + y;
				break;
			case "-":
				ketqua = x - y;
				break;
			case "*":
				ketqua = x * y;
				break;
			case "/":
				if (y != 0) {
					ketqua = x / y;
				} else if (y == 0) {
					System.out.println("Khong chia dc cho 0");
				}
				break;
			}
			System.out.println(x + " " + c + " " + y + "= " + ketqua);
		}
	}

}
