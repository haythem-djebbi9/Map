import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestion = new AffectationHashMap();

        // Créer des employés et départements
        Employe e1 = new Employe(1, "Alice");
        Employe e2 = new Employe(2, "Bob");
        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Marketing");

        // Ajouter des employés aux départements
        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);

        // Afficher les affectations
        System.out.println("Affectations:");
        gestion.afficherEmployesEtDepartements();

        // Tester ajout du même employé dans un autre département
        gestion.ajouterEmployeDepartement(e1, d2);
        System.out.println("\nAprès modification:");
        gestion.afficherEmployesEtDepartements();

        // Rechercher employé et département
        System.out.println("\nRecherche employé:");
        System.out.println(gestion.rechercherEmploye(e1));
        System.out.println("\nRecherche département:");
        System.out.println(gestion.rechercherDepartement(d1));

        // Supprimer un employé
        gestion.supprimerEmploye(e2);
        System.out.println("\nAprès suppression:");
        gestion.afficherEmployesEtDepartements();

        // Trier et afficher les employés
        System.out.println("\nAffectations triées:");
        TreeMap<Employe, Departement> triees = gestion.trierMap();
        triees.forEach((e, d) -> System.out.println(e + " -> " + d));
    }
}
