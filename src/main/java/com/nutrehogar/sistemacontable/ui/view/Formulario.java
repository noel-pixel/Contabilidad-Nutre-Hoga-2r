/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nutrehogar.sistemacontable.ui.view;

import com.nutrehogar.sistemacontable.domain.model.Asiento;
import com.nutrehogar.sistemacontable.domain.model.Registro;
import com.nutrehogar.sistemacontable.domain.repository.AsientoRepo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author charl
 */
public class Formulario extends javax.swing.JPanel {

     private final List<Registro> listaRegistro = new ArrayList<>();
    private final DefaultTableModel tabRegistrosModelo;
    private final ListSelectionModel listaSeleccionModelo;
    private final CustomListSelectionListener listaSeleccionEscucha;
    private final CustomTableModelListener tablaModeloEscucha;
    public Formulario() {
        initComponents();
        customizeTable();   
        this.tabRegistrosModelo = (DefaultTableModel) tabRegistros.getModel();
        this.listaSeleccionModelo = tabRegistros.getSelectionModel();
        
        this.listaSeleccionEscucha = new CustomListSelectionListener(butEditarRegistro, butEliminarRegistro);
        this.tablaModeloEscucha = new CustomTableModelListener(texfieDebeTotal, texfieHaberTotal, texfieMonto);
        
        this.listaSeleccionModelo.addListSelectionListener(this.listaSeleccionEscucha);
        this.tabRegistrosModelo.addTableModelListener(this.tablaModeloEscucha);
        
        this.tabRegistros.setSelectionModel(this.listaSeleccionModelo);
        
        
        butEditarRegistro.setEnabled(false);
        butEliminarRegistro.setEnabled(false);
         estilizarBoton(butAnadirRegistro, 120, 50);     
estilizarBoton(butEditarRegistro, 120, 50); 
estilizarBoton(butEliminarRegistro, 120, 50);  
estilizarBoton(butGuardarAsiento, 120, 50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texfieNombre = new javax.swing.JTextField();
        texfieHaberTotal = new javax.swing.JTextField();
        texfieMonto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabRegistros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spiFecha = new com.nutrehogar.sistemacontable.ui.view.components.LocalDateSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        texareConcepto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        texfieDebeTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        butAnadirRegistro = new javax.swing.JButton();
        butEditarRegistro = new javax.swing.JButton();
        butGuardarAsiento = new javax.swing.JButton();
        butEliminarRegistro = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 248, 255));

        texfieNombre.setName("nombreField"); // NOI18N

        texfieHaberTotal.setEditable(false);
        texfieHaberTotal.setBackground(new java.awt.Color(255, 255, 255));

        texfieMonto.setEditable(false);
        texfieMonto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Total:");

        tabRegistros.setAutoCreateRowSorter(true);
        tabRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Doc.", "No. Cheque o Comp.", "Referencia", "Código", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabRegistros.setAutoscrolls(false);
        jScrollPane3.setViewportView(tabRegistros);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jLabel5.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha:");

        spiFecha.setModel(new com.nutrehogar.sistemacontable.ui.view.components.LocalDateSpinnerModel());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 100));

        texareConcepto.setColumns(20);
        texareConcepto.setRows(5);
        texareConcepto.setMinimumSize(new java.awt.Dimension(400, 100));
        jScrollPane1.setViewportView(texareConcepto);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NUEVO ASIENTO");
        jLabel1.setName(" tituloFormulario"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Monto:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Concepto:");

        texfieDebeTotal.setEditable(false);
        texfieDebeTotal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(241, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        butAnadirRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butAnadirRegistro.setForeground(new java.awt.Color(255, 255, 255));
        butAnadirRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anadir.png"))); // NOI18N
        butAnadirRegistro.setText("Añadir Registro");
        butAnadirRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAnadirRegistroMouseClicked(evt);
            }
        });
        butAnadirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAnadirRegistroActionPerformed(evt);
            }
        });

        butEditarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butEditarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        butEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar1.png"))); // NOI18N
        butEditarRegistro.setLabel("Editar Registro");
        butEditarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEditarRegistroMouseClicked(evt);
            }
        });

        butGuardarAsiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butGuardarAsiento.setForeground(new java.awt.Color(255, 255, 255));
        butGuardarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/guardar.png"))); // NOI18N
        butGuardarAsiento.setText("Guardar Asiento");
        butGuardarAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butGuardarAsientoMouseClicked(evt);
            }
        });

        butEliminarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butEliminarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        butEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png"))); // NOI18N
        butEliminarRegistro.setLabel("Eliminar Registro");
        butEliminarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEliminarRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butAnadirRegistro)
                    .addComponent(butEliminarRegistro)
                    .addComponent(butGuardarAsiento)
                    .addComponent(butEditarRegistro))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(butAnadirRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butEditarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butGuardarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texfieMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texfieDebeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(texfieHaberTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addComponent(texfieNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texfieNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(spiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(texfieMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfieDebeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texfieHaberTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
private void estilizarBoton(JButton boton, int ancho, int alto) {
    
    boton.setPreferredSize(new Dimension(ancho, alto));

   
    boton.setContentAreaFilled(false); 
    boton.setFocusPainted(false);      
    boton.setBorderPainted(false);    

    
    boton.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
        @Override
        public void paint(Graphics g, JComponent c) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            
        g2d.setColor(Color.decode("#1E88E5")); 

            g2d.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 25, 25); 

           
            g2d.setColor(new Color(30, 144, 255)); 
            g2d.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 25, 25);

            g2d.dispose();

         
            super.paint(g, c);
        }
    });
}
private void customizeTable() {
   
    JTableHeader header = tabRegistros.getTableHeader();
    header.setFont(new Font("Arial", Font.BOLD, 16));
    header.setBackground(Color.decode("#1E88E5"));
    header.setForeground(Color.WHITE);

  
    DefaultTableCellRenderer rowRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

           
           
            return cell;
        }
    };


    for (int i = 0; i < tabRegistros.getColumnCount(); i++) {
        tabRegistros.getColumnModel().getColumn(i).setCellRenderer(rowRenderer);
    }

    // Ajustar tamaño de texto y altura de las filas
    tabRegistros.setFont(new Font("Arial", Font.PLAIN, 14));
    tabRegistros.setRowHeight(25);

   
 
}
    private void butGuardarAsientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butGuardarAsientoMouseClicked
        try {
            // Generación de excepciones
            texfieNombre.getText().charAt(1);
            texareConcepto.getText().charAt(1);
            
            // Guardado
            Asiento asiento = Asiento.builder()
                    .fecha(LocalDate.parse(spiFecha.getValue().toString()))
                    .nombre(texfieNombre.getText())
                    .concepto(texareConcepto.getText())
                    .build();
            
            listaRegistro.forEach((registro) -> {
                registro.setAsiento(asiento);
            });
            asiento.setRegistros(listaRegistro);
            
            if (!asiento.getRegistros().isEmpty()) {
                AsientoRepo.save(asiento);
                
               
            } else {
                mostrarError("Sin Registros", "Este asiento no tiene registros");
            }
        } catch (IndexOutOfBoundsException e) {
            mostrarError("Campos Vacíos", "Uno o varios campos estan vacíos");
        }
    }//GEN-LAST:event_butGuardarAsientoMouseClicked

    private void butEditarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEditarRegistroMouseClicked
        if (!listaSeleccionModelo.isSelectionEmpty()) {
            Integer filaRegistro = listaSeleccionEscucha.fila;

            Registro registroSeleccionado = listaRegistro.get(filaRegistro);
             RegistroView registroVista = new RegistroView(listaRegistro, tabRegistrosModelo, "EDITAR REGISTRO", null); 
            registroVista.comboxTipoDoc.setSelectedIndex(registroSeleccionado.getTipoDocumento().getId() - 1);
            registroVista.texfieNoCheque.setText(registroSeleccionado.getComprobante());
            registroVista.texfieReferencia.setText(registroSeleccionado.getReferencia());

            Object cuentaRegistroSeleccionado = registroSeleccionado.getCuenta().getId()+ " | " + registroSeleccionado.getCuenta().getNombre();
            registroVista.comboxCuenta.setSelectedItem(cuentaRegistroSeleccionado);

            if (registroSeleccionado.getDebe() != BigDecimal.ZERO && registroSeleccionado.getHaber() == BigDecimal.ZERO) {
                registroVista.radbutDebito.setSelected(true);
                registroVista.texfieMonto.setText(registroSeleccionado.getDebe().toString());
            } else {
                registroVista.radbutCredito.setSelected(true);
                registroVista.texfieMonto.setText(registroSeleccionado.getHaber().toString());
            }
            registroVista.setLocationRelativeTo(this);
            registroVista.setVisible(true);
        } else {
            mostrarSeleccionVacia();
        }
    }//GEN-LAST:event_butEditarRegistroMouseClicked

    private void butEliminarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEliminarRegistroMouseClicked
        if (!listaSeleccionModelo.isSelectionEmpty()){
            Integer filaRegistro = listaSeleccionEscucha.fila;
            tabRegistrosModelo.removeRow(filaRegistro);

            listaRegistro.remove(listaRegistro.get(filaRegistro));
        } else {
            mostrarSeleccionVacia();
        }
    }//GEN-LAST:event_butEliminarRegistroMouseClicked

    private void butAnadirRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAnadirRegistroMouseClicked
       RegistroView registroView = new RegistroView(listaRegistro, tabRegistrosModelo, "AÑADIR REGISTRO", null); 
    registroView.setLocationRelativeTo(this);
    registroView.setVisible(true);
    }//GEN-LAST:event_butAnadirRegistroMouseClicked

    private void butAnadirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAnadirRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butAnadirRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAnadirRegistro;
    private javax.swing.JButton butEditarRegistro;
    private javax.swing.JButton butEliminarRegistro;
    private javax.swing.JButton butGuardarAsiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.nutrehogar.sistemacontable.ui.view.components.LocalDateSpinner spiFecha;
    public javax.swing.JTable tabRegistros;
    private javax.swing.JTextArea texareConcepto;
    private javax.swing.JTextField texfieDebeTotal;
    private javax.swing.JTextField texfieHaberTotal;
    private javax.swing.JTextField texfieMonto;
    private javax.swing.JTextField texfieNombre;
    // End of variables declaration//GEN-END:variables

     private void mostrarSeleccionVacia() {
        JOptionPane.showMessageDialog(null, "Seleccione un registro en la tabla", 
                    "Selección Vacía", JOptionPane.INFORMATION_MESSAGE
        );
    }
    private void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, 
                    titulo, JOptionPane.ERROR_MESSAGE
        );
    }
}
