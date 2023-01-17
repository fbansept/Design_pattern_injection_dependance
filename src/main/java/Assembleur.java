

public class Assembleur {

    EcranConnexion ecranConnexion;
    EcranProfilUtilisateur ecranProfilUtilisateur;

    public Assembleur() {
        ConnexionBaseDeDonnee connexionBaseDeDonnee = new ConnexionBaseDeDonnee();
        GenerationPdf generationPdf = new GenerationPdf();

        ecranConnexion =  new EcranConnexion(connexionBaseDeDonnee);
        ecranProfilUtilisateur =
                new EcranProfilUtilisateur(
                        connexionBaseDeDonnee,
                        generationPdf);

    }

    public EcranConnexion getEcranConnexion() {
        return ecranConnexion;
    }

    public EcranProfilUtilisateur getEcranProfilUtilisateur() {
        return ecranProfilUtilisateur;
    }
}
