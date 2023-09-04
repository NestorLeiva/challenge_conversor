package GUI;

import Conversiones.ConversorDivisas;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class frmConversorDivisa extends javax.swing.JInternalFrame {
    
    public frmConversorDivisa() {
        //this.setContentPane(fondo);
        initComponents();
        
    }
//    FondoPanel fondo = new FondoPanel();
    
    private double valor;
    private int divisaPrincipal;
    private int divisaSecundaria;
    private double resultadoFinal;
    // objeto 
    ConversorDivisas enlace;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConversor = new javax.swing.JPanel();
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
        cboDivisaPrincipal = new javax.swing.JComboBox<>();
        btnNuevaConversion = new javax.swing.JButton();
        jtxtResultado = new javax.swing.JTextField();
        cboDivisaSecundaria = new javax.swing.JComboBox<>();
        btnDivisa1 = new javax.swing.JButton();
        btnDivisa2 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Conversor de Divisas");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(785, 780));
        setRequestFocusEnabled(false);

        jPanelConversor.setBackground(new java.awt.Color(51, 51, 255));
        jPanelConversor.setEnabled(false);
        jPanelConversor.setPreferredSize(new java.awt.Dimension(800, 800));

        jtxtDisplay.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        btnNumero_1.setBorder(null);
        btnNumero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_1ActionPerformed(evt);
            }
        });

        btnNumero_2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_2.setText("2");
        btnNumero_2.setBorder(null);
        btnNumero_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_2ActionPerformed(evt);
            }
        });

        btnNumero_3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_3.setText("3");
        btnNumero_3.setBorder(null);
        btnNumero_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_3ActionPerformed(evt);
            }
        });

        btnNumero_4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_4.setText("4");
        btnNumero_4.setBorder(null);
        btnNumero_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_4ActionPerformed(evt);
            }
        });

        btnNumero_5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_5.setText("5");
        btnNumero_5.setBorder(null);
        btnNumero_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_5ActionPerformed(evt);
            }
        });

        btnNumero_6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_6.setText("6");
        btnNumero_6.setBorder(null);
        btnNumero_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_6ActionPerformed(evt);
            }
        });

        btnNumero_7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_7.setText("7");
        btnNumero_7.setBorder(null);
        btnNumero_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_7ActionPerformed(evt);
            }
        });

        btnNumero_8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_8.setText("8");
        btnNumero_8.setBorder(null);
        btnNumero_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_8ActionPerformed(evt);
            }
        });

        btnNumero_9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_9.setText("9");
        btnNumero_9.setBorder(null);
        btnNumero_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_9ActionPerformed(evt);
            }
        });

        btnNumero_0.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumero_0.setText("0");
        btnNumero_0.setBorder(null);
        btnNumero_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero_0ActionPerformed(evt);
            }
        });

        btnConvertir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.setBorder(null);
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnNumeroPunto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnNumeroPunto.setText(".");
        btnNumeroPunto.setBorder(null);
        btnNumeroPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroPuntoActionPerformed(evt);
            }
        });

        cboDivisaPrincipal.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        cboDivisaPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colon Costarricecnse - CRC", "Dolar Americano - USD", "Libra Esterlina - GBP", "Yen  Japones - JPY", "Won surcoreano - KRW" }));
        cboDivisaPrincipal.setBorder(null);
        cboDivisaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDivisaPrincipalActionPerformed(evt);
            }
        });

        btnNuevaConversion.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        btnNuevaConversion.setText("Nueva Conversion");
        btnNuevaConversion.setBorder(null);
        btnNuevaConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversionActionPerformed(evt);
            }
        });

        jtxtResultado.setEditable(false);
        jtxtResultado.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jtxtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cboDivisaSecundaria.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        cboDivisaSecundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colon Costarricecnse - CRC", "Dolar Americano - USD", "Libra Esterlina - GBP", "Yen  Japones - JPY", "Won surcoreano - KRW" }));
        cboDivisaSecundaria.setBorder(null);
        cboDivisaSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDivisaSecundariaActionPerformed(evt);
            }
        });

        btnDivisa1.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        btnDivisa1.setText("Divisa");
        btnDivisa1.setBorder(null);

        btnDivisa2.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        btnDivisa2.setText("Divisa");
        btnDivisa2.setBorder(null);

        btnResultado.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        btnResultado.setText("Resultado");
        btnResultado.setBorder(null);

        btnBorrar.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borrar.png"))); // NOI18N
        btnBorrar.setBorder(null);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConversorLayout = new javax.swing.GroupLayout(jPanelConversor);
        jPanelConversor.setLayout(jPanelConversorLayout);
        jPanelConversorLayout.setHorizontalGroup(
            jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversorLayout.createSequentialGroup()
                                    .addComponent(btnNumero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelConversorLayout.createSequentialGroup()
                                    .addComponent(btnNumero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelConversorLayout.createSequentialGroup()
                                    .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelConversorLayout.createSequentialGroup()
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                                        .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversorLayout.createSequentialGroup()
                                    .addComponent(btnDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboDivisaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelConversorLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelConversorLayout.createSequentialGroup()
                                            .addComponent(btnDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(16, 16, 16)
                                            .addComponent(cboDivisaSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanelConversorLayout.setVerticalGroup(
            jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversorLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDivisaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDivisaSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNumero_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNumeroPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanelConversorLayout.createSequentialGroup()
                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanelConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConversorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnNuevaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelConversor, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 140));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor Divisa");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

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
            divisaSecundaria = cboDivisaSecundaria.getSelectedIndex();

            // envio los datos por medio del metodo set
            enlace.setValor(valor);
            enlace.setDivisaPrincipal(divisaPrincipal);
            enlace.setDivisaSecundaria(divisaSecundaria);

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

    private void cboDivisaSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDivisaSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDivisaSecundariaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if (jtxtDisplay.getText().length() != 0) {
            jtxtDisplay.setText(jtxtDisplay.getText().substring(0, jtxtDisplay.getText().length()-1));
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnDivisa1;
    private javax.swing.JButton btnDivisa2;
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
    private javax.swing.JButton btnResultado;
    private javax.swing.JComboBox<String> cboDivisaPrincipal;
    private javax.swing.JComboBox<String> cboDivisaSecundaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConversor;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtResultado;
    // End of variables declaration//GEN-END:variables
/*
    class FondoPanel extends JPanel {
        
        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/icon/background.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }*/
    
}
