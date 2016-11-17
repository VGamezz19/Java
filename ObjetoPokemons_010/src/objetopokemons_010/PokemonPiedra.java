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
public class PokemonPiedra extends Pokemon{
    
    public PokemonPiedra (String nombre) {
        super(nombre);
    }
    
    @Override
    public String ataque() {
       return "Ataque piedra";
    }
    
}
