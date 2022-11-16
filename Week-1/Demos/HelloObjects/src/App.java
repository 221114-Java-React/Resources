public class App {
    public static void main(String[] args) throws Exception {
        String name = "Rover";
        Cat auryn = new Cat();
        auryn.setName(name);
        Cat anotherAuryn = new Cat();
        anotherAuryn.setName(name);

        System.out.println(auryn == anotherAuryn);
        System.out.println(auryn.hashCode() == anotherAuryn.hashCode());
        System.out.println(auryn.equals(anotherAuryn));
    }
}
