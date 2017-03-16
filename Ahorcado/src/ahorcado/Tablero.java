/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Estudiantes
 */
public class Tablero extends javax.swing.JFrame {
    int vidas=8;
    int resultado;
    char[] ahorcadito= new char[10];
    Ahorcado miAhorcado= new Ahorcado();
        
    void SeleccionarPalabra(){
    
    ahorcadito[0]='M';
    ahorcadito[1]='U';
    ahorcadito[2]='R';
    ahorcadito[3]='C';
    ahorcadito[4]='I';
    ahorcadito[5]='E'; 
    ahorcadito[6]='L';
    ahorcadito[7]='A';
    ahorcadito[8]='G';
    ahorcadito[9]='O';
    
    }
    int Verificar(char letra){
        int a=0;
        for(int i=0;i<10;i++){
            if(ahorcadito[i]==letra){
                marcar(i,letra);
                a=1;
            }
            }
        if(a==0){
            vidas--;
        }
        return a;      
    }
    void marcar(int posicion, char letra){
        switch(posicion){
            case 0: this.Letra0.setText(String.valueOf(letra)); break;
            case 1: this.Letra1.setText(String.valueOf(letra)); break;
            case 2: this.Letra2.setText(String.valueOf(letra)); break;
            case 3: this.Letra3.setText(String.valueOf(letra)); break;
            case 4: this.Letra4.setText(String.valueOf(letra)); break;
            case 5: this.Letra5.setText(String.valueOf(letra)); break;
            case 6: this.Letra6.setText(String.valueOf(letra)); break;
            case 7: this.Letra7.setText(String.valueOf(letra)); break;
            case 8: this.Letra8.setText(String.valueOf(letra)); break;
            case 9: this.Letra9.setText(String.valueOf(letra)); break;  
        }
    }
    public Tablero() {
        
        SeleccionarPalabra();
        initComponents();
      }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Letra0 = new javax.swing.JTextField();
        Letra1 = new javax.swing.JTextField();
        Letra2 = new javax.swing.JTextField();
        Letra3 = new javax.swing.JTextField();
        Letra4 = new javax.swing.JTextField();
        Letra5 = new javax.swing.JTextField();
        Letra6 = new javax.swing.JTextField();
        Letra7 = new javax.swing.JTextField();
        Letra8 = new javax.swing.JTextField();
        Letra9 = new javax.swing.JTextField();
        Ingresar = new javax.swing.JTextField();
        BotonJugar = new javax.swing.JButton();
        Vidas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 3, 36)); // NOI18N
        jLabel1.setText("AHORCADO");

        Letra0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra0ActionPerformed(evt);
            }
        });

        Letra1.setBackground(new java.awt.Color(0, 0, 0));
        Letra1.setForeground(new java.awt.Color(255, 255, 255));
        Letra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra1ActionPerformed(evt);
            }
        });

        Letra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra2ActionPerformed(evt);
            }
        });

        Letra3.setBackground(new java.awt.Color(0, 0, 0));
        Letra3.setForeground(new java.awt.Color(255, 255, 255));
        Letra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra3ActionPerformed(evt);
            }
        });

        Letra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra4ActionPerformed(evt);
            }
        });

        Letra5.setBackground(new java.awt.Color(0, 0, 0));
        Letra5.setForeground(new java.awt.Color(255, 255, 255));
        Letra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra5ActionPerformed(evt);
            }
        });

        Letra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra6ActionPerformed(evt);
            }
        });

        Letra7.setBackground(new java.awt.Color(0, 0, 0));
        Letra7.setForeground(new java.awt.Color(255, 255, 255));
        Letra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra7ActionPerformed(evt);
            }
        });

        Letra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra8ActionPerformed(evt);
            }
        });

        Letra9.setBackground(new java.awt.Color(0, 0, 0));
        Letra9.setForeground(new java.awt.Color(255, 255, 255));
        Letra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra9ActionPerformed(evt);
            }
        });

        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        BotonJugar.setBackground(new java.awt.Color(255, 51, 51));
        BotonJugar.setText("JUGAR");
        BotonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJugarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabel2.setText("El numero de vidas restantes son:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel3.setText("Escriba aqui la letra a probar en MAYUSCULA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Letra0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(BotonJugar)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letra0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonJugar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Letra0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra0ActionPerformed

    private void Letra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra1ActionPerformed

    private void Letra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra2ActionPerformed

    private void Letra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra3ActionPerformed

    private void Letra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra4ActionPerformed

    private void Letra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra5ActionPerformed

    private void Letra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra6ActionPerformed

    private void Letra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra7ActionPerformed

    private void Letra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra8ActionPerformed

    private void Letra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra9ActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void BotonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJugarMouseClicked

        this.miAhorcado.letras=this.Ingresar.getText().charAt(0);
        this.Verificar(this.miAhorcado.letras);
        this.Vidas.setText(String.valueOf(vidas));
// TODO add your handling code here:
    }//GEN-LAST:event_BotonJugarMouseClicked

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugar;
    private javax.swing.JTextField Ingresar;
    private javax.swing.JTextField Letra0;
    private javax.swing.JTextField Letra1;
    private javax.swing.JTextField Letra2;
    private javax.swing.JTextField Letra3;
    private javax.swing.JTextField Letra4;
    private javax.swing.JTextField Letra5;
    private javax.swing.JTextField Letra6;
    private javax.swing.JTextField Letra7;
    private javax.swing.JTextField Letra8;
    private javax.swing.JTextField Letra9;
    private javax.swing.JLabel Vidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
