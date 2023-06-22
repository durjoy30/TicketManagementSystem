 public class BusTicket extends Ticket{
    private String busNumber;
    private String departureTime;

    public BusTicket(int id,String description, String busNumber, String departureTime){

        super(id,description);
        this.busNumber=busNumber;
        this.departureTime=departureTime;

    }

    public String getBusNumber(){
        return busNumber;
    }
    public String getDepartureTime(){
        return departureTime;
    }

}
