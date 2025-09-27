package InterfacePractice;

public class Airplane implements Flight, Movement{
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly() {
        System.out.println("I’m an airplane that relies on an engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I roll on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I can't jump");
    }

    @Override
    public String toString() {
        return "Airplane [Model: " + model + ", Year Built: " + yearBuilt + "]:";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
