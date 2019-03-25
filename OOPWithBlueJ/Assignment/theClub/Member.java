import java.util.HashMap;

public class Member
{
    // the member's surname
    private String surname;
    // the member's first name
    private String firstName;
    // the ID
    private String ID;
    //the year joined
    private int yearJoined;

    public Member( String aFirstName , String aSurname, int aYear)
    {
        firstName = aFirstName;
        surname = aSurname;
        yearJoined = aYear;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurname()
    {
        return surname;
    }
    
    public int getYarJoined()
    {
        return yearJoined;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String anID)
    {        
        ID = anID;
    }    
   
    public String toString()
    {
        return " Name: " + firstName + " " + surname + " | Year of Join: " + yearJoined + " | ID: " + ID;      
    }
    
    public boolean equals(Object obj)
    {
        if(this == obj){
            return true;
        }
        else if(!(obj instanceof Member)){
            return false;
        }
        else{
        Member that = (Member) obj;
        return(this.ID.equals(that.ID));           
        }
        
    }
}
