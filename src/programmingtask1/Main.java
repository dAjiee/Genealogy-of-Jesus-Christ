/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programmingtask1;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Alexander
 */
public class Main extends javax.swing.JFrame {
    DoublyLinkedList list = new DoublyLinkedList();
    FileRW file = new FileRW(list);

    public Main() {
        file.read();
        initComponents();
        populateJTable1();
        initCustomComponents();
        
        //Search Table
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filter();
                jTextField1.repaint();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filter();
                jTextField1.repaint();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filter();
                jTextField1.repaint();
            }
            private void filter() {
                String text = jTextField1.getText();
                int columnIndex = jComboBox1.getSelectedIndex();
                if (text.isEmpty()) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
                }
                jTextField1.repaint();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSpinner3 = new JSpinner(new SpinnerNumberModel(1, 1, 75, 1));
        jSpinner4 = new JSpinner(new SpinnerNumberModel(75, 1, 75, 1));
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genealogy of Yeshua the Messiah");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("CMU Classical Serif", 1, 45)); // NOI18N
        jLabel1.setText("Genealogy of Yeshua the Messiah");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("CMU Serif", 1, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(list.PrintList());
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 140));

        jLabel2.setFont(new java.awt.Font("CMU Serif", 1, 18)); // NOI18N
        jLabel2.setText("Genealogy Order");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, 20));

        jLabel3.setFont(new java.awt.Font("CMU Serif", 0, 14)); // NOI18N
        jLabel3.setText("Generation to End:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("CMU Serif", 0, 14)); // NOI18N
        jLabel4.setText("Generation to Start:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age", "Verse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 470, 180));

        jLabel5.setFont(new java.awt.Font("CMU Serif", 1, 24)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, -1));

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 60, -1));

        jLabel7.setFont(new java.awt.Font("CMU Serif", 1, 24)); // NOI18N
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("CMU Serif", 3, 24)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 160, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new Color(0, 0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("CMU Serif", 0, 15)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(BorderFactory.createEmptyBorder());
        jTextArea2.setOpaque(false);
        jPanel1.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 180, 60));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new Color(0, 0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("CMU Serif", 0, 14)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(BorderFactory.createEmptyBorder());
        jTextArea3.setOpaque(false);
        jPanel1.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 190, 290));

        jLabel8.setFont(new java.awt.Font("CMU Serif", 0, 14)); // NOI18N
        jLabel8.setText("Search:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 260, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Age", "Verse" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jTabbedPane1.addTab("Genealogy", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new Color(0, 0, 0, 0));
        jTextPane1.setBorder(BorderFactory.createEmptyBorder());
        jTextPane1.setFocusable(false);
        jTextPane1.setOpaque(false);
        jTextPane1.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 460));

        jTabbedPane1.addTab("About", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        jTextArea1.setText(list.PrintList((int) jSpinner3.getValue(),(int) jSpinner4.getValue()));
        populateJTable();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        jTextArea1.setText(list.PrintList((int) jSpinner3.getValue(),(int) jSpinner4.getValue()));
        populateJTable();
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    Node node = list.FindByName((String) jTable1.getValueAt(selectedRow, 0),
                            (String) jTable1.getValueAt(selectedRow, 2));
                    jLabel6.setText(node.getName());
                    jTextArea2.setText(getAgeDesc(node));
                    jTextArea3.setText(getDesc(node));
                }
            }
        });
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Main().setVisible(true);
        }
    });
    }
    
    private String getAgeDesc(Node node){
        String string = "";
        if(node.getLived() != -1){
        string = ""
                + "Born: " + node.getBorn() + " BCE\n"
                + "Died: " + node.getDeath() + " BCE\n"
                + "Age: " + node.getLived();
        }else{
        string = ""
                + "Born: N/A\n"
                + "Died: N/A\n"
                + "Age: N/A";  
        }
        return string;
    }
    
    private String getDesc(Node node){
        String string = "";
        
        string = ""
                + "Parent: " + node.getPrevious().getName() + "\n"
                + "Child: " + node.getNext().getName() + "\n"
                + "\n"
                + "Verse/s: " + node.getVerse() + "\n"
                + "\n"
                + node.getDescription();
        
        return string;
    }
    
    private void populateJTable1() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.fireTableDataChanged();
        
        model.setRowCount(0);

        // Iterate through the ArrayList and add each object as a new row in the jTable1 model
        for (int i = 0; i < list.size; i++) {
            Object[] rowData = {
                list.FindByIndex(i).getName(),
                (list.FindByIndex(i).getLived() == -1) ? "N/A" : list.FindByIndex(i).getLived(),
                list.FindByIndex(i).getVerse()
            };
        model.addRow(rowData);
        }
        
        model.fireTableDataChanged();
    }
    
    private void populateJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.fireTableDataChanged();
        
        model.setRowCount(0);

        // Iterate through the ArrayList and add each object as a new row in the jTable1 model
        for (int i = (int) jSpinner3.getValue() - 1; i < (int) jSpinner4.getValue(); i++) {
            Object[] rowData = {
                list.FindByIndex(i).getName(),
                (list.FindByIndex(i).getLived() == -1) ? "N/A" : list.FindByIndex(i).getLived(),
                list.FindByIndex(i).getVerse()
            };
        model.addRow(rowData);
        }
        
        model.fireTableDataChanged();
    }
    
    private void initCustomComponents() {
        // Define a document which will hold text and its attributes
        StyledDocument doc = jTextPane1.getStyledDocument();

        // Define some attribute sets
        SimpleAttributeSet header = new SimpleAttributeSet();
        StyleConstants.setFontSize(header, 48);
        StyleConstants.setFontFamily(header, "CMU Serif");
        StyleConstants.setAlignment(header, StyleConstants.ALIGN_CENTER);
        
        SimpleAttributeSet author = new SimpleAttributeSet();
        StyleConstants.setItalic(author, true);
        StyleConstants.setFontSize(author, 15);
        StyleConstants.setFontFamily(author, "CMU Serif");

        SimpleAttributeSet text = new SimpleAttributeSet();
        StyleConstants.setFontSize(text, 15);
        StyleConstants.setFontFamily(text, "CMU Serif");

        // Add some content
        try {
            doc.insertString(doc.getLength(), "Programming Task #1\n", header);
            doc.insertString(doc.getLength(), "Alexander Vaugn T. Villasis | BSIT - BTM 2B\n\n", author);
            doc.setParagraphAttributes(0, doc.getLength(), header, false);
            
            doc.insertString(doc.getLength(), "This program shows the genealogy of the Bible starting from Adam "
                    + "to Jesus. However, the path taken is through Mary, the mother of Jesus. To know the number "
                    + "of years their generation has lived on starting from Adam to Abraham, what we can do is to "
                    + "subtract the year Adam was born (3924 BCE) to the person who died in the soonest year, whom "
                    + "is Eber (1737 BCE). This would give us a result of 2187 years of generation starting from Adam "
                    + "to Abraham. This can also be done from Adam to Jacob (2255 Years) and Adam to David (2924 Years). "
                    + "This program’s genealogy sticks to the current sources from the bible and confirmed with the "
                    + "different verses in the program which came from the Bible Family Tree website.\n\n" +
                        "Resources:\n\n" +
                        "Bible Family Tree. (2013). Biblefamilytree.info. https://biblefamilytree.info/ \n\n" +
                        "English Standard Version. (2016). English Standard Version. Biblia. https://biblia.com/books/esv/Jn1.1 \n\n" +
                        "Bible, C. (2023). Convert Bible References into Links | Logos Reftagger. Logos.com. https://www.logos.com/reftagger"
                    , text);

        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
