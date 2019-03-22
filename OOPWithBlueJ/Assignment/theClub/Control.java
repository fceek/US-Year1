
/**
 * Write a description of class Control here.
 * 
 * @author (yourname) 
 * @version (a version number or a date)
 */
public class Control
{

    private ClubRecords cr = new ClubRecords();

    public Control()
    {    
        System.out.println(" ");
        System.out.println("********Enrol 5 students*********");
        cr.enrolMember("Wayne","Fu", 2016); 
        cr.enrolMember("Lester","L", 2017); 
        cr.enrolMember("Chen","Fan", 2017); 
        cr.enrolMember("Bruce","Wayne", 2019); 
        cr.enrolMember("La","Luthur", 2018); 

        System.out.println(" ");
        System.out.println("********Print the list of 5 students*********");
        cr.printList();

        System.out.println(" ");
        System.out.println("********Find Member by list index *******");
        cr.findMemberByIndex(1);
        cr.findMemberByIndex(6);
        cr.findMemberByIndex(3);
        cr.findMemberByIndex(-1);
        cr.findMemberByIndex(5);

        System.out.println(" ");
        System.out.println("*********Find Member by ID***********");
        cr.findMemberByID("WayFu0");
        cr.findMemberByID("notLaLu4");
        cr.findMemberByID("LesL1");
        cr.findMemberByID("");
        cr.findMemberByID("CheFa2");
        
        System.out.println(" ");
        System.out.println("********Remove by ID********************");
        cr.removeMember("WayFu0");
        cr.printList();
        cr.removeMember("Lalu4");
        cr.printList();
        cr.removeMember("BruWa3");
        cr.printList();
       
    }        
}
