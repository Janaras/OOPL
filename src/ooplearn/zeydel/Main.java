package ooplearn.zeydel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//
        Student student = new Student("Kerezbek ", 18);
        Student student1 = new Student("Nurislam ", 17);

        int number = student.compareTo(student1);
        switch (number) {
            case -1:
                System.out.println("The " + student.getName() + "is beginner");
                break;
            case 1:
                System.out.println("The " + student1.getName() + " is beginner");
                break;
            default:
                System.out.println("Error");
        }
        School school = new School(13, " Boto Narmatov");
        School school1 = new School(14, "Peaksoft");
        SortSchool sortSchool = new SortSchool();
        int num = sortSchool.compare(school, school1);
        switch (num) {
            case -1:
                System.out.println("The " + school.getName() + "is beginner");
                break;
            case 1:
                System.out.println("The" + school1.getName() + "is beginner");
                break;
            default:
                System.out.println("Error");


        }
    }
}




