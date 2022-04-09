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
 * Creates a game of nim that can be interacted with by a human or a computer
 */
public class Nim 
{
    /**
     * initializes the game of nim with 2 players, either human or computer
     * @param first the player to go first
     * @param second the player to go second
     * @param name1 name of first player
     * @param name2 name of second player
     * @return the winner
     */
    public String play(Player first, Player second, String name1, String name2)
    {
        String winner = "" ;
        int not = 0 ;
        int gameState = 0 ;
        Pile pile1 = new Pile() ;
        System.out.println("There are " +pile1.pileAmt()+
                " marbles in the pile");
        Scanner s = new Scanner(System.in) ;
        
        while (gameState == 0)
        {
            if(first instanceof Human)
            {
            System.out.println("How many marbles would you like to remove?");
            int taken = s.nextInt();
            int amtTaken = first.playerMove(taken, pile1) ;
            System.out.print(first.playerName(name1)) ;
            System.out.println(" took out "+amtTaken+" marbles") ;
            System.out.println("There are "+pile1.pileAmt()+
                    " marbles remaining");
                if(pile1.pileAmt() == 0)
                {
                    gameState = 1 ;
                    winner = "The winner is "+name1 ;
                }
            }
            
            else
            {
            int amtTaken = first.playerMove(not, pile1) ;
            System.out.print(first.playerName(name1)) ;
            System.out.println(" took out "+amtTaken+" marbles") ;
            System.out.println("There are "+pile1.pileAmt()+
                    " marbles remaining");
                if(pile1.pileAmt() == 0)
                    {
                        gameState = 1 ;
                        winner = "The winner is "+name1 ;
                    }
            }
            
            if(second instanceof Human)
            {
            System.out.println("How many marbles would you like to remove?");
            int taken = s.nextInt();
            int amtTaken = second.playerMove(taken, pile1) ;  
            System.out.print(second.playerName(name2)) ;
            System.out.println(" took out "+amtTaken+" marbles") ;
            System.out.println("There are "+pile1.pileAmt()+
                    " marbles remaining");
                if(pile1.pileAmt() == 0)
                {
                    gameState = 1 ;
                    winner = "The winner is "+name2 ;
                }
            }
            
            else
            {
            int amtTaken = second.playerMove(not, pile1) ;
            System.out.print(second.playerName(name2)) ;
            System.out.println(" took out "+amtTaken+" marbles") ;
            System.out.println("There are "+pile1.pileAmt()+
                    " marbles remaining");
                if(pile1.pileAmt() == 0)
                {
                    gameState = 1 ;
                    winner = "The winner is "+name2 ;
                }
            } 
        }
        return winner ;
    }
}
