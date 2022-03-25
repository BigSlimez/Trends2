class MinderjarigExceptie extends Exception{
    public MinderjarigExceptie(String Message) {
        super("De persoon is minderjarig en kan dit niet kopen");
    }
}
