package GUI;
import Divisa.ConversorDivisas;

public class frmConversorDivisa extends javax.swing.JInternalFrame {

    public frmConversorDivisa() {
        initComponents();
    }

    double valor;
    int divisaPrincipal;
    double resultadoFinal;
    // objeto 
    ConversorDivisas enlace;
    
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
        cboDivisaPrincipal = new javax.swing.JComboBox<>();
        jblResultadoTitulo = new javax.swing.JLabel();
        btnNuevaConversion = new javax.swing.JButton();
        jtxtResultado = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Conversor de Divisas");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(785, 780));
        setRequestFocusEnabled(false);

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
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jpTitulo, java.awt.BorderLayout.PAGE_START);

        jpConversor.setBackground(new java.awt.Color(102, 102, 102));
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
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnNumeroPunto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumeroPunto.setText(".");
        btnNumeroPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroPuntoActionPerformed(evt);
            }
        });

        jblDivisa_1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jblDivisa_1.setText("Divisa ");

        cboDivisaPrincipal.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cboDivisaPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ...", "Colon Costarricecnse - CRC / Dolar Americano - USD", "Colon Costarricecnse - CRC / Libra Esterlina - GBP", "Colon Costarricecnse - CRC / Yen  Japones - JPY", "Colon Costarricecnse - CRC / Won surcoreano - KRW" }));
        cboDivisaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDivisaPrincipalActionPerformed(evt);
            }
        });

        jblResultadoTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jblResultadoTitulo.setText("Resultado");

        btnNuevaConversion.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        btnNuevaConversion.setText("Nueva Conversion");
        btnNuevaConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversionActionPerformed(evt);
            }
        });

        jtxtResultado.setEditable(false);
        jtxtResultado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jtxtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jpConversorLayout = new javax.swing.GroupLayout(jpConversor);
        jpConversor.setLayout(jpConversorLayout);
        jpConversorLayout.setHorizontalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConversorLayout.createSequentialGroup()
                                .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConversorLayout.createSequentialGroup()
                                .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblResultadoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConversorLayout.createSequentialGroup()
                                .addComponent(jblDivisa_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDivisaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpConversorLayout.setVerticalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConversorLayout.createSequentialGroup()
                                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpConversorLayout.createSequentialGroup()
                                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnNumero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNumero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNumero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnNumero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNumero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNumero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConversorLayout.createSequentialGroup()
                                        .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)))
                                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpConversorLayout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDivisaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblDivisa_1))
                        .addGap(18, 18, 18)
                        .addComponent(jblResultadoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(jpConversor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void btnNumero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_1ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "1");
    }//GEN-LAST:event_btnNumero_1ActionPerformed

    private void btnNumero_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_2ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "2");
    }//GEN-LAST:event_btnNumero_2ActionPerformed

    private void btnNumero_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_3ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "3");
    }//GEN-LAST:event_btnNumero_3ActionPerformed

    private void btnNumero_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_4ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "4");
    }//GEN-LAST:event_btnNumero_4ActionPerformed

    private void btnNumero_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_5ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "5");
    }//GEN-LAST:event_btnNumero_5ActionPerformed

    private void btnNumero_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_6ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "6");
    }//GEN-LAST:event_btnNumero_6ActionPerformed

    private void btnNumero_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_7ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "7");
    }//GEN-LAST:event_btnNumero_7ActionPerformed

    private void btnNumero_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_8ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "8");
    }//GEN-LAST:event_btnNumero_8ActionPerformed

    private void btnNumero_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_9ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "9");
    }//GEN-LAST:event_btnNumero_9ActionPerformed

    private void btnNumero_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero_0ActionPerformed
        //al textBox se  setea y obtine el numero correspondiente
        jtxtDisplay.setText(jtxtDisplay.getText() + "0");
    }//GEN-LAST:event_btnNumero_0ActionPerformed

    private void btnNumeroPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroPuntoActionPerformed
        //al textBox se  setea y obtine un punto
        jtxtDisplay.setText(jtxtDisplay.getText() + ".");
    }//GEN-LAST:event_btnNumeroPuntoActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
        /**
         * validacion para que solamente se ingresen numeros por medio del
         * teclado por medio del codigo Ascii
         */
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 46;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    private void cboDivisaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDivisaPrincipalActionPerformed
        // invoco al metodo de la clase logica
    }//GEN-LAST:event_cboDivisaPrincipalActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        try {
            // creo el objeto para enviar los datos capturados
            enlace = new ConversorDivisas();
            // Capturo los datos ingresados de la calculadora
            valor = Double.parseDouble(jtxtDisplay.getText());

            // camptura de los datos del comboBox // realiza la captura de un arreglo devolviendo un valor numerico
            divisaPrincipal = cboDivisaPrincipal.getSelectedIndex();
            
            
            // envio los datos por medio del metodo set
            enlace.setValor(valor);
            enlace.setDivisaPrincipal(divisaPrincipal);
            
            
            // ejecuto la operacion
            
            resultadoFinal = enlace.conversion();

            // muestro el resultado     
            jtxtResultado.setText("" + resultadoFinal);
        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnNuevaConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversionActionPerformed
        // TODO add your handling code here:
        jtxtDisplay.setText("");
        jtxtResultado.setText("");
    }//GEN-LAST:event_btnNuevaConversionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnNuevaConversion;
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
    private javax.swing.JComboBox<String> cboDivisaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblDivisa_1;
    private javax.swing.JLabel jblResultadoTitulo;
    private javax.swing.JPanel jpConversor;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtResultado;
    // End of variables declaration//GEN-END:variables
}
