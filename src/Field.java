public class Field extends Athlete {
    public int distance;
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
}
