package com.ecodation.innerpacket;

public class Ulke {

	private String ulkeAdi;
	private String ulkeParaBirimi;

	// getter and setter
	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}

	public String getUlkeParaBirimi() {
		return ulkeParaBirimi;
	}

	public void setUlkeParaBirimi(String ulkeParaBirimi) {
		this.ulkeParaBirimi = ulkeParaBirimi;
	}

	// farklı bir class
	public static class Sehirler {

		private String sehirAdi;
		private String sehirPlakasi;

		// getter and setter
		public String getSehirAdi() {
			return sehirAdi;
		}

		public void setSehirAdi(String sehirAdi) {
			this.sehirAdi = sehirAdi;
		}

		public String getSehirPlakasi() {
			return sehirPlakasi;
		}

		public void setSehirPlakasi(String sehirPlakasi) {
			this.sehirPlakasi = sehirPlakasi;
		}

		// Mahalle Classı
		public class Mahalleler {
			private String mahalleAdi;
			private String mahalleMuhtari;

			// getter and setter
			public String getMahalleAdi() {
				return mahalleAdi;
			}

			public void setMahalleAdi(String mahalleAdi) {
				this.mahalleAdi = mahalleAdi;
			}

			public String getMahalleMuhtari() {
				return mahalleMuhtari;
			}

			public void setMahalleMuhtari(String mahalleMuhtari) {
				this.mahalleMuhtari = mahalleMuhtari;
			}

		}

	}

}
