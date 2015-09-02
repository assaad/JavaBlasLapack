package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgesvx
{
  public static void sgesvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, StringW paramStringW, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, int paramInt13, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt14, float[] paramArrayOfFloat8, int paramInt15, float[] paramArrayOfFloat9, int paramInt16, int[] paramArrayOfInt2, int paramInt17, intW paramintW)
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
    int n;
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
      else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if (Lsame.lsame(paramString1, "F")) {
          if (((j == 0) && (i == 0) ? 0 : 1) != 0) {}
        }
        if ((((!Lsame.lsame(paramStringW.val, "N") ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -10;
        }
        else
        {
          if (j != 0)
          {
            f4 = f2;
            f3 = 0.0F;
            m = 1;
            for (n = paramInt1 - 1 + 1; n > 0; n--)
            {
              f4 = Math.min(f4, paramArrayOfFloat3[(m - 1 + paramInt8)]);
              f3 = Math.max(f3, paramArrayOfFloat3[(m - 1 + paramInt8)]);
              m += 1;
            }
            if ((f4 > 0.0F ? 0 : 1) != 0) {
              paramintW.val = -11;
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
            for (n = paramInt1 - 1 + 1; n > 0; n--)
            {
              f4 = Math.min(f4, paramArrayOfFloat4[(m - 1 + paramInt9)]);
              f3 = Math.max(f3, paramArrayOfFloat4[(m - 1 + paramInt9)]);
              m += 1;
            }
            if ((f4 > 0.0F ? 0 : 1) != 0) {
              paramintW.val = -12;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localfloatW2.val = (Math.max(f4, f6) / Math.min(f3, f2));
            } else {
              localfloatW2.val = 1.0F;
            }
          }
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -14;
            } else if ((paramInt13 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -16;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGESVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Sgeequ.sgeequ(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, paramInt9, localfloatW3, localfloatW2, localfloatW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Slaqge.slaqge(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, paramInt9, localfloatW3.val, localfloatW2.val, localfloatW1.val, paramStringW);
        j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
        i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      }
    }
    int i1;
    if (bool3)
    {
      if (j != 0)
      {
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt11 + paramInt10)] = (paramArrayOfFloat3[(k - 1 + paramInt8)] * paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt11 + paramInt10)]);
            k += 1;
          }
          m += 1;
        }
      }
    }
    else if (i != 0)
    {
      m = 1;
      n = paramInt2 - 1 + 1;
      for (;;)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt11 + paramInt10)] = (paramArrayOfFloat4[(k - 1 + paramInt9)] * paramArrayOfFloat5[(k - 1 + (m - 1) * paramInt11 + paramInt10)]);
          k += 1;
        }
        m += 1;
        n--;
        if (n <= 0) {
          break;
        }
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      Slacpy.slacpy("Full", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6);
      Sgetrf.sgetrf(paramInt1, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        f5 = Slantr.slantr("M", "U", "N", paramintW.val, paramintW.val, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat9, paramInt16);
        if ((f5 != 0.0F ? 0 : 1) != 0) {
          f5 = 1.0F;
        } else {
          f5 = Slange.slange("M", paramInt1, paramintW.val, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat9, paramInt16) / f5;
        }
        paramArrayOfFloat9[(1 - 1 + paramInt16)] = f5;
        paramfloatW.val = 0.0F;
        return;
      }
    }
    if (bool3) {
      str = "1";
    } else {
      str = "I";
    }
    f1 = Slange.slange(str, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat9, paramInt16);
    f5 = Slantr.slantr("M", "U", "N", paramInt1, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat9, paramInt16);
    if ((f5 != 0.0F ? 0 : 1) != 0) {
      f5 = 1.0F;
    } else {
      f5 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat9, paramInt16) / f5;
    }
    Sgecon.sgecon(str, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, f1, paramfloatW, paramArrayOfFloat9, paramInt16, paramArrayOfInt2, paramInt17, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfFloat6, paramInt12, paramInt13);
    Sgetrs.sgetrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfFloat6, paramInt12, paramInt13, paramintW);
    Sgerfs.sgerfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfFloat6, paramInt12, paramInt13, paramArrayOfFloat7, paramInt14, paramArrayOfFloat8, paramInt15, paramArrayOfFloat9, paramInt16, paramArrayOfInt2, paramInt17, paramintW);
    if (bool3)
    {
      if (i != 0)
      {
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfFloat4[(k - 1 + paramInt9)] * paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
            k += 1;
          }
          m += 1;
        }
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          paramArrayOfFloat7[(m - 1 + paramInt14)] /= localfloatW2.val;
          m += 1;
        }
      }
    }
    else if (j != 0)
    {
      m = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfFloat3[(k - 1 + paramInt8)] * paramArrayOfFloat6[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
          k += 1;
        }
        m += 1;
      }
      m = 1;
      n = paramInt2 - 1 + 1;
      for (;;)
      {
        paramArrayOfFloat7[(m - 1 + paramInt14)] /= localfloatW3.val;
        m += 1;
        n--;
        if (n <= 0) {
          break;
        }
      }
    }
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
    paramArrayOfFloat9[(1 - 1 + paramInt16)] = f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgesvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */