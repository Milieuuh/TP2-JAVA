public class Etudiant extends Personne {
    private String promotion;


    public Etudiant()
    {
        super();
        promotion="Inconnue";
    }

    public Etudiant(String nom, String prenom, int age, String promotion)
    {
        super(nom,prenom,age);
        this.promotion=promotion;
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
}
