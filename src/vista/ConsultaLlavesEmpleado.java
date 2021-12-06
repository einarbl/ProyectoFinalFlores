package vista;

/**Librerias de Conexión*/
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.Llave;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
public class ConsultaLlavesEmpleado extends javax.swing.JFrame {

    Llave objLlave = new Llave();//Generación de objeto libro
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public ConsultaLlavesEmpleado() {//Inicia Constructor
        initComponents();
    }//Finaliza Constructor

    //Metodo para conectar a base de datos
    public void conectarBase(){
        try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdfloresproyectofinalis","root","");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nFLORES");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
    }
}//termina metodo conectar
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnVerReporte = new javax.swing.JButton();
        btnImprimirPDF = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSistema.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblSistema.setText("Sistema de Control de Inventario Cerrajería González");
        jPanel1.add(lblSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(180, 95, 6));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cloud.png"))); // NOI18N
        btnActualizar.setText("Actualizar Lista Total de Llaves");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Llave", "Codigo_Llave", "Categoria", "Num_piezas"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnVerReporte.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnVerReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Eye_Icon.png"))); // NOI18N
        btnVerReporte.setText("Ver Reporte PDF");
        btnVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReporteActionPerformed(evt);
            }
        });

        btnImprimirPDF.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnImprimirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Print_Icon.png"))); // NOI18N
        btnImprimirPDF.setText("Imprimir PDF");
        btnImprimirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnVerReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimirPDF)
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerReporte)
                    .addComponent(btnImprimirPDF))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Inventario", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 690, 390));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background1.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conectarBase();//llamada a la conexión
            //Declaracion de un Objeto de almacenamiento logico de datos "Modelo de datos"
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);
            rs = stmt.executeQuery("select * from TLLAVES");
            //Imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("ID_Llave");
            modeloDatos.addColumn("Codigo_Llave");
            modeloDatos.addColumn("Categoria");
            modeloDatos.addColumn("Num_piezas");
            //Imprimir filas o registros
            while(rs.next()){
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            }//Termina While
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error de BD Consulta"+ e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReporteActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptLlave.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de Llaves Sistema Flores");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnVerReporteActionPerformed

    private void btnImprimirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPDFActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptLlave.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de Llaves Sistema Flores");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnImprimirPDFActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaLlavesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlavesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlavesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlavesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLlavesEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnImprimirPDF;
    private javax.swing.JButton btnVerReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblSistema;
    // End of variables declaration//GEN-END:variables
}
