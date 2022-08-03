import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte car = 5;
        short cat = 15;
        int dog = 157;
        long brash = 1578L;
        float appleWeight = 15.7f;
        double carWeight = 17555.555;
        char c = 35;
        boolean catisAdult = cat > 9;

        System.out.println(catisAdult);

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightsum = boxer1 + boxer2;
        System.out.println("Вес двух боксеров соствавит " + weightsum + "кг");
        double weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе сосавит " + weightDifference + "кг");

        //Задание 3
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;
        int weightproducts = bananas * 80 + milk / 100 * 105 + iceCream * 100 + egg *70;
        System.out.println("Вес продуктов составил " + weightproducts + "гр");
        float inKg = weightproducts / 1000f;
        System.out.println("Вес в килограммах составляет " + inKg + "кг");

        //Задание 4
        int slimDown = 7;
        int slimEvryday1 = slimDown * 1000 / 250;
        int slimEvryday2 = slimDown * 1000 / 500;
        System.out.println("Если терять в день по 250 гр., то спортсмен похудеет за " + slimEvryday1 + " дней");
        System.out.println("Если терять в день по 500 гр, то спортсмен похудеет за " + slimEvryday2 + " дней");
        int averageValueOfDays = (slimEvryday1 + slimEvryday2)/2;
        System.out.println("В среднем похудеет за " + averageValueOfDays + " день/дней");

        //Задание 5
        float zpMasha = 67760f;
        float zpDenis = 83690f;
        float zpKristina = 76230f;

        float indexationZpMasha = zpMasha + zpMasha * 0.1f;
        float indexationZpDenis = zpDenis + zpDenis * 0.1f;
        float indexationZpKristina = zpKristina + zpKristina * 0.1f;

        System.out.println("Зарплата после повышения у Маши составит " + indexationZpMasha + " р.");
        System.out.println("Зарплата после повышения у Дениса составит " + indexationZpDenis + " р.");
        System.out.println("Зарплата после повышения у Кристины составит " + indexationZpKristina + " р.");

        float differenceZpMasha = indexationZpMasha * 12 - zpMasha * 12;
        float differenceZpDenis = indexationZpDenis * 12 - zpDenis * 12;
        float differenceZpKristina = indexationZpKristina * 12 - zpKristina * 12;

        System.out.println("Разница за год у Маши составит " + differenceZpMasha + " р.");
        System.out.println("Разница за год у Дениса сосавит " + differenceZpDenis + " р.");
        System.out.println("Разница за год у Кристины составит " + differenceZpKristina + " р.");












    }
}