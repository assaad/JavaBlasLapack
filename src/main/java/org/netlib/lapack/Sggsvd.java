package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sggsvd
{
  public static void sggsvd(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, int paramInt15, float[] paramArrayOfFloat8, int paramInt16, int[] paramArrayOfInt, int paramInt17, intW paramintW3)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    bool2 = Lsame.lsame(paramString1, "U");
    bool3 = Lsame.lsame(paramString2, "V");
    bool1 = Lsame.lsame(paramString3, "Q");
    paramintW3.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((((!bool3) && (!Lsame.lsame(paramString2, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString3, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -4;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -5;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -6;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -10;
    }
    else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW3.val = -12;
    }
    else
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt11 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -16;
      }
      else
      {
        if ((paramInt13 >= 1 ? 0 : 1) == 0) {
          if (!bool3) {}
        }
        if ((((paramInt13 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -18;
        }
        else
        {
          if ((paramInt15 >= 1 ? 0 : 1) == 0) {
            if (!bool1) {}
          }
          if ((((paramInt15 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -20;
          }
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGSVD", -paramintW3.val);
      return;
    }
    f1 = Slange.slange("1", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat8, paramInt16);
    f2 = Slange.slange("1", paramInt3, paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat8, paramInt16);
    f7 = Slamch.slamch("Precision");
    f8 = Slamch.slamch("Safe Minimum");
    f5 = Math.max(paramInt1, paramInt2) * Math.max(f1, f8) * f7;
    f6 = Math.max(paramInt3, paramInt2) * Math.max(f2, f8) * f7;
    Sggsvp.sggsvp(paramString1, paramString2, paramString3, paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, f5, f6, paramintW1, paramintW2, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfFloat6, paramInt12, paramInt13, paramArrayOfFloat7, paramInt14, paramInt15, paramArrayOfInt, paramInt17, paramArrayOfFloat8, paramInt16, paramArrayOfFloat8, paramInt2 + 1 - 1 + paramInt16, paramintW3);
    Stgsja.stgsja(paramString1, paramString2, paramString3, paramInt1, paramInt3, paramInt2, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, f5, f6, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfFloat6, paramInt12, paramInt13, paramArrayOfFloat7, paramInt14, paramInt15, paramArrayOfFloat8, paramInt16, localintW, paramintW3);
    Scopy.scopy(paramInt2, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat8, paramInt16, 1);
    j = Math.min(paramintW2.val, paramInt1 - paramintW1.val);
    i = 1;
    for (int n = j - 1 + 1; n > 0; n--)
    {
      k = i;
      f3 = paramArrayOfFloat8[(paramintW1.val + i - 1 + paramInt16)];
      m = i + 1;
      for (int i1 = j - (i + 1) + 1; i1 > 0; i1--)
      {
        f4 = paramArrayOfFloat8[(paramintW1.val + m - 1 + paramInt16)];
        if ((f4 <= f3 ? 0 : 1) != 0)
        {
          k = m;
          f3 = f4;
        }
        m += 1;
      }
      if ((k == i ? 0 : 1) != 0)
      {
        paramArrayOfFloat8[(paramintW1.val + k - 1 + paramInt16)] = paramArrayOfFloat8[(paramintW1.val + i - 1 + paramInt16)];
        paramArrayOfFloat8[(paramintW1.val + i - 1 + paramInt16)] = f3;
        paramArrayOfInt[(paramintW1.val + i - 1 + paramInt17)] = (paramintW1.val + k);
      }
      else
      {
        paramArrayOfInt[(paramintW1.val + i - 1 + paramInt17)] = (paramintW1.val + i);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggsvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */