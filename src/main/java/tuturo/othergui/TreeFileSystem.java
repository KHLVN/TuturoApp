/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuturo.othergui;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.ExpandVetoException;
import javax.swing.tree.TreePath;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.nio.file.*;

/**
 *
 * @author Khelvin
 */
public class TreeFileSystem extends javax.swing.JFrame implements ActionListener, TreeWillExpandListener{
    private int fileIndex;
    
    public TreeFileSystem() {

        textField = new JTextField("c:\\");
        textField.addActionListener( this );
        add(textField, BorderLayout.NORTH);

        tree = new JTree( new DefaultMutableTreeNode() );
        JScrollPane scrollPane = new JScrollPane( tree );
        add(scrollPane);

        tree.addTreeWillExpandListener( this );

        textField.postActionEvent();
    }
    
     private void addNodes(DefaultMutableTreeNode root, boolean addChildNodes)
    {
        File file = (File)root.getUserObject();
        System.out.println(file);

        if (!file.isDirectory()) return;

        File[] files = file.listFiles(f -> !f.isHidden());

        if (files == null) return;

        int directoryInsert = 0;

        for (int i = 0; i < files.length; i++)
        {
            file = files[i];

            DefaultMutableTreeNode node = new MyDefaultMutableTreeNode( file );

            if (file.isDirectory())
                root.insert(node, directoryInsert++);
            else
                root.insert(node, i);

            if (addChildNodes)
                addNodes(node, false);
        }
    }

    public void treeWillExpand(TreeExpansionEvent e) throws ExpandVetoException
    {
        System.out.println("will expand");
        if (tree.hasBeenExpanded(e.getPath())) return;

        TreePath path = e.getPath();
        System.out.println(path);

        if (path.getPathCount() == 2) return;
        System.out.println(path.getPathCount());

        DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getPathComponent( path.getPathCount() - 1);
        addNodes(node, false);
    }

    public void treeWillCollapse(TreeExpansionEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class MyDefaultMutableTreeNode extends DefaultMutableTreeNode
    {
        public MyDefaultMutableTreeNode(Object node)
        {
            super(node);
        }

        public boolean isLeaf()
        {
            File file = (File)getUserObject();

            return file.isFile();
        }
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
        tree = new javax.swing.JTree();
        textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree);

        textField.setText("jTextField1");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        {
        File file = new File( textField.getText() );

        if (file.exists())
        {
            DefaultMutableTreeNode root = new DefaultMutableTreeNode( file );
            DefaultTreeModel model = new DefaultTreeModel( root );
            addNodes(root, true);
            tree.setModel( model );
        }
    }
    }//GEN-LAST:event_textFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new TreeFileSystem() );
        frame.setSize(300, 400);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textField;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}