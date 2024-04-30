public abstract class AquaticAnimal extends Animal implements Carnivore<Food> {
    private String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
public AquaticAnimal(){}
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean isMammal() {
        return super.isMammal();
    }

    @Override
    public void setMammal(boolean mammal) {
        super.setMammal(mammal);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    /*@Override
    public void setName(String name) {
        super.setName(name);
    }
*/
    // Méthode swim() déclarée comme abstraite
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AquaticAnimal other = (AquaticAnimal) obj;
        return getName().equals(other.getName()) &&
                getAge() == other.getAge() &&
                habitat.equals(other.getHabitat());
    }
/////////////       prosit 8           ///////////////////////////////////////

    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("L'animal aquatique mange de la viande");
        } else {
            System.out.println("L'animal aquatique ne peut pas manger de plantes");
        }
    }
///////////////////////                   //////////////////////////////////////

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}