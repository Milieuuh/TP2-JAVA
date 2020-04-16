public class Personne {
    //Attributs
    private String nom;
    public String prenom;
    protected int age;

    //Constructeurs
        public Personne()
        {
            nom="Anonyme";
            prenom="Anonyme";
            age=-1;
        }

    public Personne(String nom, String prenom, int age)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
}
