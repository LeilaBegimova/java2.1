package workA;

import workA.Color;

public abstract class Pet {
    protected int age;

    protected Color color ;

    protected Sheltr sheltr;

    private int generateDefaultAge(){
        return age = 25;
    }

    public final String getInfo(){
        return " age:" + getAge() + " color:" + getColor() + " sheltr:" + getSheltr();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Sheltr getSheltr() {
        return sheltr;
    }

    public void setSheltr(Sheltr sheltr) {
        this.sheltr = sheltr;
    }
}
