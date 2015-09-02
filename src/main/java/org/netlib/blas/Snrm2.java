package org.netlib.blas;

public final class Snrm2
{
  public static float snrm2(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int i = 0;
    float f5 = 0.0F;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt3 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      f2 = 0.0F;
    }
    else if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      f2 = Math.abs(paramArrayOfFloat[(1 - 1 + paramInt2)]);
    }
    else
    {
      f3 = 0.0F;
      f4 = 1.0F;
      i = 1;
      for (int j = (1 + (paramInt1 - 1) * paramInt3 - 1 + paramInt3) / paramInt3; j > 0; j--)
      {
        if ((paramArrayOfFloat[(i - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
        {
          f1 = Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]);
          if ((f3 >= f1 ? 0 : 1) != 0)
          {
            f4 = 1.0F + f4 * (float)Math.pow(f3 / f1, 2);
            f3 = f1;
          }
          else
          {
            f4 += (float)Math.pow(f1 / f3, 2);
          }
        }
        i += paramInt3;
      }
      f2 = f3 * (float)Math.sqrt(f4);
    }
    f5 = f2;
    return f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Snrm2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */