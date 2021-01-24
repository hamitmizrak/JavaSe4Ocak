package com.ecodation.composition;

public class FormatDers {

	public static void main(String[] args) {

		String kelime = "";
		final int sayilar = 0;
		float virgul = 0;
		try {
			int telefonNumarasi = 555_44_33_22;
			System.out.println(telefonNumarasi);
			String ternary = 3 > 1 ? "büyük" : "küçük";
			System.out.println(ternary);
			// S D F
			kelime = "Hamit Mızrak";
			// sayilar = 44;
			virgul = 19.44f;
			int x = 4 / 0;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.printf("%s %d %f ", kelime, sayilar, virgul);
		}

	}

}
