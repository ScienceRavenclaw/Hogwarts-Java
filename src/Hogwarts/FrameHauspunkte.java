package Hogwarts;

import javax.swing.table.DefaultTableModel;

public class FrameHauspunkte extends javax.swing.JInternalFrame {
    
    Schueler einSchueler;
    Schuelerliste eineSchulerliste;
    Professoren einProfessor;
    Professoren eineProfessorenliste;
    Hauspunkte einHauspunkt;
    Hauspunktliste eineHauspunktliste;
    
    public FrameHauspunkte() {
        initComponents();
        //Hinzufuegen der einzelnen Items fuer die Combobox Haus.
        cboHaus.addItem("Ravenclaw");
        cboHaus.addItem("Hufflepuff");
        cboHaus.addItem("Slytherin");
        cboHaus.addItem("Gryffindor");
        
        Tabellenformat.tabelle6Spalten(tblHauspunkte, "ID", "Datum", "Name des Schülers", "Name des Professors", 
                                        "Haus", "Hauspunkte");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        opMeldung = new javax.swing.JOptionPane();
        tpHauspunkte = new javax.swing.JTabbedPane();
        pHauspunkteAnzeigenUndVergeben = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        txtNachnameSchueler = new javax.swing.JTextField();
        txtNachnameProfessor = new javax.swing.JTextField();
        txtHauspunkte = new javax.swing.JTextField();
        cboHaus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHauspunkte = new javax.swing.JTable();
        btnVergeben = new javax.swing.JButton();
        btnAnzeigen = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hauspunkte anzeigen & vergeben");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Datum:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nachname Schueler:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nachname Professor:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Haus:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hauspunkte:");

        tblHauspunkte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblHauspunkte);

        btnVergeben.setText("Vergeben");
        btnVergeben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVergebenActionPerformed(evt);
            }
        });

        btnAnzeigen.setText("Anzeigen");
        btnAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnzeigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pHauspunkteAnzeigenUndVergebenLayout = new javax.swing.GroupLayout(pHauspunkteAnzeigenUndVergeben);
        pHauspunkteAnzeigenUndVergeben.setLayout(pHauspunkteAnzeigenUndVergebenLayout);
        pHauspunkteAnzeigenUndVergebenLayout.setHorizontalGroup(
            pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNachnameSchueler, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNachnameProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboHaus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHauspunkte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVergeben, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pHauspunkteAnzeigenUndVergebenLayout.setVerticalGroup(
            pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNachnameSchueler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNachnameProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboHaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pHauspunkteAnzeigenUndVergebenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHauspunkte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVergeben)
                    .addComponent(btnAnzeigen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );

        tpHauspunkte.addTab("Hauspunkte anzeigen & vergeben", pHauspunkteAnzeigenUndVergeben);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpHauspunkte)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpHauspunkte)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnzeigenActionPerformed
        Tabellenformat.tabelleLeeren(tblHauspunkte);
        
        for(Hauspunkte einHauspunkt : Global.getEineHauspunktliste()) {
            ((DefaultTableModel) tblHauspunkte.getModel()).addRow(einHauspunkt.zeigeHauspunkte());
        }
    }//GEN-LAST:event_btnAnzeigenActionPerformed

    private void btnVergebenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVergebenActionPerformed
        Tabellenformat.tabelleLeeren(tblHauspunkte);
        //Fehler abfangen: Leere Eingabefelder
        try {
        String nDatum = txtDatum.getText();
        String nNachnameSchueler = txtNachnameSchueler.getText();
        String nNachnameProfessor = txtNachnameProfessor.getText();
        Object nHaus = cboHaus.getSelectedItem();
        int nHauspunkte = Integer.parseInt(txtHauspunkte.getText());
        
        einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberName(nNachnameSchueler);
        einProfessor = Global.getEineProfessorenliste().findeProfessorUeberName(nNachnameProfessor);
        
        einHauspunkt = new Hauspunkte(nDatum, einSchueler, einProfessor, nHaus, nHauspunkte);
        Global.getEineHauspunktliste().add(einHauspunkt);
        
        opMeldung.showMessageDialog(null, "Hauspunkte erfolgreich vergeben!");
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Ungültige Eingabe!");
        }
    }//GEN-LAST:event_btnVergebenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnzeigen;
    private javax.swing.JButton btnVergeben;
    private javax.swing.JComboBox<String> cboHaus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JOptionPane opMeldung;
    private javax.swing.JPanel pHauspunkteAnzeigenUndVergeben;
    private javax.swing.JTable tblHauspunkte;
    private javax.swing.JTabbedPane tpHauspunkte;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtHauspunkte;
    private javax.swing.JTextField txtNachnameProfessor;
    private javax.swing.JTextField txtNachnameSchueler;
    // End of variables declaration//GEN-END:variables
}
