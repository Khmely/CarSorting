package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */
public class CarProductionYearComparator implements IComparator<Car> {
    @Override
    public int compare(Car x, Car y) {
        return x.getProductionYear() - y.getProductionYear();
    }
}
