public class AList {

        private int initialSize;
        private int size = 0;
        private float maxLoad = 0.8f;
        private float minLoad = 0.6f;
        private int[] array;
        private static final int MIN_SIZE = 10;

        public AList() {
            this.initialSize = 10;
            this.array = new int[initialSize];
        }

        public AList(int initialSize) {
            this.initialSize = initialSize;
            this.array = new int[initialSize];
        }
        // конструктор принимающий массив
        public AList(int[] array) {
            this.array = array;
    }

    public int size() {
            return size;
        }

        public void add(int n) {
            float currentLoad = size/(initialSize * 1.0f);
            if(currentLoad >= maxLoad) {
                initialSize = (int)(size * 1.5);
                int[] tmp = new int[initialSize];

                for (int i = 0; i < size; i ++) {
                    tmp[i] = array[i];
                }
                array = tmp;
            }
            array[size++] = n;
        }

        public void remove() {
            if(size > 0) {
                array[--size] = 0;
            }
            float currentLoad = size/initialSize;
            if(currentLoad <= minLoad && array.length > MIN_SIZE) {
                initialSize = (int)(size * 1.5);
                int[] tmp = new int[initialSize];
                for (int i = 0; i < size; i ++) {
                    tmp[i] = array[i];
                }
                array = tmp;
            }
        }
        //	добавление элемента в начало списка

        public void addInStartElement(int n){
            float currentLoad = size/(initialSize *1.5f);
            if(currentLoad > maxLoad){
                initialSize = (int)(size * 1.5);
                int[] tmp = new int[initialSize];
                for (int i = 0; i < initialSize; i++)
                    tmp[i] = array[i];
                array = tmp;
            }

            for(int i = size; i > 0; i--)
                array[i] = array[i-1];
            array[0] = n;
            size++;

    }
        // удаление элемента из начала списка

    public void removeOfStartElements(){
        array[0] = 0;
        for(int i = 0; i < size; i++)
            array[i] = array[i + 1];
        size--;

        float currentLoad = size/initialSize;
        if(currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int)(size * 1.5);
            int[] tmp = new int[initialSize];
            for (int i = 0; i < size; i ++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }
        // добавление элемента в середину списка (по индексу)
    public void addElementInMiddleArray(int index, int n){

        if (array[index] == 0){
            ////////////
            float currentLoad = size/(initialSize *1.5f);
            if(currentLoad > maxLoad){
                initialSize = (int)(size * 1.5);
                int[] tmp = new int[initialSize];
                for (int i = 0; i < initialSize; i++)
                    tmp[i] = array[i];
                array = tmp;
            }
        }
        /////////
        for (int i = size; i >= index; i--){
            array[i] = array[i - 1];
        }
        array[index] = n;
        size++;
    }

        // удаление элемента из середины списка (по индексу)
    public void removeElementInMeddleArray(int index){
        array[index] = 0;
        for (int i = index; i < size; i++)
            array[index] = array[index + 1];

        float currentLoad = size/initialSize;
        if(currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int)(size * 1.5);
            int[] tmp = new int[initialSize];
            for (int i = 0; i < size; i ++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }

    // получение индекса элемента по значению
    public int getElementByValue(int n){
        for(int i = 0; i < array.length; i++)
            if(array[i] == n)
                return i;
        return -1;
    }

    // метод, который принимает разделитель и возвращает все элементы списка через разделитель в виде строки
    public String getAllElementAsString(){
        String result = "";
        String res = "";
        for(int i = 1; i < size; i++){
            res += "" + " - " + array[i];
        }
        return result = "" +  array[0] + res;
    }
        // сортировка по возрастанию и убыванию используя алгоритм сортировки вставками (Insertion)
    public void sortArray(){
        for(int i = 1; i < size; i++)
            for(int j = i; j > 0 && array[j - 1] > array[j]; j--){
                int tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }
    }

        public int get(int index) {
            if(index < 0 || index >= size) throw new IllegalArgumentException();
            return array[index];
        }


        public int getArrayLength() {
            return array.length;
        }

    }

