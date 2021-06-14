package lesson12;

public class Human {
    public String name;
    public boolean gender;
    public int age;
    public Human father;
    public Human mother;

    Human(String name, boolean gender, int age, Human father, Human mother){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
   /* public String getName() {
        return this.name;
    }
    public boolean getGender() {
        return this.gender;
    }
    public int getAge() {
        return this.age;
    }*/
/*    public String getFather() {
        return this.father;

    }*/

    public String toString() {
        String text = "";
        text += "Name: " + name;
        text += ", gender: "  + (this.gender ? "male" : "female");
        text += ", age: " + age;

        if (this.father != null)
            text += ", father: " + this.father.name;

        if (this.mother != null)
            text += ", mother: " + this.mother.name;
        return text;
    }
}
