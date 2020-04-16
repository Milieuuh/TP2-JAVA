public class Etudiant extends Personne {
    private String promotion;
    private int nbAbsence;


    public Etudiant()
    {
        super();
        promotion="Inconnue";
        nbAbsence=0;
    }

    public Etudiant(String nom, String prenom, int age, String promotion)
    {
        super(nom,prenom,age);
        this.promotion=promotion;
        this.nbAbsence=0;
    }

    //ACCESSEUR ET MUTATEUR
    public String getPromotion()
    {
        return promotion;
    }

    public void setPromotion(String promotion)
    {
        this.promotion=promotion;
    }

    public int getNbAbsence()
    {
        return this.nbAbsence;
    }

    public void setNbAbsence(int nbAbsence) {
        this.nbAbsence=nbAbsence;
    }

    ///methodes
    public String toString()
    {
        return super.toString()+ " Promotion "+this.getPromotion()+". Nombre d'absences : "+this.getNbAbsence();
    }
}
