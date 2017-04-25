/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricies;

import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ostlinja
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    ArrayList matricies;
    ArrayList names;
    public MainForm() {
        matricies = new ArrayList();
        names = new ArrayList();
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

        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Operations...", "Determinate", "Multiply", "Dot", "Add", "Inverse", "Transpose", "Detailed", "Gauss Jordan" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.addTab("Matricies", jTabbedPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane2.addTab("Output Log", jScrollPane1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New...", "Standard", "Identity", "From File" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String cmd = jComboBox1.getSelectedItem().toString();
        if(cmd=="Determinate")
            determinant();
        else if(cmd=="Multiply")
            multiply();
        else if(cmd=="Dot")
            dot();
        else if(cmd=="Add")
            add();
        else if(cmd=="Inverse")
            inverse();
        else if(cmd=="Transpose")
            transpose();
        else if(cmd=="Detailed")
            details();
        else if(cmd=="Gauss Jordan")
            gaussJordan();
        jComboBox1.setSelectedIndex(0);
        this.repaint();
        //Operations..., Determinate, Multiply, Dot, Add, Inverse, Transpose,Detailed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String choice = jComboBox2.getSelectedItem().toString();
        if(choice!="New...")
        {
            if(choice=="Standard")
                createNew();
            else if(choice=="Identity")
            {
                JTextField row = new JTextField(5);
                JTextField col = new JTextField(5);
                JPanel myPanel = new JPanel();
                myPanel.add(new JLabel("Rows:"));
                myPanel.add(row);
                myPanel.add(new JLabel("Columns:"));
                myPanel.add(col);
                int res = JOptionPane.showConfirmDialog(this,myPanel,"New Identity",JOptionPane.OK_CANCEL_OPTION);
                if(res==JOptionPane.OK_OPTION)
                {
                    if(isNumber(row.getText())&&isNumber(col.getText()))
                    {
                        int r = Integer.parseInt(row.getText());
                        int c = Integer.parseInt(col.getText());
                        Matrix m = new Matrix();
                        createNew(m.newIdentity(r, c));
                    }
                }
            }
            else if(choice=="From File")
            {
                JFileChooser fc = new JFileChooser();
                int result = fc.showDialog(this, "Select File");
                if(result==JFileChooser.APPROVE_OPTION)
                {
                    try{Matrix m = importData(fc.getSelectedFile());
                    if(m!=null)
                        createNew(m);
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
            }
            jComboBox2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void determinant()
    {
        JComboBox j = new JComboBox(names.toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Determinate",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                double d = temp.determinate();
                newOutput("determinant |["+s+"]| = "+d+" <br>"+temp.toHtml());
            }
        }
    }
    
    private void multiply()
    {
        JComboBox j = new JComboBox(names.toArray());
        JComboBox j2 = new JComboBox(names.toArray());
        JTextField value = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Enter Value:"));
        myPanel.add(value);
        myPanel.add(new JLabel("Or Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Multiply",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            String v = value.getText();
            if(s!=null)
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                if(s2=="Select..." && isNumber(v))
                {
                    temp.multiply(Double.parseDouble(v));
                    newOutput("Multiplication ["+s+"] * "+v+"<br>"+temp.toHtml());
                }
                else if(s2!="Select...")
                {
                    try{temp.multiply((Matrix)matricies.get(j2.getSelectedIndex()));
                        newOutput("Multiplication ["+s+"] * ["+s2+"]<br>"+temp.toHtml());
                    }
                    catch(Exception e){System.out.println(e);}
                    
                }
                MatrixForm m = (MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex());
                m.drawMatrix();
            }
        }
    }
    
    private void dot()
    {
        JComboBox j = new JComboBox(names.toArray());
        JComboBox j2 = new JComboBox(names.toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Other Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Dot Product",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            if(s!=null && s2!=null && s!="Select..." && s2!="Select...")
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                try{Matrix newM = temp.dot((Matrix)matricies.get(j2.getSelectedIndex()));
                    newOutput("Dot Product ["+s+"] . ["+s2+"]<br>"+newM.toHtml());
                    createNew(newM);
                }
                catch(Exception e){e.printStackTrace();}
                MatrixForm m = (MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex());
                m.drawMatrix();
            }
        }
    }
    
    private void add()
    {
        JComboBox j = new JComboBox(names.toArray());
        JComboBox j2 = new JComboBox(names.toArray());
        JTextField value = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Enter Value:"));
        myPanel.add(value);
        myPanel.add(new JLabel("Or Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Addition",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            String v = value.getText();
            if(s!=null)
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                if(s2=="Select..." && isNumber(v))
                {
                    temp.add(Double.parseDouble(v));
                    newOutput("Addition ["+s+"] + "+v+"<br>"+temp.toHtml());
                }
                else if(s2!="Select...")
                {
                    try{temp.add((Matrix)matricies.get(j2.getSelectedIndex()));
                        newOutput("Addition ["+s+"] + ["+s2+"]<br>"+temp.toHtml());
                    }
                    catch(Exception e){System.out.println(e);}
                    
                }
                MatrixForm m = (MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex());
                m.drawMatrix();
                
            }
        }
    }
    
    public void inverse()
    {
        
    }
    
    public void transpose()
    {
        JComboBox j = new JComboBox(names.toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"TransPose",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                temp.transpose();
                newOutput("Transpose ["+s+"]<br>"+temp.toHtml());
                MatrixForm m = (MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex());
                m.drawMatrix();
            }
            
        }
    }
    
    public void details()
    {
        JComboBox j = new JComboBox(names.toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Detailed View",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                newOutput("Details ["+s+"]<br>"+temp.toHtml(4));
            }
        }
    }
    
    public void gaussJordan()
    {
        JComboBox j = new JComboBox(names.toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Gauss Jordan Elimination",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get(j.getSelectedIndex());
                newOutput("Gauss Jordan Elminiation ["+s+"]<br>"+temp.toHtml());
                createNew(temp.GaussJordan());
            }
        }
    }
    
    public Matrix importData(File f) throws Exception//loads and reads a given file
    { 
        double[][] mat;
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(f.toPath(), charset)) {
            String line = null;
            line = reader.readLine();
            String[] dim = line.split("[,]");
            if(dim.length==2&&isNumber(dim[0])&&isNumber(dim[1]))
                mat = new double[Integer.parseInt(dim[0])][Integer.parseInt(dim[1])];
            else
                throw new Exception("Imported Matrix dimensions are invaild");
            int row = 0;
            int col = 0;
            while ((line = reader.readLine()) != null) {
                Pattern p = Pattern.compile("[^\\s,]+");
                Matcher m = p.matcher(line);  
                while(m.find())
                {
                    String s = line.substring(m.start(), m.end());
                    if(isNumber(s))
                    {
                        mat[row][col] = Integer.parseInt(s);
                        col++;
                    }
                }
                row++;
                col = 0;
            }
            return new Matrix(Integer.parseInt(dim[0]),Integer.parseInt(dim[1]),mat);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return null;
    }
    
    private void createNew()
    {
        createNew(new Matrix(2,2));
    }
    
    private void createNew(Matrix m)
    {
        int index = jTabbedPane1.getTabCount();
        String name = getAvailableChar();
        jTabbedPane1.add(new MatrixForm(m,this,index),name);
        jTabbedPane1.setSelectedIndex(index);
        matricies.add(index,m);
        names.add(index, name);
        newOutput("New Matrix ["+name+"]<br>"+m.toHtml());
    }
    
    
    public void duplicate(Matrix m)
    {
        createNew(m.clone());
    }
    
    public void newOutput(String s)
    {
        JLabel l = new JLabel("<html>"+s+"<br></html>");
        l.setFont(new Font("Monospaced",1,18));
        jPanel1.add(l);
    }
    
    private String getAvailableChar()
    {
        int count = 1;
        while (count<5)
        {
            String name = nameHelper("",count);
            if(!names.contains(name)&&name!="")
                return name;
            count++;
        }
        return "...";
    }
    
    private String nameHelper(String base,int depth)
    {
        if (depth>0)
        {
            for (char c = 'A'; c <= 'Z'; ++c)
            {
                String name = nameHelper(base+c,depth-1);
                if(!names.contains(name)&&name!="")
                    return name;
            }
        }
        return base;
    }
   
    public boolean isNumber(String s)
    {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
    
    public String getAlphabet()
    {
        String alpha = "";
        for (char c = 'A'; c <= 'Z'; ++c)
            alpha+=c;
        
        return alpha;
    }
    
    public String convertDec(int value,int base)
    {
        if(base<=36 && base>1 && value>0)
        {
            String alpha = getAlphabet();
            int remainder = value%base;
            String temp = "";
            if(remainder>9)
                temp = alpha.substring(remainder-10, remainder-9);
            else
                temp = Integer.toString(remainder);
            return convertDec((int)(value/base),base)+temp;

        }
        return "";
    }
       
    public void rename(int i,String n)
    {
        if(!names.contains(n))
        {
            newOutput("Rename ["+names.get(i)+"] -> ["+n+"]");
            jTabbedPane1.setTitleAt(i, n);
            names.set(i,n);
        }
    }
    
    public void delete(int i)
    {
        jTabbedPane1.remove(i);
        matricies.remove(i);
        names.remove(i);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
