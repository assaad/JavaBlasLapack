package org.netlib.blas;

public final class Srotm
{
  public static float two = 2.0F;
  public static float zero = 0.0F;
  
  public static void srotm(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    f1 = paramArrayOfFloat3[(1 - 1 + paramInt6)];
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((f1 + two != zero ? 0 : 1) == 0 ? 0 : 1) == 0)
    {
      if ((paramInt3 != paramInt5 ? 0 : 1) != 0) {}
      if ((((paramInt3 <= 0 ? 0 : 1) != 0 ? 1 : 0) ^ 0x1) == 0)
      {
        m = paramInt1 * paramInt3;
        float f8 = f1;
        int n;
        if (f8 >= 0.0F)
        {
          if (f8 != 0.0F) {
            break label272;
          }
          f3 = paramArrayOfFloat3[(4 - 1 + paramInt6)];
          f4 = paramArrayOfFloat3[(3 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            f6 = paramArrayOfFloat1[(i - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat1[(i - 1 + paramInt2)] = (f6 + f7 * f3);
            paramArrayOfFloat2[(i - 1 + paramInt4)] = (f6 * f4 + f7);
            i += paramInt3;
          }
          return;
          label272:
          f2 = paramArrayOfFloat3[(2 - 1 + paramInt6)];
          f5 = paramArrayOfFloat3[(5 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            f6 = paramArrayOfFloat1[(i - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat1[(i - 1 + paramInt2)] = (f6 * f2 + f7);
            paramArrayOfFloat2[(i - 1 + paramInt4)] = (-f6 + f5 * f7);
            i += paramInt3;
          }
        }
        else
        {
          f2 = paramArrayOfFloat3[(2 - 1 + paramInt6)];
          f3 = paramArrayOfFloat3[(4 - 1 + paramInt6)];
          f4 = paramArrayOfFloat3[(3 - 1 + paramInt6)];
          f5 = paramArrayOfFloat3[(5 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            f6 = paramArrayOfFloat1[(i - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(i - 1 + paramInt4)];
            paramArrayOfFloat1[(i - 1 + paramInt2)] = (f6 * f2 + f7 * f3);
            paramArrayOfFloat2[(i - 1 + paramInt4)] = (f6 * f4 + f7 * f5);
            i += paramInt3;
          }
        }
      }
      else
      {
        j = 1;
        k = 1;
        if ((paramInt3 >= 0 ? 0 : 1) != 0) {
          j = 1 + (1 - paramInt1) * paramInt3;
        }
        if ((paramInt5 >= 0 ? 0 : 1) != 0) {
          k = 1 + (1 - paramInt1) * paramInt5;
        }
        float f9 = f1;
        int i1;
        if (f9 >= 0.0F)
        {
          if (f9 != 0.0F) {
            break label723;
          }
          f3 = paramArrayOfFloat3[(4 - 1 + paramInt6)];
          f4 = paramArrayOfFloat3[(3 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f6 = paramArrayOfFloat1[(j - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            paramArrayOfFloat1[(j - 1 + paramInt2)] = (f6 + f7 * f3);
            paramArrayOfFloat2[(k - 1 + paramInt4)] = (f6 * f4 + f7);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
          return;
          label723:
          f2 = paramArrayOfFloat3[(2 - 1 + paramInt6)];
          f5 = paramArrayOfFloat3[(5 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f6 = paramArrayOfFloat1[(j - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            paramArrayOfFloat1[(j - 1 + paramInt2)] = (f6 * f2 + f7);
            paramArrayOfFloat2[(k - 1 + paramInt4)] = (-f6 + f5 * f7);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
        }
        else
        {
          f2 = paramArrayOfFloat3[(2 - 1 + paramInt6)];
          f3 = paramArrayOfFloat3[(4 - 1 + paramInt6)];
          f4 = paramArrayOfFloat3[(3 - 1 + paramInt6)];
          f5 = paramArrayOfFloat3[(5 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f6 = paramArrayOfFloat1[(j - 1 + paramInt2)];
            f7 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            paramArrayOfFloat1[(j - 1 + paramInt2)] = (f6 * f2 + f7 * f3);
            paramArrayOfFloat2[(k - 1 + paramInt4)] = (f6 * f4 + f7 * f5);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Srotm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */