package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slazq4
{
  public static void slazq4(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, floatW paramfloatW1, intW paramintW, floatW paramfloatW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    if ((paramFloat1 > 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = (-paramFloat1);
      paramintW.val = -1;
      return;
    }
    j = 4 * paramInt2 + paramInt4;
    int m;
    if ((paramInt5 != paramInt2 ? 0 : 1) != 0)
    {
      if ((paramFloat1 != paramFloat4 ? 0 : 1) == 0) {}
      if (((paramFloat1 != paramFloat5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        f2 = (float)Math.sqrt(paramArrayOfFloat[(j - 3 - 1 + paramInt3)]) * (float)Math.sqrt(paramArrayOfFloat[(j - 5 - 1 + paramInt3)]);
        f3 = (float)Math.sqrt(paramArrayOfFloat[(j - 7 - 1 + paramInt3)]) * (float)Math.sqrt(paramArrayOfFloat[(j - 9 - 1 + paramInt3)]);
        f1 = paramArrayOfFloat[(j - 7 - 1 + paramInt3)] + paramArrayOfFloat[(j - 5 - 1 + paramInt3)];
        if ((paramFloat1 != paramFloat4 ? 0 : 1) != 0) {}
        if (((paramFloat2 != paramFloat5 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          f6 = paramFloat3 - f1 - paramFloat3 * 0.25F;
          if ((f6 <= 0.0F ? 0 : 1) != 0) {}
          if (((f6 <= f3 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            f5 = f1 - paramFloat4 - f3 / f6 * f3;
          } else {
            f5 = f1 - paramFloat4 - (f2 + f3);
          }
          if ((f5 <= 0.0F ? 0 : 1) != 0) {}
          if (((f5 <= f2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f7 = Math.max(paramFloat4 - f2 / f5 * f2, 0.5F * paramFloat1);
            paramintW.val = -2;
          }
          else
          {
            f7 = 0.0F;
            if ((paramFloat4 <= f2 ? 0 : 1) != 0) {
              f7 = paramFloat4 - f2;
            }
            if ((f1 <= f2 + f3 ? 0 : 1) != 0) {
              f7 = Math.min(f7, f1 - (f2 + f3));
            }
            f7 = Math.max(f7, 0.333F * paramFloat1);
            paramintW.val = -3;
          }
        }
        else
        {
          paramintW.val = -4;
          f7 = 0.25F * paramFloat1;
          if ((paramFloat1 != paramFloat4 ? 0 : 1) != 0)
          {
            f4 = paramFloat4;
            f1 = 0.0F;
            if ((paramArrayOfFloat[(j - 5 - 1 + paramInt3)] <= paramArrayOfFloat[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f3 = paramArrayOfFloat[(j - 5 - 1 + paramInt3)] / paramArrayOfFloat[(j - 7 - 1 + paramInt3)];
            k = j - 9;
          }
          else
          {
            k = j - 2 * paramInt4;
            f3 = paramArrayOfFloat[(k - 2 - 1 + paramInt3)];
            f4 = paramFloat5;
            if ((paramArrayOfFloat[(k - 4 - 1 + paramInt3)] <= paramArrayOfFloat[(k - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f1 = paramArrayOfFloat[(k - 4 - 1 + paramInt3)] / paramArrayOfFloat[(k - 2 - 1 + paramInt3)];
            if ((paramArrayOfFloat[(j - 9 - 1 + paramInt3)] <= paramArrayOfFloat[(j - 11 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f3 = paramArrayOfFloat[(j - 9 - 1 + paramInt3)] / paramArrayOfFloat[(j - 11 - 1 + paramInt3)];
            k = j - 13;
          }
          f1 += f3;
          i = k;
          for (m = (4 * paramInt1 - 1 + paramInt4 - k + -4) / -4; m > 0; m--)
          {
            if ((f3 != 0.0F ? 0 : 1) != 0) {
              break;
            }
            f2 = f3;
            if ((paramArrayOfFloat[(i - 1 + paramInt3)] <= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f3 *= paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
            f1 += f3;
            if ((100.0F * Math.max(f3, f2) >= f1 ? 0 : 1) == 0) {}
            if (((0.563F >= f1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
          f1 = 1.05F * f1;
          if ((f1 >= 0.563F ? 0 : 1) != 0) {
            f7 = f4 * (1.0F - (float)Math.sqrt(f1)) / (1.0F + f1);
          }
        }
      }
      else if ((paramFloat1 != paramFloat6 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
        f7 = 0.25F * paramFloat1;
        k = j - 2 * paramInt4;
        f2 = paramArrayOfFloat[(k - 2 - 1 + paramInt3)];
        f3 = paramArrayOfFloat[(k - 6 - 1 + paramInt3)];
        f4 = paramFloat6;
        if ((paramArrayOfFloat[(k - 8 - 1 + paramInt3)] <= f3 ? 0 : 1) == 0) {}
        if (((paramArrayOfFloat[(k - 4 - 1 + paramInt3)] <= f2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        f1 = paramArrayOfFloat[(k - 8 - 1 + paramInt3)] / f3 * (1.0F + paramArrayOfFloat[(k - 4 - 1 + paramInt3)] / f2);
        if ((paramInt2 - paramInt1 <= 2 ? 0 : 1) != 0)
        {
          f3 = paramArrayOfFloat[(j - 13 - 1 + paramInt3)] / paramArrayOfFloat[(j - 15 - 1 + paramInt3)];
          f1 += f3;
          i = j - 17;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (j - 17) + -4) / -4; m > 0; m--)
          {
            if ((f3 != 0.0F ? 0 : 1) != 0) {
              break;
            }
            f2 = f3;
            if ((paramArrayOfFloat[(i - 1 + paramInt3)] <= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f3 *= paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
            f1 += f3;
            if ((100.0F * Math.max(f3, f2) >= f1 ? 0 : 1) == 0) {}
            if (((0.563F >= f1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
          f1 = 1.05F * f1;
        }
        if ((f1 >= 0.563F ? 0 : 1) != 0) {
          f7 = f4 * (1.0F - (float)Math.sqrt(f1)) / (1.0F + f1);
        }
      }
      else
      {
        if ((paramintW.val != -6 ? 0 : 1) != 0) {
          paramfloatW2.val += 0.333F * (1.0F - paramfloatW2.val);
        } else if ((paramintW.val != -18 ? 0 : 1) != 0) {
          paramfloatW2.val = (0.25F * 0.333F);
        } else {
          paramfloatW2.val = 0.25F;
        }
        f7 = paramfloatW2.val * paramFloat1;
        paramintW.val = -6;
      }
    }
    else if ((paramInt5 != paramInt2 + 1 ? 0 : 1) != 0)
    {
      if ((paramFloat2 != paramFloat5 ? 0 : 1) != 0) {}
      if (((paramFloat3 != paramFloat6 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -7;
        f7 = 0.333F * paramFloat2;
        if ((paramArrayOfFloat[(j - 5 - 1 + paramInt3)] <= paramArrayOfFloat[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
          return;
        }
        f2 = paramArrayOfFloat[(j - 5 - 1 + paramInt3)] / paramArrayOfFloat[(j - 7 - 1 + paramInt3)];
        f3 = f2;
        if ((f3 != 0.0F ? 0 : 1) == 0)
        {
          i = 4 * paramInt2 - 9 + paramInt4;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (4 * paramInt2 - 9 + paramInt4) + -4) / -4; m > 0; m--)
          {
            f1 = f2;
            if ((paramArrayOfFloat[(i - 1 + paramInt3)] <= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f2 *= paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
            f3 += f2;
            if ((100.0F * Math.max(f2, f1) >= f3 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
        }
        f3 = (float)Math.sqrt(1.05F * f3);
        f1 = paramFloat2 / (1.0F + (float)Math.pow(f3, 2));
        f6 = 0.5F * paramFloat3 - f1;
        if ((f6 <= 0.0F ? 0 : 1) != 0) {}
        if (((f6 <= f3 * f1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          f7 = Math.max(f7, f1 * (1.0F - 1.01F * f1 * (f3 / f6) * f3));
        }
        else
        {
          f7 = Math.max(f7, f1 * (1.0F - 1.01F * f3));
          paramintW.val = -8;
        }
      }
      else
      {
        f7 = 0.25F * paramFloat2;
        if ((paramFloat2 != paramFloat5 ? 0 : 1) != 0) {
          f7 = 0.5F * paramFloat2;
        }
        paramintW.val = -9;
      }
    }
    else if ((paramInt5 != paramInt2 + 2 ? 0 : 1) != 0)
    {
      if ((paramFloat3 != paramFloat6 ? 0 : 1) != 0) {}
      if (((2.0F * paramArrayOfFloat[(j - 5 - 1 + paramInt3)] >= paramArrayOfFloat[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -10;
        f7 = 0.333F * paramFloat3;
        if ((paramArrayOfFloat[(j - 5 - 1 + paramInt3)] <= paramArrayOfFloat[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
          return;
        }
        f2 = paramArrayOfFloat[(j - 5 - 1 + paramInt3)] / paramArrayOfFloat[(j - 7 - 1 + paramInt3)];
        f3 = f2;
        if ((f3 != 0.0F ? 0 : 1) == 0)
        {
          i = 4 * paramInt2 - 9 + paramInt4;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (4 * paramInt2 - 9 + paramInt4) + -4) / -4; m > 0; m--)
          {
            if ((paramArrayOfFloat[(i - 1 + paramInt3)] <= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            f2 *= paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
            f3 += f2;
            if ((100.0F * f2 >= f3 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
        }
        f3 = (float)Math.sqrt(1.05F * f3);
        f1 = paramFloat3 / (1.0F + (float)Math.pow(f3, 2));
        f6 = paramArrayOfFloat[(j - 7 - 1 + paramInt3)] + paramArrayOfFloat[(j - 9 - 1 + paramInt3)] - (float)Math.sqrt(paramArrayOfFloat[(j - 11 - 1 + paramInt3)]) * (float)Math.sqrt(paramArrayOfFloat[(j - 9 - 1 + paramInt3)]) - f1;
        if ((f6 <= 0.0F ? 0 : 1) != 0) {}
        if (((f6 <= f3 * f1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          f7 = Math.max(f7, f1 * (1.0F - 1.01F * f1 * (f3 / f6) * f3));
        } else {
          f7 = Math.max(f7, f1 * (1.0F - 1.01F * f3));
        }
      }
      else
      {
        f7 = 0.25F * paramFloat3;
        paramintW.val = -11;
      }
    }
    else if ((paramInt5 <= paramInt2 + 2 ? 0 : 1) != 0)
    {
      f7 = 0.0F;
      paramintW.val = -12;
    }
    paramfloatW1.val = f7;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slazq4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */