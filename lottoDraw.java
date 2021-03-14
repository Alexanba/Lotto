
/**
 * Draws the lotto balls that are compared to the ticket to decide the result
 *
 * @author (Baxter Alexander)
 * @version (15.03.21)
 */
public class lottoDraw
{
    // fields to create arrays   
    final int LIMIT = 6;
    boolean errorLotto = true;
    int index = 0;
    // Creates ticket object
    Generator myLotto = new Generator();
    int[] lottoNum = new int [LIMIT]; // Create arrays
    
    /**
     * Gives lotto class
     */
    public lottoDraw()
    {
        getLotto();
    }
    /**
     * Error checking for the lotto random numbers
     * @return the boolean showing if the number is valid or not
     * @param lottoCheck is the passed in value from array to check
     */
    public boolean checkLotto(int lottoCheck)
    {
        
        for (int checker = 0; checker < index; checker++)
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
     * @return the lotto values in array to be called as object
     */
    public int[] getLotto()
    {
        for ( index = 0; index < LIMIT; index++)
        { 
            myLotto.randCreate();
            lottoNum[index] = myLotto.getRand();
            boolean elCheck = checkLotto(lottoNum[index]);
            
            while (elCheck == false)
            {
                myLotto.randCreate();
                lottoNum[index] = myLotto.getRand();
                elCheck = checkLotto(lottoNum[index]);
            }
        }
        
        return lottoNum; 
    }
}
