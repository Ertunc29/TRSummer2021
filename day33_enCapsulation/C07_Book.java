package day33_enCapsulation;

public class C07_Book {

	
		
		
		/*TODO
    Book class'� verilmi�tir.
    �ki tane attributes olu�turunuz.
    bookName ve authorName (String ile)
    Book class'�n� kaps�lleyin. (Encapsulate)
    Main class'�n i�ine object  olu�turun ve sonucu yazd�r�n�z.

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
