package lesson12;

public class Test1 {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Anatoli", true, 67);
        Human grandPa2 = new Human("Oleg", true, 62);

        Human grandMa1 = new Human("Rita", false, 66);
        Human grandMa2 = new Human("Natalia", false, 59);

        Human father = new Human("Ilia", true, 35, grandPa2, grandMa2);
        Human mother = new Human("Kate", false, 35, grandPa1, grandMa1);

        Human son = new Human("Makar", true, 7, father, mother);
        Human daughter = new Human("Maya", false, 0, father, mother);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);

    }
}
