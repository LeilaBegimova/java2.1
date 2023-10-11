package workA;

import workA.Color;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public Dog(String name, String breed, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Sheltr sheltr) {
        this.name = name;
        this.breed = breed;
        setColor(color);
        setSheltr(sheltr);
    }

    public Dog(String name, String breed, Color color, Sheltr sheltr, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        setColor(color);
        setSheltr(sheltr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }


    public void setCommands(String commands) {
        this.commands = commands;
    }

    void makeVoice(String voice, int number) {
        System.out.println(voice);
    }

    void makeVoice(int number, String voice) {
        System.out.println(voice);

    }

 //   @Override
   // public String getInfo() {
     //   return super.getInfo() + name + " name " + breed + " breed " + commands + "  commands";
    //}

}
