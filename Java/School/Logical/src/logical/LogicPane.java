/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mathinterpreter.*;

/**
 *
 * @author eriko
 */

public class LogicPane extends javax.swing.JPanel {

    /**
     * Creates new form LogicPane
     */
    MainFrame _main;
    LogicEquation equation;
    String format;
    String name;
    int id;
    public LogicPane(String name, int id, MainFrame m) {
        equation = new LogicEquation();
        _main = m;
        this.name = name;
        this.id = id;
        initComponents();
        jPanel1.setLayout(new GridLayout(0,1)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jTextField1.setToolTipText("Equation");
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
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

    private String getHeading(ArrayList<String> variables){
        return equation.toString()+"<br>"+String.format(format, variables.toArray())+"Outcome<br>";
    }
    
    private String getState(ArrayList<Boolean> states, boolean outcome){
        return String.format(format, states.toArray())+String.valueOf(outcome)+"<br>";
    }
    
    private void setFormat(ArrayList<String> variables){
        format = "";
        for(String var: variables)
            format+="%-7s";
        format+=" : ";
    }
    
    private void preformOperations(){
        String result = "";
        ArrayList<String> variables = getVariables();
        ArrayList<ArrayList<Boolean>> states = convertToBoolean(getBinaryOutput(variables.size()));
        setFormat(variables);
        result += getHeading(variables);
        for(ArrayList<Boolean> state: states){
            Map arguments = new HashMap();
            variables.forEach(x->arguments.put(x, state.get(variables.indexOf(x))));
            try{result += getState(state,Boolean.valueOf(equation.f(arguments)));}
            catch(Exception e){System.out.println(e);return;}                
        }
        /*JLabel l = new JLabel("<html>"+result.replaceAll(" ", ((char)160)+"")+"</html>");
        l.setFont(new Font("Monospaced",1,18));
        //jPanel2.removeAll();
        jPanel1.add(l);
        jPanel1.add(new JLabel("Test"));
        System.out.println(result.replaceAll("<br>", "\n"));*/
        jTextArea1.setText(result.replaceAll("<br>", "\n"));
    }
    
    private ArrayList<String> getVariables(){
        Set<String> vars = new HashSet();
        for(String part: (ArrayList<String>)equation.getParsedEquation())
            if(equation.variables.contains(part))
                vars.add(part);
        return new ArrayList(vars);
    }
    
    public ArrayList<String> getBinaryOutput(int val)
    {
        String[] temp = new String[(int)Math.pow(2,val)];
        String out = "";
        for (int i=0; i<val; ++i) {
            out+="0";   
        }
        for (int i = 0; i < Math.pow(2,val); i++) {
            if (val-Integer.toBinaryString(i).length() > 0) { 
                temp[i] = out.substring(1,val-Integer.toBinaryString(i).length()+1) +Integer.toBinaryString(i);
            } else {
                temp[i] = Integer.toBinaryString(i);
            }
        }
        return  new ArrayList<String>(Arrays.asList(temp));
    }
    
    public ArrayList<ArrayList<Boolean>> convertToBoolean(ArrayList<String> a){
        ArrayList<ArrayList<Boolean>> res = new ArrayList();
        for(String s: a){
            ArrayList<Boolean> temp = new ArrayList();
            for(char state: s.toCharArray())
               temp.add(state=='0');
            res.add(temp);
        }
        return res;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}