/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojavirtual;

/**
 *
 * @author luan.vviana
 */
public class eletronicos extends Produto{
    
    private String marca;
    private String modelo;

    public eletronicos(String marca, String modelo, String nome, double preco) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    @Override
    public String toString() {
        return super.toString() + "eletronicos{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
}
