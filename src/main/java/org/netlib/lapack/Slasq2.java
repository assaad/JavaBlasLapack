package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasq2
{
  public static void slasq2(int paramInt1, float[] paramArrayOfFloat, int paramInt2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    intW localintW1 = new intW(0);
    int k = 0;
    intW localintW2 = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW3 = new intW(0);
    int i2 = 0;
    intW localintW4 = new intW(0);
    intW localintW5 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    intW localintW6 = new intW(0);
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    floatW localfloatW8 = new floatW(0.0F);
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    floatW localfloatW9 = new floatW(0.0F);
    float f10 = 0.0F;
    floatW localfloatW10 = new floatW(0.0F);
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    paramintW.val = 0;
    f5 = Slamch.slamch("Precision");
    f9 = Slamch.slamch("Safe minimum");
    f12 = f5 * 100.0F;
    f13 = (float)Math.pow(f12, 2);
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("SLASQ2", 1);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfFloat[(1 - 1 + paramInt2)] >= 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = 65335;
        Xerbla.xerbla("SLASQ2", 2);
      }
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((paramArrayOfFloat[(2 - 1 + paramInt2)] >= 0.0F ? 0 : 1) == 0) {}
      if (((paramArrayOfFloat[(3 - 1 + paramInt2)] >= 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
        Xerbla.xerbla("SLASQ2", 2);
        return;
      }
      if ((paramArrayOfFloat[(3 - 1 + paramInt2)] <= paramArrayOfFloat[(1 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        f1 = paramArrayOfFloat[(3 - 1 + paramInt2)];
        paramArrayOfFloat[(3 - 1 + paramInt2)] = paramArrayOfFloat[(1 - 1 + paramInt2)];
        paramArrayOfFloat[(1 - 1 + paramInt2)] = f1;
      }
      paramArrayOfFloat[(5 - 1 + paramInt2)] = (paramArrayOfFloat[(1 - 1 + paramInt2)] + paramArrayOfFloat[(2 - 1 + paramInt2)] + paramArrayOfFloat[(3 - 1 + paramInt2)]);
      if ((paramArrayOfFloat[(2 - 1 + paramInt2)] <= paramArrayOfFloat[(3 - 1 + paramInt2)] * f13 ? 0 : 1) != 0)
      {
        f10 = 0.5F * (paramArrayOfFloat[(1 - 1 + paramInt2)] - paramArrayOfFloat[(3 - 1 + paramInt2)] + paramArrayOfFloat[(2 - 1 + paramInt2)]);
        f8 = paramArrayOfFloat[(3 - 1 + paramInt2)] * (paramArrayOfFloat[(2 - 1 + paramInt2)] / f10);
        if ((f8 > f10 ? 0 : 1) != 0) {
          f8 = paramArrayOfFloat[(3 - 1 + paramInt2)] * (paramArrayOfFloat[(2 - 1 + paramInt2)] / (f10 * (1.0F + (float)Math.sqrt(1.0F + f8 / f10))));
        } else {
          f8 = paramArrayOfFloat[(3 - 1 + paramInt2)] * (paramArrayOfFloat[(2 - 1 + paramInt2)] / (f10 + (float)Math.sqrt(f10) * (float)Math.sqrt(f10 + f8)));
        }
        f10 = paramArrayOfFloat[(1 - 1 + paramInt2)] + (f8 + paramArrayOfFloat[(2 - 1 + paramInt2)]);
        paramArrayOfFloat[(3 - 1 + paramInt2)] *= paramArrayOfFloat[(1 - 1 + paramInt2)] / f10;
        paramArrayOfFloat[(1 - 1 + paramInt2)] = f10;
      }
      paramArrayOfFloat[(2 - 1 + paramInt2)] = paramArrayOfFloat[(3 - 1 + paramInt2)];
      paramArrayOfFloat[(6 - 1 + paramInt2)] = (paramArrayOfFloat[(2 - 1 + paramInt2)] + paramArrayOfFloat[(1 - 1 + paramInt2)]);
      return;
    }
    paramArrayOfFloat[(2 * paramInt1 - 1 + paramInt2)] = 0.0F;
    f4 = paramArrayOfFloat[(2 - 1 + paramInt2)];
    localfloatW8.val = 0.0F;
    f15 = 0.0F;
    f1 = 0.0F;
    f2 = 0.0F;
    i1 = 1;
    for (int i5 = (2 * (paramInt1 - 1) - 1 + 2) / 2; i5 > 0; i5--)
    {
      if ((paramArrayOfFloat[(i1 - 1 + paramInt2)] >= 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = (-(200 + i1));
        Xerbla.xerbla("SLASQ2", 2);
        return;
      }
      if ((paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)] >= 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = (-(200 + i1 + 1));
        Xerbla.xerbla("SLASQ2", 2);
        return;
      }
      f1 += paramArrayOfFloat[(i1 - 1 + paramInt2)];
      f2 += paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)];
      localfloatW8.val = Math.max(localfloatW8.val, paramArrayOfFloat[(i1 - 1 + paramInt2)]);
      f4 = Math.min(f4, paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)]);
      f15 = Util.max(localfloatW8.val, f15, paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)]);
      i1 += 2;
    }
    if ((paramArrayOfFloat[(2 * paramInt1 - 1 - 1 + paramInt2)] >= 0.0F ? 0 : 1) != 0)
    {
      paramintW.val = (-(200 + 2 * paramInt1 - 1));
      Xerbla.xerbla("SLASQ2", 2);
      return;
    }
    f1 += paramArrayOfFloat[(2 * paramInt1 - 1 - 1 + paramInt2)];
    localfloatW8.val = Math.max(localfloatW8.val, paramArrayOfFloat[(2 * paramInt1 - 1 - 1 + paramInt2)]);
    f15 = Math.max(localfloatW8.val, f15);
    if ((f2 != 0.0F ? 0 : 1) != 0)
    {
      i1 = 2;
      for (i5 = paramInt1 - 2 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat[(i1 - 1 + paramInt2)] = paramArrayOfFloat[(2 * i1 - 1 - 1 + paramInt2)];
        i1 += 1;
      }
      Slasrt.slasrt("D", paramInt1, paramArrayOfFloat, paramInt2, localintW1);
      paramArrayOfFloat[(2 * paramInt1 - 1 - 1 + paramInt2)] = f1;
      return;
    }
    f14 = f1 + f2;
    if ((f14 != 0.0F ? 0 : 1) != 0)
    {
      paramArrayOfFloat[(2 * paramInt1 - 1 - 1 + paramInt2)] = 0.0F;
      return;
    }
    if ((Ilaenv.ilaenv(10, "SLASQ2", "N", 1, 2, 3, 4) != 1 ? 0 : 1) != 0) {}
    bool = (Ilaenv.ilaenv(11, "SLASQ2", "N", 1, 2, 3, 4) != 1 ? 0 : 1) != 0;
    i1 = 2 * paramInt1;
    for (i5 = (2 - 2 * paramInt1 + -2) / -2; i5 > 0; i5--)
    {
      paramArrayOfFloat[(2 * i1 - 1 + paramInt2)] = 0.0F;
      paramArrayOfFloat[(2 * i1 - 1 - 1 + paramInt2)] = paramArrayOfFloat[(i1 - 1 + paramInt2)];
      paramArrayOfFloat[(2 * i1 - 2 - 1 + paramInt2)] = 0.0F;
      paramArrayOfFloat[(2 * i1 - 3 - 1 + paramInt2)] = paramArrayOfFloat[(i1 - 1 - 1 + paramInt2)];
      i1 += -2;
    }
    i = 1;
    localintW3.val = paramInt1;
    if ((1.5F * paramArrayOfFloat[(4 * i - 3 - 1 + paramInt2)] >= paramArrayOfFloat[(4 * localintW3.val - 3 - 1 + paramInt2)] ? 0 : 1) != 0)
    {
      k = 4 * (i + localintW3.val);
      j = 4 * i;
      for (i5 = (2 * (i + localintW3.val - 1) - 4 * i + 4) / 4; i5 > 0; i5--)
      {
        f11 = paramArrayOfFloat[(j - 3 - 1 + paramInt2)];
        paramArrayOfFloat[(j - 3 - 1 + paramInt2)] = paramArrayOfFloat[(k - j - 3 - 1 + paramInt2)];
        paramArrayOfFloat[(k - j - 3 - 1 + paramInt2)] = f11;
        f11 = paramArrayOfFloat[(j - 1 - 1 + paramInt2)];
        paramArrayOfFloat[(j - 1 - 1 + paramInt2)] = paramArrayOfFloat[(k - j - 5 - 1 + paramInt2)];
        paramArrayOfFloat[(k - j - 5 - 1 + paramInt2)] = f11;
        j += 4;
      }
    }
    i3 = 0;
    i1 = 1;
    int i6;
    for (i5 = 2 - 1 + 1; i5 > 0; i5--)
    {
      f1 = paramArrayOfFloat[(4 * localintW3.val + i3 - 3 - 1 + paramInt2)];
      j = 4 * (localintW3.val - 1) + i3;
      for (i6 = (4 * i + i3 - (4 * (localintW3.val - 1) + i3) + -4) / -4; i6 > 0; i6--)
      {
        if ((paramArrayOfFloat[(j - 1 - 1 + paramInt2)] > f13 * f1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(j - 1 - 1 + paramInt2)] = 0.0F;
          f1 = paramArrayOfFloat[(j - 3 - 1 + paramInt2)];
        }
        else
        {
          f1 = paramArrayOfFloat[(j - 3 - 1 + paramInt2)] * (f1 / (f1 + paramArrayOfFloat[(j - 1 - 1 + paramInt2)]));
        }
        j += -4;
      }
      f4 = paramArrayOfFloat[(4 * i + i3 + 1 - 1 + paramInt2)];
      f1 = paramArrayOfFloat[(4 * i + i3 - 3 - 1 + paramInt2)];
      j = 4 * i + i3;
      for (i6 = (4 * (localintW3.val - 1) + i3 - (4 * i + i3) + 4) / 4; i6 > 0; i6--)
      {
        paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)] = (f1 + paramArrayOfFloat[(j - 1 - 1 + paramInt2)]);
        if ((paramArrayOfFloat[(j - 1 - 1 + paramInt2)] > f13 * f1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(j - 1 - 1 + paramInt2)] = 0.0F;
          paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)] = f1;
          paramArrayOfFloat[(j - 2 * i3 - 1 + paramInt2)] = 0.0F;
          f1 = paramArrayOfFloat[(j + 1 - 1 + paramInt2)];
        }
        else
        {
          if ((f9 * paramArrayOfFloat[(j + 1 - 1 + paramInt2)] >= paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)] ? 0 : 1) != 0) {}
          if (((f9 * paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)] >= paramArrayOfFloat[(j + 1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f11 = paramArrayOfFloat[(j + 1 - 1 + paramInt2)] / paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)];
            paramArrayOfFloat[(j - 2 * i3 - 1 + paramInt2)] = (paramArrayOfFloat[(j - 1 - 1 + paramInt2)] * f11);
            f1 *= f11;
          }
          else
          {
            paramArrayOfFloat[(j - 2 * i3 - 1 + paramInt2)] = (paramArrayOfFloat[(j + 1 - 1 + paramInt2)] * (paramArrayOfFloat[(j - 1 - 1 + paramInt2)] / paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)]));
            f1 = paramArrayOfFloat[(j + 1 - 1 + paramInt2)] * (f1 / paramArrayOfFloat[(j - 2 * i3 - 2 - 1 + paramInt2)]);
          }
        }
        f4 = Math.min(f4, paramArrayOfFloat[(j - 2 * i3 - 1 + paramInt2)]);
        j += 4;
      }
      paramArrayOfFloat[(4 * localintW3.val - i3 - 2 - 1 + paramInt2)] = f1;
      localfloatW8.val = paramArrayOfFloat[(4 * i - i3 - 2 - 1 + paramInt2)];
      j = 4 * i - i3 + 2;
      for (i6 = (4 * localintW3.val - i3 - 2 - (4 * i - i3 + 2) + 4) / 4; i6 > 0; i6--)
      {
        localfloatW8.val = Math.max(localfloatW8.val, paramArrayOfFloat[(j - 1 + paramInt2)]);
        j += 4;
      }
      i3 = 1 - i3;
      i1 += 1;
    }
    localintW6.val = 0;
    localfloatW3.val = 0.0F;
    localfloatW4.val = 0.0F;
    localfloatW5.val = 0.0F;
    localfloatW6.val = 0.0F;
    localfloatW7.val = 0.0F;
    localfloatW10.val = 0.0F;
    localintW2.val = 2;
    localintW5.val = 0;
    localintW4.val = (2 * (localintW3.val - i));
    m = 1;
    i5 = paramInt1 + 1 - 1 + 1;
    while ((localintW3.val >= 1 ? 0 : 1) == 0)
    {
      localfloatW1.val = 0.0F;
      if ((localintW3.val != paramInt1 ? 0 : 1) != 0) {
        localfloatW9.val = 0.0F;
      } else {
        localfloatW9.val = (-paramArrayOfFloat[(4 * localintW3.val - 1 - 1 + paramInt2)]);
      }
      if ((localfloatW9.val >= 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        return;
      }
      f3 = 0.0F;
      if ((localintW3.val <= i ? 0 : 1) != 0) {
        f4 = Math.abs(paramArrayOfFloat[(4 * localintW3.val - 5 - 1 + paramInt2)]);
      } else {
        f4 = 0.0F;
      }
      f7 = paramArrayOfFloat[(4 * localintW3.val - 3 - 1 + paramInt2)];
      localfloatW8.val = f7;
      j = 4 * localintW3.val;
      i6 = (8 - 4 * localintW3.val + -4) / -4;
      while ((paramArrayOfFloat[(j - 5 - 1 + paramInt2)] > 0.0F ? 0 : 1) == 0)
      {
        if ((f7 < 4.0F * f3 ? 0 : 1) != 0)
        {
          f7 = Math.min(f7, paramArrayOfFloat[(j - 3 - 1 + paramInt2)]);
          f3 = Math.max(f3, paramArrayOfFloat[(j - 5 - 1 + paramInt2)]);
        }
        localfloatW8.val = Math.max(localfloatW8.val, paramArrayOfFloat[(j - 7 - 1 + paramInt2)] + paramArrayOfFloat[(j - 5 - 1 + paramInt2)]);
        f4 = Math.min(f4, paramArrayOfFloat[(j - 5 - 1 + paramInt2)]);
        j += -4;
        i6--;
        if (i6 <= 0) {
          j = 4;
        }
      }
      i = j / 4;
      paramArrayOfFloat[(4 * localintW3.val - 1 - 1 + paramInt2)] = f4;
      localfloatW2.val = (-Math.max(0.0F, f7 - 2.0F * (float)Math.sqrt(f7) * (float)Math.sqrt(f3)));
      i3 = 0;
      i2 = 30 * (localintW3.val - i + 1);
      n = 1;
      i6 = i2 - 1 + 1;
      while ((i <= localintW3.val ? 0 : 1) == 0)
      {
        Slazq3.slazq3(i, localintW3, paramArrayOfFloat, paramInt2, i3, localfloatW2, localfloatW9, localfloatW1, localfloatW8, localintW5, localintW2, localintW4, bool, localintW6, localfloatW3, localfloatW4, localfloatW5, localfloatW6, localfloatW7, localfloatW10);
        i3 = 1 - i3;
        if ((i3 != 0 ? 0 : 1) != 0) {}
        if (((localintW3.val - i < 3 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if ((paramArrayOfFloat[(4 * localintW3.val - 1 + paramInt2)] > f13 * localfloatW8.val ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat[(4 * localintW3.val - 1 - 1 + paramInt2)] > f13 * localfloatW9.val ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            i4 = i - 1;
            localfloatW8.val = paramArrayOfFloat[(4 * i - 3 - 1 + paramInt2)];
            f4 = paramArrayOfFloat[(4 * i - 1 - 1 + paramInt2)];
            f6 = paramArrayOfFloat[(4 * i - 1 + paramInt2)];
            j = 4 * i;
            for (int i7 = (4 * (localintW3.val - 3) - 4 * i + 4) / 4; i7 > 0; i7--)
            {
              if ((paramArrayOfFloat[(j - 1 + paramInt2)] > f13 * paramArrayOfFloat[(j - 3 - 1 + paramInt2)] ? 0 : 1) == 0) {}
              if (((paramArrayOfFloat[(j - 1 - 1 + paramInt2)] > f13 * localfloatW9.val ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfFloat[(j - 1 - 1 + paramInt2)] = (-localfloatW9.val);
                i4 = j / 4;
                localfloatW8.val = 0.0F;
                f4 = paramArrayOfFloat[(j + 3 - 1 + paramInt2)];
                f6 = paramArrayOfFloat[(j + 4 - 1 + paramInt2)];
              }
              else
              {
                localfloatW8.val = Math.max(localfloatW8.val, paramArrayOfFloat[(j + 1 - 1 + paramInt2)]);
                f4 = Math.min(f4, paramArrayOfFloat[(j - 1 - 1 + paramInt2)]);
                f6 = Math.min(f6, paramArrayOfFloat[(j - 1 + paramInt2)]);
              }
              j += 4;
            }
            paramArrayOfFloat[(4 * localintW3.val - 1 - 1 + paramInt2)] = f4;
            paramArrayOfFloat[(4 * localintW3.val - 1 + paramInt2)] = f6;
            i = i4 + 1;
          }
        }
        n += 1;
        i6--;
        if (i6 <= 0)
        {
          paramintW.val = 2;
          return;
        }
      }
      m += 1;
      i5--;
      if (i5 <= 0)
      {
        paramintW.val = 3;
        return;
      }
    }
    i1 = 2;
    for (i5 = paramInt1 - 2 + 1; i5 > 0; i5--)
    {
      paramArrayOfFloat[(i1 - 1 + paramInt2)] = paramArrayOfFloat[(4 * i1 - 3 - 1 + paramInt2)];
      i1 += 1;
    }
    Slasrt.slasrt("D", paramInt1, paramArrayOfFloat, paramInt2, localintW1);
    f2 = 0.0F;
    i1 = paramInt1;
    for (i5 = (1 - paramInt1 + -1) / -1; i5 > 0; i5--)
    {
      f2 += paramArrayOfFloat[(i1 - 1 + paramInt2)];
      i1 += -1;
    }
    paramArrayOfFloat[(2 * paramInt1 + 1 - 1 + paramInt2)] = f14;
    paramArrayOfFloat[(2 * paramInt1 + 2 - 1 + paramInt2)] = f2;
    paramArrayOfFloat[(2 * paramInt1 + 3 - 1 + paramInt2)] = localintW2.val;
    paramArrayOfFloat[(2 * paramInt1 + 4 - 1 + paramInt2)] = (localintW4.val / (int)Math.pow(paramInt1, 2));
    paramArrayOfFloat[(2 * paramInt1 + 5 - 1 + paramInt2)] = (100.0F * localintW5.val / localintW2.val);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasq2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */