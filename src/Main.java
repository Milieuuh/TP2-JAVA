public class Main {

    public static void main(String[] args) {

        Personne tabPersonne[]=new Personne[6];

        //etudiants
        Etudiant e1= new Etudiant("Dupont","Alice",21,"Pascal");
        Etudiant e2= new Etudiant("Dujardin","Benjamin",22,"Ohm");
        Etudiant e3= new Etudiant();
        Etudiant e4= new Etudiant();

        //administratif
        Administratif a1=new Administratif("Dupont","Béatrice",19,
                                        "Administratif","Secrétaire");

        //Enseignant
        Enseignant en1 = new Enseignant("Machin", "Boris", 36,
                                        "Enseignant", "Informatique",
                                        "Electronique");
/*
       System.out.println(en1);
        System.out.println(a1);

        a1.ouMeTrouver();
        e1.ouMeTrouver();
        en1.ouMeTrouver();*/

        e3.setNom("Durand");
        e3.setPrenom("Paul");
        e3.setPromotion("Pascal");
        e3.setAge(16);

        e4.setNom("Moreau");
        e4.setPrenom("Jeanne");
        e4.setPromotion("Pascal");
        e4.setAge(25);


        //Tableau des personnes
        tabPersonne[0]=e1;
        tabPersonne[1]=e2;
        tabPersonne[2]=e3;
        tabPersonne[3]=e4;
        tabPersonne[4]=a1;
        tabPersonne[5]=en1;

        System.out.println("--------------------------------------------");
        for(int i=0;i<tabPersonne.length;i++)
        {
            System.out.println(tabPersonne[i]);
            tabPersonne[i].ouMeTrouver();
        }
    }
}
