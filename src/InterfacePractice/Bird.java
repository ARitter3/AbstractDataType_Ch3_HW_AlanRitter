package InterfacePractice;

public class Bird implements Flight, Movement{
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump with my feet.");
    }

    @Override
    public String toString() {
        return "Bird [Type: " + type + "]:";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
