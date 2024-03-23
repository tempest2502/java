
package BaiTap;

import java.text.*;
import java.util.*;

public class Bai6 {

	private static SimpleDateFormat sdf;

	public static void main(String[] args) {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		date = new Date();
		System.out.println("Ngay hien tai: " + sdf.format(date));
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = new Date();
		System.out.println("Ngay hien tai: " + sdf.format(date));
	}

}
