package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slagts
{
  public static void slagts(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, floatW paramfloatW, intW paramintW)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    paramintW.val = 0;
    if ((Math.abs(paramInt1) <= 2 ? 0 : 1) == 0) {}
    if (((paramInt1 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLAGTS", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    f4 = Slamch.slamch("Epsilon");
    f6 = Slamch.slamch("Safe minimum");
    f3 = 1.0F / f6;
    int j;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      if ((paramfloatW.val > 0.0F ? 0 : 1) != 0)
      {
        paramfloatW.val = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt3)]);
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramfloatW.val = Util.max(paramfloatW.val, Math.abs(paramArrayOfFloat1[(2 - 1 + paramInt3)]), Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)]));
        }
        i = 3;
        for (j = paramInt2 - 3 + 1; j > 0; j--)
        {
          paramfloatW.val = Math.max(Util.max(paramfloatW.val, Math.abs(paramArrayOfFloat1[(i - 1 + paramInt3)]), Math.abs(paramArrayOfFloat2[(i - 1 - 1 + paramInt4)])), Math.abs(paramArrayOfFloat4[(i - 2 - 1 + paramInt6)]));
          i += 1;
        }
        paramfloatW.val *= f4;
        if ((paramfloatW.val != 0.0F ? 0 : 1) != 0) {
          paramfloatW.val = f4;
        }
      }
    }
    if ((Math.abs(paramInt1) != 1 ? 0 : 1) != 0)
    {
      i = 2;
      for (j = paramInt2 - 2 + 1; j > 0; j--)
      {
        if ((paramArrayOfInt[(i - 1 - 1 + paramInt7)] != 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i - 1 + paramInt8)] -= paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)];
        }
        else
        {
          f7 = paramArrayOfFloat5[(i - 1 - 1 + paramInt8)];
          paramArrayOfFloat5[(i - 1 - 1 + paramInt8)] = paramArrayOfFloat5[(i - 1 + paramInt8)];
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 - paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat5[(i - 1 + paramInt8)]);
        }
        i += 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        i = paramInt2;
        for (j = (1 - paramInt2 + -1) / -1; j > 0; j--)
        {
          if ((i > paramInt2 - 2 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i + 2 - 1 + paramInt8)];
          } else if ((i != paramInt2 - 1 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)];
          } else {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)];
          }
          f2 = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f1 = Math.abs(f2);
          if ((f1 >= 1.0F ? 0 : 1) != 0) {
            if ((f1 >= f6 ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) == 0) {}
              if (((Math.abs(f7) * f6 <= f1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramintW.val = i;
                return;
              }
              f7 *= f3;
              f2 *= f3;
            }
            else if ((Math.abs(f7) <= f1 * f3 ? 0 : 1) != 0)
            {
              paramintW.val = i;
              return;
            }
          }
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 / f2);
          i += -1;
        }
      }
      else
      {
        i = paramInt2;
        for (j = (1 - paramInt2 + -1) / -1; j > 0; j--)
        {
          if ((i > paramInt2 - 2 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i + 2 - 1 + paramInt8)];
          } else if ((i != paramInt2 - 1 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)];
          } else {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)];
          }
          f2 = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f5 = Util.sign(paramfloatW.val, f2);
          for (;;)
          {
            f1 = Math.abs(f2);
            if ((f1 >= 1.0F ? 0 : 1) == 0) {
              break;
            }
            if ((f1 >= f6 ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) == 0) {}
              if (((Math.abs(f7) * f6 <= f1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                f2 += f5;
                f5 = 2 * f5;
              }
              else
              {
                f7 *= f3;
                f2 *= f3;
                break;
              }
            }
            else
            {
              if ((Math.abs(f7) <= f1 * f3 ? 0 : 1) == 0) {
                break;
              }
              f2 += f5;
              f5 = 2 * f5;
            }
          }
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 / f2);
          i += -1;
        }
      }
    }
    else
    {
      if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          if ((i < 3 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i - 2 - 1 + paramInt6)] * paramArrayOfFloat5[(i - 2 - 1 + paramInt8)];
          } else if ((i != 2 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)];
          } else {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)];
          }
          f2 = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f1 = Math.abs(f2);
          if ((f1 >= 1.0F ? 0 : 1) != 0) {
            if ((f1 >= f6 ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) == 0) {}
              if (((Math.abs(f7) * f6 <= f1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramintW.val = i;
                return;
              }
              f7 *= f3;
              f2 *= f3;
            }
            else if ((Math.abs(f7) <= f1 * f3 ? 0 : 1) != 0)
            {
              paramintW.val = i;
              return;
            }
          }
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 / f2);
          i += 1;
        }
      }
      else
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          if ((i < 3 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i - 2 - 1 + paramInt6)] * paramArrayOfFloat5[(i - 2 - 1 + paramInt8)];
          } else if ((i != 2 ? 0 : 1) != 0) {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)] - paramArrayOfFloat2[(i - 1 - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)];
          } else {
            f7 = paramArrayOfFloat5[(i - 1 + paramInt8)];
          }
          f2 = paramArrayOfFloat1[(i - 1 + paramInt3)];
          f5 = Util.sign(paramfloatW.val, f2);
          for (;;)
          {
            f1 = Math.abs(f2);
            if ((f1 >= 1.0F ? 0 : 1) == 0) {
              break;
            }
            if ((f1 >= f6 ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) == 0) {}
              if (((Math.abs(f7) * f6 <= f1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                f2 += f5;
                f5 = 2 * f5;
              }
              else
              {
                f7 *= f3;
                f2 *= f3;
                break;
              }
            }
            else
            {
              if ((Math.abs(f7) <= f1 * f3 ? 0 : 1) == 0) {
                break;
              }
              f2 += f5;
              f5 = 2 * f5;
            }
          }
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 / f2);
          i += 1;
        }
      }
      i = paramInt2;
      for (j = (2 - paramInt2 + -1) / -1; j > 0; j--)
      {
        if ((paramArrayOfInt[(i - 1 - 1 + paramInt7)] != 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i - 1 - 1 + paramInt8)] -= paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat5[(i - 1 + paramInt8)];
        }
        else
        {
          f7 = paramArrayOfFloat5[(i - 1 - 1 + paramInt8)];
          paramArrayOfFloat5[(i - 1 - 1 + paramInt8)] = paramArrayOfFloat5[(i - 1 + paramInt8)];
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (f7 - paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat5[(i - 1 + paramInt8)]);
        }
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slagts.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */