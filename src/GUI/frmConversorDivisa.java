package GUI;

/**
 * @author nestor
 */

public class frmConversorDivisa extends javax.swing.JInternalFrame  {
    /**
     * Creates new form frmConversor
     */
    public frmConversorDivisa() {
        initComponents();}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpConversor = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        btnNumero_1 = new javax.swing.JButton();
        btnNumero_2 = new javax.swing.JButton();
        btnNumero_3 = new javax.swing.JButton();
        btnNumero_4 = new javax.swing.JButton();
        btnNumero_5 = new javax.swing.JButton();
        btnNumero_6 = new javax.swing.JButton();
        btnNumero_7 = new javax.swing.JButton();
        btnNumero_8 = new javax.swing.JButton();
        btnNumero_9 = new javax.swing.JButton();
        btnNumero_0 = new javax.swing.JButton();
        btnConvertir = new javax.swing.JButton();
        btnNumeroPunto = new javax.swing.JButton();
        jblDivisa_1 = new javax.swing.JLabel();
        jblDivisa_2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnNumeroAtras = new javax.swing.JButton();
        jblResultado = new javax.swing.JLabel();
        jblResultadoTitulo = new javax.swing.JLabel();
        btnNuevaConversion = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Conversor de Divisas");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));

        jpTitulo.setBackground(new java.awt.Color(255, 255, 0));
        jpTitulo.setPreferredSize(new java.awt.Dimension(800, 140));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conversor de Divisas");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jpTitulo, java.awt.BorderLayout.PAGE_START);

        jpConversor.setBackground(new java.awt.Color(51, 51, 255));
        jpConversor.setPreferredSize(new java.awt.Dimension(800, 800));

        jtxtDisplay.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplay.setMaximumSize(new java.awt.Dimension(100, 100));
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        btnNumero_1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_1.setText("1");
        btnNumero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_1ActionPerformed(evt);
            }
        });

        btnNumero_2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_2.setText("2");
        btnNumero_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_2ActionPerformed(evt);
            }
        });

        btnNumero_3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_3.setText("3");
        btnNumero_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_3ActionPerformed(evt);
            }
        });

        btnNumero_4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_4.setText("4");
        btnNumero_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_4ActionPerformed(evt);
            }
        });

        btnNumero_5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_5.setText("5");
        btnNumero_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_5ActionPerformed(evt);
            }
        });

        btnNumero_6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_6.setText("6");
        btnNumero_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_6ActionPerformed(evt);
            }
        });

        btnNumero_7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_7.setText("7");
        btnNumero_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_7ActionPerformed(evt);
            }
        });

        btnNumero_8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_8.setText("8");
        btnNumero_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_8ActionPerformed(evt);
            }
        });

        btnNumero_9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_9.setText("9");
        btnNumero_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_9ActionPerformed(evt);
            }
        });

        btnNumero_0.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_0.setText("0");
        btnNumero_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_0ActionPerformed(evt);
            }
        });

        btnConvertir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnConvertir.setText("Convertir");

        btnNumeroPunto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumeroPunto.setText(".");
        btnNumeroPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroPuntoActionPerformed(evt);
            }
        });

        jblDivisa_1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jblDivisa_1.setText("Divisa Principal");

        jblDivisa_2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jblDivisa_2.setText("Divisa Secundaria");

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNumeroAtras.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumeroAtras.setText("C");
        btnNumeroAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroAtrasActionPerformed(evt);
            }
        });

        jblResultado.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblResultado.setText("resultado");
        jblResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jblResultadoTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jblResultadoTitulo.setText("Resultado");

        btnNuevaConversion.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        btnNuevaConversion.setText("Nueva Conversion");

        javax.swing.GroupLayout jpConversorLayout = new javax.swing.GroupLayout(jpConversor);
        jpConversor.setLayout(jpConversorLayout);
        jpConversorLayout.setHorizontalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpConversorLayout.createSequentialGroup()
                            .addComponent(btnNumero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpConversorLayout.createSequentialGroup()
                            .addComponent(btnNumero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConversorLayout.createSequentialGroup()
                                .addComponent(btnNumeroAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpConversorLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConversorLayout.createSequentialGroup()
                            .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpConversorLayout.createSequentialGroup()
                            .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jblDivisa_1)
                                .addComponent(jblDivisa_2))
                            .addGap(41, 41, 41)
                            .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpConversorLayout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jblResultadoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(328, 328, 328))
        );
        jpConversorLayout.setVerticalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblDivisa_1))
                        .addGap(18, 18, 18)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblDivisa_2))
                        .addGap(18, 18, 18)
                        .addComponent(jblResultadoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNumeroAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jpConversor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void btnNumero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_1ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
         
        jtxtDisplay.setText(jtxtDisplay.getText()+"1");
    }//GEN-LAST:event_btnNumero_1ActionPerformed

    private void btnNumero_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_2ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"2");
    }//GEN-LAST:event_btnNumero_2ActionPerformed

    private void btnNumero_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_3ActionPerformed
       //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"3");
    }//GEN-LAST:event_btnNumero_3ActionPerformed

    private void btnNumero_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_4ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"4");
    }//GEN-LAST:event_btnNumero_4ActionPerformed

    private void btnNumero_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_5ActionPerformed
       //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"5");
    }//GEN-LAST:event_btnNumero_5ActionPerformed

    private void btnNumero_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_6ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"6");
    }//GEN-LAST:event_btnNumero_6ActionPerformed

    private void btnNumero_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_7ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"7");
    }//GEN-LAST:event_btnNumero_7ActionPerformed

    private void btnNumero_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_8ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"8");
    }//GEN-LAST:event_btnNumero_8ActionPerformed

    private void btnNumero_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_9ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"9");
    }//GEN-LAST:event_btnNumero_9ActionPerformed

    private void btnNumero_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_0ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText()+"0");
    }//GEN-LAST:event_btnNumero_0ActionPerformed

    private void btnNumeroPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroPuntoActionPerformed
        //al textBox se  setea y obtine un punto
        jtxtDisplay.setText(jtxtDisplay.getText()+".");
    }//GEN-LAST:event_btnNumeroPuntoActionPerformed

    private void btnNumeroAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroAtrasActionPerformed
        //al textBox se  setea y obtine un espacio para asi limpiar el textbox
        jtxtDisplay.setText("");
    }//GEN-LAST:event_btnNumeroAtrasActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
        /**
         * validacion para que solamente se ingresen numeros por medio del teclado
         * por medio del codigo Ascii
         */
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 46;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnNuevaConversion;
    private javax.swing.JButton btnNumeroAtras;
    private javax.swing.JButton btnNumeroPunto;
    private javax.swing.JButton btnNumero_0;
    private javax.swing.JButton btnNumero_1;
    private javax.swing.JButton btnNumero_2;
    private javax.swing.JButton btnNumero_3;
    private javax.swing.JButton btnNumero_4;
    private javax.swing.JButton btnNumero_5;
    private javax.swing.JButton btnNumero_6;
    private javax.swing.JButton btnNumero_7;
    private javax.swing.JButton btnNumero_8;
    private javax.swing.JButton btnNumero_9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblDivisa_1;
    private javax.swing.JLabel jblDivisa_2;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JLabel jblResultadoTitulo;
    private javax.swing.JPanel jpConversor;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
