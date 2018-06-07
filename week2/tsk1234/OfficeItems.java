package spb.epam.tc.week2.tsk1234;

public class OfficeItems implements Comparable{
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        OfficeItems oi = (OfficeItems) o;
        return getName().compareTo(oi.getName());
    }
}
