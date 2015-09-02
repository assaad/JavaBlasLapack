package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slascl
{
  public static void slascl(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
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
    else if ((paramFloat1 != 0.0F ? 0 : 1) != 0)
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
      Xerbla.xerbla("SLASCL", -paramintW.val);
      return;
    }
    if ((paramInt4 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    f7 = Slamch.slamch("S");
    f1 = 1.0F / f7;
    f3 = paramFloat1;
    f5 = paramFloat2;
    do
    {
      f2 = f3 * f7;
      f4 = f5 / f1;
      if ((Math.abs(f2) <= Math.abs(f5) ? 0 : 1) != 0) {}
      if (((f5 == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        f6 = f7;
        i = 0;
        f3 = f2;
      }
      else if ((Math.abs(f4) <= Math.abs(f3) ? 0 : 1) != 0)
      {
        f6 = f1;
        i = 0;
        f5 = f4;
      }
      else
      {
        f6 = f5 / f3;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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
            paramArrayOfFloat[(j - 1 + (m - 1) * paramInt6 + paramInt5)] *= f6;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slascl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */