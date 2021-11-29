
public class Static {
public static void main(String[] args) {
	

	Static main = new Static();

	System.out.println(main.cekSapaan("pria").toUpperCase() + " Dewa, selamat pagi");
	
	
}

public void printNama(int ulang, String word) {
	for(int i = 0; i < ulang; i++) {
		System.out.println(word);
	}
}


public String cekSapaan (String gender) {
	 if(gender.equalsIgnoreCase("pria")) {
		 return "Tuan";
	 } else {
		 return "Nyonya";
	 }
	
}
}