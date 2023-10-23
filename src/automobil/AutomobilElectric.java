package automobil;

public class AutomobilElectric extends Automobil {

    public int kw = 0;
    @Override
    public void accelereaza() {
        System.out.println("Accelereaza AutomobilElectric");
    }

    public void incarcaBateria() {
        System.out.println("Incarcam bateria AutomobilElectric");
        kw++;
    }
}
