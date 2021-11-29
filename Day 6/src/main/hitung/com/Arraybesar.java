package main.hitung.com;
import java.util.Scanner;
import java.util.Iterator;

public class Arraybesar {
		int x = 3;
		int y = 3;
	public Arraybesar() {
		
//		int a[] = {1,2,3,4,5,6,7,8,9,10} ;
		
		
		int nilai[][] = new int [x][y];
		
		//sumbu y
		
		for (int i = 0; i < y; i++) {
			// sumbu x
			for (int j = 0; j < x; j++) {
				nilai[j][i] = 1;
			}
		}
//		printArray(nilai);
//		printArray(inverse(nilai));
//		printArray(diagonal(nilai));
		pembesaran(nilai);
	}
	public void pembesaran(int[][]nilai) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nilai pembesaran ");
		int besar = scan.nextInt();
		
		int [][] dummy=new int [x*besar][y*besar];
		
		for (int i = 0; i < y*besar; i++) {
			// sumbu x
			for (int j = 0; j < x*besar; j++) {
//				System.out.print(nilai[0][0]);
				if(j<x && i < y) {
					System.out.print(nilai[j][i]);
				}else {
					System.out.print("@");
				}
			}
			System.out.println("");
		}
	}
	
//	public void printArray (int[][] nilai) {
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				System.out.print(nilai[j][i] + " ");
//			}
//			System.out.println("");
//		}
//	}
//	public int[][] inverse (int [][] nilai) {
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				nilai[j][i] *= 0;
//			}
//			
//		}
//		return nilai;
//	}
//	public int[][] diagonal (int [][] nilai) {
//		int counter = 0;
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				if(counter %2==0) {
//				nilai[j][i] = 1;
//				}
//				counter++;
//			}
//		}
//	
//	return nilai;
//	
//	
//	}
//	
	
	
	
}