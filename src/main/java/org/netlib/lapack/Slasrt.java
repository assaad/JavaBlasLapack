package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slasrt
{
  public static void slasrt(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    int[] arrayOfInt = new int[2 * 32];
    paramintW.val = 0;
    i = -1;
    if (Lsame.lsame(paramString, "D")) {
      i = 0;
    } else if (Lsame.lsame(paramString, "I")) {
      i = 1;
    }
    if ((i != -1 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASRT", -paramintW.val);
      return;
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    i1 = 1;
    arrayOfInt[(1 - 1 + (1 - 1) * 2)] = 1;
    arrayOfInt[(2 - 1 + (1 - 1) * 2)] = paramInt1;
    do
    {
      n = arrayOfInt[(1 - 1 + (i1 - 1) * 2)];
      j = arrayOfInt[(2 - 1 + (i1 - 1) * 2)];
      i1 -= 1;
      if ((j - n > 20 ? 0 : 1) != 0) {}
      if (((j - n <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        int i2;
        int i3;
        if ((i != 0 ? 0 : 1) != 0)
        {
          k = n + 1;
          for (i2 = j - (n + 1) + 1; i2 > 0; i2--)
          {
            m = k;
            for (i3 = (n + 1 - k + -1) / -1; i3 > 0; i3--)
            {
              if ((paramArrayOfFloat[(m - 1 + paramInt2)] <= paramArrayOfFloat[(m - 1 - 1 + paramInt2)] ? 0 : 1) != 0)
              {
                f4 = paramArrayOfFloat[(m - 1 + paramInt2)];
                paramArrayOfFloat[(m - 1 + paramInt2)] = paramArrayOfFloat[(m - 1 - 1 + paramInt2)];
                paramArrayOfFloat[(m - 1 - 1 + paramInt2)] = f4;
              }
              else
              {
                break;
              }
              m += -1;
            }
            k += 1;
          }
        }
        else
        {
          k = n + 1;
          for (i2 = j - (n + 1) + 1; i2 > 0; i2--)
          {
            m = k;
            for (i3 = (n + 1 - k + -1) / -1; i3 > 0; i3--)
            {
              if ((paramArrayOfFloat[(m - 1 + paramInt2)] >= paramArrayOfFloat[(m - 1 - 1 + paramInt2)] ? 0 : 1) != 0)
              {
                f4 = paramArrayOfFloat[(m - 1 + paramInt2)];
                paramArrayOfFloat[(m - 1 + paramInt2)] = paramArrayOfFloat[(m - 1 - 1 + paramInt2)];
                paramArrayOfFloat[(m - 1 - 1 + paramInt2)] = f4;
              }
              else
              {
                break;
              }
              m += -1;
            }
            k += 1;
          }
        }
      }
      else if ((j - n <= 20 ? 0 : 1) != 0)
      {
        f1 = paramArrayOfFloat[(n - 1 + paramInt2)];
        f2 = paramArrayOfFloat[(j - 1 + paramInt2)];
        k = (n + j) / 2;
        f3 = paramArrayOfFloat[(k - 1 + paramInt2)];
        if ((f1 >= f2 ? 0 : 1) != 0)
        {
          if ((f3 >= f1 ? 0 : 1) != 0) {
            f4 = f1;
          } else if ((f3 >= f2 ? 0 : 1) != 0) {
            f4 = f3;
          } else {
            f4 = f2;
          }
        }
        else if ((f3 >= f2 ? 0 : 1) != 0) {
          f4 = f2;
        } else if ((f3 >= f1 ? 0 : 1) != 0) {
          f4 = f3;
        } else {
          f4 = f1;
        }
        if ((i != 0 ? 0 : 1) != 0)
        {
          k = n - 1;
          m = j + 1;
          for (;;)
          {
            m -= 1;
            if ((paramArrayOfFloat[(m - 1 + paramInt2)] >= f4 ? 0 : 1) == 0)
            {
              do
              {
                k += 1;
              } while ((paramArrayOfFloat[(k - 1 + paramInt2)] <= f4 ? 0 : 1) != 0);
              if ((k >= m ? 0 : 1) == 0) {
                break;
              }
              f5 = paramArrayOfFloat[(k - 1 + paramInt2)];
              paramArrayOfFloat[(k - 1 + paramInt2)] = paramArrayOfFloat[(m - 1 + paramInt2)];
              paramArrayOfFloat[(m - 1 + paramInt2)] = f5;
            }
          }
          if ((m - n <= j - m - 1 ? 0 : 1) != 0)
          {
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = n;
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = m;
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = (m + 1);
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = j;
          }
          else
          {
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = (m + 1);
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = j;
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = n;
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = m;
          }
        }
        else
        {
          k = n - 1;
          m = j + 1;
          for (;;)
          {
            m -= 1;
            if ((paramArrayOfFloat[(m - 1 + paramInt2)] <= f4 ? 0 : 1) == 0)
            {
              do
              {
                k += 1;
              } while ((paramArrayOfFloat[(k - 1 + paramInt2)] >= f4 ? 0 : 1) != 0);
              if ((k >= m ? 0 : 1) == 0) {
                break;
              }
              f5 = paramArrayOfFloat[(k - 1 + paramInt2)];
              paramArrayOfFloat[(k - 1 + paramInt2)] = paramArrayOfFloat[(m - 1 + paramInt2)];
              paramArrayOfFloat[(m - 1 + paramInt2)] = f5;
            }
          }
          if ((m - n <= j - m - 1 ? 0 : 1) != 0)
          {
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = n;
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = m;
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = (m + 1);
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = j;
          }
          else
          {
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = (m + 1);
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = j;
            i1 += 1;
            arrayOfInt[(1 - 1 + (i1 - 1) * 2)] = n;
            arrayOfInt[(2 - 1 + (i1 - 1) * 2)] = m;
          }
        }
      }
    } while ((i1 <= 0 ? 0 : 1) != 0);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasrt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */