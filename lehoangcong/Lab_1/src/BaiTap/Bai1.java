package BaiTap;

public class Bai1 {

	public static void main(String[] args) {
		int n = 10;
		fibonaci(n);
	}

	public static void fibonaci(int n) {
		int f1 = 1;
		int f2 = 1;
		System.out.println(f1 + "\t" + f2);
		int f;
		for (int i = 0; i < n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.println("\t" + f);
		}
	}

}
