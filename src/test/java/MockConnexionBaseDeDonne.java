

public class MockConnexionBaseDeDonne implements IConnexionBaseDeDonnee {
    @Override
    public void connexion() {
        System.out.println("connecte...");
    }

    @Override
    public void getUtilisateur() throws Exception {
        System.out.println("utilisateur retourné...");
    }
}
