package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slasq5
{
  public static void slasq5(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, float paramFloat, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramInt2 - paramInt1 - 1 > 0 ? 0 : 1) != 0) {
      return;
    }
    i = 4 * paramInt1 + paramInt4 - 3;
    f2 = paramArrayOfFloat[(i + 4 - 1 + paramInt3)];
    f1 = paramArrayOfFloat[(i - 1 + paramInt3)] - paramFloat;
    paramfloatW1.val = f1;
    paramfloatW2.val = (-paramArrayOfFloat[(i - 1 + paramInt3)]);
    int k;
    if (paramBoolean)
    {
      if ((paramInt4 != 0 ? 0 : 1) != 0)
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (f1 + paramArrayOfFloat[(i - 1 - 1 + paramInt3)]);
          f3 = paramArrayOfFloat[(i + 1 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)];
          f1 = f1 * f3 - paramFloat;
          paramfloatW1.val = Math.min(paramfloatW1.val, f1);
          paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(i - 1 - 1 + paramInt3)] * f3);
          f2 = Math.min(paramArrayOfFloat[(i - 1 + paramInt3)], f2);
          i += 4;
        }
      }
      else
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfFloat[(i - 3 - 1 + paramInt3)] = (f1 + paramArrayOfFloat[(i - 1 + paramInt3)]);
          f3 = paramArrayOfFloat[(i + 2 - 1 + paramInt3)] / paramArrayOfFloat[(i - 3 - 1 + paramInt3)];
          f1 = f1 * f3 - paramFloat;
          paramfloatW1.val = Math.min(paramfloatW1.val, f1);
          paramArrayOfFloat[(i - 1 - 1 + paramInt3)] = (paramArrayOfFloat[(i - 1 + paramInt3)] * f3);
          f2 = Math.min(paramArrayOfFloat[(i - 1 - 1 + paramInt3)], f2);
          i += 4;
        }
      }
      paramfloatW6.val = f1;
      paramfloatW3.val = paramfloatW1.val;
      i = 4 * (paramInt2 - 2) - paramInt4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (paramfloatW6.val + paramArrayOfFloat[(j - 1 + paramInt3)]);
      paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      paramfloatW5.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW6.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]) - paramFloat);
      paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW5.val);
      paramfloatW2.val = paramfloatW1.val;
      i += 4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (paramfloatW5.val + paramArrayOfFloat[(j - 1 + paramInt3)]);
      paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      paramfloatW4.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW5.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]) - paramFloat);
      paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW4.val);
    }
    else
    {
      if ((paramInt4 != 0 ? 0 : 1) != 0)
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (f1 + paramArrayOfFloat[(i - 1 - 1 + paramInt3)]);
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            return;
          }
          paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(i + 1 - 1 + paramInt3)] * (paramArrayOfFloat[(i - 1 - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
          f1 = paramArrayOfFloat[(i + 1 - 1 + paramInt3)] * (f1 / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]) - paramFloat;
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
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            return;
          }
          paramArrayOfFloat[(i - 1 - 1 + paramInt3)] = (paramArrayOfFloat[(i + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(i - 1 + paramInt3)] / paramArrayOfFloat[(i - 3 - 1 + paramInt3)]));
          f1 = paramArrayOfFloat[(i + 2 - 1 + paramInt3)] * (f1 / paramArrayOfFloat[(i - 3 - 1 + paramInt3)]) - paramFloat;
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
      if ((paramfloatW6.val >= 0.0F ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      paramfloatW5.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW6.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]) - paramFloat);
      paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW5.val);
      paramfloatW2.val = paramfloatW1.val;
      i += 4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfFloat[(i - 2 - 1 + paramInt3)] = (paramfloatW5.val + paramArrayOfFloat[(j - 1 + paramInt3)]);
      if ((paramfloatW5.val >= 0.0F ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfFloat[(i - 1 + paramInt3)] = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramArrayOfFloat[(j - 1 + paramInt3)] / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]));
      paramfloatW4.val = (paramArrayOfFloat[(j + 2 - 1 + paramInt3)] * (paramfloatW5.val / paramArrayOfFloat[(i - 2 - 1 + paramInt3)]) - paramFloat);
      paramfloatW1.val = Math.min(paramfloatW1.val, paramfloatW4.val);
    }
    paramArrayOfFloat[(i + 2 - 1 + paramInt3)] = paramfloatW4.val;
    paramArrayOfFloat[(4 * paramInt2 - paramInt4 - 1 + paramInt3)] = f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasq5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */