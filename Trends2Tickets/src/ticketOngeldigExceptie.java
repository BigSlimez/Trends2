class ticketOngeldigExceptie extends Exception {
    public ticketOngeldigExceptie() {
        super("Dit ticket is al gebruikt");
    }
}
