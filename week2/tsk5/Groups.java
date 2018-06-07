package tcepam.week2.tsk5;

public class Groups {

    Student[] students = new Student[25];

    public void addToGroup(Student ... s) {
        int i = 0;
        for (Student st : s) {
            students[i] = st;
            i++;
        }
    }

    public void displayStudents() {
        for (Student st : students) {
            if (st == null) {
                //do nothing
            } else {
                System.out.println(st.toString());
            }
        }
    }
}
