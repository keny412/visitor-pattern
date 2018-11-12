public class ShoppingCartVisitorDisplay implements ShoppingCartVisitor {

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public double visit(Smartphone smartphone) {
        double cost = smartphone.getPrice();
        System.out.println(smartphone.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public double visit(Beer beer) {
        double cost = beer.getPricePerLiter() * beer.getBottleSize();
        System.out.println(beer.getName() + " cost = " + cost);
        return cost;
    }
}