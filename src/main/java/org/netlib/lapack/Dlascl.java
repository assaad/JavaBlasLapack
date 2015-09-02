package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlascl
{
  public static void dlascl(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    paramintW.val = 0;
    if (Lsame.lsame(paramString, "G")) {
      k = 0;
    } else if (Lsame.lsame(paramString, "L")) {
      k = 1;
    } else if (Lsame.lsame(paramString, "U")) {
      k = 2;
    } else if (Lsame.lsame(paramString, "H")) {
      k = 3;
    } else if (Lsame.lsame(paramString, "B")) {
      k = 4;
    } else if (Lsame.lsame(paramString, "Q")) {
      k = 5;
    } else if (Lsame.lsame(paramString, "Z")) {
      k = 6;
    } else {
      k = -1;
    }
    if ((k != -1 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {
        if ((k != 4 ? 0 : 1) == 0) {}
      }
      if ((((paramInt4 == paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if ((k != 5 ? 0 : 1) == 0) {}
      }
      if ((((paramInt4 == paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else
      {
        if ((k > 3 ? 0 : 1) != 0) {}
        if (((paramInt6 >= Math.max(1, paramInt3) ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -9;
        }
        else if ((k < 4 ? 0 : 1) != 0)
        {
          if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
          if (((paramInt1 <= Math.max(paramInt3 - 1, 0) ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            paramintW.val = -2;
          }
          else
          {
            if ((paramInt2 >= 0 ? 0 : 1) == 0) {}
            if (((paramInt2 <= Math.max(paramInt4 - 1, 0) ? 0 : 1) == 0 ? 0 : 1) == 0)
            {
              if ((k != 4 ? 0 : 1) == 0) {}
              if (((k != 5 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
            }
            if ((((paramInt1 == paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
            {
              paramintW.val = -3;
            }
            else
            {
              if ((k != 4 ? 0 : 1) != 0) {}
              if (((paramInt6 >= paramInt1 + 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
                if ((k != 5 ? 0 : 1) == 0) {}
              }
              if ((((paramInt6 >= paramInt2 + 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
                if ((k != 6 ? 0 : 1) == 0) {}
              }
              if ((((paramInt6 >= 2 * paramInt1 + paramInt2 + 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
                paramintW.val = -9;
              }
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASCL", -paramintW.val);
      return;
    }
    if ((paramInt4 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    d7 = Dlamch.dlamch("S");
    d1 = 1.0D / d7;
    d3 = paramDouble1;
    d5 = paramDouble2;
    do
    {
      d2 = d3 * d7;
      d4 = d5 / d1;
      if ((Math.abs(d2) <= Math.abs(d5) ? 0 : 1) != 0) {}
      if (((d5 == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        d6 = d7;
        i = 0;
        d3 = d2;
      }
      else if ((Math.abs(d4) <= Math.abs(d3) ? 0 : 1) != 0)
      {
        d6 = d1;
        i = 0;
        d5 = d4;
      }
      else
      {
        d6 = d5 / d3;
        i = 1;
      }
      int i4;
      int i5;
      if ((k != 0 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = 1;
          for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 1 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = m;
          for (i5 = paramInt3 - m + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 2 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = 1;
          for (i5 = Math.min(m, paramInt3) - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 3 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = 1;
          for (i5 = Math.min(m + 1, paramInt3) - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 4 ? 0 : 1) != 0)
      {
        i2 = paramInt1 + 1;
        i3 = paramInt4 + 1;
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = 1;
          for (i5 = Math.min(i2, i3 - m) - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 5 ? 0 : 1) != 0)
      {
        n = paramInt2 + 2;
        i2 = paramInt2 + 1;
        m = 1;
        for (i4 = paramInt4 - 1 + 1; i4 > 0; i4--)
        {
          j = Math.max(n - m, 1);
          for (i5 = i2 - Math.max(n - m, 1) + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
        }
      }
      else if ((k != 6 ? 0 : 1) != 0)
      {
        n = paramInt1 + paramInt2 + 2;
        i1 = paramInt1 + 1;
        i2 = 2 * paramInt1 + paramInt2 + 1;
        i3 = paramInt1 + paramInt2 + 1 + paramInt3;
        m = 1;
        i4 = paramInt4 - 1 + 1;
        for (;;)
        {
          j = Math.max(n - m, i1);
          for (i5 = Math.min(i2, i3 - m) - Math.max(n - m, i1) + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= d6;
            j += 1;
          }
          m += 1;
          i4--;
          if (i4 <= 0) {
            break;
          }
        }
      }
    } while ((i ^ 0x1) != 0);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlascl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */