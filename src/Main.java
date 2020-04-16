public class Main {

    public static void main(String[] args) {

        Personne tabPersonne[]=new Personne[5];

        //etudiants
        Etudiant e1= new Etudiant("Dupont","Alice",21,"Pascal");
        Etudiant e2= new Etudiant("Dujardin","Benjamin",22,"Ohm");
        Etudiant e3= new Etudiant();
        Etudiant e4= new Etudiant();

        //administratif
        Administratif a1=new Administratif("Dupont","Béatrice",19,"Administratif","Secrétaire");

        //Enseignant
        Enseignant en1 = new Enseignant("Machin", "Boris", 36, "Enseignant", "Informatique", "Electronique");
       /* System.out.println(en1.toString());

        System.out.println(a1.toString());
        a1.ouMeTrouver();
        e1.ouMeTrouver();*/

       //Tableau des personnes
        tabPersonne[0]=e1;
        tabPersonne[1]=e2;
        tabPersonne[2]=e3;
        tabPersonne[3]=e4;
        tabPersonne[4]=a1;
        tabPersonne[5]=en1;

        for(int i=0;i<tabPersonne.length;i++)
        {
            System.out.println(tabPersonne[i].toString());
            tabPersonne[i].ouMeTrouver();
        }
    }
}
