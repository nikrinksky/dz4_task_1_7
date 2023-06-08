public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст равен " + age + ", то он не достиг совершеннолетний, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университете.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }


    }

    public static void task6() {
        System.out.println("Задача 6");
        int seatsOccupied = 59;
        int totalSeats = 102;
        int seats = 60;
        int standing = totalSeats - seats;
        int seatsRemained = 0;
        int standingRemained = 0;

        if (seatsOccupied <= seats) {
            seatsRemained = seats - seatsOccupied;
            if (seatsRemained != 0) {
                System.out.println("В вагоне есть ещё сидячие места " + seatsRemained + " и стоячих " + standing);
            } else System.out.println("В вагоне есть только стоячие места их " + standing);
        }
        if (seatsOccupied > seats && seatsOccupied < totalSeats) {
            standingRemained = totalSeats - seatsOccupied;
            System.out.println("В вагоне есть только стоячие места их " + standingRemained);
        } else if (seatsOccupied >= totalSeats) {
            System.out.println("Вагон уже полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 15;
        int two = 13;
        int three = 15;
        if (one >= two && one >= three) {
            System.out.println(one + " самое большое число");
        } else if (two >= one && two >= three) {
            System.out.println(two + " самое большое число");
        } else System.out.println(three + " самое большое число");
    }

}