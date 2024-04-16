public class Zoo {
    final int NBR_MAX_ANIMAUX = 25;
    Animal[] animals;
    String name;
    String city;
    int nbrCages = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[NBR_MAX_ANIMAUX];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    void displayZoo(){
        System.out.println(this.name + " : " + this.city + " | " + this.nbrCages);
    }

    @Override
    public String toString(){
        return this.name + " : " + this.city + " | " + this.nbrCages;
    }

}
