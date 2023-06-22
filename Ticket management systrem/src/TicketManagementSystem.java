import jdk.jfr.Description;

import java.util.ArrayList;
import java.util.List;

public class TicketManagementSystem {
    private List<Ticket>tickets;
    private int nextTicketid;

    public TicketManagementSystem(){
        tickets=new ArrayList<>();
        nextTicketid=1;
    }
    public void createBusTicket(String description,String busNumber,String departureTime){

        BusTicket ticket=new BusTicket(nextTicketid,description,busNumber,departureTime);
        tickets.add(ticket);
        nextTicketid++;
        System.out.println("Bus ticket created with ID:"+ ticket.getId());


    }

    public void createTrainTicket(String description, String flightNumber, String departure, String gate){
    TrainTicket ticket=new TrainTicket(nextTicketid, Description,TrainNumber,departureTime,platform);
    tickets.add(ticket)
    nextTicketid++;
    System.out.println("Train ticket created with ID:"+ticket.getid());

}
 public void createPlaneTicket(String description,String flightNumber,departureTime,String gate){
    PlaneTicket ticket=new PlaneTicker(nextTicketid,description,flightNumber,departureTime,gate);
    tickets.add(ticket);
    nextTicketid++;
    System.out.println("Plane ticket created with ID:"+ticket.getid());
 }

 public void resolveTicket(int ticketid){
    for (Ticket ticket:tickets){
        if (ticket.getId()==ticketid){
            ticket.resolve();
            System.out.println("TIcket"+ticket.getid()+"resolve.");

        }
    }
    System.out.println("Ticket not found.");
 }

 public void printOpenTickets(){
    System.out.println("Open Tickets.");
    for(Ticket ticket:tickets){
        if(!ticket.isResolve()){
            System.out.println("Ticket ID."+ticket.getid());
            System.out.println("Description:"+ticket.getDescription());

            if(ticket instanceof BusTicket) {
                BusTicket busTicket = (BusTicket) ticket;
                System.out.println("Bus Number:" + busTicket.getBusNumber());
                System.out.println("Departure Time:" + busTicket.getDepartureTime());
            } else if (ticket instanceof TrainTicket) {
                TrainTicket trainTicket=(TrainTicket) ticket;
                System.out.println("Train Number:"+trainTicket.getTrainNumber());
                System.out.println("Departure Time:"+trainTicket.getDepartureTime());
                System.out.println("Platform:"+trainTicket.getPlatform());
            } else if (ticket instanceof PlaneTicker) {
                PlaneTicker planeTicker=(PlaneTicker) ticket;
                System.out.println("Flight Number:"+planeTicker.getFlightNumberaa());
                System.out.println("Departure Time:"+planeTicker.getDepartureTime());
                System.out.println("Gete:"+planeTicker.getGate());

            }
            System.out.println("...............");

        }
    }
 }

