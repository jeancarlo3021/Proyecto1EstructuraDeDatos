package proyecto.estdatos;

import javax.swing.JOptionPane;

public class ProyectoEstDatos {

        public static String [] Valores = new String [3];
        public static int [] num = new int[5];
        public static double [] money = new double[5];
        
    public static void main(String[] args) {

        
        //  Mpagar, Mcomision, MpagaCliente, Vuelto
        //numero de pago, cedula, nCaja, Tservicio, nFactura
        //nombre, apellido1, apellido2, 

        num[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de cedula"));
        Valores[0] = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        Valores[1] = JOptionPane.showInputDialog(null, "Ingrese su primer apellido");
        Valores[2] = JOptionPane.showInputDialog(null, "Ingrese su segundo apellido");

        if (!Valores[0].isBlank() && !Valores[1].isBlank() && !Valores[2].isBlank()) {
            while (true) {
                int menuprincipal = Integer.parseInt(JOptionPane.showInputDialog(null, " **Selecciona una de las opciones** "
                        + "\n 1. Realizar Pagos. "
                        + "\n 2. Consultar Pagos. "
                        + "\n 3. Modificar Pagos. "
                        + "\n 4. Eliminar Pagos. "
                        + "\n 5. Submenú Pagos. "
                        + "\n 6. Salida. \n\n"));
                switch (menuprincipal) {//Menu de Servicios Públicos
                    case 1:
                        RealizarPagos.serviciopublico();
                        break;
                    case 2:
                        ConsultarPagos.serviciopublico();
                        break;
                    case 3:
                        ModificarPagos.serviciopublico();
                        break;
                    case 4:
                        EliminarPagos.serviciopublico();
                        break;
                    case 5:
                        SubmenuReportes.serviciopublico();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, " **Saliendo del programa** ");
                        System.exit(0);

                }
            }
        }
    }

}//Fin de la clase 
