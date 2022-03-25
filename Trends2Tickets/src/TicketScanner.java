import java.util.ArrayList;



public class TicketScanner {
    private boolean geldig = true;
    ArrayList<Ticket> ticketLijst = new ArrayList<>();

    public void voegTicketToe(Ticket a)throws ticketOngeldigExceptie{
        if ( ticketLijst.contains(a)){
            geldig = false;
            throw new ticketOngeldigExceptie();

        }else{
            geldig = true;
            ticketLijst.add(a);
        }
    }

}
