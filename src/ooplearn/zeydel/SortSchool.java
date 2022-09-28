package ooplearn.zeydel;

import java.util.Comparator;

public class SortSchool implements Comparator<School> {
    @Override
    public int compare(School o1, School o2) {
        if (o1.getNumOfSchool() == o2.getNumOfSchool())
            return 0;
        else
           return o1.getNumOfSchool() > o2.getNumOfSchool()? 1 : -1;
    }
}
