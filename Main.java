import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Departement dep1 = new Departement(1, "Ressources Humaines", 10);
        Departement dep2 = new Departement(2, "Finance", 15);
        Departement dep3 = new Departement(3, "Informatique", 20);

        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Ajout des départements
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        // Recherche par nom
        System.out.println("Recherche par nom - Informatique existe : " + departementHashSet.rechercherDepartement("Informatique"));

        // Suppression du département 2
        departementHashSet.supprimerDepartement(dep2);

        // Affichage des départements
        System.out.println("Liste des départements après suppression :");
        departementHashSet.displayDepartement();

        // Trie des départements par ID
        System.out.println("Liste des départements triés par ID :");
        for (Departement dep : departementHashSet.trierDepartementById()) {
            System.out.println(dep);

        }
        AffectationHashMap affectationMap = new AffectationHashMap();

        // Ajout des paires Employe - Departement
        affectationMap.affecterEmploye("John", "Ressources humaines");
        affectationMap.affecterEmploye("Alice", "Finance");
        affectationMap.affecterEmploye("Bob", "Marketing");
       // affectationMap.affecterEmploye("John", "Marketing");seul l'affectation initiale  sera conservée dans la collection

        // Affichage de tous les employés et les départements auxquels ils sont affectés
        affectationMap.afficherEmployesEtDepartements();
        affectationMap.supprimerEmploye("John");
        System.out.println("--- Liste des employés ---");
        affectationMap.afficherEmployes();
        System.out.println();

        // Afficher la liste des départements
        System.out.println("--- Liste des départements ---");
        affectationMap.afficherDepartements();
        System.out.println();

        // Supprimer un employé
        affectationMap.supprimerEmploye("Bob");

        // Supprimer un employé travaillant dans un département spécifique
        affectationMap.supprimerEmployeEtDepartement("Alice", "Finance");

        // Rechercher un employé
        System.out.println("Recherche de l'employé 'John' : " + affectationMap.rechercherEmploye("John"));

        // Rechercher un département
        System.out.println("Recherche du département 'Ressources humaines' : " + affectationMap.rechercherDepartement("Ressources humaines"));

        // Trier la collection
        System.out.println("--- Liste des employés triés ---");
        TreeMap<String, String> sortedMap = affectationMap.trierMap();
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + ", Département : " + entry.getValue());
        }
    }
}

