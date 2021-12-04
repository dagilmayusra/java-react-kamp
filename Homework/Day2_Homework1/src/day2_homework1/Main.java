package day2_homework1;

public class Main {

	public static void main(String[] args) {
			
		Kurs kurs1 = new Kurs(1, "Java - React Kursu", 20);
		
		Kurs kurs2 = new Kurs(2, "C# - Angular Kursu", 3);
		
		Kurs kurs3 = new Kurs(3, "JavaScript Kursu", 0);

		
		Kurs[] kurslar = {kurs1, kurs2, kurs3};
		
		for (Kurs kurs : kurslar) {
			System.out.println(kurs.name);
		}
		
		System.out.println(kurslar.length);
		
		Kategori kategori1= new Kategori();
		kategori1.id=1;
		kategori1.name="Programlama";
		
		KursManager kursManager =new KursManager();
		kursManager.kursEkle(kurs1);
		
		kursManager.kursEkle(kurs2);
		
		kursManager.kursEkle(kurs3);
		
		
		
	
	}

}
