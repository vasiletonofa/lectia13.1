package automobil;

public class AutomobilService {


    public void apeleazaMetodele(Automobil automobil) { // Automobil automobil = new AutomobilElectric()
         automobil.accelereaza(); // Accelereaza AutomobilElectric

         if(automobil instanceof AutomobilElectric) { // true
             AutomobilElectric automobilElectric = (AutomobilElectric) automobil;
             automobilElectric.incarcaBateria(); // Incarcam bateria AutomobilElectric
             System.out.println("Kw: " + automobilElectric.kw);
         }

         if (automobil instanceof AutomobilCombustibil) { // false
             AutomobilCombustibil automobilCombustibil = (AutomobilCombustibil)automobil;
             automobilCombustibil.alimenteaza();
             System.out.println("combustibil: " + automobilCombustibil.combustibil);
         }
    }
}
