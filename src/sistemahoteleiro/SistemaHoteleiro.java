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
public class SistemaHoteleiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hospede h1 = new Hospede();
        h1.setNome("Rafael");
        h1.setEndereco("Avenida Olegario Maciel, 321");
        h1.setIdade(26);
        
        Hospede h2 = new Hospede();
        h2.setNome("Lucas");
        h2.setEndereco("Avenida Otacílio Negrão de Lima, 1313");
        h2.setIdade(24);
        
        Hospede h3 = new Hospede();
        h3.setNome("Viviane");
        h3.setEndereco("Avenida Professor Mário Werneck, 2021");
        h3.setIdade(2);
        
        Suite s010 = new Suite();
        s010.setNumero("010");
        s010.setCapacidade(2);
        s010.setTipo("Simples");
        s010.setValor(50.0f);
        
        
        Reserva r1 = new Reserva();
        r1.reservar(s010.getNumero(), h1.getNome(), h1.getIdade(), 10, s010.getCapacidade(), s010.getValor());
        r1.reservar(s010.getNumero(), h2.getNome(), h2.getIdade(), 10, s010.getCapacidade(), s010.getValor());
        r1.reservar(s010.getNumero(), h3.getNome(), h3.getIdade(), 10, s010.getCapacidade(), s010.getValor());
    }
    
}
