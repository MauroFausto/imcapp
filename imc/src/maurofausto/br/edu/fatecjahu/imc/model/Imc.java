/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maurofausto.br.edu.fatecjahu.imc.model;

import static java.lang.Math.pow;


/**
 *
 * @author Alex
 */
public class Imc {
    
    public float altura;
    public float peso;
    public double imc;
    
    //Construtor Padrão (Default).
    public Imc() {
    }
    
    //Construtor com 3 argumentos.
    public Imc(float altura, float peso, double imc) {
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }
    
    // Métodos Getters and Setters.
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    // Método para Impressão dos atributos.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imc { \naltura = ").append(altura);
        sb.append(",\n peso = ").append(peso);
        sb.append(",\n imc = ").append(imc);
        sb.append("\n}");
        return sb.toString();
    }
    
    // Método para calcular o IMC.
    public double calcularImc(float altura, float peso){
        // imc = peso / (altura * altura);
        // função pow é a função potência(base, expoente) da classe Math.
        imc = peso / pow(altura, 2); 
        return imc;
    }    
    
}
