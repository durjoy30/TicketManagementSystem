public class PlaneTicker extends Ticket{
    private String flightNumber;
    private String departureTime;
    private String gate;


    public PlaneTicker(int id,String description,String flightNumber,String departureTime,String gate){
        super(id,description);
        this.flightNumber=flightNumber;
        this.departureTime=departureTime;
        this.gate=gate;
    }

    public String getFlightNumberaa(){
        return flightNumber;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public String getGate(){
        return gate;
    }

}
