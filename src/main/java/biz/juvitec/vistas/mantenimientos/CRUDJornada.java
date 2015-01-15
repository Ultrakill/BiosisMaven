/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas.mantenimientos;

import biz.juvitec.controladores.Controlador;
import biz.juvitec.controladores.JornadaControlador;
import biz.juvitec.entidades.Jornada;
import biz.juvitec.vistas.modelos.MTJornada;
import com.personal.utiles.FormularioUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.text.DateFormatter;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author fesquivelc
 */
public class CRUDJornada extends javax.swing.JInternalFrame {

    /**
     * Creates new form CRUDJornada
     */
    private int accion;
    private final JornadaControlador jornadaControlador;
    private List<Jornada> jornadaList;

    public CRUDJornada() {
        initComponents();
        modeloHoraSpinner(spTurnoHE);
        modeloHoraSpinner(spDesdeHE);
        modeloHoraSpinner(spToleranciaHE);
        modeloHoraSpinner(spRefrigerioHS);
        modeloHoraSpinner(spRefrigerioHE);
        modeloHoraSpinner(spTardanzaHE);
        modeloHoraSpinner(spTurnoHS);
        modeloHoraSpinner(spToleranciaRefrigerioHE);
        jornadaControlador = new JornadaControlador();
        bindeoSalvaje();
        accion = 0;
        this.controles(accion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlDatosJornada = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spTurnoHE = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spToleranciaRefrigerioHE = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spDesdeHE = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spToleranciaHE = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spTardanzaHE = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spTurnoHS = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spRefrigerioHS = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        spRefrigerioHE = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chkRefrigerioEspecial = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        spMinutosRefrigerio = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlListado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJornadas = new org.jdesktop.swingx.JXTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Mantenimiento jornadas");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlDatosJornada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de jornada"));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setText("Hora de entrada (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel1, gridBagConstraints);

        spTurnoHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spTurnoHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTurnoHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spTurnoHE, gridBagConstraints);

        jLabel2.setText("Tolerancia de entrada de refrigerio (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel2, gridBagConstraints);

        spToleranciaRefrigerioHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spToleranciaRefrigerioHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spToleranciaRefrigerioHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spToleranciaRefrigerioHE, gridBagConstraints);

        jLabel3.setText("Marcar desde (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel3, gridBagConstraints);

        spDesdeHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spDesdeHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spDesdeHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spDesdeHE, gridBagConstraints);

        jLabel4.setText("Tolerancia de entrada (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel4, gridBagConstraints);

        spToleranciaHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spToleranciaHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spToleranciaHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spToleranciaHE, gridBagConstraints);

        jLabel5.setText("Tolerancia de tardanza (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel5, gridBagConstraints);

        spTardanzaHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spTardanzaHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTardanzaHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spTardanzaHE, gridBagConstraints);

        jLabel6.setText("Hora de salida (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel6, gridBagConstraints);

        spTurnoHS.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spTurnoHS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTurnoHSStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spTurnoHS, gridBagConstraints);

        jLabel7.setText("Hora de salida a refrigerio (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel7, gridBagConstraints);

        spRefrigerioHS.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spRefrigerioHS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spRefrigerioHSStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spRefrigerioHS, gridBagConstraints);

        jLabel8.setText("Hora de entrada de refrigerio (HH:mm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel8, gridBagConstraints);

        spRefrigerioHE.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        spRefrigerioHE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spRefrigerioHEStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spRefrigerioHE, gridBagConstraints);

        jLabel9.setText("Código:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtCodigo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtNombre, gridBagConstraints);

        jLabel11.setText("¿Refrigerio en intervalo?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel11, gridBagConstraints);

        chkRefrigerioEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRefrigerioEspecialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(chkRefrigerioEspecial, gridBagConstraints);

        jLabel12.setText("Minutos de refrigerio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel12, gridBagConstraints);

        spMinutosRefrigerio.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(15), Integer.valueOf(15), null, Integer.valueOf(1)));
        spMinutosRefrigerio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spMinutosRefrigerioStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(spMinutosRefrigerio, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        javax.swing.GroupLayout pnlDatosJornadaLayout = new javax.swing.GroupLayout(pnlDatosJornada);
        pnlDatosJornada.setLayout(pnlDatosJornadaLayout);
        pnlDatosJornadaLayout.setHorizontalGroup(
            pnlDatosJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosJornadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        pnlDatosJornadaLayout.setVerticalGroup(
            pnlDatosJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosJornadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.ipady = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 12, 12);
        getContentPane().add(pnlDatosJornada, gridBagConstraints);

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Jornadas"));
        java.awt.GridBagLayout pnlListadoLayout = new java.awt.GridBagLayout();
        pnlListadoLayout.columnWidths = new int[] {0};
        pnlListadoLayout.rowHeights = new int[] {0, 5, 0};
        pnlListado.setLayout(pnlListadoLayout);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlListado.add(jPanel4, gridBagConstraints);

        tblJornadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblJornadasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblJornadas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlListado.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 310;
        gridBagConstraints.ipady = 395;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 0);
        getContentPane().add(pnlListado, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.accion = Controlador.NUEVO;
        jornadaControlador.prepararCrear();
        this.controles(accion);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = this.tblJornadas.getSelectedRow();
        if (fila != -1) {
            this.accion = Controlador.MODIFICAR;
            this.jornadaControlador.setSeleccionado(this.jornadaList.get(fila));
            this.mostrar(jornadaControlador.getSeleccionado());
            this.controles(accion);
            FormularioUtil.activarComponente(txtCodigo, false);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.accion = Controlador.ELIMINAR;
        int fila = tblJornadas.getSelectedRow();
        if (fila != -1 && FormularioUtil.dialogoConfirmar(this, accion)) {
            if (jornadaControlador.accion(accion)) {
                FormularioUtil.mensajeExito(this, accion);
                this.accion = 0;
                this.actualizarTabla();
            } else {
                FormularioUtil.mensajeError(this, accion);
            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblJornadasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJornadasMouseReleased
        // TODO add your handling code here:
        int fila = tblJornadas.getSelectedRow();
        if (fila != -1) {
            mostrar(jornadaList.get(fila));
        }

    }//GEN-LAST:event_tblJornadasMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.accion = 0;
        this.controles(accion);
        FormularioUtil.limpiarComponente(this.pnlDatosJornada);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (FormularioUtil.dialogoConfirmar(this, accion)) {
            Jornada seleccionada = jornadaControlador.getSeleccionado();

            FormularioUtil.convertirMayusculas(this.pnlDatosJornada);

            if (accion == Controlador.NUEVO) {
                seleccionada.setCodigo(txtCodigo.getText());
            }
            seleccionada.setNombre(txtNombre.getText());
            seleccionada.setDesdeHE((Date) spDesdeHE.getValue());
            seleccionada.setRefrigerioHS((Date) spRefrigerioHS.getValue());
            seleccionada.setRefrigerioHE((Date) spRefrigerioHE.getValue());
            seleccionada.setTardanzaHE((Date) spTardanzaHE.getValue());
//            seleccionada.setToleranciaRefrigerioHE((Date) spToleranciaRefrigerioHE.getValue());
            seleccionada.setToleranciaHE((Date) spToleranciaHE.getValue());
            seleccionada.setTurnoHE((Date) spTurnoHE.getValue());
            seleccionada.setTurnoHS((Date) spTurnoHS.getValue());
            seleccionada.setRefrigerioEspecial(chkRefrigerioEspecial.isSelected());

            if (chkRefrigerioEspecial.isSelected()) {
                seleccionada.setMinRefrigerio(Integer.parseInt(spMinutosRefrigerio.getValue().toString()));
            } else {
                seleccionada.setToleranciaRefrigerioHE((Date) spToleranciaRefrigerioHE.getValue());
            }

            if (jornadaControlador.accion(accion)) {
                FormularioUtil.mensajeExito(this, accion);
                this.accion = 0;
                this.controles(accion);
                this.actualizarTabla();
            } else {
                FormularioUtil.mensajeError(this, accion);
            }

        } else {
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chkRefrigerioEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRefrigerioEspecialActionPerformed
        // TODO add your handling code here:
        checkbox();
    }//GEN-LAST:event_chkRefrigerioEspecialActionPerformed

    private void spRefrigerioHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spRefrigerioHEStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spRefrigerioHEStateChanged

    private void spRefrigerioHSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spRefrigerioHSStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spRefrigerioHSStateChanged

    private void spTurnoHSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTurnoHSStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spTurnoHSStateChanged

    private void spTardanzaHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTardanzaHEStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spTardanzaHEStateChanged

    private void spToleranciaHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spToleranciaHEStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spToleranciaHEStateChanged

    private void spDesdeHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spDesdeHEStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spDesdeHEStateChanged

    private void spToleranciaRefrigerioHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spToleranciaRefrigerioHEStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spToleranciaRefrigerioHEStateChanged

    private void spTurnoHEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTurnoHEStateChanged
        // TODO add your handling code here:
        Date hora = (Date) spTurnoHE.getValue();

        System.out.println("HORA: " + hora.toString());
    }//GEN-LAST:event_spTurnoHEStateChanged

    private void spMinutosRefrigerioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spMinutosRefrigerioStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spMinutosRefrigerioStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkRefrigerioEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatosJornada;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JSpinner spDesdeHE;
    private javax.swing.JSpinner spMinutosRefrigerio;
    private javax.swing.JSpinner spRefrigerioHE;
    private javax.swing.JSpinner spRefrigerioHS;
    private javax.swing.JSpinner spTardanzaHE;
    private javax.swing.JSpinner spToleranciaHE;
    private javax.swing.JSpinner spToleranciaRefrigerioHE;
    private javax.swing.JSpinner spTurnoHE;
    private javax.swing.JSpinner spTurnoHS;
    private org.jdesktop.swingx.JXTable tblJornadas;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void modeloHoraSpinner(JSpinner spinner) {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "HH:mm");
        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false); // this makes what you want
        formatter.setOverwriteMode(true);
        spinner.setEditor(editor);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.AM_PM, Calendar.AM);
        spinner.setValue(cal.getTime());
    }

    private void modeloFechaSpinner(JSpinner spinner) {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false); // this makes what you want
        formatter.setOverwriteMode(true);
        spinner.setEditor(editor);
    }

    private void controles(int accion) {
        boolean bandera = accion == Controlador.NUEVO || accion == Controlador.MODIFICAR;

        FormularioUtil.activarComponente(this.pnlListado, !bandera);
        FormularioUtil.activarComponente(this.pnlDatosJornada, bandera);
        
        checkbox();

        if (accion != Controlador.MODIFICAR) {
            FormularioUtil.limpiarComponente(this.pnlDatosJornada);
        }

    }

    private void bindeoSalvaje() {
        jornadaList = new ArrayList<>();
        jornadaList = ObservableCollections.observableList(jornadaList);

        String[] columnas = {"Nombre", "HE", "HSR", "HER", "HS"};

        MTJornada mt = new MTJornada(jornadaList, columnas);
        tblJornadas.setModel(mt);
        actualizarTabla();
    }

    private void mostrar(Jornada seleccionado) {
        txtCodigo.setText(seleccionado.getCodigo());
        txtNombre.setText(seleccionado.getNombre());
        spDesdeHE.setValue(seleccionado.getDesdeHE());
        spRefrigerioHS.setValue(seleccionado.getRefrigerioHS());
        spRefrigerioHE.setValue(seleccionado.getRefrigerioHE());
        spTardanzaHE.setValue(seleccionado.getTardanzaHE());        
        spToleranciaHE.setValue(seleccionado.getToleranciaHE());
        spTurnoHE.setValue(seleccionado.getTurnoHE());
        spTurnoHS.setValue(seleccionado.getTurnoHS());
        chkRefrigerioEspecial.setSelected(seleccionado.isRefrigerioEspecial());
        if(seleccionado.isRefrigerioEspecial()){
            spMinutosRefrigerio.setValue(seleccionado.getMinRefrigerio());
        }else{
            spToleranciaRefrigerioHE.setValue(seleccionado.getToleranciaRefrigerioHE());
        }
    }

    private void actualizarTabla() {
        jornadaList.clear();
        jornadaList.addAll(jornadaControlador.buscarTodos());
        tblJornadas.packAll();
    }

    private void checkbox() {
        if (accion != 0) {
            FormularioUtil.activarComponente(spToleranciaRefrigerioHE, !chkRefrigerioEspecial.isSelected());
            FormularioUtil.activarComponente(spMinutosRefrigerio, chkRefrigerioEspecial.isSelected());
        }

    }
}
