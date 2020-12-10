package Hogwarts;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.text.*;
import java.util.*;

public class Tabellenformat {

    //---------------------- Beginn Tabellenformatierer ------------------------
    static DefaultTableCellRenderer r = new DefaultTableCellRenderer() {

        @Override
           public void setValue(Object value) {

             try {
                if (value instanceof String) {
                    setHorizontalAlignment(JLabel.LEFT);
                    setText(String.format("%-15s", value));
                } else if (value instanceof Double) {
                    setHorizontalAlignment(JLabel.RIGHT);
                    setText(String.format("%,10.2f €", value));
                 }
                else if (value instanceof Integer) {
                    setHorizontalAlignment(JLabel.RIGHT);
                    //setText(String.valueOf(value));
                    setText(String.format("%10d", value));
                } else if (value instanceof Date) {
                   SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                   setText(sd.format(value));
                }
            } catch (Exception e) {
            }
        }
    };

  
    public static String tabelleLeeren(JTable eineTabelle) {
        String meldung = "";
        try {
            while (eineTabelle.getRowCount() > 0) {
                ((DefaultTableModel) eineTabelle.getModel()).removeRow(0);
            }
        } catch (Exception ex) {
            meldung = "Fehler bei der Eingabe";
        }
        return meldung;
    }

    public static void formatiereTabelle(JTable eineTabelle) {
        tabelleLeeren(eineTabelle);
        JTableHeader einHeader = eineTabelle.getTableHeader();
        einHeader.setBackground(new Color(194, 194, 194));
        einHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        eineTabelle.setFont(new Font("Calibri", Font.PLAIN, 12));
        eineTabelle.setDefaultRenderer(Object.class, r);
    
    }

    public static void tabelle2Spalten(JTable eineTabelle, String s1, String s2) {
        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
               new String[]{s1, s2}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle3Spalten(JTable eineTabelle, String s1, String s2, String s3) {
        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle4Spalten(JTable eineTabelle, String s1, String s2, String s3, String s4) {
        formatiereTabelle(eineTabelle);


        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }

    }

    public static void tabelle5Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
               new String[]{s1, s2, s3, s4, s5}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle6Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6) {
         formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6}));


        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

     public static void tabelle7Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

     public static void tabelle8Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }


      public static void tabelle9Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8, String s9) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle10Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10}));
        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle11Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }

    }

     public static void tabelle12Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }


    public static void tabelle13Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12, String s13) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle14Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12, String s13, String s14) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14}));

        for (int i = 0; i <= eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle15Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12, String s13, String s14, String s15) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle16Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12, String s13, String s14,
            String s15, String s16) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }

    public static void tabelle17Spalten(JTable eineTabelle, String s1, String s2,
            String s3, String s4, String s5, String s6, String s7, String s8,
            String s9, String s10, String s11, String s12, String s13, String s14,
            String s15, String s16, String s17) {

        formatiereTabelle(eineTabelle);

        eineTabelle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17}));

        for (int i = 0; i < eineTabelle.getModel().getColumnCount(); i++) {
            eineTabelle.getColumnModel().getColumn(i);
        }
    }
}
