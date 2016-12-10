import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    // Объявление пустого массва
        int arr [] = new int[0];

    // Объвление массива byte на 26 элементов
        byte [] byteArray = new byte[26];

    // Объвление массива String на 10 элементов
        String [] stringArray  = new String[10];

     // Объвление и инициализация массива String по названиям дней недели
        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

     // Вывод на экран любого элемента массива

       System.out.println("Вывод 3-го элемента массива daysOfWeek: " + daysOfWeek[3]);

     // Заполнение массива 8 элементами
        int [] eightNum = {37, 0, 50, 46, 34, 46, 0, 13};

    // Сотрировка массива eightNum
        // убывающую последовательность

       // Arrays.sort(eightNum, Collections.reverseOrder());
       // System.out.println(Arrays.toString(eightNum));

        // возрастающая последовательность
        Arrays.sort(eightNum);
        System.out.println();
        System.out.println("Сортировка массива eightNum по убыванию");
        System.out.println(Arrays.toString(eightNum));

     // Задание 8. Работа с элементами массива eightNum
        System.out.println();
        System.out.println("Проверка, является ли 4-й элемент массива положительным числом");
        System.out.println("3-й элемент массива: " + (eightNum[3] > 0 ? "положительное " : "отрицательное") + " число");
        System.out.println("Проверка, является ли 7-й элемент массива четным числом");
        System.out.println("7-й элемент массива " + (eightNum[6]%2==0 ? "четное" : "нечетное") + " число");
        System.out.println("Какой элемент больше, 4-й или 7-й?");
        System.out.println((eightNum[3] > eightNum[6] ? "4-й" : "7-й") + " элемент массива больше");

     // Задание 9. Вывод элементов двумерного массива

        int [][] wArr = {{4,5,7},{8,3,0}};
        System.out.println();
        System.out.println("Вывод элемента массива, расположенного в правом верхнем углу массива - " + wArr[0][2]);
        System.out.println("Вывод элемента массива, расположенного в левом нижнем углу массива - " + wArr[1][0]);

     // Задание 10. Вывод элементов двумерного массива
        System.out.println();
        System.out.println("Вывод элемента массива, расположенного в правом нижнем углу массива - " + wArr[1][2]);
        System.out.println("Вывод элемента массива, расположенного в левом верхнем углу массива - " + wArr[0][0]);

    // Задание 11. Вывод элементов двумерного массива

        char [][] wSymbol = {{'F','G','L','J'}, {'T','h', 'h'}};
        System.out.println();
        System.out.println("Вывод на экран любого элемента второй строки массива wSymbol - " + wSymbol[1][2]);
        System.out.println("Вывод на экран любого элемента массива wSymbol - " + wSymbol[0][2]);
    }
}
