import java.util.Scanner;

public class PersonApp {
	static Scanner komut = new Scanner(System.in);
	static Person[] kisiler = new Person[50];
	static int personCount = 0;

	public static void main(String[] args) {
		Person[] kisiler = new Person[50];

		kisiEkleOtomatik("Esra", "Karacao�lu", GenderType.K, 1997);
		kisiEkleOtomatik("Emrah", "Basdaban", GenderType.E, 1995);
		kisiEkleOtomatik("Ezgi", "Ba�", GenderType.K, 1996);

		String islem = "";
		while (!islem.equals("C")) {
			islem = menu();
			switch (islem) {
			case "E":
				kisiEkle();
				break;
			case "S":
				kisiSil();
				break;
			case "D":
				kisiDegistir();
				break;

			case "L":
				kisiListele();
				break;
			case "G":
				detayliGoruntule();
				break;
			case "A":
				kisiAra();
				break;
			case "C":
				System.out.println("G�le g�le...");
				break;
			}

		}

	}

	private static void kisiDegistir() {
		System.out.print("Ki�i indeksi girin: ");
		int index = komut.nextInt();
		for (int i = 0; i < personCount; i++) {
			if (i == index) {
				System.out.println(kisiler[i]);
			}
		}
		System.out.println("Yeni bilgiler:");
		Person person;
		System.out.print("Ki�i ad�n� giriniz: ");
		String name = komut.next();

		System.out.print("Ki�i soyad�n� giriniz: ");
		String surname = komut.next();
		
		System.out.print("Cinsiyet  giriniz: ");
		GenderType gender = GenderType.valueOf(komut.next());

		System.out.print("Do�um tarihi  giriniz: ");
		int birthYear = komut.nextInt();

		person = new Person(name, surname, gender, birthYear);
		kisiler[index] = person;

	}

	private static void detayliGoruntule() {
		System.out.print("Ki�i indeksi girin: ");
		int index = komut.nextInt();
		for (int i = 0; i < personCount; i++) {
			if (i == index) {
				System.out.println(kisiler[i - 1]);
			}
		}

	}

	private static void kisiSil() {
		System.out.print("Silinecek ki�inin ad�n� giriniz: ");
		String name = komut.next();
		boolean bitis = false;
		for (int i = 0; i < personCount; i++) {
			if (kisiler[i].getName().equals(name)) {
				for (int j = i; j < personCount; j++) {
					if (kisiler[j + 1] != null) {
						kisiler[j] = kisiler[j + 1];
					} else {
						bitis = true;
						personCount--;
						break;

					}

				}

			}
			if (bitis)
				break;
		}

	}

	private static void kisiAra() {
		System.out.print("Aranan :");
		String kelime = komut.next();
		boolean kontrol;
		int sayac = 0;
		for (int i = 0; i < personCount; i++) {
			kontrol = false;
			sayac = 0;
			for (int j = 0; j < kisiler[i].getName().length(); j++) {
				if (kisiler[i].getName().charAt(j) == kelime.charAt(sayac)) {
					sayac++;
				}
				if (sayac == kelime.length()) {
					System.out.println(kisiler[i].getName() + " " + kisiler[i].getSurname() + " "
							+ kisiler[i].getGender() + " " + kisiler[i].getBirthYear());
					kontrol = true;
					break;
				}

			}

			if (!kontrol) {
				sayac = 0;
				for (int j = 0; j < kisiler[i].getSurname().length(); j++) {
					if (kisiler[i].getSurname().charAt(j) == kelime.charAt(sayac)) {
						sayac++;
					}
					if (sayac == kelime.length()) {
						System.out.println(kisiler[i].getName() + " " + kisiler[i].getSurname() + " "
								+ kisiler[i].getGender() + " " + kisiler[i].getBirthYear());
						kontrol = true;
						break;
					}

				}
			}
		}
	}

	private static void kisiEkle() {
		Person person;
		System.out.print("Ki�i ad�n� giriniz: ");
		String name = komut.next();

		System.out.print("Ki�i soyad�n� giriniz: ");
		String surname = komut.next();

		System.out.print("Cinsiyet  giriniz: ");
		GenderType gender = GenderType.valueOf(komut.next());

		System.out.print("Do�um tarihi  giriniz: ");
		int birthYear = komut.nextInt();

		person = new Person(name, surname, gender, birthYear);
		kisiler[personCount++] = person;
	}

	public static void kisiEkleOtomatik(String name, String surname, GenderType gender, int birthYear) {
		Person person;
		person = new Person(name, surname, gender, birthYear);
		kisiler[personCount++] = person;

	}

	private static void kisiListele() {
		for (int i = 0; i < personCount; i++) {
			System.out.println((i + 1) + ".Ki�i: " + kisiler[i]);
		}

	}

	static String menu() {
		System.out.println("     Men�:   ");
		System.out.println("1.Ekle(E)");
		System.out.println("2.Sil(S)");
		System.out.println("3.De�i�tir(D)");
		System.out.println("4.Listele(L)");
		System.out.println("5.Detayl� G�r�nt�le(G)");
		System.out.println("6.Ara(A)");
		System.out.println("7.��k��(C)");

		System.out.print("Se�im yap�n�z: ");
		String secim = komut.next();
		return secim;

	}

}
