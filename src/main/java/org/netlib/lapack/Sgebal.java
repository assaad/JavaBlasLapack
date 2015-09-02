package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sgebal
{
  public static void sgebal(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat2, int paramInt4, intW paramintW3)
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
    paramintW3.val = 0;
    if ((((Lsame.lsame(paramString, "N") ^ true)) && ((Lsame.lsame(paramString, "P") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "S") ^ true) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "B") ^ true) ? 1 : 0) != 0) {
      paramintW3.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW3.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW3.val = -4;
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEBAL", -paramintW3.val);
      return;
    }
    i2 = 1;
    i3 = paramInt1;
    if ((paramInt1 != 0 ? 0 : 1) == 0)
    {
      int i5;
      if (Lsame.lsame(paramString, "N"))
      {
        j = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat2[(j - 1 + paramInt4)] = 1.0F;
          j += 1;
        }
      }
      else
      {
        label464:
        int i6;
        if (!Lsame.lsame(paramString, "S"))
        {
          break label464;
          paramArrayOfFloat2[(i4 - 1 + paramInt4)] = i1;
          if ((i1 != i4 ? 0 : 1) == 0)
          {
            Sswap.sswap(i3, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i4 - 1) * paramInt3 + paramInt2, 1);
            Sswap.sswap(paramInt1 - i2 + 1, paramArrayOfFloat1, i1 - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, i4 - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i5 = m;
          if ((i5 == 1) || (i5 != 2))
          {
            if ((i3 != 1 ? 0 : 1) != 0) {
              break label1601;
            }
            i3 -= 1;
            i1 = i3;
            for (i5 = (1 - i3 + -1) / -1; i5 > 0; i5--)
            {
              j = 1;
              for (i6 = i3 - 1 + 1; i6 > 0; i6--)
              {
                if ((j != i1 ? 0 : 1) == 0) {
                  if ((paramArrayOfFloat1[(i1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
                    break;
                  }
                }
                j += 1;
              }
              i4 = i3;
              m = 1;
              break;
              i1 += -1;
            }
          }
          else
          {
            i2 += 1;
          }
          i1 = i2;
          for (i5 = i3 - i2 + 1; i5 > 0; i5--)
          {
            j = i2;
            for (i6 = i3 - i2 + 1; i6 > 0; i6--)
            {
              if ((j != i1 ? 0 : 1) == 0) {
                if ((paramArrayOfFloat1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
                  break;
                }
              }
              j += 1;
            }
            i4 = i2;
            m = 2;
            break;
            i1 += 1;
          }
        }
        else
        {
          j = i2;
          for (i5 = i3 - i2 + 1; i5 > 0; i5--)
          {
            paramArrayOfFloat2[(j - 1 + paramInt4)] = 1.0F;
            j += 1;
          }
          if (!Lsame.lsame(paramString, "P"))
          {
            f10 = Slamch.slamch("S") / Slamch.slamch("P");
            f8 = 1.0F / f10;
            f11 = f10 * 2.0F;
            f9 = 1.0F / f11;
            do
            {
              i = 0;
              j = i2;
              for (i5 = i3 - i2 + 1; i5 > 0; i5--)
              {
                f1 = 0.0F;
                f5 = 0.0F;
                i1 = i2;
                for (i6 = i3 - i2 + 1; i6 > 0; i6--)
                {
                  if ((i1 != j ? 0 : 1) == 0)
                  {
                    f1 += Math.abs(paramArrayOfFloat1[(i1 - 1 + (j - 1) * paramInt3 + paramInt2)]);
                    f5 += Math.abs(paramArrayOfFloat1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)]);
                  }
                  i1 += 1;
                }
                k = Isamax.isamax(i3, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
                f2 = Math.abs(paramArrayOfFloat1[(k - 1 + (j - 1) * paramInt3 + paramInt2)]);
                n = Isamax.isamax(paramInt1 - i2 + 1, paramArrayOfFloat1, j - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
                f6 = Math.abs(paramArrayOfFloat1[(j - 1 + (n + i2 - 1 - 1) * paramInt3 + paramInt2)]);
                if ((f1 != 0.0F ? 0 : 1) == 0) {}
                if (((f5 != 0.0F ? 0 : 1) == 0 ? 0 : 1) == 0)
                {
                  f4 = f5 / 2.0F;
                  f3 = 1.0F;
                  f7 = f1 + f5;
                  for (;;)
                  {
                    if ((f1 < f4 ? 0 : 1) == 0) {}
                    if (((Util.max(f3, f1, f2) < f9 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
                    if (((Util.min(f5, f4, f6) > f11 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                      break;
                    }
                    f3 *= 2.0F;
                    f1 *= 2.0F;
                    f2 *= 2.0F;
                    f5 /= 2.0F;
                    f4 /= 2.0F;
                    f6 /= 2.0F;
                  }
                  f4 = f1 / 2.0F;
                  for (;;)
                  {
                    if ((f4 >= f5 ? 0 : 1) == 0) {}
                    if (((Math.max(f5, f6) < f9 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
                    if (((Math.min(Util.min(f3, f1, f4), f2) > f11 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                      break;
                    }
                    f3 /= 2.0F;
                    f1 /= 2.0F;
                    f4 /= 2.0F;
                    f2 /= 2.0F;
                    f5 *= 2.0F;
                    f6 *= 2.0F;
                  }
                  if ((f1 + f5 < 0.95F * f7 ? 0 : 1) == 0)
                  {
                    if ((f3 >= 1.0F ? 0 : 1) != 0) {}
                    if (((paramArrayOfFloat2[(j - 1 + paramInt4)] >= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      if ((f3 * paramArrayOfFloat2[(j - 1 + paramInt4)] > f10 ? 0 : 1) != 0) {}
                    }
                    else
                    {
                      if ((f3 <= 1.0F ? 0 : 1) != 0) {}
                      if (((paramArrayOfFloat2[(j - 1 + paramInt4)] <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
                      {
                        if ((paramArrayOfFloat2[(j - 1 + paramInt4)] < f8 / f3 ? 0 : 1) != 0) {}
                      }
                      else
                      {
                        f4 = 1.0F / f3;
                        paramArrayOfFloat2[(j - 1 + paramInt4)] *= f3;
                        i = 1;
                        Sscal.sscal(paramInt1 - i2 + 1, f4, paramArrayOfFloat1, j - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
                        Sscal.sscal(i3, f3, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
                      }
                    }
                  }
                }
                j += 1;
              }
            } while (i != 0);
          }
        }
      }
    }
    label1601:
    paramintW1.val = i2;
    paramintW2.val = i3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgebal.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */