package c.a.a;

import android.content.Context;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f30a;
    private static int[] aM = {72225608};
    private static int[] aL = {45952471, 2835215, 82142303, 43507774};

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar) {
        this.f30a = cVar;
    }

    private static String x(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            switch (i2 % 4) {
                case 0:
                    sb.append((char) (charArray[i2] ^ 29430));
                    int i3 = aL[1];
                    if (i3 >= 0) {
                        do {
                        } while ((i3 & (33876538 ^ i3)) <= 0);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    sb.append((char) (charArray[i2] ^ 2668));
                    int i4 = aL[2];
                    if (i4 >= 0) {
                        do {
                            i = i4 & (89698133 ^ i4);
                            i4 = 10829834;
                        } while (i != 10829834);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    sb.append((char) (charArray[i2] ^ 53197));
                    int i5 = aL[3];
                    if (i5 >= 0 && (i5 & (86730325 ^ i5)) != 43286570) {
                    }
                    break;
                default:
                    sb.append((char) (charArray[i2] ^ 65535));
                    int i6 = aL[0];
                    if (i6 >= 0 && (i6 & (86235462 ^ i6)) != 43787409) {
                    }
                    break;
            }
        }
        return sb.toString();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        int i2;
        context = this.f30a.g;
        c.a(context);
        int i3 = aM[0];
        if (i3 >= 0) {
            do {
                i2 = i3 & (96579607 ^ i3);
                i3 = 918344;
            } while (i2 != 918344);
        }
    }
}
