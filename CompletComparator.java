package CarSorting;

/**
 * Created by Khmely on 05.04.2018.
 */
public final class CompletComparator implements IComparator{

    public CompletComparator() {}

    public int compare(Object left, Object right) throws ClassCastException {
        if (((Car) left).getName().compareTo(((Car) right).getName()) == 0) {
            if (((Car) left).getColor().compareTo(((Car) right).getColor()) == 0) {

                if (((Car) left).getProductionYear() == (((Car) right).getProductionYear())) {
                    return 0;
                } else {
                    if (((Car) left).getProductionYear() < (((Car) right).getProductionYear())) {
                        return -1;
                    } else {
                        return 1;

                    }
                }

            } else {
                return ((Car) left).getColor().compareTo(((Car) right).getColor());
            }
        } else {
            return ((Car) left).getName().compareTo(((Car) right).getName());
        }
    }
}
