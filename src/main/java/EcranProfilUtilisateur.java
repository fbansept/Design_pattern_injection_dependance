public class EcranProfilUtilisateur {

    private IConnexionBaseDeDonnee connexionBaseDeDonnee;
    private IGenerationPdf generationPdf;

    public EcranProfilUtilisateur(
            IConnexionBaseDeDonnee connexionBaseDeDonnee,
            IGenerationPdf generationPdf) {

        this.connexionBaseDeDonnee = connexionBaseDeDonnee;
        this.generationPdf = generationPdf;
    }

    public void generePdfProfilUtilisateur() throws Exception {
        connexionBaseDeDonnee.getUtilisateur();
        generationPdf.generate();
    }
}
