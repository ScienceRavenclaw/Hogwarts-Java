package Hogwarts;

import javax.swing.table.DefaultTableModel;

public class FrameProfessoren extends javax.swing.JInternalFrame {
    Professoren einProfessor;
    Professorenliste eineProfessorenliste;
    
    public FrameProfessoren() {
        initComponents();
        //Hinzufuegen der einzelnen Items fuer die Combobox Haus.
        cboHauslehrerDesHauses.addItem("Ravenclaw");
        cboHauslehrerDesHauses.addItem("Hufflepuff");
        cboHauslehrerDesHauses.addItem("Slytherin");
        cboHauslehrerDesHauses.addItem("Gryffindor");
        cboHauslehrerDesHauses.addItem("-");
        //Ende der Hinzufuegung der einzelnen Items.
        Tabellenformat.tabelle5Spalten(tblProfessoren, "ID", "Vorname", "Nachname", "Fach", "Hauslehrer des Hauses");
        Tabellenformat.tabelle5Spalten(tblSuchen, "ID", "Vorname", "Nachname", "Fach", "Hauslehrer des Hauses");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opMeldung = new javax.swing.JOptionPane();
        tpProfessorenAnlegenUndAnzeigen = new javax.swing.JTabbedPane();
        pProfessorenAnlegenUndAnzeigen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVorname = new javax.swing.JTextField();
        txtFach = new javax.swing.JTextField();
        txtNachname = new javax.swing.JTextField();
        cboHauslehrerDesHauses = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfessoren = new javax.swing.JTable();
        btnAnlegen = new javax.swing.JButton();
        btnAnzeigen = new javax.swing.JButton();
        pProfessorSuchen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuchen = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnSuchenNachID = new javax.swing.JButton();
        btnLoeschen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNachnameSuchen = new javax.swing.JTextField();
        btnSuchenNachNachname = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pFarbeinstellungenAendernProfessoren = new javax.swing.JPanel();
        ccProfessoren = new javax.swing.JColorChooser();
        btnFarbeAendern = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Professoren anlegen & anzeigen");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vorname:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nachname:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fach:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Hauslehrer des Hauses:");

        tblProfessoren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProfessoren);

        btnAnlegen.setText("Anlegen");
        btnAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnlegenActionPerformed(evt);
            }
        });

        btnAnzeigen.setText("Anzeigen");
        btnAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnzeigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pProfessorenAnlegenUndAnzeigenLayout = new javax.swing.GroupLayout(pProfessorenAnlegenUndAnzeigen);
        pProfessorenAnlegenUndAnzeigen.setLayout(pProfessorenAnlegenUndAnzeigenLayout);
        pProfessorenAnlegenUndAnzeigenLayout.setHorizontalGroup(
            pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createSequentialGroup()
                        .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pProfessorenAnlegenUndAnzeigenLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtVorname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createSequentialGroup()
                                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboHauslehrerDesHauses, 0, 200, Short.MAX_VALUE)
                                    .addComponent(txtNachname)
                                    .addComponent(txtFach))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pProfessorenAnlegenUndAnzeigenLayout.setVerticalGroup(
            pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pProfessorenAnlegenUndAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboHauslehrerDesHauses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnlegen)
                    .addComponent(btnAnzeigen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tpProfessorenAnlegenUndAnzeigen.addTab("Professoren anlegen & anzeigen", pProfessorenAnlegenUndAnzeigen);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Professor suchen");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID:");

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

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nachname:");

        btnSuchenNachNachname.setText("nach Nachname");
        btnSuchenNachNachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuchenNachNachnameActionPerformed(evt);
            }
        });

        jLabel9.setText("Suche...");

        javax.swing.GroupLayout pProfessorSuchenLayout = new javax.swing.GroupLayout(pProfessorSuchen);
        pProfessorSuchen.setLayout(pProfessorSuchenLayout);
        pProfessorSuchenLayout.setHorizontalGroup(
            pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pProfessorSuchenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(pProfessorSuchenLayout.createSequentialGroup()
                        .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pProfessorSuchenLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pProfessorSuchenLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNachnameSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProfessorSuchenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProfessorSuchenLayout.createSequentialGroup()
                                .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuchenNachID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuchenNachNachname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        pProfessorSuchenLayout.setVerticalGroup(
            pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfessorSuchenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNachnameSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuchenNachID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProfessorSuchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoeschen)
                    .addComponent(btnSuchenNachNachname))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tpProfessorenAnlegenUndAnzeigen.addTab("Professor suchen", pProfessorSuchen);

        btnFarbeAendern.setText("Farbe ändern");
        btnFarbeAendern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarbeAendernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFarbeinstellungenAendernProfessorenLayout = new javax.swing.GroupLayout(pFarbeinstellungenAendernProfessoren);
        pFarbeinstellungenAendernProfessoren.setLayout(pFarbeinstellungenAendernProfessorenLayout);
        pFarbeinstellungenAendernProfessorenLayout.setHorizontalGroup(
            pFarbeinstellungenAendernProfessorenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ccProfessoren, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFarbeinstellungenAendernProfessorenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFarbeAendern)
                .addContainerGap())
        );
        pFarbeinstellungenAendernProfessorenLayout.setVerticalGroup(
            pFarbeinstellungenAendernProfessorenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFarbeinstellungenAendernProfessorenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ccProfessoren, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFarbeAendern)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        tpProfessorenAnlegenUndAnzeigen.addTab("Farbeinstellungen anpassen", pFarbeinstellungenAendernProfessoren);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpProfessorenAnlegenUndAnzeigen)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpProfessorenAnlegenUndAnzeigen))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnzeigenActionPerformed
        Tabellenformat.tabelleLeeren(tblProfessoren);
        
        for (Professoren einProfessor : Global.getEineProfessorenliste()) {
            ((DefaultTableModel) tblProfessoren.getModel()).addRow(einProfessor.zeigeProfessor());
        }
          
    }//GEN-LAST:event_btnAnzeigenActionPerformed

    private void btnAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnlegenActionPerformed
        String nVorname = txtVorname.getText();
        String nNachname = txtNachname.getText();
        String nFach = txtFach.getText();
        Object nHauslehrer = cboHauslehrerDesHauses.getSelectedItem();
        
        //Fehler abfangen: Leere Eingabefelder
        if(nVorname.length() == 0 || nNachname.length() == 0 || nFach.length() == 0) {
            opMeldung.showMessageDialog(null, "Bitte alle Felder ausfüllen!");
            return;
        }
        
        //Mitteilungsfenster: Professor erfolgreich angelegt!
        opMeldung.showMessageDialog(null, "Professor erfolgreich angelegt!");
        
        einProfessor = new Professoren(nVorname, nNachname, nFach, nHauslehrer);
        Global.getEineProfessorenliste().add(einProfessor);
    }//GEN-LAST:event_btnAnlegenActionPerformed

    private void btnFarbeAendernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarbeAendernActionPerformed
         this.setBackground(ccProfessoren.getColor());
    }//GEN-LAST:event_btnFarbeAendernActionPerformed

    private void btnSuchenNachIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuchenNachIDActionPerformed
        Tabellenformat.tabelleLeeren(tblSuchen);
        int professorenID = 0;
        
        //Fehler abfangen: Leeres Eingabefeld
        try {
            professorenID = Integer.parseInt(txtID.getText());
            einProfessor = Global.getEineProfessorenliste().findeProfessorUeberID(professorenID);
            ((DefaultTableModel) tblSuchen.getModel()).addRow(einProfessor.zeigeProfessor());
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Professor wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnSuchenNachIDActionPerformed

    private void btnLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoeschenActionPerformed
        Tabellenformat.tabelleLeeren(tblSuchen);
        int professorenID = 0;
        
        //Fehler abfangen: Leeres Eingabefeld
        try {
            professorenID = Integer.parseInt(txtID.getText());
            einProfessor = Global.getEineProfessorenliste().findeProfessorUeberID(professorenID);
            Global.getEineProfessorenliste().remove(einProfessor);
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Professor wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnLoeschenActionPerformed

    private void btnSuchenNachNachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuchenNachNachnameActionPerformed
        //Fehler abfangen: Leeres Eingabefeld
        Tabellenformat.tabelleLeeren(tblSuchen);
        
        try {
        String professorenNachname = txtNachnameSuchen.getText();
        einProfessor = Global.getEineProfessorenliste().findeProfessorUeberName(professorenNachname);
        ((DefaultTableModel) tblSuchen.getModel()).addRow(einProfessor.zeigeProfessor());
        } catch(Exception ex) {
            opMeldung.showMessageDialog(null, "Entweder war das Eingabefeld leer oder der Professor wurde nicht gefunden!");
        }
    }//GEN-LAST:event_btnSuchenNachNachnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnlegen;
    private javax.swing.JButton btnAnzeigen;
    private javax.swing.JButton btnFarbeAendern;
    private javax.swing.JButton btnLoeschen;
    private javax.swing.JButton btnSuchenNachID;
    private javax.swing.JButton btnSuchenNachNachname;
    private javax.swing.JComboBox<String> cboHauslehrerDesHauses;
    private javax.swing.JColorChooser ccProfessoren;
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
    private javax.swing.JPanel pFarbeinstellungenAendernProfessoren;
    private javax.swing.JPanel pProfessorSuchen;
    private javax.swing.JPanel pProfessorenAnlegenUndAnzeigen;
    private javax.swing.JTable tblProfessoren;
    private javax.swing.JTable tblSuchen;
    private javax.swing.JTabbedPane tpProfessorenAnlegenUndAnzeigen;
    private javax.swing.JTextField txtFach;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNachname;
    private javax.swing.JTextField txtNachnameSuchen;
    private javax.swing.JTextField txtVorname;
    // End of variables declaration//GEN-END:variables
}
