//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // Création d'objets Aquatic et Terrestrial
        AquaticAnimal poisson = new AquaticAnimal() {
            @Override
            public void swim() {

            }
        };
            TerrestrialAnimal lion = new TerrestrialAnimal() {
                @Override
                public void eatPlants(String plants) {

                }
            };

            // Test des méthodes
            poisson.eatMeat(Food.MEAT);
            poisson.eatMeat(Food.PLANT);

            lion.eatMeat(Food.MEAT);
            lion.eatPlant(Food.PLANT);
            lion.eatPlantAndMeat(Food.BOTH);
            lion.eatPlantAndMeat(Food.MEAT);

            // Création d'un objet Penguin (hérite de Terrestrial)
           Penguin penguin  = new Penguin();
            penguin.eatMeat(Food.MEAT); // Affiche "L'animal terrestre mange de la viande" (car le pingouin est un animal terrestre)


    }



}
