package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dtgexc
{
  public static void dtgexc(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    paramintW3.val = 0;
    i = paramInt11 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -5;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -7;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!paramBoolean1) {}
      }
      if ((((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -9;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!paramBoolean2) {}
        }
        if ((((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -11;
        }
        else
        {
          if ((paramintW1.val >= 1 ? 0 : 1) == 0) {}
          if (((paramintW1.val <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            paramintW3.val = -12;
          }
          else
          {
            if ((paramintW2.val >= 1 ? 0 : 1) == 0) {}
            if (((paramintW2.val <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramintW3.val = -13;
            }
          }
        }
      }
    }
    if ((paramintW3.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 > 1 ? 0 : 1) != 0) {
        k = 1;
      } else {
        k = 4 * paramInt1 + 16;
      }
      paramArrayOfDouble5[(1 - 1 + paramInt10)] = k;
      if ((paramInt11 >= k ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW3.val = -15;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGEXC", -paramintW3.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    if ((paramintW1.val <= 1 ? 0 : 1) != 0) {
      if ((paramArrayOfDouble1[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
        paramintW1.val -= 1;
      }
    }
    m = 1;
    if ((paramintW1.val >= paramInt1 ? 0 : 1) != 0) {
      if ((paramArrayOfDouble1[(paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
        m = 2;
      }
    }
    if ((paramintW2.val <= 1 ? 0 : 1) != 0) {
      if ((paramArrayOfDouble1[(paramintW2.val - 1 + (paramintW2.val - 1 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
        paramintW2.val -= 1;
      }
    }
    n = 1;
    if ((paramintW2.val >= paramInt1 ? 0 : 1) != 0) {
      if ((paramArrayOfDouble1[(paramintW2.val + 1 - 1 + (paramintW2.val - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
        n = 2;
      }
    }
    if ((paramintW1.val != paramintW2.val ? 0 : 1) != 0) {
      return;
    }
    if ((paramintW1.val >= paramintW2.val ? 0 : 1) != 0)
    {
      if ((m != 2 ? 0 : 1) != 0) {}
      if (((n != 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val -= 1;
      }
      if ((m != 1 ? 0 : 1) != 0) {}
      if (((n != 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val += 1;
      }
      j = paramintW1.val;
      do
      {
        if ((m != 1 ? 0 : 1) == 0) {}
        if (((m != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i1 = 1;
          if ((j + m + 1 > paramInt1 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j + m + 1 - 1 + (j + m - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
              i1 = 2;
            }
          }
          Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, m, i1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = j;
            return;
          }
          j += i1;
          if ((m != 2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
              m = 3;
            }
          }
        }
        else
        {
          i1 = 1;
          if ((j + 3 > paramInt1 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j + 3 - 1 + (j + 2 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
              i1 = 2;
            }
          }
          Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j + 1, 1, i1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = j;
            return;
          }
          if ((i1 != 1 ? 0 : 1) != 0)
          {
            Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
            if ((paramintW3.val == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = j;
              return;
            }
            j += 1;
          }
          else
          {
            if ((paramArrayOfDouble1[(j + 2 - 1 + (j + 1 - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
              i1 = 1;
            }
            if ((i1 != 2 ? 0 : 1) != 0)
            {
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, i1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j += 2;
            }
            else
            {
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j += 1;
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j += 1;
            }
          }
        }
      } while ((j >= paramintW2.val ? 0 : 1) != 0);
    }
    else
    {
      j = paramintW1.val;
      do
      {
        if ((m != 1 ? 0 : 1) == 0) {}
        if (((m != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i1 = 1;
          if ((j < 3 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j - 1 - 1 + (j - 2 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
              i1 = 2;
            }
          }
          Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j - i1, i1, m, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = j;
            return;
          }
          j -= i1;
          if ((m != 2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
              m = 3;
            }
          }
        }
        else
        {
          i1 = 1;
          if ((j < 3 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(j - 1 - 1 + (j - 2 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0) {
              i1 = 2;
            }
          }
          Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j - i1, i1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = j;
            return;
          }
          if ((i1 != 1 ? 0 : 1) != 0)
          {
            Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, i1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
            if ((paramintW3.val == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = j;
              return;
            }
            j -= 1;
          }
          else
          {
            if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
              i1 = 1;
            }
            if ((i1 != 2 ? 0 : 1) != 0)
            {
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j - 1, 2, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j -= 2;
            }
            else
            {
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j -= 1;
              Dtgex2.dtgex2(paramBoolean1, paramBoolean2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, j, 1, 1, paramArrayOfDouble5, paramInt10, paramInt11, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = j;
                return;
              }
              j -= 1;
            }
          }
        }
      } while ((j <= paramintW2.val ? 0 : 1) != 0);
    }
    paramintW2.val = j;
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgexc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */