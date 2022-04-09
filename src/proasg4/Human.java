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
import java.util.Scanner;

/**
 * The human that interacts directly with the game
 */
public class Human implements Player 
{

    /**
     * @param numTaken the number to be removed from pile
     * @return number removed 
     */
    public int playerMove(int numTaken, Pile pile)
    {
        int halfPile = pile.pileAmt() / 2;
        int taken = numTaken ;
        
        if(taken <= halfPile)
        {
        pile.pileRemove(taken) ;
        }
        
        else
        {
            System.out.println("Please input an appropriate amount to remove");
        }
        return taken;
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
