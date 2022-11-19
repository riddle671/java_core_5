public class Homework1 {
    public static void main(String[] args) {
        //Задача 1
        double growth = 1.85;
        double weight = 85.6;
        double imt = weight / (growth * growth);
        System.out.println(imt);

        //Задача 2
        int ageChildren = 10;
        if (ageChildren < 6) {
            System.out.println("Ребенок идет в сад");
        } else if (ageChildren < 11) {
            System.out.println("Ребенок идет в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Ребенок идет в среднюю школу");
        } else {
            System.out.println("Ребенок идет в университет");
        }
        // Задание №3
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = true;

        if (chicken && vegetables && sour && toast)
        {
            System.out.println("Цезарь");
        }
        else if (vegetables && sausage || chicken && eggs)
        {
            System.out.println("Оливье");
        }
        else if (vegetables)
        {
            System.out.println("Овощной");
        }
        else
        {
            System.out.println("У меня ничего нет");
        }

        // Задача 1 продвин.  (спросить про Integer) parseInt() - преобр. строку в число

        String s = "234";
        int i = Integer.parseInt(s);
        System.out.println(i);

        // Задача 2
        int a = 3;
        int b = 5;
        int ab = (a + b);
        int stepen = 2;
        System.out.printf("перменная ab в квадрате равна %.0f \n", Math.pow(ab, stepen));

        // Задача 3
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;


        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println("1000");
        }
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        if (hasMotorProblem && !hasElectricsProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println("10000");
        }
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        if (hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            System.out.println("5000");
        }
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        if (hasTransmissionProblem && !hasElectricsProblem && !hasMotorProblem && !hasWheelsProblem) {
            System.out.println("4000");
        }
        // Если у машины проблема с колесами, то чинят и берут 2000.
        if (hasWheelsProblem & !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem) {
            System.out.println("2000");
        }


        // Если две детали сломаны, то на общий счет идет скидка 10 %
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        int motorrepair = 10000;
        int electricsrepair = 5000;
        int transmissionrepair = 4000;
        int wellsrepair = 2000;


        if (hasElectricsProblem && hasMotorProblem) {
            double electricsmotorprice = ((electricsrepair + motorrepair) * 0.9);
            System.out.println(electricsmotorprice);
        }
        if (hasElectricsProblem && hasTransmissionProblem) {
            double electricstransmissionprice = ((electricsrepair + transmissionrepair) * 0.8);
            System.out.println(electricstransmissionprice);
        }
        if (hasElectricsProblem && hasWheelsProblem) {
            double electricswellsprice = ((electricsrepair + wellsrepair) * 0.9);
            System.out.println(electricswellsprice);
        }
        if (hasMotorProblem && hasTransmissionProblem) {
            double motortransmissionprice = ((motorrepair + transmissionrepair) * 0.8);
            System.out.println(motortransmissionprice);
        }
        if (hasMotorProblem && hasWheelsProblem) {
            double motortrwellsprice = ((motorrepair + wellsrepair) * 0.9);
            System.out.println(motortrwellsprice);
        }
        if (hasTransmissionProblem && hasWheelsProblem) {
            double transmissionwellsprice = ((transmissionrepair + wellsrepair) * 0.9);
            System.out.println(transmissionwellsprice);
        }
    }
}