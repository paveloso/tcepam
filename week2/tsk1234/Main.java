package spb.epam.tc.week2.tsk1234;

import spb.epam.tc.week2.tsk5.Course;
import spb.epam.tc.week2.tsk5.Groups;
import spb.epam.tc.week2.tsk5.Student;
import spb.epam.tc.week2.tsk67.Submarine;

import java.util.Arrays;
import java.util.Comparator;

/**
 * created by postscriptum on 6/5/2018;
 */

public class Main {

    public static void main(String[] args) {

//        Object ob1 = new Object();
//        Object ob2 = new Object();
//
//        int hashOb1;
//        int hashOb2;
//        hashOb1 = ob1.hashCode();
//        hashOb2 = ob2.hashCode();
//        System.out.println(hashOb1);
//        System.out.println(hashOb2);

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

        //desktop.totalPriceOfItems();

        Employee office = new Employee();
        Employee finance = new Employee();

        //System.out.println(office.desktop.toString());

        Desktop officeDesktop = new Desktop();
        officeDesktop.assignDesktop(office);

        office.workingPlace.add(pen1);
        //office.workingPlace.totalPriceOfItems();

        Employee newbie = new Employee();
        Desktop newbieList = new Desktop();
        Pencil pencil = new Pencil(2.5);
        StickyNotes stickyNotes = new StickyNotes(3.5);

        newbieList.add(pencil);
        newbieList.add(stickyNotes);

        System.out.print("newbieList = ");
        //newbieList.totalPriceOfItems();

        WritingTools workingTools1 = new Pencil(3.5);
        workingTools1.setName("Jkl");
        Paper workingTools2 = new StickyNotes(7.0);
        workingTools2.setName("Efg");

        WorkingPlace forNewbie = new WorkingPlace("Newbie", 2);

        forNewbie.addItem(workingTools1);
        forNewbie.addItem(workingTools2);

        //OfficeItems[] items = forNewbie.getTools();

        //System.out.println(items.length);
//        for (OfficeItems oi : items)
//            System.out.println(oi.toString());

        System.out.println("");
        forNewbie.displayAllItems();
        System.out.println("Total price of all items in " + forNewbie.getNameFor() + " is: " + forNewbie.getTotalPrice());

        Arrays.sort(forNewbie.getTools());
//        for (Object o : items)
//            System.out.println(o);
        forNewbie.displayAllItems();

        System.out.println("");
        Arrays.sort(forNewbie.getTools(), new Comparator<OfficeItems>() {
            @Override
            public int compare(OfficeItems o1, OfficeItems o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        forNewbie.displayAllItems();

        Submarine yellowsm = new Submarine();
        System.out.println(yellowsm.isRunning());
        yellowsm.onOff();
        System.out.println(yellowsm.isRunning());
        yellowsm.onOff();
        System.out.println(yellowsm.isRunning());

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


//        int pen1Hc = pen1.hashCode();
//        int pen2Hc = pen2.hashCode();
//        int pen3Hc = pen3.hashCode();
//
//        System.out.println(pen1Hc);
//        System.out.println(pen2Hc);
//        System.out.println(pen3Hc);
//
//        System.out.println("");
//        System.out.println(pen1.equals(pen2));
//        System.out.println(pen2.equals(pen1));
//        System.out.println(pen1.equals(pen3));
//
//        System.out.println("");
//        System.out.println(pen1.brand.hashCode());
//        System.out.println(pen2.brand.hashCode());
//        System.out.println(pen1.color.hashCode());
//        System.out.println(pen2.color.hashCode());
//
//        System.out.println("");
//        System.out.println(pen1.toString());
//        System.out.println(pen2.toString());
//        System.out.println(pen3.toString());

    }
}
