package methods2;

public class VariableArguments {

	public static void main(String[] args) {

		int sayı = topla(5, 7);
		System.out.println(sayı);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}

	public static int topla2(int... sayılar) {
		int toplam = 0;
		for (int sayı : sayılar) {
			toplam += sayı;
		}
		return toplam;
	}
}