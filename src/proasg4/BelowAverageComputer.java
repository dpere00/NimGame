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
 * Less intelligent computer, removes a random amount of marbles from pile
 */
public class BelowAverageComputer implements Player 
{
    /**
     * @param numTaken the number to be removed from pile
     * @return number removed 
     */
    public int playerMove(int numTaken, Pile pile)
    {
        int compMove = 0;
        Random r = new Random() ; 
        int halfPile = pile.pileAmt() / 2 ;
       
        if(halfPile == 1 || pile.pileAmt() == 1)
        {
            compMove = 1 ;
            pile.pileRemove(1);
        }
       
        else if(halfPile > 1)
        {
            compMove = r.nextInt(halfPile - 1) + 1 ;
            pile.pileRemove(compMove) ;
        }
       
        return compMove ;
    }
    
    /**
     * @param name name given by user
     * @return name
     */
    public String playerName(String name)
    {
        String playersName = name ;
        return playersName ;
    }
}
