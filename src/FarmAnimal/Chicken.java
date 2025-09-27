package FarmAnimal;

public class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        if (gender.equals("Male")) {
            sound = "Cock-a-doodle-doo";
        } else {
            sound = "Cluck Cluck";
        }
    }
    public Chicken() {
        super("Foghorn Leghorn", "Male", 12.5, 27);
        sound = "Cock-a-doodle-doo";
    }

    @Override
    public String toString() {
        return "FarmAnimal.Chicken " + sound + super.toString();
    }

    @Override
    public String FeedLoadingSchedule() {
        return getName() + ": 8AM-4PM";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
