package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slartg
{
  public static void slartg(float paramFloat1, float paramFloat2, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    f4 = Slamch.slamch("S");
    f1 = Slamch.slamch("E");
    f5 = (float)Math.pow(Slamch.slamch("B"), (int)((float)Math.log(f4 / f1) / (float)Math.log(Slamch.slamch("B")) / 2.0F));
    f6 = 1.0F / f5;
    if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 0.0F;
      paramfloatW3.val = paramFloat1;
    }
    else if ((paramFloat1 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = 0.0F;
      paramfloatW2.val = 1.0F;
      paramfloatW3.val = paramFloat2;
    }
    else
    {
      f2 = paramFloat1;
      f3 = paramFloat2;
      f7 = Math.max(Math.abs(f2), Math.abs(f3));
      int k;
      if ((f7 < f6 ? 0 : 1) != 0)
      {
        i = 0;
        do
        {
          i += 1;
          f2 *= f5;
          f3 *= f5;
          f7 = Math.max(Math.abs(f2), Math.abs(f3));
        } while ((f7 < f6 ? 0 : 1) != 0);
        paramfloatW3.val = ((float)Math.sqrt((float)Math.pow(f2, 2) + (float)Math.pow(f3, 2)));
        paramfloatW1.val = (f2 / paramfloatW3.val);
        paramfloatW2.val = (f3 / paramfloatW3.val);
        j = 1;
        for (k = i - 1 + 1; k > 0; k--)
        {
          paramfloatW3.val *= f6;
          j += 1;
        }
      }
      else if ((f7 > f5 ? 0 : 1) != 0)
      {
        i = 0;
        do
        {
          i += 1;
          f2 *= f6;
          f3 *= f6;
          f7 = Math.max(Math.abs(f2), Math.abs(f3));
        } while ((f7 > f5 ? 0 : 1) != 0);
        paramfloatW3.val = ((float)Math.sqrt((float)Math.pow(f2, 2) + (float)Math.pow(f3, 2)));
        paramfloatW1.val = (f2 / paramfloatW3.val);
        paramfloatW2.val = (f3 / paramfloatW3.val);
        j = 1;
        for (k = i - 1 + 1; k > 0; k--)
        {
          paramfloatW3.val *= f5;
          j += 1;
        }
      }
      else
      {
        paramfloatW3.val = ((float)Math.sqrt((float)Math.pow(f2, 2) + (float)Math.pow(f3, 2)));
        paramfloatW1.val = (f2 / paramfloatW3.val);
        paramfloatW2.val = (f3 / paramfloatW3.val);
      }
      if ((Math.abs(paramFloat1) <= Math.abs(paramFloat2) ? 0 : 1) != 0) {}
      if (((paramfloatW1.val >= 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramfloatW1.val = (-paramfloatW1.val);
        paramfloatW2.val = (-paramfloatW2.val);
        paramfloatW3.val = (-paramfloatW3.val);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slartg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */