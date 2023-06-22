public class Ticket {
    private int id;
    private String description ;
    private boolean resolve ;

    public Ticket (int id,String description){

        this.id=id;
        this.description=description;
        this.resolve= false;

    }

     public int getId(){
        return id;
     }
     public String getDescription(){
        return description;
     }
     public boolean isResolve(){
        return resolve;
    }
     public void resolve(){
        resolve= true;
     }

 }
