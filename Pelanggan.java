package reservasiHotel;

public class Pelanggan extends Tipe{
    protected String nama, alamat;
    
    public Pelanggan() {
    	nama = "anonymous";
    	alamat = "";
    }
    
    public Pelanggan(String nama, String alamat,int lama) {
    	this.nama = nama;
    	this.alamat = alamat;
    	this.lama = lama;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
	public void setLama(int lama) {
		this.lama = lama;
	}
	public int getLama() {
		return lama;
	}
    
}