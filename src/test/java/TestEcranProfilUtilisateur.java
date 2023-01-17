import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEcranProfilUtilisateur {

    private Assembleur assembleur;

    @BeforeEach
    void prepare() {
        assembleur = new Assembleur();
    }

    @Test
    void testGenerePdfProfilUtilisateur() throws Exception {
        EcranProfilUtilisateur ecran = assembleur.getEcranProfilUtilisateur();
        ecran.generePdfProfilUtilisateur();
        Assertions.assertDoesNotThrow(() -> ecran.generePdfProfilUtilisateur());
    }

}
