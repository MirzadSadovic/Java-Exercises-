package sedmi.composition;

public class KorisnikKuce {

    public static void main(String[] args) {

        Dimenzije dimenzije = new Dimenzije(4, 3, 3);
        Soba soba = new Soba(4, 1, dimenzije);
        Kuca kuca = new Kuca(soba, dimenzije);
        kuca.ulazakUKucu();
    }
}
