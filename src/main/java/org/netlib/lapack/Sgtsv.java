package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgtsv
{
  public static void sgtsv(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGTSV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int k;
    int m;
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 2 - 1 + 1; k > 0; k--)
      {
        if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfFloat2[(i - 1 + paramInt4)] == 0.0F ? 0 : 1) != 0)
          {
            f1 = paramArrayOfFloat1[(i - 1 + paramInt3)] / paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt5)];
            paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] -= f1 * paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramintW.val = i;
            return;
          }
          paramArrayOfFloat1[(i - 1 + paramInt3)] = 0.0F;
        }
        else
        {
          f1 = paramArrayOfFloat2[(i - 1 + paramInt4)] / paramArrayOfFloat1[(i - 1 + paramInt3)];
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f2 = paramArrayOfFloat2[(i + 1 - 1 + paramInt4)];
          paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] - f1 * f2);
          paramArrayOfFloat1[(i - 1 + paramInt3)] = paramArrayOfFloat3[(i + 1 - 1 + paramInt5)];
          paramArrayOfFloat3[(i + 1 - 1 + paramInt5)] = (-(f1 * paramArrayOfFloat1[(i - 1 + paramInt3)]));
          paramArrayOfFloat3[(i - 1 + paramInt5)] = f2;
          f2 = paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (f2 - f1 * paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
        }
        i += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        i = paramInt1 - 1;
        if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfFloat2[(i - 1 + paramInt4)] == 0.0F ? 0 : 1) != 0)
          {
            f1 = paramArrayOfFloat1[(i - 1 + paramInt3)] / paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt5)];
            paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] -= f1 * paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramintW.val = i;
            return;
          }
        }
        else
        {
          f1 = paramArrayOfFloat2[(i - 1 + paramInt4)] / paramArrayOfFloat1[(i - 1 + paramInt3)];
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f2 = paramArrayOfFloat2[(i + 1 - 1 + paramInt4)];
          paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] - f1 * f2);
          paramArrayOfFloat3[(i - 1 + paramInt5)] = f2;
          f2 = paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (f2 - f1 * paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
        }
      }
      if ((paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] != 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = paramInt1;
        return;
      }
    }
    else
    {
      i = 1;
      for (k = paramInt1 - 2 - 1 + 1; k > 0; k--)
      {
        if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfFloat2[(i - 1 + paramInt4)] == 0.0F ? 0 : 1) != 0)
          {
            f1 = paramArrayOfFloat1[(i - 1 + paramInt3)] / paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt5)];
            j = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] -= f1 * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
              j += 1;
            }
          }
          else
          {
            paramintW.val = i;
            return;
          }
          paramArrayOfFloat1[(i - 1 + paramInt3)] = 0.0F;
        }
        else
        {
          f1 = paramArrayOfFloat2[(i - 1 + paramInt4)] / paramArrayOfFloat1[(i - 1 + paramInt3)];
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f2 = paramArrayOfFloat2[(i + 1 - 1 + paramInt4)];
          paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] - f1 * f2);
          paramArrayOfFloat1[(i - 1 + paramInt3)] = paramArrayOfFloat3[(i + 1 - 1 + paramInt5)];
          paramArrayOfFloat3[(i + 1 - 1 + paramInt5)] = (-(f1 * paramArrayOfFloat1[(i - 1 + paramInt3)]));
          paramArrayOfFloat3[(i - 1 + paramInt5)] = f2;
          j = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            f2 = paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = (f2 - f1 * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            j += 1;
          }
        }
        i += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        i = paramInt1 - 1;
        if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfFloat2[(i - 1 + paramInt4)] == 0.0F ? 0 : 1) != 0)
          {
            f1 = paramArrayOfFloat1[(i - 1 + paramInt3)] / paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt5)];
            j = 1;
            for (k = paramInt2 - 1 + 1; k > 0; k--)
            {
              paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] -= f1 * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
              j += 1;
            }
          }
          else
          {
            paramintW.val = i;
            return;
          }
        }
        else
        {
          f1 = paramArrayOfFloat2[(i - 1 + paramInt4)] / paramArrayOfFloat1[(i - 1 + paramInt3)];
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f2 = paramArrayOfFloat2[(i + 1 - 1 + paramInt4)];
          paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = (paramArrayOfFloat3[(i - 1 + paramInt5)] - f1 * f2);
          paramArrayOfFloat3[(i - 1 + paramInt5)] = f2;
          j = 1;
          for (k = paramInt2 - 1 + 1; k > 0; k--)
          {
            f2 = paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = (f2 - f1 * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            j += 1;
          }
        }
      }
      if ((paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] != 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = paramInt1;
        return;
      }
    }
    if ((paramInt2 > 2 ? 0 : 1) != 0)
    {
      j = 1;
      for (;;)
      {
        paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)] /= paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
        if ((paramInt1 <= 1 ? 0 : 1) != 0) {
          paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)]);
        }
        i = paramInt1 - 2;
        for (k = (1 - (paramInt1 - 2) + -1) / -1; k > 0; k--)
        {
          paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat1[(i - 1 + paramInt3)] * paramArrayOfFloat4[(i + 2 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfFloat2[(i - 1 + paramInt4)]);
          i += -1;
        }
        if ((j >= paramInt2 ? 0 : 1) == 0) {
          break;
        }
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)] /= paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
        if ((paramInt1 <= 1 ? 0 : 1) != 0) {
          paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)]);
        }
        i = paramInt1 - 2;
        for (m = (1 - (paramInt1 - 2) + -1) / -1; m > 0; m--)
        {
          paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat1[(i - 1 + paramInt3)] * paramArrayOfFloat4[(i + 2 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfFloat2[(i - 1 + paramInt4)]);
          i += -1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgtsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */