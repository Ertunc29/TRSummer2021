package day15_forLoops;

public class C01_MethodCreationSoru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* soru : bir oyun programinda oyuncuya level ve puanina gore
		 bonus hesaplayan bir method yaziniz. 
		 bonus eklendikten sonra oyuncu yeni puaniyla oyuna devam edecek.
		 (oyun icinde birden fazla defa bonus ekleme fonksiyonu kullanilabilir)
		 
		 bonus kurali :
		 ilk 10 level icin mevcut puan 1000'den az ise 50, 1000 veya daha cok ise 100 puan bonus,
		 11-50 level arasi mevcut puanin yuzde 10'u kadar bonus
		 51. levelden itibaren puan 10.000'den az ise 1000 puan, 10.000'den fazla ise 
		 mevcut puanin yuzde 15'i kadar bonus
		 */
		
		
		int level=20;
		int puan=1500;
		
		
		bonusHesapla(level,puan);
		puan+=bonusHesapla(level,puan);
		
		System.out.println(puan);
		
		level++;
		
		puan=20000;
		
		puan+=bonusHesapla(level,puan);
		System.out.println(puan);
		
		level=90;
		puan=7500;
		puan+=bonusHesapla(level,puan);
		System.out.println(puan);

	}

	private static int bonusHesapla(int level, int puan) {
		// TODO Auto-generated method stub
		int bonus=0;
		
		if (level<=10) {
			//ilk 10 level icin mevcut puan 1000'den az ise 50, 1000 veya daha cok ise 100 puan bonus
			if(puan<1000) {
				bonus=50;
			}else {
				bonus=100;
			}
		}else if (level<=50) {
			// 11-50 level arasi mevcut puanin yuzde 10'u kadar bonus
			bonus=puan*10/100;
			
		}else {
			 //puan 10.000'den az ise 1000 puan, 10.000'den fazla ise 
			 // mevcut puanin yuzde 15'i kadar bonus
			if(puan<10000) {
				bonus=1000;
			}else {
				bonus=puan*15/100;
			}
			
			
		}
		return bonus;
	}

}
