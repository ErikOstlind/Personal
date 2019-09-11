/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import Interpreter.Interpreter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import mathinterpreter.LogicEquation;

/**
 *
 * @author eriko
 */

public class LogicPane extends javax.swing.JPanel {

    /**
     * Creates new form LogicPane
     */
    private MainFrame _main;
    private LogicEquation equation;
    private String format;
    private String name;
    private ArrayList<LogicOutput> results;
    public LogicPane(String name, MainFrame m) {
        equation = new LogicEquation();
        results = new ArrayList();
        _main = m;
        this.name = name;
        initComponents();
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("Enter Logic Equation...");
        jTextField1.setToolTipText("Equation");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("x");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.enableInputMethods(false);
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1)
                        .addGap(2, 2, 2)))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        _main.deleteTab(name);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        equation.setEquation(jTextField1.getText());
        preformOperations();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            equation.setEquation(jTextField1.getText());
            preformOperations();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().isEmpty())
            jTextField1.setText("Enter Logic Equation...");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        if(jTextField1.getText().equals("Enter Logic Equation..."))
            jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MousePressed

    private LogicOutput createOutput(String states, String outcome){
        ArrayList<Boolean> formatTargets = new ArrayList();
        for(char c: states.toCharArray())
            formatTargets.add(c=='1');
        return new LogicOutput(equation.equation, formatTargets, Boolean.valueOf(outcome));
    }
    
    private void setFormat(ArrayList<String> variables){
        format = new String();
        variables.forEach(x->{format+="%-7s";});
        format+=" : ";
    }
    
    private void preformOperations(){
        ArrayList<String> variables = getVariables();
        setFormat(variables);
        results = new ArrayList();
        for(String states: getBinaryOutput(variables.size())){
            Map arguments = new HashMap();
            variables.forEach(x->arguments.put(x, states.charAt(variables.indexOf(x))=='1'));
            try{results.add(createOutput(states,new Interpreter(equation).interpret(arguments)));}
            catch(Exception e){System.out.println(e);return;}                
        }
        displayResults();
    }
    
    private ArrayList<String> getVariables(){
        Set<String> vars = new HashSet();
        for(String part: (ArrayList<String>)equation.parsedEquation)
            if(equation.variables.contains(part))
                vars.add(part);
        return new ArrayList(vars);
    }
    
    public ArrayList<String> getBinaryOutput(int val){
        ArrayList<String> temp = new ArrayList();
        int max = (int)Math.pow(2,val);  
        for (int i = 0; i < max; i++)
            temp.add(String.format("%"+val+"s", Integer.toBinaryString(i)).replaceAll(" ", "0"));
        //Collections.reverse(temp);
        return  temp;
    }
    
    private void displayResults(){
        ArrayList temp = (ArrayList<String>)getVariables().clone();
        temp.add("Output");
        Object[] headers = temp.toArray();
        Object data[][] = new Object[results.size()][];
        for(int i = 0;i < results.size(); i++){
            LogicOutput output = results.get(i);
            ArrayList<Boolean> states = (ArrayList<Boolean>)output.states.clone();
            states.add(output.output);
            if(MainFrame.toggle)
                data[i] = states.toArray();
            else{
                ArrayList row = new ArrayList();
                for(boolean state: states)
                    row.add(state ? "1" : "0");
                data[i] = row.toArray();
            }
        }
        DefaultTableModel m = new DefaultTableModel(data,headers);
        jTable1.setModel(m);
    }
    
    public void updateView(){
        if(!results.isEmpty())
            displayResults();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

class LogicOutput{
    String equation;
    ArrayList<Boolean> states;
    boolean output;
    
    public LogicOutput(String equation, ArrayList<Boolean> states, boolean output){
        this.equation = equation;
        this.states = (ArrayList<Boolean>)states.clone();
        this.output = output;
    }
    
    public String format(String format){
        return String.format(format, states.toArray())+output;
    }
    
    public String toString(){
        String result = "";
        for(Boolean state: states)
            result += state + " ";
        result += output;
        return result;
    }
}