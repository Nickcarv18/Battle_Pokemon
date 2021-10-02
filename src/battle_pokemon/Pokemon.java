package battle_pokemon;

import java.util.Random;

public class Pokemon {
    private String nome;    
    private String tipo;
    private int level;
    private int vida = 250;
    private int ataque;
    private int defesa;
    
    public Pokemon(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        
        geradorLevel( );     
        calculaAtributos();
        calculaBonus();
    }
    
    public String getNome(){
      return this.nome;
    }

    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    private int  geradorLevel(){
        Random level = new Random();
        
        return this.level = level.nextInt(200);
    }
    
    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida = vida - 25;
                ataque = 60;
                defesa = 20;
            break;
            
            case "Agua":
                vida = vida - 10;
                ataque = 40;
                defesa = 35;
            break;
            
            case "Planta":
                vida = vida + 25;
                ataque = 15;
                defesa = 60;
            break;
            
            case "Pedra":
                vida = vida + 26;
                ataque = 30;
                defesa = 60;
            break;
            
            case "Psíquico":
                vida = vida + 20;
                ataque = 30;
                defesa = 60;
            break;
        }
    }
 
     private void calculaBonus(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
    } 
     
    public String imprimiPokemon(){
        
        return   "Nome: " + nome + " | " +  "Tipo: " + tipo + " | " + "Level: " + level + " | " +  "Vida: " + vida + " | " + "Ataque: " + ataque + " | " + "Defesa: " + defesa ;
        
    }
}
