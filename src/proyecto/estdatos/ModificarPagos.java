/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class ModificarPagos {

    public static void serviciopublico() {
        int i = 0;
        String dato;
        boolean t = false;
        
        
        while (true) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la factura que desea modificar "));
            if (Variables.numfactura[i] != num) {
                JOptionPane.showMessageDialog(null, "**Numero modificado diferente**", "ERROR", JOptionPane.ERROR_MESSAGE);
                i++;
            } else {
                String op = "                          Sistema Pago de Servicios Públicos                            \n";
                op += "                          Tienda la Favorita - Modificar Datos                            \n";
                op += "\n";
                op += "Número de pago: " + Variables.numfactura[num] + " \n"; // + Pago 
                op += "A- Hora: " + Variables.horaFormateada[num] + "                                  B -Fecha: " + Variables.fecha[num];
                op += "\n";
                op += "C-Cédula: " + Variables.cedula[num] + "                       D- Nombre: " + Variables.nombre[num] + "\n";
                op += "E-Apellido 1: " + Variables.apellido1[num] + "                              F- Apellido 2: " + Variables.apellido2[num] + "\n";
                op += "\n";
                op += "G-Tipo de Servicio: " + Variables.tipo[num] + "                           [1- Electricidad 2-Teléfono 3-Agua]";
                op += "\n";
                op += "H-Número de factura: " + Variables.numfac + "                    Monto a pagar: " + Variables.montopagar[num] + " \n";
                op += "Comisión autorizada: " + Variables.comision[num] + "                   I- Paga con: " + Variables.montopagado[num] + " \n";
                op += "Monto deducido: " + Variables.montodeducido + "                             Vuelto: " + Variables.vuelto + " \n";
                op += "\n";
                op += "                        ¿Desea continuar a modificar S/N?                        \n\n";

                dato = JOptionPane.showInputDialog(op);
                dato = dato.toLowerCase().trim();

                if (dato.equals("s")) {
                    Imprimir2(dato, num, t);
                    break;
                } else {

                    JOptionPane.showMessageDialog(null, "**Regresando al menú principal**");
                }
            }
        }
    }

    public static void Imprimir2(String s, int num, boolean t) {

        String[] tipo = {"Electricidad", "Teléfono", "Agua"};
        
        do {
            String modificar = JOptionPane.showInputDialog("Seleccione la opcion a modificar \n"+"A- Hora: " + Variables.horaFormateada[num]+"\nB- Fecha: " + Variables.fecha[num] +"\nC- Cédula: " + Variables.cedula[num]+"\nD- Nombre: " + 
                    Variables.nombre[num] + "\n"+"E- Apellido 1: " + Variables.apellido1[num] +"\nF- Apellido 2: " + Variables.apellido2[num] + "\n"+"G- Tipo de Servicio: " + Variables.tipo[num] +"\nH- Número de factura: " + Variables.numfac 
             +"\nI- Paga con: " + Variables.montopagado[num]);
            modificar = modificar.toLowerCase().trim();

            if (modificar.equals("a")) {
                String hora = JOptionPane.showInputDialog("¿Desea cambiar la hora? formato: hh:mm:ss ");
               JOptionPane.showMessageDialog(null, "**Hora anterior: "+Variables.horaFormateada[num] +" hora deseada: "+ hora, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.horaFormateada[num] = hora;
                
            }

            if (modificar.equals("b")) {
                String fecha = JOptionPane.showInputDialog("¿Desea cambiar la Fecha? formato: dd/MM/yyyy");
                JOptionPane.showMessageDialog(null, "**fecha anterior: "+Variables.fecha[num] +" fecha deseada: "+ fecha, "Confirmacion", JOptionPane.OK_OPTION);
                 Variables.fecha[num] = fecha;   

            }

            if (modificar.equals("c")) {
                String cedula = JOptionPane.showInputDialog("¿Desea cambiar la Cedula?");
                JOptionPane.showMessageDialog(null, "**Cedula anterior: "+Variables.cedula[num] +" cedula cambiada a : "+ cedula, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.cedula[num] = cedula;
            }
            if (modificar.equals("d")) {
                String nombre = JOptionPane.showInputDialog("¿Desea cambiar el Nombre?");
                JOptionPane.showMessageDialog(null, "**Nombre anterior: "+Variables.nombre[num] +" nombre cambiado a: "+ nombre, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.nombre[num] = nombre;

            }
            if (modificar.equals("e")) {
                String apellido1 = JOptionPane.showInputDialog("¿Desea cambiar el primer apellido?");
                JOptionPane.showMessageDialog(null, "**Primer apellido anterior: "+Variables.apellido1[num] +" primer apellido cambiado a: "+ apellido1, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.apellido1[num] = apellido1;

            }
            if (modificar.equals("f")) {
                String apellido2 = JOptionPane.showInputDialog("¿Desea cambiar el segundo apellido?");
                JOptionPane.showMessageDialog(null, "**Segundo apellido anterior: "+Variables.apellido2[num] +" segundo apellido cambiado a : "+ apellido2, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.apellido2[num] = apellido2;

            }
            if (modificar.equals("g") ) {
                 int servicio = JOptionPane.showOptionDialog(null, "Seleccióne el servicio que desea pagar", "Tipo de dato", 0, 3, null, tipo, 2);
                 servicio++;
                 JOptionPane.showMessageDialog(null, "    [1- Electricidad   2-Teléfono    3-Agua]   \n"
                         + "**Servicio anterior: "+Variables.tipo[num] +" Servicio deseada: "+ servicio, "Confirmacion", JOptionPane.OK_OPTION);
                Variables.tipo[num] = servicio;
            }

            if (modificar.equals("h")) {
                int numfactur = Integer.parseInt(JOptionPane.showInputDialog("¿Desea cambiar el numero de factura?"));
                JOptionPane.showMessageDialog(null, "**Numero de factura anterior: "+ Variables.numfac +" numero de factura a sido cambiado a : "+ numfactur, "Confirmacion", JOptionPane.OK_OPTION);
                 Variables.numfac = numfactur;

            }

            if (modificar.equals("i") ) {
                double pagarc;
                while (true) {
                 pagarc = Double.parseDouble(JOptionPane.showInputDialog(null, "Monto a cancelar de " + Variables.montopagar[num] + "\nDigite con cuanto va a cancelar:"));
                if (pagarc < Variables.montopagar[num]) {
                    JOptionPane.showMessageDialog(null, "**Monto digitado es menor al monto requerido**", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            }
                
                JOptionPane.showMessageDialog(null, "**Pago anterior: "+Variables.montopagado[num] +" Monto paga a sido cambiado a : "+ pagarc, "Confirmacion", JOptionPane.OK_OPTION);
                 Variables.montopagado[num] = pagarc;

            }
            
            String op = "                          Sistema Pago de Servicios Públicos                            \n";
                op += "                          Tienda la Favorita - Modificar Datos                            \n";
                op += "\n";
                op += "Número de pago: " + Variables.numfactura[num] + " \n"; // + Pago 
                op += "A- Hora: " + Variables.horaFormateada[num] + "                                  B -Fecha: " + Variables.fecha[num];
                op += "\n";
                op += "C-Cédula: " + Variables.cedula[num] + "                       D- Nombre: " + Variables.nombre[num] + "\n";
                op += "E-Apellido 1: " + Variables.apellido1[num] + "                              F- Apellido 2: " + Variables.apellido2[num] + "\n";
                op += "\n";
                op += "G-Tipo de Servicio: " + Variables.tipo[num] + "                           [1- Electricidad 2-Teléfono 3-Agua]";
                op += "\n";
                op += "H-Número de factura: " + Variables.numfac + "                    Monto a pagar: " + Variables.montopagar[num] + " \n";
                op += "Comisión autorizada: " + Variables.comision[num] + "                   I- Paga con: " + Variables.montopagado[num] + " \n";
                op += "Monto deducido: " + Variables.montodeducido + "                             Vuelto: " + Variables.vuelto + " \n";
                op += "\n";
                op += "                        **Pago modificado con éxito**                        \n\n";
                op += "                        **Desea modificar otro dato S/N**                        \n\n";
            
                s = JOptionPane.showInputDialog(op);
                s = s.toLowerCase().trim();
                t = s.equals("s");
        }while(t == false);

        
        
    }

}
