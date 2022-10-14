/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionNro1;

import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static EvaluacionNro1.MetodosCalculadores.*;

/**
 *
 * @author Usuario
 */
public class Ventana2 extends javax.swing.JPanel {

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
        respuesta.setVisible(false);
        respuestasContenedor.setVisible(false);
        warning.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        enunciado = new javax.swing.JTextArea();
        instruccion = new javax.swing.JLabel();
        numeroIngresado = new javax.swing.JTextField();
        ingreso = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();
        respuestasContenedor = new javax.swing.JPanel();
        rMayorElem = new javax.swing.JTextField();
        enunciado3 = new javax.swing.JLabel();
        enunciado1 = new javax.swing.JLabel();
        rMenorElemPos = new javax.swing.JTextField();
        enunciado4 = new javax.swing.JLabel();
        datosImport = new javax.swing.JLabel();
        mayorElemento = new javax.swing.JLabel();
        r3 = new javax.swing.JTextField();
        sumaR1 = new javax.swing.JTextField();
        enunciado2 = new javax.swing.JLabel();
        rMenorElem = new javax.swing.JTextField();
        menorElementoPositivo = new javax.swing.JLabel();
        enunciado5 = new javax.swing.JLabel();
        menorElemento = new javax.swing.JLabel();
        r4 = new javax.swing.JTextField();
        promedioR1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        r5 = new javax.swing.JTextField();
        diagSecun = new javax.swing.JLabel();
        rDiagSecun = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        warning = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(201, 214, 227));
        setToolTipText("");

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        enunciado.setEditable(false);
        enunciado.setBackground(new java.awt.Color(201, 214, 227));
        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        enunciado.setRows(5);
        enunciado.setText("Desarrollar un programa que al ingresar un numero N entre 1 \ny 9 construya una matriz NxN de números Random  de  hasta\ntres  dígitos enteros positivos negativos del 1 al 999 y muestre\nlas siguientes operaciones");
        enunciado.setToolTipText("");
        jScrollPane2.setViewportView(enunciado);

        instruccion.setText("Ingrese el numero deseado:  ");

        numeroIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIngresadoActionPerformed(evt);
            }
        });

        ingreso.setText("ok");
        ingreso.setOpaque(false);
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });

        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuesta.setText("RESPUESTAS");

        respuestasContenedor.setOpaque(false);

        rMayorElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMayorElemActionPerformed(evt);
            }
        });

        enunciado3.setText("R3/ Elemento menor positivo es primo: ");

        enunciado1.setText("R1/ Suma y promedio de la diagonal secundaria: ");

        rMenorElemPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMenorElemPosActionPerformed(evt);
            }
        });

        enunciado4.setText("R4/ Elemento mayor entre el menor: ");

        datosImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosImport.setText("Datos importantes: ");

        mayorElemento.setText("Mayor elemento en la matriz: ");

        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        sumaR1.setEditable(false);
        sumaR1.setText("Suma: ");
        sumaR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaR1ActionPerformed(evt);
            }
        });

        enunciado2.setText("R2/ Potencia del elemento mayor elevado al menor positivo: ");

        rMenorElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMenorElemActionPerformed(evt);
            }
        });

        menorElementoPositivo.setText("Menor elemento positivo en la matriz: ");

        enunciado5.setText("R5/ Elementos de la diagonal principal ordenada de manera decreciente: ");

        menorElemento.setText("Menor elemento en la matriz: ");

        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        promedioR1.setEditable(false);
        promedioR1.setText("promedio: ");
        promedioR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioR1ActionPerformed(evt);
            }
        });

        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        diagSecun.setText("diagonal Secundaria: ");

        rDiagSecun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDiagSecunActionPerformed(evt);
            }
        });

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatriz.setOpaque(false);
        jScrollPane4.setViewportView(tblMatriz);

        javax.swing.GroupLayout respuestasContenedorLayout = new javax.swing.GroupLayout(respuestasContenedor);
        respuestasContenedor.setLayout(respuestasContenedorLayout);
        respuestasContenedorLayout.setHorizontalGroup(
            respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respuestasContenedorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enunciado1)
                                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(r5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enunciado5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                        .addComponent(sumaR1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(promedioR1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(enunciado2))
                                .addGap(113, 113, 113))
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enunciado3)
                                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enunciado4)
                                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, respuestasContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mayorElemento)
                                    .addComponent(menorElementoPositivo)
                                    .addComponent(menorElemento)
                                    .addComponent(diagSecun))
                                .addGap(23, 23, 23)
                                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rDiagSecun, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rMayorElem, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rMenorElemPos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rMenorElem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(datosImport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
        respuestasContenedorLayout.setVerticalGroup(
            respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respuestasContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enunciado1)
                        .addGap(18, 18, 18)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumaR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(promedioR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enunciado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addComponent(enunciado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addComponent(enunciado4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(enunciado5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datosImport)
                        .addGap(18, 18, 18)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mayorElemento)
                            .addComponent(rMayorElem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menorElementoPositivo)
                            .addComponent(rMenorElemPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menorElemento)
                            .addComponent(rMenorElem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(respuestasContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(respuestasContenedorLayout.createSequentialGroup()
                                .addComponent(diagSecun)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(rDiagSecun)))
                    .addGroup(respuestasContenedorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        warning.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setText("POR FAVOR, INGRESE UN NUMERO ENTERO (0 - 9)");

        jScrollPane3.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(201, 214, 227));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1.- Suma y promedio de la diagonal secundaria\n2.- Potencia del elemento mayor elevado al menor positivo\n3.- Evaluar si el elemento menor positivo es primo\n4.- División del elemento mayor entre el menor\n5.- Elementos de la diagonal principal Ordenada de mayor a \n      menor en forma de Vector.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ingreso))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(instruccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(228, 228, 228)
                                    .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14))
                                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(respuestasContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruccion)
                    .addComponent(warning))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuestasContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numeroIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIngresadoActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
      
        if (!ingresoNumeroValido(numeroIngresado.getText().trim())) {
            JOptionPane.showMessageDialog(datosImport, "El numero ingresado no es válido");
        } else {
            calculosPertinentes();
            visibles();
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoActionPerformed

    private void sumaR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumaR1ActionPerformed

    private void promedioR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioR1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void rMayorElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMayorElemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMayorElemActionPerformed

    private void rMenorElemPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMenorElemPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMenorElemPosActionPerformed

    private void rMenorElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMenorElemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMenorElemActionPerformed

    private void rDiagSecunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDiagSecunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDiagSecunActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datosImport;
    private javax.swing.JLabel diagSecun;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JLabel enunciado1;
    private javax.swing.JLabel enunciado2;
    private javax.swing.JLabel enunciado3;
    private javax.swing.JLabel enunciado4;
    private javax.swing.JLabel enunciado5;
    private javax.swing.JButton ingreso;
    private javax.swing.JLabel instruccion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mayorElemento;
    private javax.swing.JLabel menorElemento;
    private javax.swing.JLabel menorElementoPositivo;
    private javax.swing.JTextField numeroIngresado;
    private javax.swing.JTextField promedioR1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField rDiagSecun;
    private javax.swing.JTextField rMayorElem;
    private javax.swing.JTextField rMenorElem;
    private javax.swing.JTextField rMenorElemPos;
    private javax.swing.JLabel respuesta;
    private javax.swing.JPanel respuestasContenedor;
    private javax.swing.JTextField sumaR1;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables

    private void visibles() {

        respuestasContenedor.setVisible(true);
    }

    private void calculosPertinentes() {
        int dimension = parseInt(numeroIngresado.getText());
        int[][] matrizRandom = new int[dimension][dimension];

        //generar Matriz Random
        llenarMatrizRandom(matrizRandom, dimension);

        //Pregunta NRO 1 Suma - Promedio de diagonal secundaria
        sumaR1.setText(sumaR1.getText() + sumaDiagonalSecundaria(matrizRandom, dimension));
        promedioR1.setText(promedioR1.getText() + String.format("%.2f", (double) sumaDiagonalSecundaria(matrizRandom, dimension) / dimension));

        //pregunta NRO 2 
        r2.setText(mayorAlMenor(matrizRandom) + "");

        //pregunta NRO 3
        r3.setText(elementoMenorPrimo(matrizRandom) + "");

        //pregunta NRO 4
        r4.setText(String.format("%.2f", elementoMayorEntreMenor(matrizRandom)));

        //pregunta NRO 5
        r5.setText(mostrarDiagonalPrincipalOrdenada(matrizRandom));

        //asignando Datos importantes
        rMayorElem.setText(elementoMayorEnMatrizCuadrada(matrizRandom, dimension) + "");

        rMenorElem.setText(elementoMenorEnMatrizCuadrada(matrizRandom, dimension) + "");

        rMenorElemPos.setText(elementoMenorPositivoEnMatrizCuadrada(matrizRandom, dimension) + "");

        rDiagSecun.setText(mostrarDiagonalSecundaria(matrizRandom, dimension));

        //mostrarMatrizEnTextArea
        mostrarMatrizRandom(matrizRandom, dimension);

        //desactivar boton 'ok'
        ingreso.setEnabled(false);

    }

    private boolean ingresoNumeroValido(String txt) {
        boolean valido;
        if(txt.equals("")){
            valido = false;
        } else {
            valido = txt.matches("[0-9]");
        }
        return valido;
        //!(0 != parseInt(txt) || 1 != parseInt(numeroIngresado.getText()) || 2 != parseInt(numeroIngresado.getText()) || 3 != parseInt(numeroIngresado.getText()) || 4 != parseInt(numeroIngresado.getText()) || 5 != parseInt(numeroIngresado.getText()) || 6 != parseInt(numeroIngresado.getText()) || 7 != parseInt(numeroIngresado.getText()) || 8 != parseInt(numeroIngresado.getText()) || 9 != parseInt(numeroIngresado.getText()));

    }

    /*private boolean isNumeric(String cadena) {
        

        boolean resultado;
        if (!cadena.equals("")) {
            try {
                Integer.parseInt(cadena);
                resultado = true;
            } catch (NumberFormatException excepcion) {
                resultado = false;
            }
        } else {
            resultado = false;
        }

        return resultado;
    }*/

    private void mostrarMatrizRandom(int[][] matriz, int n) {
        DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
        model.setRowCount(n);
        model.setColumnCount(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tblMatriz.setValueAt(matriz[i][j], i, j);
            }
        }
    }

}