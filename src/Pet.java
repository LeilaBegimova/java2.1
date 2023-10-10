public  abstract class Pet {
    private  int age;
    private   Color color;
    private  Sheltr sheltr;
    private int generateDefaultAge(){
        age = 20;
        return age;
    }

    public final String getInfo(){
        return " age:" + getAge() + " color:" + getColor() + " sheltr:" + getSheltr().getName();
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
