package reservasiHotel;

public class Tipe extends Menu {
	public Tipe() {}
	
	public Tipe(int tipe_kamar) {
		if(tipe_kamar == 1) {
			tipe = "VIP";
			Fasilitas = "Kasur 2, AC, TV, Kamar Mandi Premium, Lemari Deluxe, Kolam Renang, Karaoke";
			harga = 2000000;
		}else if(tipe_kamar == 2) {
			tipe = "Reguler";
			Fasilitas = "Kasur 1, AC, TV, Kamar Mandi Sedang, Lemari";
			harga = 1000000;
		}
		else if(tipe_kamar == 3) {
			tipe = "Hemat";
			Fasilitas = "Kasur 1, Non-Ac, Kamar Mandi Kecil, Lemari";
			harga = 500000;
		}
	}
	
	public String getTipe() {
		return tipe;
	}
	
	public String getFasilitas() {
		return Fasilitas;
	}
}