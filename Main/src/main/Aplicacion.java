package main;

import javax.swing.JOptionPane;

public class Aplicacion implements AplicacionInterface {


    public static void Iniciar(){


        int opcion = Integer.MIN_VALUE;

        do {
            opcion = Menu();
            Acciones(opcion);

        } while (opcion != 0);
        

    }

    private static int Menu(){
        String opcion = JOptionPane.showInputDialog(
            "Menú:\n"+
            "1. Modulo usuario: \n"+
            "4. Salir"
        );
        return Integer.parseInt(opcion);
    }

    private static void Acciones(int opcion)
    {
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Selecciono el modúlo Usuarios");
                int opcion_submenu = UsuarioAplicacion.Menu();
                UsuarioAplicacion.Acciones(opcion_submenu);
                break;
            
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }
    }

}
