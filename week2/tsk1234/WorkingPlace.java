package tcepam.week2.tsk1234;

public class WorkingPlace {

    private String nameFor;
    private OfficeItems[] tools;

    public WorkingPlace(String s, int i) {
        this.nameFor = s;
        this.tools = new OfficeItems[i];
    }

    // correct the OutOfBound Exception
    public void addItem(OfficeItems officeItems) {
        if (tools[0] == null) {
            tools[0] = officeItems;
        } else {
            int i = 0;
            while (tools[i] != null) {
                i++;
            }
            tools[i] = officeItems;
        }
    }

    public void displayAllItems() {
        if (tools[0] == null) {
            System.out.println("The list is empty");
        } else {
            int i = 0;
            while (i < tools.length) {
                if (tools[i] != null) {
                    System.out.println(tools[i]);
                    i++;
                }
            }
        }
    }

    public double getTotalPrice() {
        double total = 0.0;
        if (tools[0] == null) {
            return 0.0;
        } else {
            int i = 0;
            while (i < tools.length) {
                if (tools[i] != null) {
                    total = total + tools[i].getPrice();
                    i++;
                }
            }
        }

        return total;
    }

    public OfficeItems[] getTools() {
        return tools;
    }

    public String getNameFor() {
        return nameFor;
    }
}
