import java.util.TreeMap;
import java.util.HashMap;

public class AffectationHashMap {
    private HashMap<String, String> affectations; // Clé : Employé, Valeur : Département

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Méthode pour affecter un employé à un département
    public void affecterEmploye(String employe, String departement) {
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }

    // Méthode pour récupérer le département d'un employé
    public String getDepartement(String employe) {
        return affectations.get(employe);
    }

    // Méthode pour afficher tous les employés et les départements auxquels ils sont affectés
    public void afficherEmployesEtDepartements() {
        for (String employe : affectations.keySet()) {
            String departement = affectations.get(employe);
            System.out.println("Employé : " + employe + ", Département : " + departement);
        }
    }
    // Méthode pour supprimer un employé de la collection
    public void supprimerEmploye(String employe) {
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("L'employé " + employe + " a été supprimé de la collection.");
        } else {
            System.out.println("Cet employé n'existe pas dans la collection.");
        }
    }
    // Méthode pour supprimer un employé travaillant dans un département spécifique
    public void supprimerEmployeEtDepartement(String employe, String departement) {
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
            affectations.remove(employe);
            System.out.println("L'employé " + employe + " travaillant dans le département " + departement + " a été supprimé de la collection.");
        } else {
            System.out.println("Cet employé ne travaille pas dans le département spécifié ou n'existe pas dans la collection.");
        }
    }  public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (String employe : affectations.keySet()) {
            System.out.println("- " + employe);
        }
    }public boolean rechercherEmploye(String employe) {
        return affectations.containsKey(employe);}
    // Méthode pour rechercher un département dans la collection
    public boolean rechercherDepartement(String departement) {
        return affectations.containsValue(departement);
    }
    public TreeMap<String, String> trierMap() {
        TreeMap<String, String> sortedMap = new TreeMap<>(affectations);
        return sortedMap;
    }
    // Méthode pour afficher la liste des départements

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (String departement : affectations.values()) {
            System.out.println("- " + departement);
        }
    }}