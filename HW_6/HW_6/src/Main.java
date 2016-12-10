public class Main {

    final static float POUND = 0.453f;  // константа для задания 8

    public static void main(String[] args) {

// Задание 1. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
         System.out.print("1)  ");

         System.out.println(starWord("Master"));

// Задание 2. Дано название футбольного клуба. Напечатать его на экране "столбиком".
        System.out.println("2)");

        nameClub("Milan");

// Задание 3. Найти сумму положительных нечетных чисел, меньших 50.
        System.out.println();
        System.out.print("3)  ");

        System.out.println("Сумма положительных нечетных чисел, меньших 50 равна " + sumNum());

// Задание 4. Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2%
//            от имеющейся суммы. Определить:
//               а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
//               б) сумму вклада через: полгода, 2 года, 5 лет.
        System.out.println();
        System.out.println("4)");

        deposit(1000);

// Задание 5.	Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная
//              открытка размером с и d мм. Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.
        System.out.println();
        System.out.println("5)");

        System.out.println(envelopeLetter(10, 20, 9.98, 19.99));

// Задание 6.	Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.
        System.out.println();
        System.out.println("6)");

        System.out.println(fractionalNum(32.2, 41.7));

// Задание 7.	Записать условие, которое является истинным, когда:
//                 a) только одно из чисел А и В четное;
//                 б) хотя бы одно из чисел А и В положительно;
        System.out.println();
        System.out.println("7)");

        evenPositivNum(12, 13);

// Задание 8.	Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений
//              1, 2, ..., 10 фунтов (1 фунт = 453 г).
        System.out.println();
        System.out.println("8)");

        poundKilogram();

// Задание 9.	Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу
//              (значение курса вводится с клавиатуры).
        System.out.println();
        System.out.println("9)");

        exchangeRates(26.8f);

// Задание 10.	Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько клеток будет через
//              3, 6, 9, ..., 24 часа, если первоначально была одна амеба.
        System.out.println();
        System.out.println("10)");

        ameba(1);

// Задание 11.	В массиве записаны оценки по информатике 22 учеников класса. Определить количество учеников,
//              оценка которых меньше средней оценки по классу, и вывести номера элементов массива,
//              соответствующих таким ученикам.
        System.out.println();
        System.out.println("11)");

        assessment();

// Задание 12.	Дан массив целых чисел. Определить количество четных элементов и количество элементов,
//              оканчивающихся на цифру 5.
        System.out.println();
        System.out.println("12)");

        System.out.println(evenFiveElem());


    }
        // Метод для задания 1
    static String starWord(String str1)
    {
        String str2 = "";
        for(int i = 0; i < str1.length(); i++)
            str2 += "*";
        return str2 + str1 + str2;
    }
        // Метод для задания 2
    static void nameClub (String fClub)
    {
        for(int i = 0; i < fClub.length(); i++)
            System.out.println(fClub.charAt(i));
    }
        // Метод для задания 3
    static int sumNum ()
    {
        int sum = 0;
        for (int i = 0; i < 50; i++)
            if (i%2 != 0)
                sum += i;
        return sum;
    }
    // Метод для задания 4

    static  void deposit (float dep){
        float sumDep = 0f;
        float modeDep = dep;
        float prirost = 0f;
        float halfYears = 0f;
        float twoYears = 0f;
        float fiveYears = 0f;
        System.out.println("По депозиту на сумму " + dep + " UAH, при процентной ставке 2%, сумма будет увеличена:");
        for(int i = 0; i < 12; i++) {
            sumDep = dep * 2 / 100;  // начисление за один месц
            dep += sumDep;
            prirost +=sumDep;
            System.out.println(" - за " + (i+1) + "-ый месяц на: " + prirost);
        }
        for(int i = 0; i < 6; i++){
               halfYears = modeDep * 2 / 100;
               modeDep += halfYears;
        }
        System.out.println("Сума накопленная за 6 месцев будет составлять: " + modeDep);

        for(int i = 0; i < 18; i++){
            twoYears = modeDep * 2 / 100;
            modeDep += twoYears;
        }
        System.out.println("Сума накопленная за 2 года будет составлять: " + modeDep);

        for(int i = 0; i < 5*12 - 6; i++){
            fiveYears = modeDep * 2 / 100;
            modeDep += fiveYears;
        }
        System.out.println("Сума накопленная за 5 года будет составлять: " + modeDep);
    }

    // Метод для задания 5
    static String envelopeLetter(double a, double b, double c, double d){
        String res = null;
        if (a - 0.02f >= c && b -0.02f >=  d) return "Открытка помещается в конверт";
        else return "К сожалению, открытка не помещается в конверт";
    }

    // Метод для задания 6
    static String fractionalNum(double h, double g){
        String res6 = null;
        if(h > g) return "Число " + h + " больше " + g;
        return "Число " + g + " больше " + h;
}

    // Метод для задания 7
        static void evenPositivNum (int e, int p){
            if (e%2 == 0 ^ p%2 == 0) {
                if (e > 0 || p > 0)
                System.out.println("Только одно значение четное и одно из чисел положительное");
            }
            else
                System.out.println("К сожалению, ни одно условие не выполнено");
        }
    // Метод для задания 8
        static void poundKilogram (){
            System.out.println("Фунт -|- Килограмм");
             for (int i= 0; i < 20; i++)
                System.out.println("   " + (i+1) + " -|- " + ((i + 1) * POUND));
        }

    // Метод для задания 9
        static void exchangeRates (float c){
            System.out.println("USD -|- UAH");
            for (int i= 0; i < 20; i++)
                System.out.println("  " + (i+1) + " -|- " + ((i + 1) * c));
        }
    // Метод для задания 10
        static void ameba (int v){
            int cell = 2;
            System.out.println(v + " амеба поделится через:");
            for (int i = 3; i <= 24; i +=3) {
                System.out.println(i + " ч. на " + (cell * v) + " клеток");
                cell += 2;
            }
        }

    // Метод для задания 11
            static  void assessment(){

                int []assArr = {4, 5, 3, 4, 5, 3, 3, 3, 4, 5, 5, 3, 4, 3, 4, 5, 3, 3, 4, 5, 4, 4};
                double averageAss = 0;
                int count = 0;
                for (int i = 0; i < assArr.length; i++)
                    averageAss += assArr[i];
                averageAss /= assArr.length;
                System.out.println("Номер ученика с оценкой ниже среднего по классу:");
                for (int i = 0; i < assArr.length; i++)
                    if (assArr[i] < averageAss){
                        count++;
                        System.out.println("Номер в кассе - " + i);
                       }
                System.out.println("Всего учеников с оценкой ниже среднего по классу - " + count);
            }

    // Метод для задания 12

    static String evenFiveElem(){
        int [] hotArr = {5, 10, 12, 15, 20, 23, 25, 32, 45, 50, 5};
        int countEven = 0;
        int countFive = 0;
        int i = 0;
        for (i = 0; i < hotArr.length; i++) {
            if (hotArr[i] % 2 == 0)
                countEven++;
            if (hotArr[i] % 10 == 5)
                countFive++;
        }
            return "данный массив имеет " + countEven + " четных чисел и " + countFive + " чисел оканчивающихся на 5";

    }
}
