
/**
 * Generates the random numbers, applies to the ticket and lotto arrays
 * Returns the arrays
 *
 * @author (Baxter Alexander)
 * @version (9.3.21)
 */
public class Generator
{
    // fields to create constants and arrays
    private final int MINIMUM = 1;
    private final int MAXIMUM = 40;
    private int randNum = 0;
    
    /**
     * Creates the lotto ticket
     */
    
    public Generator()
    {
        randCreate();
    }
      
    /**
     * Generates random numbers for the arrays
     */
    
    public void randCreate()
    {
        randNum = MINIMUM + (int) (Math.random() * MAXIMUM);
    }
    
    /**
     * Returns the random values
     */
    
    public int getRand()
    {
        return randNum;
    }
}