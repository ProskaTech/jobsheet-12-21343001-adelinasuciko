/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan6_Encapsulation;

public class BuahUtama {

	public static void main(String[] args) {
		
		//menggunakan constructor untuk menginisialisasi
		EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
		
		//menggunakan getter ke nilai
		System.out.println("Nama buah : " +Apel.getName()+ "\nHarga:" +Apel.getPrice() + "\nwarna:" +Apel.getColor());
		
		//update harga dan warna menggunakan setter
		Apel.setColor("Hijau");
		Apel.setPrice("Rp.7000");
		System.out.println("\nInformasi terkait apel setelah di Update");
		
		//menggunakan getter untuk mendapatkan hasil
		System.out.println("Nama buah: " +Apel.getName()+"\nHarfa:" +Apel.getPrice()+"\nWarna: " +Apel.getColor());

	}

}
