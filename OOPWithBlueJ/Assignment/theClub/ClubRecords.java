import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ClubRecords
{
    private ArrayList<Member> members;
    private boolean updated;
    private File record;
  
    public ClubRecords(String fileName)
    {
        members = new ArrayList<Member>();
        record = new File(fileName);
        try {
            readRecord();
        } catch (IOException e) {
            //do nothing
        }
        updated = false;
    }

    private void readRecord() throws IOException {
        if (!record.createNewFile()) {
            BufferedReader br = new BufferedReader(new FileReader(record));
            String currentRec = null;
            while ((currentRec = br.readLine()) != null) {
                String _firstName, _surname, _year, _ID;
                currentRec = currentRec.substring(7);
                _firstName = currentRec.substring(0,currentRec.indexOf(" "));
                
                currentRec = currentRec.substring(currentRec.indexOf(" ")+1);
                _surname = currentRec.substring(0,currentRec.indexOf(" "));
                
                currentRec = currentRec.substring(currentRec.indexOf(" ") + 17);
                _year = currentRec.substring(0,currentRec.indexOf(" "));
                
                currentRec = currentRec.substring(currentRec.indexOf(" ") + 7);
                _ID = currentRec;
                
                enrolMember(_firstName,_surname,Integer.parseInt(_year),_ID);
            } 
            
            updated = true;
        }
    }
    
    public void saveRecord(){
        try {
            if (updated) {
                File backUp = new File(record.getName() + ".bak");
                record.renameTo(backUp);
                record.delete();
                record.createNewFile();
                FileWriter fw = new FileWriter(record);
                for (Member thisHuman : members) fw.write(thisHuman.toString() + "\n");
                fw.flush();
            }
        }
        catch (IOException e) {
            System.out.println("IOE");
        }
    }
    
    private void enrolMember(String aFirstName, String aSurname, int aYear, String aID) {
        Member current = new Member(aFirstName,aSurname,aYear);
        current.setID(aID);
        members.add(current);
        System.out.println(" Enrolled : " + current);
        
        updated = true;
    }
    
    public void enrolMember(String aFirstName, String aSurname, int aYear)
    {
        if (aFirstName == "" || aSurname == "") System.out.println(" No Empty Names! ");
        else
        {
            Member current = new Member(aFirstName,aSurname,aYear);
            current.setID(createID(aFirstName,aSurname));
            members.add(current);
            System.out.println(" Enrolled : " + current);
        
            updated = true;
        }
    }

    private String createID(String firstName, String surname)
    {    
        String firstStr,surStr;
        
        if (firstName.length() < 3) firstStr = firstName;
        else firstStr = firstName.substring(0,3);
        if (surname.length() < 2) surStr = surname;
        else surStr = surname.substring(0,2);
        
        return firstStr + surStr + numberOfMembers();
    }    

    private int numberOfMembers()
    {
        return members.size();
    }    
    
    public void printList()
    {
        for (Member current : members) System.out.println(current);
        System.out.println(" Total Members: " + numberOfMembers());
    }
    
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

    public void removeMember(String anID)
    {
        Member aMember = null; 
        aMember = findMemberByID(anID);
        if (aMember == null) System.out.println(" Remove Failed!");
        else {
            members.remove(aMember);
            System.out.println(" Removed!");
        }
        
        updated = true;
    }
}
