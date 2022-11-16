/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan4_AbstractionClass;

public class Manusia {

	public static void main(String[] args) {
		
		//objek induk tidak bisa dibuat disini
		
		//buat object anak umur 1 tahun baru
		AnakUmur1Tahun a1 = new AnakUmur1Tahun();
		
		//panggil method anak umur 1 tahun
		a1.makan();
		a1.minum();
		a1.namaAyahk();
		System.out.println();

	}

}
