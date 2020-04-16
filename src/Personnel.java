public class Personnel extends Personne {

    private String service;

    //CONSTRUCTOR
    public Personnel()
    {
        super();

    }

    public Personnel(String nom, String prenom, int age, String service)
    {
        //Permet d'appeler le constructeur de la classe Personne pour initialiser les attributs
        super(nom,prenom,age);
        this.service= service;
    }

    //SETTER ET GETTER
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}
