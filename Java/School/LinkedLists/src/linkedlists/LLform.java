/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import javax.swing.*;

/**
 *
 * @author ostlinja
 */
public class LLform extends javax.swing.JPanel {

    LinkedListInt ll;
    String type = "";
    LLUI m_;
    int index;
    public LLform(LinkedListInt l,String t,LLUI m, int i) {
        ll = l;
        type = t;
        m_ = m;
        index = i;
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setText(ll.toString());

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Append");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Size: "+ll.getSize());

        jButton4.setText("Find");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText(type);

        jButton5.setText("x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Push");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //button call for "Insert" calls the insert method of the list if conditions are met
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTextField value = new JTextField(5);
        JTextField index = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Value:"));
        myPanel.add(value);
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("Index:"));
        myPanel.add(index);
        int res = JOptionPane.showConfirmDialog(
                    this,myPanel,"Insert Value",JOptionPane.OK_CANCEL_OPTION);
        
        if(res == JOptionPane.OK_OPTION)
        {
            String s = value.getText();
            int i = Integer.parseInt(index.getText());
            if ((s != null) && (s.length() > 0)) {
                if(Character.isDigit(s.toCharArray()[0]))
                    ll.insert(new Node<Integer>(Integer.parseInt(s)),i);
                else
                    ll.insert(new Node<String>(s),i);
            }
        }
        update();
    }//GEN-LAST:event_jButton1ActionPerformed

    //button call for "Append" calls the append method of the list if conditions are met
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = (String)JOptionPane.showInputDialog(
                    this,"Enter Value to be Appended","Append",JOptionPane.PLAIN_MESSAGE);
        
        if ((s != null) && (s.length() > 0)) {
            if(Character.isDigit(s.toCharArray()[0]))
                ll.append(new Node<Integer>(Integer.parseInt(s)));
            else
                ll.append(new Node<String>(s));
        }
        update();
    }//GEN-LAST:event_jButton2ActionPerformed

    //button call for "Delete" calls the delete method of the list if conditions are met
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s = (String)JOptionPane.showInputDialog(
                    this,"Enter Value to be Deleted","Delete",JOptionPane.PLAIN_MESSAGE);
        
        if ((s != null) && (s.length() > 0)) {
            ll.delete(ll.findVague(s));
        }
        update();
    }//GEN-LAST:event_jButton3ActionPerformed

    //button call for "Found" calls the found method of the list if conditions are met if so prints a window with the details of that node
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s = (String)JOptionPane.showInputDialog(
                    this,"Enter Value to be Found","Find",JOptionPane.PLAIN_MESSAGE);
        
        if ((s != null) && (s.length() > 0)) {
            Node n = ll.getNode(ll.findVague(s));
            String output = "";
            if(n==null)
                output = "Unable to find Node with value '"+s+"'";
            else
                if(n.hasNext())
                    output = "Node: "+ll.find(n)+"\nValue: "+n.getValue()+"\nNext Node: "+n.getNext().getValue();
                else
                    output = "Node:\nValue: "+n.getValue()+"\nNext Node: "+n.getNext();
            JOptionPane.showMessageDialog(this,output,"Info",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //called when the exit button is pressed, delete current tab
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        m_.delete(index);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String s = (String)JOptionPane.showInputDialog(
                    this,"Enter Value to be Pushed","Push",JOptionPane.PLAIN_MESSAGE);
        
        if ((s != null) && (s.length() > 0)) {
            if(Character.isDigit(s.toCharArray()[0]))
                ll.push(new Node<Integer>(Integer.parseInt(s)));
            else
                ll.push(new Node<String>(s));
        }
        update();
    }//GEN-LAST:event_jButton6ActionPerformed

    //resets the fields that require information from the list
    private void update()
    {
        jLabel1.setText("Size: "+ll.getSize());
        jTextArea1.setText(ll.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
