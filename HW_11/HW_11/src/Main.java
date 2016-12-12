public class Main {

    public static void main(String[] args) {

// Задание 1
        System.out.println("1)");

        dayMouth(2, 2000);

// задание 2
        System.out.println("2)");

        System.out.println(mCard(4,7));

// Задание 3
        System.out.println("3)");

        System.out.println(dayYear(129, 6));

//   Задание 4
        System.out.println("4)");

        System.out.println(numToString(1));

//   Задание 5
        System.out.println("5)");

        System.out.println(reversStr("home"));

//   Задание 6
        System.out.println("6)");

        System.out.println(valEmail("muse@gmail.com"));

//   Задание 7
        System.out.println("7)");

        System.out.println(strArr(6));
    }

//   Задание 1. Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит
//             на экран количество дней в этом месяце. Рассмотреть два случая:
//              1) год не является високосным;
//              2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).

    public static int dayMouth (int mouth, int years){
        int res = 0;

        switch (mouth){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в указанном месяце "   + years + " года - 30");
                res = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней в указанном месяце "   + years + " года - 31");
                res = 31;
                break;
            case 2:
                if (years%4 == 0){
                    System.out.println("Количество дней в указанном месяце "   + years + " года - 29");
                res = 29;}
                else {
                    System.out.println("Количество дней в указанном месяце "   + years + " года - 28");
                res = 28;}
                break;
            default:
                System.out.println("Введите правильный месяц, месяц должен быть только от 1 до 12");
                res = 0;
                break;
        }
        return res;
    }
//   Задание 2.  По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14) определить
//               полное название (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.

    static String mCard(int m, int card){

        String resM = null;
        String resCard = null;

        if((m >= 1 && m <= 4) && (6 <= card && card <= 14)) {

            switch (m) {
                case 1:
                    resM = "Пика";
                    break;
                case 2:
                    resM = "Треф";
                    break;
                case 3:
                    resM = "Бубна";
                    break;
                case 4:
                    resM = "Черва";
                    break;
            }
            switch (card) {
                case 6:
                    resCard = "6";
                    break;
                case 7:
                    resCard = "7";
                    break;
                case 8:
                    resCard = "8";
                    break;
                case 9:
                    resCard = "9";
                    break;
                case 10:
                    resCard = "10";
                    break;
                case 11:
                    resCard = "Валет";
                    break;
                case 12:
                    resCard = "Дама";
                    break;
                case 13:
                    resCard = "Король";
                    break;
                case 14:
                    resCard = "Туз";
                    break;
            }
        }
        else return "Прошу выбрать карту их указанного диапазна. Масть от 1 до 4, карту от 6 до 14";
        return  resCard + " " + resM;
    }

//   Задание 3.  Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ...,
//               субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
//               а) понедельник;
//               б) i-й день недели (если 1 января — понедельник, то d=1, если вторник — d=2, ..., если воскресенье —  d= 7)

    static  String dayYear (int day, int d){
        String resDY = null;
        if (day <= 365 && d <= 7) {
            day = (day + d) % 7;
            switch (day) {
                case 1:
                    resDY = "Sunday";
                    break;
                case 2:
                    resDY = "Monday";
                    break;
                case 3:
                    resDY = "Tuesday";
                    break;
                case 4:
                    resDY = "Wednesday";
                    break;
                case 5:
                    resDY = "Thursday";
                    break;
                case 6:
                    resDY = "Friday";
                    break;
                case 7:
                    resDY = "Saturday";
                    break;
            }
        }
        else resDY = "Введите верные параметры. Год до 365 дней, 1 января от 1 до 7";
        return resDY;
    }

    //   Задание 4   Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом
//               будет строка “one”.
    static String numToString (int num){
        String digit = null;
        switch (num){
            case 1: digit = "one"; break;
            case 2: digit = "two"; break;
            case 3: digit = "tree"; break;
            case 4: digit = "four"; break;
            case 5: digit = "five"; break;
            case 6: digit = "six"; break;
            case 7: digit = "seven"; break;
            case 8: digit = "eight"; break;
            case 9: digit = "nine"; break;
            case 10: digit = "ten"; break;
            default: digit = "Unknown number";  break;
        }
        return digit;
    }
//   Задание 5.  Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.

    static String reversStr (String st1){
        String result = "";
        for (int i = st1.length()-1; i >= 0; i--) {
            result += st1.charAt(i);
        }
        return result;
    }

//   Задание 6.     Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать
//                  условию (пример - emailaddr@domain.zone)
//                  1)	emailaddr > 4 символов
//                  2)	1 < domain < 10
//                  3)	2 <= zone < 5
//                  При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.

    static String valEmail (String email){
        String res = "";
        String login = email.substring(0, email.indexOf("@"));
        int a = login.length();
        String domain = email.substring(a+1, email.indexOf("."));
        int b = domain.length();
        String zone = email.substring(a+1 + b+1);
        int c = zone.length();

        if (a >= 4 && (b > 1 && b < 10) && (c >= 2 && c < 5))
            res = "email - валидный";
        if (a < 4)
            res = "login - невалидный";
        if (b <1 || b > 10)
            res = "domain - невалидный";
        if (c <= 2 || c > 5)
            res = "zone - невалидный";
        return res;
    }

//   Задание 7.   Дан массив строк. Написать программу, которая:
//                а) выводит на экран значение всех строк через запятую, длина которых больше n.
//                б) выводит на экран значение всех неповторяющихся строк через запятую.

    static String strArr(int n) {
        String res = "";
        String[] arr = {"Солнце", "Земля", "Юпитер", "Меркурий", "Намибия", "Земля", "Андромена", "Юпитер"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > n)
                res += arr[i] + ", ";
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < i; j++)
//                if (arr[i] == (arr[j]))
//                    System.out.println(arr[i]);
//        }
        return res;
    }

}

