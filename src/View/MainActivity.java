/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import App.Connect;
import App.Resources;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import static com.mongodb.client.model.Filters.eq;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author LENOVO
 */
public final class MainActivity extends javax.swing.JFrame {

    DefaultTableModel model;
    /**
     * Creates new form MainActivity
     */
    public MainActivity() {
        setUndecorated(true);
        setIcon();
        initComponents();
        addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                loadData("");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("tidak fokus");
            }
        });
        
        Object[] header = {"NO", "ID", "Nama Buku","Genre Buku","Harga Buku"};
        model = new DefaultTableModel(header, 0);
        DataTabel.setModel(model);
        DataTabel.setBackground(Color.decode("#050A30"));
        DataTabel.setRowHeight(30);
        DataTabel.getColumnModel().getColumn(0).setMinWidth(35);
        DataTabel.getColumnModel().getColumn(0).setMaxWidth(35);
        DataTabel.getColumnModel().getColumn(2).setMinWidth(150);        
        DataTabel.getColumnModel().getColumn(2).setMaxWidth(150);        
        DataTabel.getColumnModel().getColumn(3).setMinWidth(130);
        DataTabel.getColumnModel().getColumn(3).setMaxWidth(130);
        loadData("");
        
        setTitle("Daftar Buku");
        // Rounded corners
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new View.PanelBorder();
        Dasboard = new javax.swing.JLabel();
        AddData = new javax.swing.JLabel();
        UpdateData = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ExportPDF = new javax.swing.JLabel();
        DeleteData = new javax.swing.JLabel();
        ExportExcel = new javax.swing.JLabel();
        menu1 = new View.PanelMenu();
        dashboardPanel = new javax.swing.JPanel();
        card3 = new View.Card();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jmlhUmkm = new javax.swing.JLabel();
        card4 = new View.Card();
        jLabel6 = new javax.swing.JLabel();
        jmlhUmkmKabTegal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        card5 = new View.Card();
        jLabel7 = new javax.swing.JLabel();
        jmlhUmkmKotaTegal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchText = new App.SearchText();
        closeBtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBorder1.setBackground(new Color(0, 0, 0, 0));
        panelBorder1.setForeground(new Color(0, 0, 0, 0));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dasboard.setBackground(new Color(255, 255, 255, 50));
        Dasboard.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        Dasboard.setForeground(new java.awt.Color(255, 255, 255));
        Dasboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/1.png"))); // NOI18N
        Dasboard.setText("    Dashboard");
        Dasboard.setToolTipText("");
        Dasboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        Dasboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dasboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DasboardMousePressed(evt);
            }
        });
        panelBorder1.add(Dasboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 40));

        AddData.setBackground(new Color(255, 255, 255, 50)
        );
        AddData.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        AddData.setForeground(new java.awt.Color(255, 255, 255));
        AddData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/2.png"))); // NOI18N
        AddData.setText("     Add Data");
        AddData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        AddData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddDataMousePressed(evt);
            }
        });
        panelBorder1.add(AddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 40));

        UpdateData.setBackground(new Color(255, 255, 255, 50));
        UpdateData.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        UpdateData.setForeground(new java.awt.Color(255, 255, 255));
        UpdateData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/4.png"))); // NOI18N
        UpdateData.setText("    Update Data");
        UpdateData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        UpdateData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpdateDataMousePressed(evt);
            }
        });
        panelBorder1.add(UpdateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 40));

        Logout.setBackground(new Color(255, 255, 255, 50));
        Logout.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/7.png"))); // NOI18N
        Logout.setText("    Log out");
        Logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });
        panelBorder1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 40));

        ExportPDF.setBackground(new Color(255, 255, 255, 50));
        ExportPDF.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        ExportPDF.setForeground(new java.awt.Color(255, 255, 255));
        ExportPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/pdf (1).png"))); // NOI18N
        ExportPDF.setText("   Export PDF");
        ExportPDF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        ExportPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExportPDFMousePressed(evt);
            }
        });
        panelBorder1.add(ExportPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 40));

        DeleteData.setBackground(new Color(255, 255, 255, 50));
        DeleteData.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        DeleteData.setForeground(new java.awt.Color(255, 255, 255));
        DeleteData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/6.png"))); // NOI18N
        DeleteData.setText("    Delete Data");
        DeleteData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        DeleteData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeleteDataMousePressed(evt);
            }
        });
        panelBorder1.add(DeleteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 40));

        ExportExcel.setBackground(new Color(255, 255, 255, 50));
        ExportExcel.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        ExportExcel.setForeground(new java.awt.Color(255, 255, 255));
        ExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/xls (1).png"))); // NOI18N
        ExportExcel.setText("   Export xls");
        ExportExcel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 1));
        ExportExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExportExcelMousePressed(evt);
            }
        });
        panelBorder1.add(ExportExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 40));

        menu1.setBackground(new Color(0, 0, 0, 80)
        );
        panelBorder1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card3.setColor1(new java.awt.Color(102, 0, 255));
        card3.setColor2(new java.awt.Color(204, 51, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JUmlah UMKM");

        jmlhUmkm.setBackground(new java.awt.Color(255, 255, 255));
        jmlhUmkm.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jmlhUmkm.setForeground(new java.awt.Color(255, 255, 255));
        jmlhUmkm.setText("0");

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(card3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jmlhUmkm)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        card3Layout.setVerticalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmlhUmkm)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        dashboardPanel.add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 120));

        card4.setColor1(new java.awt.Color(17, 153, 142));
        card4.setColor2(new java.awt.Color(56, 239, 125));

        jmlhUmkmKabTegal.setBackground(new java.awt.Color(255, 255, 255));
        jmlhUmkmKabTegal.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jmlhUmkmKabTegal.setForeground(new java.awt.Color(255, 255, 255));
        jmlhUmkmKabTegal.setText("0");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UMKM Kab.Tegal");

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card4Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jmlhUmkmKabTegal)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card4Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jmlhUmkmKabTegal)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        dashboardPanel.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 220, -1));

        card5.setColor1(new java.awt.Color(252, 74, 26));
        card5.setColor2(new java.awt.Color(247, 183, 51));

        jmlhUmkmKotaTegal.setBackground(new java.awt.Color(255, 255, 255));
        jmlhUmkmKotaTegal.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jmlhUmkmKotaTegal.setForeground(new java.awt.Color(255, 255, 255));
        jmlhUmkmKotaTegal.setText("0");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UMKM Kota Tegal");

        javax.swing.GroupLayout card5Layout = new javax.swing.GroupLayout(card5);
        card5.setLayout(card5Layout);
        card5Layout.setHorizontalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card5Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jmlhUmkmKotaTegal)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );
        card5Layout.setVerticalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card5Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jmlhUmkmKotaTegal)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        dashboardPanel.add(card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 220, -1));

        DataTabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DataTabel.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        DataTabel.setForeground(new java.awt.Color(255, 255, 255));
        DataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama UMKM", "Jenis UMKM", "Pemilik UMKM", "Alamat UMKM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DataTabel.setFocusable(false);
        DataTabel.setGridColor(new Color(255, 255, 255, 0)
        );
        DataTabel.setOpaque(false);
        DataTabel.setSelectionBackground(new java.awt.Color(102, 153, 255));
        DataTabel.setShowGrid(false);
        DataTabel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DataTabel);

        dashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 970, 360));

        panelBorder1.add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 50, 1020, 550));

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Group 1.png"))); // NOI18N
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 50));

        getContentPane().add(panelBorder1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDataMousePressed
   
        Add plus = new Add();
        plus.setVisible(true);
        this.loadData("");
    }//GEN-LAST:event_AddDataMousePressed

    private void UpdateDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDataMousePressed
        
        int baris = DataTabel.getSelectedRow();
        if (baris != -1) {
            int id = Integer.parseInt(DataTabel.getValueAt(baris, 1).toString()) ;
            String nama = DataTabel.getValueAt(baris, 2).toString();
            String jenis = DataTabel.getValueAt(baris, 3).toString();
            String bidang = DataTabel.getValueAt(baris, 4).toString();
            String pemilik = DataTabel.getValueAt(baris, 5).toString();
            String alamat = DataTabel.getValueAt(baris, 6).toString();
            String kota_kab = DataTabel.getValueAt(baris, 7).toString();
            
            Resources d = new Resources();
            d.setId_umkm(id);
            d.setNama_umkm(nama);
            d.setJenis_umkm(jenis);
            d.setBidang_umkm(bidang);
            d.setPemilik_umkm(pemilik);
            d.setAlamat_umkm(alamat);
            d.setKota_kabupaten(kota_kab);
            
            Update up = new Update(d);
            up.setVisible(true);
            
        }
    }//GEN-LAST:event_UpdateDataMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        
        int logout = JOptionPane.showConfirmDialog(this, "Sign Out from Applications ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            dispose();
            this.setVisible(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            new Login().setVisible(true);
        } else {
            this.setDefaultCloseOperation(ABORT);
        }
    }//GEN-LAST:event_LogoutMousePressed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(this, "EXIT Applications ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            dispose();
            this.setVisible(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(ABORT);
        }
    }//GEN-LAST:event_closeBtnMousePressed

    private void ExportPDFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportPDFMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExportPDFMousePressed

    private void ExportExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportExcelMousePressed
        // TODO add your handling code here:
        
        FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                TableModel tModel = DataTabel.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
            // write header
                for(int i = 0; i < tModel.getColumnCount(); i++){
                    if(i==1){
                        continue;
                    }
                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
            // write record
                for(int i=0; i < tModel.getRowCount(); i++) {
                for(int j=0; j < tModel.getColumnCount(); j++) {
                    if(j==1){
                        continue;
                    }
                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                JOptionPane.showMessageDialog(null, "File saved successfully");
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_ExportExcelMousePressed

    private void DeleteDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteDataMousePressed
//        // TODO add your handling code here:
//        
        int r = DataTabel.getSelectedRow();
        if (r != -1) {
            String id = (String) DataTabel.getValueAt(r, 2);
            System.out.println(id);
            int pilih = JOptionPane.showConfirmDialog(this,""
                + "Apakah anda yakin ?","Konfirmasi",
                JOptionPane.YES_NO_OPTION);
            if (pilih == 0) {
//                try {
//                    Connection c = Connect.MySQl();
//                    Statement st = c.createStatement();
//                    String q = "DELETE FROM umkm WHERE id_umkm="+id+"";
//                    st.executeUpdate(q);
//                    loadData("");
//                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
//                } catch (SQLException e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage());
//                }

                String idBuku = "";
                try {
                    MongoDatabase db = Connect.connectDB();
                    MongoIterable<String> tables = db.listCollectionNames();
                    
                    MongoCollection<Document> coll = db.getCollection("book_list");
                    Document doc = coll.findOneAndDelete(eq("book_name",id));
                    
                    loadData("");
                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
                    
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus");
            }
        } else {
        }
    }//GEN-LAST:event_DeleteDataMousePressed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        // TODO add your handling code here:
        String key = searchText.getText();
        if (key.isEmpty()) {
            loadData("");
        }else{
            loadData(key);
        }
    }//GEN-LAST:event_searchTextKeyReleased

    private void DasboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DasboardMousePressed
        // TODO add your handling code here:
        loadData("");
    }//GEN-LAST:event_DasboardMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainActivity().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddData;
    private javax.swing.JLabel Dasboard;
    private javax.swing.JTable DataTabel;
    private javax.swing.JLabel DeleteData;
    private javax.swing.JLabel ExportExcel;
    private javax.swing.JLabel ExportPDF;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel UpdateData;
    private View.Card card3;
    private View.Card card4;
    private View.Card card5;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jmlhUmkm;
    private javax.swing.JLabel jmlhUmkmKabTegal;
    private javax.swing.JLabel jmlhUmkmKotaTegal;
    private View.PanelMenu menu1;
    private View.PanelBorder panelBorder1;
    private App.SearchText searchText;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resource/Icon-frame.png")));
    }
    
    public void TambahComponent(JPanel panel) {
        if (dashboardPanel.getComponentCount() > 0) {
            panelBorder1.removeAll();
        }
        panelBorder1.add(panel, BorderLayout.CENTER);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
    }
    
    public void rmBgColorLbl(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255, 0));
        lbl.removeAll();
        lbl.setOpaque(false);
    }
    
    public void setBgColorLbl(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255, 50));
        lbl.setOpaque(true);
    }
    
    public void loadData(String key) {
        try {
            Object[] kolom = {"NO", "ID", "Nama Buku","Genre Buku","Harga Buku"};
            this.model = new DefaultTableModel(null, kolom);
            this.DataTabel.setModel(model);
            int no = 0, fiksi = 0, nonFiksi = 0;
            
            MongoDatabase database = Connect.connectDB();
            MongoCollection<Document> coll = database.getCollection("book_list");
//            MongoIterable<Document> data = coll.find();
            MongoCursor<Document> cursor = coll.find().iterator();
            while (cursor.hasNext()) {
                Document obj = (Document) cursor.next();
                no++;
                String id = (String) obj.getObjectId("_id").toString();
                String name_book = (String) obj.get("book_name");
                String genre = (String) obj.get("genre");
                String price = (String) obj.get("price");
                Object[] data = {no, id, name_book, genre, price};
                int totalData = data.length-1;
                model.addRow(data);
                
            }
        } catch (Exception e) {
        }
        System.out.println("ini load data");
    }
}
