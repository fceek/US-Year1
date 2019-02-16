
/**
 * Write a description of class TestBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBook
{
   private Book bk;
   private Book bk2;
   
   public TestBook()
   {
       bk = new Book();
       bk2 = new Book("Lester","CMU",5000);
       
       bk.getAuthor();
       bk.getTitle();
       bk.getPages();
       bk.getRefNumber();
       bk.getBorrowed();
       bk.toString();
       bk.printDetails();
       bk.setRefNumber("123456");
       bk.setRefNumber("LES123");
       bk.borrow();
       bk.getRefNumber();
       bk.getBorrowed();
       bk.printDetails();
       
       bk2.getAuthor();
       bk2.getTitle();
       bk2.getPages();
       bk2.getRefNumber();
       bk2.getBorrowed();
       bk2.toString();
       bk2.printDetails();
       bk2.setRefNumber("123456");
       bk2.setRefNumber("LES123");
       bk2.borrow();
       bk2.getRefNumber();
       bk2.getBorrowed();
       bk2.printDetails();
   }

   
}
