package newhomework.author;

public class Book {

    private String title;
    private double price;

    Book(String title, double price){
        this.price = price;
        this.title = title;
    }
    Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title +
                " /price: " +
                 price;
    }
}
