public class Ticket extends Product{

    private TypeTicket type;
    private int id;
    private static int teller;

        public Ticket(String naam, TypeTicket type) {
            super(naam);
            this.type = type;
            teller++;
            this.id = teller;
        }

        public TypeTicket getType() {
            return type;
        }

        public void setType(TypeTicket type) {
            this.type = type;

        }

    @Override
    public static int getId() {
        return id;
    }

    @Override
        public String toString() {
            return "Productnaam= " + this.getNaam() + '\'' +
                    "Prijs= " + this.getPrijs() + '\'' +
                    "Product-id= " + this.getId() + '\'' +
                    "Type product= " + this.getClass().getSimpleName() + type.toString();

        }
    }
