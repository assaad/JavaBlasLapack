package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dgebal
{
  public static void dgebal(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble2, int paramInt4, intW paramintW3)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
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
      Xerbla.xerbla("DGEBAL", -paramintW3.val);
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
          paramArrayOfDouble2[(j - 1 + paramInt4)] = 1.0D;
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
          paramArrayOfDouble2[(i4 - 1 + paramInt4)] = i1;
          if ((i1 != i4 ? 0 : 1) == 0)
          {
            Dswap.dswap(i3, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (i4 - 1) * paramInt3 + paramInt2, 1);
            Dswap.dswap(paramInt1 - i2 + 1, paramArrayOfDouble1, i1 - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, i4 - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i5 = m;
          if ((i5 == 1) || (i5 != 2))
          {
            if ((i3 != 1 ? 0 : 1) != 0) {
              break label1632;
            }
            i3 -= 1;
            i1 = i3;
            for (i5 = (1 - i3 + -1) / -1; i5 > 0; i5--)
            {
              j = 1;
              for (i6 = i3 - 1 + 1; i6 > 0; i6--)
              {
                if ((j != i1 ? 0 : 1) == 0) {
                  if ((paramArrayOfDouble1[(i1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
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
                if ((paramArrayOfDouble1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
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
            paramArrayOfDouble2[(j - 1 + paramInt4)] = 1.0D;
            j += 1;
          }
          if (!Lsame.lsame(paramString, "P"))
          {
            d10 = Dlamch.dlamch("S") / Dlamch.dlamch("P");
            d8 = 1.0D / d10;
            d11 = d10 * 2.0D;
            d9 = 1.0D / d11;
            do
            {
              i = 0;
              j = i2;
              for (i5 = i3 - i2 + 1; i5 > 0; i5--)
              {
                d1 = 0.0D;
                d5 = 0.0D;
                i1 = i2;
                for (i6 = i3 - i2 + 1; i6 > 0; i6--)
                {
                  if ((i1 != j ? 0 : 1) == 0)
                  {
                    d1 += Math.abs(paramArrayOfDouble1[(i1 - 1 + (j - 1) * paramInt3 + paramInt2)]);
                    d5 += Math.abs(paramArrayOfDouble1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)]);
                  }
                  i1 += 1;
                }
                k = Idamax.idamax(i3, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
                d2 = Math.abs(paramArrayOfDouble1[(k - 1 + (j - 1) * paramInt3 + paramInt2)]);
                n = Idamax.idamax(paramInt1 - i2 + 1, paramArrayOfDouble1, j - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
                d6 = Math.abs(paramArrayOfDouble1[(j - 1 + (n + i2 - 1 - 1) * paramInt3 + paramInt2)]);
                if ((d1 != 0.0D ? 0 : 1) == 0) {}
                if (((d5 != 0.0D ? 0 : 1) == 0 ? 0 : 1) == 0)
                {
                  d4 = d5 / 2.0D;
                  d3 = 1.0D;
                  d7 = d1 + d5;
                  for (;;)
                  {
                    if ((d1 < d4 ? 0 : 1) == 0) {}
                    if (((Util.max(d3, d1, d2) < d9 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
                    if (((Util.min(d5, d4, d6) > d11 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                      break;
                    }
                    d3 *= 2.0D;
                    d1 *= 2.0D;
                    d2 *= 2.0D;
                    d5 /= 2.0D;
                    d4 /= 2.0D;
                    d6 /= 2.0D;
                  }
                  d4 = d1 / 2.0D;
                  for (;;)
                  {
                    if ((d4 >= d5 ? 0 : 1) == 0) {}
                    if (((Math.max(d5, d6) < d9 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
                    if (((Math.min(Util.min(d3, d1, d4), d2) > d11 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                      break;
                    }
                    d3 /= 2.0D;
                    d1 /= 2.0D;
                    d4 /= 2.0D;
                    d2 /= 2.0D;
                    d5 *= 2.0D;
                    d6 *= 2.0D;
                  }
                  if ((d1 + d5 < 0.95D * d7 ? 0 : 1) == 0)
                  {
                    if ((d3 >= 1.0D ? 0 : 1) != 0) {}
                    if (((paramArrayOfDouble2[(j - 1 + paramInt4)] >= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      if ((d3 * paramArrayOfDouble2[(j - 1 + paramInt4)] > d10 ? 0 : 1) != 0) {}
                    }
                    else
                    {
                      if ((d3 <= 1.0D ? 0 : 1) != 0) {}
                      if (((paramArrayOfDouble2[(j - 1 + paramInt4)] <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
                      {
                        if ((paramArrayOfDouble2[(j - 1 + paramInt4)] < d8 / d3 ? 0 : 1) != 0) {}
                      }
                      else
                      {
                        d4 = 1.0D / d3;
                        paramArrayOfDouble2[(j - 1 + paramInt4)] *= d3;
                        i = 1;
                        Dscal.dscal(paramInt1 - i2 + 1, d4, paramArrayOfDouble1, j - 1 + (i2 - 1) * paramInt3 + paramInt2, paramInt3);
                        Dscal.dscal(i3, d3, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
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
    label1632:
    paramintW1.val = i2;
    paramintW2.val = i3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgebal.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */