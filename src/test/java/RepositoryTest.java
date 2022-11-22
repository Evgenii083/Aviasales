import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Ticket ticket1 = new Ticket(1,7400,"TGD","BUD",84);
    Ticket ticket2 = new Ticket(2,6500,"TIV","BEG",45);
    Ticket ticket3 = new Ticket(3,4850,"SJJ","TGD",40);
    Ticket ticket4 = new Ticket(4,9260,"TGD","TIA",50);
    Ticket ticket5 = new Ticket(5,10_770,"BCN","WAW",184);
    Ticket ticket6 = new Ticket(6,9776,"BEG","KRK",340);
    Ticket ticket7 = new Ticket(7,6320,"KRK","TIV",90);

    Repository repo = new Repository();
    @Test
    public void addTickets(){
        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);

        Ticket[] expected = {ticket1,ticket2,ticket3,ticket4,ticket5,ticket6,ticket7};
        Assertions.assertArrayEquals(expected,repo.getTickets());
    }
    @Test
    public void deleteTickets(){
        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);

        repo.deleteTicket(5);

        Ticket[] expected = {ticket1,ticket2,ticket3,ticket4,ticket6,ticket7};
        Assertions.assertArrayEquals(expected,repo.getTickets());
    }

    @Test
    public void showAllTickets(){
        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);

        repo.showAllTickets();

        Ticket[] expected = {ticket1,ticket2,ticket3,ticket4,ticket5,ticket6,ticket7};
        Assertions.assertArrayEquals(expected, repo.showAllTickets());
    }






}