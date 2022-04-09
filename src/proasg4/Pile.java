/** 
 * File name: ProAsg4
 * David Perez
 * I.D. 6116495
 * Section U04
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person.
 * David Perez
 */
package proasg4;
import java.util.Random ;

/**
 * Maintains the pile, can tell the user how many marbles are left and can 
 * remove marbles
 */
public class Pile 
{
    int pileNum ;
    /**
     * Creates a new pile of a random size between 10 - 100
     */
    public Pile() 
    {
    Random r = new Random() ;

    pileNum = r.nextInt(91) + 10 ;
    }
    /**
     * Removes a given amount of marbles from pile
     * @param numTaken 
     */
    public void pileRemove(int numTaken)
    {
        pileNum = pileNum - numTaken ;
    }
    /**
     * The amount of marbles remaining
     * @return remaining marbles
     */
    public int pileAmt()
    {
        return pileNum ;
    }
                  
}
