package tcepam.week2.tsk1234;

import tcepam.week2.tsk5.Course;
import tcepam.week2.tsk5.Groups;
import tcepam.week2.tsk5.Student;
import tcepam.week2.tsk67.Submarine;

import java.util.Arrays;
import java.util.Comparator;

public class ThisIsRealMainJavaClassButWithLongName {

    public static void main(String[] args) {

        // tsk1234 test

        Pen pen1 = new Pen();
        pen1.brand = "Parker";
        pen1.color = "black";
        pen1.price = 7.85;

        Pen pen2 = new Pen();
        pen2.brand = "Parker";
        pen2.color = "black";
        pen2.price = 7.85;

        Pen pen3 = new Pen();
        pen3.brand = "Vic";
        pen3.color = "black";
        pen3.price = 5.55;

        Desktop desktop = new Desktop();
        desktop.add(pen1);
        desktop.add(pen2);
        desktop.add(pen3);

        System.out.println(desktop.desktop.length);

        desktop.showAllItems();

        Employee office = new Employee();
        Employee finance = new Employee();

        Desktop officeDesktop = new Desktop();
        officeDesktop.assignDesktop(office);

        office.workingPlace.add(pen1);

        Employee newbie = new Employee();
        Desktop newbieList = new Desktop();
        Pencil pencil = new Pencil(2.5);
        StickyNotes stickyNotes = new StickyNotes(3.5);

        newbieList.add(pencil);
        newbieList.add(stickyNotes);

        System.out.print("newbieList = ");

        WritingTools workingTools1 = new Pencil(3.5);
        workingTools1.setName("Jkl");
        Paper workingTools2 = new StickyNotes(7.0);
        workingTools2.setName("Efg");

        WorkingPlace forNewbie = new WorkingPlace("Newbie", 2);

        forNewbie.addItem(workingTools1);
        forNewbie.addItem(workingTools2);

        System.out.println("");
        forNewbie.displayAllItems();
        System.out.println("Total price of all items in " + forNewbie.getNameFor() + " is: " + forNewbie.getTotalPrice());

        Arrays.sort(forNewbie.getTools());
        forNewbie.displayAllItems();

        System.out.println("");
        Arrays.sort(forNewbie.getTools(), new Comparator<OfficeItems>() {
            @Override
            public int compare(OfficeItems o1, OfficeItems o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        forNewbie.displayAllItems();

        // tsk67 test

        Submarine yellowsm = new Submarine();
        System.out.println(yellowsm.isRunning());
        yellowsm.onOff();
        System.out.println(yellowsm.isRunning());
        yellowsm.onOff();
        System.out.println(yellowsm.isRunning());

        // tsk5 test

        System.out.println("");
        Student student = new Student();
        Student freshman = new Student();
        student.addToCourses(Course.MEDICINE);
        student.addToCourses(Course.IT);
        student.addToCourses(Course.IT);
        student.getCourses();
        student.addRating(Course.IT, 7.0);
        student.addRating(Course.ECONOMIC, 6.5);
        student.getRatings();

        System.out.println("");
        Groups one = new Groups();
        one.addToGroup(student, freshman);
        one.displayStudents();

    }
}
