package csci305.javalab;


public abstract class Element {
    //instance variables
    protected String name;
    protected Outcome outcome;

    //constructor, name is only parameter
    public Element(String inName) {

        name = inName;
    }

    //getter method
    public String getName() {
        return name;
    }

    public abstract String compareTo (Element play);

}

class Rock extends Element {

    public Rock(String inName) {

        super(inName);
    }

    @Override
    public String compareTo(Element play){
        String winloss = null;
        switch (play.getName()) {
            case "Rock":
                //Tie
                winloss = "Tie";
                break;
            case "Paper":
                //Lose
                winloss = "Lose";
                break;
            case "Scissors":
                //Win
                winloss = "Win";
                break;
            case "Lizard":
                //Win
                winloss = "Win";
                break;
            case "Spock":
                //Lose
                winloss = "Lose";
                break;
            }

        outcome = new Outcome (name, play.getName(), winloss);
        return outcome.lineUp();
        }

    }


class Paper extends Element {

    public Paper(String inName) {
        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        String winloss = null;
        switch (play.getName()) {
            case "Rock":
                //Win
                winloss = "Win";
                break;
            case "Paper":
                //Tie
                winloss ="Tie";
                break;
            case "Scissors":
                //Lose
                winloss = "Lose";
                break;
            case "Lizard":
                //Lose
                winloss = "Lose";
                break;
            case "Spock":
                //Win
                winloss = "Win";
                break;
        }
        outcome = new Outcome (name, play.getName(), winloss);
        return outcome.lineUp();
    }
}

class Scissors extends Element {

    public Scissors(String inName) {

        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        String winloss = null;
        switch (play.getName()) {
            case "Rock":
                //Lose
                winloss = "Lose";
                break;
            case "Paper":
                //Win
                winloss = "Win";
                break;
            case "Scissors":
                //Tie
                winloss = "Tie";
                break;
            case "Lizard":
                //Win
                winloss = "Win";
                break;
            case "Spock":
                //Lose
                winloss = "Lose";
                break;
        }
        outcome = new Outcome (name, play.getName(), winloss);
        return outcome.lineUp();
    }
}

class Lizard extends Element {

    public Lizard(String inName) {

        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        String winloss = null;
        switch (play.getName()) {
            case "Rock":
                //Lose
                winloss = "Lose";
                break;
            case "Paper":
                //Win
                winloss = "Win";
                break;
            case "Scissors":
                //Lose
                winloss = "Lose";
                break;
            case "Lizard":
                //Tie
                winloss = "Tie";
                break;
            case "Spock":
                //Win
                winloss = "Win";
                break;
        }
        outcome = new Outcome (name, play.getName(), winloss);
        return outcome.lineUp();
    }
}

class Spock extends Element {

    public Spock(String inName) {

        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        String winloss = null;
        switch (play.getName()) {
            case "Rock":
                //Win
                winloss = "Win";
                break;
            case "Paper":
                //Lose
                winloss = "Lose";
                break;
            case "Scissors":
                //Win
                winloss = "Win";
                break;
            case "Lizard":
                //Lose
                winloss = "Lose";
                break;
            case "Spock":
                //Tie
                winloss = "Tie";
                break;
        }
        outcome = new Outcome (name, play.getName(), winloss);
        return outcome.lineUp();
    }
}

