package ticketPriceCalculation;

public class Tickets {
    private int ticketId;
    private int price;
    private static int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0) {
            Tickets.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int noOfTickets){
       int tickets=getAvailableTickets();
       if(tickets>noOfTickets){
           int price=getPrice();
           int available=tickets-noOfTickets;
           setAvailableTickets(available);
           int amount=noOfTickets*price;
           return amount;
       }else{
           return -1;
       }
    }
}
