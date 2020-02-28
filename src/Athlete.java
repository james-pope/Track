public class Athlete {
    private String name;
    private String event;
    private String prev;

    public Athlete(String n, String e){
        name = n;
        event = e;
        prev = event;   //just to store how the user initally typed in event
    }
    public String getEvent(){
        event = prev;
        return event;}
    public String getName(){ return name;}
}
