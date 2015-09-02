package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgsja
{
  public static void dtgsja(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double[] paramArrayOfDouble1, int paramInt6, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, int paramInt9, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble3, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, double[] paramArrayOfDouble7, int paramInt16, int paramInt17, double[] paramArrayOfDouble8, int paramInt18, intW paramintW1, intW paramintW2)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d7 = 0.0D;
    double d8 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    doubleW localdoubleW8 = new doubleW(0.0D);
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
      Xerbla.xerbla("DTGSJA", -paramintW2.val);
      return;
    }
    if (bool2) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble5, paramInt12, paramInt13);
    }
    if (bool3) {
      Dlaset.dlaset("Full", paramInt2, paramInt2, 0.0D, 1.0D, paramArrayOfDouble6, paramInt14, paramInt15);
    }
    if (bool1) {
      Dlaset.dlaset("Full", paramInt3, paramInt3, 0.0D, 1.0D, paramArrayOfDouble7, paramInt16, paramInt17);
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
          d1 = 0.0D;
          d2 = 0.0D;
          d3 = 0.0D;
          if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
            d1 = paramArrayOfDouble1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
          }
          if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
            d3 = paramArrayOfDouble1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)];
          }
          d4 = paramArrayOfDouble2[(m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
          d6 = paramArrayOfDouble2[(n - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)];
          if (bool4)
          {
            if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
              d2 = paramArrayOfDouble1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)];
            }
            d5 = paramArrayOfDouble2[(m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)];
          }
          else
          {
            if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
              d2 = paramArrayOfDouble1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
            }
            d5 = paramArrayOfDouble2[(n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
          }
          Dlags2.dlags2(bool4, d1, d2, d3, d4, d5, d6, localdoubleW2, localdoubleW6, localdoubleW3, localdoubleW7, localdoubleW1, localdoubleW5);
          if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
            Drot.drot(paramInt5, paramArrayOfDouble1, paramInt4 + n - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt7 + paramInt6, paramInt7, localdoubleW2.val, localdoubleW6.val);
          }
          Drot.drot(paramInt5, paramArrayOfDouble2, n - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + 1 - 1) * paramInt9 + paramInt8, paramInt9, localdoubleW3.val, localdoubleW7.val);
          Drot.drot(Math.min(paramInt4 + paramInt5, paramInt1), paramArrayOfDouble1, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble1, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, 1, localdoubleW1.val, localdoubleW5.val);
          Drot.drot(paramInt5, paramArrayOfDouble2, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble2, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, 1, localdoubleW1.val, localdoubleW5.val);
          if (bool4)
          {
            if ((paramInt4 + m > paramInt1 ? 0 : 1) != 0) {
              paramArrayOfDouble1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt7 + paramInt6)] = 0.0D;
            }
            paramArrayOfDouble2[(m - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
          else
          {
            if ((paramInt4 + n > paramInt1 ? 0 : 1) != 0) {
              paramArrayOfDouble1[(paramInt4 + n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)] = 0.0D;
            }
            paramArrayOfDouble2[(n - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
          if (j != 0) {}
          if (((paramInt4 + n > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            Drot.drot(paramInt1, paramArrayOfDouble5, 1 - 1 + (paramInt4 + n - 1) * paramInt13 + paramInt12, 1, paramArrayOfDouble5, 1 - 1 + (paramInt4 + m - 1) * paramInt13 + paramInt12, 1, localdoubleW2.val, localdoubleW6.val);
          }
          if (k != 0) {
            Drot.drot(paramInt2, paramArrayOfDouble6, 1 - 1 + (n - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble6, 1 - 1 + (m - 1) * paramInt15 + paramInt14, 1, localdoubleW3.val, localdoubleW7.val);
          }
          if (i != 0) {
            Drot.drot(paramInt3, paramArrayOfDouble7, 1 - 1 + (paramInt3 - paramInt5 + n - 1) * paramInt17 + paramInt16, 1, paramArrayOfDouble7, 1 - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt17 + paramInt16, 1, localdoubleW1.val, localdoubleW5.val);
          }
          n += 1;
        }
        m += 1;
      }
      if ((bool4 ^ true))
      {
        d7 = 0.0D;
        m = 1;
        for (i3 = Math.min(paramInt5, paramInt1 - paramInt4) - 1 + 1; i3 > 0; i3--)
        {
          Dcopy.dcopy(paramInt5 - m + 1, paramArrayOfDouble1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble8, paramInt18, 1);
          Dcopy.dcopy(paramInt5 - m + 1, paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble8, paramInt5 + 1 - 1 + paramInt18, 1);
          Dlapll.dlapll(paramInt5 - m + 1, paramArrayOfDouble8, paramInt18, 1, paramArrayOfDouble8, paramInt5 + 1 - 1 + paramInt18, 1, localdoubleW8);
          d7 = Math.max(d7, localdoubleW8.val);
          m += 1;
        }
        if ((Math.abs(d7) > Math.min(paramDouble1, paramDouble2) ? 0 : 1) != 0) {
          break;
        }
      }
      i1 += 1;
    }
    paramintW2.val = 1;
    break label2762;
    m = 1;
    for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
    {
      paramArrayOfDouble3[(m - 1 + paramInt10)] = 1.0D;
      paramArrayOfDouble4[(m - 1 + paramInt11)] = 0.0D;
      m += 1;
    }
    m = 1;
    for (i2 = Math.min(paramInt5, paramInt1 - paramInt4) - 1 + 1; i2 > 0; i2--)
    {
      d1 = paramArrayOfDouble1[(paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6)];
      d4 = paramArrayOfDouble2[(m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8)];
      if ((d1 == 0.0D ? 0 : 1) != 0)
      {
        d8 = d4 / d1;
        if ((d8 >= 0.0D ? 0 : 1) != 0)
        {
          Dscal.dscal(paramInt5 - m + 1, -1.0D, paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9);
          if (k != 0) {
            Dscal.dscal(paramInt2, -1.0D, paramArrayOfDouble6, 1 - 1 + (m - 1) * paramInt15 + paramInt14, 1);
          }
        }
        dlartg_adapter(Math.abs(d8), 1.0D, paramArrayOfDouble4, paramInt4 + m - 1 + paramInt11, paramArrayOfDouble3, paramInt4 + m - 1 + paramInt10, localdoubleW4);
        if ((paramArrayOfDouble3[(paramInt4 + m - 1 + paramInt10)] < paramArrayOfDouble4[(paramInt4 + m - 1 + paramInt11)] ? 0 : 1) != 0)
        {
          Dscal.dscal(paramInt5 - m + 1, 1.0D / paramArrayOfDouble3[(paramInt4 + m - 1 + paramInt10)], paramArrayOfDouble1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
        }
        else
        {
          Dscal.dscal(paramInt5 - m + 1, 1.0D / paramArrayOfDouble4[(paramInt4 + m - 1 + paramInt11)], paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9);
          Dcopy.dcopy(paramInt5 - m + 1, paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
        }
      }
      else
      {
        paramArrayOfDouble3[(paramInt4 + m - 1 + paramInt10)] = 0.0D;
        paramArrayOfDouble4[(paramInt4 + m - 1 + paramInt11)] = 1.0D;
        Dcopy.dcopy(paramInt5 - m + 1, paramArrayOfDouble2, m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramInt4 + m - 1 + (paramInt3 - paramInt5 + m - 1) * paramInt7 + paramInt6, paramInt7);
      }
      m += 1;
    }
    m = paramInt1 + 1;
    for (i2 = paramInt4 + paramInt5 - (paramInt1 + 1) + 1; i2 > 0; i2--)
    {
      paramArrayOfDouble3[(m - 1 + paramInt10)] = 0.0D;
      paramArrayOfDouble4[(m - 1 + paramInt11)] = 1.0D;
      m += 1;
    }
    if ((paramInt4 + paramInt5 >= paramInt3 ? 0 : 1) != 0)
    {
      m = paramInt4 + paramInt5 + 1;
      for (i2 = paramInt3 - (paramInt4 + paramInt5 + 1) + 1; i2 > 0; i2--)
      {
        paramArrayOfDouble3[(m - 1 + paramInt10)] = 0.0D;
        paramArrayOfDouble4[(m - 1 + paramInt11)] = 0.0D;
        m += 1;
      }
    }
    label2762:
    paramintW1.val = i1;
  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, doubleW paramdoubleW)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    Dlartg.dlartg(paramDouble1, paramDouble2, localdoubleW1, localdoubleW2, paramdoubleW);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgsja.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */