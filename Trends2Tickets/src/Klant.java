import java.util.ArrayList;

public class Klant {

    private String naam;
    private String email;
    private int leeftijd;
    private static int teller = 0;
    private final int klantnummer;
    private ArrayList <Product> winkelmand = new ArrayList<>();

    public Klant (int leeftijd){
        this.leeftijd = leeftijd;
        this.naam = naam;
        Klant.teller++;
        this.klantnummer = teller;
        this.winkelmand = winkelmand;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getKlantnummer() {
        return klantnummer;
    }

    public ArrayList<Product> getWinkelmand() {
        return winkelmand;
    }

    public void voegProductToe(Product product) throws MinderjarigExceptie{
        if((leeftijd<16) && ((product instanceof  Ticket) || (product instanceof Bonnetjes)))
        {
            throw new MinderjarigExceptie(product.getNaam());

        } else{
            this.winkelmand.add(product);
        }

    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", klantnummer=" + klantnummer +
                ", winkelmand=" + winkelmand +
                '}';
    }
}

