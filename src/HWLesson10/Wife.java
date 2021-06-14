package HWLesson10;

public class Wife {
    private String name;
    private int age;
    private String husband;

    public Wife(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
        public String getHusband() {
            return this.husband;
        }
        public void setHusband(String husband) {
        this.husband = husband;

    }
}

