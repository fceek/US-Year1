import java.util.ArrayList;
import java.io.File;
import java.time.Year;
/**
 * The ClubRecords class holds the membership records and allows them to be analyzed
 * It uses an ArrayList to store the records. Each record is a Member objec.
 */
public class ClubRecords
{
    private ArrayList<Member> members;
    /**
     * Create  a ClubRecord class 
     */
    public ClubRecords()
    {
        members = new ArrayList<Member>();
    }

    /**
     * Add a member to the ClubRecords. A new Member object is created from the first name, surnamee and 
     * the year joined. Before adding the member to the list a unique ID is created.
     */
    public void enrolMember(String aFirstName, String aSurname, int aYear)
    {
        Member current = new Member(aFirstName,aSurname,aYear);
        current.setID(createID(aFirstName,aSurname));
        members.add(current);
        System.out.println(" Enrolled : " + current);
    }

    /**
     * Set the ID of this member. The ID joins the first three characters of the memeber's first name and the first two
     * characters of the member's surname.If the first name is less than 3 characters
     * or the surname is less than 2 characters the whole name is used. A number that equals
     * the number of members in the Club is then added to make the name unique.
     */
    private String createID(String firstName, String surname)
    {    
        String firstStr,surStr;
        
        if (firstName.length() < 3) firstStr = firstName;
        else firstStr = firstName.substring(0,3);
        if (surname.length() < 2) surStr = surname;
        else surStr = surname.substring(0,2);
        
        return firstStr + surStr + numberOfMembers();
    }    

    /**
     * Return the number of members currently enrolled in this Lab Class.
     */
    private int numberOfMembers()
    {
        return members.size();
    }    
    
    /**
     * Print out a full list of members. Add the number of members in the list. 
     */
    public void printList()
    {
        for (Member current : members) System.out.println(current);
        System.out.println(" Total Members: " + numberOfMembers());
    }
    
    /**
     * Use the ArrayList 'get' method to return the Member 
     * and print the details. Validate the index entered.
     * Print an error message
     * @param int the index number in the list
     * @return Member a member 
     */
    public Member findMemberByIndex(int anIndex)
    {
        Member aMember = null;
        if (anIndex >=0 && anIndex < numberOfMembers()) {
            aMember = members.get(anIndex);
            System.out.println(aMember);
        }
        else System.out.println(" Illegal Index!");
      
        return aMember;        
    }

    /**
     * Find a Member from the ID of the member. The ID's are unique so only one 
     * meber should be returned.The details will be printed. A message will be printed if not found
     * @param String a member ID
     * @return Member a member
     */
    public Member findMemberByID(String anID)
    {
        boolean found = false;
        for(Member aMember:members)
        {
            if(aMember.getID().equals(anID))
            {
                System.out.println(aMember); 
                return aMember;
            }
        }
        if(!found){
            System.out.println(" No member with this ID!");
        }
        return null;
    }

    
    /**
     * Remove a member from the list using the member ID to search.
     * First find the member then use the remove by object method of the ArryList
     * Print a message to confirm removal. You can use another method to find the member.
     * @param String a member ID
     */
    public void removeMember(String anID)
    {
        Member aMember = null; 
        aMember = findMemberByID(anID);
        if (aMember == null) System.out.println(" Remove Failed!");
        else {
            members.remove(aMember);
            System.out.println(" Removed!");
        }
    }

    
    
    
    
}
