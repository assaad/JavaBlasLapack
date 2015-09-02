package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Shseqr
{
  public static void shseqr(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, intW paramintW)
  {
    float[] arrayOfFloat1 = new float[49 * 49];
    float[] arrayOfFloat2 = new float[49];
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool1 = false;
    int m = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    bool2 = Lsame.lsame(paramString1, "S");
    bool1 = Lsame.lsame(paramString2, "I");
    bool3 = (bool1) || (Lsame.lsame(paramString2, "V"));
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = Math.max(1, paramInt1);
    m = paramInt11 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString1, "E") ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((bool3 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else
      {
        if ((paramInt3 >= Math.min(paramInt2, paramInt1) ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -5;
        }
        else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
        {
          paramintW.val = -7;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool3) {}
          }
          if ((((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW.val = -11;
          }
          else
          {
            if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
            if (((m ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW.val = -13;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SHSEQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (m != 0)
    {
      Slaqr0.slaqr0(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt2, paramInt3, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
      paramArrayOfFloat5[(1 - 1 + paramInt10)] = Math.max(Math.max(1, paramInt1), paramArrayOfFloat5[(1 - 1 + paramInt10)]);
      return;
    }
    i = 1;
    for (int n = paramInt2 - 1 - 1 + 1; n > 0; n--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat3[(i - 1 + paramInt7)] = 0.0F;
      i += 1;
    }
    i = paramInt3 + 1;
    for (n = paramInt1 - (paramInt3 + 1) + 1; n > 0; n--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat3[(i - 1 + paramInt7)] = 0.0F;
      i += 1;
    }
    if (bool1) {
      Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt8, paramInt9);
    }
    if ((paramInt2 != paramInt3 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(paramInt2 - 1 + paramInt6)] = paramArrayOfFloat1[(paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat3[(paramInt2 - 1 + paramInt7)] = 0.0F;
      return;
    }
    k = Ilaenv.ilaenv(1, "SHSEQR", paramString1.substring(1 + -1, 1) + paramString2.substring(1 + -1, 1), paramInt1, paramInt2, paramInt3, paramInt11);
    k = Math.max(11, k);
    if ((paramInt1 <= k ? 0 : 1) != 0)
    {
      Slaqr0.slaqr0(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt2, paramInt3, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
    }
    else
    {
      Slahqr.slahqr(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt2, paramInt3, paramArrayOfFloat4, paramInt8, paramInt9, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        j = paramintW.val;
        if ((paramInt1 < 49 ? 0 : 1) != 0)
        {
          Slaqr0.slaqr0(bool2, bool3, paramInt1, paramInt2, j, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt2, paramInt3, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
        }
        else
        {
          Slacpy.slacpy("A", paramInt1, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, arrayOfFloat1, 0, 49);
          arrayOfFloat1[(paramInt1 + 1 - 1 + (paramInt1 - 1) * 49)] = 0.0F;
          Slaset.slaset("A", 49, 49 - paramInt1, 0.0F, 0.0F, arrayOfFloat1, 1 - 1 + (paramInt1 + 1 - 1) * 49, 49);
          Slaqr0.slaqr0(bool2, bool3, 49, paramInt2, j, arrayOfFloat1, 0, 49, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt2, paramInt3, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat2, 0, 49, paramintW);
          if (!bool2) {}
          if (((paramintW.val == 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            Slacpy.slacpy("A", paramInt1, paramInt1, arrayOfFloat1, 0, 49, paramArrayOfFloat1, paramInt4, paramInt5);
          }
        }
      }
    }
    if (!bool2) {}
    if (((paramintW.val == 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {}
    if (((paramInt1 <= 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      Slaset.slaset("L", paramInt1 - 2, paramInt1 - 2, 0.0F, 0.0F, paramArrayOfFloat1, 3 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
    }
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = Math.max(Math.max(1, paramInt1), paramArrayOfFloat5[(1 - 1 + paramInt10)]);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Shseqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */