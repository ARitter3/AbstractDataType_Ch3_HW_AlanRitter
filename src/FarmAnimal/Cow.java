package FarmAnimal;

public class Cow extends FarmAnimal {
    private String sound = "Moo Moo";

    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }
    public Cow() {
        super("Otis", "Female", 1250, 20);
        //reference to "The Barnyard"
    }

    @Override
    public String toString() {
        return "FarmAnimal.Cow " + sound + super.toString();
    }

    @Override
    public String FeedLoadingSchedule() {
        return getName() + ": 6AM-4PM";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
