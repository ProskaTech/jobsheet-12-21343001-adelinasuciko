/*
 * Created by: 21343001_ADELINA SUCIKO
 */
package Latihan3_Polymorphism_Dynamic;

public class PolymorphismDynamic {

	public static void main(String[] args) {
		
		//creating variable of bank class
		Bank B;
		B = new BRI();
		System.out.println("Tingkat suku bunga BRI adalah : " +B.sukuBunga());
		B = new BNI();
		System.out.println("Tingkat Suku Bunga BNI adalah : " +B.sukuBunga());
		B = new Mandiri();
		System.out.println("Tingkat Suku Bunga Mandiri adalah : " +B.sukuBunga());
	}

}
