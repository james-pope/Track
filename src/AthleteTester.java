import java.util.Scanner;

public class AthleteTester {
    public static int numThrowers;
    public static Field[] ShotThrowers;
    public static Field[] DiscThrowers;
    public static Field[] JavThrowers;
    public static Field[] HammerThrowers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner xyz = new Scanner(System.in);   //bug with entering athletes

        /**
         * SECTION FOR ENTERING EVENTS
         */

        while (true) {
            System.out.print("What are you entering? Field, Distance or Sprints? : ");
            String input = xyz.nextLine();
            input = input.toUpperCase();
            if (input.equals("FIELD")) {        //FIELD EVENT SECTION
                System.out.print("What field event? : ");
                String f = xyz.nextLine();
                f = f.toUpperCase();
                if (f.equals("SHOTPUT") || f.equals("SHOT PUT")) {      //Shotput
                    System.out.print("How many throwers? : ");
                    numThrowers = sc.nextInt();
                    ShotThrowers = new Field[numThrowers];
                    for (int i = 0; i < ShotThrowers.length; i++) {      // puts shotput throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        ShotThrowers[i] = new Field(thr, "Shotput");
                    }
                }
                if (f.equals("DISCUS")) {       //discus
                    System.out.print("How many throwers? : ");
                    numThrowers = sc.nextInt();
                    DiscThrowers = new Field[numThrowers];
                    for (int i = 0; i < DiscThrowers.length; i++) {      // puts discus throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        DiscThrowers[i] = new Field(thr, "Discus");
                    }
                }
                if (f.equals("JAVELIN")) {      //javelin
                    System.out.print("How many throwers? : ");
                    numThrowers = sc.nextInt();
                    JavThrowers = new Field[numThrowers];
                    for (int i = 0; i < JavThrowers.length; i++) {      // puts javelin throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        JavThrowers[i] = new Field(thr, "Javelin");
                    }
                }
                if (f.equals("HAMMER")) {       //hammer
                    System.out.print("How many throwers? : ");
                    numThrowers = sc.nextInt();
                    HammerThrowers = new Field[numThrowers];
                    for (int i = 0; i < HammerThrowers.length; i++) {      // puts Hammer throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        HammerThrowers[i] = new Field(thr, "Hammer");
                    }
                }
            }
            System.out.print("Any other events you would like to enter? : ");
            String y = xyz.nextLine();
            y = y.toUpperCase();
            if (y.equals("NO")) {
                break;
            }
        }

        /**
         * COMPETITION SECTION
         */

        int x;
        while(true){
            System.out.print("What section would you like to compete? Field, Distance or Sprints? : ");
            String ab = xyz.nextLine();
            ab = ab.toUpperCase();
            if (ab.equals("FIELD")){
                System.out.print("What field Event? : ");
                String sp = xyz.nextLine();
                sp = sp.toUpperCase();
                if (sp.equals("SHOT PUT") || sp.equals("SHOTPUT")){
                    System.out.print("How many rounds of throws? : ");
                    x = sc.nextInt();
                    for(int j = 0; j < x; j++) {
                        System.out.println("ROUND " + (j+1));
                        for (Field shotThrower : ShotThrowers) {
                            System.out.println(shotThrower.Throw());
                        }
                    }
                }
                if (sp.equals("DISCUS")) {
                    System.out.print("How many rounds of throws? : ");
                    x = sc.nextInt();
                    for (int j = 0; j < x; j++) {
                        System.out.println("ROUND " + (j + 1));
                        for (Field DiscThrower : DiscThrowers) {
                            System.out.println(DiscThrower.Throw());
                        }
                    }
                }
                if (sp.equals("JAVELIN")) {
                    System.out.print("How many rounds of throws? : ");
                    x = sc.nextInt();
                    for (int j = 0; j < x; j++) {
                        System.out.println("ROUND " + (j + 1));
                        for (Field JavThrower : JavThrowers) {
                            System.out.println(JavThrower.Throw());
                        }
                    }
                }
                if (sp.equals("HAMMER")){
                    System.out.print("How many rounds of throws? : ");
                    x = sc.nextInt();
                    for (int j = 0; j < x; j++) {
                        System.out.println("ROUND " + (j + 1));
                        for (Field HammerThrower : HammerThrowers) {
                            System.out.println(HammerThrower.Throw());
                        }
                    }
                }
            }
            System.out.print("Any other competitions? : ");
            ab = xyz.nextLine();
            ab =ab.toUpperCase();
            if (ab.equals("NO")){ break;}
        }
    }
}