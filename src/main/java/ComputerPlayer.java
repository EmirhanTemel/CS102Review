import java.util.ArrayList;

public class ComputerPlayer extends Player {
    private int number;
    private int lowerLimit = 1000;
    private int upperLimit = 9999;

    public int getNumber() {
        return number;
    }

    public ComputerPlayer (String name){
        this.name = name;
    }

    public void throwANumber(){
        number = (int)Math.floor(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
    }
    public String calculatePlusMinuses(int guessedNumber){
        int plusCount = 0;
        int minusCount = 0;
        int numberNxt = number;
        ArrayList<Integer> seperatedHumanGuess = new ArrayList<Integer>();
        ArrayList<Integer> seperatedComputerGuess = new ArrayList<Integer>();
        for (int i=0; i<4; i++){
            seperatedHumanGuess.add(guessedNumber%10);
            seperatedComputerGuess.add(numberNxt%10);
            guessedNumber = guessedNumber/10;
            numberNxt = numberNxt/10;
        }

        return "";
    }
}
