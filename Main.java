import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList() {
        };

        // Ajout d'employés
        Employe emp1 = new Employe(1, "John", "Doe", "IT", 1);
        Employe emp2 = new Employe(2, "Jane", "Smith", "HR", 2);
        Employe emp3 = new Employe(3, "Alice", "Jones", "Finance", 3);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Recherche d'un employé par ID
        /*Employe employeRecherche = societe.chercherEmploye(2);
        if (employeRecherche != null) {
            System.out.println("Employé trouvé : " + employeRecherche);
        } else {
            System.out.println("Employé non trouvé.");
        }*/

        // Suppression d'un employé
        societe.supprimerEmploye(emp2);

        /// Affichage de la liste des employés
       /* System.out.println("Liste des employés : ");
        for (Employe employe : societe.listerEmployes()) {
            System.out.println(employe);
        }*/
    }
}
