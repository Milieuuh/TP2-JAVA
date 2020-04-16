public class Personne {
    //Attributs
    private String nom;
    private String prenom;
    private int age;

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

    //ACCESSEURS
    public String getNom()
    {
        return  this.nom;
    }

    public String getPrenom()
    {
        return  this.prenom;
    }

    public int getAge()
    {
        return this.age;
    }

    //MUTATEURS
    public void setNom(String nom)
    {
        this.nom=nom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom=prenom;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    //Methodes

    public void AfficherAge()
    {
        System.out.println(this.getAge()+"ans");
    }


    public void AfficherNom()
    {
        System.out.println(this.getNom());
    }

    public void AfficherPrenom()
    {
        System.out.println(this.getPrenom());
    }

    public String toString()
    {
        return ""+this.getNom()+" "+this.getPrenom()+" "+this.getAge();
    }

    public void ouMeTrouver()
    {
        System.out.println("Je ne sais pas où je suis.");
    }
}


