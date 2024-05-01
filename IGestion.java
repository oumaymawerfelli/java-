public interface IGestion {

        public void ajouterEmploye(Employe employe);

        public boolean rechercherEmploye(String nom);

        public boolean rechercherEmploye(Employe employe);

        public void supprimerEmploye(Employe employe);

        public void displayEmploye();

        public void trierEmployeParId();
    }

