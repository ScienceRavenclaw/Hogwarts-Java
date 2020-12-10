package Hogwarts;

import javax.swing.JInternalFrame;

public class FrameStart extends javax.swing.JFrame {
    FrameProfessoren fProfessoren = null;
    FrameSchueler fSchueler = null;
    FrameHauspunkte fHauspunkte = null;

    public FrameStart() {
        initComponents();
        Global.initProfessoren();
        Global.initSchueler();
        Global.initHauspunkte();
    }

        public void erzeugeFrame(JInternalFrame aktuellerFrame) {
        try {
            desktop.add(aktuellerFrame);
            aktuellerFrame.setVisible(true);
            aktuellerFrame.setMaximum(true);
        } catch (Exception ex) {
            opMeldung.showMessageDialog(null, "Fehler beim Maximieren");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opMeldung = new javax.swing.JOptionPane();
        desktop = new javax.swing.JDesktopPane();
        menuleiste = new javax.swing.JMenuBar();
        mProfessoren = new javax.swing.JMenu();
        mSchueler = new javax.swing.JMenu();
        mHauspunkte = new javax.swing.JMenu();
        mSchliessen = new javax.swing.JMenu();
        suSchliessen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        mProfessoren.setText("Professoren");
        mProfessoren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mProfessorenMouseClicked(evt);
            }
        });
        menuleiste.add(mProfessoren);

        mSchueler.setText("Schüler");
        mSchueler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSchuelerMouseClicked(evt);
            }
        });
        menuleiste.add(mSchueler);

        mHauspunkte.setText("Hauspunkte");
        mHauspunkte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mHauspunkteMouseClicked(evt);
            }
        });
        menuleiste.add(mHauspunkte);

        mSchliessen.setText("Schließen");

        suSchliessen.setText("Schließen");
        suSchliessen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suSchliessenActionPerformed(evt);
            }
        });
        mSchliessen.add(suSchliessen);

        menuleiste.add(mSchliessen);

        setJMenuBar(menuleiste);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mProfessorenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mProfessorenMouseClicked
        fProfessoren = new FrameProfessoren();
        erzeugeFrame(fProfessoren);
    }//GEN-LAST:event_mProfessorenMouseClicked

    private void mSchuelerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSchuelerMouseClicked
        fSchueler = new FrameSchueler();
        erzeugeFrame(fSchueler);
    }//GEN-LAST:event_mSchuelerMouseClicked

    private void suSchliessenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suSchliessenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_suSchliessenActionPerformed

    private void mHauspunkteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mHauspunkteMouseClicked
        fHauspunkte = new FrameHauspunkte();
        erzeugeFrame(fHauspunkte);
    }//GEN-LAST:event_mHauspunkteMouseClicked

    
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu mHauspunkte;
    private javax.swing.JMenu mProfessoren;
    private javax.swing.JMenu mSchliessen;
    private javax.swing.JMenu mSchueler;
    private javax.swing.JMenuBar menuleiste;
    private javax.swing.JOptionPane opMeldung;
    private javax.swing.JMenuItem suSchliessen;
    // End of variables declaration//GEN-END:variables
}
