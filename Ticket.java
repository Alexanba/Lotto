
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
    boolean errorTicket = true; 
    boolean errorLotto = true;
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
    public boolean checkTicket(int ticketCheck)
    {
        
       for (int checker = 0; checker < LIMIT; checker++)
       {
          if ( ticketNum[checker] == ticketCheck)
          {
              errorTicket = false;
              break;
            }
          else if ( ticketNum[checker] != ticketCheck)
          {
              errorTicket = true;
            }
        }
       return errorTicket;
    }
    public boolean checkLotto(int lottoCheck)
    {
        
       for (int checker = 0; checker < LIMIT; checker++)
       {
          if ( lottoNum[checker] != lottoCheck)
          {
             errorLotto = true; 
            }
          else if ( lottoNum[checker] == lottoCheck)
          {
             errorLotto = false;
             break;
            }
        }
       return errorLotto;
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
            errorLotto = checkLotto(lottoNum[index]);
            
            if (errorLotto == false)
            {
                   myLotto.randCreate();
                   lottoNum[index] = myLotto.getRand();
                   errorLotto = checkLotto(lottoNum[index]);
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
            errorTicket = checkTicket(ticketNum[index]);
            if (errorTicket == false)
            {
                   myTicket.randCreate();
                   ticketNum[index] = myTicket.getRand();
                   errorTicket = checkTicket(ticketNum[index]);
            }
        }
        return ticketNum;
    }
}