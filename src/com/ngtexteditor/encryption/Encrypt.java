package com.ngtexteditor.encryption;

//data encrpytion standard
//code for encrypting information
import com.ngtexteditor.main.TextEditor;
import com.ngtexteditor.decryption.Decrypt;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.swing.JOptionPane;
public class Encrypt extends TextEditor
{
      String strz;
      void vault(int flag)
      {     
                String str=jTextArea1.getText();
                KeyGenerator keygen=null;
                Key key=null;
                Cipher ciph=null;
                byte[] cipherText=null;
                try{
                        keygen=KeyGenerator.getInstance("DES");
                        keygen.init(56);
                        key=keygen.generateKey();
                        ciph=Cipher.getInstance("DES/ECB/PKCS5Padding");
                        ciph.init(Cipher.ENCRYPT_MODE,key);
                        byte[] userByte=str.getBytes("UTF8");
                        cipherText=ciph.doFinal(userByte);
                        System.out.println((new String(cipherText,"UTF8")));
                        jTextArea1.setText((new String(cipherText,"UTF8")));
                        strz=new String(cipherText,"UTF8");
                    // write above encrypted text in the file... 
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                         if(flag==1)
                        {
                            Decrypt dc=new Decrypt();
                            dc.decrypt(key,ciph,cipherText);
                            //dc.decrypt();
                        }
                JOptionPane.showMessageDialog(null,strz);
        }
    /*void secure()
        {
          //encryption begins 
            try{
               String fetch=jTextArea1.getText();//.jTextArea1.getText();
                byte[] b=fetch.getBytes("UTF8");
            KeyGenerator keygen=KeyGenerator.getInstance("DES");
            keygen.init(56);
            Cipher c=Cipher.getInstance("DES/ECB/PKCS5Padding");
            Key key=keygen.generateKey();
            System.out.println("encryption begins");
            c.init(Cipher.ENCRYPT_MODE,key);
            
            byte[] cipherText=c.doFinal(b);
            System.out.println("Finish encryption");
            System.out.println(new String(cipherText,"UTF8"));
            //decryption method
            System.out.println("Decrpyption begins");
            c.init(Cipher.DECRYPT_MODE,key);
            byte[] DecipherText=c.doFinal(cipherText);
            System.out.println("Finish decryption");
            System.out.println(new String(DecipherText,"UTF8"));
               }catch(Exception e)
               {
                 e.printStackTrace();   
               }
        }*/
       
}