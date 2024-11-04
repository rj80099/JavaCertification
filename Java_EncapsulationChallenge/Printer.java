/**
 * To create an encapsulation class, you want to:
 * 1. Create constructors for object initialization, which enforced that only object with valid data will get created.
 * 2. Use the private access modifier for your fields.
 * 3. Use setter method sparingly and only as needed.
 * 4. Use access modifiers that aren't private, only for the methods that the caclling code needs to use.
 */
public class Printer {
    
    private int tonerLevel; //percent of toner left in the toner cartridge
    private int pagePrinted; //count of total page printed
    private boolean duplex; //print whether to print both sides of a sheet


    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <= 100)?tonerLevel:-1;
        this.pagePrinted = 0;
        this.duplex = duplex;
    }
    
    public int addToner(int tonerAmount) {
     
      tonerAmount += tonerLevel; 
      if(tonerLevel < 0 && tonerLevel >  100)
        return -1;
      tonerLevel += tonerAmount;
      return tonerLevel;
    }

    public int printPages(int pages) {
      int jobPages = (duplex)?(pages/2)+(pages % 2):pages;  //duplex page + odd number of pages
      pagePrinted += jobPages;
      return jobPages;
    }
  
    public int getpagesPrinted(){
      return pagePrinted;
    }
  }
