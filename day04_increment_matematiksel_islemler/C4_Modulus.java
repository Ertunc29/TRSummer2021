package day04_increment_matematiksel_islemler;

public class C4_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		// bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz
		//1-sayi%10 ile son basamagi elde ederiz
		
		int rakam=sayi%10;// rakam=6
		
		//2-bu rakami rakamlarToplamina ekleriz
		
		rakamlarToplami+=rakam;// rakamlarTopklami=6
		
		//3-degerini aldiginiz son basamaktan kurtulmak icin sayiyi 10'a boleriz
		
		sayi/=10; //sayi=549,6 int virgulden sonraki kismi siler sayi= 549 olur
		
		//bu satira geldigimde sayi=549, rakamlar toplami=6
		
		rakam=sayi%10; // rakam=9
		
		rakamlarToplami+=rakam; // rakamlarToplami=6+9=15
		
		sayi/=10;// sayi=54,9 int virgulden sonrasini siler sayi=54
		
		// bu satira geldigimde sayi=54, rakamlar toplami=15
		
		rakam=sayi%10; // rakam=4
		
		rakamlarToplami+=rakam; // rakamlarToplam=15+4=19
		sayi/=10; // sayi=5,4 int virgulden sonrasini siler sayi=5
		
		// bu satira geldigimizde sayi=5, rakamlar toplami=19;
		
		rakam=sayi%10; // rakam=5
		rakamlarToplami+=rakam; // rakamlarToplami= 19+5=24
		sayi/=10;// sayi=0 olur
		
		// kodumuzun sonunda rakamlar toplami=24 sayi 0 oldu
		
		System.out.println("Rakamlar toplami :"+ rakamlarToplami);
		System.out.println("Sayinin son degeri :" + sayi);
		
		

	}

}
