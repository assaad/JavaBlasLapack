package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgsja
{
  public static void stgsja(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat1, int paramInt6, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, int paramInt9, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat3, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, int paramInt17, float[] paramArrayOfFloat8, int paramInt18, intW paramintW1, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
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
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f7 = 0.0F;
    float f8 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    floatW localfloatW8 = new floatW(0.0F);
    bool2 = Lsame.lsame(paramString1, "I");
    j = (!bool2) && (!Lsame.lsame(paramString1, "U")) ? 0 : 1;
    bool3 = Lsame.lsame(paramString2, "I");
    k = (!bool3) && (!Lsame.lsame(paramString2, "V")) ? 0 : 1;
    bool1 = Lsame.lsame(paramString3, "I");
    i = (!bool1) && (!Lsame.lsame(paramString3, "Q")) ? 0 : 1;
    paramintW2.val = 0;
    if (((!bool2) && (j == 0) ? 0 : 1) == 0) {}
    if (((!Lsame.lsame(paramString1, "N") ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool3) && (k == 0) ? 0 : 1) == 0) {}
      if (((!Lsame.lsame(paramString2, "N") ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else
      {
        if (((!bool1) && (i == 0) ? 0 : 1) == 0) {}
        if (((!Lsame.lsame(paramString3, "N") ? 0 : 1) ^ 0x1) != 0)
        {
          paramintW2.val = -3;
        }
        else if ((paramInt1 >= 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -4;
        }
        else if ((paramInt2 >= 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -5;
        }
        else if ((paramInt3 >= 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -6;
        }
        else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
        {
          paramintW2.val = -12;
        }
        else
        {
          if ((paramInt13 >= 1 ? 0 : 1) == 0) {
            if (j == 0) {}
          }
          if ((((paramInt13 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -18;
          }
          else
          {
            if ((paramInt15 >= 1 ? 0 : 1) == 0) {
              if (k == 0) {}
            }
            if ((((paramInt15 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = -20;
            }
            else
            {
              if ((paramInt17 >= 1 ? 0 : 1) == 0) {
                if (i == 0) {}
              }
              if ((((paramInt17 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
                paramintW2.val = -22;
              }
            }
          }
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGSJA", -paramintW2.val);
      return;
    }
    if (bool2) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat5, paramInt12, paramInt13);
    }
    if (bool3) {
      Slaset.slaset("Full", paramInt2, paramInt2, 0.0F, 1.0F, paramArrayOfFloat6, paramInt14, paramInt15);
    }
    if (bool1) {
      Slaset.slaset("Full", paramInt3, paramInt3, 0.0F, 1.0F, paramArrayOfFloat7, paramInt16, paramInt17);
    }
    bool4 = false;
    i1 = 1;
    for (int i2 = 40 - 1 + 1; i2 > 0; i2--)
    {
      bool4 ^= true;
      m = 1;
      for (int i3 = paramInt5 - 1 - 1 + 1; i3 > 0; i3--)
      {
        n = m + 1;
        for (int i4 = paramInt5 - (m + 1) + 1; i4 > 0; i4--)
        {
          f1 = 0.0F;
          f2 = 0.0F;
          f3 = 0.0F;
          if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
            f1 = paramArrayOfFloat1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
          }
          if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
            f3 = paramArrayOfFloat1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)];
          }
          f4 = paramArrayOfFloat2[(m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
          f6 = paramArrayOfFloat2[(n - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)];
          if (bool4)
          {
            if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
              f2 = paramArrayOfFloat1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)];
            }
            f5 = paramArrayOfFloat2[(m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)];
          }
          else
          {
            if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
              f2 = paramArrayOfFloat1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
            }
            f5 = paramArrayOfFloat2[(n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
          }
          Slags2.slags2(bool4, f1, f2, f3, f4, f5, f6, localfloatW2, localfloatW6, localfloatW3, localfloatW7, localfloatW1, localfloatW5);
          if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
            Srot.srot(paramInt5, paramArrayOfFloat1, paramInt4 + n - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt7 + paramInt6, paramInt7, localfloatW2.val, localfloatW6.val);
          }
          Srot.srot(paramInt5, paramArrayOfFloat2, n - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt9 + paramInt8, paramInt9, localfloatW3.val, localfloatW7.val);
          Srot.srot(Math.min(paramInt4 + paramInt5, paramInt1), paramArrayOfFloat1, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat1, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, 1, localfloatW1.val, localfloatW5.val);
          Srot.srot(paramInt5, paramArrayOfFloat2, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat2, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, 1, localfloatW1.val, localfloatW5.val);
          if (bool4)
          {
            if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
              paramArrayOfFloat1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)] = 0.0F;
            }
            paramArrayOfFloat2[(m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          else
          {
            if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
              paramArrayOfFloat1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)] = 0.0F;
            }
            paramArrayOfFloat2[(n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          if (j != 0) {}
          if (((paramInt4 + n > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            Srot.srot(paramInt1, paramArrayOfFloat5, 1 - 1 + (paramInt4 + n - 1) * paramInt13 + paramInt12, 1, paramArrayOfFloat5, 1 - 1 + (paramInt4 + m - 1) * paramInt13 + paramInt12, 1, localfloatW2.val, localfloatW6.val);
          }
          if (k != 0) {
            Srot.srot(paramInt2, paramArrayOfFloat6, 1 - 1 + (n - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat6, 1 - 1 + (m - 1) * paramInt15 + paramInt14, 1, localfloatW3.val, localfloatW7.val);
          }
          if (i != 0) {
            Srot.srot(paramInt3, paramArrayOfFloat7, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt17 + paramInt16, 1, paramArrayOfFloat7, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt17 + paramInt16, 1, localfloatW1.val, localfloatW5.val);
          }
          n += 1;
        }
        m += 1;
      }
      if ((bool4 ^ true))
      {
        f7 = 0.0F;
        m = 1;
        for (i3 = Math.min(paramInt5, paramInt1 - paramInt4) - 1 + 1; i3 > 0; i3--)
        {
          Scopy.scopy(paramInt5 - m + 1, paramArrayOfFloat1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat8, paramInt18, 1);
          Scopy.scopy(paramInt5 - m + 1, paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat8, paramInt5 + 1 - 1 + paramInt18, 1);
          Slapll.slapll(paramInt5 - m + 1, paramArrayOfFloat8, paramInt18, 1, paramArrayOfFloat8, paramInt5 + 1 - 1 + paramInt18, 1, localfloatW8);
          f7 = Math.max(f7, localfloatW8.val);
          m += 1;
        }
        if ((Math.abs(f7) > Math.min(paramFloat1, paramFloat2) ? 0 : 1) != 0) {
          break;
        }
      }
      i1 += 1;
    }
    paramintW2.val = 1;
    break label2760;
    m = 1;
    for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
    {
      paramArrayOfFloat3[(m - 1 + paramInt10)] = 1.0F;
      paramArrayOfFloat4[(m - 1 + paramInt11)] = 0.0F;
      m += 1;
    }
    m = 1;
    for (i2 = Math.min(paramInt5, paramInt1 - paramInt4) - 1 + 1; i2 > 0; i2--)
    {
      f1 = paramArrayOfFloat1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
      f4 = paramArrayOfFloat2[(m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
      if ((f1 == 0.0F ? 0 : 1) != 0)
      {
        f8 = f4 / f1;
        if ((f8 >= 0.0F ? 0 : 1) != 0)
        {
          Sscal.sscal(paramInt5 - m + 1, -1.0F, paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9);
          if (k != 0) {
            Sscal.sscal(paramInt2, -1.0F, paramArrayOfFloat6, 1 - 1 + (m - 1) * paramInt15 + paramInt14, 1);
          }
        }
        slartg_adapter(Math.abs(f8), 1.0F, paramArrayOfFloat4, paramInt4 + m - 1 + paramInt11, paramArrayOfFloat3, paramInt4 + m - 1 + paramInt10, localfloatW4);
        if ((paramArrayOfFloat3[(paramInt4 + m - 1 + paramInt10)] < paramArrayOfFloat4[(paramInt4 + m - 1 + paramInt11)] ? 0 : 1) != 0)
        {
          Sscal.sscal(paramInt5 - m + 1, 1.0F / paramArrayOfFloat3[(paramInt4 + m - 1 + paramInt10)], paramArrayOfFloat1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
        }
        else
        {
          Sscal.sscal(paramInt5 - m + 1, 1.0F / paramArrayOfFloat4[(paramInt4 + m - 1 + paramInt11)], paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9);
          Scopy.scopy(paramInt5 - m + 1, paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
        }
      }
      else
      {
        paramArrayOfFloat3[(paramInt4 + m - 1 + paramInt10)] = 0.0F;
        paramArrayOfFloat4[(paramInt4 + m - 1 + paramInt11)] = 1.0F;
        Scopy.scopy(paramInt5 - m + 1, paramArrayOfFloat2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
      }
      m += 1;
    }
    m = paramInt1 + 1;
    for (i2 = paramInt4 + paramInt5 - (paramInt1 + 1) + 1; i2 > 0; i2--)
    {
      paramArrayOfFloat3[(m - 1 + paramInt10)] = 0.0F;
      paramArrayOfFloat4[(m - 1 + paramInt11)] = 1.0F;
      m += 1;
    }
    if ((paramInt4 + paramInt5 >= paramInt3 ? 0 : 1) != 0)
    {
      m = paramInt4 + paramInt5 + 1;
      for (i2 = paramInt3 - (paramInt4 + paramInt5 + 1) + 1; i2 > 0; i2--)
      {
        paramArrayOfFloat3[(m - 1 + paramInt10)] = 0.0F;
        paramArrayOfFloat4[(m - 1 + paramInt11)] = 0.0F;
        m += 1;
      }
    }
    label2760:
    paramintW1.val = i1;
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, floatW paramfloatW)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    Slartg.slartg(paramFloat1, paramFloat2, localfloatW1, localfloatW2, paramfloatW);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgsja.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */