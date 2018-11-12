public class Fruit implements Element {

    private double pricePerKg;
    private float weight;
    private String name;

    public Fruit(double priceKg, float weight, String name){
        this.pricePerKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg){
        this.pricePerKg = pricePerKg;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}