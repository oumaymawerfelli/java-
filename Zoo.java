public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES = 25;

    int nbrAnimals = 0;



    public Zoo(){
        this.animals = new Animal[25];
    }

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;

    }

    void displayZoo(){
        System.out.println(this.name + " : " + this.city + " | " + this.NBR_CAGES);
    }

    public boolean addAnimal(Animal animal){

            if(searchAnimal(animal) != -1 && nbrAnimals < animals.length){
                animals[nbrAnimals] = animal;
                nbrAnimals++;
                return true;
            }

        return false;
    }

    public void displayAnimals(){
        for(Animal a : animals){
            if(a != null)
                System.out.println(a);
            else
                return;
        }
        System.out.println("test");
    }

    public int searchAnimal(Animal animal){
        for(int i=0; i<nbrAnimals; i++){
            if(animal.equals(animals[i]))
                return i;
        }
        return -1;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.city + " | " + this.NBR_CAGES;
    }

    public boolean isZooFull(){
        return nbrAnimals == NBR_CAGES;
    }

    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1){
            for(int i=index; i<nbrAnimals-1; i++){
                animals[i] = animals[i+1];
            }
            animals[nbrAnimals-1] = null;
            nbrAnimals--;
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals >= z2.nbrAnimals)
            return z1;
        return z2;
    }

}
