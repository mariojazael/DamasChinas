package Models;

import Controllers.VistaPrincipalControlador;
import Views.VistaPrincipal;

public class Main {

    public static void main(String[] args) {
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        VistaPrincipalControlador vistaPrincipalControlador = new VistaPrincipalControlador(vistaPrincipal);
        vistaPrincipal.setVisible(true);
    }

}
