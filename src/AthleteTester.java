import java.util.Scanner;

public class AthleteTester {
    public static int numAthletes;
    public static Field[] ShotThrowers;
    public static Field[] DiscThrowers;
    public static Field[] JavThrowers;
    public static Field[] HammerThrowers;
    public static Field[] highJump;
    public static Field[] longJump;
    public static Field[] tripleJump;
    public static Field[] poleVault;

    public static Sprints[] oneHundred;
    public static Sprints[] twoHundred;
    public static Sprints[] fourHundred;
    public static Sprints[] eightHundred;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //int
        Scanner xyz = new Scanner(System.in);   //strings

        /**
         * SECTION FOR ENTERING EVENTS
         */

        /**
         * could make much shorter by having each section as a method by passing a type? just a thought
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
                    numAthletes = sc.nextInt();
                    ShotThrowers = new Field[numAthletes];
                    for (int i = 0; i < ShotThrowers.length; i++) {      // puts shotput throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        ShotThrowers[i] = new Field(thr, "Shotput");
                    }
                }
                if (f.equals("DISCUS")) {       //discus
                    System.out.print("How many throwers? : ");
                    numAthletes = sc.nextInt();
                    DiscThrowers = new Field[numAthletes];
                    for (int i = 0; i < DiscThrowers.length; i++) {      // puts discus throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        DiscThrowers[i] = new Field(thr, "Discus");
                    }
                }
                if (f.equals("JAVELIN")) {      //javelin
                    System.out.print("How many throwers? : ");
                    numAthletes = sc.nextInt();
                    JavThrowers = new Field[numAthletes];
                    for (int i = 0; i < JavThrowers.length; i++) {      // puts javelin throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        JavThrowers[i] = new Field(thr, "Javelin");
                    }
                }
                if (f.equals("HAMMER")) {       //hammer
                    System.out.print("How many throwers? : ");
                    numAthletes = sc.nextInt();
                    HammerThrowers = new Field[numAthletes];
                    for (int i = 0; i < HammerThrowers.length; i++) {      // puts Hammer throwers into a array
                        System.out.print("Thrower " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        HammerThrowers[i] = new Field(thr, "Hammer");
                    }
                }
                if(f.equals("LONG JUMP")){
                    System.out.print("How many Jumpers? : ");
                    numAthletes = sc.nextInt();
                    longJump = new Field[numAthletes];
                    for (int i = 0; i < longJump.length; i++){
                        System.out.print("Jumper " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        longJump[i] = new Field(thr, "Long Jump");
                    }
                }
                if(f.equals("HIGH JUMP")){
                    System.out.print("How many Jumpers? : ");
                    numAthletes = sc.nextInt();
                    highJump = new Field[numAthletes];
                    for (int i = 0; i < highJump.length; i++){
                        System.out.print("Jumper " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        highJump[i] = new Field(thr, "High Jump");
                    }
                }
                if(f.equals("TRIPLE JUMP")){
                    System.out.print("How many Jumpers? : ");
                    numAthletes = sc.nextInt();
                    tripleJump = new Field[numAthletes];
                    for (int i = 0; i < tripleJump.length; i++){
                        System.out.print("Jumper " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        tripleJump[i] = new Field(thr, "Triple Jump");
                    }
                }
                if(f.equals("POLE VAULT")){
                    System.out.print("How many Jumpers? : ");
                    numAthletes = sc.nextInt();
                    poleVault = new Field[numAthletes];
                    for (int i = 0; i < poleVault.length; i++){
                        System.out.print("Jumper " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        poleVault[i] = new Field(thr, "Pole Vault");
                    }
                }
            }
            if(input.equals("SPRINTS")) {
                System.out.print("What event? (Format: 100m) : ");
                input = xyz.nextLine();
                input = input.toUpperCase();
                if (input.equals("100M")) {
                    System.out.print("How many athletes? : ");
                    numAthletes = sc.nextInt();
                    oneHundred = new Sprints[numAthletes];
                    for (int i = 0; i < oneHundred.length; i++) {
                        System.out.print("Sprinter " + (i + 1) + " name: ");
                        String thr = xyz.nextLine();
                        oneHundred[i] = new Sprints(thr, "100m");
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
            if (ab.equals("FIELD")){        //field events
                System.out.print("What field Event? : ");
                String sp = xyz.nextLine();
                sp = sp.toUpperCase();
                if (sp.equals("SHOT PUT") || sp.equals("SHOTPUT")){
                    System.out.print("How many rounds of throws? : ");
                    x = sc.nextInt();
                    for(int j = 0; j < x; j++) {    //number of rounds of throws
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
                if (sp.equals("LONG JUMP")){
                    System.out.print("How many rounds of jumps? : ");
                    x = sc.nextInt();
                    for(int i = 0; i < x; i ++){
                        System.out.println("ROUND " + (i + 1));
                        for(Field jumper :longJump){
                            System.out.println(jumper.jump());
                        }
                    }
                }
                if (sp.equals("HIGH JUMP")){
                    System.out.print("How many rounds of jumps? : ");
                    x = sc.nextInt();
                    for(int i = 0; i < x; i ++){
                        System.out.println("ROUND " + (i + 1));
                        for(Field jumper : highJump){
                            System.out.println(jumper.jump());
                        }
                    }
                }
                if (sp.equals("TRIPLE JUMP")){
                    System.out.print("How many rounds of jumps? : ");
                    x = sc.nextInt();
                    for(int i = 0; i < x; i ++){
                        System.out.println("ROUND " + (i + 1));
                        for(Field jumper :tripleJump){
                            System.out.println(jumper.jump());
                        }
                    }
                }
                if (sp.equals("POLE VAULT")){
                    System.out.print("How many rounds of jumps? : ");
                    x = sc.nextInt();
                    for(int i = 0; i < x; i ++){
                        System.out.println("ROUND " + (i + 1));
                        for(Field jumper :poleVault){
                            System.out.println(jumper.jump());
                        }
                    }
                }
            }
            if (ab.equals("SPRINTS")){
                System.out.print("What Event?(ex. 100m) : ");
                String sp = xyz.nextLine();
                sp = sp.toUpperCase();
                if(sp.equals("100M")){
                    for (Sprints sprints : oneHundred) {
                        System.out.println(sprints.race());
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