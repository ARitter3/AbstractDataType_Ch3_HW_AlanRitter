package InterfacePractice;

public class ThingsThatFly {
    public static void main(String[] args) {
        Movement air = new Airplane("Boeing 747", 2016);
        Movement eagly = new Bird("Eagle");
        Movement hum = new Bird("Hummingbird");
        Movement[] canMove = {air, eagly, hum};
        for (Movement m:canMove) {
            System.out.print(m);
            m.fly();
        }
        System.out.println();
        for (Movement m:canMove) {
            System.out.println(m);
            m.fly();
            m.walk();
            m.jump();
        }
    }
}
