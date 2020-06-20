package sedmi.composition;


public class Soba {
    
    private int walls;
    private int doors;
    private Dimenzije dimenzija;

    public Soba(int walls, int doors, Dimenzije dimenzija) {
        this.walls = walls;
        this.doors = doors;
        this.dimenzija = dimenzija;
    }
    public void openingDoors(){
        System.out.println("Otvaram ulazna vrata");
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public Dimenzije getDimenzija() {
        return dimenzija;
    }
    
    
}
