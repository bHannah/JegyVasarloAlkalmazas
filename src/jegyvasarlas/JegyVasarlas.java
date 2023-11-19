package jegyvasarlas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JegyVasarlas extends javax.swing.JFrame {
    

    public JegyVasarlas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filmek = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        hatter = new javax.swing.JPanel();
        jPanelCim = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFilm = new javax.swing.JPanel();
        film1 = new javax.swing.JRadioButton();
        film2 = new javax.swing.JRadioButton();
        film3 = new javax.swing.JRadioButton();
        film4 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        valasszfilmet = new javax.swing.JLabel();
        jPanelAdatok = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nev = new java.awt.TextField();
        szuletesidatum = new java.awt.TextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelKedvezmeny = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        gyermek = new javax.swing.JRadioButton();
        diak = new javax.swing.JRadioButton();
        fiatal = new javax.swing.JRadioButton();
        nyugdijas = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        jPanelMikor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        datumLb = new javax.swing.JLabel();
        kovetkezo = new java.awt.Button();
        elozo = new java.awt.Button();
        datumvalasztas = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        valasszDatumot = new javax.swing.JLabel();
        naptarkep = new javax.swing.JLabel();
        jPanelOsszesito = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Osszesito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        osszesites = new javax.swing.JTextArea();
        jButtonMegrendelem = new javax.swing.JToggleButton();
        jButtonMegsem = new javax.swing.JToggleButton();
        jPanelKeresesiFeltetelek = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        paholy = new javax.swing.JRadioButton();
        nagyterem = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        elso = new javax.swing.JRadioButton();
        kozepso = new javax.swing.JRadioButton();
        hatso = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mennyiseg = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        ketd = new javax.swing.JRadioButton();
        haromd = new javax.swing.JRadioButton();
        negyd = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jegyvásárlás");
        setResizable(false);

        hatter.setBackground(new java.awt.Color(255, 255, 255));

        jPanelCim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Jegyvásárlás - Tickets");

        javax.swing.GroupLayout jPanelCimLayout = new javax.swing.GroupLayout(jPanelCim);
        jPanelCim.setLayout(jPanelCimLayout);
        jPanelCimLayout.setHorizontalGroup(
            jPanelCimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCimLayout.setVerticalGroup(
            jPanelCimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelFilm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        filmek.add(film1);
        film1.setText("80 Nap Alatt a Föld Körül");
        film1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film1ActionPerformed(evt);
            }
        });

        filmek.add(film2);
        film2.setSelected(true);
        film2.setText("Felhőatlasz");
        film2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film2ActionPerformed(evt);
            }
        });

        filmek.add(film3);
        film3.setText("Eredet");
        film3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film3ActionPerformed(evt);
            }
        });

        filmek.add(film4);
        film4.setText("Platform");
        film4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film4ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        valasszfilmet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valasszfilmet.setText("Válassz Filmet");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valasszfilmet, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valasszfilmet)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFilmLayout = new javax.swing.GroupLayout(jPanelFilm);
        jPanelFilm.setLayout(jPanelFilmLayout);
        jPanelFilmLayout.setHorizontalGroup(
            jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(film2)
                            .addComponent(film1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(film3)
                            .addComponent(film4))
                        .addGap(36, 36, 36))))
        );
        jPanelFilmLayout.setVerticalGroup(
            jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(film1)
                    .addComponent(film3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(film2)
                    .addComponent(film4))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelAdatok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Név:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Születési dátum:");

        nev.setText("Ide írd a neved");

        szuletesidatum.setName(""); // NOI18N
        szuletesidatum.setText("Ide írd a születési dátumod");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Személyes adatok");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelAdatokLayout = new javax.swing.GroupLayout(jPanelAdatok);
        jPanelAdatok.setLayout(jPanelAdatokLayout);
        jPanelAdatokLayout.setHorizontalGroup(
            jPanelAdatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAdatokLayout.createSequentialGroup()
                        .addGroup(jPanelAdatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nev, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(szuletesidatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAdatokLayout.setVerticalGroup(
            jPanelAdatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdatokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(szuletesidatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelKedvezmeny.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Kedvezmények");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup4.add(gyermek);
        gyermek.setText("Gyermek (6 éven aluli - 60%)");
        gyermek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gyermekActionPerformed(evt);
            }
        });

        buttonGroup4.add(diak);
        diak.setText("Diákjegy (50%)");
        diak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diakActionPerformed(evt);
            }
        });

        buttonGroup4.add(fiatal);
        fiatal.setText("Fiatal felnőtt (26 éven aluliaknak - 33%)");
        fiatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiatalActionPerformed(evt);
            }
        });

        buttonGroup4.add(nyugdijas);
        nyugdijas.setText("Nyugdíjas (50%)");
        nyugdijas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyugdijasActionPerformed(evt);
            }
        });

        buttonGroup4.add(normal);
        normal.setSelected(true);
        normal.setText("Normál felnőtt jegy ");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKedvezmenyLayout = new javax.swing.GroupLayout(jPanelKedvezmeny);
        jPanelKedvezmeny.setLayout(jPanelKedvezmenyLayout);
        jPanelKedvezmenyLayout.setHorizontalGroup(
            jPanelKedvezmenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKedvezmenyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKedvezmenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelKedvezmenyLayout.createSequentialGroup()
                        .addGroup(jPanelKedvezmenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gyermek)
                            .addComponent(diak)
                            .addComponent(fiatal)
                            .addComponent(nyugdijas)
                            .addComponent(normal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelKedvezmenyLayout.setVerticalGroup(
            jPanelKedvezmenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKedvezmenyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gyermek)
                .addGap(12, 12, 12)
                .addComponent(diak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiatal)
                .addGap(12, 12, 12)
                .addComponent(nyugdijas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(normal)
                .addGap(21, 21, 21))
        );

        jPanelMikor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        datumLb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datumLb.setText("2023 November");

        kovetkezo.setLabel("Következő");
        kovetkezo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kovetkezoActionPerformed(evt);
            }
        });

        elozo.setActionCommand("");
        elozo.setLabel("Előző");
        elozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elozoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(elozo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(datumLb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(kovetkezo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(kovetkezo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(datumLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(elozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        datumvalasztas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válaszd ki melyik napon szeretnél mozizni", "2023 November 20", "2023 November 21", "2023 November 22", "2023 November 23", "2023 November 24", "2023 November 25", "2023 November 26", "2023 November 27", "2023 November 28", "2023 November 29", "2023 November 30", "2023 December 1", "2023 December 2", "2023 December 3", "2023 December 4", "2023 December 5", "2023 December 6", "2023 December 7", "2023 December 8", "2023 December 9", "2023 December 10", "2023 December 11", "2023 December 12", "2023 December 13", "2023 December 14", "2023 December 15", "2023 December 16", "2023 December 17", "2023 December 18", "2023 December 19", "2023 December 20", "2023 December 21" }));
        datumvalasztas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                datumvalasztasItemStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        valasszDatumot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valasszDatumot.setText("Válassz Dátumot!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valasszDatumot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valasszDatumot)
                .addContainerGap())
        );

        naptarkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jegyvasarlas/11.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMikorLayout = new javax.swing.GroupLayout(jPanelMikor);
        jPanelMikor.setLayout(jPanelMikorLayout);
        jPanelMikorLayout.setHorizontalGroup(
            jPanelMikorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMikorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMikorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datumvalasztas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naptarkep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMikorLayout.setVerticalGroup(
            jPanelMikorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMikorLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(naptarkep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datumvalasztas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanelOsszesito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Osszesito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Osszesito.setText("Összesítés:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Osszesito, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Osszesito, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        osszesites.setEditable(false);
        osszesites.setBackground(new java.awt.Color(255, 255, 255));
        osszesites.setColumns(20);
        osszesites.setRows(5);
        osszesites.setText("Megrendelésed itt fog megjelenni.\n");
        jScrollPane1.setViewportView(osszesites);

        javax.swing.GroupLayout jPanelOsszesitoLayout = new javax.swing.GroupLayout(jPanelOsszesito);
        jPanelOsszesito.setLayout(jPanelOsszesitoLayout);
        jPanelOsszesitoLayout.setHorizontalGroup(
            jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsszesitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelOsszesitoLayout.setVerticalGroup(
            jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsszesitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jButtonMegrendelem.setBackground(new java.awt.Color(255, 51, 51));
        jButtonMegrendelem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMegrendelem.setText("Mutasd A Lehetőségeket!");
        jButtonMegrendelem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMegrendelemActionPerformed(evt);
            }
        });

        jButtonMegsem.setBackground(new java.awt.Color(255, 51, 51));
        jButtonMegsem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMegsem.setText("Mégse");
        jButtonMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMegsemActionPerformed(evt);
            }
        });

        jPanelKeresesiFeltetelek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Keresési Feltételek");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(paholy);
        paholy.setText("Páholy");
        paholy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paholyActionPerformed(evt);
            }
        });

        buttonGroup1.add(nagyterem);
        nagyterem.setSelected(true);
        nagyterem.setText("Nagyterem");
        nagyterem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nagyteremActionPerformed(evt);
            }
        });

        jLabel11.setText("Elhelyezkedés:");

        buttonGroup2.add(elso);
        elso.setText("Első sorok");
        elso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elsoActionPerformed(evt);
            }
        });

        buttonGroup2.add(kozepso);
        kozepso.setText("Középső sorok");
        kozepso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kozepsoActionPerformed(evt);
            }
        });

        buttonGroup2.add(hatso);
        hatso.setText("Hátsó sorok");
        hatso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatsoActionPerformed(evt);
            }
        });

        jLabel12.setText("Hely:");

        jLabel13.setText("Mennyiség:");

        mennyiseg.setModel(new javax.swing.SpinnerNumberModel(1, 1, 65, 1));
        mennyiseg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        mennyiseg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mennyisegStateChanged(evt);
            }
        });

        jLabel14.setText("Vetítés:");

        buttonGroup3.add(ketd);
        ketd.setText("2D");
        ketd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketdActionPerformed(evt);
            }
        });

        buttonGroup3.add(haromd);
        haromd.setText("3D");
        haromd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haromdActionPerformed(evt);
            }
        });

        buttonGroup3.add(negyd);
        negyd.setText("4D");
        negyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negydActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKeresesiFeltetelekLayout = new javax.swing.GroupLayout(jPanelKeresesiFeltetelek);
        jPanelKeresesiFeltetelek.setLayout(jPanelKeresesiFeltetelekLayout);
        jPanelKeresesiFeltetelekLayout.setHorizontalGroup(
            jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                        .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paholy)
                                    .addComponent(nagyterem)
                                    .addComponent(jLabel11))
                                .addGap(71, 71, 71)
                                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                                        .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(elso)
                                            .addComponent(kozepso)
                                            .addComponent(hatso))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(negyd)
                                            .addComponent(haromd)
                                            .addComponent(ketd)))))
                            .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(mennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelKeresesiFeltetelekLayout.setVerticalGroup(
            jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeresesiFeltetelekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paholy)
                    .addComponent(elso)
                    .addComponent(ketd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nagyterem)
                    .addComponent(kozepso)
                    .addComponent(haromd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hatso)
                    .addComponent(negyd))
                .addGap(18, 18, 18)
                .addGroup(jPanelKeresesiFeltetelekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(mennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hatterLayout = new javax.swing.GroupLayout(hatter);
        hatter.setLayout(hatterLayout);
        hatterLayout.setHorizontalGroup(
            hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hatterLayout.createSequentialGroup()
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelKedvezmeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelAdatok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonMegsem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMegrendelem))
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelMikor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelKeresesiFeltetelek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelOsszesito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        hatterLayout.setVerticalGroup(
            hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(hatterLayout.createSequentialGroup()
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addComponent(jPanelFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanelAdatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelMikor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelKedvezmeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelKeresesiFeltetelek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanelOsszesito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMegsem)
                    .addComponent(jButtonMegrendelem))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMegsemActionPerformed
        JOptionPane.showMessageDialog(null, "Sajnáljuk, hogy nem minket választottál!");
    }//GEN-LAST:event_jButtonMegsemActionPerformed

    private void jButtonMegrendelemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMegrendelemActionPerformed
        boolean nincsPizzaValasztva = film1.isSelected() == false && film2.isSelected() == false
                && film3.isSelected() == false && film4.isSelected() == false;
        String uzenet, cim = "Jegyrendelés ";
        int ikonTipus;
        int datum = datumvalasztas.getSelectedIndex();
        if (nincsPizzaValasztva) {
            cim += "Hiányzó keresédi feltételek!";
            uzenet = "Nem választottad ki a filmet!:(";
            ikonTipus = 0;
        } else if (datum == 0){
            cim += "Hiányzó keresési feltételek!";
            uzenet = "Nem választottad ki melyik napon szeretnél moziba menni!";
            ikonTipus = 0;
        }
        else{
            cim += "Lehetőségek!";
            uzenet = "Ez egy kezdetleges projekt, ezen a felületen még dolgozunk!";
            ikonTipus = 1;
        }
        JOptionPane.showMessageDialog(null, uzenet, cim, ikonTipus);
    }//GEN-LAST:event_jButtonMegrendelemActionPerformed

    private void film1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film1ActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_film1ActionPerformed

    private void film3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film3ActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_film3ActionPerformed

    private void film2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film2ActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_film2ActionPerformed

    private void film4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film4ActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_film4ActionPerformed

    private void gyermekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gyermekActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_gyermekActionPerformed

    private void diakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diakActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_diakActionPerformed

    private void fiatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiatalActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_fiatalActionPerformed

    private void nyugdijasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyugdijasActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_nyugdijasActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_normalActionPerformed

    private void paholyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paholyActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_paholyActionPerformed

    private void nagyteremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nagyteremActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_nagyteremActionPerformed

    private void elsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elsoActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_elsoActionPerformed

    private void kozepsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kozepsoActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_kozepsoActionPerformed

    private void hatsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatsoActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_hatsoActionPerformed

    private void ketdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketdActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_ketdActionPerformed

    private void haromdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haromdActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_haromdActionPerformed

    private void negydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negydActionPerformed
        RendelesOsszesito();
    }//GEN-LAST:event_negydActionPerformed

    private void mennyisegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mennyisegStateChanged
        RendelesOsszesito();
    }//GEN-LAST:event_mennyisegStateChanged

    private void datumvalasztasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_datumvalasztasItemStateChanged
        RendelesOsszesito();
    }//GEN-LAST:event_datumvalasztasItemStateChanged

    private void elozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elozoActionPerformed
    elozo.addActionListener((ActionEvent e) -> {
        SwingUtilities.invokeLater(() -> {
            naptarkep.setIcon(new ImageIcon("elozoIkon.png"));
            System.out.println("Előző gomb kattintva");
        });
    });
    }//GEN-LAST:event_elozoActionPerformed

    private void kovetkezoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kovetkezoActionPerformed
    kovetkezo.addActionListener((ActionEvent e) -> {
        SwingUtilities.invokeLater(() -> {
            naptarkep.setIcon(new ImageIcon("kovetkezoIkon.png"));
            System.out.println("Következő gomb kattintva");
        });
    });
    }//GEN-LAST:event_kovetkezoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JegyVasarlas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Osszesito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel datumLb;
    private javax.swing.JComboBox<String> datumvalasztas;
    private javax.swing.JRadioButton diak;
    private java.awt.Button elozo;
    private javax.swing.JRadioButton elso;
    private javax.swing.JRadioButton fiatal;
    private javax.swing.JRadioButton film1;
    private javax.swing.JRadioButton film2;
    private javax.swing.JRadioButton film3;
    private javax.swing.JRadioButton film4;
    private javax.swing.ButtonGroup filmek;
    private javax.swing.JRadioButton gyermek;
    private javax.swing.JRadioButton haromd;
    private javax.swing.JRadioButton hatso;
    private javax.swing.JPanel hatter;
    private javax.swing.JToggleButton jButtonMegrendelem;
    private javax.swing.JToggleButton jButtonMegsem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAdatok;
    private javax.swing.JPanel jPanelCim;
    private javax.swing.JPanel jPanelFilm;
    private javax.swing.JPanel jPanelKedvezmeny;
    private javax.swing.JPanel jPanelKeresesiFeltetelek;
    private javax.swing.JPanel jPanelMikor;
    private javax.swing.JPanel jPanelOsszesito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton ketd;
    private java.awt.Button kovetkezo;
    private javax.swing.JRadioButton kozepso;
    private javax.swing.JSpinner mennyiseg;
    private javax.swing.JRadioButton nagyterem;
    private javax.swing.JLabel naptarkep;
    private javax.swing.JRadioButton negyd;
    private java.awt.TextField nev;
    private javax.swing.JRadioButton normal;
    private javax.swing.JRadioButton nyugdijas;
    private javax.swing.JTextArea osszesites;
    private javax.swing.JRadioButton paholy;
    private java.awt.TextField szuletesidatum;
    private javax.swing.JLabel valasszDatumot;
    private javax.swing.JLabel valasszfilmet;
    // End of variables declaration//GEN-END:variables

private void JegyarSzamolas() {    
    double alapar = 2000;
    double egyjegyar = 0;
    double vegosszeg = 0;
    
    if (normal.isSelected()){
        alapar = 2000;
    } else if (diak.isSelected()) {
        alapar = alapar * 0.5; 
    }else if (gyermek.isSelected()) {
        alapar = alapar * 0.6; 
    }else if (nyugdijas.isSelected()) {
        alapar = alapar * 0.5; 
    }else if (fiatal.isSelected()) {
        alapar = alapar * 0.33; 
    }
   
    int vetitesmod = 0;
    if (ketd.isSelected()) {
    vetitesmod = 0;
    }else if (haromd.isSelected()) {
    vetitesmod += 500;
    }else if (haromd.isSelected()) {
    vetitesmod += 1000;
    }
    
    int helyar = 0; 
    if (paholy.isSelected()) {
    helyar += 500;
    }
    
    egyjegyar = alapar + vetitesmod + helyar; 
    
    int darab = (int) mennyiseg.getValue();
    vegosszeg = egyjegyar * darab;
 }


private void RendelesOsszesito() {
    String rendeles = "";
    int darab = (int) mennyiseg.getValue();
    String film = "";
    if (film1.isSelected()) {
    film = "80 Nap Alatt a Föld Körül";
    }
    if (film2.isSelected()) {
    film = "Felhőatlasz";
    }
    if (film3.isSelected()) {
    film = "Eredet";
    }
    if (film4.isSelected()) {
    film = "Platform";}
    
    String hely = "";
    if (elso.isSelected()) {
    hely = "Az első sorok egyikébe";
    }
    if (kozepso.isSelected()) {
    hely = "A középső sorok egyikébe";
    }
    if (hatso.isSelected()) {
    hely = "A hátsó sorok egyikébe";
    }
    
    String tipus = "";
    if (ketd.isSelected()) {
    tipus = "2D";
    }if (haromd.isSelected()) {
    tipus = "3D";
    }if (negyd.isSelected()) {
    tipus = "4D";
    }
    
    String elhelyezkedes = "";
    if (paholy.isSelected()) {
    elhelyezkedes = " - Páholy";
    }if (nagyterem.isSelected()) {
    elhelyezkedes = " - Nagyterem";
    }
    
    String datum = (String) datumvalasztas.getSelectedItem();
    int alapar = 2000 * darab;
    String kedvezmeny = "";
    double kedv = 0;
    
    if (normal.isSelected()) {
    kedvezmeny = "Nincs kedvezmény";
    kedv = 1;
    }if (fiatal.isSelected()) {
    kedvezmeny = "33%-os kedvezmény";
    kedv = 0.77;
    }if (nyugdijas.isSelected()) {
    kedvezmeny = "50%-os kedvezmény";
    kedv = 0.5;
    }if (gyermek.isSelected()) {
    kedvezmeny = "60%-os kedvezmény";
    kedv = 0.4;
    }if (diak.isSelected()) {
    kedvezmeny = "50%-os kedvezmény";
    kedv = 0.5;
    }
    
    String megrendelonev = nev.getText();
    String megrendeloszuletes = szuletesidatum.getText();
    
    rendeles = "A rendelésed: " + "\n" + darab +"db jegy " + "\n" + "A "+ film + " című filmre" + "\n" + hely + elhelyezkedes + "\n" + "A vetítés típusa: " + tipus + "\n" + "\n" + "Mikor: " + datum + "\n" + "\n"
             + "Jegyár: " + "\n" + "Alapár: " + alapar + "\n" + "Kedvezmény: " +kedvezmeny + "\n" + "Kedvezményes jegy(ek) ára: " + (alapar * kedv) + "\n" + "\n" + "Megrendelő neve:" + megrendelonev + "\n" + "Megrendelő születési dátuma:" + megrendeloszuletes 
             + "\n" + "A jegyek foglalásra kerülnek, és átvehetőek a" + "\n" + "jegypénztárban a szóban forgó film vetítése" + "\n" + "előtt legkésőbb 30 perccel.";
            
    osszesites.setText(rendeles);
    }

}