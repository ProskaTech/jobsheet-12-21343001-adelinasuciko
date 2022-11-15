/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package Latihan2_Polymorphism_Static;

public class CompileTime {
	
	//method keliling dengan single argumen
	static int keliling(int a) {
		return 4 * a;
	}
	
	//method keliling dengan dua argumen (method overloading)
	static int keliling(int l, int b) {
		return 2 * (l + b);
	}

}
