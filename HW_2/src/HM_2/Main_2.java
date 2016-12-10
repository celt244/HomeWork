package HM_2;

public class Main {
    public static void main (String[] args){

        // Задание 1. Подсчет количества полніх недель в 234 днях

        int week = 234 / 7;
        System.out.println("Задание 1:");
        System.out.println("Количество полных недель в 234 днях - " + week);

        // Задание 2. Подсчет возможного количества квадратов 130 мм из прямоукогльника 543*130 мм

        int length = 543;
        int square;
        square = length/130;
        System.out.println("Задание 2:");
        System.out.println("Возможное количество квадратов 130 мм из прямоукогльника 543*130 мм - " + square);

        // Задание 3. Нахождение в двзначном числе: число десятков, число единиц, сумму его цифр, произведение его чисел

        int someVar = 27;
        int units;
        int tens;
        units = someVar % 10;
        tens = (someVar - units) / 10;
        System.out.println("Задание 3:");
        System.out.println("a) количество десятков в числе " + someVar + " - " + tens);
        System.out.println("б) количество едниц в числе " + someVar + " - " + units);
        System.out.println("в) сумма цифр числа " + someVar + " - " + (units + tens));
        System.out.println("г) произведение цифр числа " + someVar + " - " + units * tens);

        // Задание 4. Перестановка цифр местами двузначного цисла

        int variable = 25;
        int firstUnit = variable % 10;
        int secondUnit = (variable - firstUnit) / 10;
        int changedVariable = firstUnit * 10 + secondUnit;

        System.out.println("Задание 4:");
        System.out.println("При перестановке цифр местами в числе " + variable + " образуется число - " + changedVariable);

        // Задание 5. Вычислить значение логического выражения при следующих значениях логических величин
        // А, В и С: А = Истина, В = Ложь, С = Ложь:
        // а) не А и В;
        // б) А или не В;
        // в) А и В или С.


        boolean A = true;
        boolean B = false;
        boolean C = true;
        boolean D = !A && B;
        boolean E = A || !B;
        boolean F = A && B || C;

        System.out.println("Задание 5:");
        System.out.println("Значение при условии: !A&&B = " + D);
        System.out.println("Значение при условии: A||!B = " + E);
        System.out.println("Значение при условии: A&&B||C = " + F);

        // Задание 6. Вычислить значение логического выражения при следующих значениях логических величин
        // X, Y и Z: X = Ложь, Y = Ложь, Z = Истина:
        // а) X или Y и не Z;
        // б) не X и не Y;
        // в) не (X и Z) или Y;
        // г) X и не Y или Z;
        // д) X и (не Y или Z);
        // е) X или (не (Y или Z)).

        boolean X = false;
        boolean Y = false;
        boolean Z = true;

        System.out.println("Задание 6:");
        System.out.println("Значение при условии: X||Y&&!Z = " + (X || Y && !Z));
        System.out.println("Значение при условии: !X&&!Y = " + (!X && !Y));
        System.out.println("Значение при условии: !(X&&Z)||Y = " + (!(X && Z) || Y));
        System.out.println("Значение при условии: X&&!Y||Z = " + (X && !Y || Z));
        System.out.println("Значение при условии: X&&(!Y||Z) = " + (X && (!Y || Z)));
        System.out.println("Значение при условии: X||(!(Y||Z)) = " + (X||(!(Y||Z))));

        // Задание 7.	Вычислить значение логического выражения:

        System.out.println("Задание 7:");

        int x;
        int y;

            x = 1;
            y = -1;
        boolean p = (x*x + y*y) <= 4;
        System.out.println("Значение Логического выражение варианта (x*x + y*y) <= 4: " + p);

            x = 1;
            y = 2;
        boolean o = (x >= 0) || (y*y != 4);
        System.out.println("Значение Логического выражение варианта (x >= 0) || (y*y != 4): " + o);

            x = 1;
            y = 2;
        boolean i = (x >= 0) && (y*y != 4);
        System.out.println("Значение Логического выражение варианта (x >= 0) && (y*y != 4): " + i);

            x = 2;
            y = 1;
        boolean u = (x * y != 0) && (y > x);
        System.out.println("Значение Логического выражение варианта (x * y != 0) && (y > x): " + u);

            x = 2;
            y = 1;
        boolean L = (x * y != 0) || (y > x);
        System.out.println("Значение Логического выражение варианта (x * y != 0) || (y > x): " + L);

            x = 2;
            y = 1;
        boolean k = (!(x * y < 0)) && (y > x);
        System.out.println("Значение Логического выражение варианта (!(x * y < 0)) && (y > x): " + k);

            x = 1;
            y = 2;
        boolean j = (!(x * y < 0)) || (y > x);
        System.out.println("Значение Логического выражение варианта (!(x * y < 0)) || (y > x): " + j);
    }
}
