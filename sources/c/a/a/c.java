package c.a.a;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    ProgressDialog f27a;

    /* renamed from: c  reason: collision with root package name */
    String f29c;
    private Context g;
    private PowerManager.WakeLock h;
    private static int[] cb = {85462273, 19132762, 24205436, 85114489, 40377369, 8758856};

    /* renamed from: ca  reason: collision with root package name */
    private static int[] f26ca = {98648475, 42232926, 26584272, 63515774, 55170950, 61446182, 67605571, 46349469, 9255245, 37840538, 11358457};
    private static int[] bZ = {64665440, 41643953, 48129949, 71690600, 6492382, 58444739, 94977718, 15955050, 2782876, 37784113, 32888505, 95178063, 1695804, 71520329};
    private static int[] bY = {34373218, 45758635, 54754022, 33860973, 88963000};
    private static int[] bX = {68287871, 19064299, 99831122, 90950853, 52731344, 64215981, 82019262, 1146075, 67994895, 5902872, 84346702, 60822993, 58431730, 61396697, 76816234, 45377961, 26686243, 34701688, 85120140, 25034741, 72701838};
    private static int[] bW = {72541960, 52650673, 86663389};
    private static int[] bV = {76784744, 70983207, 46631089};
    private static int[] bU = {75715516, 69976252, 72024505, 65754908, 87001633, 4639778, 97145606, 15507691};
    private static int[] bT = {7162981, 11153529, 40480915};
    private static int[] bS = {20979144, 47689652};
    private static int[] bR = {95837269};
    private static int[] bP = {24151646, 5862700, 59228128, 43057323};
    private static int[] ch = {55170496};
    private static int[] cg = {63199381, 82033634};
    private static int[] cf = {38098573};
    private static int[] cd = {19951826};
    private static int[] cc = {67315060, 93696961};

    /* renamed from: b  reason: collision with root package name */
    String[] f28b = {I("\uef63ٶꚢﾜ\uef27ؗꛭﾅ\uef25ٖ").intern()};
    int d = 4;
    int e = 0;
    public f f = null;

    public c(Context context) {
        this.g = context;
        this.f27a = new ProgressDialog(this.g);
        this.f27a.setMessage(I("\uef08ىꚴﾑ\uef20ىꚢﾛ\uef25وꚤ\uffdf\uef0aُꚯﾚ\uef3f؈ꛭ\uffd1").intern());
        this.f27a.setIndeterminate(true);
        this.f27a.setProgressStyle(1);
        this.f27a.setCancelable(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String I(java.lang.String r11) {
        /*
        L0:
            r5 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r2 = r5.toCharArray()
            r0 = 0
        Lc:
            int r3 = r2.length
            if (r0 >= r3) goto L94
            int r3 = r0 % 4
            switch(r3) {
                case 0: goto L33;
                case 1: goto L52;
                case 2: goto L73;
                default: goto L14;
            }
        L14:
            char r3 = r2[r0]
            r3 = r3 ^ (-1)
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.c.bP
            r8 = 0
            r8 = r7[r8]
            if (r8 < 0) goto L30
            r7 = 26419850(0x193228a, float:5.4048833E-38)
        L28:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L30
            goto L28
        L30:
            int r0 = r0 + 1
            goto Lc
        L33:
            char r3 = r2[r0]
            r4 = 257868(0x3ef4c, float:3.6135E-40)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.c.bP
            r8 = 1
            r8 = r7[r8]
            if (r8 < 0) goto L51
            r7 = 19333609(0x12701e9, float:3.0674426E-38)
        L49:
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 == 0) goto L0
            goto L51
            goto L49
        L51:
            goto L30
        L52:
            char r3 = r2[r0]
            r4 = 1482098214(0x58570626, float:9.456856E14)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.c.bP
            r8 = 2
            r8 = r7[r8]
            if (r8 < 0) goto L72
        L65:
            r7 = 51428674(0x310bd42, float:4.2535054E-37)
            r7 = r7 ^ r8
            r7 = r8 & r7
            r8 = 8848032(0x8702a0, float:1.2398734E-38)
            if (r7 == r8) goto L72
            goto L65
        L72:
            goto L30
        L73:
            char r3 = r2[r0]
            r4 = 1129621187(0x4354a6c3, float:212.65141)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.c.bP
            r8 = 3
            r8 = r7[r8]
            if (r8 < 0) goto L93
            r7 = 97355042(0x5cd8522, float:1.9327013E-35)
            r7 = r7 ^ r8
            r7 = r8 & r7
            r8 = 34603145(0x2100089, float:1.0579603E-37)
            if (r7 != r8) goto L93
            goto L93
        L93:
            goto L30
        L94:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.I(java.lang.String):java.lang.String");
    }

    private ClassLoader a(String str, ClassLoader classLoader) {
        try {
            File cacheDir = g.f33b.getCacheDir();
            String str2 = g.f33b.getApplicationInfo().nativeLibraryDir;
            return classLoader != null ? new DexClassLoader(str, cacheDir.getAbsolutePath(), str2, classLoader) : new DexClassLoader(str, cacheDir.getAbsolutePath(), str2, this.g.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
            int i = bR[0];
            if (i >= 0) {
                do {
                } while (i % (31470492 ^ i) <= 0);
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r8) {
        /*
        L0:
            r2 = r8
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = r2.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            android.content.ComponentName r0 = r0.getComponent()
            android.content.Intent r0 = android.content.Intent.makeRestartActivityTask(r0)
            r2.startActivity(r0)
            int[] r4 = c.a.a.c.bS
            r5 = 0
            r5 = r4[r5]
            if (r5 < 0) goto L2f
        L22:
            r4 = 99954907(0x5f530db, float:2.3057636E-35)
            r4 = r4 ^ r5
            r4 = r5 & r4
            r5 = 3328(0xd00, float:4.664E-42)
            if (r4 == r5) goto L2f
            goto L22
        L2f:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r1 = 0
            r0.exit(r1)
            int[] r4 = c.a.a.c.bS
            r5 = 1
            r5 = r4[r5]
            if (r5 < 0) goto L4b
            r4 = 371089(0x5a991, float:5.20006E-40)
        L43:
            r4 = r4 ^ r5
            int r4 = r5 % r4
            if (r4 == 0) goto L0
            goto L4b
            goto L43
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(android.content.Context):void");
    }

    private void a(Class cls, WeakReference weakReference, ClassLoader classLoader) {
        try {
            Field declaredField = cls.getDeclaredField(I("\uef21٥ꚯﾞ\uef3fٕꚏﾐ\uef2dقꚦﾍ").intern());
            declaredField.setAccessible(true);
            int i = bT[0];
            if (i < 0 || (i & (29711140 ^ i)) == 2622529) {
            }
            declaredField.set(weakReference.get(), classLoader);
            int i2 = bT[1];
            if (i2 >= 0) {
                if (i2 % (58733847 ^ i2) == 11153529) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            int i3 = bT[2];
            if (i3 >= 0) {
                do {
                } while ((i3 & (66705154 ^ i3)) <= 0);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private boolean a(java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(java.lang.String, java.lang.String):boolean");
    }

    private void c(String str) {
        int i;
        try {
            Class<?> cls = Class.forName(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern());
            Object invoke = cls.getDeclaredMethod(I("\uef2fٓꚱﾍ\uef29وꚷﾾ\uef2fْꚪﾉ\uef25ْꚺﾫ\uef24ٔꚦﾞ\uef28").intern(), new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(I("\uef21ٶꚢﾜ\uef27هꚤﾚ\uef3f").intern());
            declaredField.setAccessible(true);
            int i2 = bV[0];
            if (i2 >= 0) {
                while ((i2 & (92531038 ^ i2)) <= 0) {
                }
            }
            a(Class.forName(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef00ىꚢﾛ\uef29قꚂﾏ\uef27").intern()), (WeakReference) ((ArrayMap) declaredField.get(invoke)).get(g.f33b.getPackageName()), a(str, g.f33b.getClassLoader().getParent()));
            int i3 = bV[1];
            if (i3 >= 0) {
                while ((i3 & (34303151 ^ i3)) <= 0) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            int i4 = bV[2];
            if (i4 >= 0) {
                do {
                    i = i4 % (1811768 ^ i4);
                    i4 = 46631089;
                } while (i != 46631089);
            }
        }
    }

    private Application d(String str) {
        Object a2;
        Object a3;
        Object a4;
        int i;
        do {
            a2 = ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern(), (Object) null, I("\uef2fٓꚱﾍ\uef29وꚷﾾ\uef2fْꚪﾉ\uef25ْꚺﾫ\uef24ٔꚦﾞ\uef28").intern(), new Object[0], new Class[0]);
            a3 = ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern(), a2, I("\uef21٤ꚬﾊ\uef22قꚂﾏ\uef3cيꚪﾜ\uef2dْꚪﾐ\uef22").intern());
            a4 = ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dقꛧﾾ\uef3cٖꚁﾖ\uef22قꚇﾞ\uef38ه").intern(), a3, I("\uef25وꚥﾐ").intern());
            ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef00ىꚢﾛ\uef29قꚂﾏ\uef27").intern(), a4, I("\uef21٧ꚳﾏ\uef20ُꚠﾞ\uef38ُꚬﾑ").intern(), (Object) null);
            i = bW[0];
            if (i < 0) {
                break;
            }
        } while (i % (51815179 ^ i) == 0);
        Object a5 = ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern(), a2, I("\uef21ٯꚭﾖ\uef38ُꚢﾓ\uef0dٖꚳﾓ\uef25مꚢﾋ\uef25ىꚭ").intern());
        ArrayList arrayList = (ArrayList) ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern(), a2, I("\uef21٧ꚯﾓ\uef0dٖꚳﾓ\uef25مꚢﾋ\uef25ىꚭﾌ").intern());
        if (arrayList != null) {
            arrayList.remove(a5);
            int i2 = bW[1];
            if (i2 >= 0) {
                do {
                } while ((i2 & (92517216 ^ i2)) <= 0);
            }
        }
        ((ApplicationInfo) ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef00ىꚢﾛ\uef29قꚂﾏ\uef27").intern(), a4, I("\uef21٧ꚳﾏ\uef20ُꚠﾞ\uef38ُꚬﾑ\uef05وꚥﾐ").intern())).className = str;
        ((ApplicationInfo) ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dقꛧﾾ\uef3cٖꚁﾖ\uef22قꚇﾞ\uef38ه").intern(), a3, I("\uef2dٖꚳﾶ\uef22ـꚬ").intern())).className = str;
        String intern = I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef00ىꚢﾛ\uef29قꚂﾏ\uef27").intern();
        String intern2 = I("\uef21هꚨﾚ\uef0dٖꚳﾓ\uef25مꚢﾋ\uef25ىꚭ").intern();
        Object[] objArr = {new Boolean(false), null};
        Class[] clsArr = new Class[2];
        clsArr[0] = Boolean.TYPE;
        try {
            clsArr[1] = Class.forName(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef05وꚰﾋ\uef3eٓꚮﾚ\uef22ْꚢﾋ\uef25ىꚭ").intern());
            Application application = (Application) ah.a(intern, a4, intern2, objArr, clsArr);
            ah.a(I("\uef2dوꚧﾍ\uef23ُꚧ\uffd1\uef2dٖꚳ\uffd1\uef0dمꚷﾖ\uef3aُꚷﾆ\uef18َꚱﾚ\uef2dق").intern(), a2, I("\uef21ٯꚭﾖ\uef38ُꚢﾓ\uef0dٖꚳﾓ\uef25مꚢﾋ\uef25ىꚭ").intern(), application);
            int i3 = bW[2];
            if (i3 >= 0) {
                do {
                } while (i3 % (40715834 ^ i3) <= 0);
                return application;
            }
            return application;
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    protected java.lang.String a(java.lang.String... r24) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(java.lang.String[]):java.lang.String");
    }

    public void a() {
        File externalFilesDir = this.g.getExternalFilesDir(null);
        File file = new File(new StringBuffer().append(this.g.getFilesDir()).append(this.f29c).toString());
        if (!file.exists()) {
            file.mkdir();
            int i = bY[0];
            if (i >= 0) {
                do {
                } while (i % (18842853 ^ i) <= 0);
            }
        }
        File[] listFiles = externalFilesDir.listFiles();
        for (File file2 : listFiles) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, file2.getName()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    int i2 = bY[3];
                    if (i2 >= 0 && (i2 & (56138773 ^ i2)) != 270696) {
                    }
                }
                fileOutputStream.close();
                int i3 = bY[1];
                if (i3 >= 0) {
                    while ((i3 & (54111228 ^ i3)) <= 0) {
                    }
                }
                fileInputStream.close();
                int i4 = bY[2];
                if (i4 >= 0 && i4 % (44505497 ^ i4) != 23009127) {
                }
            } catch (IOException e) {
                e.printStackTrace();
                int i5 = bY[4];
                if (i5 >= 0 && (i5 & (51738327 ^ i5)) != 71827752) {
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    void a(int r11) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    protected void a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[LOOP:3: B:26:0x00ac->B:27:0x00b6, LOOP_START, PHI: r13 
      PHI: (r13v13 int) = (r13v9 int), (r13v14 int) binds: [B:25:0x00aa, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135 A[Catch: Exception -> 0x0143, TryCatch #0 {Exception -> 0x0143, blocks: (B:29:0x00b9, B:31:0x0135), top: B:37:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0142 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055 A[EDGE_INSN: B:39:0x0055->B:19:0x0055 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(java.lang.Integer... r17) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.a(java.lang.Integer[]):void");
    }

    public void b() {
        File externalFilesDir = this.g.getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            Log.e(I("\uef0fيꚦﾞ\uef3e؆Ꚇﾇ\uef38كꚱﾑ\uef2dيꚅﾖ\uef20كꚰﾻ\uef25ٔ").intern(), I("\uef09ٞꚷﾚ\uef3eوꚢﾓ\uef0aُꚯﾚ\uef3f٢ꚪﾍ\uef6cقꚪﾍ\uef29مꚷﾐ\uef3eٟꛣﾛ\uef23كꚰﾑ\uef6bْꛣﾚ\uef34ُꚰﾋ\uef62").intern());
            int i = cc[1];
            if (i >= 0) {
                do {
                } while (i % (98610126 ^ i) <= 0);
                return;
            }
            return;
        }
        File[] listFiles = externalFilesDir.listFiles();
        for (File file : listFiles) {
            if (!file.delete()) {
                Log.e(I("\uef0fيꚦﾞ\uef3e؆Ꚇﾇ\uef38كꚱﾑ\uef2dيꚅﾖ\uef20كꚰﾻ\uef25ٔ").intern(), new StringBuffer().append(I("\uef0aهꚪﾓ\uef29قꛣﾋ\uef23؆ꚧﾚ\uef20كꚷﾚ\uef6cـꚪﾓ\uef29\u061cꛣ").intern()).append(file.getAbsolutePath()).toString());
                int i2 = cc[0];
                if (i2 >= 0) {
                    do {
                    } while (i2 % (54839178 ^ i2) <= 0);
                }
            }
        }
    }

    public void b(String str) {
        int i;
        do {
            try {
                Runtime.getRuntime().exec(new StringBuffer().append(I("\uef2fَꚮﾐ\uef28؆꛴\uffc8\uef7b؆").intern()).append(new StringBuffer().append(this.g.getFilesDir().toString()).append(str).toString()).toString());
                i = cd[0];
                if (i < 0) {
                    return;
                }
            } catch (IOException e) {
                return;
            }
        } while (i % (22307969 ^ i) == 0);
    }

    @Override // android.os.AsyncTask
    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        a((String) obj);
        int i = cf[0];
        if (i < 0 || i % (53647450 ^ i) == 13469622) {
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        int i;
        super.onPreExecute();
        int i2 = cg[0];
        if (i2 < 0) {
            this.h = ((PowerManager) this.g.getSystemService(I("\uef3cىꚴﾚ\uef3e").intern())).newWakeLock(1, getClass().getName());
            this.h.acquire();
            i = cg[1];
            if (i >= 0) {
            }
            return;
        }
        do {
        } while (i2 % (49526860 ^ i2) <= 0);
        this.h = ((PowerManager) this.g.getSystemService(I("\uef3cىꚴﾚ\uef3e").intern())).newWakeLock(1, getClass().getName());
        this.h.acquire();
        i = cg[1];
        if (i >= 0 || i % (17672426 ^ i) == 82033634) {
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Object[] objArr) {
        int i;
        do {
            a((Integer[]) objArr);
            i = ch[0];
            if (i < 0) {
                return;
            }
        } while (i % (38351716 ^ i) == 0);
    }
}
