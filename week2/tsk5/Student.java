package tcepam.week2.tsk5;

import java.util.Arrays;

public class Student {

    private String name;
    private Course[] courses = new Course[4];
    private Double[] ratings = new Double[4];

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRating(Course course, Double d) {
        boolean isMatch = false;
        int index = 0;
        for (int i = 0; i < courses.length - 1; i++) {
            if (course.equals(courses[i])) {
                isMatch = true;
                index = i;
            }
        }
        if (isMatch) {
            ratings[index] = d;
        }
    }

    public void getRatings() {
        for (int i = 0; i < courses.length - 1; i++) {
            if (courses[i] == null) {
                //stop printing if there is no course
            } else {
                System.out.println("COURSE: " + courses[i] + ", RATINGS: " + ratings[i]);
            }
        }
    }

    public void getCourses() {
        if (courses[courses.length - 1] != null) {
            for (Object o : courses)
                System.out.println(o);
        } else {
            int i = 0;
            while (courses[i] != null) {
                System.out.println(courses[i]);
                i++;
            }
        }
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void addToCourses(Course course) {
        boolean isMatch = false;
        for (int i = 0; i < courses.length - 1; i++) {
            if (course.equals(courses[i])) {
                isMatch = true;
            }
        }
        if (isMatch) {
            // can't add because the course is already in the list
        } else {
            if (courses[courses.length - 1] != null) {
                //full list
            }
            int i = 0;
            while (courses[i] != null) {
                i++;
            }
            courses[i] = course;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
}
