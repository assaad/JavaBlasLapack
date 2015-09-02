package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Shsein
{
  public static void shsein(String paramString1, String paramString2, String paramString3, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, int paramInt10, int paramInt11, intW paramintW1, float[] paramArrayOfFloat6, int paramInt12, int[] paramArrayOfInt1, int paramInt13, int[] paramArrayOfInt2, int paramInt14, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    bool1 = Lsame.lsame(paramString1, "B");
    k = (!Lsame.lsame(paramString1, "R")) && (!bool1) ? 0 : 1;
    i = (!Lsame.lsame(paramString1, "L")) && (!bool1) ? 0 : 1;
    bool2 = Lsame.lsame(paramString2, "Q");
    bool3 = Lsame.lsame(paramString3, "N");
    paramintW1.val = 0;
    j = 0;
    n = 1;
    for (int i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      if (j != 0)
      {
        j = 0;
        paramArrayOfBoolean[(n - 1 + paramInt1)] = false;
      }
      else if ((paramArrayOfFloat3[(n - 1 + paramInt6)] != 0.0F ? 0 : 1) != 0)
      {
        if (paramArrayOfBoolean[(n - 1 + paramInt1)] != 0) {
          paramintW1.val += 1;
        }
      }
      else
      {
        j = 1;
        if (((paramArrayOfBoolean[(n - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(n + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0)
        {
          paramArrayOfBoolean[(n - 1 + paramInt1)] = true;
          paramintW1.val += 2;
        }
      }
      n += 1;
    }
    paramintW2.val = 0;
    if ((((k ^ 0x1) != 0) && ((i ^ 0x1) != 0) ? 1 : 0) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((((bool3 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0)
    {
      paramintW2.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -5;
    }
    else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW2.val = -7;
    }
    else
    {
      if ((paramInt8 >= 1 ? 0 : 1) == 0) {
        if (i == 0) {}
      }
      if ((((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -11;
      }
      else
      {
        if ((paramInt10 >= 1 ? 0 : 1) == 0) {
          if (k == 0) {}
        }
        if ((((paramInt10 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW2.val = -13;
        } else if ((paramInt11 >= paramintW1.val ? 0 : 1) != 0) {
          paramintW2.val = -14;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SHSEIN", -paramintW2.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    f6 = Slamch.slamch("Safe minimum");
    f5 = Slamch.slamch("Precision");
    f4 = f6 * (paramInt2 / f5);
    f1 = (1.0F - f5) / f4;
    i6 = paramInt2 + 1;
    i1 = 1;
    i2 = 0;
    if (bool2) {
      i3 = 0;
    } else {
      i3 = paramInt2;
    }
    i5 = 1;
    n = 1;
    for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      if (paramArrayOfBoolean[(n - 1 + paramInt1)] != 0)
      {
        if (bool2)
        {
          m = n;
          for (i8 = (i1 + 1 - n + -1) / -1; i8 > 0; i8--)
          {
            if ((paramArrayOfFloat1[(m - 1 + (m - 1 - 1) * paramInt4 + paramInt3)] != 0.0F ? 0 : 1) != 0) {
              break;
            }
            m += -1;
          }
          i1 = m;
          if ((n <= i3 ? 0 : 1) != 0)
          {
            m = n;
            for (i8 = paramInt2 - 1 - n + 1; i8 > 0; i8--)
            {
              if ((paramArrayOfFloat1[(m + 1 - 1 + (m - 1) * paramInt4 + paramInt3)] != 0.0F ? 0 : 1) != 0) {
                break;
              }
              m += 1;
            }
            i3 = m;
          }
        }
        if ((i1 == i2 ? 0 : 1) != 0)
        {
          i2 = i1;
          f3 = Slanhs.slanhs("I", i3 - i1 + 1, paramArrayOfFloat1, i1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat6, paramInt12);
          if ((f3 <= 0.0F ? 0 : 1) != 0) {
            f2 = f3 * f5;
          } else {
            f2 = f4;
          }
        }
        f8 = paramArrayOfFloat2[(n - 1 + paramInt5)];
        f7 = paramArrayOfFloat3[(n - 1 + paramInt6)];
        m = n - 1;
        for (int i8 = (i1 - (n - 1) + -1) / -1; i8 > 0; i8--)
        {
          if (paramArrayOfBoolean[(m - 1 + paramInt1)] != 0) {}
          if (((Math.abs(paramArrayOfFloat2[(m - 1 + paramInt5)] - f8) + Math.abs(paramArrayOfFloat3[(m - 1 + paramInt6)] - f7) >= f2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            f8 += f2;
            break;
          }
          m += -1;
        }
        paramArrayOfFloat2[(n - 1 + paramInt5)] = f8;
        j = f7 == 0.0F ? 0 : 1;
        if (j != 0) {
          i4 = i5 + 1;
        } else {
          i4 = i5;
        }
        if (i != 0)
        {
          Slaein.slaein(false, bool3, paramInt2 - i1 + 1, paramArrayOfFloat1, i1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, f8, f7, paramArrayOfFloat4, i1 - 1 + (i5 - 1) * paramInt8 + paramInt7, paramArrayOfFloat4, i1 - 1 + (i4 - 1) * paramInt8 + paramInt7, paramArrayOfFloat6, paramInt12, i6, paramArrayOfFloat6, paramInt2 * paramInt2 + paramInt2 + 1 - 1 + paramInt12, f2, f4, f1, localintW);
          if ((localintW.val <= 0 ? 0 : 1) != 0)
          {
            if (j != 0) {
              paramintW2.val += 2;
            } else {
              paramintW2.val += 1;
            }
            paramArrayOfInt1[(i5 - 1 + paramInt13)] = n;
            paramArrayOfInt1[(i4 - 1 + paramInt13)] = n;
          }
          else
          {
            paramArrayOfInt1[(i5 - 1 + paramInt13)] = 0;
            paramArrayOfInt1[(i4 - 1 + paramInt13)] = 0;
          }
          m = 1;
          for (i8 = i1 - 1 - 1 + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat4[(m - 1 + (i5 - 1) * paramInt8 + paramInt7)] = 0.0F;
            m += 1;
          }
          if (j != 0)
          {
            m = 1;
            for (i8 = i1 - 1 - 1 + 1; i8 > 0; i8--)
            {
              paramArrayOfFloat4[(m - 1 + (i4 - 1) * paramInt8 + paramInt7)] = 0.0F;
              m += 1;
            }
          }
        }
        if (k != 0)
        {
          Slaein.slaein(true, bool3, i3, paramArrayOfFloat1, paramInt3, paramInt4, f8, f7, paramArrayOfFloat5, 1 - 1 + (i5 - 1) * paramInt10 + paramInt9, paramArrayOfFloat5, 1 - 1 + (i4 - 1) * paramInt10 + paramInt9, paramArrayOfFloat6, paramInt12, i6, paramArrayOfFloat6, paramInt2 * paramInt2 + paramInt2 + 1 - 1 + paramInt12, f2, f4, f1, localintW);
          if ((localintW.val <= 0 ? 0 : 1) != 0)
          {
            if (j != 0) {
              paramintW2.val += 2;
            } else {
              paramintW2.val += 1;
            }
            paramArrayOfInt2[(i5 - 1 + paramInt14)] = n;
            paramArrayOfInt2[(i4 - 1 + paramInt14)] = n;
          }
          else
          {
            paramArrayOfInt2[(i5 - 1 + paramInt14)] = 0;
            paramArrayOfInt2[(i4 - 1 + paramInt14)] = 0;
          }
          m = i3 + 1;
          for (i8 = paramInt2 - (i3 + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat5[(m - 1 + (i5 - 1) * paramInt10 + paramInt9)] = 0.0F;
            m += 1;
          }
          if (j != 0)
          {
            m = i3 + 1;
            for (i8 = paramInt2 - (i3 + 1) + 1; i8 > 0; i8--)
            {
              paramArrayOfFloat5[(m - 1 + (i4 - 1) * paramInt10 + paramInt9)] = 0.0F;
              m += 1;
            }
          }
        }
        if (j != 0) {
          i5 += 2;
        } else {
          i5 += 1;
        }
      }
      n += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Shsein.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */