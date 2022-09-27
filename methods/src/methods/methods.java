package methods;

public class methods {

	public static void main(String[] args) {

		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
	}
	
	public static void sayıBulmaca() {
		
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak){
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			System.out.println("sayı mevcuttur:" + aranacak);
		}else {
			System.out.println("sayı mevcur değildir:" + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
