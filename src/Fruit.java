public class Fruit implements Element {

    private double pricePerKg;
    private float weight;
    private String name;

    public Fruit(double priceKg, float wt, String nm){
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }


    public float getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}