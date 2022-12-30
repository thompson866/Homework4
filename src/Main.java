public class Main {
    public static void main(String[] args) {

        //Задача 1//


        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2//


        int temp = -5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " нужно надеть шапку");
        } else {
            System.out.println("На улице" + temp + " можно идти без шапки");
        }

        //Задача 3//

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        //Задача 4//
        int age1 = 10;
        boolean kinderGarden = age1 > 2 && age1 < 6;
        boolean school = age1 > 7 && age1 < 18;
        boolean university = age1 > 18 && age1 < 24;
        boolean work = age1 > 24;
        if (kinderGarden) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в детский сад");
        } else if (school) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в школу");
        } else if (university) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в университет");
        } else if (work) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить на работу");
        }

        //Задача 5//

        int age2 = 15;
        boolean no = age2 < 5;
        boolean withParent = age2 > 5 && age2 < 14;
        boolean go = age2 > 14;
        if (no) {
            System.out.println("Если возраст ребенка равен " + age2 + " он не может кататься на атракционе");
        } else if (withParent) {
            System.out.println("Если возраст ребенка равен " + age2 + " может кататься в сопровождении взрослого");
        } else if (go) {
            System.out.println("Если возраст ребенка равен " + age2 + " может кататься один");
        }

        //Задача 6//

        int peole = 55;

        int totalPlace = 102;
        int totalSeatPlace = 60;

        if (peole >= totalPlace) {
            System.out.println("Свободных мест нет");
        } else {
            if (peole >= totalSeatPlace) {
                System.out.println("Только стоячие места");
            } else {
                System.out.println("Есть сидячие места");
            }
        }


        //Задача 7//
        int one = 3;
        int two = 1;
        int three = 2;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }

        } else {
            if (two > three) {
                System.out.println(two);
            } else {
            System.out.println(three);
        }
    }


    }
}