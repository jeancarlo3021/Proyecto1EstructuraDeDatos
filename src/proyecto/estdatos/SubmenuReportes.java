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
public class SubmenuReportes {
         public static int serviciopublico() {
             
          while (true) {
            int submenureportes = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una de las opciones"
                    + "\n 1.Ver todos los Pagos"
                    + " \n 2.Ver todos los Pagos"
                     + "\n 3.Ver Pagos por código de caja"
                    + " \n 4.Ver Dinero Comisionado por servicios"
                    + "\n 5.Regresar Menú Principal"));
            switch(submenureportes){ 
                case 1:
            VerPagos.submenureportes();
              break;
          case 2:
          VerTipoServicio.submenureportes();
          break;
          case 3:
             VerCodigoCaja.submenureportes();
              break;
          case 4:
            VerDineroComisionadoServicios.submenureportes();
              break;
       default:
                    JOptionPane.showMessageDialog(null, "Regresando al Menu principal...");
return submenureportes;
      
    
     
}
 }

    }

}//Fin