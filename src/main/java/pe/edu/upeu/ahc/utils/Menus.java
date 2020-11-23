package pe.edu.upeu.ahc.utils;

import pe.edu.upeu.ahc.examen.ResolucionExamen;

public class Menus {

    public static void MenuOpt(LeerTeclado teclado) {
        int numberOption;
        ResolucionExamen examen = new ResolucionExamen();

        System.out.println(
                "Escoge una opcion :\n[1] Problema 1 AHC\n[2] Problema 2 AHC\n[3] Problema 3 AHC\n[4] Problema 4 AHC\n[0] Salir\n");
        System.out.print("\n==> ");
        numberOption = LeerTeclado.lector(3);

        switch (numberOption) {
            case 1:
                examen.problema1();
                repeatCicle(teclado);
                break;
            case 2:
                examen.problema2();
                repeatCicle(teclado);
                break;
            case 3:
                examen.problema3();
                repeatCicle(teclado);
                break;
            case 4:
                int n, e;
                System.out.println("Dame el numero base: ");
                n = LeerTeclado.lector(0);
                System.out.println("Dame un numero exponencial: ");
                e = LeerTeclado.lector(0);

                System.out.println(examen.problema4(n, e));
                repeatCicle(teclado);
                break;
            case 0:
                System.out.println("Gracias Chau");
                break;
            default:
                System.out.println("No existe ese valor....");
                repeatCicle(teclado);

        }
    }

    public static void repeatCicle(LeerTeclado teclado) {
        int numberOption;
        System.out.print("\n\nDeseas volver al Menú: \n[1] SI \n[2] NO \n\n==> ");
        numberOption = LeerTeclado.lector(3);

        if (numberOption == 1) {
            MenuOpt(null);
        } else if (numberOption == 2) {
            System.out.println("\nNos Vemos");
        } else {
            System.out.println("\nNo existen esas Opciones....");
            repeatCicle(null);
        }
    }
}
