

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal("Chat", "Lion",2, true);

        Zoo myZoo = new Zoo("myZoo", "Tunis", 20);
        Zoo myZoo1 = new Zoo("myZoo1", "Sousse", 10);
        Zoo myZoo2 = new Zoo("myZoo2", "Sfax", 15);

        myZoo.displayZoo();
        myZoo1.displayZoo();
        myZoo2.displayZoo();

        String s = "Aziz";
        System.out.println(s);

        System.out.println(myZoo.toString());
        System.out.println(lion);

    }
}
