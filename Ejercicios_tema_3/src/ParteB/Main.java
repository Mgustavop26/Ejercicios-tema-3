package ParteB;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.agregarPuertas(2);
        System.out.println("Cantida de puiertas que tiene el coche: "+micoche.getPuertas());

    }
}
