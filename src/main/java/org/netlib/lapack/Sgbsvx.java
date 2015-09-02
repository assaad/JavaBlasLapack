package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgbsvx
{
  public static void sgbsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, StringW paramStringW, float[] paramArrayOfFloat3, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt16, float[] paramArrayOfFloat8, int paramInt17, float[] paramArrayOfFloat9, int paramInt18, int[] paramArrayOfInt2, int paramInt19, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    String str = new String(" ");
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "N");
    bool1 = Lsame.lsame(paramString1, "E");
    bool3 = Lsame.lsame(paramString2, "N");
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      j = 0;
      i = 0;
    }
    else
    {
      j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      f6 = Slamch.slamch("Safe minimum");
      f2 = 1.0F / f6;
    }
    if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0) {}
    int i2;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool3 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0)
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
      else if ((paramInt4 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt6 >= paramInt2 + paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else if ((paramInt8 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if (Lsame.lsame(paramString1, "F")) {
          if (((j == 0) && (i == 0) ? 0 : 1) != 0) {}
        }
        if ((((!Lsame.lsame(paramStringW.val, "N") ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -12;
        }
        else
        {
          if (j != 0)
          {
            f4 = f2;
            f3 = 0.0F;
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              f4 = Math.min(f4, paramArrayOfFloat3[(m - 1 + paramInt10)]);
              f3 = Math.max(f3, paramArrayOfFloat3[(m - 1 + paramInt10)]);
              m += 1;
            }
            if ((f4 > 0.0F ? 0 : 1) != 0) {
              paramintW.val = -13;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localfloatW3.val = (Math.max(f4, f6) / Math.min(f3, f2));
            } else {
              localfloatW3.val = 1.0F;
            }
          }
          if (i != 0) {}
          if (((paramintW.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f4 = f2;
            f3 = 0.0F;
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              f4 = Math.min(f4, paramArrayOfFloat4[(m - 1 + paramInt11)]);
              f3 = Math.max(f3, paramArrayOfFloat4[(m - 1 + paramInt11)]);
              m += 1;
            }
            if ((f4 > 0.0F ? 0 : 1) != 0) {
              paramintW.val = -14;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localfloatW2.val = (Math.max(f4, f6) / Math.min(f3, f2));
            } else {
              localfloatW2.val = 1.0F;
            }
          }
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            if ((paramInt13 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -16;
            } else if ((paramInt15 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -18;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Sgbequ.sgbequ(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat3, paramInt10, paramArrayOfFloat4, paramInt11, localfloatW3, localfloatW2, localfloatW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Slaqgb.slaqgb(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat3, paramInt10, paramArrayOfFloat4, paramInt11, localfloatW3.val, localfloatW2.val, localfloatW1.val, paramStringW);
        j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
        i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      }
    }
    int i3;
    if (bool3)
    {
      if (j != 0)
      {
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          k = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfFloat3[(k - 1 + paramInt10)] * paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
            k += 1;
          }
          m += 1;
        }
      }
    }
    else if (i != 0)
    {
      m = 1;
      i2 = paramInt4 - 1 + 1;
      for (;;)
      {
        k = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfFloat4[(k - 1 + paramInt11)] * paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
          k += 1;
        }
        m += 1;
        i2--;
        if (i2 <= 0) {
          break;
        }
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        n = Math.max(m - paramInt3, 1);
        i1 = Math.min(m + paramInt2, paramInt1);
        Scopy.scopy(i1 - n + 1, paramArrayOfFloat1, paramInt3 + 1 - m + n - 1 + (m - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat2, paramInt2 + paramInt3 + 1 - m + n - 1 + (m - 1) * paramInt8 + paramInt7, 1);
        m += 1;
      }
      Sgbtrf.sgbtrf(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        f1 = 0.0F;
        m = 1;
        for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
        {
          k = Math.max(paramInt3 + 2 - m, 1);
          for (i3 = Math.min(paramInt1 + paramInt3 + 1 - m, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - m, 1) + 1; i3 > 0; i3--)
          {
            f1 = Math.max(f1, Math.abs(paramArrayOfFloat1[(k - 1 + (m - 1) * paramInt6 + paramInt5)]));
            k += 1;
          }
          m += 1;
        }
        f5 = Slantb.slantb("M", "U", "N", paramintW.val, Math.min(paramintW.val - 1, paramInt2 + paramInt3), paramArrayOfFloat2, Math.max(1, paramInt2 + paramInt3 + 2 - paramintW.val) - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat9, paramInt18);
        if ((f5 != 0.0F ? 0 : 1) != 0) {
          f5 = 1.0F;
        } else {
          f5 = f1 / f5;
        }
        paramArrayOfFloat9[(1 - 1 + paramInt18)] = f5;
        paramfloatW.val = 0.0F;
        return;
      }
    }
    if (bool3) {
      str = "1";
    } else {
      str = "I";
    }
    f1 = Slangb.slangb(str, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat9, paramInt18);
    f5 = Slantb.slantb("M", "U", "N", paramInt1, paramInt2 + paramInt3, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfFloat9, paramInt18);
    if ((f5 != 0.0F ? 0 : 1) != 0) {
      f5 = 1.0F;
    } else {
      f5 = Slangb.slangb("M", paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat9, paramInt18) / f5;
    }
    Sgbcon.sgbcon(str, paramInt1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, f1, paramfloatW, paramArrayOfFloat9, paramInt18, paramArrayOfInt2, paramInt19, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt4, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramInt15);
    Sgbtrs.sgbtrs(paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfFloat6, paramInt14, paramInt15, paramintW);
    Sgbrfs.sgbrfs(paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramInt15, paramArrayOfFloat7, paramInt16, paramArrayOfFloat8, paramInt17, paramArrayOfFloat9, paramInt18, paramArrayOfInt2, paramInt19, paramintW);
    if (bool3)
    {
      if (i != 0)
      {
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          k = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt15 + paramInt14)] = (paramArrayOfFloat4[(k - 1 + paramInt11)] * paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt15 + paramInt14)]);
            k += 1;
          }
          m += 1;
        }
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat7[(m - 1 + paramInt16)] /= localfloatW2.val;
          m += 1;
        }
      }
    }
    else if (j != 0)
    {
      m = 1;
      for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
      {
        k = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt15 + paramInt14)] = (paramArrayOfFloat3[(k - 1 + paramInt10)] * paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt15 + paramInt14)]);
          k += 1;
        }
        m += 1;
      }
      m = 1;
      i2 = paramInt4 - 1 + 1;
      for (;;)
      {
        paramArrayOfFloat7[(m - 1 + paramInt16)] /= localfloatW3.val;
        m += 1;
        i2--;
        if (i2 <= 0) {
          break;
        }
      }
    }
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
    paramArrayOfFloat9[(1 - 1 + paramInt18)] = f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */