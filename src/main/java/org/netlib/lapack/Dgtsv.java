package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgtsv
{
  public static void dgtsv(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
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
      Xerbla.xerbla("DGTSV ", -paramintW.val);
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
        if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfDouble2[(i - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d1 = paramArrayOfDouble1[(i - 1 + paramInt3)] / paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt5)];
            paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] -= d1 * paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramintW.val = i;
            return;
          }
          paramArrayOfDouble1[(i - 1 + paramInt3)] = 0.0D;
        }
        else
        {
          d1 = paramArrayOfDouble2[(i - 1 + paramInt4)] / paramArrayOfDouble1[(i - 1 + paramInt3)];
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d2 = paramArrayOfDouble2[(i + 1 - 1 + paramInt4)];
          paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] - d1 * d2);
          paramArrayOfDouble1[(i - 1 + paramInt3)] = paramArrayOfDouble3[(i + 1 - 1 + paramInt5)];
          paramArrayOfDouble3[(i + 1 - 1 + paramInt5)] = (-(d1 * paramArrayOfDouble1[(i - 1 + paramInt3)]));
          paramArrayOfDouble3[(i - 1 + paramInt5)] = d2;
          d2 = paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (d2 - d1 * paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
        }
        i += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        i = paramInt1 - 1;
        if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfDouble2[(i - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d1 = paramArrayOfDouble1[(i - 1 + paramInt3)] / paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt5)];
            paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] -= d1 * paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramintW.val = i;
            return;
          }
        }
        else
        {
          d1 = paramArrayOfDouble2[(i - 1 + paramInt4)] / paramArrayOfDouble1[(i - 1 + paramInt3)];
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d2 = paramArrayOfDouble2[(i + 1 - 1 + paramInt4)];
          paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] - d1 * d2);
          paramArrayOfDouble3[(i - 1 + paramInt5)] = d2;
          d2 = paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (d2 - d1 * paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
        }
      }
      if ((paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] != 0.0D ? 0 : 1) != 0)
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
        if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfDouble2[(i - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d1 = paramArrayOfDouble1[(i - 1 + paramInt3)] / paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt5)];
            j = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] -= d1 * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
              j += 1;
            }
          }
          else
          {
            paramintW.val = i;
            return;
          }
          paramArrayOfDouble1[(i - 1 + paramInt3)] = 0.0D;
        }
        else
        {
          d1 = paramArrayOfDouble2[(i - 1 + paramInt4)] / paramArrayOfDouble1[(i - 1 + paramInt3)];
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d2 = paramArrayOfDouble2[(i + 1 - 1 + paramInt4)];
          paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] - d1 * d2);
          paramArrayOfDouble1[(i - 1 + paramInt3)] = paramArrayOfDouble3[(i + 1 - 1 + paramInt5)];
          paramArrayOfDouble3[(i + 1 - 1 + paramInt5)] = (-(d1 * paramArrayOfDouble1[(i - 1 + paramInt3)]));
          paramArrayOfDouble3[(i - 1 + paramInt5)] = d2;
          j = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            d2 = paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = (d2 - d1 * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            j += 1;
          }
        }
        i += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        i = paramInt1 - 1;
        if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt3)]) ? 0 : 1) != 0)
        {
          if ((paramArrayOfDouble2[(i - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d1 = paramArrayOfDouble1[(i - 1 + paramInt3)] / paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt5)];
            j = 1;
            for (k = paramInt2 - 1 + 1; k > 0; k--)
            {
              paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] -= d1 * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
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
          d1 = paramArrayOfDouble2[(i - 1 + paramInt4)] / paramArrayOfDouble1[(i - 1 + paramInt3)];
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d2 = paramArrayOfDouble2[(i + 1 - 1 + paramInt4)];
          paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] - d1 * d2);
          paramArrayOfDouble3[(i - 1 + paramInt5)] = d2;
          j = 1;
          for (k = paramInt2 - 1 + 1; k > 0; k--)
          {
            d2 = paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = (d2 - d1 * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            j += 1;
          }
        }
      }
      if ((paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] != 0.0D ? 0 : 1) != 0)
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
        paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)] /= paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
        if ((paramInt1 <= 1 ? 0 : 1) != 0) {
          paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)]);
        }
        i = paramInt1 - 2;
        for (k = (1 - (paramInt1 - 2) + -1) / -1; k > 0; k--)
        {
          paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble1[(i - 1 + paramInt3)] * paramArrayOfDouble4[(i + 2 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfDouble2[(i - 1 + paramInt4)]);
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
        paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)] /= paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
        if ((paramInt1 <= 1 ? 0 : 1) != 0) {
          paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)]);
        }
        i = paramInt1 - 2;
        for (m = (1 - (paramInt1 - 2) + -1) / -1; m > 0; m--)
        {
          paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = ((paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble1[(i - 1 + paramInt3)] * paramArrayOfDouble4[(i + 2 - 1 + (j - 1) * paramInt7 + paramInt6)]) / paramArrayOfDouble2[(i - 1 + paramInt4)]);
          i += -1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgtsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */