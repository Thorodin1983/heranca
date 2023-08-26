/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojavirtual;

/**
 *
 * @author luan.vviana
 */
public class livros extends Produto{
    
    private String autor;

    public livros(String autor, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "livros{" + "autor=" + autor + '}';
    }
    
    
}
