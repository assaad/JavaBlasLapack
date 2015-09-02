package org.netlib.lapack;

import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasdq
{
  public static void slasdq(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat1, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    paramintW.val = 0;
    m = 0;
    if (Lsame.lsame(paramString, "U")) {
      m = 1;
    }
    if (Lsame.lsame(paramString, "L")) {
      m = 2;
    }
    if ((m != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -3;
      }
      else if ((paramInt3 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt4 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else
      {
        if ((paramInt3 != 0 ? 0 : 1) != 0) {}
        if (((paramInt9 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((paramInt3 <= 0 ? 0 : 1) == 0) {}
        }
        if ((((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -10;
        }
        else if ((paramInt11 >= Math.max(1, paramInt4) ? 0 : 1) != 0)
        {
          paramintW.val = -12;
        }
        else
        {
          if ((paramInt5 != 0 ? 0 : 1) != 0) {}
          if (((paramInt13 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
            if ((paramInt5 <= 0 ? 0 : 1) == 0) {}
          }
          if ((((paramInt13 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW.val = -14;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASDQ", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 <= 0 ? 0 : 1) == 0) {}
    if (((paramInt4 <= 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    i = (paramInt5 <= 0 ? 0 : 1) == 0 ? 0 : 1;
    i1 = paramInt2 + 1;
    i2 = paramInt1;
    if ((m != 1 ? 0 : 1) != 0) {}
    if (((i2 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      for (i3 = paramInt2 - 1 - 1 + 1; i3 > 0; i3--)
      {
        Slartg.slartg(paramArrayOfFloat1[(j - 1 + paramInt6)], paramArrayOfFloat2[(j - 1 + paramInt7)], localfloatW1, localfloatW3, localfloatW2);
        paramArrayOfFloat1[(j - 1 + paramInt6)] = localfloatW2.val;
        paramArrayOfFloat2[(j - 1 + paramInt7)] = (localfloatW3.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt6)]);
        paramArrayOfFloat1[(j + 1 - 1 + paramInt6)] = (localfloatW1.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt6)]);
        if (i != 0)
        {
          paramArrayOfFloat6[(j - 1 + paramInt14)] = localfloatW1.val;
          paramArrayOfFloat6[(paramInt2 + j - 1 + paramInt14)] = localfloatW3.val;
        }
        j += 1;
      }
      Slartg.slartg(paramArrayOfFloat1[(paramInt2 - 1 + paramInt6)], paramArrayOfFloat2[(paramInt2 - 1 + paramInt7)], localfloatW1, localfloatW3, localfloatW2);
      paramArrayOfFloat1[(paramInt2 - 1 + paramInt6)] = localfloatW2.val;
      paramArrayOfFloat2[(paramInt2 - 1 + paramInt7)] = 0.0F;
      if (i != 0)
      {
        paramArrayOfFloat6[(paramInt2 - 1 + paramInt14)] = localfloatW1.val;
        paramArrayOfFloat6[(paramInt2 + paramInt2 - 1 + paramInt14)] = localfloatW3.val;
      }
      m = 2;
      i2 = 0;
      if ((paramInt3 <= 0 ? 0 : 1) != 0) {
        Slasr.slasr("L", "V", "F", i1, paramInt3, paramArrayOfFloat6, 1 - 1 + paramInt14, paramArrayOfFloat6, i1 - 1 + paramInt14, paramArrayOfFloat3, paramInt8, paramInt9);
      }
    }
    if ((m != 2 ? 0 : 1) != 0)
    {
      j = 1;
      for (i3 = paramInt2 - 1 - 1 + 1; i3 > 0; i3--)
      {
        Slartg.slartg(paramArrayOfFloat1[(j - 1 + paramInt6)], paramArrayOfFloat2[(j - 1 + paramInt7)], localfloatW1, localfloatW3, localfloatW2);
        paramArrayOfFloat1[(j - 1 + paramInt6)] = localfloatW2.val;
        paramArrayOfFloat2[(j - 1 + paramInt7)] = (localfloatW3.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt6)]);
        paramArrayOfFloat1[(j + 1 - 1 + paramInt6)] = (localfloatW1.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt6)]);
        if (i != 0)
        {
          paramArrayOfFloat6[(j - 1 + paramInt14)] = localfloatW1.val;
          paramArrayOfFloat6[(paramInt2 + j - 1 + paramInt14)] = localfloatW3.val;
        }
        j += 1;
      }
      if ((i2 != 1 ? 0 : 1) != 0)
      {
        Slartg.slartg(paramArrayOfFloat1[(paramInt2 - 1 + paramInt6)], paramArrayOfFloat2[(paramInt2 - 1 + paramInt7)], localfloatW1, localfloatW3, localfloatW2);
        paramArrayOfFloat1[(paramInt2 - 1 + paramInt6)] = localfloatW2.val;
        if (i != 0)
        {
          paramArrayOfFloat6[(paramInt2 - 1 + paramInt14)] = localfloatW1.val;
          paramArrayOfFloat6[(paramInt2 + paramInt2 - 1 + paramInt14)] = localfloatW3.val;
        }
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        if ((i2 != 0 ? 0 : 1) != 0) {
          Slasr.slasr("R", "V", "F", paramInt4, paramInt2, paramArrayOfFloat6, 1 - 1 + paramInt14, paramArrayOfFloat6, i1 - 1 + paramInt14, paramArrayOfFloat4, paramInt10, paramInt11);
        } else {
          Slasr.slasr("R", "V", "F", paramInt4, i1, paramArrayOfFloat6, 1 - 1 + paramInt14, paramArrayOfFloat6, i1 - 1 + paramInt14, paramArrayOfFloat4, paramInt10, paramInt11);
        }
      }
      if ((paramInt5 <= 0 ? 0 : 1) != 0) {
        if ((i2 != 0 ? 0 : 1) != 0) {
          Slasr.slasr("L", "V", "F", paramInt2, paramInt5, paramArrayOfFloat6, 1 - 1 + paramInt14, paramArrayOfFloat6, i1 - 1 + paramInt14, paramArrayOfFloat5, paramInt12, paramInt13);
        } else {
          Slasr.slasr("L", "V", "F", i1, paramInt5, paramArrayOfFloat6, 1 - 1 + paramInt14, paramArrayOfFloat6, i1 - 1 + paramInt14, paramArrayOfFloat5, paramInt12, paramInt13);
        }
      }
    }
    Sbdsqr.sbdsqr("U", paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfFloat1, paramInt6, paramArrayOfFloat2, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramintW);
    j = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      k = j;
      f = paramArrayOfFloat1[(j - 1 + paramInt6)];
      n = j + 1;
      for (int i4 = paramInt2 - (j + 1) + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfFloat1[(n - 1 + paramInt6)] >= f ? 0 : 1) != 0)
        {
          k = n;
          f = paramArrayOfFloat1[(n - 1 + paramInt6)];
        }
        n += 1;
      }
      if ((k == j ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(k - 1 + paramInt6)] = paramArrayOfFloat1[(j - 1 + paramInt6)];
        paramArrayOfFloat1[(j - 1 + paramInt6)] = f;
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt3, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt4, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
        }
        if ((paramInt5 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt5, paramArrayOfFloat5, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat5, j - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13);
        }
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasdq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */