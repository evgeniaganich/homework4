public class Main {
    public static void main(String[] args) {
        //task 1

        int age = 60;
        if (age >= 18) {System.out.println("Поздравляем с совершеннолетием!");}
        if (age < 18) {System.out.println("Возраст соврешеннолетия еще не наступил, нужно немного подождать.");}

        //task 2

        if (age >= 7) {System.out.println("Ребенок ходит в школу.");}
        if (age >= 18) {System.out.println("Человек закончил школу и может отправляться в университет.");}
        if (age >= 24) {System.out.println("Человек окончил университет, пора искать первую работу.");}

        //task 3

        int capacity = 102;
        int seats = 60;
        int numberOfPassengers = 60;
        if (numberOfPassengers <= 60) {System.out.println("В вагоне есть сидячие места.");}
        if (numberOfPassengers > 60 && numberOfPassengers <= 102) {System.out.println("В вагоне есть стоячие места.");}
            if (numberOfPassengers > 102) {System.out.println("Вагон забит.");}

        //task 4

        if (age >= 18) {System.out.println("Поздравляем с совершеннолетием!");
        } else {
        System.out.println("Возраст соврешеннолетия еще не наступил, нужно немного подождать.");}

        //task 5

        if (age >= 18 && age < 24) {System.out.println("Человек закончил школу и может отправляться в университет.");}
        if (age >= 7 && age < 18) {System.out.println("Ребенок ходит в школу.");}
        else {System.out.println("Человек окончил университет, пора искать первую работу.");}

        //task 6

        int trainCapacity = 102;
        int numberOfSeats = 60;
        int passengers = 35;
        if (passengers > 60 && passengers <= 102) {System.out.println("В вагоне есть стоячие места.");}
        if (passengers <= 60) {System.out.println("В вагоне есть сидячие места.");}
        else {System.out.println("Вагон забит.");}

        // task 7

        if (age >= 2 && age <= 6) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");}
        if (age >= 7 && age <= 18) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");}
        if (age > 18 && age <= 24) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");}
        else if (age > 24) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");}


        //task 8

        if (age < 5) {System.out.println("Ребенок не может кататься на аттракционе.");}
        if (age >=5 && age < 14) {System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого.");}
        else {System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого.");}

        //task 9

        int one = 28;
        int two = 30;
        int three = 48;
        if (one > two && one > three) {System.out.println(one);}
        else if (three > two && three > one) {System.out.println(three);}
        else {System.out.println(two);}

        }

}