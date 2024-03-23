package BaiTap;

public class Bai5 {

	public static void main(String[] args) {
		String s = "dai hoc  cong    nghe sai  gon   ";
		System.out.println("Chieu dai: " + s.length());
		s = s.trim();
		System.out.println("bo khoang trang truoc va sau chuoi: '" + s + "'");
		s = s.replaceAll(" +", " ");
		System.out.println("Bo khoang trang du thua: '" + s + "'");
		String firstletter = s.substring(0, 1);
		String remainingletter = s.substring(1, s.length());
		firstletter = firstletter.toUpperCase();
		s = firstletter + remainingletter;
		System.out.println("viet hoa chu cai dau: '" + s + "'");
	}
}
