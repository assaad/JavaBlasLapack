package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Strmv;
import org.netlib.blas.Strsv;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Strrfs
{
  public static void strrfs(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int[] paramArrayOfInt, int paramInt12, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    String str = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool3 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    bool2 = Lsame.lsame(paramString3, "N");
    if ((((bool3 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -3;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -7;
      } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -9;
      } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -11;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STRRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      j = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat4[(j - 1 + paramInt9)] = 0.0F;
        paramArrayOfFloat5[(j - 1 + paramInt10)] = 0.0F;
        j += 1;
      }
      return;
    }
    if (bool1) {
      str = "T";
    } else {
      str = "N";
    }
    m = paramInt1 + 1;
    f1 = Slamch.slamch("Epsilon");
    f6 = Slamch.slamch("Safe minimum");
    f4 = m * f6;
    f5 = f4 / f1;
    j = 1;
    for (int n = paramInt2 - 1 + 1; n > 0; n--)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, 1);
      Strmv.strmv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, 1);
      Saxpy.saxpy(paramInt1, -1.0F, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, 1);
      i = 1;
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat6[(i - 1 + paramInt11)] = Math.abs(paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt6 + paramInt5)]);
        i += 1;
      }
      int i2;
      if (bool1)
      {
        if (bool3)
        {
          if (bool2)
          {
            k = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              f7 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
              i = 1;
              for (i2 = k - 1 + 1; i2 > 0; i2--)
              {
                paramArrayOfFloat6[(i - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * f7;
                i += 1;
              }
              k += 1;
            }
          }
          else
          {
            k = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              f7 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
              i = 1;
              for (i2 = k - 1 - 1 + 1; i2 > 0; i2--)
              {
                paramArrayOfFloat6[(i - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * f7;
                i += 1;
              }
              paramArrayOfFloat6[(k - 1 + paramInt11)] += f7;
              k += 1;
            }
          }
        }
        else if (bool2)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f7 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
            i = k;
            for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat6[(i - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * f7;
              i += 1;
            }
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f7 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
            i = k + 1;
            for (i2 = paramInt1 - (k + 1) + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat6[(i - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * f7;
              i += 1;
            }
            paramArrayOfFloat6[(k - 1 + paramInt11)] += f7;
            k += 1;
          }
        }
      }
      else if (bool3)
      {
        if (bool2)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f3 = 0.0F;
            i = 1;
            for (i2 = k - 1 + 1; i2 > 0; i2--)
            {
              f3 += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * Math.abs(paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt8 + paramInt7)]);
              i += 1;
            }
            paramArrayOfFloat6[(k - 1 + paramInt11)] += f3;
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            f3 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
            i = 1;
            for (i2 = k - 1 - 1 + 1; i2 > 0; i2--)
            {
              f3 += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * Math.abs(paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt8 + paramInt7)]);
              i += 1;
            }
            paramArrayOfFloat6[(k - 1 + paramInt11)] += f3;
            k += 1;
          }
        }
      }
      else if (bool2)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          f3 = 0.0F;
          i = k;
          for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
          {
            f3 += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * Math.abs(paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt8 + paramInt7)]);
            i += 1;
          }
          paramArrayOfFloat6[(k - 1 + paramInt11)] += f3;
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          f3 = Math.abs(paramArrayOfFloat3[(k - 1 + (j - 1) * paramInt8 + paramInt7)]);
          i = k + 1;
          for (i2 = paramInt1 - (k + 1) + 1; i2 > 0; i2--)
          {
            f3 += Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) * Math.abs(paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt8 + paramInt7)]);
            i += 1;
          }
          paramArrayOfFloat6[(k - 1 + paramInt11)] += f3;
          k += 1;
        }
      }
      f3 = 0.0F;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfFloat6[(i - 1 + paramInt11)] <= f5 ? 0 : 1) != 0) {
          f3 = Math.max(f3, Math.abs(paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]) / paramArrayOfFloat6[(i - 1 + paramInt11)]);
        } else {
          f3 = Math.max(f3, (Math.abs(paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]) + f4) / (paramArrayOfFloat6[(i - 1 + paramInt11)] + f4));
        }
        i += 1;
      }
      paramArrayOfFloat5[(j - 1 + paramInt10)] = f3;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfFloat6[(i - 1 + paramInt11)] <= f5 ? 0 : 1) != 0) {
          paramArrayOfFloat6[(i - 1 + paramInt11)] = (Math.abs(paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]) + m * f1 * paramArrayOfFloat6[(i - 1 + paramInt11)]);
        } else {
          paramArrayOfFloat6[(i - 1 + paramInt11)] = (Math.abs(paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]) + m * f1 * paramArrayOfFloat6[(i - 1 + paramInt11)] + f4);
        }
        i += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        slacn2_adapter(paramInt1, paramArrayOfFloat6, 2 * paramInt1 + 1 - 1 + paramInt11, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, paramArrayOfInt, paramInt12, paramArrayOfFloat4, j - 1 + paramInt9, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Strsv.strsv(paramString1, str, paramString3, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, 1);
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)] = (paramArrayOfFloat6[(i - 1 + paramInt11)] * paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]);
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)] = (paramArrayOfFloat6[(i - 1 + paramInt11)] * paramArrayOfFloat6[(paramInt1 + i - 1 + paramInt11)]);
            i += 1;
          }
          Strsv.strsv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt11, 1);
        }
      }
      f2 = 0.0F;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        f2 = Math.max(f2, Math.abs(paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt8 + paramInt7)]));
        i += 1;
      }
      if ((f2 == 0.0F ? 0 : 1) != 0) {
        paramArrayOfFloat4[(j - 1 + paramInt9)] /= f2;
      }
      j += 1;
    }
  }
  
  private static void slacn2_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt5]);
    Slacn2.slacn2(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfInt1, paramInt4, localfloatW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfFloat3[paramInt5] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */