import java.util.Scanner;

public class HumanPlayer extends Player{

    Scanner guess = new Scanner(System.in);

    public HumanPlayer(String name){
        this.name = name;
    }
    public int guessANumber(){
        return guess.nextInt();
    }
}
