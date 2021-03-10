
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
    
    /**
     * Gives ticket class
     */
    public Ticket()
    {
        getTicket();
    }
    
    /**
     * Checks if there is a duplicate number in arrays
     */
    public boolean check()
    {
       for (int checker = 0; checker < LIMIT; checker++)
       {
          if ( ticketNum[checker] == myTicket.getRand())
          {
              return false;
            }
          else if ( ticketNum[checker] != myTicket.getRand())
          {
              return true;
            }
          else if ( lottoNum[checker] != myLotto.getRand())
          {
             return true; 
            }
          else if ( lottoNum[checker] == myLotto.getRand())
          {
             return false;
            }
        }
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
            for (int check = 0; check < LIMIT; check++)
            {
               while(lottoNum[index] == lottoNum[check])
               {
                   myLotto.randCreate();
                   lottoNum[index] = myLotto.getRand();
               }
            }
        }
        
        return lottoNum; 
    }
    
    public int[] getTicket()
    {
        for ( int index = 0; index < LIMIT; index ++)
        {
            myTicket.randCreate();
            ticketNum[index] = myTicket.getRand();
            for (int check = 0; check < LIMIT; check++)
            {
               while(ticketNum[index] == ticketNum[check])
               {
                   myTicket.randCreate();
                   ticketNum[index] = myTicket.getRand();
               }
            }
        }
        return ticketNum;
    }
}