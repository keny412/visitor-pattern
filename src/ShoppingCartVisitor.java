public interface ShoppingCartVisitor {
    double visit(Fruit fruit);
    double visit(Smartphone smartphone);
    double visit(Beer beer);
}
