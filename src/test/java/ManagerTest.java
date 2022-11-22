import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ManagerTest {

    Repository repo = new Repository();
    Manager manager = new Manager();

    Ticket ticket1 = new Ticket(1, 7400, "TGD", "BUD", 84);
    Ticket ticket2 = new Ticket(2, 6500, "KRK", "TIV", 45);
    Ticket ticket3 = new Ticket(3, 4850, "SJJ", "TGD", 40);
    Ticket ticket4 = new Ticket(4, 9260, "TGD", "BUD", 90);
    Ticket ticket5 = new Ticket(5, 10_770, "TGD", "WAW", 92);
    Ticket ticket6 = new Ticket(6, 9776, "BEG", "KRK", 340);
    Ticket ticket7 = new Ticket(7, 6320, "KRK", "TIV", 90);
    Ticket ticket8 = new Ticket(8, 7148, "TGD", "BUD", 90);
    Ticket ticket9 = new Ticket(9, 6380, "TGD", "BUD", 90);
    Ticket ticket10 = new Ticket(10, 5300, "KRK", "TIV", 45);
    Ticket ticket11 = new Ticket(11, 8800, "KRK", "TIV", 45);
    Ticket ticket12 = new Ticket(12, 4600, "KRK", "TIV", 45);


    @Test
    public void shouldAddTickets() {
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);


        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Assertions.assertArrayEquals(expected, manager.getTickets());
    }

    @Test
    public void shouldFindTickets() {
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);
        manager.addTicket(ticket8);
        manager.addTicket(ticket9);
        manager.addTicket(ticket10);
        manager.addTicket(ticket11);
        manager.addTicket(ticket12);

        Ticket[] expected = {ticket1, ticket4, ticket8, ticket9};
        Assertions.assertArrayEquals(expected, manager.findTicket("TGD", "BUD"));
    }

    @Test
    public void shouldFindTicketsWithSortByPrice() {
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);
        manager.addTicket(ticket8);
        manager.addTicket(ticket9);

        Ticket[] res = manager.findTicket("TGD", "BUD");
        Arrays.sort(res);

        Ticket[] expected = {ticket9, ticket8, ticket1, ticket4};
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void shouldDeleteTicketAfterFindAndSort() {
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);

        manager.deleteTicket(2);

        Ticket[] expected = {ticket1, ticket3};
        Assertions.assertArrayEquals(expected,manager.getTickets());
    }
}

