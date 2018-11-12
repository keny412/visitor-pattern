public class Smartphone implements Element{

    private double price;
    private double screenSize;
    private String name;
    private String os;

    public Smartphone(double price, double screenSize, String name, String os) {
        this.price = price;
        this.screenSize = screenSize;
        this.name = name;
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
