package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Spbsvx
{
  public static void spbsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, StringW paramStringW, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, int paramInt12, floatW paramfloatW, float[] paramArrayOfFloat6, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, float[] paramArrayOfFloat8, int paramInt15, int[] paramArrayOfInt, int paramInt16, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "N");
    bool1 = Lsame.lsame(paramString1, "E");
    bool4 = Lsame.lsame(paramString2, "U");
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      bool3 = false;
    }
    else
    {
      bool3 = Lsame.lsame(paramStringW.val, "Y");
      f5 = Slamch.slamch("Safe minimum");
      f2 = 1.0F / f5;
    }
    if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0) {}
    int n;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool4 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else if ((paramInt7 >= paramInt2 + 1 ? 0 : 1) != 0)
    {
      paramintW.val = -9;
    }
    else
    {
      if (Lsame.lsame(paramString1, "F")) {}
      if (((((!bool3) && (!Lsame.lsame(paramStringW.val, "N")) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if (bool3)
        {
          f4 = f2;
          f3 = 0.0F;
          j = 1;
          for (n = paramInt1 - 1 + 1; n > 0; n--)
          {
            f4 = Math.min(f4, paramArrayOfFloat3[(j - 1 + paramInt8)]);
            f3 = Math.max(f3, paramArrayOfFloat3[(j - 1 + paramInt8)]);
            j += 1;
          }
          if ((f4 > 0.0F ? 0 : 1) != 0) {
            paramintW.val = -11;
          } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
            localfloatW2.val = (Math.max(f4, f5) / Math.min(f3, f2));
          } else {
            localfloatW2.val = 1.0F;
          }
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -13;
          } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -15;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPBSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Spbequ.spbequ(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, localfloatW2, localfloatW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Slaqsb.slaqsb(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, localfloatW2.val, localfloatW1.val, paramStringW);
        bool3 = Lsame.lsame(paramStringW.val, "Y");
      }
    }
    int i1;
    if (bool3)
    {
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        i = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt10 + paramInt9)] = (paramArrayOfFloat3[(i - 1 + paramInt8)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt10 + paramInt9)]);
          i += 1;
        }
        j += 1;
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      if (bool4)
      {
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          k = Math.max(j - paramInt2, 1);
          Scopy.scopy(j - k + 1, paramArrayOfFloat1, paramInt2 + 1 - j + k - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, paramInt2 + 1 - j + k - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m = Math.min(j + paramInt2, paramInt1);
          Scopy.scopy(m - j + 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
        }
      }
      Spbtrf.spbtrf(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f1 = Slansb.slansb("1", paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat8, paramInt15);
    Spbcon.spbcon(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, f1, paramfloatW, paramArrayOfFloat8, paramInt15, paramArrayOfInt, paramInt16, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt3, paramArrayOfFloat4, paramInt9, paramInt10, paramArrayOfFloat5, paramInt11, paramInt12);
    Spbtrs.spbtrs(paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat5, paramInt11, paramInt12, paramintW);
    Spbrfs.spbrfs(paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt9, paramInt10, paramArrayOfFloat5, paramInt11, paramInt12, paramArrayOfFloat6, paramInt13, paramArrayOfFloat7, paramInt14, paramArrayOfFloat8, paramInt15, paramArrayOfInt, paramInt16, paramintW);
    if (bool3)
    {
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        i = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt12 + paramInt11)] = (paramArrayOfFloat3[(i - 1 + paramInt8)] * paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt12 + paramInt11)]);
          i += 1;
        }
        j += 1;
      }
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat6[(j - 1 + paramInt13)] /= localfloatW2.val;
        j += 1;
      }
    }
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spbsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */