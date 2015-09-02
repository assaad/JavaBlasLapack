package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slamc4
{
  public static void slamc4(intW paramintW, float paramFloat, int paramInt)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    f1 = paramFloat;
    f8 = 1;
    f9 = f8 / paramInt;
    f10 = 0;
    paramintW.val = 1;
    f2 = Slamc3.slamc3(f1 * f9, f10);
    f4 = f1;
    f5 = f1;
    f6 = f1;
    f7 = f1;
    for (;;)
    {
      if ((f4 != f1 ? 0 : 1) != 0) {}
      if (((f5 != f1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      if (((f6 != f1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      if (((f7 != f1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      paramintW.val -= 1;
      f1 = f2;
      f2 = Slamc3.slamc3(f1 / paramInt, f10);
      f4 = Slamc3.slamc3(f2 * paramInt, f10);
      f6 = f10;
      i = 1;
      for (int j = paramInt - 1 + 1; j > 0; j--)
      {
        f6 += f2;
        i += 1;
      }
      f3 = Slamc3.slamc3(f1 * f9, f10);
      f5 = Slamc3.slamc3(f3 / f9, f10);
      f7 = f10;
      i = 1;
      for (j = paramInt - 1 + 1; j > 0; j--)
      {
        f7 += f3;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slamc4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */