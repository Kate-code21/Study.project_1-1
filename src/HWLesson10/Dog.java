package HWLesson10;

public class Dog{
    private String name;
    private int age;
    private String owner;

    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getOwner() {
        return this.owner;
    }
}