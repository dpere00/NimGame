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

/**
 * The class for the unbeatable smart computer
 * @author david
 */
public class SmartComputer implements Player 
{
    /**
     * @param numTaken the number to be removed from pile
     * @return number removed 
     */
    public int playerMove(int numTaken, Pile pile)
    {
        int counter = 0;
        if(pile.pileAmt() > 63)
        {
            counter = 0;
            while(pile.pileAmt() > 63)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 31)
        {
            counter = 0;
            while(pile.pileAmt() > 31)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 15)
        {
            counter = 0;
            while(pile.pileAmt() > 15)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 7)
        {
            counter = 0;
            while(pile.pileAmt() > 7)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 3)
        {
            counter = 0;
            while(pile.pileAmt() > 3)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 3)
        {
            counter = 0;
            while(pile.pileAmt() > 3)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() > 3)
        {
            counter = 0;
            while(pile.pileAmt() > 3)
            {
                pile.pileRemove(1);
                counter++;
            }
        }
        else if(pile.pileAmt() >= 1)
        {
                counter = 0;
                pile.pileRemove(1);
                counter++;
        }
        else if(pile.pileAmt() == 0)
        {
                
        }
        return counter;
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
