package battle_pokemon;

import UI_Battle_Pokemon.UI_Loading;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Battle_Pokemon {
    
        URL som =  Battle_Pokemon .class.getResource("musica.wav");
        AudioClip Som = Applet.newAudioClip(som);
        
        public void play(){
            Battle_Pokemon tocar = new Battle_Pokemon();
            tocar.Som.stop();
            tocar.Som.play();
        }
        
public static void main(String[] args) {
        
     Battle_Pokemon tocar = new Battle_Pokemon();
     tocar.Som.stop();
     tocar.Som.loop();
        
       UI_Loading loading = new UI_Loading();
       loading.setVisible(true);
    }
    
}
