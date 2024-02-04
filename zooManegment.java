 import java.util.Scanner;
import java.util.Arrays;

class ZooMangment {

    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, false);
        Animal elephant2 = new Animal("Elephantidae", "Dumbo", 10, false);


        Animal giraffe = new Animal("Giraffidae", "Melman", 7, false);
       Zoo myZoo = new Zoo( "Myzoo", "Cityville", 12, new Animal[25]);
        //int nbrCage ;
       // String zooName ;
        //String city ;

        // Insertion des données
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Give me zoo name ");
        zooName = sc.nextLine();
        System.out.println("Give me number of cages ");
        nbrCage = sc.nextInt();
        System.out.println("Give me the city");
        city = sc.nextLine();*/


        // Création de l'objet Zoo avec tous les arguments requis
        boolean ajout1 = myZoo.addAnimal(lion);
        boolean ajout2 = myZoo.addAnimal(elephant);
        boolean ajout3 = myZoo.addAnimal(giraffe);


        System.out.println("Ajout 1 : " + ajout1);
        System.out.println("Ajout 2 : " + ajout2);
        System.out.println("Ajout 3 : " + ajout3);
       // myZoo.animals[0] = lion;

       // System.out.println(zooName + " comporte " + nbrCage + " cages");
      // myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());// on aura l'affichage des adresses non des variable
        //pour affichier correctement les informations il faut identifier la methode ToString
        System.out.println(lion);


        System.out.println(lion.toString());
        myZoo.displayAnimals();
        int indice = myZoo.searchAnimal("Dumbo");

        if (indice != -1) {
            System.out.println("L'animal a été trouvé à l'indice : " + indice);
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }
        myZoo.addAnimal(elephant2);
        int indiceElephant2 = myZoo.searchAnimal("Dumbo");

        if (indiceElephant2 != -1) {
            System.out.println("Le deuxième éléphant a été trouvé à l'indice : " + indiceElephant2);
        } else {
            System.out.println("Le deuxième éléphant n'a pas été trouvé dans le zoo.");
        }/* la méthode searchAnimal renverra l'indice du premier animal trouvé
        . Cela est dû au fait que la méthode se base uniquement sur le nom de l'animal pour effectuer la recherche,
         et si deux animaux ont le même nom, la méthode renverra l'indice du premier trouvé.*/

        boolean suppression = myZoo.removeAnimal(elephant);

        if (suppression) {
            System.out.println("L'animal a été supprimé avec succès.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }
    }

    static class Animal {
        String famille;
        String name;
        int age;
        boolean isMammal;

        // Constructeur de la classe Animal
        Animal(String famille, String name, int age, boolean isMammal) {
            this.famille = famille;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }
        public String toString() {
            return "Animal{" +
                    "family='" + famille+ '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", isMammal=" + isMammal +
                    '}';
        }
    }

    static class Zoo {
        String name;
        String city;
        int nbrCages;
        Animal[] animals;
        int i;

        // Constructeur de la classe Zoo
        Zoo(String name, String city, int nbrCages, Animal[] animals) {
            this.name = name;
            this.city = city;
            this.nbrCages = nbrCages;
            this.animals = animals;
            this.i = 0;
        }

        public void displayZoo() {
            System.out.println("Information sur le zoo :");
            System.out.println("Nom du zoo : " + name);
            System.out.println("Ville du zoo : " + city);
            System.out.println("Nombre de cages : " + nbrCages);
        }

        // pour pouvoir affichier les informations de chaque classe et non les adresses memoires
        public String toString() {
            return "Zoo{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", nbrCages=" + nbrCages +
                    ", animals=" + Arrays.toString(animals) +
                    '}';
        }

        public void displayAnimals() {
            System.out.println("Animaux du zoo :");
            for (int j = 0; j < i; j++) {
                System.out.println(animals[j]);
            }
        }

        /*public boolean addAnimal(Animal animal) {
            if (i < nbrCages) {
                animals[i] = animal;
                i++;
                return true;
            } else {
                return false; // Le zoo est plein, impossible d'ajouter plus d'animaux
            }
        }*/
        public boolean addAnimal(Animal animal) {
            // Vérifier si l'animal existe déjà dans le zoo
            for (int j = 0; j < i; j++) {
                if (animals[j].name.equals(animal.name)) {
                    System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
                    return false;
                }
            }

            // Vérifier si le zoo est plein
            if (i < nbrCages) {
                animals[i] = animal;
                i++;
                System.out.println("L'animal " + animal.name + " a été ajouté au zoo.");
                return true;
            } else {
                System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
                return false;
            }
        }
        public int searchAnimal(String animalName) {
            for (int j = 0; j < i; j++) {
                if (animals[j].name.equals(animalName)) {
                    return j; // Retourne l'indice si l'animal est trouvé
                }
            }
            return -1; // Retourne -1 si l'animal n'est pas trouvé
        }
        public boolean removeAnimal(Animal animal) {
            for (int j = 0; j < i; j++) {
                if (animals[j].equals(animal)) {

                    for (int k = j; k < i - 1; k++) {
                        animals[k] = animals[k + 1];
                    }
                    animals[i - 1] = null;
                    i--;
                    System.out.println("L'animal " + animal.name + " a été supprimé du zoo.");
                    return true;
                }
            }

            System.out.println("L'animal " + animal.name + " n'a pas été trouvé dans le zoo.");
            return false;
        }
    }

    }

