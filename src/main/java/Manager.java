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
                result = Arrays.copyOf(result, result.length + 1); // этот метод я честно загуглил , так как я не понимаю copyToIndex
                result[result.length - 1] = ticket;
            }
        }
        return result;
    }

    public Ticket[] getTickets() {
        return repo.getTickets();
    }
}