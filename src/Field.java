public class Field extends Athlete {
    public int distance;
    public int height;
    public String event;
    public int points;
    public Field(String name, String e){
        super(name, e);
        event = e;
    }
    public String Throw(){
        boolean foul = false;
        event = event.toUpperCase();
        if (event.equals("SHOTPUT") || event.equals("SHOT PUT")){   //shotput section
            distance = (int)(Math.random() * 600);
            if (distance < 250){distance = 0; foul =true;}
        }
        if (event.equals("DISCUS")){    //discus section
            distance = (int)(Math.random() * 2000);
            if (distance < 800){distance = 0; foul =true;}
        }
        if (event.equals("JAVELIN")){     //Javelin section
            distance = (int)(Math.random() * 3000);
            if (distance < 1000){distance = 0; foul =true;}
        }
        if (event.equals("HAMMER")){    //hammer section
            distance = (int)(Math.random() * 3000);
            if (distance < 1000){distance = 0; foul =true;}
        }
        if (!foul){
            return getName() + " Threw " + distance/12 + "'" + distance%12 + "'' in the " + getEvent() + " throw!";
        } else{
            return getName() + " fouled";
        }
    }
    public String jump(){
        event = event.toUpperCase();
        if (event.equals("HIGH JUMP")){
            height = (int)(Math.random()*(84-60) + 1) + 60;
        }
        if (event.equals("LONG JUMP")){
            height = (int)(Math.random()*(300-180) + 1) + 180;
        }
        if (event.equals("TRIPLE JUMP")){
            height = (int)(Math.random()*(600-420)+1)+420;
        }
        if (event.equals("POLE VAULT")){
            height = (int)(Math.random()*(240-120)+1)+120;
        }
        return getName() + " jumped " + height/12 + "'" + height%12 +"''" + " in the " + getEvent() + "!";
    }
}
