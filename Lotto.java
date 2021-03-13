
/**
 * Write a description of class Lotto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lotto
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
    public Lotto()
    {
        getLotto();
    }
    
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
     */
    public int[] getLotto()
    {
        for ( index = 0; index < LIMIT; index ++)
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
