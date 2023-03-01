/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConsultarPagos {

    public static String dato;

    //Hora
    public static LocalTime horaActual = LocalTime.now();
    public static String horaFormateada = horaActual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    //Fecha
    public static Date fecha = new Date();
    public static SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");

    public static void serviciopublico() {
        int cedula = 208380510;
        String nombre = "Tony";

        String opciones = "                          Sistema Pago de Servicios Públicos                            \n";
        opciones += "                          Tienda la Favorita - Ingreso de Datos                            \n";
        opciones += "\n";
        opciones += "Número de pago:\n"; // + Pago 
        opciones += "Hora:   " + horaFormateada + "                                  Fecha:   " + formateadorFecha.format(fecha);
        opciones += "\n";
        opciones += "Cédula:   " + cedula + "                         Nombre: " + nombre + "\n";
        opciones += "Apellido 1:   " + "                                        Apellido 2:   \n";
        opciones += "\n";
        opciones += "Tipo de Servicio: " + "                           [1- Electricidad 2-Teléfono 3-Agua]";
        opciones += "\n";
        opciones += "Número de factura:   " + "                       Monto a pagar:   \n";
        opciones += "Comisión autorizada:   " + "                    Paga con:   \n";
        opciones += "Monto deducido:   " + "                             Vuelto:   \n";
        opciones += "\n";
        opciones += "                                ¿Desea Continuar S/N?                      \n\n";

        dato = JOptionPane.showInputDialog(opciones);
        dato = dato.toLowerCase();
        JOptionPane.showMessageDialog(null, dato);

    }
}
