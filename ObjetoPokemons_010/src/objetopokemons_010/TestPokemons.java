/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopokemons_010;

/**
 *
 * @author User
 */
public class TestPokemons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pokemon Poke1 = new PokemonAgua("Squirtel");
        Pokemon Poke2 = new PokemonFuego("Charmander");
        Pokemon Poke3 = new PokemonPiedra("Onix");
        
        
         System.out.println(Poke1);
         System.out.println(Poke1.ataque());
         
         System.out.println(Poke2);
         System.out.println(Poke2.ataque());
         
         System.out.println(Poke3);
         System.out.println(Poke3.ataque());
         
    }
    
}
