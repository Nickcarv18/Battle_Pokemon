package battle_pokemon;

public class Batalha {
    
    private int meuPokemonVida;
    private int outroPokemonVida;
    private String meuPokemonNome;
    private String outroPokemonNome;
    
    public void meuPokemon(String nome, int vida){
        
        this.meuPokemonVida = vida;
        this.meuPokemonNome = nome;
        
    }
    
    public void outroPokemon(String nome, int vida){
        
        this.outroPokemonVida = vida;
        this.outroPokemonNome = nome;
        
    }
    
    public String startBattle(){
        
        if(meuPokemonVida > outroPokemonVida){
            
            return "Você venceu! Parabéns " + meuPokemonNome;
            
        }else{
            
            return "Você perdeu! Vencedor: " + outroPokemonNome;
            
        }
        
    }

}
