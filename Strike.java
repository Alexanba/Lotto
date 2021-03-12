/**
 * Write a description of class Spike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Strike
{
    // Create main method of Strike game
    public static void main(String[] args)
    {
        Ticket myTicket = new Ticket();
        Ticket myLotto = new Ticket();
        final int LIMIT = 6;
        int[] ticketNum = myTicket.getTicket();
            
        int[] lottoNum = myLotto.getLotto();
        for( int index = 0; index < LIMIT; index ++)
           { 
               System.out.println("Ticket number\t" + index + "  is\t" + ticketNum[index]);
            }
        for( int index = 0; index < LIMIT; index ++)
           { 
               System.out.println("Lotto number\t" + index + "  is\t" + lottoNum[index]);
            }
        
    }
}