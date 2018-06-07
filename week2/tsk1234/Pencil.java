package spb.epam.tc.week2.tsk1234;

public class Pencil extends Temp {

    String name;
    Double price;

    Pencil(){}

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

    Pencil(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
