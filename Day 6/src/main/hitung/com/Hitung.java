package main.hitung.com;

import java.util.Scanner;

public class Hitung {	
public static void main(String[] args) {
	Hitung main = new Hitung();
//	Arraybesar origins = new Arraybesar();
	Array origins = new Array();
//	Tes origin = new Tes();
	//	main.rekursi();
}	
public void rekursi (){

	Scanner scan = new Scanner(System.in);
	System.out.println("Masukkan nilai yang dihitung");
	int nilai = scan.nextInt();
	
	System.out.println("Nilainya adalah : " +totalSemua(nilai));

}
	public int totalSemua(int nilai) {
		System.out.println(nilai +" ");
		if(nilai > -1) {	
			if(nilai %2==1) {	
				return nilai+totalSemua(nilai-1);
			}else {
				return totalSemua(nilai-1);
			} 
	}else {
		System.out.println("");
		return 0;
	}
}
}
