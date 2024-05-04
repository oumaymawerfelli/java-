public class Departement {

    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur sans paramètre
    public Departement() {

    }

    // Constructeur avec tous les paramètres
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id == departement.id && nomDepartement.equals(departement.nomDepartement);
    }

    // Redéfinition de la méthode toString

    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
