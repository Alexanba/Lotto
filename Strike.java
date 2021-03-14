/**
 * Plays the game of strike and prints out the ticket
 * lotto bals and the results
 *
 * @author (Baxter Alexander)
 * @version (15.03)
 */
public class Strike
{
    // Create main method of Strike game
    /**
     * main class that runs the strike game 
     * @param args an argument for the main method
     */
    public static void main(String[] args)
    {
        Ticket myTicket = new Ticket();
        lottoDraw myLotto = new lottoDraw();
        final int LIMIT = 6;
        final int STRIKE = 4;
        int strikeScore = 0;
        int number = 1;
        int[] ticketNum = myTicket.getTicket(); 
        int[] lottoNum = myLotto.getLotto();
        String [] strikeResults = 
        {"Strike 1", "Strike 2", "Strike 3", "Strike 4"};
        System.out.println("This is the Lotto ticket you have drawn\n");
        for ( int index = 0; index < LIMIT; index++)
        { 
            System.out.println("Ticket number\t" + number + 
                "  is\t" + ticketNum[index]);
            number++;
        }
        System.out.println("And these are the days Lotto ball numbers\n");
        number = 1;
        for ( int index = 0; index < LIMIT; index++)
        { 
            System.out.println("Lotto number\t" + number + 
                 "  is\t" + lottoNum[index]);
            number++;
        }
        
        for ( int index = 0; index < STRIKE; index++)
        {
            if ( ticketNum[index] == lottoNum [index])
            {
                strikeScore++;
            }
        }
        if (strikeScore > 0)
        {
            System.out.println("Congratulations you won with " + 
                strikeResults[strikeScore - 1]);
        }
        else
        {
            System.out.println(
                "Unlucky! you unfortunately did not win any prizes");
        }
    }
}