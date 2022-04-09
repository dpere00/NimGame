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
 *Describes a class of human or computer to play nim
 */
public interface Player 
{
    /**
     * Removes marbles from the pile
     * @param numTaken the amount to be taken, only necessary for human
     * @param pile the current pile amount for the current game of nim
     * @return number of marbles taken
     */
    int playerMove(int numTaken, Pile pile);
    
    /**
     * The human or computer's name
     * @return player's name
     */
    String playerName(String name) ;
}
