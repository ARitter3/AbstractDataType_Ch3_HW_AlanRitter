public class Duck extends FarmAnimal{
    private String sound = "Quack Quack";

    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }
    public Duck() {
        super("Howard", "Male", 8, 27);
    }

    @Override
    public String toString() {
        return "Duck " + sound + super.toString();
    }

    @Override
    public String FeedLoadingSchedule() {
        return getName() + ": 8AM-12PM-6PM";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
