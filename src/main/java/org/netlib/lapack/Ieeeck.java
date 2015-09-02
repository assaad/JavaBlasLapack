package org.netlib.lapack;

public final class Ieeeck
{
  public static int ieeeck(int paramInt, float paramFloat1, float paramFloat2)
  {
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
    int i = 0;
    i = 1;
    f10 = paramFloat2 / paramFloat1;
    if ((f10 > paramFloat2 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f7 = -(paramFloat2 / paramFloat1);
    if ((f7 < paramFloat1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f8 = paramFloat2 / (f7 + paramFloat2);
    if ((f8 == paramFloat1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f7 = paramFloat2 / f8;
    if ((f7 < paramFloat1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f9 = f8 + paramFloat1;
    if ((f9 == paramFloat1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f10 = paramFloat2 / f9;
    if ((f10 > paramFloat2 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f7 *= f10;
    if ((f7 < paramFloat1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    f10 *= f10;
    if ((f10 > paramFloat2 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((paramInt != 0 ? 0 : 1) != 0) {
      return i;
    }
    f1 = f10 + f7;
    f2 = f10 / f7;
    f3 = f10 / f10;
    f4 = f10 * paramFloat1;
    f5 = f7 * f8;
    f6 = f5 * 0.0F;
    if ((f1 != f1 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((f2 != f2 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((f3 != f3 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((f4 != f4 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((f5 != f5 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    if ((f6 != f6 ? 0 : 1) != 0)
    {
      i = 0;
      return i;
    }
    return i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ieeeck.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */