package csci305.javalab;

public class Element {
    //instance variables
    protected String name;

    //constructor, name is only parameter
    public Element(String inName) {
        name = inName;
    }

    //getter method
    public String getName() {
        return name;
    }

    //public abstract String compareTo (Element play);

}

public class Rock extends Element {

    public Rock(String inName) {
        super(inName);
    }

}

public class Paper extends Element {

    public Paper(String inName) {
        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        return null;
    }
}

public class Scissors extends Element {

    public Scissors(String inName) {
        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        return null;
    }
}

public class Lizard extends Element {

    public Lizard(String inName) {
        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        return null;
    }
}

public class Spock extends Element {

    public Spock(String inName) {
        super(inName);
    }

    @Override
    public String compareTo(Element play) {
        return null;
    }
}

