import java.util.HashSet;
import java.util.Objects;

public abstract class Product {

    private String naam;
    private int prijs;
    private static int teller = 0;
    private final int id;
    static HashSet<Product> productenlijst = new HashSet<>();

    public Product (String naam){
        this.naam = naam;
        this.prijs = prijs;
        productenlijst.add(this);
        Product.teller++;
        this.id = teller;
    }

    public String getNaam() {
        return naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Productnaam= " + naam + '\'' +
                "Prijs= " + prijs + '\'' +
                "Product-id= " + id + '\'' +
                "Type product= " + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public HashSet<Product> getProductenlijst() {
        return productenlijst;
    }
}
