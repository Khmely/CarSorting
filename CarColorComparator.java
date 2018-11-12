package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */
public class CarColorComparator implements IComparator<Car> {
    @Override
    public int compare(Car x, Car y) {
        return x.getColor().compareTo(y.getColor());
    }
}
