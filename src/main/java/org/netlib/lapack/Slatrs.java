package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Strsv;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slatrs
{
  public static void slatrs(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, floatW paramfloatW, float[] paramArrayOfFloat3, int paramInt5, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
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
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
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
      } else if ((((Lsame.lsame(paramString4, "Y") ^ true)) && ((Lsame.lsame(paramString4, "N") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -4;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLATRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f4 = Slamch.slamch("Safe minimum") / Slamch.slamch("Precision");
    f1 = 1.0F / f4;
    paramfloatW.val = 1.0F;
    int i2;
    if (Lsame.lsame(paramString4, "N")) {
      if (bool3)
      {
        k = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat3[(k - 1 + paramInt5)] = Sasum.sasum(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1);
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat3[(k - 1 + paramInt5)] = Sasum.sasum(paramInt1 - k, paramArrayOfFloat1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1);
          k += 1;
        }
        paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] = 0.0F;
      }
    }
    j = Isamax.isamax(paramInt1, paramArrayOfFloat3, paramInt5, 1);
    f8 = paramArrayOfFloat3[(j - 1 + paramInt5)];
    if ((f8 > f1 ? 0 : 1) != 0)
    {
      f9 = 1.0F;
    }
    else
    {
      f9 = 1.0F / (f4 * f8);
      Sscal.sscal(paramInt1, f9, paramArrayOfFloat3, paramInt5, 1);
    }
    k = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt4, 1);
    f13 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
    f11 = f13;
    if (bool1)
    {
      if (bool3)
      {
        m = paramInt1;
        i1 = 1;
        n = -1;
      }
      else
      {
        m = 1;
        i1 = paramInt1;
        n = 1;
      }
      if ((f9 == 1.0F ? 0 : 1) != 0)
      {
        f2 = 0.0F;
      }
      else if (bool2)
      {
        f2 = 1.0F / Math.max(f11, f4);
        f11 = f2;
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((f2 > f4 ? 0 : 1) != 0) {
            break;
          }
          f6 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
          f11 = Math.min(f11, Math.min(1.0F, f6) * f2);
          if ((f6 + paramArrayOfFloat3[(k - 1 + paramInt5)] < f4 ? 0 : 1) != 0) {
            f2 *= f6 / (f6 + paramArrayOfFloat3[(k - 1 + paramInt5)]);
          } else {
            f2 = 0.0F;
          }
          k += n;
        }
        f2 = f11;
      }
      else
      {
        f2 = Math.min(1.0F, 1.0F / Math.max(f11, f4));
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((f2 > f4 ? 0 : 1) != 0) {
            break;
          }
          f2 *= 1.0F / (1.0F + paramArrayOfFloat3[(k - 1 + paramInt5)]);
          k += n;
        }
      }
    }
    else
    {
      if (bool3)
      {
        m = 1;
        i1 = paramInt1;
        n = 1;
      }
      else
      {
        m = paramInt1;
        i1 = 1;
        n = -1;
      }
      if ((f9 == 1.0F ? 0 : 1) != 0)
      {
        f2 = 0.0F;
      }
      else if (bool2)
      {
        f2 = 1.0F / Math.max(f11, f4);
        f11 = f2;
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((f2 > f4 ? 0 : 1) != 0) {
            break;
          }
          f12 = 1.0F + paramArrayOfFloat3[(k - 1 + paramInt5)];
          f2 = Math.min(f2, f11 / f12);
          f6 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
          if ((f12 <= f6 ? 0 : 1) != 0) {
            f11 *= f6 / f12;
          }
          k += n;
        }
        f2 = Math.min(f2, f11);
      }
      else
      {
        f2 = Math.min(1.0F, 1.0F / Math.max(f11, f4));
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((f2 > f4 ? 0 : 1) != 0) {
            break;
          }
          f12 = 1.0F + paramArrayOfFloat3[(k - 1 + paramInt5)];
          f2 /= f12;
          k += n;
        }
      }
    }
    if ((f2 * f9 <= f4 ? 0 : 1) != 0)
    {
      Strsv.strsv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, 1);
    }
    else
    {
      if ((f13 <= f1 ? 0 : 1) != 0)
      {
        paramfloatW.val = (f1 / f13);
        Sscal.sscal(paramInt1, paramfloatW.val, paramArrayOfFloat2, paramInt4, 1);
        f13 = f1;
      }
      int i3;
      if (bool1)
      {
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          f12 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
          if (bool2)
          {
            f7 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * f9;
          }
          else
          {
            f7 = f9;
            if ((f9 != 1.0F ? 0 : 1) != 0) {
              break label1791;
            }
          }
          f6 = Math.abs(f7);
          if ((f6 <= f4 ? 0 : 1) != 0)
          {
            if ((f6 >= 1.0F ? 0 : 1) != 0) {
              if ((f12 <= f6 * f1 ? 0 : 1) != 0)
              {
                f3 = 1.0F / f12;
                Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
                paramfloatW.val *= f3;
                f13 *= f3;
              }
            }
            paramArrayOfFloat2[(k - 1 + paramInt4)] /= f7;
            f12 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
          }
          else if ((f6 <= 0.0F ? 0 : 1) != 0)
          {
            if ((f12 <= f6 * f1 ? 0 : 1) != 0)
            {
              f3 = f6 * f1 / f12;
              if ((paramArrayOfFloat3[(k - 1 + paramInt5)] <= 1.0F ? 0 : 1) != 0) {
                f3 /= paramArrayOfFloat3[(k - 1 + paramInt5)];
              }
              Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
              paramfloatW.val *= f3;
              f13 *= f3;
            }
            paramArrayOfFloat2[(k - 1 + paramInt4)] /= f7;
            f12 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
          }
          else
          {
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfFloat2[(i - 1 + paramInt4)] = 0.0F;
              i += 1;
            }
            paramArrayOfFloat2[(k - 1 + paramInt4)] = 1.0F;
            f12 = 1.0F;
            paramfloatW.val = 0.0F;
            f13 = 0.0F;
          }
          label1791:
          if ((f12 <= 1.0F ? 0 : 1) != 0)
          {
            f3 = 1.0F / f12;
            if ((paramArrayOfFloat3[(k - 1 + paramInt5)] <= (f1 - f13) * f3 ? 0 : 1) != 0)
            {
              f3 *= 0.5F;
              Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
              paramfloatW.val *= f3;
            }
          }
          else if ((f12 * paramArrayOfFloat3[(k - 1 + paramInt5)] <= f1 - f13 ? 0 : 1) != 0)
          {
            Sscal.sscal(paramInt1, 0.5F, paramArrayOfFloat2, paramInt4, 1);
            paramfloatW.val *= 0.5F;
          }
          if (bool3)
          {
            if ((k <= 1 ? 0 : 1) != 0)
            {
              Saxpy.saxpy(k - 1, -(paramArrayOfFloat2[(k - 1 + paramInt4)] * f9), paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
              i = Isamax.isamax(k - 1, paramArrayOfFloat2, paramInt4, 1);
              f13 = Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]);
            }
          }
          else if ((k >= paramInt1 ? 0 : 1) != 0)
          {
            Saxpy.saxpy(paramInt1 - k, -(paramArrayOfFloat2[(k - 1 + paramInt4)] * f9), paramArrayOfFloat1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, k + 1 - 1 + paramInt4, 1);
            i = k + Isamax.isamax(paramInt1 - k, paramArrayOfFloat2, k + 1 - 1 + paramInt4, 1);
            f13 = Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]);
          }
          k += n;
        }
      }
      else
      {
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          f12 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
          f10 = f9;
          f3 = 1.0F / Math.max(f13, 1.0F);
          if ((paramArrayOfFloat3[(k - 1 + paramInt5)] <= (f1 - f12) * f3 ? 0 : 1) != 0)
          {
            f3 *= 0.5F;
            if (bool2) {
              f7 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * f9;
            } else {
              f7 = f9;
            }
            f6 = Math.abs(f7);
            if ((f6 <= 1.0F ? 0 : 1) != 0)
            {
              f3 = Math.min(1.0F, f3 * f6);
              f10 /= f7;
            }
            if ((f3 >= 1.0F ? 0 : 1) != 0)
            {
              Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
              paramfloatW.val *= f3;
              f13 *= f3;
            }
          }
          f5 = 0.0F;
          if ((f10 != 1.0F ? 0 : 1) != 0)
          {
            if (bool3) {
              f5 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            } else if ((k >= paramInt1 ? 0 : 1) != 0) {
              f5 = Sdot.sdot(paramInt1 - k, paramArrayOfFloat1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, k + 1 - 1 + paramInt4, 1);
            }
          }
          else if (bool3)
          {
            i = 1;
            for (i3 = k - 1 - 1 + 1; i3 > 0; i3--)
            {
              f5 += paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt3 + paramInt2)] * f10 * paramArrayOfFloat2[(i - 1 + paramInt4)];
              i += 1;
            }
          }
          else if ((k >= paramInt1 ? 0 : 1) != 0)
          {
            i = k + 1;
            i3 = paramInt1 - (k + 1) + 1;
            for (;;)
            {
              f5 += paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt3 + paramInt2)] * f10 * paramArrayOfFloat2[(i - 1 + paramInt4)];
              i += 1;
              i3--;
              if (i3 <= 0) {
                break;
              }
            }
          }
          if ((f10 != f9 ? 0 : 1) != 0)
          {
            paramArrayOfFloat2[(k - 1 + paramInt4)] -= f5;
            f12 = Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]);
            if (bool2)
            {
              f7 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * f9;
            }
            else
            {
              f7 = f9;
              if ((f9 != 1.0F ? 0 : 1) != 0) {
                break label3037;
              }
            }
            f6 = Math.abs(f7);
            if ((f6 <= f4 ? 0 : 1) != 0)
            {
              if ((f6 >= 1.0F ? 0 : 1) != 0) {
                if ((f12 <= f6 * f1 ? 0 : 1) != 0)
                {
                  f3 = 1.0F / f12;
                  Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
                  paramfloatW.val *= f3;
                  f13 *= f3;
                }
              }
              paramArrayOfFloat2[(k - 1 + paramInt4)] /= f7;
            }
            else if ((f6 <= 0.0F ? 0 : 1) != 0)
            {
              if ((f12 <= f6 * f1 ? 0 : 1) != 0)
              {
                f3 = f6 * f1 / f12;
                Sscal.sscal(paramInt1, f3, paramArrayOfFloat2, paramInt4, 1);
                paramfloatW.val *= f3;
                f13 *= f3;
              }
              paramArrayOfFloat2[(k - 1 + paramInt4)] /= f7;
            }
            else
            {
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfFloat2[(i - 1 + paramInt4)] = 0.0F;
                i += 1;
              }
              paramArrayOfFloat2[(k - 1 + paramInt4)] = 1.0F;
              paramfloatW.val = 0.0F;
              f13 = 0.0F;
            }
          }
          else
          {
            label3037:
            paramArrayOfFloat2[(k - 1 + paramInt4)] = (paramArrayOfFloat2[(k - 1 + paramInt4)] / f7 - f5);
          }
          f13 = Math.max(f13, Math.abs(paramArrayOfFloat2[(k - 1 + paramInt4)]));
          k += n;
        }
      }
      paramfloatW.val /= f9;
    }
    if ((f9 == 1.0F ? 0 : 1) != 0) {
      Sscal.sscal(paramInt1, 1.0F / f9, paramArrayOfFloat3, paramInt5, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slatrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */