package pstj_week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {

                if (s1.cgpa < s2.cgpa) {
                    return 1;
                } else if (s1.cgpa > s2.cgpa) {
                    return -1;
                }

                int result = s1.name.compareTo(s2.name);

                if (result != 0) {
                    return result;
                }

                return s1.id - s2.id;
            }
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        sc.close();
    }
}