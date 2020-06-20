package sedmi.composition;


public class Kuca {
    
    private Soba soba;
    private Dimenzije dimenzije;

    public Kuca(Soba soba, Dimenzije dimenzije) {
        this.soba = soba;
        this.dimenzije = dimenzije;
    }
    
    public void ulazakUKucu(){
        soba.openingDoors();
    }
}
