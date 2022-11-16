/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan3_Polymorphism_Dynamic;

public class BNI extends Bank{
	
	float sukuBunga() {
		return 10.6f;
	}

}

class Mandiri extends Bank{
	//overriding sukubunga method
	
	float sukuBunga() {
		return 9.4f;
	}
}
