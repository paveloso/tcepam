package tcepam.week2.tsk1234;

public class Desktop {

    Object[] desktop = new Object[10];

    void assignDesktop(Employee emp) {
        emp.workingPlace = Desktop.this;
    }

    void add(OfficeItems oi) {
        if (desktop[0] == null) {
            desktop[0] = oi;
        } else {
            int i = 0;
            while (desktop[i] != null) {
                i++;
            }
            desktop[i] = oi;
        }
    }

    void showAllItems() {
        if (desktop[0] == null) {
            System.out.println("empty");
        } else {
            int i = 0;
            while (desktop[i] != null) {
                System.out.println(desktop[i]);
                i++;
            }
        }
    }

    void totalPriceOfItems() {
        double sum = 0.0;
        for (int i = 0; i < desktop.length; i++) {
            if (desktop[i] == null)
                break;
            else {
                OfficeItems officeItems = (OfficeItems) desktop[i];
                sum = sum + officeItems.getPrice();
            }
        }
        System.out.println(sum);
    }

}
