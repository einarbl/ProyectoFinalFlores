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

public class ConsultaLlaves extends javax.swing.JFrame {
    
    Llave objLlave = new Llave();//Generación de objeto libro
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public ConsultaLlaves() {//Inicia Constructor
        initComponents();
        this.setLocationRelativeTo(null);//centra la ventana
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
        jTabbedPane5 = new javax.swing.JTabbedPane();
        panVer = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnVerReporte = new javax.swing.JButton();
        btnImprimirPDF = new javax.swing.JButton();
        panRegistrar = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblNumPiezas = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtNumPiezas = new javax.swing.JTextField();
        panEditar = new javax.swing.JPanel();
        btnActualizarEditar = new javax.swing.JButton();
        lblIDActualizar = new javax.swing.JLabel();
        lblCodigoActualizar = new javax.swing.JLabel();
        lblCategoriaActualizar = new javax.swing.JLabel();
        lblNumeroPiezasActualizar = new javax.swing.JLabel();
        btnBuscarLlave = new javax.swing.JButton();
        txtCodigoActualizar = new javax.swing.JTextField();
        txtCategoriaActualizar = new javax.swing.JTextField();
        txtNumeroPiezasActualizar = new javax.swing.JTextField();
        txtIDActualizar = new javax.swing.JTextField();
        panEliminar = new javax.swing.JPanel();
        lblCapturaEliminar = new javax.swing.JLabel();
        txtLlaveEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSistema.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblSistema.setText("Sistema de Control de Inventario Cerrajería González");
        jPanel1.add(lblSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTabbedPane5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N

        panVer.setBackground(new java.awt.Color(180, 95, 6));
        panVer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 95, 6)));
        panVer.setOpaque(false);

        btnActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cloud.png"))); // NOI18N
        btnActualizar.setText("Actualizar Lista Total de Llaves");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtConsulta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout panVerLayout = new javax.swing.GroupLayout(panVer);
        panVer.setLayout(panVerLayout);
        panVerLayout.setHorizontalGroup(
            panVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnVerReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimirPDF)
                .addGap(76, 76, 76))
            .addGroup(panVerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(181, 181, 181))
        );
        panVerLayout.setVerticalGroup(
            panVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerReporte)
                    .addComponent(btnImprimirPDF))
                .addGap(26, 26, 26))
        );

        jTabbedPane5.addTab("Ver Inventario", panVer);

        panRegistrar.setBackground(new java.awt.Color(180, 95, 6));
        panRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 95, 6)));
        panRegistrar.setOpaque(false);

        lblCodigo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código Llave");

        lblCategoria.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoría");

        lblNumPiezas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumPiezas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumPiezas.setText("Número de Piezas");

        btnRegistrar.setBackground(new java.awt.Color(0, 158, 15));
        btnRegistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Guardar_Icon.png"))); // NOI18N
        btnRegistrar.setText("Registrar Llave");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        txtNumPiezas.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        javax.swing.GroupLayout panRegistrarLayout = new javax.swing.GroupLayout(panRegistrar);
        panRegistrar.setLayout(panRegistrarLayout);
        panRegistrarLayout.setHorizontalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrarLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnRegistrar))
                    .addGroup(panRegistrarLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(lblNumPiezas)
                            .addComponent(lblCodigo))
                        .addGap(71, 71, 71)
                        .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panRegistrarLayout.setVerticalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPiezas))
                .addGap(46, 46, 46)
                .addComponent(btnRegistrar)
                .addGap(39, 39, 39))
        );

        jTabbedPane5.addTab("Registrar Datos Llave", panRegistrar);

        panEditar.setBackground(new java.awt.Color(180, 95, 6));
        panEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 95, 6)));
        panEditar.setOpaque(false);

        btnActualizarEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnActualizarEditar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnActualizarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cloud.png"))); // NOI18N
        btnActualizarEditar.setText("Actualizar Datos Llave");
        btnActualizarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEditarActionPerformed(evt);
            }
        });

        lblIDActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblIDActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblIDActualizar.setText("ID Llave");

        lblCodigoActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCodigoActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoActualizar.setText("Código Llave");

        lblCategoriaActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCategoriaActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoriaActualizar.setText("Categoría");

        lblNumeroPiezasActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumeroPiezasActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroPiezasActualizar.setText("Número de Piezas");

        btnBuscarLlave.setBackground(new java.awt.Color(0, 255, 255));
        btnBuscarLlave.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnBuscarLlave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Search_Icon.png"))); // NOI18N
        btnBuscarLlave.setText("Buscar Llave");
        btnBuscarLlave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLlaveActionPerformed(evt);
            }
        });

        txtCodigoActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCodigoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActualizarActionPerformed(evt);
            }
        });

        txtCategoriaActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCategoriaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActualizarActionPerformed(evt);
            }
        });

        txtNumeroPiezasActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtNumeroPiezasActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPiezasActualizarActionPerformed(evt);
            }
        });

        txtIDActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtIDActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditarLayout = new javax.swing.GroupLayout(panEditar);
        panEditar.setLayout(panEditarLayout);
        panEditarLayout.setHorizontalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoActualizar)
                    .addComponent(lblCategoriaActualizar)
                    .addComponent(lblNumeroPiezasActualizar)
                    .addComponent(lblIDActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createSequentialGroup()
                        .addComponent(txtIDActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoriaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroPiezasActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnBuscarLlave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarEditar)
                .addGap(44, 44, 44))
        );
        panEditarLayout.setVerticalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDActualizar)
                    .addComponent(txtIDActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoActualizar)
                    .addComponent(txtCodigoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriaActualizar)
                    .addComponent(txtCategoriaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroPiezasActualizar)
                    .addComponent(txtNumeroPiezasActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarEditar)
                    .addComponent(btnBuscarLlave))
                .addGap(19, 19, 19))
        );

        jTabbedPane5.addTab("Editar Datos Llave", panEditar);

        panEliminar.setBackground(new java.awt.Color(180, 95, 6));
        panEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 95, 6)));
        panEliminar.setOpaque(false);

        lblCapturaEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblCapturaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblCapturaEliminar.setText("Captura el Código de la Llave a Eliminar ");

        txtLlaveEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Trash_Icon.png"))); // NOI18N
        btnEliminar.setText("Eliminar Llave");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEliminarLayout = new javax.swing.GroupLayout(panEliminar);
        panEliminar.setLayout(panEliminarLayout);
        panEliminarLayout.setHorizontalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCapturaEliminar)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                        .addComponent(txtLlaveEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(261, 261, 261))))
        );
        panEliminarLayout.setVerticalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblCapturaEliminar)
                .addGap(56, 56, 56)
                .addComponent(txtLlaveEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(55, 55, 55))
        );

        jTabbedPane5.addTab("Eliminar Datos Llave", panEliminar);

        jPanel1.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 690, 380));

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /// Llamada al metodo conectar
        conectarBase();
        //Almacenar los valores del formulario en el objeto
        objLlave.setCodigo_llave(txtCodigo.getText());//Guarda código en el objeto
        objLlave.setCategoria(txtCategoria.getText());//Guarda categoría en el objeto
        objLlave.setNum_piezas(Integer.parseInt(txtNumPiezas.getText()));//Guarda valor de tipo entero en el objeto
        //Variable objeto para registrar un Llave
        String altaLlave = "INSERT INTO tllaves (`codigo_llave`,`categoria`,`num_piezas`) VALUES ('"+objLlave.getCodigo_llave()+"','"+objLlave.getCategoria()+"','"+objLlave.getNum_piezas()+"')";
        //Estructura de control de tratamientos de errores en ejecución
        try {
            stmt.executeUpdate(altaLlave);
            JOptionPane.showMessageDialog(null, "Se registro la Llave de forma exitosa\n\n"+objLlave.getCodigo_llave());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD al generar alta Llave\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            String llavebaja = txtLlaveEliminar.getText();
            
            confirmaBaja = stmt.executeUpdate("delete from tllaves where codigo_llave = '"+llavebaja+"'");
            
            if (confirmaBaja == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la llave de BD\n\n"+llavebaja+"\nVerifica consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe la llave de BD\n\n"+llavebaja+"\nVerifica consulta");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al procesar baja de BD"+ e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActualizarActionPerformed

    private void txtCategoriaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActualizarActionPerformed

    private void txtNumeroPiezasActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPiezasActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPiezasActualizarActionPerformed

    private void txtIDActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActualizarActionPerformed

    private void btnBuscarLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLlaveActionPerformed
        try {
            conectarBase();
            objLlave.setCodigo_llave(txtCodigoActualizar.getText());
            rs = stmt.executeQuery("select * from TLLAVES where codigo_llave = '"+objLlave.getCodigo_llave()+"'");
            
            JOptionPane.showMessageDialog(null, "Buscando llave...");
            
            if (rs.next()==true) {
                txtCategoriaActualizar.setText(rs.getString("categoria"));
                txtIDActualizar.setText(rs.getString("id_llave"));
                txtNumeroPiezasActualizar.setText(rs.getString("num_piezas"));
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe la llave con código\n\n"+ objLlave.getCodigo_llave());
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al procesar edicion de BD\n\n"+ e);
        }
    }//GEN-LAST:event_btnBuscarLlaveActionPerformed

    private void btnActualizarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEditarActionPerformed
        String actualizarLlave="";
        try {
            conectarBase();
            
            objLlave.setId_llave(Integer.parseInt(txtIDActualizar.getText()));
            objLlave.setCodigo_llave(txtCodigoActualizar.getText());
            objLlave.setCategoria(txtCategoriaActualizar.getText());
            objLlave.setNum_piezas(Integer.parseInt(txtNumeroPiezasActualizar.getText()));
            
            actualizarLlave="UPDATE tllaves SET id_llave = '"+objLlave.getId_llave()+"', codigo_llave = '"+objLlave.getCodigo_llave()+"', categoria = '"+objLlave.getCategoria()+"', num_piezas = '"+objLlave.getNum_piezas()+"' where codigo_llave = '"+objLlave.getCodigo_llave()+"'";
            stmt.executeUpdate(actualizarLlave);
            JOptionPane.showMessageDialog(null, "Datos de llave actualizado\nVerifica tu consulta");
           } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de BD Actualizar:\n"+ex);
           }

    }//GEN-LAST:event_btnActualizarEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaLlaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLlaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLlaves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarEditar;
    private javax.swing.JButton btnBuscarLlave;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimirPDF;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCapturaEliminar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoriaActualizar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoActualizar;
    private javax.swing.JLabel lblIDActualizar;
    private javax.swing.JLabel lblNumPiezas;
    private javax.swing.JLabel lblNumeroPiezasActualizar;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JPanel panEditar;
    private javax.swing.JPanel panEliminar;
    private javax.swing.JPanel panRegistrar;
    private javax.swing.JPanel panVer;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoriaActualizar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoActualizar;
    private javax.swing.JTextField txtIDActualizar;
    private javax.swing.JTextField txtLlaveEliminar;
    private javax.swing.JTextField txtNumPiezas;
    private javax.swing.JTextField txtNumeroPiezasActualizar;
    // End of variables declaration//GEN-END:variables
}
