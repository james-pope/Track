public class Sprints extends Athlete{
    public double time;
    public String event;
    public String prev;
    public double seconds;
    public Sprints(String n, String e){
        super(n, e);
        event = e;
        prev = e;
    }
    public String race(){
        event = event.toUpperCase();
        if (event.equals("100M")){
            time = (Math.random() * (15-10) + 1) + 10;
            return getName() + " ran the 100m in " + (Math.round(time*100.0)/100.0) + " seconds!";
        }
        if (event.equals("200M")){
            time = (Math.random() * (30 - 20) + 1) + 20;
            return getName() + " ran the 200m in " + (Math.round(time*100.0)/100.0) + " seconds!";
        }
        if (event.equals("400M")){
            time = (Math.random() * (65 - 47) + 1) + 47;
            return getName() + " ran the 400m in " + (Math.round(time*100.0)/100.0) + " seconds!";
        }
        if (event.equals("600M")){
            time = (Math.random() * (150-120) + 1) + 120;
            return getName() + " ran the 100m in " + (Math.round(time*100.0)/100.0) + " seconds!";
        }
        int m = (int) time/60;
        return getName() + " ran the " + getEvent() + " in " + m + ":" + time%60  + " seconds!";
    }
}
