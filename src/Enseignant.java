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

    //METHODE POUR AFFICHER
    public String toString()
    {
        return super.toString()+"\nMatière Principale : "+this.getMatierePrincipale()+"\nMatière secondaire : "+ this.getMatiereSecondaire();
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
