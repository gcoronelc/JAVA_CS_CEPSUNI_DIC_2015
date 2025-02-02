/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.uni.eureka.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import pe.egcc.uni.eureka.controller.ClienteController;
import pe.egcc.uni.eureka.model.ClienteModel;
import pe.egcc.uni.eureka.util.EurekaUtil;
import pe.egcc.uni.eureka.util.Mensajes;
import pe.egcc.uni.eureka.util.Session;

/**
 *
 * @author Administrador
 */
public class MantClientesView extends javax.swing.JInternalFrame {

  private List<ClienteModel> lista;
  private String ruta = "G:\\EGCC";
  private String archivo = "datos.xls";
  
  /**
   * Creates new form MantClientesView
   */
  public MantClientesView() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtCriterio = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    btnNuevo = new javax.swing.JButton();
    btnEditar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    btnExcel = new javax.swing.JButton();
    btnCerrar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblData = new javax.swing.JTable();
    btnPDF = new javax.swing.JButton();
    btnExcel2 = new javax.swing.JButton();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("MANTENIMIENTO DE CLIENTES");

    jLabel1.setText("Nombre o apellido");

    btnBuscar.setText("Buscar");
    btnBuscar.setToolTipText("Buscar clientes.");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarActionPerformed(evt);
      }
    });

    btnNuevo.setText("Nuevo");
    btnNuevo.setToolTipText("Registrar nuevo cliente.");
    btnNuevo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNuevoActionPerformed(evt);
      }
    });

    btnEditar.setText("Editar");
    btnEditar.setToolTipText("Editar cliente actual.");
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    btnEliminar.setText("Eliminar");
    btnEliminar.setToolTipText("Eliminar cliente actual.");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarActionPerformed(evt);
      }
    });

    btnExcel.setText("Excel");
    btnExcel.setToolTipText("Exportar lista a excel.");
    btnExcel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcelActionPerformed(evt);
      }
    });

    btnCerrar.setText("Cerrar");

    tblData.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "CODIGO", "PATERNO", "MATERNO", "NOMBRE"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane1.setViewportView(tblData);

    btnPDF.setText("PDF");
    btnPDF.setToolTipText("Exportar lista a PDF.");
    btnPDF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPDFActionPerformed(evt);
      }
    });

    btnExcel2.setText("Excel 2");
    btnExcel2.setToolTipText("Exportar lista a excel con plantilla.");
    btnExcel2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcel2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnBuscar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnNuevo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnEditar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnEliminar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnExcel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnExcel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnPDF)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCerrar)
            .addGap(0, 147, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnExcel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    try {
      String criterio = txtCriterio.getText();
      ClienteController controller = new ClienteController();
      lista = controller.buscar(criterio);
      mostrarLista(lista);
    } catch (Exception e) {
      Mensajes.showError(this, e.getMessage());
    }
  }//GEN-LAST:event_btnBuscarActionPerformed

  private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
    
    try {
      // Verificar si existe datos
      if (lista == null || lista.isEmpty()) {
        return;
      }
      // Archivo destino
      String archivoCompleto = ruta + "\\" +archivo;
      // Seleccionar archivo destino
      /*
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      int result = fileChooser.showOpenDialog(this);
      if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        archivo = selectedFile.getAbsolutePath();
      } else {
        return;
      }
      */

      // Proceso de crear el archivo excel
      // Paso 1: Crear el libro
      HSSFWorkbook objWB = new HSSFWorkbook();
      // Paso 2: Crear la hoja
      HSSFSheet hoja = objWB.createSheet("LISTADO DE CLIENTES");
      // Paso 3: Crear la cabecera
      HSSFRow filaData = hoja.createRow(0);
      filaData.createCell(0).setCellValue("CODIGO");
      filaData.createCell(1).setCellValue("PATERNO");
      filaData.createCell(2).setCellValue("MATERNO");
      filaData.createCell(3).setCellValue("NOMBRE");
      filaData.createCell(4).setCellValue("DNI");
      filaData.createCell(5).setCellValue("TELEFONO");
      filaData.createCell(6).setCellValue("EMAIL");
      // Cargar data a la hoja
      int nroFila = 1;
      for (ClienteModel clienteBean : lista) {
        filaData = hoja.createRow(nroFila);
        filaData.createCell(0).setCellValue(clienteBean.getCodigo());
        filaData.createCell(1).setCellValue(clienteBean.getPaterno());
        filaData.createCell(2).setCellValue(clienteBean.getMaterno());
        filaData.createCell(3).setCellValue(clienteBean.getNombre());
        filaData.createCell(4).setCellValue(clienteBean.getDni());
        filaData.createCell(5).setCellValue(clienteBean.getTelefono());
        filaData.createCell(6).setCellValue(clienteBean.getEmail());
        nroFila++;
      }
      // Crear el archivo
      File objFile = new File(archivoCompleto);
      FileOutputStream archivoSalida = new FileOutputStream(objFile);
      objWB.write(archivoSalida);
      archivoSalida.close();
      Mensajes.showInfo(this, "Proceso ejecutado correctamente.");
    
    } catch (IOException ex) {
      ex.printStackTrace();
      Mensajes.showError(this, "No se tiene permiso para crear el archivo.");
    }
  }//GEN-LAST:event_btnExcelActionPerformed

  private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
    if(lista == null || lista.isEmpty()){
      return;
    }
    try {
      // Preparando la data
      JRBeanCollectionDataSource data;
      data = new JRBeanCollectionDataSource(lista);
      // Parametros
      Map pars = new HashMap();
      // Leer el compilado
      String archivoReporte = "/pe/egcc/uni/eureka/reports/ListadoClientes.jasper";
      InputStream inputStream = getClass().getResourceAsStream(archivoReporte);
      JasperReport jasperReport;
      jasperReport =  (JasperReport) JRLoader.loadObject(inputStream);
      // Cargando datos al reporte
      JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, pars, data);
      // Mostrar en pantalla
      JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
      jasperViewer.setTitle("LISTADO DE CLIENTES");
      jasperViewer.setVisible(true);
    } catch (Exception e) {
    }
  }//GEN-LAST:event_btnPDFActionPerformed

  private void btnExcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel2ActionPerformed
    try {
      // Verificar si existe datos
      if (lista == null || lista.isEmpty()) {
        return;
      }
      // Archivo destino
      String archivoCompleto = ruta + "\\" + archivo;
      // Seleccionar archivo destino
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      int result = fileChooser.showOpenDialog(this);
      if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        archivoCompleto = selectedFile.getAbsolutePath();
      } else {
        return;
      }

      // Proceso de crear el archivo excel
      // Paso 1: Crear el libro desde la plantilla
      String plantilla = "/pe/egcc/uni/eureka/plantillas/clientes.xls";
      InputStream inp = Class.class.getResourceAsStream(plantilla);
      HSSFWorkbook objWB = new HSSFWorkbook(inp);
      // Paso 2: Crear la hoja
      HSSFSheet hoja = objWB.getSheetAt(0);
      // Cargar data a la hoja
      HSSFRow filaData = null;
      int nroFila = 1;
      for (ClienteModel clienteBean : lista) {
        filaData = hoja.createRow(nroFila);
        filaData.createCell(0).setCellValue(clienteBean.getCodigo());
        filaData.createCell(1).setCellValue(clienteBean.getPaterno());
        filaData.createCell(2).setCellValue(clienteBean.getMaterno());
        filaData.createCell(3).setCellValue(clienteBean.getNombre());
        filaData.createCell(4).setCellValue(clienteBean.getDni());
        filaData.createCell(5).setCellValue(clienteBean.getTelefono());
        filaData.createCell(6).setCellValue(clienteBean.getEmail());
        nroFila++;
      }
      // Crear el archivo
      File objFile = new File(archivoCompleto);
      FileOutputStream archivoSalida = new FileOutputStream(objFile);
      objWB.write(archivoSalida);
      archivoSalida.close();
      Mensajes.showInfo(this, "Proceso ejecutado correctamente.");
    } catch (IOException ex) {
      ex.printStackTrace();
      Mensajes.showError(this, "No se tiene permiso para crear el archivo.");
    }
  }//GEN-LAST:event_btnExcel2ActionPerformed

  private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    EditClienteView view = new EditClienteView(null, true);
    view.setAccion(EurekaUtil.CRUD_NUEVO);
    ClienteModel clienteModel = new ClienteModel();
    clienteModel.setCodigo("NUEVO");
    view.setClienteModel(clienteModel);
    view.setVisible(true);
    if(Session.get("clienteModel") == null){
      return;
    }
    clienteModel = (ClienteModel) Session.get("clienteModel");
    if(lista == null){
      lista = new ArrayList<>();
    }
    lista.add(0, clienteModel);
    mostrarLista(lista);
  }//GEN-LAST:event_btnNuevoActionPerformed

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int fila = tblData.getSelectedRow();
    if(fila == -1){
      return;
    }
    ClienteModel clienteModel = lista.get(fila);
    EditClienteView view = new EditClienteView(null, true);
    view.setAccion(EurekaUtil.CRUD_EDITAR);
    view.setClienteModel(clienteModel);
    view.setVisible(true);
    if(Session.get("clienteModel") == null){
      return;
    }
    clienteModel = (ClienteModel) Session.get("clienteModel");
    lista.set(fila, clienteModel);
    tblData.setValueAt(clienteModel.getPaterno(), fila, 1);
    tblData.setValueAt(clienteModel.getMaterno(), fila, 2);
    tblData.setValueAt(clienteModel.getNombre(), fila, 3);
  }//GEN-LAST:event_btnEditarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila = tblData.getSelectedRow();
    if(fila == -1){
      return;
    }
    ClienteModel clienteModel = lista.get(fila);
    EditClienteView view = new EditClienteView(null, true);
    view.setAccion(EurekaUtil.CRUD_ELIMINAR);
    view.setClienteModel(clienteModel);
    view.setVisible(true);
    if(Session.get("clienteModel") == null){
      return;
    }
    lista.remove(fila);
    mostrarLista(lista);
    if(fila < lista.size()){
      tblData.getSelectionModel().setSelectionInterval(0, fila);
    }
  }//GEN-LAST:event_btnEliminarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnCerrar;
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnExcel;
  private javax.swing.JButton btnExcel2;
  private javax.swing.JButton btnNuevo;
  private javax.swing.JButton btnPDF;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblData;
  private javax.swing.JTextField txtCriterio;
  // End of variables declaration//GEN-END:variables

  private void mostrarLista(List<ClienteModel> lista) {
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblData.getModel();
    tabla.setRowCount(0);
    for (ClienteModel model : lista) {
      Object[] rowData = {model.getCodigo(),
        model.getPaterno(), model.getMaterno(), model.getNombre()};
      tabla.addRow(rowData);
    }
  }
}
