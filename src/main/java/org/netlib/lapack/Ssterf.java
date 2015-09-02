package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssterf
{
  public static void ssterf(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
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
    float f11 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("SSTERF", -paramintW.val);
      return;
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    f5 = Slamch.slamch("E");
    f6 = (float)Math.pow(f5, 2);
    f15 = Slamch.slamch("S");
    f14 = 1.0F / f15;
    f17 = (float)Math.sqrt(f14) / 3.0F;
    f18 = (float)Math.sqrt(f15) / f6;
    i5 = paramInt1 * 30;
    f16 = 0.0F;
    k = 0;
    n = 1;
    while ((n <= paramInt1 ? 0 : 1) == 0)
    {
      if ((n <= 1 ? 0 : 1) != 0) {
        paramArrayOfFloat2[(n - 1 - 1 + paramInt3)] = 0.0F;
      }
      i4 = n;
      for (int i6 = paramInt1 - 1 - n + 1; i6 > 0; i6--)
      {
        if ((Math.abs(paramArrayOfFloat2[(i4 - 1 + paramInt3)]) > (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt2)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i4 + 1 - 1 + paramInt2)])) * f5 ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(i4 - 1 + paramInt3)] = 0.0F;
          break;
        }
        i4 += 1;
      }
      i4 = paramInt1;
      m = n;
      i3 = m;
      i1 = i4;
      i2 = i1;
      n = i4 + 1;
      if ((i1 != m ? 0 : 1) == 0)
      {
        f2 = Slanst.slanst("I", i1 - m + 1, paramArrayOfFloat1, m - 1 + paramInt2, paramArrayOfFloat2, m - 1 + paramInt3);
        j = 0;
        if ((f2 <= f17 ? 0 : 1) != 0)
        {
          j = 1;
          Slascl.slascl("G", 0, 0, f2, f17, i1 - m + 1, 1, paramArrayOfFloat1, m - 1 + paramInt2, paramInt1, paramintW);
          Slascl.slascl("G", 0, 0, f2, f17, i1 - m, 1, paramArrayOfFloat2, m - 1 + paramInt3, paramInt1, paramintW);
        }
        else if ((f2 >= f18 ? 0 : 1) != 0)
        {
          j = 2;
          Slascl.slascl("G", 0, 0, f2, f18, i1 - m + 1, 1, paramArrayOfFloat1, m - 1 + paramInt2, paramInt1, paramintW);
          Slascl.slascl("G", 0, 0, f2, f18, i1 - m, 1, paramArrayOfFloat2, m - 1 + paramInt3, paramInt1, paramintW);
        }
        i = m;
        for (i6 = i1 - 1 - m + 1; i6 > 0; i6--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt3)] = ((float)Math.pow(paramArrayOfFloat2[(i - 1 + paramInt3)], 2));
          i += 1;
        }
        if ((Math.abs(paramArrayOfFloat1[(i1 - 1 + paramInt2)]) >= Math.abs(paramArrayOfFloat1[(m - 1 + paramInt2)]) ? 0 : 1) != 0)
        {
          i1 = i3;
          m = i2;
        }
        if ((i1 < m ? 0 : 1) != 0)
        {
          do
          {
            for (;;)
            {
              if ((m == i1 ? 0 : 1) != 0)
              {
                i4 = m;
                for (i6 = i1 - 1 - m + 1; i6 > 0; i6--)
                {
                  if ((Math.abs(paramArrayOfFloat2[(i4 - 1 + paramInt3)]) > f6 * Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt2)] * paramArrayOfFloat1[(i4 + 1 - 1 + paramInt2)]) ? 0 : 1) != 0) {
                    break;
                  }
                  i4 += 1;
                }
              }
              i4 = i1;
              if ((i4 >= i1 ? 0 : 1) != 0) {
                paramArrayOfFloat2[(i4 - 1 + paramInt3)] = 0.0F;
              }
              f10 = paramArrayOfFloat1[(m - 1 + paramInt2)];
              if ((i4 != m ? 0 : 1) != 0) {
                break;
              }
              if ((i4 != m + 1 ? 0 : 1) != 0)
              {
                f12 = (float)Math.sqrt(paramArrayOfFloat2[(m - 1 + paramInt3)]);
                Slae2.slae2(paramArrayOfFloat1[(m - 1 + paramInt2)], f12, paramArrayOfFloat1[(m + 1 - 1 + paramInt2)], localfloatW1, localfloatW2);
                paramArrayOfFloat1[(m - 1 + paramInt2)] = localfloatW1.val;
                paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] = localfloatW2.val;
                paramArrayOfFloat2[(m - 1 + paramInt3)] = 0.0F;
                m += 2;
                if ((m > i1 ? 0 : 1) == 0) {
                  break label2013;
                }
              }
              else
              {
                if ((k != i5 ? 0 : 1) != 0) {
                  break label2013;
                }
                k += 1;
                f12 = (float)Math.sqrt(paramArrayOfFloat2[(m - 1 + paramInt3)]);
                f16 = (paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] - f10) / (2.0F * f12);
                f11 = Slapy2.slapy2(f16, 1.0F);
                f16 = f10 - f12 / (f16 + Util.sign(f11, f16));
                f4 = 1.0F;
                f13 = 0.0F;
                f7 = paramArrayOfFloat1[(i4 - 1 + paramInt2)] - f16;
                f10 = f7 * f7;
                i = i4 - 1;
                for (i6 = (m - (i4 - 1) + -1) / -1; i6 > 0; i6--)
                {
                  f3 = paramArrayOfFloat2[(i - 1 + paramInt3)];
                  f11 = f10 + f3;
                  if ((i == i4 - 1 ? 0 : 1) != 0) {
                    paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = (f13 * f11);
                  }
                  f8 = f4;
                  f4 = f10 / f11;
                  f13 = f3 / f11;
                  f9 = f7;
                  f1 = paramArrayOfFloat1[(i - 1 + paramInt2)];
                  f7 = f4 * (f1 - f16) - f13 * f9;
                  paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] = (f9 + (f1 - f7));
                  if ((f4 == 0.0F ? 0 : 1) != 0) {
                    f10 = f7 * f7 / f4;
                  } else {
                    f10 = f8 * f3;
                  }
                  i += -1;
                }
                paramArrayOfFloat2[(m - 1 + paramInt3)] = (f13 * f10);
                paramArrayOfFloat1[(m - 1 + paramInt2)] = (f16 + f7);
              }
            }
            paramArrayOfFloat1[(m - 1 + paramInt2)] = f10;
            m += 1;
          } while ((m > i1 ? 0 : 1) != 0);
          break label2013;
        }
        else
        {
          for (;;)
          {
            i4 = m;
            i6 = (i1 + 1 - m + -1) / -1;
            while ((Math.abs(paramArrayOfFloat2[(i4 - 1 - 1 + paramInt3)]) > f6 * Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt2)] * paramArrayOfFloat1[(i4 - 1 - 1 + paramInt2)]) ? 0 : 1) == 0)
            {
              i4 += -1;
              i6--;
              if (i6 <= 0) {
                i4 = i1;
              }
            }
            if ((i4 <= i1 ? 0 : 1) != 0) {
              paramArrayOfFloat2[(i4 - 1 - 1 + paramInt3)] = 0.0F;
            }
            f10 = paramArrayOfFloat1[(m - 1 + paramInt2)];
            if ((i4 != m ? 0 : 1) == 0)
            {
              if ((i4 != m - 1 ? 0 : 1) != 0)
              {
                f12 = (float)Math.sqrt(paramArrayOfFloat2[(m - 1 - 1 + paramInt3)]);
                Slae2.slae2(paramArrayOfFloat1[(m - 1 + paramInt2)], f12, paramArrayOfFloat1[(m - 1 - 1 + paramInt2)], localfloatW1, localfloatW2);
                paramArrayOfFloat1[(m - 1 + paramInt2)] = localfloatW1.val;
                paramArrayOfFloat1[(m - 1 - 1 + paramInt2)] = localfloatW2.val;
                paramArrayOfFloat2[(m - 1 - 1 + paramInt3)] = 0.0F;
                m -= 2;
                if ((m < i1 ? 0 : 1) == 0) {
                  break;
                }
              }
              else if ((k != i5 ? 0 : 1) == 0)
              {
                k += 1;
                f12 = (float)Math.sqrt(paramArrayOfFloat2[(m - 1 - 1 + paramInt3)]);
                f16 = (paramArrayOfFloat1[(m - 1 - 1 + paramInt2)] - f10) / (2.0F * f12);
                f11 = Slapy2.slapy2(f16, 1.0F);
                f16 = f10 - f12 / (f16 + Util.sign(f11, f16));
                f4 = 1.0F;
                f13 = 0.0F;
                f7 = paramArrayOfFloat1[(i4 - 1 + paramInt2)] - f16;
                f10 = f7 * f7;
                i = i4;
                for (i6 = m - 1 - i4 + 1; i6 > 0; i6--)
                {
                  f3 = paramArrayOfFloat2[(i - 1 + paramInt3)];
                  f11 = f10 + f3;
                  if ((i == i4 ? 0 : 1) != 0) {
                    paramArrayOfFloat2[(i - 1 - 1 + paramInt3)] = (f13 * f11);
                  }
                  f8 = f4;
                  f4 = f10 / f11;
                  f13 = f3 / f11;
                  f9 = f7;
                  f1 = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)];
                  f7 = f4 * (f1 - f16) - f13 * f9;
                  paramArrayOfFloat1[(i - 1 + paramInt2)] = (f9 + (f1 - f7));
                  if ((f4 == 0.0F ? 0 : 1) != 0) {
                    f10 = f7 * f7 / f4;
                  } else {
                    f10 = f8 * f3;
                  }
                  i += 1;
                }
                paramArrayOfFloat2[(m - 1 - 1 + paramInt3)] = (f13 * f10);
                paramArrayOfFloat1[(m - 1 + paramInt2)] = (f16 + f7);
              }
            }
            else
            {
              paramArrayOfFloat1[(m - 1 + paramInt2)] = f10;
              m -= 1;
              if ((m < i1 ? 0 : 1) == 0) {
                break;
              }
            }
          }
        }
        label2013:
        if ((j != 1 ? 0 : 1) != 0) {
          Slascl.slascl("G", 0, 0, f17, f2, i2 - i3 + 1, 1, paramArrayOfFloat1, i3 - 1 + paramInt2, paramInt1, paramintW);
        }
        if ((j != 2 ? 0 : 1) != 0) {
          Slascl.slascl("G", 0, 0, f18, f2, i2 - i3 + 1, 1, paramArrayOfFloat1, i3 - 1 + paramInt2, paramInt1, paramintW);
        }
        if ((k >= i5 ? 0 : 1) == 0)
        {
          i = 1;
          for (i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
          {
            if ((paramArrayOfFloat2[(i - 1 + paramInt3)] == 0.0F ? 0 : 1) != 0) {
              paramintW.val += 1;
            }
            i += 1;
          }
          return;
        }
      }
    }
    Slasrt.slasrt("I", paramInt1, paramArrayOfFloat1, paramInt2, paramintW);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssterf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */