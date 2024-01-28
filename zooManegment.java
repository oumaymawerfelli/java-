/*instruction1
public class zooManegment {

    private int nbrCages = 20;
    private String zooName = "my zoo";

    public static void main(String[] args) {
        zooManegment zooManegment = new zooManegment();
        zooManegment.displayZooInfo();
    }

    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}*/
/*instruction2
 import java.util.Scanner;
public class zooManegment {

    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        zooManegment zooManegment = new zooManegment();
        zooManegment.getUserInput();
        zooManegment.displayZooInfo();
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre entier valide : ");
            scanner.next();
        }
        nbrCages = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();
        scanner.close();
    }

    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}*/

