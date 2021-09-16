package day33_enCapsulation;

public class C07_Book {

	
		
		
		/*TODO
    Book class'ý verilmiþtir.
    Ýki tane attributes oluþturunuz.
    bookName ve authorName (String ile)
    Book class'ýný kapsülleyin. (Encapsulate)
    Main class'ýn içine object  oluþturun ve sonucu yazdýrýnýz.

    todo  "Book name is BOOKNAME and Author is AUTHORNAME"

    */
		
		private String bookName;
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAutorName() {
			return autorName;
		}
		public void setAutorName(String autorName) {
			this.autorName = autorName;
		}
		private String autorName;
		
		
	

}
