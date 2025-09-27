import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<FarmAnimal>();
        FarmAnimal donald = new Duck("Donald", "Male", 3.2, 5);
        farmAnimals.add(donald);
        FarmAnimal cheese = new Duck("Cheese", "Female", 3.6, 5);
        farmAnimals.add(cheese);
        FarmAnimal molly = new Cow("Molly", "Female", 1600, 3);
        farmAnimals.add(molly);
        FarmAnimal albert = new Chicken("Albert", "Male", 1.6, 2);
        farmAnimals.add(albert);
        FarmAnimal amelia = new Chicken("Amelia", "Female", 1.8, 4);
        farmAnimals.add(amelia);
        FarmAnimal dixie = new Chicken("Dixie", "Female", 1.7, 4);
        farmAnimals.add(dixie);

        for (FarmAnimal fa: farmAnimals) {
            System.out.println(fa);
        }
        for (FarmAnimal fa: farmAnimals) {
            System.out.println(fa.FeedLoadingSchedule());
        }
    }
}
