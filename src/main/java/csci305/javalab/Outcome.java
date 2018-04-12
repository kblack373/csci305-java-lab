package csci305.javalab;

public class Outcome {
    private String beatState; //the statement of what beats what
    private String winloss;   //whether or not you win or lose



    public Outcome (String play1, String play2, String inVictor){

        String verb = null;
        String winner;
        String loser = null;
        winloss =  inVictor;

        if (winloss.equals("Win")){
            //Win, play1 goes first in String
            winner=play1;
            loser=play2;
        }
        else if (winloss.equals("Lose")) {
            //Lose, play2 goes first in String
            winner=play2;
        }
        else {
            //tie, play1 goes first in String
            beatState = play1 + " equals " + play2;
            return;
        }

        switch (winner) {
            case "Rock":
                verb = "crushes";
            case "Paper":
                if (loser.equals("Spock"))
                    verb = "disproves";
                else //Rock
                    verb = "covers";
                break;
            case "Scissors":
                if (loser.equals("Lizard"))
                    verb = "decapitates";
                else //Paper
                    verb = "cuts";
                break;
            case "Lizard":
                if (loser.equals("Spock"))
                    verb = "poisons";
                else //Paper
                    verb = "eats";
                break;
            case "Spock":
                if (loser.equals("Scissors"))
                    verb = "breaks";
                else //Rock
                    verb = "vaporizes";
                break;
        }

        beatState = winner + " " + verb + " " + loser;

        }


        public String lineUp () {

            return beatState + " -- " + winloss;
        }

}