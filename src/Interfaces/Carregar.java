/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seven
 */
public class Carregar extends javax.swing.JFrame {

    /**
     * Creates new form Carregar
     */
    public Carregar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        texto_caminho = new javax.swing.JTextField();
        botao_carregar = new javax.swing.JButton();
        botao_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Caminho do arquivo->");

        botao_carregar.setText("Carregar");
        botao_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_carregarActionPerformed(evt);
            }
        });

        botao_cancelar.setText("Cancelar");
        botao_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_caminho, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(botao_carregar)
                        .addGap(47, 47, 47)
                        .addComponent(botao_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texto_caminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_carregar)
                    .addComponent(botao_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_carregarActionPerformed
        try {
            FileReader arq = new FileReader(texto_caminho.getText());
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            if(linha==null){
                Carregar.this.dispose();
            }
            String tipo = linha;
            linha=lerArq.readLine();
            int tamanho=Integer.parseInt(linha);
            float matriz[][]=new float[tamanho][tamanho];
            for(int i=0;i<tamanho*tamanho;i++){
                linha=lerArq.readLine();
                StringTokenizer t = new StringTokenizer(linha," ");
                int x=Integer.parseInt(t.nextToken());
                int y=Integer.parseInt(t.nextToken());
                matriz[x][y]=Float.parseFloat(t.nextToken());
            }
//            Inicial.carregar(matriz, tamanho, tipo);
        }catch(IOException ex){
            
        }
        Carregar.this.dispose();
    }//GEN-LAST:event_botao_carregarActionPerformed

    private void botao_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cancelarActionPerformed
        Carregar.this.dispose();
    }//GEN-LAST:event_botao_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JButton botao_carregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField texto_caminho;
    // End of variables declaration//GEN-END:variables
}
