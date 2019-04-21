/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngtexteditor.main;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileOutputStream;
import com.ngtexteditor.main.TextEditor;
import java.awt.Frame;
import javax.swing.JTextArea;

/**
 *
 * @author beast
 */
public class SaveAs extends Frame {
    
    
    
    void saveAsFile(JTextArea jTextArea1)
    {
        /*JFileChooser fc=new JFileChooser();
        int option=fc.showSaveDialog(this);
        File f;
        BufferedWriter out;
        if(option==JFileChooser.APPROVE_OPTION)
        {
                try{
                    FileWriter fw=new FileWriter(fc.getSelectedFile().getPath());
                    f=new File(fw.toString());
                    if(f.exists()==true)
                    {
                       int opt=fc.showDialog(jMenu1, "File already exist want to override ? ");
                       if(opt==0)
                       {
                           out=new BufferedWriter(fw);
                           out.write(jTextArea1.getText());
                           out.close();
                       }
                    }
                }catch(Exception e)
                {
                     e.printStackTrace();
                }
        } */
      try{
          System.out.println("Hello from SaveAs");
       FileDialog fg=new FileDialog(this, "Save As",FileDialog.SAVE);
       fg.setVisible(true);
       String s=fg.getFile();

       String s2=fg.getDirectory();
       String s3=s+s2,data;
       data=jTextArea1.getText();
       byte b[]=data.getBytes();
       File f=new File(s3);
       try{
       FileOutputStream fobj=new FileOutputStream(f);
       for(int i=0;i<data.length();i++)
       {
           fobj.write(b[i]);
       }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
      }catch(Exception e)
      {
          e.printStackTrace();
      }
//jf.showSaveDialog(this);
       //File s1=jf.getCurrentDirectory(),s2=jf.;
       
    }
    
}
