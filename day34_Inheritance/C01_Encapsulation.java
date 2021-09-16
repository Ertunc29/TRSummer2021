package day34_Inheritance;

public class C01_Encapsulation {

      private String okulIsmi="yildiz koleji";
      private int hesapNo=12345;
      private boolean okulAcikMi=true;
      
      
      public String getOkulIsmi() {
    	return okulIsmi;
     
    	   }
    		  

	  public int getOkulHesapNo() {
		return hesapNo;
		
		
	}
      public boolean getokulAcikMi() {
		return okulAcikMi;
    	  
		
      }
      
      public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
    	  
		
      }
      public void setOkulHesapNo(int hesapNo) {
		this.hesapNo=hesapNo;
    	  
      }
      public void setokulAcikMi(boolean okulAcikMi) {
    	  this.okulAcikMi=okulAcikMi;
    	  
      }
}
