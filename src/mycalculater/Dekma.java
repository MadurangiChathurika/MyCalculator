/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculater;

/**
 *
 * @author Janaka chathuranga
 */
public class Dekma extends javax.swing.JFrame {
   double firstNumber;
   String symbol;
   double secondNumber;
    /**
     * Creates new form Dekma
     */
    public Dekma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtscreen = new javax.swing.JTextField();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnstart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtscreen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnplus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnmod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmod.setText("*");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        btndivision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndivision.setText("/");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        btnequal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btnsub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btnstart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstart.setText("C");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtscreen)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       String temp=txtscreen.getText()+"0";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String temp=txtscreen.getText()+"1";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String temp=txtscreen.getText()+"2";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String temp=txtscreen.getText()+"3";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String temp=txtscreen.getText()+"4";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       String temp=txtscreen.getText()+"6";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String temp=txtscreen.getText()+"5";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String temp=txtscreen.getText()+"7";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       String temp=txtscreen.getText()+"8";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       String temp=txtscreen.getText()+"9";
       txtscreen.setText(temp);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        firstNumber=Double.parseDouble(txtscreen.getText());
        symbol="+";
       txtscreen.setText("");
    }//GEN-LAST:event_btnplusActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
       firstNumber=Double.parseDouble(txtscreen.getText());
       symbol="*";
       txtscreen.setText("");
    }//GEN-LAST:event_btnmodActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        firstNumber=Double.parseDouble(txtscreen.getText());
        symbol="/";
       txtscreen.setText("");
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
       secondNumber=Double.parseDouble(txtscreen.getText());
       if(symbol.equals("+")){
         double tmp=firstNumber+secondNumber;
         txtscreen.setText(tmp+"");
       }
       if(symbol.equals("-")){
          double tmp=firstNumber-secondNumber;
          txtscreen.setText(tmp+"");
       }
       if(symbol.equals("/")){
           double tmp=firstNumber/secondNumber;
           txtscreen.setText(tmp+"");
       }
       if(symbol.equals("*")){
           double tmp=firstNumber*secondNumber;
           txtscreen.setText(tmp+"");
       }
      
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        firstNumber=Double.parseDouble(txtscreen.getText());
        symbol="-";
       txtscreen.setText("");
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        txtscreen.setText("");
    }//GEN-LAST:event_btnstartActionPerformed
    
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
            java.util.logging.Logger.getLogger(Dekma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dekma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dekma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dekma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dekma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnmod;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnsub;
    private javax.swing.JTextField txtscreen;
    // End of variables declaration//GEN-END:variables
}
