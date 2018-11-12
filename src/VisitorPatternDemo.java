public class VisitorPatternDemo {

    public static void main(String[] args) {
        Element[] items = new Element[]{
            new Fruit(10, 2, "Banana"),
            new Fruit(5, 5, "Apple"),
            new Beer("Valaisanne Pale Ale", 15.45, 0.33, 5),
            new Beer("Valaisanne Bière de Cave", 14.45, 0.33, 6),
            new Smartphone(949.50, 6.39, "Huawei mate 20 Pro", "Android"),
            new Smartphone(1349.2, 6.4, "Iphone XS Max", "Ios")
        };

        double total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static double calculatePrice(Element[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDisplay();

        double sum = 0;
        for(Element item : items){
            sum = sum + item.accept(visitor);
        }

        return sum;
    }

}