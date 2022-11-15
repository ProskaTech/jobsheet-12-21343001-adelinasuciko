/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan3_Polymorphism_Dynamic;

public class Bank {
	float sukuBunga() {
		return 0;
	}

}

class BRI extends Bank{
	
	//overriding sukubunga method
	float sukuBunga() {
		return 5.5f;
	}
}
