package com.bilgeadam.metro;

import java.util.Scanner;

public class metro {

	static double bakiye = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secim = 0;
		do {
			System.out.println("1- Kartima para ekle");
			System.out.println("2- Kartima bakiyemi görüntüle");
			System.out.println("3- Metroya bin");
			System.out.println("4- Sistemden çýk");
			secim = input.nextInt(); 
			switch (secim) {
			case 1:
				bakiyeYukle();
				break;
			case 2:
				bakiyeGoruntule();
				break;
			case 3:
				metroyaBin();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (secim != 4);
	}
	
	static void metroyaBin() {
		System.out.println("1- Tam Kart");
		System.out.println("2- Indirimli Kart");
		int kartTipi = input.nextInt();
		
		if(kartTipi == 1) {
			if(bakiye >= 2.60) {
				bakiye -= 2.60;
				System.out.println("Geçiþ Baþarýlý. Kalan Bakiye :" + bakiye);
			}else {
				System.out.println("Bakiyeniz yetersiz. Bakiyeniz :" + bakiye);
			}
		}else if(kartTipi == 2) {
			if(bakiye >= 1.25) {
				bakiye -= 1.25;
				System.out.println("Geçiþ Baþarýlý. Kalan Bakiye :" + bakiye);
			}else {
				System.out.println("Bakiyeniz yetersiz. Bakiyeniz :" + bakiye);
			}
		}
		
	}

	static void bakiyeYukle() {
		System.out.println("Yüklemek istediðiniz miktar giriniz : ");
		double yMiktar = input.nextDouble();
		bakiye += yMiktar;
	}
	static void bakiyeGoruntule() {
		System.out.println("Bakiyeniz :" + bakiye);
	}

}
