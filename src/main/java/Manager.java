import java.util.Arrays;

public class Manager {
    private Repository repo = new Repository();

    public void addTicket(Ticket ticket) {
        repo.addTicket(ticket);
    }

    public void deleteTicket(int id) {
        repo.deleteTicket(id);
    }

    public Ticket[] findTicket(String departure, String arrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getTickets()) {
            if (ticket.getArrival().contains(arrival) && ticket.getDeparture().contains(departure)) {

                Ticket[] tmp = new Ticket[result.length + 1];
                tmp[tmp.length - 1] = ticket;
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                result = tmp;
            }
        }
        Arrays.sort(result,Ticket::compareTo);
        return result;
    }

    public Ticket[] getTickets() {
        return repo.getTickets();
    }
}