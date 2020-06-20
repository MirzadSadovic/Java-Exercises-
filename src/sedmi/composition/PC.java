package sedmi.composition;


public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButtor();
        drawLogo();
        startingProgram();
    }
    private void drawLogo(){
        //Fency graphics
        monitor.drawPixelAt(1200, 600, "Blue");
    }
    private void startingProgram(){
        motherboard.loadProgram("Ubuntu 11.0");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    
}
