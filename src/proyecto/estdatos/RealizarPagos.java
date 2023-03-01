/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estdatos;

import java.util.Random;
import javax.swing.JOptionPane;
import static proyecto.estdatos.ConsultarPagos.dato;
import static proyecto.estdatos.ProyectoEstDatos.Valores;
import static proyecto.estdatos.ProyectoEstDatos.num;
import static proyecto.estdatos.ProyectoEstDatos.money;


/**
 *
 * @author Diego
 */
public class RealizarPagos {

    public static void serviciopublico() {

        String[] tipo = {"Electricidad", "Teléfono", "Agua"};

        int i = 0;
        i++;
        Boolean y = false;
        ConsultarPagos a = new ConsultarPagos();
        Random random = new Random();

        num[0] = i;

        String opciones = "                          Sistema Pago de Servicios Públicos                            \n";
        opciones += "                          Tienda la Favorita - Ingreso de Datos                            \n";
        opciones += "\n";
        opciones += "Número de pago: " + num[0] + " \n"; // + Pago 
        opciones += "Hora:   " + a.horaFormateada + "                                  Fecha:   " + a.formateadorFecha.format(a.fecha);
        opciones += "\n";
        opciones += "Cédula:   " + num[1] + "                         Nombre: " + Valores[0] + "\n";
        opciones += "Apellido 1:   " + Valores[1] + "                               Apellido 2: " + Valores[2] + "\n";
        opciones += "\n";
        opciones += "Tipo de Servicio: " + "                           [1- Electricidad 2-Teléfono 3-Agua]";
        opciones += "\n";
        opciones += "                                ¿Desea Continuar  para pagar S/N ?                      \n\n";

        dato = JOptionPane.showInputDialog(opciones);
        dato = dato.toLowerCase().trim() ;
        if (dato.equals("s")) {
            num[2] = random.nextInt(3);
            num[3] = JOptionPane.showOptionDialog(null, "Seleccióne el servicio que desea pagar", "Tipo de dato", 0, 3, null, tipo, tipo[0]);
            num[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de factura"));
            if (num[3] == 0) {
                money[0] = 12500;
                money[1] = money[0]*0.04;
            }
            if (num[3] == 1) {
                money[0] = 15000;
                money[1] = money[0]*0.055;
            }
            if (num[3] == 2) {
                money[0] = 13500;
                money[1] = money[0]*0.065;
            }
            
            money[2] = money[0]-money[1];
            while (true) {                
                money[3] = Double.parseDouble(JOptionPane.showInputDialog(null,"Monto a cancelar "+money[0]+
                        "\nDigite con cuanto va a cancelar"));
                if(money[3] < money[0]){
                    JOptionPane.showMessageDialog(null, "Monto digitado es menor al monto requerido", dato, i);
                }else{
                    break;
                }
            }
            money[4] = money[3] - money[0];
            
            String op = "                          Sistema Pago de Servicios Públicos                            \n";
        op += "                          Tienda la Favorita - Ingreso de Datos                            \n";
        op += "\n";
        op += "Número de pago: " + num[0] + " \n"; // + Pago 
        op += "Hora:   " + a.horaFormateada + "                                  Fecha:   " + a.formateadorFecha.format(a.fecha);
        op += "\n";
        op += "Cédula:   " + num[1] + "                         Nombre: " + Valores[0] + "\n";
        op += "Apellido 1:   " + Valores[1] + "                               Apellido 2: " + Valores[2] + "\n";
        op += "\n";
        op += "Tipo de Servicio: " + num[3] +"                           [1- Electricidad 2-Teléfono 3-Agua]";
        op += "\n";
        op += "Número de factura:   " + num[4]+ "                    Monto a pagar:  "+money[0]+" \n";
        op += "Comisión autorizada:   " + money[1] + "                    Paga con:  "+money[3]+" \n";
        op += "Monto deducido:   " + money[2]+"                             Vuelto:  "+money[4]+" \n";
        op += "\n";
        op += "                                ¿Desea Continuar  para pagar S/N ?                      \n\n";
            
        
        dato = JOptionPane.showInputDialog(op);
        dato = dato.toLowerCase();
        
        
        }else{
            JOptionPane.showMessageDialog(null, dato);
        }

        
    }
    //       0                      1              2                    3             4          
    //Mpagar,           Mcomision, Mdeducido ,MpagaCliente, Vuelto
    //numero de pago, cedula,     nCaja,            Tservicio, nFactura, 
    //nombre,             apellido1, apellido2, 
}
