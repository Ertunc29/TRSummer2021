package day31_varargsStringBuilder;

public class C06_StringBuilder01 {

	public static void main(String[] args) {
		
		
		StringBuilder sb1=new StringBuilder(); // bos bir Stringbuilder olusturur
		System.out.println("sb1 :"+sb1);
		StringBuilder sb2=new StringBuilder("Sanim"); // icinde Mehmet degeri olan bir SB uretir
		System.out.println("sb2 :"+sb2);
		
		StringBuilder sb3=new StringBuilder(10); // 10 kapasitesi olan bir SB uretir
		System.out.println("sb3 :"+sb3);
		
		sb1.append(" hoca");
		System.out.println("sb1 append :"+ sb1);
		
		sb2.append(" hoca");
		System.out.println("sb2 append :"+ sb2);
		
		sb3.append(" hoca");
		System.out.println("sb3 append :"+ sb3);
		
		System.out.println("sb1 uzunluk :"+ sb1.length());
		System.out.println("sb1 kapasite :"+ sb1.capacity()); // sb1 kapasite :16 bir deger yazmadigimiz icin default kapasite 16 
		
		System.out.println("sb2 kapasite :"+ sb2.capacity()); // basta 5 olusturfuk default deger 16 toplam 21 oldu
		System.out.println("sb2 uzunluk :"+ sb2.length());
		
		System.out.println("sb3 kapasite :"+ sb3.capacity()); // basta 10 kapasite verdigimiz icin
		System.out.println("sb3 uzunluk :"+ sb3.length());
		
		// capacity hafiza yonetimi icin cok onemli 
		// kod yazilirken sabit uzunluk veya max. uzunluk belli ise
		// 3. method ile olusturarak hafiza kullanimini optimize edebiliriz

	}

}
