public class Main {

    public static void main(String[] args) {

        //etudiants
        Etudiant e1= new Etudiant("Dupont","Alice",21,"Pascal");
        Etudiant e2= new Etudiant("Dujardin","Benjamin",22,"Ohm");
        Etudiant e3= new Etudiant();
        Etudiant e4= new Etudiant();

        //administratif
        Administratif a1=new Administratif("Dupont","Béatrice",19,"Administratif","Enseignant");

        //Enseignant
        Enseignant en1 = new Enseignant("Machin", "Boris", 36, "Enseignant", "Informatique", "Electronique");
        System.out.println(en1.toString());

        System.out.println(a1.toString());
        a1.ouMeTrouver();
        e1.ouMeTrouver();

    }
}
