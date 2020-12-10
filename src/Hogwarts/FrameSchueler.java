package Hogwarts;


import javax.swing.table.DefaultTableModel;

public class FrameSchueler extends javax.swing.JInternalFrame {

    Schueler einSchueler;
    Schuelerliste eineSchuelerliste;

    public FrameSchueler() {
        initComponents();
        //Hinzufuegen der einzelnen Items zur Combobox Haus.
        cboHaus.addItem("Ravenclaw");
        cboHaus.addItem("Slytherin");
        cboHaus.addItem("Hufflepuff");
        cboHaus.addItem("Gryffindor");
        //Hinzufuegen der einzelnen Items zur Combobox Blutsstatus.
        cboBlutsstatus.addItem("Edelblütig");
        cboBlutsstatus.addItem("Reinblütig");
        cboBlutsstatus.addItem("Halbblütig");
        cboBlutsstatus.addItem("Muggelstämmig");
        //Ende der Hinzufuegung der einzelnnen Items.
        Tabellenformat.tabelle5Spalten(tblSchueler, "ID", "Vorname", "Nachname", "Haus", "Blutsstatus");
        Tabellenformat.tabelle5Spalten(tblSuchen, "ID", "Vorname", "Nachname", "Haus", "Blutsstatus");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opMeldung = new javax.swing.JOptionPane();
        tpSchueler = new javax.swing.JTabbedPane();
        pSchuelerAnlegenUndAnzeigen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVorname = new javax.swing.JTextField();
        txtNachname = new javax.swing.JTextField();
        cboHaus = new javax.swing.JComboBox<>();
        cboBlutsstatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSchueler = new javax.swing.JTable();
        btnAnzeigen = new javax.swing.JButton();
        btnAnlegen = new javax.swing.JButton();
        pSchuelerSuchen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSuchenNachID = new javax.swing.JButton();
        btnLoeschen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuchen = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtNachnameSuchen = new javax.swing.JTextField();
        btnSuchenNachNachname = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pFarbeinstellungenAendernSchueler = new javax.swing.JPanel();
        ccSchueler = new javax.swing.JColorChooser();
        btnFarbeAendern = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Schüler anlegen & anzeigen");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vorname:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nachname:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Haus:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Blutsstatus:");

        tblSchueler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSchueler.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblSchueler);

        btnAnzeigen.setText("Anzeigen");
        btnAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnzeigenActionPerformed(evt);
            }
        });

        btnAnlegen.setText("Anlegen");
        btnAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnlegenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSchuelerAnlegenUndAnzeigenLayout = new javax.swing.GroupLayout(pSchuelerAnlegenUndAnzeigen);
        pSchuelerAnlegenUndAnzeigen.setLayout(pSchuelerAnlegenUndAnzeigenLayout);
        pSchuelerAnlegenUndAnzeigenLayout.setHorizontalGroup(
            pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboBlutsstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboHaus, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNachname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVorname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pSchuelerAnlegenUndAnzeigenLayout.setVerticalGroup(
            pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboHaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pSchuelerAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboBlutsstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnzeigen)
                    .addComponent(btnAnlegen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tpSchueler.addTab("Schüler anlegen & anzeigen", pSchuelerAnlegenUndAnzeigen);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Schüler suchen");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID:");

        btnSuchenNachID.setText("nach ID");
        btnSuchenNachID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuchenNachIDActionPerformed(evt);
            }
        });

        btnLoeschen.setText("Löschen");
        btnLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoeschenActionPerformed(evt);
            }
        });

        tblSuchen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblSuchen);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nachname:");

        btnSuchenNachNachname.setText("nach Nachname");
        btnSuchenNachNachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuchenNachNachnameActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Suche...");

        javax.swing.GroupLayout pSchuelerSuchenLayout = new javax.swing.GroupLayout(pSchuelerSuchen);
        pSchuelerSuchen.setLayout(pSchuelerSuchenLayout);
        pSchuelerSuchenLayout.setHorizontalGroup(
            pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pSchuelerSuchenLayout.createSequentialGroup()
                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSchuelerSuchenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addGroup(pSchuelerSuchenLayout.createSequentialGroup()
                                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSchuelerSuchenLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(pSchuelerSuchenLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNachnameSuchen)
                                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSchuelerSuchenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSchuelerSuchenLayout.createSequentialGroup()
                                .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuchenNachID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuchenNachNachname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        pSchuelerSuchenLayout.setVerticalGroup(
            pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSchuelerSuchenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNachnameSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuchenNachID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pSchuelerSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoeschen)
                    .addComponent(btnSuchenNachNachname))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tpSchueler.addTab("Schüler suchen", pSchuelerSuchen);

        btnFarbeAendern.setText("Farbe ändern");
        btnFarbeAendern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarbeAendernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFarbeinstellungenAendernSchuelerLayout = new javax.swing.GroupLayout(pFarbeinstellungenAendernSchueler);
        pFarbeinstellungenAendernSchueler.setLayout(pFarbeinstellungenAendernSchuelerLayout);
        pFarbeinstellungenAendernSchuelerLayout.setHorizontalGroup(
            pFarbeinstellungenAendernSchuelerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ccSchueler, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFarbeinstellungenAendernSchuelerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFarbeAendern)
                .addContainerGap())
        );
        pFarbeinstellungenAendernSchuelerLayout.setVerticalGroup(
            pFarbeinstellungenAendernSchuelerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFarbeinstellungenAendernSchuelerLayout.createSequentialGroup()
                .addComponent(ccSchueler, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFarbeAendern)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        tpSchueler.addTab("Farbeinstellungen anpassen", pFarbeinstellungenAendernSchueler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpSchueler)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpSchueler))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnzeigenActionPerformed
        Tabellenformat.tabelleLeeren(tblSchueler);
            
        for (Schueler einSchueler : Global.getEineSchuelerliste()) {
            ((DefaultTableModel) tblSchueler.getModel()).addRow(einSchueler.zeigeSchueler());
        }
    }//GEN-LAST:event_btnAnzeigenActionPerformed

    private void btnAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnlegenActionPerformed
        String nVorname = txtVorname.getText();
        String nNachname = txtNachname.getText();
        Object nHaus = cboHaus.getSelectedItem();
        Object nBlutsstatus = cboBlutsstatus.getSelectedItem();
        
        //Fehler abfangen: Leere Eingabefelder
        if(nVorname.length() == 0 || nNachname.length() == 0) {
            opMeldung.showMessageDialog(null, "Bitte alle Felder ausfüllen!");
            return;
        }
        
        //Fehler abfangen: Anlage gleicher Schueler verhindern

        //Mitteilungsfenster: Schueler erfolgreich angelegt!
        opMeldung.showMessageDialog(null, "Schüler erfolgreich angelegt!");
        
        einSchueler = new Schueler(nVorname, nNachname, nHaus, nBlutsstatus);        
        Global.getEineSchuelerliste().add(einSchueler);
    }//GEN-LAST:event_btnAnlegenActionPerformed

    private void btnFarbeAendernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarbeAendernActionPerformed
        this.setBackground(ccSchueler.getColor());
    }//GEN-LAST:event_btnFarbeAendernActionPerformed

    private void btnSuchenNachIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuchenNachIDActionPerformed
        Tabellenformat.tabelleLeeren(tblSuchen);
        int schuelerID = 0;
        
        //Fehler abfangen: Leeres Eingabefeld
        try {
            schuelerID = Integer.parseInt(txtID.getText());
            einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberID(schuelerID);
            ((DefaultTableModel) tblSuchen.getModel()).addRow(einSchueler.zeigeSchueler());
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Schüler wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnSuchenNachIDActionPerformed

    private void btnLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoeschenActionPerformed
        Tabellenformat.tabelleLeeren(tblSuchen);
        int schuelerID = 0;
        
        //Fehler abfangen: Leeres Eingabefeld
        try {
            schuelerID = Integer.parseInt(txtID.getText());
            einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberID(schuelerID);
            Global.getEineSchuelerliste().remove(einSchueler);
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Schüler wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnLoeschenActionPerformed

    private void btnSuchenNachNachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuchenNachNachnameActionPerformed
        Tabellenformat.tabelleLeeren(tblSuchen);
        
        //Fehler abfangen: Leeres Eingabefeld
        try {
        String schuelerNachname = txtNachnameSuchen.getText();
        einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberName(schuelerNachname);
        ((DefaultTableModel) tblSuchen.getModel()).addRow(einSchueler.zeigeSchueler());
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Schüler wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnSuchenNachNachnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnlegen;
    private javax.swing.JButton btnAnzeigen;
    private javax.swing.JButton btnFarbeAendern;
    private javax.swing.JButton btnLoeschen;
    private javax.swing.JButton btnSuchenNachID;
    private javax.swing.JButton btnSuchenNachNachname;
    private javax.swing.JComboBox<String> cboBlutsstatus;
    private javax.swing.JComboBox<String> cboHaus;
    private javax.swing.JColorChooser ccSchueler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JOptionPane opMeldung;
    private javax.swing.JPanel pFarbeinstellungenAendernSchueler;
    private javax.swing.JPanel pSchuelerAnlegenUndAnzeigen;
    private javax.swing.JPanel pSchuelerSuchen;
    private javax.swing.JTable tblSchueler;
    private javax.swing.JTable tblSuchen;
    private javax.swing.JTabbedPane tpSchueler;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNachname;
    private javax.swing.JTextField txtNachnameSuchen;
    private javax.swing.JTextField txtVorname;
    // End of variables declaration//GEN-END:variables
}
