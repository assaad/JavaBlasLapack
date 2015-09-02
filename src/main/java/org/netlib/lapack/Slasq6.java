package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slasq6
{
  public static void slasq6(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if ((paramInt2 - paramInt1 - 1 > 0 ? 0 : 1) != 0) {
      return;
    }
    f3 = Slamch.slamch("Safe minimum");
    i = 4 * paramInt1 + paramInt4 - 3;
    f2 = paramArrayOfFloat[(i + 4 - 1 + paramInt3)];
    f1 = paramArrayOfFloat[(i - 1 + paramInt3)];
    paramfloatW1.val = f1;
    int k;
    if ((paramInt4 != 0 ? 0 : 1) != 0)
    {
      i = 4 * paramInt1;
      for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
      {
        paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (f1 + paramArrayOfFloat[(i - 1 - 1 + paramInt3)]);
        if ((paramArrayOfFloat[(i - 2 - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 + paramInt3)] = 0.0F;
          f1 = paramArrayOfFloat[(i + 1 - 1 + paramInt3)];
          paramfloatW1.val = f1;
          f2 = 0.0F;
        }
        else
        {
          if ((f3 * paramArrayOfFloat[(i + 1 - 1 + paramInt3)] >= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
          if (((f3 * paramArrayOfFloat[(i - 2 - 1 + paramInt3)] >= paramArrayOfFloat[(i + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f4 = paramArrayOfFloat[(i + 1 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
            paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(i - 1 - 1 + paramInt3)] * f4);
            f1 *= f4;
          }
          else
          {
            paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(i + 1 - 1 + paramInt3)] * (paramArrayOfFloat[(i - 1 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
            f1 = paramArrayOfFloat[(i + 1 - 1 + paramInt3)] * (f1 / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]);
          }
        }
        paramfloatW1.val = Math.min(paramfloatW1.val, f1);
        f2 = Math.min(f2, paramArrayOfFloat[(i - 1 + paramInt3)]);
        i += 4;
      }
    }
    else
    {
      i = 4 * paramInt1;
      for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
      {
        paramArrayOfFloat[(i - 3 - 1 + paramInt3)] = (f1 + paramArrayOfFloat[(i - 1 + paramInt3)]);
        if ((paramArrayOfFloat[(i - 3 - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 - 1 + paramInt3)] = 0.0F;
          f1 = paramArrayOfFloat[(i + 2 - 1 + paramInt3)];
          paramfloatW1.val = f1;
          f2 = 0.0F;
        }
        else
        {
          if ((f3 * paramArrayOfFloat[(i + 2 - 1 + paramInt3)] >= paramArrayOfFloat[(i - 3 - 1 + paramInt3)] ? 0 : 1) != 0) {}
          if (((f3 * paramArrayOfFloat[(i - 3 - 1 + paramInt3)] >= paramArrayOfFloat[(i + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f4 = paramArrayOfFloat[(i + 2 - 1 + paramInt3)] / paramArrayOfFloat[(i - 3 - 1 + paramInt3)];
            paramArrayOfFloat[(i - 1 - 1 + paramInt3)] = (paramArrayOfFloat[(i - 1 + paramInt3)] * f4);
            f1 *= f4;
          }
          else
          {
            paramArrayOfFloat[(i - 1 - 1 + paramInt3)] = (paramArrayOfFloat[(i + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 3 - 1 + paramInt3)]));
            f1 = paramArrayOfFloat[(i + 2 - 1 + paramInt3)] * (f1 / paramArrayOfFloat[(i - 3 - 1 + paramInt3)]);
          }
        }
        paramfloatW1.val = Math.min(paramfloatW1.val, f1);
        f2 = Math.min(f2, paramArrayOfFloat[(i - 1 - 1 + paramInt3)]);
        i += 4;
      }
    }
    paramfloatW6.val = f1;
    paramfloatW3.val = paramfloatW1.val;
    i = 4 * (paramInt2 - 2) - paramInt4;
    j = i + 2 * paramInt4 - 1;
    paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (paramfloatW6.val + paramArrayOfFloat[(j - 1 + paramInt3)]);
    if ((paramArrayOfFloat[(i - 2 - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0)
    {
      paramArrayOfFloat[(i - 1 + paramInt3)] = 0.0F;
      paramfloatW5.val = paramArrayOfFloat[(j + 2 - 1 + paramInt3)];
      paramfloatW1.val = paramfloatW5.val;
      f2 = 0.0F;
    }
    else
    {
      if ((f3 * paramArrayOfFloat[(j + 2 - 1 + paramInt3)] >= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
      if (((f3 * paramArrayOfFloat[(i - 2 - 1 + paramInt3)] >= paramArrayOfFloat[(j + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        f4 = paramArrayOfFloat[(j + 2 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
        paramArrayOfFloat[(j - 1 + paramInt3)] *= f4;
        paramfloatW6.val *= f4;
      }
      else
      {
        paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
        paramfloatW5.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW6.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      }
    }
    paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW5.val);
    paramfloatW2.val = paramfloatW1.val;
    i += 4;
    j = i + 2 * paramInt4 - 1;
    paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (paramfloatW5.val + paramArrayOfFloat[(j - 1 + paramInt3)]);
    if ((paramArrayOfFloat[(i - 2 - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0)
    {
      paramArrayOfFloat[(i - 1 + paramInt3)] = 0.0F;
      paramfloatW4.val = paramArrayOfFloat[(j + 2 - 1 + paramInt3)];
      paramfloatW1.val = paramfloatW4.val;
      f2 = 0.0F;
    }
    else
    {
      if ((f3 * paramArrayOfFloat[(j + 2 - 1 + paramInt3)] >= paramArrayOfFloat[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
      if (((f3 * paramArrayOfFloat[(i - 2 - 1 + paramInt3)] >= paramArrayOfFloat[(j + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        f4 = paramArrayOfFloat[(j + 2 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
        paramArrayOfFloat[(j - 1 + paramInt3)] *= f4;
        paramfloatW5.val *= f4;
      }
      else
      {
        paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
        paramfloatW4.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW5.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      }
    }
    paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW4.val);
    paramArrayOfFloat[(i + 2 - 1 + paramInt3)] = paramfloatW4.val;
    paramArrayOfFloat[(4 * paramInt2 - paramInt4 - 1 + paramInt3)] = f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasq6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */