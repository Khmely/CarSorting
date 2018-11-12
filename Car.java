package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */

public class Car implements IComparable<Car> {
    private String name;
    private String color;
    private int productionYear;

    public Car(String name, String color, int productionYear) {
        this.name = name;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, productionYear, color);
    }

    @Override
    public int compareTo(Car other) {
        int compareValue = Car.Comparators.nameComparator().compare(this, other);
        if (compareValue != 0) return compareValue;

        compareValue = Car.Comparators.productionYearComparator().compare(this, other);
        if (compareValue != 0) return compareValue;

        return Car.Comparators.colorComparator().compare(this, other);
    }

    public static class Comparators {
        public static CarNameComparator nameComparator() {
            return new CarNameComparator();
        }

        public static CarProductionYearComparator productionYearComparator() {
            return new CarProductionYearComparator();
        }

        public static CarColorComparator colorComparator() {
            return new CarColorComparator();
        }

        public static CarComplexComparator complexComparator(IComparator<Car>... comparators) {
            return new CarComplexComparator(comparators);
        }
        public static CompletComparator compComparator(IComparator<Car>... comparators) {
            return new CompletComparator();
        }
    }
}
