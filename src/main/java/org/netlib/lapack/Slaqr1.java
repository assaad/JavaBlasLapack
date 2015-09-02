package org.netlib.lapack;

public final class Slaqr1
{
  public static void slaqr1(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat2, int paramInt4)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      f3 = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat3) + Math.abs(paramFloat4) + Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)]);
      if ((f3 != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = 0.0F;
        paramArrayOfFloat2[(2 - 1 + paramInt4)] = 0.0F;
      }
      else
      {
        f1 = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)] / f3;
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = (f1 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt3 + paramInt2)] + (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat1) * ((paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat3) / f3) - paramFloat2 * (paramFloat4 / f3));
        paramArrayOfFloat2[(2 - 1 + paramInt4)] = (f1 * (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt3 + paramInt2)] - paramFloat1 - paramFloat3));
      }
    }
    else
    {
      f3 = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat3) + Math.abs(paramFloat4) + Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)]) + Math.abs(paramArrayOfFloat1[(3 - 1 + (1 - 1) * paramInt3 + paramInt2)]);
      if ((f3 != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = 0.0F;
        paramArrayOfFloat2[(2 - 1 + paramInt4)] = 0.0F;
        paramArrayOfFloat2[(3 - 1 + paramInt4)] = 0.0F;
      }
      else
      {
        f1 = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)] / f3;
        f2 = paramArrayOfFloat1[(3 - 1 + (1 - 1) * paramInt3 + paramInt2)] / f3;
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = ((paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat1) * ((paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramFloat3) / f3) - paramFloat2 * (paramFloat4 / f3) + paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt3 + paramInt2)] * f1 + paramArrayOfFloat1[(1 - 1 + (3 - 1) * paramInt3 + paramInt2)] * f2);
        paramArrayOfFloat2[(2 - 1 + paramInt4)] = (f1 * (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt3 + paramInt2)] - paramFloat1 - paramFloat3) + paramArrayOfFloat1[(2 - 1 + (3 - 1) * paramInt3 + paramInt2)] * f2);
        paramArrayOfFloat2[(3 - 1 + paramInt4)] = (f2 * (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfFloat1[(3 - 1 + (3 - 1) * paramInt3 + paramInt2)] - paramFloat1 - paramFloat3) + f1 * paramArrayOfFloat1[(3 - 1 + (2 - 1) * paramInt3 + paramInt2)]);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqr1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */