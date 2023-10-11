package workA;

public class Main {

    public static void main(String[] args) {
        Sheltr sheltr = new Sheltr("Shok", "Ass");
        Dog dog = new Dog(" Bobik", " Beagle", "sit");
        Dog dog1 = new Dog("Sharik", " BassetHouhd", Color.BLACK, sheltr);
        Dog dog2 = new Dog("Alpha", "Basenji", Color.WHATE, sheltr, "voice");

        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        dog.makeVoice("gaf", 1);
        dog1.makeVoice("gaff", 2);
        dog2.makeVoice(4, "gaf");
    }
}

