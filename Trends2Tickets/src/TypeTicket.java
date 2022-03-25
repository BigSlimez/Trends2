public enum TypeTicket {
        Dag1,
        Dag2,
        Combi;

        TypeTicket() {
        }

        @Override
        public String toString() {
            String b = " ";
            if (this == this.Dag1) {
                b = ("TypeSpel{ Dag1 }");
            } else if (this == this.Dag2) {
                b = ("TypeSpel{ dag2 }");
            } else if (this == this.Combi) {
                b = ("TypeSpel{ combi }");
            }
            return b;
        }
    }
