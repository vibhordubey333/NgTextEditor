
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.swing.JOptionPane;
public class Decrypt extends TextEditor{
   
    //public void decrypt()
    byte[] DecipherText;
    String str;
    public void decrypt(Key key,Cipher ciph,byte[] cipherText)
    {
      try{
      ciph.init(Cipher.DECRYPT_MODE,key);
      byte[] DecipherText=ciph.doFinal(cipherText);
      System.out.println(new String(DecipherText,"UTF8"));
      str=new String(DecipherText,"UTF8");
    }catch(Exception e)
    {
      e.printStackTrace();
    }
        JOptionPane.showMessageDialog(null,str);
  }
}
