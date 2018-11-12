package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */
public class CarComplexComparator implements IComparator<Car> {
    private IComparator<Car>[] comparators;

    public CarComplexComparator(IComparator<Car>... comparators) {

        this.comparators = comparators;
    }

    @Override
    public int compare(Car x, Car y) {
        int compareValue = 0;
        for (int i = 0; i < comparators.length; i++) {
            compareValue = comparators[i].compare(x, y);
            if (compareValue != 0) break;
        }
        return compareValue;
    }
}
