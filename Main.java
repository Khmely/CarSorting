package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = initCars();
        System.out.println("<===Sort by name===>");
        ArraySort.selectSort(cars, Car.Comparators.nameComparator());
        showCars(cars);

        System.out.println("<===Sort by year===>");
        ArraySort.selectSort(cars, Car.Comparators.productionYearComparator());
        showCars(cars);

        System.out.println("<===Sort by color===>");
        ArraySort.selectSort(cars, Car.Comparators.colorComparator());
        showCars(cars);

        System.out.println("<===Sort by year, name and color===>");
        ArraySort.selectSort(cars, Car.Comparators.complexComparator(Car.Comparators.productionYearComparator(),
                Car.Comparators.nameComparator(),
                Car.Comparators.colorComparator()));
        showCars(cars);

        System.out.println("<===Sort by name, year and color===>");
        ArraySort.selectSort(cars, Car.Comparators.compComparator(Car.Comparators.productionYearComparator(),
                Car.Comparators.nameComparator(),
                Car.Comparators.colorComparator()));
        showCars(cars);
    }

    private static void showCars (Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }
    private static Car[] initCars() {
        Car[] cars = new Car[8];
        cars[0] = new Car("Volvo", "Red", 2017);
        cars[1] = new Car("Ferrari", "Black", 2010);
        cars[2] = new Car("Ferrari", "Red", 2010);
        cars[3] = new Car("Polonez", "Green", 2010);
        cars[4] = new Car("Polonez", "Green", 1990);
        cars[5] = new Car("Fiat", "Blue", 2000);
        cars[6] = new Car("Porsche", "Silver", 2015);
        cars[7] = new Car("Audi", "Yellow", 2002);
        return cars;
    }
}
