package pstj_week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        // Create a PriorityQueue with a custom comparator matching the problem's priority rules
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 1. Higher CGPA comes first (descending order)
                if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
                    return Double.compare(s2.getCGPA(), s1.getCGPA());
                }
                // 2. Same CGPA: Ascending alphabetical order of name
                if (!s1.getName().equals(s2.getName())) {
                    return s1.getName().compareTo(s2.getName());
                }
                // 3. Same CGPA and name: Ascending order of ID
                return Integer.compare(s1.getID(), s2.getID());
            }
        });

        for (String event : events) {
            String[] parts = event.trim().split("\\s+");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<Student> remainingStudents = new ArrayList<>();
        // Extract students from the priority queue in priority order
        while (!pq.isEmpty()) {
            remainingStudents.add(pq.poll());
        }
        return remainingStudents;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();
            while (totalEvents-- != 0 && scan.hasNextLine()) {
                events.add(scan.nextLine());
            }
            
            Priorities priorities = new Priorities();
            List<Student> students = priorities.getStudents(events);
            
            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st : students) {
                    System.out.println(st.getName());
                }
            }
        }
        scan.close();
    }
}