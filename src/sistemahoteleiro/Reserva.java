/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahoteleiro;

/**
 *
 * @author rfl
 */
public class Reserva extends SistemaHoteleiro {
    private int quantDiarias;
    private int quantPessoas;
    
    

    public int getQuantDiarias() {
        return quantDiarias;
    }

    public void setQuantDiarias(int quantDiarias) {
        this.quantDiarias = quantDiarias;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }
    
    public void reservar(String num, String hospede, int idade, int diarias,
            int capacidade, float valor){
        
        if (idade > 2) this.quantPessoas++;
        
        if (quantPessoas > capacidade) {
            System.out.println("Esta suíte aceita receber até "+ capacidade +
                    " pessoas, portanto, tente novamente.");
        } else {
        
            float preco = diarias * valor;

            if (diarias > 7) preco = preco - ((preco * 10) / 100);
            
            System.out.println("Suíte nº "+ num +" reservada para "+ hospede +" com sucesso!");
            
            System.out.println("Quantidade de dias: "+ diarias);
            
            System.out.println("Valor da suite: R$ "+ valor);
            
            System.out.println("Valor total: R$ "+ preco);
        }
        
        System.out.println("Pessoas reservadas para a suite com mais de 2 anos: " + quantPessoas +
                "\n-------------------------------------------------\n");
    }
    
}
