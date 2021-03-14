
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
    int index = 0;
    boolean errorTicket = true; 
    Generator myTicket = new Generator(); // Creates ticket object
     // Create arrays
    int[] ticketNum = new int [LIMIT];
    
    /**
     * Gives ticket class
     */
    public Ticket()
    {
        getTicket();
    }
    
    /**
     * Checks if there is a duplicate number in arrays
     * @return returns the boolean value from the check method
     * @param ticketCheck is the passed in value for the ticket number array
     */
    public boolean checkTicket(int ticketCheck)
    {
        for (int checker = 0; checker < index; checker++)
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
    /**
     * Creates the ticekt array
     * @return the array to be called as an object
     */
    public int[] getTicket()
    {
        for ( index = 0; index < LIMIT; index++)
        {
            myTicket.randCreate();
            ticketNum[index] = myTicket.getRand();
            boolean etCheck = checkTicket(ticketNum[index]);
            while (etCheck == false)
            {
                myTicket.randCreate();
                ticketNum[index] = myTicket.getRand();
                etCheck = checkTicket(ticketNum[index]);
            }
        }
        return ticketNum;
    }
}