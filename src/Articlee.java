
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Articlee extends javax.swing.JFrame {

    /**
     * Creates new form Articlee
     */
    public Articlee() {
        initComponents();
    isbn.setVisible(false);
    labisn.setVisible(false);
    supp.setVisible(false);
    combchoix.setVisible(false);
    rech.setVisible(false);
    tablemodele = (DefaultTableModel) tableLivre.getModel();
    tableLivre.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestion = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        choix = new javax.swing.JComboBox<>();
        Valider = new javax.swing.JButton();
        combchoix = new javax.swing.JComboBox<>();
        labisn = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        supp = new javax.swing.JButton();
        rech = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivre = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gestion.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        gestion.setText("Gestion des Articles");

        Retour.setText("< Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        choix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ajouter Article", "Supprimer Article", "Rechercher Article", "Afficher tous les Articles", " " }));

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        combchoix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "rubrique", "ISBN", "titre", "Editeur", "anneeEdition", "URL", "favorie", "recommande" }));

        labisn.setText("ISBN:");

        supp.setText("Supprimer");
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        rech.setText("Rechercher");
        rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechActionPerformed(evt);
            }
        });

        tableLivre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "rubrique", "ISBN", "titre", "Editeur", "anneeEdition", "URL", "favorie", "recommande", "Auteur1", "Auteur2", "Auteur3", "Auteur4", "Auteur5"
            }
        ));
        jScrollPane1.setViewportView(tableLivre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Retour)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Valider)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combchoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(labisn)
                        .addGap(118, 118, 118)
                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supp)
                .addGap(37, 37, 37)
                .addComponent(rech)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Retour)
                .addGap(23, 23, 23)
                .addComponent(gestion)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valider))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combchoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labisn)
                    .addComponent(supp)
                    .addComponent(rech)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
         Documents frameX = new Documents();
    frameX.setVisible(true);
    }//GEN-LAST:event_RetourActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
      tablemodele.setRowCount(0);
      String a = isbn.getText();
    isbn.setText("");
    GestionArticle gest = new GestionArticle();
    LinkedList<Article> articles = new LinkedList<>();
        switch(choix.getSelectedItem().toString()){
        case "Ajouter Article":
            {
                AddArticle frameXe = new AddArticle();
    frameXe.setVisible(true);
    tableLivre.setVisible(false);
    
            }
        break;

        case "Supprimer Article": {
               isbn.setVisible(true);
               labisn.setVisible(true);
               supp.setVisible(true);
               combchoix.setVisible(false);
               
               rech.setVisible(false);
               tableLivre.setVisible(false);
           }
        break;

        case "Rechercher Article":{
              
               labisn.setVisible(false);
               supp.setVisible(false);
               combchoix.setVisible(true);
               isbn.setVisible(true);
               rech.setVisible(true);
              tableLivre.setVisible(true);
               
           }
        break;
        case "Afficher tous les Articles":{
            tableLivre.setVisible(true);
               isbn.setVisible(false);
               labisn.setVisible(false);
               supp.setVisible(false);
               combchoix.setVisible(false);
               
               rech.setVisible(false);
                tablemodele.setRowCount(0);
                GestionArticle geste = new GestionArticle();
    LinkedList<Article> articless = new LinkedList<>();
    try {
        articless = geste.afficherTousLesArticles();
    } catch (SQLException ex) {
        Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
    }
    for (Article livre : articless) {
        Object[] rowData = {
                livre.getRubrique(),
                livre.getISBN(),
                livre.getTitre(),
                livre.getEditeur(),
                livre.getAnneeEdition(),
                livre.getURL(),
                livre.getFavorie(),
                livre.getRecommande(),
                livre.getAuteur1(),
                livre.getAuteur2(),
                livre.getAuteur3(),
                livre.getAuteur4(),
                livre.getAuteur5()
        };
        tablemodele.addRow(rowData);
               
    }
        break;}}
    }//GEN-LAST:event_ValiderActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        String isbne=isbn.getText();
           
           GestionArticle gest=new GestionArticle();
           
        try {
            boolean a=gest.supprimerArticle(isbne);
        } catch (SQLException ex) {
            Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
        }
        isbn.setText("");
    }//GEN-LAST:event_suppActionPerformed

    private void rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechActionPerformed
        tablemodele.setRowCount(0); // Clear the table before populating it

    String a = isbn.getText();
    isbn.setText("");
    GestionArticle gest = new GestionArticle();
    LinkedList<Article> livres = new LinkedList<>(); // Initialize livres as an empty list

    switch (combchoix.getSelectedItem().toString()) {
        case "rubrique":
            try {
                livres = gest.getArticleByRubrique(a);
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        
        case "ISBN":
            try {
                livres = gest.getArticlesByISBN(a);
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        case "titre":
            try {
                livres = gest.getArticleByTitre(a);
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        case "Editeur": 
            try {
                livres = gest.getArticleByEditeur(a);
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
         case "anneeEdition": 
             try {
                livres = gest.getArticleByAnneeEdition(Integer.parseInt(a));
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
         case "URL":
             try {
                livres = gest.getArticlesByURL(a);
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
         case "favorie": 
             try {
                livres = gest.getArticleByFavorie(Integer.parseInt(a));
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        case "recommande": 
            try {
                livres = gest.getArticlesByRecommande(Integer.parseInt(a));
            } catch (SQLException ex) {
                Logger.getLogger(Livree.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

        default:
            break;
    }

    for (Article livre : livres) {
        Object[] rowData = {
                livre.getRubrique(),
                livre.getISBN(),
                livre.getTitre(),
                livre.getEditeur(),
                livre.getAnneeEdition(),
                livre.getURL(),
                livre.getFavorie(),
                livre.getRecommande(),
                livre.getAuteur1(),
                livre.getAuteur2(),
                livre.getAuteur3(),
                livre.getAuteur4(),
                livre.getAuteur5()
        };
        tablemodele.addRow(rowData);
    }
    }//GEN-LAST:event_rechActionPerformed

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
            java.util.logging.Logger.getLogger(Articlee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articlee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articlee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articlee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articlee().setVisible(true);
            }
        });
    }DefaultTableModel tablemodele;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton Valider;
    private javax.swing.JComboBox<String> choix;
    private javax.swing.JComboBox<String> combchoix;
    private javax.swing.JLabel gestion;
    private javax.swing.JTextField isbn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labisn;
    private javax.swing.JButton rech;
    private javax.swing.JButton supp;
    private javax.swing.JTable tableLivre;
    // End of variables declaration//GEN-END:variables
}
