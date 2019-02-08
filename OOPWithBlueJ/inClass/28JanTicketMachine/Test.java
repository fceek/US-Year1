
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    private TicketMachine ticketma;
    
    
    public Test()
    {
        ticketma = new TicketMachine(158);
        ticketma.insertMoney(999);
        ticketma.printTicket();
        ticketma.refundBalance();
    }

    
}
