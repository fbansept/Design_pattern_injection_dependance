

public class ConnexionBaseDeDonnee implements IConnexionBaseDeDonnee {

    @Override
    public void connexion() {
        System.out.println("VRAI CONNEXION");
    }

    @Override
    public void getUtilisateur() throws Exception {
        throw new Exception("Methode boguée");
    }
}
