package oop1.InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		// program dependent on a specific type
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		// no dependency to any type:
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
		
		KrediUI krediUI2 = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		

	}

}
