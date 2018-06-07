package tcepam.week2.tsk1234;

public class StickyNotes extends Paper {

    private String name;
    private String color;
    private Double price;

    StickyNotes(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    StickyNotes(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "StickyNotes{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
