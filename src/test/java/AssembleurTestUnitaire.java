

public class AssembleurTestUnitaire {

    private EcranProfilUtilisateur ecranProfilUtilisateur;
    private EcranConnexion ecranConnexion;

    public AssembleurTestUnitaire() {
        IConnexionBaseDeDonnee connexionBaseDeDonnee = new MockConnexionBaseDeDonne();
        IGenerationPdf generationPdf = new MockGenerationPdf();

        ecranConnexion = new EcranConnexion(connexionBaseDeDonnee);

        ecranProfilUtilisateur = new EcranProfilUtilisateur(
                connexionBaseDeDonnee,generationPdf);
    }

    public EcranProfilUtilisateur getEcranProfilUtilisateur() {
        return ecranProfilUtilisateur;
    }
    public EcranConnexion getEcranConnexion() {
        return ecranConnexion;
    }
}
