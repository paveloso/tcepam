package tcepam.week2.tsk1234;

public class Pen extends Permanent{

    String brand;
    String color;
    Double price;

    @Override
    public int hashCode() {
        final int hash = 31;
        int result = 1;
        result = hash * result + brand.hashCode();
        result = hash * result + color.hashCode();
        result = hash * result + price.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (!brand.equals(pen.brand)) return false;
        if (!color.equals(pen.color)) return false;
        return price.equals(pen.price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
