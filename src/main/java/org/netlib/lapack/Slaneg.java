package org.netlib.lapack;

public final class Slaneg
{
  public static int slaneg(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4)
  {
    int i1 = 0;
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
    boolean bool = false;
    n = 0;
    f6 = -paramFloat1;
    i = 1;
    int i3;
    for (int i2 = (paramInt4 - 1 - 1 + 128) / 128; i2 > 0; i2--)
    {
      k = 0;
      f1 = f6;
      j = i;
      for (i3 = Math.min(i + 128 - 1, paramInt4 - 1) - i + 1; i3 > 0; i3--)
      {
        f3 = paramArrayOfFloat1[(j - 1 + paramInt2)] + f6;
        if ((f3 >= 0.0F ? 0 : 1) != 0) {
          k += 1;
        }
        f7 = f6 / f3;
        f6 = f7 * paramArrayOfFloat2[(j - 1 + paramInt3)] - paramFloat1;
        j += 1;
      }
      bool = Sisnan.sisnan(f6);
      if (bool)
      {
        k = 0;
        f6 = f1;
        j = i;
        for (i3 = Math.min(i + 128 - 1, paramInt4 - 1) - i + 1; i3 > 0; i3--)
        {
          f3 = paramArrayOfFloat1[(j - 1 + paramInt2)] + f6;
          if ((f3 >= 0.0F ? 0 : 1) != 0) {
            k += 1;
          }
          f7 = f6 / f3;
          if (Sisnan.sisnan(f7)) {
            f7 = 1.0F;
          }
          f6 = f7 * paramArrayOfFloat2[(j - 1 + paramInt3)] - paramFloat1;
          j += 1;
        }
      }
      n += k;
      i += 128;
    }
    f5 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] - paramFloat1;
    i = paramInt1 - 1;
    for (i2 = (paramInt4 - (paramInt1 - 1) + -128) / -128; i2 > 0; i2--)
    {
      m = 0;
      f1 = f5;
      j = i;
      for (i3 = (Math.max(i - 128 + 1, paramInt4) - i + -1) / -1; i3 > 0; i3--)
      {
        f2 = paramArrayOfFloat2[(j - 1 + paramInt3)] + f5;
        if ((f2 >= 0.0F ? 0 : 1) != 0) {
          m += 1;
        }
        f7 = f5 / f2;
        f5 = f7 * paramArrayOfFloat1[(j - 1 + paramInt2)] - paramFloat1;
        j += -1;
      }
      bool = Sisnan.sisnan(f5);
      if (bool)
      {
        m = 0;
        f5 = f1;
        j = i;
        for (i3 = (Math.max(i - 128 + 1, paramInt4) - i + -1) / -1; i3 > 0; i3--)
        {
          f2 = paramArrayOfFloat2[(j - 1 + paramInt3)] + f5;
          if ((f2 >= 0.0F ? 0 : 1) != 0) {
            m += 1;
          }
          f7 = f5 / f2;
          if (Sisnan.sisnan(f7)) {
            f7 = 1.0F;
          }
          f5 = f7 * paramArrayOfFloat1[(j - 1 + paramInt2)] - paramFloat1;
          j += -1;
        }
      }
      n += m;
      i += -128;
    }
    f4 = f6 + paramFloat1 + f5;
    if ((f4 >= 0.0F ? 0 : 1) != 0) {
      n += 1;
    }
    i1 = n;
    return i1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaneg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */