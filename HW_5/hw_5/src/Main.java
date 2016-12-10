import java.util.Arrays;

public class Main {

    public static int[] modeArr2(int[] mArr) {
        for (int h = 0; h < mArr.length; h++) {
            if (mArr[h] % 2 != 0)
                System.out.print(mArr[h] + " ");
        }
        return mArr;
    }

    public static int[] modeFiveTask(int [] mFT){

        for (int y = 0, z = 0; y < 20; y++, z = z+3){
            mFT[y] = 5 + z;

        }
        return mFT;
    }

    public static int[] modeSixTask (int [] mST){
        int a = 4;
        int sum = (2*a-1);
        mST[0] = a;
        for(int s = 1; s < 10; s++){
            mST[s] = a + sum;
            a +=sum;
        }
        return mST;
    }

    public static void main(String[] args) {

//////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 1. Вывести на экран возрастающую последовательность из 10 чисел начиная с 15");

        int[] arr = new int[]{2, 45, 16, 11, 3, 91, 78, 1, 63, 54};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 14)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

//////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 2. Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15");

        // не смог выполнить

        int[] arr2 = new int[40];
        int q = 0;
        for (int j = arr2.length; j > 0; j--) {
            arr2[q] = j;
            q++;
        }
        System.out.println(Arrays.toString(arr2));
        modeArr2(arr2);
        System.out.println();
        System.out.println();

///////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 3. Вывод на экран всех элементов массива строк через запятую.");

        String [] catsArr = {"Барсик", "Мурзик", "Билл", "Лева", "Мурка", "Анфиса", "Лея", "Василиса"};
        for(int r = 0; r < catsArr.length-1; r++){
            System.out.print(catsArr[r] + ", ");
        }
        int r = catsArr.length - 1;
        System.out.println(catsArr[r]);
        System.out.println();

///////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 4. Вывод на экран всех элементов массива чисел в обратном порядке.");

        int [] reversArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reversArr));
        for (int e = reversArr.length-1; e >= 0; e--){
            System.out.print(reversArr[e] + " ");
        }
        System.out.println();
        System.out.println();

///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 5. Заполнение 20 элементов массива чисел с шагом 3, первым элементом которого будет 5");

        int [] twentyNum = new int [20];
        modeFiveTask(twentyNum);
        System.out.println(Arrays.toString(twentyNum));
        System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 6. Заполнение массива чисел из 10 элементов значениями переменной а, при условии что а является членом арифметической прогрессии 2а-1, а1=4.");

        int [] sumProgres = new int[10];
        modeSixTask(sumProgres);
        System.out.println(Arrays.toString(sumProgres));
        System.out.println();


//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 7. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.");

        int [] someArr = {3,0,2,-14,4,-5,6,9,8,7};
        int someSum =0;
        for(int u = 0; u< someArr.length; u++){
            someSum += someArr[u];
        }
        String resalt = (someSum > 0) ? "положительное" : "отрицательное";
        System.out.println("Сумма Элементов массива someArr - " + resalt + " число");
        System.out.println();


/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание 8. Найти некоторые данные о массиве используя тернаный оператор");

        int [] lastArr = {-1,0,1,2,5,9,4,8};

        int max = 0;
        int min = 0;
        int indMax = 0;
        int indMin = 0;

        for (int c = 0; c < lastArr.length; c++){
            max = max < lastArr[c] ? lastArr[c] : max;
        }
        for (int c = 0; c < lastArr.length; c++){
            min = min > lastArr[c] ? lastArr[c] : min;
        }
        for (int c = 0; c < lastArr.length; c++) {
            indMax = max == lastArr[c] ? c : indMax;
        }
        for (int c = 0; c < lastArr.length; c++) {
            min = min == lastArr[c] ? lastArr[c] : min;
        }
        System.out.println("Максимальное значние массива - " + max);
        System.out.println("Минимальное значние массива - " + min);
        System.out.println("Максимальный элемент массива lastArr, больше минимального на " + (max - min));
        System.out.println("Индекс максимального элемента " + indMax);
        System.out.println("Индекс минимального и индекс максимального элементов " + indMin + " " + indMax);

    }

}