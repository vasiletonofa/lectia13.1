import automobil.Automobil;
import automobil.AutomobilCombustibil;
import automobil.AutomobilElectric;
import automobil.AutomobilService;

public class Main {
    public static void main(String[] args) {

//        Automobil automobil = new AutomobilElectric();
//
//        boolean isElectric = automobil instanceof AutomobilElectric; // true
//
//        boolean isCombustibil = automobil instanceof AutomobilCombustibil; // false
//
//
//        System.out.println("isElectric: " + isElectric);
//        System.out.println("isCombustibil: " + isCombustibil);



//        AutomobilElectric automobilElectric = new AutomobilElectric();
//        AutomobilCombustibil automobilCombustibil = new AutomobilCombustibil();
//
//        AutomobilService automobilService = new AutomobilService();
//        automobilService.apeleazaMetodele(automobilElectric);
//        automobilService.apeleazaMetodele(automobilElectric);
//        automobilService.apeleazaMetodele(automobilElectric);
//        automobilService.apeleazaMetodele(automobilCombustibil);
//        automobilService.apeleazaMetodele(automobilCombustibil);
//        automobilService.apeleazaMetodele(automobilCombustibil);


        Automobil automobil = new AutomobilCombustibil();
        automobil.accelereaza();

        Automobil automobil1 = new AutomobilElectric();

        AutomobilCombustibil automobilCombustibil = (AutomobilCombustibil) automobil;
        AutomobilElectric automobilElectric = (AutomobilElectric) automobil1;

        automobilCombustibil.accelereaza();
        automobilCombustibil.alimenteaza();
        automobilCombustibil.alimenteaza();
        System.out.println("combustibil: " + ++automobilCombustibil.combustibil);

        automobilElectric.accelereaza();
        automobilElectric.incarcaBateria();
        automobilElectric.incarcaBateria();
        System.out.println("automobilElectric: " + ++automobilElectric.kw);


    }
}