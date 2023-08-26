/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojavirtual;

/**
 *
 * @author luan.vviana
 */
public class LojaVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var liv1 = new livros("Jason momoa", "A culpa é das estrelas", 100);
        var tv = new eletronicos("SAMSUNG", "55 Polegadas", "TV", 3400.00);
        
        System.out.println(liv1.toString());
        System.out.println(tv.toString());
    }
    
}
