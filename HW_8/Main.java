public class Main {

    public static void main(String[] args) {

//   Задание 1.	Найти среднее арифметическое элементов массива, больших числа 10. * Решить задачу при
//              помощи циклов while и for-each
        System.out.println("1)");

        int [] arrTen = {5, 6, 11, 25, 1, 10, 9, 18, 23};
        moreTen(arrTen);

//   Задание 2.	Найти среднее арифметическое элементов массива, меньших некоторого числа m. *
//              Решить задачу при помощи циклов while и for-each
        System.out.println("2)");

        int [] arrM = {1, 3, 4, 5, 7, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(averArrM(arrM, 20));

//   Задание 3.	В массиве из 20 элементов числа образуют неубывающую последовательность. Несколько элементов, идущих
//              подряд, равны между собой. Найти количество таких элементов. Сколько различных чисел имеется в массиве?
        System.out.println("3)");

        int [] arrTask3 = {1, 1, 5, 10, 10, 2, 2, 45, 9, 9, 4, 6, 7, 13, 13, 5, 5, 1, 2};
        loopNumArr(arrTask3);

//   Задание 4.	В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилей.
//              Определить скорости двух самых быстрых автомобилей. * Задачу решить, не используя два прохода по массиву.
        System.out.println("4)");

        int [] arrCar = {50, 60, 40, 75, 77, 100, 120, 130, 135, 136, 140, 145, 150, 160, 160, 165, 167, 170, 171, 172, 173, 174, 40, 41, 45, 54, 63, 101, 212, 166, 94, 95, 87, 341, 65, 113, 55, 82, 97, 211};
        speedCar(arrCar);

//   Задание 5.	Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
//              а) сумму всех чисел последовательности;
//              б) количество всех чисел последовательности.
        System.out.println("5)");

        int [] dicimalArr = {10, 11, 20, 21, 10, 11, 30, 31, 10, 40, 41, 50, 51, 10, 20};
        arrTask5(dicimalArr);

//   Задание 6.	Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа. Определить, какое
//              количество отрицательных чисел записано в начале последовательности. Условный оператор не использовать.
        System.out.println("6)");

        double [] negatinArr = {-1.2,-5.7, -10.4, -2.0, -4.5, 9, 4, 6, 7, 1.3, 5, 2};
        sumNegativ(negatinArr);

//   Задание 7.	Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра
//              (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1).
//              * Задачу решить, не используя два прохода по массиву.
        System.out.println("7)");

        metTask7(13466);



//   Задание 8.	Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.
        System.out.println("8)");

            reversNum(12345);
        System.out.println();

//   Задание 9.	Дано двузначное число. Необходимо написать программу, которая вернет строковое представление
//              данного числа. Например, дано число 34, его строковое представление - thirty four.
        System.out.println("9)");

        System.out.println(wordNum(99));

//   Задание 10. Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
//        Рейтинг Оценка
//        0-19	   F
//        20-39    E
//        40-59	   D
//        60-74    C
//        75-89	   B
//        90-100   A
        System.out.println("10)");

        int n = 94;
        System.out.println("Студент при рейтинге " + n + " будет иметь оценку - " + educationSt(n));

    }


    // Метод для задания 1

    static void moreTen (int [] someArrTen){
        double res = 0;
        double count = 0;
        for(int s : someArrTen){
            while (s >= 10){
                res += s;
                count++;
                break;
            }
        }
        System.out.println(res/count);
    }

    // Метод для Задания 2

    static double averArrM(int [] someAverArr, int m){
        double res = 0;
        double count = 0;
        for (int s : someAverArr){
            while (s <= m){
                res += s;
                count++;
                break;
            }
        }
        return res/count;
    }
        // Метод для задани 3

    static void loopNumArr (int [] someNumArr){
        int duplNum = 0;
        int x = 0;
        int defNum = 0;
        for (int s : someNumArr) {
           if(x == someNumArr.length-1)
               break;

           if (s != someNumArr[++x]) duplNum++;
            else defNum++;
        }
        System.out.println("Количестов рядом стоящих, одинаковых элемнов в массиве - " + duplNum);
        System.out.println("Количество элементов без пары - " + (defNum+1));
    }
        // Метод для задани 4

    static void speedCar (int [] arr4){

        int max1 = 0;
        int max2 = 0;
        int i = 0;
        for (int s  : arr4){
            while(i< arr4.length-1){
                if(max1 < arr4[i])
                max1 = arr4[i];
                else if (max2 < arr4[i]) max2 = max1;
                i++;
                break;
            }
            }
            System.out.println(max1 + " " + max2);
    }
        // Метод для задани 5

    static void arrTask5 (int [] arr5){
        int sum = 0;
        int count = 0;

        for(int s : arr5){
            if (s%10 == 0){
            sum += s;
            count++;}
        }
        System.out.println("Сумма элементов массива оканчивающихся на 0 - " + sum);
        System.out.println("Количество элементов массива оканчивающихся на 0 - " + count);

    }
    // Метод для задани 6
    static void sumNegativ (double [] arr6){
        int count = 0;
        for(double s : arr6){
            while(s<0){
                count++;
                break;
            }
           }
        System.out.println("Количество отрицательных чисел в массиве - " + count);
    }

         // Метод для задани 7

    static void metTask7 (int num){
        int addNum = num;
        int count = 0;
        int countTotal = 0;
        int maxElem = 0;
        int d = 0;
        while (num > 0) {
            d = num % 10;
            num /= 10;
            countTotal++;
            if (maxElem < d)
                maxElem = d;
            else if (maxElem > d)
                count++;
        }
        System.out.println("Максимальна цифра в числе " + addNum + " - " + maxElem + " и она повторяется в числе " + (countTotal - count) + " раза");
    }

        // Метод для задани 8
    static void reversNum (int n){
        int rev = 0;
        do {
            rev = (rev * 10) + (n%10);
            n /=10;
        }while (n > 0);
        System.out.print(rev);
    }

    // Метод для задани 9

    static String wordNum (int someNum){
        String num1 = "";
        String num2 = null;
        int dig2 = someNum%10;
        int dig1 = (someNum - dig2)/10;
        if (dig1 < 2){
            switch (dig2) {
                case 0: return num2 = "ten";
                case 1: return num2 = "eleven";
                case 2: return num2 = "twelve";
                case 3: return num2 = "thirteen ";
                case 4: return num2 = "fourteen";
                case 5: return num2 = "fifteen";
                case 6: return num2 = "sixteen";
                case 7: return num2 = "seventeen";
                case 8: return num2 = "eighteen";
                case 9: return num2 = "nineteen";
            }
            }
            if (dig2 == 0){
            switch (dig1) {
                case 2: return num1 = "twenty";
                case 3: return num1 = "thirty";
                case 4: return num1 = "forty";
                case 5: return num1 = "fifty";
                case 6: return num1 = "sixty";
                case 7: return num1 = "seventy";
                case 8: return num1 = "eighty";
                case 9: return num1 = "ninety";
            }
            }
        switch (dig1) {
            case 2: num1 = "twenty"; break;
            case 3: num1 = "thirty"; break;
            case 4: num1 = "forty"; break;
            case 5: num1 = "fifty"; break;
            case 6: num1 = "sixty"; break;
            case 7: num1 = "seventy"; break;
            case 8: num1 = "eighty"; break;
            case 9: num1 = "ninety"; break;
        }
        switch (dig2){
            case 1: num2 = "one"; break;
            case 2: num2 = "two"; break;
            case 3: num2 = "three"; break;
            case 4: num2 = "four"; break;
            case 5: num2 = "five"; break;
            case 6: num2 = "six"; break;
            case 7: num2 = "seven"; break;
            case 8: num2 = "eight"; break;
            case 9: num2 = "nine"; break;
        }

        return num1+ " " + num2;
    }

    // Метод для задани 10

    static String educationSt(int ball){
        String profit = null;
        if (ball > 0 && ball < 20)   return profit = "F";
        if (ball > 19 && ball < 40)  return profit = "E";
        if (ball > 39 && ball < 59)  return profit = "D";
        if (ball > 58 && ball < 74)  return profit = "C";
        if (ball > 73 && ball < 89)  return profit = "B";
        if (ball > 88 && ball < 100) return profit = "A";

        return profit;
    }

}



