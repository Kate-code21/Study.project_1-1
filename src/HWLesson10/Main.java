package HWLesson10;

public class Main {
    public static void main(String[] args) {
        /*Robot robot1 = new Robot("Vektor", 2, 60);
        Robot robot2 = new Robot("Dark", 3, 55);
        System.out.println(robot1.fight(robot2));*/

        /*Woman woman1 = new Woman("Kate", 35);
        Cat cat1 = new Cat("Rexi", 3, woman1.getName());
        Dog dog1 = new Dog("Bobby", 5, woman1.getName());
        Fish fish1 = new Fish("Parsi", 1, woman1.getName());

        System.out.println(cat1.getName() + ", " + cat1.getAge() + ", " + cat1.getOwner());
        System.out.println(dog1.getName() + ", " + dog1.getAge() + ", " + dog1.getOwner());
        System.out.println(fish1.getName() + ", " + fish1.getAge() + ", " + fish1.getOwner());

        woman1.setName("Rita");

        System.out.println(cat1.getName() + ", " + cat1.getAge() + ", " + cat1.getOwner());
        System.out.println(dog1.getName() + ", " + dog1.getAge() + ", " + dog1.getOwner());
        System.out.println(fish1.getName() + ", " + fish1.getAge() + ", " + fish1.getOwner());
*/
        Wife wife = new Wife("Kate", 35, "Ilya");
        Man man = new Man("Ilya", 35, "Kate");
        /*Man.woman = Wife;
        Wife.husband = Man;*/
    }


}


