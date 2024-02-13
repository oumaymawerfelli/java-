package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family; // L'attribut est maintenant privé
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // Utilisation de la méthode setAge pour garantir un âge non négatif
        this.isMammal = isMammal;
    }
    public String getName() {
        return this.name;
    }
    // Méthode publique pour définir l'âge avec une vérification de non-négativité
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif. La valeur par défaut de 0 sera utilisée.");
            this.age = 0; // Valeur par défaut si l'âge est négatif
        }
    }

    // Méthode publique pour obtenir l'âge
    public int getAge() {
        return age;
    }

    // Autres getters et setters pour les attributs name, family et isMammal

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

