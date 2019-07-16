import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.KeySpec;

public class hm {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
    try {
    String paramString1 =  "55bbc19a737d5f93e5ce09424a1b1b8a";
    String paramString2 = "IMG_20180101_071505.jpg";
    Object localObject1 = new FileInputStream(paramString2+".salt");
    Object localObject2 = new byte[8];
    ((FileInputStream)localObject1).read((byte[])localObject2);
    ((FileInputStream)localObject1).close();
    Object localObject3 = new FileInputStream(paramString2 + ".iv");
    localObject1 = new byte[16];
    ((FileInputStream)localObject3).read((byte[])localObject1);
    ((FileInputStream)localObject3).close();
    localObject2 = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(paramString1.toCharArray(), (byte[])localObject2, 65536, 256)).getEncoded(), "AES");
    Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher1.init(2, (Key)localObject2, new IvParameterSpec((byte[])localObject1));
    localObject1 = new FileInputStream(paramString2+".xxx");
    FileOutputStream p4 = new FileOutputStream(paramString2 + ".decrypted");
    localObject2 = new byte[64];
    for (;;)
    {
      int i = ((FileInputStream)localObject1).read((byte[])localObject2);
      if (i == -1) {
        break;
      }
      localObject3 = cipher1.update((byte[])localObject2, 0, i);
      if (localObject3 != null) {
        p4.write((byte[])localObject3);
      }
    }
    byte[] cip = cipher1.doFinal();
    if (cip != null) {
      p4.write(cip);
    }
    p4.close();
    p4.flush();
    p4.close();
    }
 
    catch (Exception e) {
        e.printStackTrace();
    }
}
}

