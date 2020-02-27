import java.util.Scanner;

public class AthleteTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        boolean loop = true;
        System.out.print("What are you entering? Field, Distance or Sprints? : ");
        String input = e.nextLine();
        if (input.equals("Field")) {        //FIELD EVENT SECTION
            System.out.print("What field event? : " );
            String f = m.nextLine();
            f = f.toUpperCase();
            if (f.equals("SHOTPUT") || f.equals("SHOT PUT")) {      //Shotput
                System.out.print("How many throwers? : ");
                int num = sc.nextInt();
                Athlete[] ShotThrowers = new Athlete[num];
                for (int i = 0; i < ShotThrowers.length; i++) {      // puts shotput throwers into a array
                    System.out.print("Thrower " + (i + 1) + " name: ");
                    String thr = t.nextLine();
                    ShotThrowers[i] = new Field(thr, "Shotput");
                }
            }
        }
    }
}
