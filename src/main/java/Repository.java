public class Repository {
    Ticket[] tickets = new Ticket[0];

    public void addTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void deleteTicket(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToindex = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[copyToindex] = ticket;
                copyToindex++;
            }
        }
        tickets = tmp;
    }


    public Ticket[] showAllTickets() {
        Ticket[] all = getTickets();
        return all;
    }

    public Ticket[] getTickets() {
        return tickets;
    }
}
