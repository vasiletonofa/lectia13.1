package automobil;

public class AutomobilCombustibil extends Automobil {

    public int combustibil = 0;

    @Override
    public void accelereaza() {
        System.out.println("Accelereaza AutomobilCombustibil");

    }

    public void alimenteaza() {
        System.out.println("Alimentez combustibil AutomobilCombustibil");
        combustibil++;
    }


}
