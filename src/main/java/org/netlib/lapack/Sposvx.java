package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sposvx
{
  public static void sposvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, StringW paramStringW, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, floatW paramfloatW, float[] paramArrayOfFloat6, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, float[] paramArrayOfFloat8, int paramInt14, int[] paramArrayOfInt, int paramInt15, intW paramintW)
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
      if (Lsame.lsame(paramString1, "F")) {}
      if (((((!bool3) && (!Lsame.lsame(paramStringW.val, "N")) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -9;
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
            f4 = Math.min(f4, paramArrayOfFloat3[(j - 1 + paramInt7)]);
            f3 = Math.max(f3, paramArrayOfFloat3[(j - 1 + paramInt7)]);
            j += 1;
          }
          if ((f4 > 0.0F ? 0 : 1) != 0) {
            paramintW.val = -10;
          } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
            localfloatW2.val = (Math.max(f4, f5) / Math.min(f3, f2));
          } else {
            localfloatW2.val = 1.0F;
          }
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -12;
          } else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -14;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPOSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Spoequ.spoequ(paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt7, localfloatW2, localfloatW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Slaqsy.slaqsy(paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt7, localfloatW2.val, localfloatW1.val, paramStringW);
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
          paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat3[(i - 1 + paramInt7)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i += 1;
        }
        j += 1;
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      Slacpy.slacpy(paramString2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6);
      Spotrf.spotrf(paramString2, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f1 = Slansy.slansy("1", paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat8, paramInt14);
    Spocon.spocon(paramString2, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, f1, paramfloatW, paramArrayOfFloat8, paramInt14, paramArrayOfInt, paramInt15, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11);
    Spotrs.spotrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
    Sporfs.sporfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfFloat6, paramInt12, paramArrayOfFloat7, paramInt13, paramArrayOfFloat8, paramInt14, paramArrayOfInt, paramInt15, paramintW);
    if (bool3)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt11 + paramInt10)] = (paramArrayOfFloat3[(i - 1 + paramInt7)] * paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt11 + paramInt10)]);
          i += 1;
        }
        j += 1;
      }
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat6[(j - 1 + paramInt12)] /= localfloatW2.val;
        j += 1;
      }
    }
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sposvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */