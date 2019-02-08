
/**
 * Write a description of class TestBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBook
{
   private Book bk;
   
   public TestBook()
   {
       bk = new Book("Green","My Travels",125);
       
       bk.getAuthor();
       bk.getTitle();
       bk.getPages();
       bk.getRefNumber();
       bk.getBorrowed();
       bk.toString();
       bk.printDetails();
       bk.setRefNumber("123456");
       bk.setRefNumber("GRE123");
       bk.borrow();
       bk.getRefNumber();
       bk.getBorrowed();
   }

   
}
