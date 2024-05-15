package main;

import javax.swing.JOptionPane;

public class UsuarioAplicacion implements AplicacionInterface {

    private static SistemaBancario sb = new SistemaBancario();

    public static int Menu(){
        String opcion = JOptionPane.showInputDialog(
            "Menú Usuario:\n"+
            "1. Crear usuario: \n"+
            "2. Listar usuarios: \n"+
            "3. Regresa"
        );
        return Integer.parseInt(opcion);
    }

    public static void Acciones(int opcion){

        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Ingreso a la accion de crear usuario");
                sb.CrearUsuario(TipoIdentificacion.CC, "Jairo", "Perez", 159753258);
                JOptionPane.showMessageDialog(null, "Usuario creado!");
                break;
            default:
                break;
        }
    }
}
