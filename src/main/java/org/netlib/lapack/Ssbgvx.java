package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssbgvx
{
  public static void ssbgvx(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float paramFloat1, float paramFloat2, int paramInt10, int paramInt11, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat4, int paramInt12, float[] paramArrayOfFloat5, int paramInt13, int paramInt14, float[] paramArrayOfFloat6, int paramInt15, int[] paramArrayOfInt1, int paramInt16, int[] paramArrayOfInt2, int paramInt17, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str1 = new String(" ");
    String str2 = new String(" ");
    int j = 0;
    intW localintW1 = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    intW localintW2 = new intW(0);
    float f = 0.0F;
    bool5 = Lsame.lsame(paramString1, "V");
    bool3 = Lsame.lsame(paramString3, "U");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    paramintW2.val = 0;
    if ((((!bool5) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else if ((((!bool3) && (!Lsame.lsame(paramString3, "L")) ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -3;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -4;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -5;
      }
      else
      {
        if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -6;
        }
        else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
        {
          paramintW2.val = -8;
        }
        else if ((paramInt7 >= paramInt3 + 1 ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool5) {}
          }
          if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -12;
          }
          else if (bool4)
          {
            if ((paramInt1 <= 0 ? 0 : 1) != 0) {}
            if (((paramFloat2 > paramFloat1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramintW2.val = -14;
            }
          }
          else if (bool2)
          {
            if ((paramInt10 >= 1 ? 0 : 1) == 0) {}
            if (((paramInt10 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = -15;
            }
            else
            {
              if ((paramInt11 >= Math.min(paramInt1, paramInt10) ? 0 : 1) == 0) {}
              if (((paramInt11 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                paramintW2.val = -16;
              }
            }
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt14 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt14 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -21;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSBGVX", -paramintW2.val);
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Spbstf.spbstf(paramString3, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (paramInt1 + paramintW2.val);
      return;
    }
    Ssbgst.ssbgst(paramString1, paramString3, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat6, paramInt15, localintW1);
    k = 1;
    m = k + paramInt1;
    i4 = m + paramInt1;
    if (bool5) {
      str2 = "U";
    } else {
      str2 = "N";
    }
    Ssbtrd.ssbtrd(str2, paramString3, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, k - 1 + paramInt15, paramArrayOfFloat6, m - 1 + paramInt15, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat6, i4 - 1 + paramInt15, localintW1);
    i = 0;
    if (bool2)
    {
      if ((paramInt10 != 1 ? 0 : 1) != 0) {}
      if (((paramInt11 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i = 1;
      }
    }
    if (((!bool1) && (i == 0) ? 0 : 1) != 0) {}
    int i8;
    if (((paramFloat3 > 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat6, k - 1 + paramInt15, 1, paramArrayOfFloat4, paramInt12, 1);
      n = i4 + 2 * paramInt1;
      Scopy.scopy(paramInt1 - 1, paramArrayOfFloat6, m - 1 + paramInt15, 1, paramArrayOfFloat6, n - 1 + paramInt15, 1);
      if ((bool5 ^ true))
      {
        Ssterf.ssterf(paramInt1, paramArrayOfFloat4, paramInt12, paramArrayOfFloat6, n - 1 + paramInt15, paramintW2);
      }
      else
      {
        Slacpy.slacpy("A", paramInt1, paramInt1, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat5, paramInt13, paramInt14);
        Ssteqr.ssteqr(paramString1, paramInt1, paramArrayOfFloat4, paramInt12, paramArrayOfFloat6, n - 1 + paramInt15, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat6, i4 - 1 + paramInt15, paramintW2);
        if ((paramintW2.val != 0 ? 0 : 1) != 0)
        {
          j = 1;
          for (i8 = paramInt1 - 1 + 1; i8 > 0; i8--)
          {
            paramArrayOfInt2[(j - 1 + paramInt17)] = 0;
            j += 1;
          }
        }
      }
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        paramintW1.val = paramInt1;
      } else {
        paramintW2.val = 0;
      }
    }
    else
    {
      if (bool5) {
        str1 = "B";
      } else {
        str1 = "E";
      }
      i1 = 1;
      i2 = i1 + paramInt1;
      i3 = i2 + paramInt1;
      Sstebz.sstebz(paramString2, str1, paramInt1, paramFloat1, paramFloat2, paramInt10, paramInt11, paramFloat3, paramArrayOfFloat6, k - 1 + paramInt15, paramArrayOfFloat6, m - 1 + paramInt15, paramintW1, localintW2, paramArrayOfFloat4, paramInt12, paramArrayOfInt1, i1 - 1 + paramInt16, paramArrayOfInt1, i2 - 1 + paramInt16, paramArrayOfFloat6, i4 - 1 + paramInt15, paramArrayOfInt1, i3 - 1 + paramInt16, paramintW2);
      if (bool5)
      {
        Sstein.sstein(paramInt1, paramArrayOfFloat6, k - 1 + paramInt15, paramArrayOfFloat6, m - 1 + paramInt15, paramintW1.val, paramArrayOfFloat4, paramInt12, paramArrayOfInt1, i1 - 1 + paramInt16, paramArrayOfInt1, i2 - 1 + paramInt16, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat6, i4 - 1 + paramInt15, paramArrayOfInt1, i3 - 1 + paramInt16, paramArrayOfInt2, paramInt17, paramintW2);
        i6 = 1;
        for (i8 = paramintW1.val - 1 + 1; i8 > 0; i8--)
        {
          Scopy.scopy(paramInt1, paramArrayOfFloat5, 1 - 1 + (i6 - 1) * paramInt14 + paramInt13, 1, paramArrayOfFloat6, 1 - 1 + paramInt15, 1);
          Sgemv.sgemv("N", paramInt1, paramInt1, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat6, paramInt15, 1, 0.0F, paramArrayOfFloat5, 1 - 1 + (i6 - 1) * paramInt14 + paramInt13, 1);
          i6 += 1;
        }
      }
    }
    if (bool5)
    {
      i6 = 1;
      for (i8 = paramintW1.val - 1 - 1 + 1; i8 > 0; i8--)
      {
        j = 0;
        f = paramArrayOfFloat4[(i6 - 1 + paramInt12)];
        i7 = i6 + 1;
        for (int i9 = paramintW1.val - (i6 + 1) + 1; i9 > 0; i9--)
        {
          if ((paramArrayOfFloat4[(i7 - 1 + paramInt12)] >= f ? 0 : 1) != 0)
          {
            j = i7;
            f = paramArrayOfFloat4[(i7 - 1 + paramInt12)];
          }
          i7 += 1;
        }
        if ((j == 0 ? 0 : 1) != 0)
        {
          i5 = paramArrayOfInt1[(i1 + j - 1 - 1 + paramInt16)];
          paramArrayOfFloat4[(j - 1 + paramInt12)] = paramArrayOfFloat4[(i6 - 1 + paramInt12)];
          paramArrayOfInt1[(i1 + j - 1 - 1 + paramInt16)] = paramArrayOfInt1[(i1 + i6 - 1 - 1 + paramInt16)];
          paramArrayOfFloat4[(i6 - 1 + paramInt12)] = f;
          paramArrayOfInt1[(i1 + i6 - 1 - 1 + paramInt16)] = i5;
          Sswap.sswap(paramInt1, paramArrayOfFloat5, 1 - 1 + (j - 1) * paramInt14 + paramInt13, 1, paramArrayOfFloat5, 1 - 1 + (i6 - 1) * paramInt14 + paramInt13, 1);
          if ((paramintW2.val == 0 ? 0 : 1) != 0)
          {
            i5 = paramArrayOfInt2[(j - 1 + paramInt17)];
            paramArrayOfInt2[(j - 1 + paramInt17)] = paramArrayOfInt2[(i6 - 1 + paramInt17)];
            paramArrayOfInt2[(i6 - 1 + paramInt17)] = i5;
          }
        }
        i6 += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssbgvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */