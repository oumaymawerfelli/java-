import java.util.TreeSet;
public interface IDepartement<Departement>{
    public void ajouterDepartement(Departement departement);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(Departement departement);
    public void supprimerDepartement(Departement departement);
    public void displayDepartement();
    public TreeSet<Departement> trierDepartementById();
}
