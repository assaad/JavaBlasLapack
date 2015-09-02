package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slassq
{
  public static void slassq(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, floatW paramfloatW1, floatW paramfloatW2)
  {
    int i = 0;
    float f = 0.0F;
    if ((paramInt1 <= 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = (1 + (paramInt1 - 1) * paramInt3 - 1 + paramInt3) / paramInt3; j > 0; j--)
      {
        if ((paramArrayOfFloat[(i - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
        {
          f = Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]);
          if ((paramfloatW1.val >= f ? 0 : 1) != 0)
          {
            paramfloatW2.val = (1 + paramfloatW2.val * (float)Math.pow(paramfloatW1.val / f, 2));
            paramfloatW1.val = f;
          }
          else
          {
            paramfloatW2.val += (float)Math.pow(f / paramfloatW1.val, 2);
          }
        }
        i += paramInt3;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slassq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */