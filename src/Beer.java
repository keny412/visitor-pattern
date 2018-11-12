import java.math.BigDecimal;

public class Beer implements Element{

    private String name;
    private double pricePerLiter;
    private double bottleSize;
    private int alcohol;

    public Beer(String name, double pricePerLiter, double bottleSize, int alcohol) {
        this.name = name;
        this.pricePerLiter = pricePerLiter;
        this.bottleSize = bottleSize;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(double bottleSize) {
        this.bottleSize = bottleSize;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }


    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
