/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclomedia;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class CicloMedia {

    int  nums, media, total, contador;
    char sino;
    
    public void Media(){
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        System.out.println(total);
        sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (si/no)").charAt(0);
        while (sino=='s') {
            contador = contador + 1;
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para calcular la media"));
            System.out.println(nums);
            total += nums;
            sino = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n)").charAt(0);
        }
        media = total/contador;
        System.out.println("La media es de: " + media);
    }
    
    public static void main(String[] args) {
        CicloMedia Ciclo = new CicloMedia();
        Ciclo.Media();
    }
    
}
