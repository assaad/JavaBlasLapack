package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Saxpy;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sptrfs
{
  public static void sptrfs(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, float[] paramArrayOfFloat8, int paramInt12, float[] paramArrayOfFloat9, int paramInt13, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    } else if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -10;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPTRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      m = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat7[(m - 1 + paramInt11)] = 0.0F;
        paramArrayOfFloat8[(m - 1 + paramInt12)] = 0.0F;
        m += 1;
      }
      return;
    }
    n = 4;
    f4 = Slamch.slamch("Epsilon");
    f10 = Slamch.slamch("Safe minimum");
    f8 = n * f10;
    f9 = f8 / f4;
    m = 1;
    for (int i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
    {
      i = 1;
      f6 = 3.0F;
      for (;;)
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          f1 = paramArrayOfFloat5[(1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          f3 = paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat6[(1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfFloat9[(paramInt1 + 1 - 1 + paramInt13)] = (f1 - f3);
          paramArrayOfFloat9[(1 - 1 + paramInt13)] = (Math.abs(f1) + Math.abs(f3));
        }
        else
        {
          f1 = paramArrayOfFloat5[(1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          f3 = paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat6[(1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          f5 = paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat6[(2 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfFloat9[(paramInt1 + 1 - 1 + paramInt13)] = (f1 - f3 - f5);
          paramArrayOfFloat9[(1 - 1 + paramInt13)] = (Math.abs(f1) + Math.abs(f3) + Math.abs(f5));
          j = 2;
          for (i2 = paramInt1 - 1 - 2 + 1; i2 > 0; i2--)
          {
            f1 = paramArrayOfFloat5[(j - 1 + (m - 1) * paramInt8 + paramInt7)];
            f2 = paramArrayOfFloat2[(j - 1 - 1 + paramInt4)] * paramArrayOfFloat6[(j - 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
            f3 = paramArrayOfFloat1[(j - 1 + paramInt3)] * paramArrayOfFloat6[(j - 1 + (m - 1) * paramInt10 + paramInt9)];
            f5 = paramArrayOfFloat2[(j - 1 + paramInt4)] * paramArrayOfFloat6[(j + 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
            paramArrayOfFloat9[(paramInt1 + j - 1 + paramInt13)] = (f1 - f2 - f3 - f5);
            paramArrayOfFloat9[(j - 1 + paramInt13)] = (Math.abs(f1) + Math.abs(f2) + Math.abs(f3) + Math.abs(f5));
            j += 1;
          }
          f1 = paramArrayOfFloat5[(paramInt1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          f2 = paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat6[(paramInt1 - 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          f3 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] * paramArrayOfFloat6[(paramInt1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfFloat9[(paramInt1 + paramInt1 - 1 + paramInt13)] = (f1 - f2 - f3);
          paramArrayOfFloat9[(paramInt1 - 1 + paramInt13)] = (Math.abs(f1) + Math.abs(f2) + Math.abs(f3));
        }
        f7 = 0.0F;
        j = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfFloat9[(j - 1 + paramInt13)] <= f9 ? 0 : 1) != 0) {
            f7 = Math.max(f7, Math.abs(paramArrayOfFloat9[(paramInt1 + j - 1 + paramInt13)]) / paramArrayOfFloat9[(j - 1 + paramInt13)]);
          } else {
            f7 = Math.max(f7, (Math.abs(paramArrayOfFloat9[(paramInt1 + j - 1 + paramInt13)]) + f8) / (paramArrayOfFloat9[(j - 1 + paramInt13)] + f8));
          }
          j += 1;
        }
        paramArrayOfFloat8[(m - 1 + paramInt12)] = f7;
        if ((paramArrayOfFloat8[(m - 1 + paramInt12)] <= f4 ? 0 : 1) != 0) {}
        if (((2.0F * paramArrayOfFloat8[(m - 1 + paramInt12)] > f6 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Spttrs.spttrs(paramInt1, 1, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfFloat9, paramInt1 + 1 - 1 + paramInt13, paramInt1, paramintW);
        Saxpy.saxpy(paramInt1, 1.0F, paramArrayOfFloat9, paramInt1 + 1 - 1 + paramInt13, 1, paramArrayOfFloat6, 1 - 1 + (m - 1) * paramInt10 + paramInt9, 1);
        f6 = paramArrayOfFloat8[(m - 1 + paramInt12)];
        i += 1;
      }
      j = 1;
      for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfFloat9[(j - 1 + paramInt13)] <= f9 ? 0 : 1) != 0) {
          paramArrayOfFloat9[(j - 1 + paramInt13)] = (Math.abs(paramArrayOfFloat9[(paramInt1 + j - 1 + paramInt13)]) + n * f4 * paramArrayOfFloat9[(j - 1 + paramInt13)]);
        } else {
          paramArrayOfFloat9[(j - 1 + paramInt13)] = (Math.abs(paramArrayOfFloat9[(paramInt1 + j - 1 + paramInt13)]) + n * f4 * paramArrayOfFloat9[(j - 1 + paramInt13)] + f8);
        }
        j += 1;
      }
      k = Isamax.isamax(paramInt1, paramArrayOfFloat9, paramInt13, 1);
      paramArrayOfFloat7[(m - 1 + paramInt11)] = paramArrayOfFloat9[(k - 1 + paramInt13)];
      paramArrayOfFloat9[(1 - 1 + paramInt13)] = 1.0F;
      j = 2;
      for (i2 = paramInt1 - 2 + 1; i2 > 0; i2--)
      {
        paramArrayOfFloat9[(j - 1 + paramInt13)] = (1.0F + paramArrayOfFloat9[(j - 1 - 1 + paramInt13)] * Math.abs(paramArrayOfFloat4[(j - 1 - 1 + paramInt6)]));
        j += 1;
      }
      paramArrayOfFloat9[(paramInt1 - 1 + paramInt13)] /= paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
      j = paramInt1 - 1;
      for (i2 = (1 - (paramInt1 - 1) + -1) / -1; i2 > 0; i2--)
      {
        paramArrayOfFloat9[(j - 1 + paramInt13)] = (paramArrayOfFloat9[(j - 1 + paramInt13)] / paramArrayOfFloat3[(j - 1 + paramInt5)] + paramArrayOfFloat9[(j + 1 - 1 + paramInt13)] * Math.abs(paramArrayOfFloat4[(j - 1 + paramInt6)]));
        j += -1;
      }
      k = Isamax.isamax(paramInt1, paramArrayOfFloat9, paramInt13, 1);
      paramArrayOfFloat7[(m - 1 + paramInt11)] *= Math.abs(paramArrayOfFloat9[(k - 1 + paramInt13)]);
      f6 = 0.0F;
      j = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        f6 = Math.max(f6, Math.abs(paramArrayOfFloat6[(j - 1 + (m - 1) * paramInt10 + paramInt9)]));
        j += 1;
      }
      if ((f6 == 0.0F ? 0 : 1) != 0) {
        paramArrayOfFloat7[(m - 1 + paramInt11)] /= f6;
      }
      m += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sptrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */