import java.util.HashMap;
/**
 * The Member class represents a member belonging to the club.
 * It holds the members details.
 */
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

    /**
     * Create a new member with a given name and year of joining.
     * @param String aFirstName
     * @param String aSurname
     * @param int aYear
     */
    public Member( String aFirstName , String aSurname, int aYear)
    {
        firstName = aFirstName;
        surname = aSurname;
        yearJoined = aYear;
    }

    /**
     * @return String The first name of this member.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return String The surname of this member.
     */
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * @return int The year joined
     */
    public int getYarJoined()
    {
        return yearJoined;
    }

    /**
     * @return String The ID of this member.
     */
    public String getID()
    {
        return ID;
    }

    /**
     * @param String anID 
     * The ID is created by the ClubRecords class.
     * No validation should be needed
     */
    public void setID(String anID)
    {        
        ID = anID;
    }    
   
    /**
     * @return String Print the members's full name, year joined and ID  to the output terminal.
     */
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
