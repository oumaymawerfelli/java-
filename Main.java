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
    }
}