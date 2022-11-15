/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan4_AbstractionClass;

abstract class Orang {
	 public String namaAyah = "Randi Proska";
	 abstract void makan();
	 public void minum(){
		 System.out.println("Minum air teh dan kopi");
	 }

}

 class AnakUmur1Tahun extends Orang{
	
	public void namaAyahk() {
		System.out.println("Nama Ayahku adalah " +namaAyah);
	}
	
	public void makan() {
		System.out.println("Anak Umur 1 Tahun Makan Asi");
	}
	
	public void minum() {
		System.out.println("Anak Umur 1 Tahun Makan Asi");
	}

}

