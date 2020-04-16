public class Personnel extends Personne {

    //CONSTRUCTOR
    public Personnel()
    {
        super();
    }

    public Personnel(String nom, String prenom, int age)
    {
        super(nom,prenom,age);
    }

    public void AfficherAge()
    {
        System.out.println("Ce personnel a "+ age + "an(s)");
    }
}
