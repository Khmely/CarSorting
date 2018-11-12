package CarSorting;


/**
 * Created by Khmely on 05.04.2018.
 */
public class ArraySort {
    public static <T, E extends IComparator<T>> void selectSort(T[] array, E comparator) {
        for (int i = 0; i < array.length; i++) {
            int best = findBest(array, i, array.length, comparator);
            swap(array, i, best);
        }
    }

    public static void insertSort(Car[] tab, IComparator<Car> comparator){
        int j;
        for(int i=1; i<tab.length; i++ ){
            Car key = tab[i];
            j = i - 1;
            while( j >= 0 && comparator.compare(tab[j], key) >  0){
                tab[j+1] = tab[j];
                j = j -1;
            }
            tab[j+1] = key;
        }
    }

    private static <T, E extends IComparator<T>> int findBest(T[] array, int from, int to, E comparator) {
        int best = from;
        for (int i = from + 1; i < to; i++) {
            if (comparator.compare(array[i], array[best]) < 0) {
                best = i;
            }
        }

        return best;
    }

    private static <T> void swap (T[] array, int x, int y) {
        T temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static <T extends IComparable<T>> void selectSort (T[] array) {
        for (int i = 0; i < array.length; i++) {
            int best = findBest(array, i, array.length);
            swap(array, i, best);
        }
    }

    private static <T extends IComparable<T>> int findBest (T[] array, int from, int to) {
        int best = from;
        for (int i = from + 1; i < to; i++) {
            if (array[i].compareTo(array[best]) < 0) {
                best = i;
            }
        }
        return best;
    }
}
