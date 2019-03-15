/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author ()
 * @version (1)
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * constructor 1
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    /**
     * constructor 2
     */
    public Book()
    {
        author = "Smith";
        title = "Mylife";
        pages = 100;
        refNumber = "";
        borrowed = 0;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void setRefNumber(String _refNumber)
    {
        String capName;
        String followNum;
        
        if (_refNumber.length() != 6) {
            System.out.println("Not 6-digit");
            return;
        }
        
        if (author.indexOf(' ') == -1) capName = author.substring(0,3);
            else capName = author.substring(author.indexOf(' ')+1,author.indexOf(' ')+4);
            
        if (!_refNumber.substring(0,3).equals(capName.toUpperCase()))  {
            System.out.println("Author Name Wrong");
            return;
        }
        
        followNum = _refNumber.substring(3,6);
        for (int i = 0; i < followNum.length(); i++)
           {
             if (!Character.isDigit(followNum.charAt(i))) {
                    System.out.println("Need a 3-digit Number");
                    return;
                }
            }
            
        refNumber = _refNumber;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }

    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("TotalPages: " + pages);
        if (!"".equals(refNumber)) System.out.println("Ref: " + refNumber);
            else System.out.println("Ref: xxx");
        System.out.println("Borrowed: " + borrowed);
    }
    
    public String toString()
    {
        String infoStr;
        infoStr = "A:"+author+" T:"+title+" P:"+pages+" R:"+refNumber+" B:"+borrowed;
        return infoStr;
    }
    //mutator method
    public void borrow()
    {
        borrowed++;
    }       
    
}
