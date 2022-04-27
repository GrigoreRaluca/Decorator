package ro.ase.cts.Decorator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MasinaClasica> masini = new ArrayList<>();
        ArrayList<DecoratorMasina> masiniii=new ArrayList<>();
        MasinaClasica masinaClasica=new MasinaClasica(true);
        DecoratorMasina masina=new DecoratorMasina(false);
        masini.add(masinaClasica);
        masiniii.add(masina);
        masini.get(0).pornesteMotor(false);

        masiniii.get(0).pornesteMotor(true);
    }
}
