package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		
		int enBuy= sayi1;
		
		if(enBuy<sayi2) {
			enBuy=sayi2;
		}if(enBuy<sayi3){
			enBuy=sayi3;
		}
		
		System.out.println("En büyük sayi: " +enBuy);
		

	}

}
