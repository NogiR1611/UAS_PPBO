package reservasiHotel;

public class Menu {       
	protected int lama;
	protected int harga;       
	protected String Fasilitas;
	protected String tipe;
	
	public String getFasilitas() {
		return Fasilitas;
	}
	
	public int getHarga() {
		return harga;
	}
    public int getTotal() {
    	return harga*lama;
    } 
    public String getTipe() {
    	return tipe;
    }
    public int getLama() {
    	return lama;
    }
}