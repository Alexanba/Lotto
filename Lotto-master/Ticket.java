import java.util.Arrays;  
/**
 * Creates the tickets and lotto objects with their values assigned
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // fields to create arrays   
    final int LIMIT = 6;
    Generator myTicket = new Generator(); // Creates ticket object
    Generator myLotto = new Generator();
    int[] lottoNum = new int[LIMIT]; // Create arrays
    int[] ticketNum = new int[LIMIT];
    int ticketTest = 0;
    
    /**
     * Gives ticket class
     */
    public Ticket()
    {
        getTicket();
    }
    
    /**
     * Class that returns the arrays
     */
    public int[] getLotto()
    {
        for ( int index = 0; index < LIMIT; index ++)
        { 
            myLotto.randCreate();
            lottoNum[index] = myLotto.getRand();
            //while (lottoNum[index] == lottoNum[index])
            //{
             //   lottoNum[index] = myLotto.getRand();
            //}
            
        }
        
        return lottoNum; 
    }
    
    public int[] getTicket()
    {
        for ( int index = 0; index < LIMIT; index ++)
        {
            myTicket.randCreate();
            ticketNum[index] = myTicket.getRand();
            //while (ticketNum[index] == ticketNum[index])
            //{
             //   ticketNum[index] = myTicket.getRand();
            //}
        }
        return ticketNum;
    }
}
