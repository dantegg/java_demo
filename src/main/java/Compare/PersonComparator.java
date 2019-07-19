package Compare;

import java.util.Comparator;

public class PersonComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if (p1.getId() > p2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
