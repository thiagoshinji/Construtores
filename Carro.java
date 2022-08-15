
package Aula5;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }
    
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = consumoCombustivel_;
        consumoCombustivel = consumoCombustivel_;
        
    }
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro is:" + capCombustivel * consumoCombustivel + " km");
    }
    
    double obterAutonomia() {
        System.out.println("Metodo obter autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
    
    double caulcularCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
