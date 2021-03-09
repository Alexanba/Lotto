
/**
 * Write a description of class Strike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Creator
{
    // fields to create arrays
    private final int LIMIT = 6;
    Generator myTicket = new Generator();
    int[] lottoNum = new int[LIMIT];
    int[] ticketNum = new int[LIMIT];
    
    /**
     * Class that creates the ticket and assigns values
     */
    public void ticketCreate()
    {
     for ( int index = 0; index < LIMIT; index ++)
     {
         ticketNum[index] = myTicket.getRand();
         System.out.print(ticketNum);
     }
    }
}
