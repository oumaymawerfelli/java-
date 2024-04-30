public abstract class TerrestrialAnimal extends Animal implements Omnivore<Food> {
    private int nbrLegs;
    public TerrestrialAnimal(){}
    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getnbrlegs() {
        return nbrLegs;
    }

    public void setnbrlegs(int nbrLegs) {
        this.nbrLegs= nbrLegs;
    }
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
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
//////////////////       prosit8           ///////////////////////////////

    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("L'animal terrestre mange de la viande");
        } else {
            System.out.println("L'animal terrestre ne peut pas manger de plantes");
        }
    }


    public void eatPlant(Food food) {
        if (food == Food.PLANT) {
            System.out.println("L'animal terrestre mange des plantes");
        } else {
            System.out.println("L'animal terrestre ne peut pas manger de viande");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande et des plantes");
        } else {
            System.out.println("L'animal terrestre doit manger de la viande et des plantes");
        }
    }
}
