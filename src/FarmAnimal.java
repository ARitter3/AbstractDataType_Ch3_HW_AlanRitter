public abstract class FarmAnimal {
    private String name;
    private String gender;
    //i realize i can just use int, i just figure why not mess with these
    //also they take less space (i know its arbitrarily small)
    private double weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    abstract String FeedLoadingSchedule();

    @Override
    public String toString() {
        return " [Name: " + name +
                ", Sex: " + gender +
                ", Weight (lbs): " + weight +
                ", Age: " + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
