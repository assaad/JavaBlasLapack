package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sppsvx
{
  public static void sppsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, StringW paramStringW, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, int paramInt9, floatW paramfloatW, float[] paramArrayOfFloat6, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, float[] paramArrayOfFloat8, int paramInt12, int[] paramArrayOfInt, int paramInt13, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
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
    int k;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
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
    else
    {
      if (Lsame.lsame(paramString1, "F")) {}
      if (((((!bool3) && (!Lsame.lsame(paramStringW.val, "N")) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -7;
      }
      else
      {
        if (bool3)
        {
          f4 = f2;
          f3 = 0.0F;
          j = 1;
          for (k = paramInt1 - 1 + 1; k > 0; k--)
          {
            f4 = Math.min(f4, paramArrayOfFloat3[(j - 1 + paramInt5)]);
            f3 = Math.max(f3, paramArrayOfFloat3[(j - 1 + paramInt5)]);
            j += 1;
          }
          if ((f4 > 0.0F ? 0 : 1) != 0) {
            paramintW.val = -8;
          } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
            localfloatW2.val = (Math.max(f4, f5) / Math.min(f3, f2));
          } else {
            localfloatW2.val = 1.0F;
          }
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -10;
          } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -12;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Sppequ.sppequ(paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat3, paramInt5, localfloatW2, localfloatW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Slaqsp.slaqsp(paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat3, paramInt5, localfloatW2.val, localfloatW1.val, paramStringW);
        bool3 = Lsame.lsame(paramStringW.val, "Y");
      }
    }
    int m;
    if (bool3)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i += 1;
        }
        j += 1;
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      Scopy.scopy(paramInt1 * (paramInt1 + 1) / 2, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat2, paramInt4, 1);
      Spptrf.spptrf(paramString2, paramInt1, paramArrayOfFloat2, paramInt4, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f1 = Slansp.slansp("I", paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat8, paramInt12);
    Sppcon.sppcon(paramString2, paramInt1, paramArrayOfFloat2, paramInt4, f1, paramfloatW, paramArrayOfFloat8, paramInt12, paramArrayOfInt, paramInt13, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9);
    Spptrs.spptrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt4, paramArrayOfFloat5, paramInt8, paramInt9, paramintW);
    Spprfs.spprfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, paramInt10, paramArrayOfFloat7, paramInt11, paramArrayOfFloat8, paramInt12, paramArrayOfInt, paramInt13, paramintW);
    if (bool3)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i += 1;
        }
        j += 1;
      }
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat6[(j - 1 + paramInt10)] /= localfloatW2.val;
        j += 1;
      }
    }
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sppsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */