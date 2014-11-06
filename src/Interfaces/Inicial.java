package Interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author seven
 */
public class Inicial extends javax.swing.JFrame implements KeyListener {

    /**
     * wiewport 370 260
     */
    private int deslocamento_x = 10;//deslocamento em x para desenhar no local certo
    private int deslocamento_y = 160;//deslocamendo em y para desenhar no local certo

    public Inicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio_heigh = new javax.swing.JRadioButton();
        radio_malha = new javax.swing.JRadioButton();
        radio_tregular = new javax.swing.JRadioButton();
        radio_tirregular = new javax.swing.JRadioButton();
        botao_ajuda = new javax.swing.JButton();
        botao_novo = new javax.swing.JButton();
        botao_carregar = new javax.swing.JButton();
        botao_salvar = new javax.swing.JButton();
        botao_suavizar = new javax.swing.JButton();
        radio_isometrica = new javax.swing.JRadioButton();
        radio_perspectiva = new javax.swing.JRadioButton();
        radio_ocultar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texto_camx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        texto_camy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        texto_camz = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        texto_mundox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        texto_mundoy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        texto_mundoz = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        radio_heigh.setText("Heighmap");
        radio_heigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_heighActionPerformed(evt);
            }
        });

        radio_malha.setText("Malha");
        radio_malha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_malhaActionPerformed(evt);
            }
        });

        radio_tregular.setText("Triangular Regular");
        radio_tregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tregularActionPerformed(evt);
            }
        });

        radio_tirregular.setText("Triangular Irregular");
        radio_tirregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tirregularActionPerformed(evt);
            }
        });

        botao_ajuda.setText("Ajuda");
        botao_ajuda.setPreferredSize(new java.awt.Dimension(100, 20));
        botao_ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ajudaActionPerformed(evt);
            }
        });

        botao_novo.setText("Novo");
        botao_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_novoActionPerformed(evt);
            }
        });

        botao_carregar.setText("Carregar");
        botao_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_carregarActionPerformed(evt);
            }
        });

        botao_salvar.setText("Salvar");
        botao_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvarActionPerformed(evt);
            }
        });

        botao_suavizar.setText("Suavizar");
        botao_suavizar.setPreferredSize(new java.awt.Dimension(100, 20));
        botao_suavizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_suavizarActionPerformed(evt);
            }
        });

        radio_isometrica.setText("Axonométrica Isométrica");
        radio_isometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_isometricaActionPerformed(evt);
            }
        });

        radio_perspectiva.setText("Perspectiva");
        radio_perspectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_perspectivaActionPerformed(evt);
            }
        });

        radio_ocultar.setText("Ocultar Faces");
        radio_ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_ocultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Posição câmera");

        jLabel3.setText("X:");

        texto_camx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_camxActionPerformed(evt);
            }
        });

        jLabel4.setText("Y:");

        jLabel5.setText("Z:");

        jLabel7.setText("X:");

        jLabel8.setText("Y:");

        jLabel9.setText("Z:");

        jLabel6.setText("Tamanho Mundo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radio_tregular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_tirregular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_carregar)
                        .addGap(18, 18, 18)
                        .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio_isometrica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radio_perspectiva))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio_heigh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_malha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_ocultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_suavizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_camx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_camy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_camz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_mundox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_mundoy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_mundoz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_heigh)
                            .addComponent(radio_malha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_isometrica)
                            .addComponent(radio_perspectiva)
                            .addComponent(radio_ocultar))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_suavizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto_camx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(texto_camy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(texto_camz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(texto_mundox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(texto_mundoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(texto_mundoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_tregular)
                            .addComponent(radio_tirregular)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_novo)
                            .addComponent(botao_carregar)
                            .addComponent(botao_salvar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desenha_heighmap() {
        Graphics g = this.getGraphics();
        g.setColor(Color.white);
        g.fillRect(deslocamento_x, deslocamento_y, deslocamento_x + 370, deslocamento_y + 260);
//        for (int i = 0; i < tamanho_heightmap; i++) {
//            for (int j = 0; j < tamanho_heightmap; j++) {
//                g.setColor(new Color(heighmap[i][j], heighmap[i][j], heighmap[i][j]));
//                g.drawLine(deslocamento_x + i, deslocamento_y + j, deslocamento_x + i, deslocamento_y + j);
//            }
//        }
    }

    private void desenha_malha() {
        Graphics g = this.getGraphics();
        g.setColor(Color.white);
        g.fillRect(deslocamento_x, deslocamento_y, deslocamento_x + 370, deslocamento_y + 260);
        g.setColor(Color.black);
        int triangulo_temporario[];
    }

    public void print_matrix(float[][] a, int tam_i, int tam_j) {
        for (int i = 0; i < tam_i; i++) {
            for (int j = 0; j < tam_j; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }
    }

    public void print_matrix(double[][] a, int tam_i, int tam_j) {
        for (int i = 0; i < tam_i; i++) {
            for (int j = 0; j < tam_j; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }
    }

    public void print_vector(float[] a, int tam_i) {
        for (int i = 0; i < tam_i; i++) {

            System.out.print("\t" + a[i]);

        }
        System.out.println("");
    }

    private void radio_heighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_heighActionPerformed
//        if (radio_heigh.isSelected()) {
//            radio_malha.setSelected(false);
//            radio_perspectiva.setEnabled(false);
//            radio_isometrica.setEnabled(false);
//            radio_ocultar.setEnabled(false);
//            if (heighmap != null) {
//                desenha_heighmap();
//            }
//        }
    }//GEN-LAST:event_radio_heighActionPerformed

    private void radio_malhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_malhaActionPerformed
        if (radio_malha.isSelected()) {
            radio_heigh.setSelected(false);
            radio_perspectiva.setEnabled(true);
            radio_isometrica.setEnabled(true);
            radio_ocultar.setEnabled(true);
        }
    }//GEN-LAST:event_radio_malhaActionPerformed

    private void radio_tregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tregularActionPerformed
        if (radio_tregular.isSelected()) {
            radio_heigh.setEnabled(true);
            radio_tirregular.setSelected(false);
        }
    }//GEN-LAST:event_radio_tregularActionPerformed

    private void radio_tirregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tirregularActionPerformed
        if (radio_tirregular.isSelected()) {
            radio_heigh.setEnabled(false);
            radio_heigh.setSelected(false);
            radio_tregular.setSelected(false);
        }
    }//GEN-LAST:event_radio_tirregularActionPerformed

    private void botao_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_novoActionPerformed

    }//GEN-LAST:event_botao_novoActionPerformed

    private void botao_ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ajudaActionPerformed
        Ajuda j = new Ajuda();
        j.setResizable(false);
        j.setTitle("Ajuda");
        j.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setResizable(false);
        j.setVisible(true);
    }//GEN-LAST:event_botao_ajudaActionPerformed

    private void botao_suavizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_suavizarActionPerformed
//        if (heighmap != null) {
//
//            float temp;
//            for (int i = 0; i < tamanho_heightmap; i++) {
//                for (int j = 1; j < tamanho_heightmap - 1; j++) {
//                    temp = heighmap[i][j - 1];
//                    temp += heighmap[i][j];
//                    temp += heighmap[i][j + 1];
//                    heighmap[i][j] = (float) (temp / 3.0);
//                    temp = heighmap[j - 1][i];
//                    temp += heighmap[j][i];
//                    temp += heighmap[j + 1][i];
//                    heighmap[j][i] = (float) (temp / 3.0);
//                }
//            }
//            monta_malha_regular();
//            if (radio_heigh.isSelected()) {
//                desenha_heighmap();
//            }
//            if (radio_malha.isSelected()) {
//                desenha_malha();
//            }
//        }
    }//GEN-LAST:event_botao_suavizarActionPerformed

    private void botao_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_carregarActionPerformed
        Carregar c = new Carregar();
        c.setResizable(false);
        c.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        c.setTitle("Carregar");
        c.setVisible(true);
    }//GEN-LAST:event_botao_carregarActionPerformed

    private void botao_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvarActionPerformed

    }//GEN-LAST:event_botao_salvarActionPerformed

    private void radio_isometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_isometricaActionPerformed
        // TODO add your handling code here:
        if (!radio_malha.isSelected()) {
            radio_isometrica.setSelected(false);
            return;
        }
        if (radio_isometrica.isSelected()) {
            radio_perspectiva.setSelected(false);
            desenha_malha();
        }
    }//GEN-LAST:event_radio_isometricaActionPerformed

    private void radio_perspectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_perspectivaActionPerformed
        if (!radio_malha.isSelected()) {
            radio_perspectiva.setSelected(false);
            return;
        }
        if (radio_perspectiva.isSelected() && radio_tregular.isSelected()) {
            radio_isometrica.setSelected(false);
        }
    }//GEN-LAST:event_radio_perspectivaActionPerformed

    private void radio_ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_ocultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_ocultarActionPerformed

    private void texto_camxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_camxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_camxActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_ajuda;
    private javax.swing.JButton botao_carregar;
    private javax.swing.JButton botao_novo;
    private javax.swing.JButton botao_salvar;
    private javax.swing.JButton botao_suavizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton radio_heigh;
    private javax.swing.JRadioButton radio_isometrica;
    private javax.swing.JRadioButton radio_malha;
    private javax.swing.JRadioButton radio_ocultar;
    private javax.swing.JRadioButton radio_perspectiva;
    private javax.swing.JRadioButton radio_tirregular;
    private javax.swing.JRadioButton radio_tregular;
    private javax.swing.JTextField texto_camx;
    private javax.swing.JTextField texto_camy;
    private javax.swing.JTextField texto_camz;
    private javax.swing.JTextField texto_mundox;
    private javax.swing.JTextField texto_mundoy;
    private javax.swing.JTextField texto_mundoz;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 'T') {
            if (radio_heigh.isSelected()) {
                desenha_heighmap();
            } else {
            }
        }
    }
}
