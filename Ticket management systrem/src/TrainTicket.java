public class TrainTicket extends Ticket{
    private String trainNumber;
    private String departureTime;
    private String platform;

    private TrainTicket(int id,String description,String trainNumber,String departureTime,String platform){
        super(id,description);
        this.trainNumber=trainNumber;
        this.departureTime=departureTime;
        this.platform=platform;
    }
    public String getTrainNumber(){
        return trainNumber;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public String getPlatform(){
        return platform;
    }

}
