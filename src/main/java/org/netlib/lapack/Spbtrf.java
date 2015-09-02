package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Ssyrk;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spbtrf
{
  public static void spbtrf(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    float[] arrayOfFloat = new float[33 * 32];
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPBTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i2 = Ilaenv.ilaenv(1, "SPBTRF", paramString, paramInt1, paramInt2, -1, -1);
    i2 = Math.min(i2, 32);
    if ((i2 > 1 ? 0 : 1) == 0) {}
    if (((i2 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Spbtf2.spbtf2(paramString, paramInt1, paramInt2, paramArrayOfFloat, paramInt3, paramInt4, paramintW);
    }
    else
    {
      int i3;
      int i4;
      int i5;
      if (Lsame.lsame(paramString, "U"))
      {
        n = 1;
        for (i3 = i2 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = n - 1 - 1 + 1; i4 > 0; i4--)
          {
            arrayOfFloat[(i - 1 + (n - 1) * 33)] = 0.0F;
            i += 1;
          }
          n += 1;
        }
        i = 1;
        for (i3 = (paramInt1 - 1 + i2) / i2; i3 > 0; i3--)
        {
          m = Math.min(i2, paramInt1 - i + 1);
          Spotf2.spotf2(paramString, m, paramArrayOfFloat, paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, localintW);
          if ((localintW.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (i + localintW.val - 1);
            break;
          }
          if ((i + m > paramInt1 ? 0 : 1) != 0)
          {
            j = Math.min(paramInt2 - m, paramInt1 - i - m + 1);
            k = Math.min(m, paramInt1 - i - paramInt2 + 1);
            if ((j <= 0 ? 0 : 1) != 0)
            {
              Strsm.strsm("Left", "Upper", "Transpose", "Non-unit", m, j, 1.0F, paramArrayOfFloat, paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, paramArrayOfFloat, paramInt2 + 1 - m - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              Ssyrk.ssyrk("Upper", "Transpose", j, m, -1.0F, paramArrayOfFloat, paramInt2 + 1 - m - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1, 1.0F, paramArrayOfFloat, paramInt2 + 1 - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1);
            }
            if ((k <= 0 ? 0 : 1) != 0)
            {
              i1 = 1;
              for (i4 = k - 1 + 1; i4 > 0; i4--)
              {
                localintW.val = i1;
                for (i5 = m - i1 + 1; i5 > 0; i5--)
                {
                  arrayOfFloat[(localintW.val - 1 + (i1 - 1) * 33)] = paramArrayOfFloat[(localintW.val - i1 + 1 - 1 + (i1 + i + paramInt2 - 1 - 1) * paramInt4 + paramInt3)];
                  localintW.val += 1;
                }
                i1 += 1;
              }
              Strsm.strsm("Left", "Upper", "Transpose", "Non-unit", m, k, 1.0F, paramArrayOfFloat, paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, arrayOfFloat, 0, 33);
              if ((j <= 0 ? 0 : 1) != 0) {
                Sgemm.sgemm("Transpose", "No Transpose", j, k, m, -1.0F, paramArrayOfFloat, paramInt2 + 1 - m - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1, arrayOfFloat, 0, 33, 1.0F, paramArrayOfFloat, 1 + m - 1 + (i + paramInt2 - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              }
              Ssyrk.ssyrk("Upper", "Transpose", k, m, -1.0F, arrayOfFloat, 0, 33, 1.0F, paramArrayOfFloat, paramInt2 + 1 - 1 + (i + paramInt2 - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              i1 = 1;
              for (i4 = k - 1 + 1; i4 > 0; i4--)
              {
                localintW.val = i1;
                for (i5 = m - i1 + 1; i5 > 0; i5--)
                {
                  paramArrayOfFloat[(localintW.val - i1 + 1 - 1 + (i1 + i + paramInt2 - 1 - 1) * paramInt4 + paramInt3)] = arrayOfFloat[(localintW.val - 1 + (i1 - 1) * 33)];
                  localintW.val += 1;
                }
                i1 += 1;
              }
            }
          }
          i += i2;
        }
      }
      else
      {
        n = 1;
        for (i3 = i2 - 1 + 1; i3 > 0; i3--)
        {
          i = n + 1;
          for (i4 = i2 - (n + 1) + 1; i4 > 0; i4--)
          {
            arrayOfFloat[(i - 1 + (n - 1) * 33)] = 0.0F;
            i += 1;
          }
          n += 1;
        }
        i = 1;
        for (i3 = (paramInt1 - 1 + i2) / i2; i3 > 0; i3--)
        {
          m = Math.min(i2, paramInt1 - i + 1);
          Spotf2.spotf2(paramString, m, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, localintW);
          if ((localintW.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (i + localintW.val - 1);
            break;
          }
          if ((i + m > paramInt1 ? 0 : 1) != 0)
          {
            j = Math.min(paramInt2 - m, paramInt1 - i - m + 1);
            k = Math.min(m, paramInt1 - i - paramInt2 + 1);
            if ((j <= 0 ? 0 : 1) != 0)
            {
              Strsm.strsm("Right", "Lower", "Transpose", "Non-unit", j, m, 1.0F, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, paramArrayOfFloat, 1 + m - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              Ssyrk.ssyrk("Lower", "No Transpose", j, m, -1.0F, paramArrayOfFloat, 1 + m - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, 1.0F, paramArrayOfFloat, 1 - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1);
            }
            if ((k <= 0 ? 0 : 1) != 0)
            {
              i1 = 1;
              for (i4 = m - 1 + 1; i4 > 0; i4--)
              {
                localintW.val = 1;
                for (i5 = Math.min(i1, k) - 1 + 1; i5 > 0; i5--)
                {
                  arrayOfFloat[(localintW.val - 1 + (i1 - 1) * 33)] = paramArrayOfFloat[(paramInt2 + 1 - i1 + localintW.val - 1 + (i1 + i - 1 - 1) * paramInt4 + paramInt3)];
                  localintW.val += 1;
                }
                i1 += 1;
              }
              Strsm.strsm("Right", "Lower", "Transpose", "Non-unit", k, m, 1.0F, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, arrayOfFloat, 0, 33);
              if ((j <= 0 ? 0 : 1) != 0) {
                Sgemm.sgemm("No transpose", "Transpose", k, j, m, -1.0F, arrayOfFloat, 0, 33, paramArrayOfFloat, 1 + m - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4 - 1, 1.0F, paramArrayOfFloat, 1 + paramInt2 - m - 1 + (i + m - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              }
              Ssyrk.ssyrk("Lower", "No Transpose", k, m, -1.0F, arrayOfFloat, 0, 33, 1.0F, paramArrayOfFloat, 1 - 1 + (i + paramInt2 - 1) * paramInt4 + paramInt3, paramInt4 - 1);
              i1 = 1;
              for (i4 = m - 1 + 1; i4 > 0; i4--)
              {
                localintW.val = 1;
                for (i5 = Math.min(i1, k) - 1 + 1; i5 > 0; i5--)
                {
                  paramArrayOfFloat[(paramInt2 + 1 - i1 + localintW.val - 1 + (i1 + i - 1 - 1) * paramInt4 + paramInt3)] = arrayOfFloat[(localintW.val - 1 + (i1 - 1) * 33)];
                  localintW.val += 1;
                }
                i1 += 1;
              }
            }
          }
          i += i2;
        }
      }
    }
    return;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spbtrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */