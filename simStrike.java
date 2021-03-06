
/**
 * Simulates the strike game until strike 4 is won
 *
 * @author (Baxter Alexander)
 * @version (15.03.21)
 */
public class simStrike
{
    /**
     * Main method that runs strike until the strike four is won
     * counts how many iterations and results to print at end
     * @param args for argument of main method
     */
    public static void main(String[] args)
    {
        final int LOOP = 1000000;
        int loss = 0;
        int strike1 = 0;
        int strike2 = 0;
        int strike3 = 0;
        int strike4 = 0;
        int runs = 0;
        while (strike4 == 0)//int sim =0; sim < LOOP; sim++)
        {
            runs++;
            Ticket myTicket = new Ticket();
            lottoDraw myLotto = new lottoDraw();
            final int STRIKE = 4;
            int strikeScore = 0;
            int[] ticketNum = myTicket.getTicket(); 
            int[] lottoNum = myLotto.getLotto();
            for ( int index = 0; index < STRIKE; index++)
            {
                if ( ticketNum[index] == lottoNum [index])
                {
                    strikeScore++;
                }
            }
            if (strikeScore == 0)
            {
                loss++;
            }
            else if (strikeScore == 1)
            {
                strike1++;
            }
            else if (strikeScore == 2)
            {
                strike2++;
            }
            else if (strikeScore == 3)
            {
                strike3++;
            }
            else if (strikeScore == 4)
            {
                strike4++;
            }
        }
        System.out.println("Over the " + runs + 
            " times that strike was simulated you\nLost " + loss + 
            " times \nGot Strike 1 " + strike1 + "times\nGot Strike 2 " 
            + strike2 + "times\nGot Strike 3 " + strike3 + 
            "times\nAnd Strike 4 " + strike4 + "times");
    }
}
