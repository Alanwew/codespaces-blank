package c.a.a;
/* loaded from: classes.dex */
class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f57a;

    /* renamed from: c  reason: collision with root package name */
    private static int[] f56c = {95602891, 13494724, 82776849, 70842699, 88929295, 5048747, 60796731, 60320663, 76208848, 47468201, 99597053};

    /* renamed from: b  reason: collision with root package name */
    private static int[] f55b = {72691413, 30488936, 95639469, 10256654};

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(v vVar) {
        this.f57a = vVar;
    }

    private static String a(String str) {
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                switch (i % 4) {
                    case 0:
                        sb.append((char) (charArray[i] ^ 12933));
                        int i2 = f55b[1];
                        if (i2 >= 0) {
                            do {
                            } while (i2 % (94079258 ^ i2) <= 0);
                        }
                    case 1:
                        sb.append((char) (charArray[i] ^ 11904));
                        int i3 = f55b[2];
                        if (i3 >= 0 && i3 % (99389786 ^ i3) == 0) {
                            break;
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i] ^ 28794));
                        int i4 = f55b[3];
                        if (i4 >= 0) {
                            do {
                            } while ((i4 & (81126271 ^ i4)) <= 0);
                        }
                    default:
                        sb.append((char) (charArray[i] ^ 65535));
                        int i5 = f55b[0];
                        if (i5 >= 0 && (i5 & (86741919 ^ i5)) != 5516352) {
                        }
                        break;
                }
            }
            return sb.toString();
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
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.w.run():void");
    }
}
