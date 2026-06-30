/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

    import javax.swing.table.DefaultTableModel;
    import negocio.CursoNegocio;
    import modelo.Curso;
    import excepciones.DatoInvalidoException;
    import excepciones.RegistroDuplicadoException;

public class CursoPanel extends javax.swing.JPanel {

    private CursoNegocio cursoNegocio;
    private DefaultTableModel modeloTabla;
    private int contadorId = 1;

    public CursoPanel() {
        initComponents();
        
        cursoNegocio = new CursoNegocio();
        
        modeloTabla = new DefaultTableModel(
                new Object[]{
                    "ID",
                    "Código",
                    "Nombre",
                    "Créditos",
                    "Profesor",
                    "Activo"
                
                }, 0
        );
        tblCursos.setModel(modeloTabla);
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCreditos.setText("");
        txtProfesor.setText("");
        chkActivo.setSelected(false);
        
        txtCodigo.requestFocus();
    
    }
    
    private void actualizarTabla() {

    modeloTabla.setRowCount(0);

    for (Curso curso : cursoNegocio.listarCursos()) {

        modeloTabla.addRow(new Object[]{
            curso.getId(),
            curso.getCodigo(),
            curso.getNombre(),
            curso.getCreditos(),
            curso.getProfesor(),
            curso.isActivo()
        });
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCursos = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCreditos = new javax.swing.JLabel();
        jLabelProfesor = new javax.swing.JLabel();
        jLabelActivo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        txtProfesor = new javax.swing.JTextField();
        chkActivo = new javax.swing.JCheckBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        jLabelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnOrdenarCodigo = new javax.swing.JButton();
        btnOrdenarNombre = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelCursos.setBackground(new java.awt.Color(241, 241, 241));
        jPanelCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabelCodigo.setText("Código:");

        jLabelNombre.setText("Nombre:");

        jLabelCreditos.setText("Créditos:");

        jLabelProfesor.setText("Profesor:");

        jLabelActivo.setText("Activo:");

        chkActivo.setText("Activo");

        btnNuevo.setBackground(new java.awt.Color(202, 227, 251));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(202, 227, 251));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(202, 227, 251));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(202, 227, 251));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(202, 227, 251));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(220, 215, 200)
        ));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setToolTipText("");

        tblCursos.setBackground(new java.awt.Color(255, 255, 255));
        tblCursos.setForeground(new java.awt.Color(0, 0, 0));
        tblCursos.setRowHeight(25);

        tblCursos.getTableHeader().setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12)
        );

        tblCursos.setGridColor(new java.awt.Color(0, 0, 0));
        tblCursos.getTableHeader().setBackground(new java.awt.Color(173, 216, 230));
        tblCursos.getTableHeader().setForeground(java.awt.Color.BLACK);
        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nombre", "Créditos", "Profesor", "Activo"
            }
        ));
        tblCursos.setGridColor(new java.awt.Color(153, 153, 153));
        tblCursos.setShowGrid(true);
        tblCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCursos);

        jLabelBuscar.setText("Buscar:");

        btnBuscar.setBackground(new java.awt.Color(239, 239, 213));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnOrdenarCodigo.setBackground(new java.awt.Color(239, 239, 213));
        btnOrdenarCodigo.setText("Ordenar Código");
        btnOrdenarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarCodigoActionPerformed(evt);
            }
        });

        btnOrdenarNombre.setBackground(new java.awt.Color(239, 239, 213));
        btnOrdenarNombre.setText("Ordenar Nombre");
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCursosLayout = new javax.swing.GroupLayout(jPanelCursos);
        jPanelCursos.setLayout(jPanelCursosLayout);
        jPanelCursosLayout.setHorizontalGroup(
            jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCreditos)
                            .addComponent(jLabelProfesor)
                            .addComponent(jLabelActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkActivo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(txtCreditos)
                            .addComponent(txtNombre)
                            .addComponent(txtProfesor)))
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addComponent(jLabelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnOrdenarCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenarNombre))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelCursosLayout.setVerticalGroup(
            jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCursosLayout.createSequentialGroup()
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCreditos)
                            .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCursosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCursosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelProfesor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelActivo)
                            .addComponent(chkActivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEditar))
                .addGap(34, 34, 34)
                .addGroup(jPanelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnOrdenarCodigo)
                    .addComponent(btnOrdenarNombre))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {

    Curso curso = new Curso(
            contadorId++,
            txtCodigo.getText(),
            txtNombre.getText(),
            Integer.parseInt(txtCreditos.getText()),
            txtProfesor.getText(),
            chkActivo.isSelected()
    );

    cursoNegocio.agregarCurso(curso);

    actualizarTabla();

    limpiarCampos();

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Curso registrado correctamente"
    );

} catch (NumberFormatException e) {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Los créditos deben ser numéricos"
    );

} catch (DatoInvalidoException | RegistroDuplicadoException e) {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            e.getMessage()
    );
}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        
        txtBuscar.setText("");
        
        tblCursos.clearSelection();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String texto = txtBuscar.getText().trim();
        
        Curso curso = cursoNegocio.buscarCurso(texto);
        
        if (curso == null) {
            javax.swing.JOptionPane.showMessageDialog(
                 this,
                    "Curso no encontrado"
            );
            return;
        }
        txtCodigo.setText(curso.getCodigo());
        txtNombre.setText(curso.getNombre());
        txtCreditos.setText(String.valueOf(curso.getCreditos()));
        txtProfesor.setText(curso.getProfesor());
        chkActivo.setSelected(curso.isActivo());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        
        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Desea eliminar este curso?",
                "Confirmar",
                javax.swing.JOptionPane.YES_NO_OPTION
        );
        
        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            cursoNegocio.eliminarCurso(codigo);
            
            actualizarTabla();
            
            limpiarCampos();
            
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Curso eliminado correctamente"
            );
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try {
            Curso curso = new Curso(
            0,
            txtCodigo.getText(),
            txtNombre.getText(),
            Integer.parseInt(txtCreditos.getText()),
            txtProfesor.getText(),
            chkActivo.isSelected()        
            );    
            
            cursoNegocio.editarCurso(curso);
            
            actualizarTabla();
            
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                    "Curso actualizado"
            );
        } catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Créditos inválidos"
            );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnOrdenarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarCodigoActionPerformed
        cursoNegocio.ordenarPorCodigo();
        
        actualizarTabla();
    }//GEN-LAST:event_btnOrdenarCodigoActionPerformed

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed
        cursoNegocio.ordenarPorNombre();
        
        actualizarTabla();
    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    private void tblCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursosMouseClicked
        
        int fila = tblCursos.getSelectedRow();
        
        if(fila >=0 ) {
            
            txtCodigo.setText(
                    tblCursos.getValueAt(fila, 1).toString()
            );
            
            txtNombre.setText(
                    tblCursos.getValueAt(fila, 2).toString()
            );
            
            txtCreditos.setText(
                    tblCursos.getValueAt(fila, 3).toString()
            );
            
            txtProfesor.setText(
                    tblCursos.getValueAt(fila, 4).toString()
            );
            
            chkActivo.setSelected(
                    Boolean.parseBoolean(
                            tblCursos.getValueAt(fila, 5).toString()
                    )
            );
        }
    }//GEN-LAST:event_tblCursosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnOrdenarCodigo;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JLabel jLabelActivo;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCreditos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProfesor;
    private javax.swing.JPanel jPanelCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
