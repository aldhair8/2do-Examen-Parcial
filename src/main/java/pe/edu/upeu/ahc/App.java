package pe.edu.upeu.ahc;

import pe.edu.upeu.ahc.utils.LeerTeclado;
import pe.edu.upeu.ahc.utils.Menus;

public class App {

    public static void main(String[] args) {
        LeerTeclado teclado = new LeerTeclado();
        Menus.MenuOpt(teclado);
    }

}
