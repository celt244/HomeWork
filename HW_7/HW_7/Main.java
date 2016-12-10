public class Main {

    public static void main(String[] args) {

//   Задание 1. Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит
//             на экран количество дней в этом месяце. Рассмотреть два случая:
//              1) год не является високосным;
//              2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).
        System.out.println("1)");

        dayMouth(2, 2016);

//   Задание 2.  По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14) определить
//               полное название (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.
        System.out.println("2)");

        System.out.println(mCard(4,7));

//   Задание 3.  Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ...,
//               субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
//               а) понедельник;
//               б) i-й день недели (если 1 января — понедельник, то d=1, если вторник — d=2, ..., если воскресенье —  d= 7)
        System.out.println("3)");

        System.out.println(dayYear(120, 4));

//   Задание 4   Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом
//               будет строка “one”.
        System.out.println("4)");

        System.out.println(numToString(1));

//   Задание 5.  Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.
        System.out.println("5)");

        reversStr("home");

//   Задание 6.     Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать
//                  условию (пример - emailaddr@domain.zone)
//                  1)	emailaddr > 4 символов
//                  2)	1 < domain < 10
//                  3)	2 <= zone < 5
//                  При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.
        System.out.println("6)");

        valEmail("arthur@gmail.c");

//   Задание 7.   Дан массив строк. Написать программу, которая:
//                а) выводит на экран значение всех строк через запятую, длина которых больше n.
//                б) выводит на экран значение всех неповторяющихся строк через запятую.
        System.out.println("7)");

        strArr();

//   Задание 8.   Опишите с помощью enum тип данных для хранения месяцев. У каждого месяца должны быть следующие
//                свойства: номер месяца, название на английском, название на русском, количество дней. Написать
//                конструктор со всеми параметрами, а также геттеры.
        System.out.println();
        System.out.println("8)");

        System.out.println(Month.JANUARY.getNumMonth());
        System.out.println(Month.JANUARY.getEndlishMonth());
        System.out.println(Month.JANUARY.getDayMonth());
        System.out.println(Month.APRIL.getNumMonth());

//   Задание 9. Создать класс Book с полями: name (строка), BookType (перечисление), author (строка), year (целое число).
//              Написать конструктор со всеми параметрами. Опишите с помощью enum тип данных для хранения литературных жанров
//              (роман, сказка, комедия, драма, научная фантастика, детектив). Создать объекты класса книга
//              (число объектов соответствует числу жанров).
        System.out.println("9)");

            Book book1 = new Book("Анна Каренина", BookType.NOVEL, "Толстой", 1900);
            Book book2 = new Book("Кандид и оптимизм", BookType.COMEDY, "Вольтер", 1850);
            Book book3 = new Book("Гензель и Греттель", BookType.TALE, "Гримм", 1800);
            Book book4 = new Book("Дорога", BookType.DRAMA, "Кормак Маккарти", 2006);
            Book book5 = new Book("Солярис", BookType.SCIENCEFICTION, "Станислав Лем", 1961);
            Book book6 = new Book("Гроб из Гонконга", BookType.DETECTIVE, "Д.Х. Чейз", 1970);

        System.out.println(book1.getBookType());
        System.out.println(book2.getName());
        System.out.println(book6.getYear());






    }

        // Метод для задания 1

    public static void dayMouth (int mouth, int years){

        switch (mouth){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в указанном месяце "   + years + " года - 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней в указанном месяце "   + years + " года - 31");
                break;
            case 2:
                if (years%4 == 0)
                    System.out.println("Количество дней в указанном месяце "   + years + " года - 29");
                else
                    System.out.println("Количество дней в указанном месяце "   + years + " года - 28");
                break;
            default:
                System.out.println("Введите правильный месяц, месяц должен быть только от 1 до 12");
                break;
        }
    }
         // Метод для задания 2

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

        // Метод для задания 3

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

    // Метод для задания 4
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
    // Метод для задания 5

        static void reversStr (String st1){
            for (int i = st1.length(); i < 0; i--)
                System.out.print(st1.charAt(i));
        }

    // Метод для задания 6

        static void valEmail (String email){
            String login = email.substring(0, email.indexOf("@"));
            int a = login.length();
            String domain = email.substring(a+1, email.indexOf("."));
            int b = domain.length();
            String zone = email.substring(a+1 + b+1);
            int c = zone.length();

            if (a > 4 && (b > 1 && b < 10) && (c >= 2 && c < 5))
                System.out.println("email - валидный");
            if (a < 4)
                System.out.println("login - невалидный");
            if (b <1 || b > 10)
                System.out.println("domain - невалидный");
            if (c <= 2 || c > 5)
                System.out.println("zone - невалидный");
        }

    // Метод для задания 7

    static void strArr () {
        String[] arr = {"Солнце", "Земля", "Юпитер", "Вселенная", "Галактика", "Земля", "Андромена", "Юпитер"};
        int n = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > n)
                System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < i; j++)
                if (arr[i] == (arr[j]))
                    System.out.println(arr[i]);
        }
    }

    //
}

