package ayudahumanitariamejorada;
// LIBRERIAS IMPORTADAS PARA FUNCIONAR EL PROGRAMA

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//SE LLAMA AL METODO PARA LA CONEXION
public class AplicacionAyudaH extends javax.swing.JFrame {

    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();
    
    //AQUI SE BLOQUEAN TODO PARA QUE NO SE VEAN DE INICIO EN EL PROGRAMA
    public AplicacionAyudaH() {
        initComponents();
        this.setLocationRelativeTo(null);
        jToolBar1.setVisible(false);
        panelContenedor.setVisible(false);
        mostrardatos();
        datosproductos();
        datosong();
        datosza();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnONG = new javax.swing.JButton();
        btnZAActionPerformed = new javax.swing.JButton();
        panelContenedor = new javax.swing.JTabbedPane();
        panelDonantes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombre_Producto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdDonante = new javax.swing.JTextField();
        BtnGuardarProducto = new javax.swing.JButton();
        BtnModificarProducto = new javax.swing.JButton();
        BtnEliminarProducto = new javax.swing.JButton();
        comboProducto = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescripcionProductos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtNombreONG = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelONG = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtIdONG = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtONGNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCIF = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtLocalidadONG = new javax.swing.JTextField();
        BtnGuardarONG = new javax.swing.JButton();
        BtnModificarONG = new javax.swing.JButton();
        BtnEliminarONG = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelZonaAfectada = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtIdZA = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNombreZA = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtPaisZA = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCiudadZA = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtNombreONGZA = new javax.swing.JTextField();
        BtnGuardarZA = new javax.swing.JButton();
        BtnModificarZA = new javax.swing.JButton();
        BtnEliminarZA = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\Donante.png")); // NOI18N
        jButton1.setText("Donantes");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\productos.png")); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProductos);

        btnONG.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\ong.png")); // NOI18N
        btnONG.setText("ONG");
        btnONG.setFocusable(false);
        btnONG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnONG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONGActionPerformed(evt);
            }
        });
        jToolBar1.add(btnONG);

        btnZAActionPerformed.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\zonaafectada.png")); // NOI18N
        btnZAActionPerformed.setText("Zona Afectada");
        btnZAActionPerformed.setFocusable(false);
        btnZAActionPerformed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnZAActionPerformed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnZAActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZAActionPerformedActionPerformed(evt);
            }
        });
        jToolBar1.add(btnZAActionPerformed);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.CENTER);

        panelContenedor.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        panelContenedor.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DONANTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");

        txtId.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOMBRE");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRIMER APELLIDO");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SEGUNDO APELLIDO");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DNI");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOCALIDAD");

        BtnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\guardar.png")); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\modificar.png")); // NOI18N
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\eliminar.png")); // NOI18N
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimerApellido)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSegundoApellido)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDNI)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocalidad)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDonantesLayout = new javax.swing.GroupLayout(panelDonantes);
        panelDonantes.setLayout(panelDonantesLayout);
        panelDonantesLayout.setHorizontalGroup(
            panelDonantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDonantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDonantesLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDonantesLayout.setVerticalGroup(
            panelDonantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDonantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContenedor.addTab("", panelDonantes);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRODUCTOS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");

        txtIdProducto.setEnabled(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NOMBRE");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TIPO DE PRODUCTO");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DESCRIPCION");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ID DONANTE");

        BtnGuardarProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\guardar.png")); // NOI18N
        BtnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProductoActionPerformed(evt);
            }
        });

        BtnModificarProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\modificar.png")); // NOI18N
        BtnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarProductoActionPerformed(evt);
            }
        });

        BtnEliminarProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\eliminar.png")); // NOI18N
        BtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarProductoActionPerformed(evt);
            }
        });

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Alimentos", "Medicinas", "Ropa", "Otros", " " }));

        txtDescripcionProductos.setColumns(20);
        txtDescripcionProductos.setRows(5);
        jScrollPane5.setViewportView(txtDescripcionProductos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE ONG");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreONG)
                    .addComponent(txtIdProducto)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre_Producto)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdDonante)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(BtnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDonante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardarProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnModificarProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContenedor.addTab("", panelProductos);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ONG");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ID");

        txtIdONG.setEnabled(false);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("NOMBRE");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("CIF");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("LOCALIDAD");

        BtnGuardarONG.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\guardar.png")); // NOI18N
        BtnGuardarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarONGActionPerformed(evt);
            }
        });

        BtnModificarONG.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\modificar.png")); // NOI18N
        BtnModificarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarONGActionPerformed(evt);
            }
        });

        BtnEliminarONG.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\eliminar.png")); // NOI18N
        BtnEliminarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarONGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdONG)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtONGNombre)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCIF)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocalidadONG)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(BtnGuardarONG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnModificarONG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(BtnEliminarONG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtONGNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalidadONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardarONG)
                    .addComponent(BtnModificarONG)
                    .addComponent(BtnEliminarONG))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelONGLayout = new javax.swing.GroupLayout(panelONG);
        panelONG.setLayout(panelONGLayout);
        panelONGLayout.setHorizontalGroup(
            panelONGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelONGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelONGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelONGLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelONGLayout.setVerticalGroup(
            panelONGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelONGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelONGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContenedor.addTab("", panelONG);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ZONA AFECTADA");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("ID");

        txtIdZA.setEnabled(false);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("NOMBRE");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PAIS");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("CIUDAD");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("NOMBRE ONG");

        BtnGuardarZA.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\guardar.png")); // NOI18N
        BtnGuardarZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarZAActionPerformed(evt);
            }
        });

        BtnModificarZA.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\modificar.png")); // NOI18N
        BtnModificarZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarZAActionPerformed(evt);
            }
        });

        BtnEliminarZA.setIcon(new javax.swing.ImageIcon("C:\\Users\\maygr\\Desktop\\iconos2\\eliminar.png")); // NOI18N
        BtnEliminarZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarZAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdZA)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreZA)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPaisZA)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCiudadZA)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreONGZA)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(BtnGuardarZA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnModificarZA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(BtnEliminarZA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaisZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCiudadZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreONGZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardarZA)
                    .addComponent(BtnModificarZA)
                    .addComponent(BtnEliminarZA))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelZonaAfectadaLayout = new javax.swing.GroupLayout(panelZonaAfectada);
        panelZonaAfectada.setLayout(panelZonaAfectadaLayout);
        panelZonaAfectadaLayout.setHorizontalGroup(
            panelZonaAfectadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZonaAfectadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelZonaAfectadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelZonaAfectadaLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelZonaAfectadaLayout.setVerticalGroup(
            panelZonaAfectadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZonaAfectadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelZonaAfectadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContenedor.addTab("", panelZonaAfectada);

        jMenu1.setText("Iniciar");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // BOTON DE ZONA AFECTADA
    private void btnZAActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZAActionPerformedActionPerformed
        
        panelContenedor.setSelectedComponent(panelZonaAfectada);
    }//GEN-LAST:event_btnZAActionPerformedActionPerformed

    //BOTON DE DONANTES
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        panelContenedor.setSelectedComponent(panelDonantes);
    }//GEN-LAST:event_jButton1ActionPerformed

    //BOTON DE PRODUCTOS
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        
        panelContenedor.setSelectedComponent(panelProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    //BOTON ONG
    private void btnONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONGActionPerformed
        
        panelContenedor.setSelectedComponent(panelONG);
    }//GEN-LAST:event_btnONGActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        jToolBar1.setVisible(true);
        panelContenedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //METODO PARA EL BOTON DE GUARDAR DONANTES
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO donantes (Nombre,Primer_Apellido,Segundo_Apellido,DNI,Localidad) VALUES (?,?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtPrimerApellido.getText());
            ps.setString(3, txtSegundoApellido.getText());
            ps.setString(4, txtDNI.getText());
            ps.setString(5, txtLocalidad.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            mostrardatos();
            limpiarentradas();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR AL DONANTE" + e);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    //METODO PARA EL BOTON DE MODIFICAR DONANTES
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE donantes SET Nombre='" + txtNombre.getText() + "',Primer_Apellido='" + txtPrimerApellido.getText() + "',Segundo_Apellido='" + txtSegundoApellido.getText() + "',DNI='" + txtDNI.getText() + "',Localidad='" + txtLocalidad.getText() + "' WHERE Id='" + txtId.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrardatos();
                limpiarentradas();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    // METODO PARA EL BOTON DE ELIMINAR DONANTES
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
         Object[] options = {"Si", "No", "Cancelar"};
        if (JOptionPane.showConfirmDialog(null, "QUIERE ELIMINAR DONANTE", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM Donantes WHERE Id='" + txtId.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    mostrardatos();
                } else {
                    System.out.println("FILA NO SELECCIONADA");
                }
                limpiarentradas();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR DATOS" + e);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    //METODO PARA SELECCIONAR UNA FILA DE LOS DONANTES Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        BtnGuardar.setEnabled(false);
        BtnModificar.setEnabled(true);
        int fila;
        fila = this.jTable1.getSelectedRow();
        this.txtId.setText(this.jTable1.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.jTable1.getValueAt(fila, 1).toString());
        this.txtPrimerApellido.setText(this.jTable1.getValueAt(fila, 2).toString());
        this.txtSegundoApellido.setText(this.jTable1.getValueAt(fila, 3).toString());
        this.txtDNI.setText(this.jTable1.getValueAt(fila, 4).toString());
        this.txtLocalidad.setText(this.jTable1.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //METODO PARA EL BOTON DE GUARDAR PRODUCTOS
    private void BtnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProductoActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO productos (Nombre_Producto,TipodeProducto,Descripcion_Producto,Iddonante,NombreONG) VALUES (?,?,?,?,?)");
            ps.setString(1, txtNombre_Producto.getText());
            ps.setString(2, comboProducto.getSelectedItem().toString());
            ps.setString(3, txtDescripcionProductos.getText());
            ps.setString(4, txtIdDonante.getText());
            ps.setString(5, txtNombreONG.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            datosproductos();
            limpiarentradas2();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR EL PRODUCTO" + e);
        }
    }//GEN-LAST:event_BtnGuardarProductoActionPerformed

    //METODO PARA EL BOTON MODIFICAR DE PRODUCTOS
    private void BtnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarProductoActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE productos SET Nombre_Producto='" + txtNombre_Producto.getText() + "',TipodeProducto='" + comboProducto.getSelectedItem() + "',Descripcion_Producto='" + txtDescripcionProductos.getText() + "',Iddonante='" + txtIdDonante.getText() + "',NombreONG='" + txtNombreONG.getText() + "' WHERE IdProducto='" + txtIdProducto.getText() + "'");
            int indice2 = ps.executeUpdate();

            if (indice2 > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                datosproductos();
                limpiarentradas2();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarProductoActionPerformed

    //METODO PARA SELECCIONAR UNA FILA DE LOS PRODUCTOS Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        BtnGuardarProducto.setEnabled(false);
        BtnModificarProducto.setEnabled(true);
        int fila2;
        fila2 = this.jTable2.getSelectedRow();
        this.txtIdProducto.setText(this.jTable2.getValueAt(fila2, 0).toString());
        this.txtNombre_Producto.setText(this.jTable2.getValueAt(fila2, 1).toString());
        this.comboProducto.setSelectedItem(this.jTable2.getValueAt(fila2, 2).toString());
        this.txtDescripcionProductos.setText(this.jTable2.getValueAt(fila2, 3).toString());
        this.txtIdDonante.setText(this.jTable2.getValueAt(fila2, 4).toString());
        this.txtNombreONG.setText(this.jTable2.getValueAt(fila2, 5).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    //BOTON ELIMINAR PRODUCTOS
    private void BtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarProductoActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ESTE PRODUCTO", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
        try {
            PreparedStatement ps = cn.prepareStatement("DELETE FROM productos WHERE IdProducto='" + txtIdProducto.getText() + "'");
            int indice = ps.executeUpdate();
            if (indice > 0) {
                datosproductos();
            } else {
                System.out.println("FILA NO SELECCIONADA");
            }
            limpiarentradas2();
        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR DATOS" + e);
        }
       }
    }//GEN-LAST:event_BtnEliminarProductoActionPerformed

    //BOTON GUARDAR ONG
    private void BtnGuardarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarONGActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO ong (NombreONG,CIF,Localidad) VALUES (?,?,?)");
            ps.setString(1, txtONGNombre.getText());
            ps.setString(2, txtCIF.getText());
            ps.setString(3, txtLocalidadONG.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            datosong();
            limpiarentradas3();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR AL DONANTE" + e);
        }
    }//GEN-LAST:event_BtnGuardarONGActionPerformed

    // BOTON DE MODIFICAR DATOS ONG
    private void BtnModificarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarONGActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE ong SET NombreONG='" + txtONGNombre.getText() + "',CIF='" + txtCIF.getText() + "',Localidad='" + txtLocalidadONG.getText() + "' WHERE IdONG='" + txtIdONG.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                datosong();
                limpiarentradas3();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarONGActionPerformed

    // METODO PARA SELECCIONAR UNA FILA DE LAS ONG Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        BtnGuardarONG.setEnabled(false);
        BtnModificarONG.setEnabled(true);
        int fila;
        fila = this.jTable3.getSelectedRow();
        this.txtIdONG.setText(this.jTable3.getValueAt(fila, 0).toString());
        this.txtONGNombre.setText(this.jTable3.getValueAt(fila, 1).toString());
        this.txtCIF.setText(this.jTable3.getValueAt(fila, 2).toString());
        this.txtLocalidadONG.setText(this.jTable3.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    ////BOTON ELIMINAR ONG
    private void BtnEliminarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarONGActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "ELIMINAR ONG", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM ong WHERE IdONG='" + txtIdONG.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    datosong();
                } else {
                    System.out.println("FILA NO SELECCIONADA");
                }
                limpiarentradas3();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR DATOS" + e);
            }
        }
    }//GEN-LAST:event_BtnEliminarONGActionPerformed

    //BOTON GUARDAR ZONA AFECTADA
    private void BtnGuardarZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarZAActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO zonaafectada (NombreZA,PaisZA,CiudadZA,NombreONG) VALUES (?,?,?,?)");
            ps.setString(1, txtNombreZA.getText());
            ps.setString(2, txtPaisZA.getText());
            ps.setString(3, txtCiudadZA.getText());
            ps.setString(4, txtNombreONGZA.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            
            limpiarentradas4();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR LA ZONA AFECTADA" + e);
        }
    }//GEN-LAST:event_BtnGuardarZAActionPerformed

    // BOTON DE MODIFICAR DATOS ZONA AFECTADA
    private void BtnModificarZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarZAActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE zonaafectada SET NombreZA='" + txtNombreZA.getText() + "',PaisZA='" + txtPaisZA.getText() + "',CiudadZA='" + txtCiudadZA.getText() + "',NombreONG='" + txtNombreONGZA.getText() + "' WHERE IdZA='" + txtIdZA.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                
                limpiarentradas4();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarZAActionPerformed

    // METODO PARA SELECCIONAR UNA FILA DE LAS ZONAS AFECTADAS Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        
        BtnGuardarZA.setEnabled(false);
        BtnModificarZA.setEnabled(true);
        int fila;
        fila = this.jTable4.getSelectedRow();
        this.txtIdZA.setText(this.jTable4.getValueAt(fila, 0).toString());
        this.txtNombreZA.setText(this.jTable4.getValueAt(fila, 1).toString());
        this.txtPaisZA.setText(this.jTable4.getValueAt(fila, 2).toString());
        this.txtCiudadZA.setText(this.jTable4.getValueAt(fila, 3).toString());
        this.txtNombreONGZA.setText(this.jTable4.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_jTable4MouseClicked

    // BOTON ELIMINAR ZONA AFECTADA
    private void BtnEliminarZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarZAActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "QUIERE ELIMINAR LA ZONA AFECTADA", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM zonaafectada WHERE IdZA='" + txtIdZA.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    
                } else {
                    System.out.println("FILA NO SELECCIONADA");
                }
                limpiarentradas4();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR DATOS" + e);
            }
        }
    }//GEN-LAST:event_BtnEliminarZAActionPerformed

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
            java.util.logging.Logger.getLogger(AplicacionAyudaH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionAyudaH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionAyudaH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionAyudaH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionAyudaH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminarONG;
    private javax.swing.JButton BtnEliminarProducto;
    private javax.swing.JButton BtnEliminarZA;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarONG;
    private javax.swing.JButton BtnGuardarProducto;
    private javax.swing.JButton BtnGuardarZA;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificarONG;
    private javax.swing.JButton BtnModificarProducto;
    private javax.swing.JButton BtnModificarZA;
    private javax.swing.JButton btnONG;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnZAActionPerformed;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane panelContenedor;
    private javax.swing.JPanel panelDonantes;
    private javax.swing.JPanel panelONG;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelZonaAfectada;
    private javax.swing.JTextField txtCIF;
    private javax.swing.JTextField txtCiudadZA;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextArea txtDescripcionProductos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDonante;
    private javax.swing.JTextField txtIdONG;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdZA;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtLocalidadONG;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreONG;
    private javax.swing.JTextField txtNombreONGZA;
    private javax.swing.JTextField txtNombreZA;
    private javax.swing.JTextField txtNombre_Producto;
    private javax.swing.JTextField txtONGNombre;
    private javax.swing.JTextField txtPaisZA;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables

    // METODO PARA MOSTRAR LOS DATOS EN LA TABLA DONANTES
    private void mostrardatos() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Localidad");
        jTable1.setModel(modelo);
        String consultasql = "select*from donantes";
        String data[] = new String[6];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }
    

    // METODO PARA LIMPIAR LOS DATOS DE DONANTES
    private void limpiarentradas() {
        
        txtId.setText("");
        txtNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtDNI.setText("");
        txtLocalidad.setText("");
    }

    // METODO PARA MOSTRAR DATOS EN LA TABLA PRODUCTOS
    private void datosproductos() {
       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Producto");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Tipo de Producto");
        modelo.addColumn("Descripcion del Producto");
        modelo.addColumn("Id Donante");
        modelo.addColumn("Id ONG");
        jTable2.setModel(modelo);
        String consultasql = "select*from productos";
        String data2[] = new String[6];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data2[0] = rs.getString(1);
                data2[1] = rs.getString(2);
                data2[2] = rs.getString(3);
                data2[3] = rs.getString(4);
                data2[4] = rs.getString(5);
                data2[5] = rs.getString(6);
                modelo.addRow(data2);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }
    
    // METODO PARA LIMPIAR PRODUCTOS
    private void limpiarentradas2() {
       
        txtIdProducto.setText("");
        txtNombre_Producto.setText("");
        comboProducto.setSelectedIndex(0);
        txtDescripcionProductos.setText("");
        txtIdDonante.setText("");
        txtNombreONG.setText("");
    }

    //MOSTRAR DATOS DE ONG
    private void datosong() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id ONG");
        modelo.addColumn("Nombre ONG");
        modelo.addColumn("CIF ONG");
        modelo.addColumn("Localidad");
        jTable3.setModel(modelo);
        String consultasql = "select*from ong";
        String data3[] = new String[4];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data3[0] = rs.getString(1);
                data3[1] = rs.getString(2);
                data3[2] = rs.getString(3);
                data3[3] = rs.getString(4);
                modelo.addRow(data3);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }

    // METODO PARA LIMPIAR ONG
    private void limpiarentradas3() {
        
        txtIdONG.setText("");
        txtONGNombre.setText("");
        txtCIF.setText("");
        txtLocalidadONG.setText("");
    }

    
    //MOSTRAR DATOS DE ZONA AFECTADA
    private void datosza() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Pais");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Nombre ONG");
        jTable4.setModel(modelo);
        String consultasql = "select*from zonaafectada";
        String data4[] = new String[5];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data4[0] = rs.getString(1);
                data4[1] = rs.getString(2);
                data4[2] = rs.getString(3);
                data4[3] = rs.getString(4);
                data4[4] = rs.getString(5);
                modelo.addRow(data4);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }

    // METODO PARA LIMPIAR ONG
    private void limpiarentradas4() {
        
        txtIdZA.setText("");
        txtNombreZA.setText("");
        txtPaisZA.setText("");
        txtCiudadZA.setText("");
        txtNombreONGZA.setText("");
    }

    
}
