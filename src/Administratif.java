public class Administratif extends Personnel {

    private String fonction;

    public Administratif()
    {
        super();
        fonction="Inconnue";
    }

    public Administratif(String nom, String prenom, int age,
                         String service, String fonction)
    {
        super(nom,prenom,age,service);
        this.fonction=fonction;

    }

    //ACCESSEUR ET MUTATEUR
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String toString()
    {
        return  super.toString()+" - "+this.getFonction();
    }

    public void ouMeTrouver()
    {
        System.out.println("Le plus facile, c'est de passer à mon bureau.");
    }

}
