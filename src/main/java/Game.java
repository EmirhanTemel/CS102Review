import java.util.Objects;

public class Game {
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    public Game(String humanPlayerName, String computerPlayerName){
        //Construct human player
        //Construct computer player
    }
    public boolean checkForEndOfTheGame(String computerOutput){
        return Objects.equals(computerOutput, "4+");
    }

    public void play(){
        //Throw a number for computer,
        //Loop,
        //Human guesses a number,
        //Print it to the screen,
        //Inform computer with the guess,
        //Check for the end of the game,
        //Print pluses and minuses to the screen
        //Endloop
        computerPlayer.throwANumber();
        while (true){
            int guessedNumber = humanPlayer.guessANumber();
            System.out.println("Your guess: " + guessedNumber);
            System.out.println(computerPlayer.calculatePlusMinuses(guessedNumber));
            if (checkForEndOfTheGame(computerPlayer.calculatePlusMinuses(guessedNumber))){
                break;
            }
        }
    }
}
