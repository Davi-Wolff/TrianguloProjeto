package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

/**
 *
 * @author daviw
 */
public class Principal {
    
    public static void main(String[] args){
        
        Triangulo tri = new Triangulo();
        
        tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: ")));
        tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: ")));
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + tri.getArea());
        
    }
}
