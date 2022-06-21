package Classe;

import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JFrame {

    public Jogo(String nJogador1, String nJogador2) {
        initComponents();
        this.nJogador1 = nJogador1;
        this.nJogador2 = nJogador2;
        lblJogador.setText(nJogador1); // coloca o nome  na lblJogador
        lblNome1.setText(nJogador1);
        lblNome2.setText(nJogador2);
        lblScore1.setText(String.valueOf(Main.getScoreP1()));
        lblScore2.setText(String.valueOf(Main.getScoreP2()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_fundo = new javax.swing.JPanel();
        lblJogador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblJog2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblScore2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(522, 500));
        setMinimumSize(new java.awt.Dimension(522, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jP_fundo.setBackground(new java.awt.Color(255, 195, 148));
        jP_fundo.setLayout(null);

        lblJogador.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblJogador.setText("nome do jogador");
        jP_fundo.add(lblJogador);
        lblJogador.setBounds(150, 420, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pontuação :");
        jP_fundo.add(jLabel5);
        jLabel5.setBounds(330, 90, 180, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblJog2);

        jP_fundo.add(jPanel1);
        jPanel1.setBounds(320, 130, 200, 10);

        btnSair.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jP_fundo.add(btnSair);
        btnSair.setBounds(410, 420, 100, 30);

        lblScore2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblScore2.setText("score2");
        jP_fundo.add(lblScore2);
        lblScore2.setBounds(390, 350, 60, 20);

        lblNome2.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblNome2.setText("nome do jogador 2");
        jP_fundo.add(lblNome2);
        lblNome2.setBounds(330, 320, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Velha 2:");
        jP_fundo.add(jLabel4);
        jLabel4.setBounds(330, 290, 80, 20);

        lblScore1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblScore1.setText("score1");
        jP_fundo.add(lblScore1);
        lblScore1.setBounds(390, 220, 70, 30);

        lblNome1.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblNome1.setText("nome do jogador 1");
        jP_fundo.add(lblNome1);
        lblNome1.setBounds(330, 190, 180, 23);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Velha 1:");
        jP_fundo.add(jLabel3);
        jLabel3.setBounds(330, 160, 60, 22);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jogador da vez:");
        jP_fundo.add(jLabel2);
        jLabel2.setBounds(10, 420, 140, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel6.setText("Pontos:");
        jP_fundo.add(jLabel6);
        jLabel6.setBounds(320, 220, 70, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jLabel7.setText("Pontos:");
        jP_fundo.add(jLabel7);
        jLabel7.setBounds(320, 350, 60, 21);

        jPanel2.setBackground(new java.awt.Color(217, 128, 70));
        jPanel2.setLayout(null);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 102, 102));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);
        btn1.setBounds(0, 0, 90, 100);

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 102, 102));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);
        btn2.setBounds(100, 0, 90, 100);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn5.setForeground(new java.awt.Color(102, 102, 102));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);
        btn5.setBounds(100, 110, 90, 90);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn6.setForeground(new java.awt.Color(102, 102, 102));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);
        btn6.setBounds(200, 110, 90, 90);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn4.setForeground(new java.awt.Color(102, 102, 102));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);
        btn4.setBounds(0, 110, 90, 90);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn8.setForeground(new java.awt.Color(102, 102, 102));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);
        btn8.setBounds(100, 210, 90, 100);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn7.setForeground(new java.awt.Color(102, 102, 102));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);
        btn7.setBounds(0, 210, 90, 100);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 102, 102));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);
        btn3.setBounds(200, 0, 90, 100);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        btn9.setForeground(new java.awt.Color(102, 102, 102));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);
        btn9.setBounds(200, 210, 90, 100);

        jP_fundo.add(jPanel2);
        jPanel2.setBounds(20, 80, 290, 310);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogo da Velha");
        jP_fundo.add(jLabel1);
        jLabel1.setBounds(80, 0, 330, 64);

        getContentPane().add(jP_fundo);
        jP_fundo.setBounds(0, 0, 520, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn9.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn1.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn2.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn3.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn4.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn5.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn6.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn7.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(simboloAtual); // label recebe o valor que esta dentro do simbolo
        btn8.setEnabled(false); // false para bloquear o proximo click
        verificaJogo();
        JogadorAtual();
        mudaSimbolo();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();// Faz morrer a tela que estava aberta
    }//GEN-LAST:event_btnSairActionPerformed

    private static String nJogador1, nJogador2;

    private void JogadorAtual() {
        if (simboloAtual == "X") {
            lblJogador.setText(nJogador2);
        } else if (simboloAtual == "O") {
            lblJogador.setText(nJogador1);
        }
    }

   
    private String simboloAtual = "X"; // cria um atributo que recebe "x", para que possa ser MUDADO O SIMBOLO

    private void mudaSimbolo() { 

        if (simboloAtual == "X") {
            simboloAtual = "O"; 
        } else {
            simboloAtual = "X";
        }
    }
    

    Main logo = new Main();

    private void verificaJogo() {

        if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != "") { // se não estiver vazio
            JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            
            Jogo j1 = new Jogo(nJogador1, nJogador2); // Objeto instanciado para reabrir a janela do jogo apos um dos jogadores ganharem
            j1.setVisible(true);
            this.dispose();// Faz morrer a tela que estava aberta

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn4.getText() == btn5.getText() && btn6.getText() == btn5.getText() && btn4.getText() != "") { // se não estiver vazio
            JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
             Jogo j1 = new Jogo(nJogador1, nJogador2);
             j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn9.getText() != "") { // se não estiver vazio
             JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
            j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn1.getText() == btn5.getText() && btn9.getText() == btn5.getText() && btn5.getText() != "") { // se não estiver vazio
             JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
            j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn3.getText() == btn7.getText() && btn7.getText() == btn5.getText() && btn3.getText() != "") { // se não estiver vazio
             JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
           j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn1.getText() == btn4.getText() && btn1.getText() == btn7.getText() && btn1.getText() != "") { // se não estiver vazio
             JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
            j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != "") { // se não estiver vazio
             JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
           j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != "") { // se não estiver vazio
           JOptionPane.showMessageDialog(rootPane, "O jogador " + lblJogador.getText() + " ganhou !!! Parabéns! ");
            if (simboloAtual == "X") {
                Main.setScoreP1();
            } else {
                Main.setScoreP2();
            }
            Jogo j1 = new Jogo(nJogador1, nJogador2);
            j1.setVisible(true);
            this.dispose();

            lblScore1.setText(String.valueOf(Main.getScoreP1()));
            lblScore2.setText(String.valueOf(Main.getScoreP2()));

        } else if (btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "" && btn4.getText() != ""
                && btn5.getText() != "" && btn6.getText() != "" && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "") {
            Jogo j1 = new Jogo(nJogador1, nJogador2);
            JOptionPane.showMessageDialog(rootPane, "Empate! Vamos tentar novamente");
            j1.setVisible(true);
            this.dispose();// Faz morrer a tela que estava aberta
        }
    }

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo(nJogador1, nJogador2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jP_fundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJog2;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    // End of variables declaration//GEN-END:variables
}
