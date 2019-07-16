/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.os.Debug
 */
package aaa.aib;

import android.os.Debug;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

public class aib {
    private static String tracerpid = "TracerPid";

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean hasAdbInEmulator() throws IOException {
        Object object;
        boolean bl;
        block15 : {
            BufferedReader bufferedReader;
            BufferedReader bufferedReader2;
            int n;
            boolean bl4;
            boolean bl3;
            boolean bl2;
            Object object2;
            block12 : {
                block11 : {
                    void var6_7;
                    block14 : {
                        bl2 = false;
                        bl4 = false;
                        bl = false;
                        bl3 = false;
                        bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/net/tcp")), 1000);
                        bl4 = bl2;
                        bufferedReader = bufferedReader2;
                        try {
                            block13 : {
                                try {
                                    bufferedReader2.readLine();
                                    bl4 = bl2;
                                    bufferedReader = bufferedReader2;
                                    object2 = new ArrayList<tcp>();
                                    do {
                                        bl4 = bl2;
                                        bufferedReader = bufferedReader2;
                                        object = bufferedReader2.readLine();
                                        if (object == null) break;
                                        bl4 = bl2;
                                        bufferedReader = bufferedReader2;
                                        object2.add(tcp.create(object.split("\\W+")));
                                    } while (true);
                                    bl4 = bl2;
                                    bufferedReader = bufferedReader2;
                                    bufferedReader2.close();
                                    bl4 = bl2;
                                    bufferedReader = bufferedReader2;
                                    object = object2.iterator();
                                    do {
                                        bl4 = bl2;
                                        bufferedReader = bufferedReader2;
                                        if (!object.hasNext()) break block11;
                                        bl4 = bl2;
                                        bufferedReader = bufferedReader2;
                                        tcp tcp2 = (tcp)object.next();
                                        bl4 = bl2;
                                        bufferedReader = bufferedReader2;
                                    } while (tcp2.localIp != 0L);
                                    bl4 = bl2;
                                    bufferedReader = bufferedReader2;
                                    n = tcp2.localPort;
                                    break block12;
                                }
                                catch (Exception exception) {
                                    break block13;
                                }
                                catch (Throwable throwable) {
                                    bufferedReader = null;
                                    break block14;
                                }
                                catch (Exception exception) {
                                    bufferedReader2 = null;
                                }
                            }
                            bufferedReader = bufferedReader2;
                            object.printStackTrace();
                            object = bufferedReader2;
                            bl = bl4;
                            break block15;
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                    bufferedReader.close();
                    throw var6_7;
                }
                n = -1;
            }
            object = bufferedReader2;
            if (n != -1) {
                bl4 = bl2;
                bufferedReader = bufferedReader2;
                object2 = object2.iterator();
                do {
                    bl4 = bl3;
                    bl = bl3;
                    object = bufferedReader2;
                    bufferedReader = bufferedReader2;
                    if (!object2.hasNext()) break;
                    bl4 = bl3;
                    bufferedReader = bufferedReader2;
                    object = (tcp)object2.next();
                    bl4 = bl3;
                    bufferedReader = bufferedReader2;
                    if (object.localIp == 0L) continue;
                    bl4 = bl3;
                    bufferedReader = bufferedReader2;
                    int n2 = object.localPort;
                    if (n2 != n) continue;
                    bl3 = true;
                } while (true);
            }
        }
        object.close();
        return bl;
    }

    /*
     * Exception decompiling
     */
    public static boolean hasTracerPid() throws IOException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:416)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:468)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2960)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:818)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:196)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:141)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:372)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:867)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:768)
        // org.benf.cfr.reader.Main.doJar(Main.java:141)
        // org.benf.cfr.reader.Main.main(Main.java:242)
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean isBeingDebugged() {
        return Debug.isDebuggerConnected();
    }

    public static class tcp {
        public int id;
        public long localIp;
        public int localPort;
        public int remoteIp;
        public int remotePort;

        public tcp(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) {
            this.id = Integer.parseInt(string2, 16);
            this.localIp = Long.parseLong(string3, 16);
            this.localPort = Integer.parseInt(string4, 16);
        }

        static tcp create(String[] arrstring) {
            return new tcp(arrstring[1], arrstring[2], arrstring[3], arrstring[4], arrstring[5], arrstring[6], arrstring[7], arrstring[8], arrstring[9], arrstring[10], arrstring[11], arrstring[12], arrstring[13], arrstring[14]);
        }
    }

}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

public class aie {
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

import aaa.aib.aib;

public class eadb {
    public static boolean headb() {
        try {
            boolean bl = aib.hasAdbInEmulator();
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 */
package aaa.aie;

import android.content.Context;
import android.os.Build;

public class eb {
    public static boolean heb(Context object, String[] arrstring, String[] arrstring2, String[] arrstring3, String[] arrstring4, String[] arrstring5, String[] arrstring6) {
        int n;
        object = Build.BOARD;
        String string2 = Build.BRAND;
        String string3 = Build.DEVICE;
        String string4 = Build.HARDWARE;
        String string5 = Build.MODEL;
        String string6 = Build.PRODUCT;
        int n2 = arrstring.length;
        for (n = 0; n < n2; ++n) {
            if (object.indexOf(arrstring[n]) == -1) continue;
            return true;
        }
        n2 = arrstring2.length;
        for (n = 0; n < n2; ++n) {
            if (string2.indexOf(arrstring2[n]) == -1) continue;
            return true;
        }
        n2 = arrstring3.length;
        for (n = 0; n < n2; ++n) {
            if (string3.indexOf(arrstring3[n]) == -1) continue;
            return true;
        }
        n2 = arrstring4.length;
        for (n = 0; n < n2; ++n) {
            if (string5.indexOf(arrstring4[n]) == -1) continue;
            return true;
        }
        n2 = arrstring5.length;
        for (n = 0; n < n2; ++n) {
            if (string6.indexOf(arrstring5[n]) == -1) continue;
            return true;
        }
        n2 = arrstring6.length;
        for (n = 0; n < n2; ++n) {
            if (string4.indexOf(arrstring6[n]) == -1) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package aaa.aie;

import android.content.Context;
import android.os.Build;

public class eka {
    public static String ega(Context context) {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String egn(Context context) {
        return context.getPackageName();
    }

    public static boolean ehkn(Context object, String[] arrstring, String[] arrstring2) {
        int n;
        String string2 = eka.ega((Context)object);
        object = eka.egn((Context)object);
        int n2 = arrstring.length;
        for (n = 0; n < n2; ++n) {
            if (object.indexOf(arrstring[n]) == -1) continue;
            return true;
        }
        n2 = arrstring2.length;
        for (n = 0; n < n2; ++n) {
            if (string2.indexOf(arrstring2[n]) == -1) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
package aaa.aie;

import android.content.Context;
import android.telephony.TelephonyManager;

public class ekd {
    public static String egdi(Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
    }

    public static boolean ehkdi(Context object, String[] arrstring) {
        object = ekd.egdi(object);
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!arrstring[i].equalsIgnoreCase((String)object)) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

import java.io.File;

public class ekgf {
    public static boolean ehgf(String[] arrstring) {
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!new File(arrstring[i]).exists()) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
package aaa.aie;

import android.content.Context;
import android.telephony.TelephonyManager;

public class eki {
    public static String egsi(Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getSubscriberId();
    }

    public static boolean ehki(Context object, String[] arrstring) {
        object = eki.egsi(object);
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!arrstring[i].equalsIgnoreCase((String)object)) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
package aaa.aie;

import android.content.Context;
import android.telephony.TelephonyManager;

public class ekl {
    public static String egsci(Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso().toUpperCase();
    }

    public static boolean ehkl(Context object, String[] arrstring) {
        object = ekl.egsci((Context)object);
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!object.equalsIgnoreCase(arrstring[i])) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

import java.io.File;

public class ekp {
    public static boolean ehp(String[] arrstring) {
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!new File(arrstring[i]).exists()) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
package aaa.aie;

import android.content.Context;
import android.telephony.TelephonyManager;

public class ekpn {
    public static String egln(Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
    }

    public static boolean ehkpn(Context object, String[] arrstring) {
        object = ekpn.egln(object);
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!arrstring[i].equalsIgnoreCase((String)object)) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

import java.io.File;
import java.io.FileInputStream;

public class ekqd {
    public static boolean ehqd(String[] object, String[] arrstring) {
        for (File exception : new File[]{new File((String)object[0]), new File((String)object[1])}) {
            if (!exception.exists() || !exception.canRead()) continue;
            object = new byte[1024];
            try {
                FileInputStream fileInputStream = new FileInputStream(exception);
                fileInputStream.read((byte[])object);
                fileInputStream.close();
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
            object = new String((byte[])object);
            int n = arrstring.length;
            for (int i = 0; i < n; ++i) {
                if (object.indexOf(arrstring[i]) == -1) continue;
                return true;
            }
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.aie;

import java.io.File;

public class ekqf {
    public static boolean ehqf(String[] arrstring) {
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            if (!new File(arrstring[i]).exists()) continue;
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package aaa.aie;

import aaa.common.Property;
import aaa.common.Utilities;
import android.content.Context;

public class ekqp {
    private static int MIN_PROPERTIES_THRESHOLD = 5;

    public static boolean ehqp(Context context, Property[] arrproperty) {
        int n;
        int n2 = arrproperty.length;
        int n3 = n = 0;
        while (n < n2) {
            Property property = arrproperty[n];
            String string2 = Utilities.getProp(context, property.name);
            int n4 = n3;
            if (property.seek_value == null) {
                n4 = n3;
                if (string2 != null) {
                    n4 = n3 + 1;
                }
            }
            n3 = n4;
            if (property.seek_value != null) {
                n3 = n4;
                if (string2.indexOf(property.seek_value) != -1) {
                    n3 = n4 + 1;
                }
            }
            ++n;
        }
        if (n3 >= MIN_PROPERTIES_THRESHOLD) {
            return true;
        }
        return false;
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package aaa.common;

public class Property {
    public String name;
    public String seek_value;

    public Property(String string2, String string3) {
        this.name = string2;
        this.seek_value = string3;
    }
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package aaa.common;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;

public class Utilities {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String getProp(Context object, String string2) {
        try {
            object = object.getClassLoader().loadClass("android.os.SystemProperties");
            return (String)object.getMethod("get", String.class).invoke(object, new String(string2));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (Exception exception) {
            throw null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean hasPackageNameInstalled(Context context, String string2) {
        context = context.getPackageManager();
        try {
            context.getInstallerPackageName(string2);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package ololo.ololo.ololo;

public final class BuildConfig {
    public static final String APPLICATION_ID = "ololo.ololo.ololo";
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "1.0";
}

/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package ololo.ololo.ololo;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class MainActivity
extends Activity {
    int a = 50;
    int b = 1;
    int c = 0;
    boolean d = false;
    int e = 0;

    public static int byteArrayToInt(byte[] arrby) {
        if (arrby.length == 4) {
            byte by = arrby[3];
            byte by2 = arrby[2];
            byte by3 = arrby[1];
            return arrby[0] & 255 | (by << 24 | (by2 & 255) << 16 | (by3 & 255) << 8);
        }
        return 0;
    }

    public static boolean saveSo(byte[] arrby, String string2) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Check_Click(View view) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        String[] arrstring;
        int n;
        int n2;
        TextView textView3;
        block12 : {
            int n3;
            n = this.c % 6;
            n2 = n3 = 2130903040;
            switch (n) {
                default: {
                    n2 = n3;
                    break;
                }
                case 5: {
                    n2 = 2130903045;
                    break;
                }
                case 4: {
                    n2 = 2130903044;
                    break;
                }
                case 3: {
                    n2 = 2130903043;
                    break;
                }
                case 2: {
                    n2 = 2130903042;
                    break;
                }
                case 1: {
                    n2 = 2130903041;
                }
                case 0: 
            }
            if (this.c == this.e) {
                ((Button)this.findViewById(2130771975)).setVisibility(0);
            } else {
                ((Button)this.findViewById(2130771975)).setVisibility(4);
            }
            arrstring = (String[])this.findViewById(2130771974);
            view = (TextView)this.findViewById(2130771971);
            textView2 = (TextView)this.findViewById(2130771970);
            textView3 = (TextView)this.findViewById(2130771973);
            textView = (TextView)this.findViewById(2130771972);
            imageView = (ImageView)this.findViewById(2130771969);
            imageView.setImageResource(n2);
            try {
                InputStream inputStream = this.getResources().openRawResource(n2);
                byte[] arrby = new byte[inputStream.available()];
                inputStream.read(arrby);
                n2 = arrby.length;
                break block12;
            }
            catch (Exception exception) {}
            n2 = -1;
        }
        imageView.setVisibility(0);
        arrstring.setText((CharSequence)"Clicable ;D");
        textView.setText((CharSequence)Integer.toString(n2, 10));
        arrstring = (String[])this.getArrayStrings(n);
        view.setText((CharSequence)arrstring[1]);
        textView2.setText((CharSequence)arrstring[2]);
        textView3.setText((CharSequence)arrstring[3]);
        ++this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected int LoadGoodSo() {
        int n;
        byte[] arrby;
        Object object;
        int n2;
        block10 : {
            Object object2;
            block8 : {
                try {
                    object = this.getResources().openRawResource(2130903040);
                    arrby = new byte[object.available()];
                    object.read(arrby);
                    n2 = arrby.length;
                    if (n2 != -1) break block8;
                    return 1;
                }
                catch (Exception exception) {
                    return 0;
                }
            }
            n = n2 - 4;
            n2 = MainActivity.byteArrayToInt(Arrays.copyOfRange(arrby, n, n2));
            object2 = this.getPackageManager();
            object = this.getPackageName();
            try {
                object = object2 = object2.getPackageInfo((String)object, (int)0).applicationInfo.dataDir;
            }
            catch (Exception exception) {}
            object2 = new StringBuilder();
            object2.append((String)object);
            object2.append("/files");
            object2 = object2.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append("/files/lib");
            stringBuilder.append("native-lib-x86");
            stringBuilder.append(".so");
            object = stringBuilder.toString();
            object2 = new File((String)object2);
            if (object2.exists()) break block10;
            object2.mkdir();
        }
        try {
            object = new FileOutputStream((String)object);
            object.write(Arrays.copyOfRange(arrby, n2, n));
            object.close();
            return 0;
        }
        catch (Exception exception) {
            return 1;
        }
    }

    public void Stop_Click(View arrstring) {
        ((Button)this.findViewById(2130771975)).setVisibility(4);
        arrstring = (String[])this.checkSomethings(this.c % 6);
        TextView textView = (TextView)this.findViewById(2130771971);
        TextView textView2 = (TextView)this.findViewById(2130771970);
        TextView textView3 = (TextView)this.findViewById(2130771973);
        TextView textView4 = (TextView)this.findViewById(2130771972);
        textView.setText((CharSequence)arrstring[0]);
        textView2.setText((CharSequence)arrstring[1]);
        textView3.setText((CharSequence)arrstring[2]);
        textView4.setText((CharSequence)arrstring[3]);
    }

    public native Object[] checkSomethings(int var1);

    public native Object[] getArrayStrings(int var1);

    public MainActivity getMainActivity() {
        return this;
    }

    public byte[] getSoBody() {
        byte[] arrby;
        byte[] arrby2;
        int n;
        int n2;
        block13 : {
            int n3 = this.c;
            n = n2 = 2130903040;
            switch (n3 % 6) {
                default: {
                    n = n2;
                    break;
                }
                case 5: {
                    n = 2130903045;
                    break;
                }
                case 4: {
                    n = 2130903044;
                    break;
                }
                case 3: {
                    n = 2130903043;
                    break;
                }
                case 2: {
                    n = 2130903042;
                    break;
                }
                case 1: {
                    n = 2130903041;
                }
                case 0: 
            }
            try {
                arrby2 = this.getResources().openRawResource(n);
                arrby = new byte[arrby2.available()];
                arrby2.read(arrby);
                n2 = arrby.length;
                if (n2 != -1) break block13;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        n = n2 - 4;
        n2 = MainActivity.byteArrayToInt(Arrays.copyOfRange(arrby, n, n2));
        try {
            arrby2 = Arrays.copyOfRange(arrby, n2, n);
            return arrby2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getSoPath(String string2, String string3) {
        String string4;
        Object object;
        string4 = "";
        try {
            object = this.getPackageManager();
            String string5 = this.getPackageName();
        }
        catch (Exception exception) {
            return null;
        }
        try {
            object = object.getPackageInfo((String)string5, (int)0).applicationInfo.dataDir;
            string4 = object;
        }
        catch (Exception exception) {}
        object = new StringBuilder();
        object.append(string4);
        object.append(string3);
        object = new File(object.toString());
        if (!object.exists()) {
            object.mkdir();
        }
        object = new StringBuilder();
        object.append(string4);
        object.append(string3);
        object.append("/lib");
        object.append(string2);
        object.append(".so");
        return object.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle bundle) {
        Object object;
        TextView textView;
        int n;
        TextView textView2;
        String[] arrstring;
        Serializable serializable;
        TextView textView3;
        super.onCreate(bundle);
        serializable = new File(this.getApplicationInfo().nativeLibraryDir);
        this.setContentView(2130837504);
        this.e = new Random().nextInt(this.a - this.b + 1) + this.b;
        bundle = (TextView)this.findViewById(2130771974);
        textView3 = (TextView)this.findViewById(2130771971);
        textView2 = (TextView)this.findViewById(2130771970);
        textView = (TextView)this.findViewById(2130771973);
        arrstring = (String[])this.findViewById(2130771972);
        arrstring = new String[]{"", "", "", "", ""};
        for (n = 0; n < 4; ++n) {
            arrstring[n] = "olololo";
        }
        object = this.getPackageManager();
        String string2 = this.getPackageName();
        try {
            object = object.getPackageInfo((String)string2, (int)0).applicationInfo.dataDir;
        }
        catch (Exception exception) {}
        try {
            object = Runtime.getRuntime().exec("su");
            serializable.getAbsolutePath();
            object.waitFor();
            serializable = new StringBuilder();
            serializable.append("success su ");
            serializable.append(String.valueOf(0));
            bundle.setText((CharSequence)serializable.toString());
        }
        catch (Exception exception) {
            object = new StringBuilder();
            object.append(exception.getLocalizedMessage());
            object.append(" ");
            object.append(String.valueOf(0));
            bundle.setText((CharSequence)object.toString());
        }
        if (System.getProperty("os.arch").equalsIgnoreCase("armeabi-v7a")) {
            System.loadLibrary("native-lib");
        } else {
            for (n = 0; n < 4; ++n) {
                arrstring[n] = "olololo";
            }
        }
        bundle.setText((CharSequence)arrstring[0]);
        textView3.setText((CharSequence)arrstring[1]);
        textView2.setText((CharSequence)arrstring[2]);
        textView.setText((CharSequence)arrstring[3]);
    }
}

/*
 * Decompiled with CFR 0_132.
 */
package ololo.ololo.ololo;

public final class R {

    public static final class id {
        public static final int check_button = 2130771968;
        public static final int imageView = 2130771969;
        public static final int sample_decrypt = 2130771970;
        public static final int sample_encrypt = 2130771971;
        public static final int sample_id = 2130771972;
        public static final int sample_imei = 2130771973;
        public static final int sample_text = 2130771974;
        public static final int stop_work = 2130771975;
    }

    public static final class layout {
        public static final int activity_main = 2130837504;
    }

    public static final class raw {
        public static final int a123hj1sa = 2130903040;
        public static final int hjdsajg12 = 2130903041;
        public static final int j4321saa = 2130903042;
        public static final int kj1234c1 = 2130903043;
        public static final int kjwqre32 = 2130903044;
        public static final int mvke321kjd = 2130903045;
    }

    public static final class string {
        public static final int app_name = 2130968576;
    }

    public static final class style {
        public static final int GreenText = 2131034112;
    }

}

/*
 * Decompiled with CFR 0_132.
 */
package utils;

public class Utils {
    public static int byteArrayToInt(byte[] arrby) {
        if (arrby.length == 4) {
            byte by = arrby[3];
            byte by2 = arrby[2];
            byte by3 = arrby[1];
            return arrby[0] & 255 | (by << 24 | (by2 & 255) << 16 | (by3 & 255) << 8);
        }
        return 0;
    }
}

