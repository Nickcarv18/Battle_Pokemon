package UI_Battle_Pokemon;

import battle_pokemon.Battle_Pokemon;
import battle_pokemon.Pokemon;
import javax.swing.JFrame;

public class UI_EscolhaSeuPokemon extends javax.swing.JFrame {
    
    UI_Batalha pokemon = new UI_Batalha();

    /**
     * Creates new form UI_EscolhaPokemon
     */
    public UI_EscolhaSeuPokemon() {
        initComponents();
        
        Battle_Pokemon musica = new Battle_Pokemon();
        musica.play();
       
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectsPokemons = new javax.swing.ButtonGroup();
        selectGolem = new javax.swing.JRadioButton();
        selectCharizard = new javax.swing.JRadioButton();
        SelectBlastoise = new javax.swing.JRadioButton();
        selectVenusaur = new javax.swing.JRadioButton();
        txt_titulo = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JLabel();
        imgBlastoise = new javax.swing.JLabel();
        imgVenusaur = new javax.swing.JLabel();
        imgCharizard = new javax.swing.JLabel();
        imgGolem = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 900));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        selectGolem.setBackground(new java.awt.Color(0, 0, 0));
        SelectsPokemons.add(selectGolem);
        selectGolem.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        selectGolem.setForeground(new java.awt.Color(255, 255, 255));
        selectGolem.setText("Golem");
        selectGolem.setContentAreaFilled(false);
        selectGolem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectGolem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGolemActionPerformed(evt);
            }
        });

        SelectsPokemons.add(selectCharizard);
        selectCharizard.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        selectCharizard.setForeground(new java.awt.Color(255, 255, 255));
        selectCharizard.setText("Charizard");
        selectCharizard.setContentAreaFilled(false);
        selectCharizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCharizardActionPerformed(evt);
            }
        });

        SelectsPokemons.add(SelectBlastoise);
        SelectBlastoise.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        SelectBlastoise.setForeground(new java.awt.Color(255, 255, 255));
        SelectBlastoise.setText("Blastoise");
        SelectBlastoise.setAlignmentX(1.0F);
        SelectBlastoise.setContentAreaFilled(false);
        SelectBlastoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBlastoiseActionPerformed(evt);
            }
        });

        SelectsPokemons.add(selectVenusaur);
        selectVenusaur.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        selectVenusaur.setForeground(new java.awt.Color(255, 255, 255));
        selectVenusaur.setText("Venusaur");
        selectVenusaur.setContentAreaFilled(false);
        selectVenusaur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectVenusaurActionPerformed(evt);
            }
        });

        txt_titulo.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("Escolha o seu pokemon para Batalha");

        btn_fechar.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(255, 255, 255));
        btn_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_fechar.setText("X");
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });

        imgBlastoise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBlastoise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blastoise.png"))); // NOI18N
        imgBlastoise.setAlignmentX(-2.0F);

        imgVenusaur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Venusaur.png"))); // NOI18N

        imgCharizard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCharizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Charizard.png"))); // NOI18N

        imgGolem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGolem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Golem.png"))); // NOI18N

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaFundo_Escolha.png"))); // NOI18N
        imgFundo.setAlignmentX(1.0F);
        imgFundo.setMinimumSize(new java.awt.Dimension(1000, 600));
        imgFundo.setPreferredSize(new java.awt.Dimension(2000, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430)
                .addComponent(btn_fechar))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(selectVenusaur, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300)
                .addComponent(selectCharizard, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(selectGolem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(imgBlastoise, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(imgVenusaur, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(imgCharizard, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(SelectBlastoise, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1440, 1440, 1440)
                .addComponent(imgGolem, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_fechar))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectVenusaur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCharizard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectGolem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBlastoise, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(imgVenusaur, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(imgCharizard, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(SelectBlastoise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(imgGolem, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SelectBlastoiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBlastoiseActionPerformed
        if(SelectBlastoise.isSelected()){
                Pokemon blastoise = new Pokemon("Blastoise","Agua");
                
                if(pokemon==null){
                    pokemon = new UI_Batalha();
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }else{
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }
            
                pokemon.img_pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blastoise.png")));
                pokemon.dados_poke.setText(blastoise.imprimiPokemon());
                
                pokemon.enviaDados(this, blastoise);

                pokemon.setVisible(true);
                
                dispose();
        }
    }//GEN-LAST:event_SelectBlastoiseActionPerformed

    private void selectVenusaurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectVenusaurActionPerformed
        if(selectVenusaur.isSelected()){
                Pokemon venusaur = new Pokemon("Venusaur","Planta");
                
                if(pokemon==null){
                    pokemon = new UI_Batalha();
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }else{
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }
                
               pokemon.img_pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Venusaur.png"))); 
               pokemon.dados_poke.setText(venusaur.imprimiPokemon());
               
                pokemon.enviaDados(this, venusaur);
                
                 dispose();
        }
    }//GEN-LAST:event_selectVenusaurActionPerformed

    private void selectCharizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCharizardActionPerformed
        if(selectCharizard.isSelected()){
             Pokemon charizard = new Pokemon("Charizard","Fogo");
             
             if(pokemon==null){
                    pokemon = new UI_Batalha();
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }else{
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }
            
                pokemon.img_pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Charizard.png"))); 
                pokemon.dados_poke.setText(charizard.imprimiPokemon());
                
                pokemon.enviaDados(this, charizard);

                pokemon.setVisible(true);
                
                dispose();
        }
    }//GEN-LAST:event_selectCharizardActionPerformed

    private void selectGolemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGolemActionPerformed
         if(selectGolem.isSelected()){
             Pokemon golem = new Pokemon("Golem","Pedra"); 

                if(pokemon==null){
                    pokemon = new UI_Batalha();
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }else{
                    pokemon.setLocationRelativeTo(null);
                    pokemon.setVisible(true);
                    pokemon.setResizable(false);
                }
           
           pokemon.img_pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Golem.png"))); 
           pokemon.dados_poke.setText(golem.imprimiPokemon());
                     
          pokemon.enviaDados(this, golem);
          
          pokemon.setVisible(true);
           
           dispose();
        }
    }//GEN-LAST:event_selectGolemActionPerformed

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
         UI_TelaInicio telaIni = new UI_TelaInicio();
         telaIni.setVisible(true);
         
         dispose();
    }//GEN-LAST:event_btn_fecharMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_EscolhaSeuPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_EscolhaSeuPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_EscolhaSeuPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_EscolhaSeuPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_EscolhaSeuPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton SelectBlastoise;
    public javax.swing.ButtonGroup SelectsPokemons;
    public javax.swing.JLabel btn_fechar;
    public javax.swing.JLabel imgBlastoise;
    public javax.swing.JLabel imgCharizard;
    public javax.swing.JLabel imgFundo;
    public javax.swing.JLabel imgGolem;
    public javax.swing.JLabel imgVenusaur;
    public javax.swing.JRadioButton selectCharizard;
    public javax.swing.JRadioButton selectGolem;
    public javax.swing.JRadioButton selectVenusaur;
    public javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
