public class Enseignant extends Personnel {

    //ATTRIBUTS
    private String matierePrincipale;
    private String matiereSecondaire;

    //CONSTRUCTEURS
    public Enseignant()
    {
        super();
    }

    public Enseignant(String nom, String prenom, int age, String service, String matierePrincipale, String matiereSecondaire)
    {
        super(nom,prenom,age, service);
        this.matierePrincipale = matierePrincipale;
        this.matiereSecondaire = matiereSecondaire;
    }

    //METHODES
    public String toString()
    {
        return super.toString()+"\nMatière Principale : "+this.getMatierePrincipale()+"\nMatière secondaire : "+ this.getMatiereSecondaire();
    }

    public void ouMeTrouver()
    {
        System.out.println("Ce n’est pas la peine de me chercher, je saurai vous trouver !");
    }


    //GETTER SETTER
    public String getMatierePrincipale() {
        return matierePrincipale;
    }

    public void setMatierePrincipale(String matierePrincipale) {
        this.matierePrincipale = matierePrincipale;
    }

    public String getMatiereSecondaire() {
        return matiereSecondaire;
    }

    public void setMatiereSecondaire(String matiereSecondaire) {
        this.matiereSecondaire = matiereSecondaire;
    }




}
