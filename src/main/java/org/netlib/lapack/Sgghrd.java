package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgghrd
{
  public static void sgghrd(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f = 0.0F;
    if (Lsame.lsame(paramString1, "N"))
    {
      i = 0;
      k = 1;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i = 1;
      k = 2;
    }
    else if (Lsame.lsame(paramString1, "I"))
    {
      i = 1;
      k = 3;
    }
    else
    {
      k = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      j = 0;
      m = 1;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      j = 1;
      m = 2;
    }
    else if (Lsame.lsame(paramString2, "I"))
    {
      j = 1;
      m = 3;
    }
    else
    {
      m = 0;
    }
    paramintW.val = 0;
    if ((k > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((m > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt3 <= paramInt1 ? 0 : 1) == 0) {}
      if (((paramInt3 >= paramInt2 - 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if (i != 0) {}
        if (((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((paramInt9 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -11;
        }
        else
        {
          if (j != 0) {}
          if (((paramInt11 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
          if (((paramInt11 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW.val = -13;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGHRD", -paramintW.val);
      return;
    }
    if ((k != 3 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
    }
    if ((m != 3 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    n = 1;
    int i3;
    for (int i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
    {
      i1 = n + 1;
      for (i3 = paramInt1 - (n + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfFloat2[(i1 - 1 + (n - 1) * paramInt7 + paramInt6)] = 0.0F;
        i1 += 1;
      }
      n += 1;
    }
    n = paramInt2;
    for (i2 = paramInt3 - 2 - paramInt2 + 1; i2 > 0; i2--)
    {
      i1 = paramInt3;
      for (i3 = (n + 2 - paramInt3 + -1) / -1; i3 > 0; i3--)
      {
        f = paramArrayOfFloat1[(i1 - 1 - 1 + (n - 1) * paramInt5 + paramInt4)];
        slartg_adapter(f, paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)], localfloatW1, localfloatW2, paramArrayOfFloat1, i1 - 1 - 1 + (n - 1) * paramInt5 + paramInt4);
        paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0F;
        Srot.srot(paramInt1 - n, paramArrayOfFloat1, i1 - 1 - 1 + (n + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i1 - 1 + (n + 1 - 1) * paramInt5 + paramInt4, paramInt5, localfloatW1.val, localfloatW2.val);
        Srot.srot(paramInt1 + 2 - i1, paramArrayOfFloat2, i1 - 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, paramInt7, localfloatW1.val, localfloatW2.val);
        if (i != 0) {
          Srot.srot(paramInt1, paramArrayOfFloat3, 1 - 1 + (i1 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (i1 - 1) * paramInt9 + paramInt8, 1, localfloatW1.val, localfloatW2.val);
        }
        f = paramArrayOfFloat2[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
        slartg_adapter(f, paramArrayOfFloat2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)], localfloatW1, localfloatW2, paramArrayOfFloat2, i1 - 1 + (i1 - 1) * paramInt7 + paramInt6);
        paramArrayOfFloat2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
        Srot.srot(paramInt3, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4, 1, localfloatW1.val, localfloatW2.val);
        Srot.srot(i1 - 1, paramArrayOfFloat2, 1 - 1 + (i1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, 1, localfloatW1.val, localfloatW2.val);
        if (j != 0) {
          Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat4, 1 - 1 + (i1 - 1 - 1) * paramInt11 + paramInt10, 1, localfloatW1.val, localfloatW2.val);
        }
        i1 += -1;
      }
      n += 1;
    }
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat, int paramInt)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat[paramInt]);
    Slartg.slartg(paramFloat1, paramFloat2, paramfloatW1, paramfloatW2, localfloatW);
    paramArrayOfFloat[paramInt] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgghrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */