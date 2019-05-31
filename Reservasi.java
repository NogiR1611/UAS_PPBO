package reservasiHotel;
import java.io.IOException;
import java.util.*;


public class Reservasi {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int waktu,c1,c2;          
		
		do {
			System.out.println("\n=========Reservasi Hotel========");
			System.out.println("==========Selamat Datang========");
			System.out.println("1.Informasi");  
			System.out.println("2.Pemesanan");            
			System.out.print("Masukkan Pilihan Anda(1/2) = ");
			c1 = input.nextInt();
			if(c1==1) {
				do{ 
					System.out.println("\n========Reservasi Hotel========");
					System.out.println("============Informasi===========");
					System.out.println("1.VIP");  
					System.out.println("2.Reguler");     
					System.out.println("3.Hemat");        
					System.out.print("Masukkan Pilihan Anda(1-3) = ");
					c2 = input.nextInt();
					if(c2==1) {
						System.out.println("=========== VIP Room ===========");
						System.out.println("- Jumlah Kasur\t\t: 2");
						System.out.println("- Tipe Kamar Mandi\t: Premium");
						System.out.println("- Tipe Lemari\t\t: Deluxe");
						System.out.println("- Air Conditioner\t: Ya");
						System.out.println("- Televisi\t\t: Ya");
						System.out.println("- Kolam Renang\t\t: Ya");
						System.out.println("- Karaoke\t\t: Ya");
					}
					else if(c2==2) {
						System.out.println("=========== Reguler Room ===========");
						System.out.println("- Jumlah Kasur\t\t: 1");
						System.out.println("- Tipe Kamar Mandi\t: Sedang");
						System.out.println("- Tipe Lemari\t\t: Reguler");
						System.out.println("- Air Conditioner\t: Ya");
						System.out.println("- Televisi\t\t: Ya");
						System.out.println("- Kolam Renang\t\t: Tidak");
						System.out.println("- Karaoke\t\t: Tidak");
					}
					else if(c2==3) {
						System.out.println("=========== Hemat Room ===========");
						System.out.println("- Jumlah Kasur\t\t: 1");
						System.out.println("- Tipe Kamar Mandi\t: Kecil");
						System.out.println("- Tipe Lemari\t\t: Reguler");
						System.out.println("- Air Conditioner\t: Tidak");
						System.out.println("- Televisi\t\t: Tidak");
						System.out.println("- Kolam Renang\t\t: Tidak");
						System.out.println("- Karaoke\t\t: Tidak");
					}
					else
						System.out.println("-WRONG INPUT-");
					
				}while(c2==0);
				c1=0;
			}
			else if(c1==2) {
				System.out.println("\n========Reservasi Hotel========");
				System.out.println("===========Pemesanan===========");
				
				System.out.print("Nama\t\t: ");
				String nama = input.next();
				input.nextLine();
				System.out.print("Alamat\t\t: ");  
				String alamat = input.nextLine();
				
				System.out.print("Lama Inap\t: ");
				int lama = input.nextInt();
				
				System.out.println("Tipe Kamar ");
				System.out.println("1.VIP");  
				System.out.println("2.Reguler");     
				System.out.println("3.Hemat");
				System.out.print("Masukkan Pilihan Anda(1-3) = ");
				int tipe = input.nextInt();
				
				Tipe tipe_kamar = new Tipe();
				tipe_kamar = new Tipe(tipe);
				Pelanggan pelanggan = new Pelanggan(nama,alamat,lama);
				
				System.out.println("");
				System.out.println("Berhasil Reservasi");
				System.out.println("Nama\t\t: "+pelanggan.getNama());
				System.out.println("Alamat\t\t: "+pelanggan.getAlamat());
				System.out.println("Tipe Kamar\t: "+tipe_kamar.getTipe());
				System.out.println("Fasilitas Kamar\t: "+tipe_kamar.getFasilitas());
				System.out.println("Lama Inap\t: "+pelanggan.getLama()+" Hari");
				int total = 0;
				if(tipe == 1)total = lama*2000000;
				else if(tipe == 2)total = lama*1000000;
				else if(tipe == 3)total = lama*500000;
				System.out.println("Total Bayar\t: Rp."+total);
			}
		}while(c1==0);
	}
}