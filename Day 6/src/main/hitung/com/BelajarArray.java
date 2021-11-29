package main.hitung.com;

public class BelajarArray {
	int x = 3;
	int y = 3;
	
	public BelajarArray() {
		
		
	
		
		int nilai [][] = new int [x][y];
		
		//sumbu y
		
		for (int i = 0; i < y; i++) {
			
			//sumbu x
			
			 for (int j = 0; j < x; j++) {
				 nilai[j][i] = 1;
				
			}
			
		}
		
		printArray(nilai);
		printArray(inverse(nilai));
		printArray(diagonal(inverse(nilai)));
	}
	
	
	public void printArray (int[][] nilai) {
		
		for (int i = 0; i < x ; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(nilai[j][i] + " ");
			}
			
			System.out.println("");
		}
		
		
	}
	
  public int[][] inverse (int[][] nilai) {
		
		for (int i = 0; i < x ; i++) {
			for (int j = 0; j < y; j++) {
				nilai[j][i] *=  0;
			}
			
		
		}
		
		return nilai;
	}
  
  public int[][] diagonal (int[][] nilai){
	  int counter = 0;
	  for (int i = 0; i < x ; i++) {
			for (int j = 0; j < y; j++) {
				
				if(counter % 2 == 0) {
					nilai[j][i] =  1;
				}
				counter++;
			}
			
		
		}
	  
	  return nilai;
  }
	

}
