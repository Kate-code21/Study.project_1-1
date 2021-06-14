package HWLesson10;

public class Robot {
    private String name;
    private int age;
    private int power;


    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;

    }
        public Robot(String name, int age) {
            this.name = name;
            this.age = age;
        }

    /*public String getName() {
        return this.name;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int getPower() {
        return power;
    }
*/
    public boolean fight(Robot anotherRobot) {
        if (this.power > anotherRobot.power) {
            return true;
        } else {
            return false;
        }
    }
}






