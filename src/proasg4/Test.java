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
 * A test of the game of Nim
 */
public class Test {

    public static void main(String[] args) 
    {
        Player firstPlayer = null;
        Player secondPlayer = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the type of player that will go first "+
                "(Human, SmartComputer, or BelowAverageComputer)");
        String player1 = s.nextLine() ;
        
        if(player1.compareTo("Human") == 0)
        {
            firstPlayer = new Human() ;
        }
        else if(player1.compareTo("BelowAverageComputer") == 0)
        {
            firstPlayer = new BelowAverageComputer() ;
        }
        else if(player1.compareTo("SmartComputer") == 0)
        {
            firstPlayer = new SmartComputer () ;
        }
        
        System.out.println("What will be player one's name?") ;
        String name1 = s.nextLine() ;
        
        System.out.println("Enter the type of player that will go second "+
                "(Human, SmartComputer, or BelowAverageComputer)");
        String player2 = s.nextLine() ;
        
        if(player2.compareTo("Human") == 0)
        {
            secondPlayer = new Human() ;
        }
        else if(player2.compareTo("BelowAverageComputer") == 0)
        {
            secondPlayer = new BelowAverageComputer() ;
        }
        else if(player2.compareTo("SmartComputer") == 0)
        {
            secondPlayer = new SmartComputer () ;
        }
        
        System.out.println("What will be player two's name?") ;
        String name2 = s.nextLine() ;
        
        Nim newGame = new Nim() ;
        String winner = newGame.play(firstPlayer, secondPlayer, name1, name2) ;
        System.out.print(winner);
    }
    
}
