package ticketPriceCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No of booking");
        int book = s.nextInt();
        System.out.println("Enter No available tickets");
        int availabe = s.nextInt();
        System.out.println("Enter tickedID");
        int id = s.nextInt();
        System.out.println("Enter Price");
        int price = s.nextInt();

        Tickets t = new Tickets();
        t.setAvailableTickets(availabe);
        t.setTicketId(id);
        t.setPrice(price);

        System.out.println("Enter the noOfTickets");
        int tickets = s.nextInt();

        if (tickets <= availabe) {
            System.out.println("Available Tickets :" + t.getAvailableTickets());
            int amount = t.calculateTicketCost(tickets);
            if (amount == -1) {
                System.out.println("Tickets not sufficient/available");
            } else {
                System.out.println("\nTotal amount:" + amount);
                System.out.println("\nAvailable tickets after booking: " + t.getAvailableTickets());
            }
        }
    }
}
