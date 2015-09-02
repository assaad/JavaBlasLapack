package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaqr2
{
  public static void dlaqr2(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, int paramInt7, int paramInt8, double[] paramArrayOfDouble2, int paramInt9, int paramInt10, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble3, int paramInt11, double[] paramArrayOfDouble4, int paramInt12, double[] paramArrayOfDouble5, int paramInt13, int paramInt14, int paramInt15, double[] paramArrayOfDouble6, int paramInt16, int paramInt17, int paramInt18, double[] paramArrayOfDouble7, int paramInt19, int paramInt20, double[] paramArrayOfDouble8, int paramInt21, int paramInt22)
  {
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW7 = new doubleW(0.0D);
    doubleW localdoubleW8 = new doubleW(0.0D);
    double d5 = 0.0D;
    doubleW localdoubleW9 = new doubleW(0.0D);
    doubleW localdoubleW10 = new doubleW(0.0D);
    double d6 = 0.0D;
    int i = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    k = Math.min(paramInt4, paramInt3 - paramInt2 + 1);
    if ((k > 2 ? 0 : 1) != 0)
    {
      i8 = 1;
    }
    else
    {
      Dgehrd.dgehrd(k, 1, k - 1, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, paramInt21, paramArrayOfDouble8, paramInt21, -1, localintW3);
      i6 = (int)paramArrayOfDouble8[(1 - 1 + paramInt21)];
      Dorghr.dorghr(k, 1, k - 1, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, paramInt21, paramArrayOfDouble8, paramInt21, -1, localintW3);
      i7 = (int)paramArrayOfDouble8[(1 - 1 + paramInt21)];
      i8 = k + Math.max(i6, i7);
    }
    if ((paramInt22 != -1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble8[(1 - 1 + paramInt21)] = i8;
      return;
    }
    paramintW1.val = 0;
    paramintW2.val = 0;
    if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt4 >= 1 ? 0 : 1) != 0) {
      return;
    }
    localdoubleW8.val = Dlamch.dlamch("SAFE MINIMUM");
    localdoubleW7.val = (1.0D / localdoubleW8.val);
    Dlabad.dlabad(localdoubleW8, localdoubleW7);
    d6 = Dlamch.dlamch("PRECISION");
    d5 = localdoubleW8.val * (paramInt1 / d6);
    k = Math.min(paramInt4, paramInt3 - paramInt2 + 1);
    i4 = paramInt3 - k + 1;
    if ((i4 != paramInt2 ? 0 : 1) != 0) {
      d4 = 0.0D;
    } else {
      d4 = paramArrayOfDouble1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)];
    }
    if ((paramInt3 != i4 ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(i4 - 1 + paramInt11)] = paramArrayOfDouble1[(i4 - 1 + (i4 - 1) * paramInt6 + paramInt5)];
      paramArrayOfDouble4[(i4 - 1 + paramInt12)] = 0.0D;
      paramintW1.val = 1;
      paramintW2.val = 0;
      if ((Math.abs(d4) > Math.max(d5, d6 * Math.abs(paramArrayOfDouble1[(i4 - 1 + (i4 - 1) * paramInt6 + paramInt5)])) ? 0 : 1) != 0)
      {
        paramintW1.val = 0;
        paramintW2.val = 1;
        if ((i4 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfDouble1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)] = 0.0D;
        }
      }
      return;
    }
    Dlacpy.dlacpy("U", k, k, paramArrayOfDouble1, i4 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble6, paramInt16, paramInt17);
    Dcopy.dcopy(k - 1, paramArrayOfDouble1, i4 + 1 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6 + 1, paramArrayOfDouble6, 2 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17 + 1);
    Dlaset.dlaset("A", k, k, 0.0D, 1.0D, paramArrayOfDouble5, paramInt13, paramInt14);
    Dlahqr.dlahqr(true, true, k, 1, k, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble3, i4 - 1 + paramInt11, paramArrayOfDouble4, i4 - 1 + paramInt12, 1, k, paramArrayOfDouble5, paramInt13, paramInt14, localintW4);
    j = 1;
    for (int i11 = k - 3 - 1 + 1; i11 > 0; i11--)
    {
      paramArrayOfDouble6[(j + 2 - 1 + (j - 1) * paramInt17 + paramInt16)] = 0.0D;
      paramArrayOfDouble6[(j + 3 - 1 + (j - 1) * paramInt17 + paramInt16)] = 0.0D;
      j += 1;
    }
    if ((k <= 2 ? 0 : 1) != 0) {
      paramArrayOfDouble6[(k - 1 + (k - 2 - 1) * paramInt17 + paramInt16)] = 0.0D;
    }
    paramintW1.val = k;
    localintW4.val += 1;
    while ((localintW2.val > paramintW1.val ? 0 : 1) != 0)
    {
      if ((paramintW1.val != 1 ? 0 : 1) != 0) {
        i9 = 0;
      } else {
        i9 = paramArrayOfDouble6[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt17 + paramInt16)] == 0.0D ? 0 : 1;
      }
      if ((i9 ^ 0x1) != 0)
      {
        d3 = Math.abs(paramArrayOfDouble6[(paramintW1.val - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]);
        if ((d3 != 0.0D ? 0 : 1) != 0) {
          d3 = Math.abs(d4);
        }
        if ((Math.abs(d4 * paramArrayOfDouble5[(1 - 1 + (paramintW1.val - 1) * paramInt14 + paramInt13)]) > Math.max(d5, d6 * d3) ? 0 : 1) != 0)
        {
          paramintW1.val -= 1;
        }
        else
        {
          localintW1.val = paramintW1.val;
          Dtrexc.dtrexc("V", k, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfDouble8, paramInt21, localintW3);
          localintW2.val += 1;
        }
      }
      else
      {
        d3 = Math.abs(paramArrayOfDouble6[(paramintW1.val - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]) + Math.sqrt(Math.abs(paramArrayOfDouble6[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt17 + paramInt16)])) * Math.sqrt(Math.abs(paramArrayOfDouble6[(paramintW1.val - 1 - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]));
        if ((d3 != 0.0D ? 0 : 1) != 0) {
          d3 = Math.abs(d4);
        }
        if ((Math.max(Math.abs(d4 * paramArrayOfDouble5[(1 - 1 + (paramintW1.val - 1) * paramInt14 + paramInt13)]), Math.abs(d4 * paramArrayOfDouble5[(1 - 1 + (paramintW1.val - 1 - 1) * paramInt14 + paramInt13)])) > Math.max(d5, d6 * d3) ? 0 : 1) != 0)
        {
          paramintW1.val -= 2;
        }
        else
        {
          localintW1.val = paramintW1.val;
          Dtrexc.dtrexc("V", k, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfDouble8, paramInt21, localintW3);
          localintW2.val += 2;
        }
      }
    }
    if ((paramintW1.val != 0 ? 0 : 1) != 0) {
      d4 = 0.0D;
    }
    if ((paramintW1.val >= k ? 0 : 1) != 0)
    {
      i10 = 0;
      i = paramintW1.val + 1;
      while (i10 == 0)
      {
        i10 = 1;
        i1 = i - 1;
        i = localintW4.val + 1;
        if ((i != paramintW1.val ? 0 : 1) != 0) {
          m = i + 1;
        } else if ((paramArrayOfDouble6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)] != 0.0D ? 0 : 1) != 0) {
          m = i + 1;
        } else {
          m = i + 2;
        }
        while ((m > i1 ? 0 : 1) != 0)
        {
          if ((m != i + 1 ? 0 : 1) != 0) {
            d1 = Math.abs(paramArrayOfDouble6[(i - 1 + (i - 1) * paramInt17 + paramInt16)]);
          } else {
            d1 = Math.abs(paramArrayOfDouble6[(i - 1 + (i - 1) * paramInt17 + paramInt16)]) + Math.sqrt(Math.abs(paramArrayOfDouble6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)])) * Math.sqrt(Math.abs(paramArrayOfDouble6[(i - 1 + (i + 1 - 1) * paramInt17 + paramInt16)]));
          }
          if ((m != i1 ? 0 : 1) != 0) {
            d2 = Math.abs(paramArrayOfDouble6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]);
          } else if ((paramArrayOfDouble6[(m + 1 - 1 + (m - 1) * paramInt17 + paramInt16)] != 0.0D ? 0 : 1) != 0) {
            d2 = Math.abs(paramArrayOfDouble6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]);
          } else {
            d2 = Math.abs(paramArrayOfDouble6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]) + Math.sqrt(Math.abs(paramArrayOfDouble6[(m + 1 - 1 + (m - 1) * paramInt17 + paramInt16)])) * Math.sqrt(Math.abs(paramArrayOfDouble6[(m - 1 + (m + 1 - 1) * paramInt17 + paramInt16)]));
          }
          if ((d1 < d2 ? 0 : 1) != 0)
          {
            i = m;
          }
          else
          {
            i10 = 0;
            localintW1.val = i;
            localintW2.val = m;
            Dtrexc.dtrexc("V", k, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfDouble8, paramInt21, localintW3);
            if ((localintW3.val != 0 ? 0 : 1) != 0) {
              i = localintW2.val;
            } else {
              i = m;
            }
          }
          if ((i != i1 ? 0 : 1) != 0) {
            m = i + 1;
          } else if ((paramArrayOfDouble6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)] != 0.0D ? 0 : 1) != 0) {
            m = i + 1;
          } else {
            m = i + 2;
          }
        }
      }
    }
    i = k;
    while ((i < localintW4.val + 1 ? 0 : 1) != 0) {
      if ((i != localintW4.val + 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(i4 + i - 1 - 1 + paramInt11)] = paramArrayOfDouble6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        paramArrayOfDouble4[(i4 + i - 1 - 1 + paramInt12)] = 0.0D;
        i -= 1;
      }
      else if ((paramArrayOfDouble6[(i - 1 + (i - 1 - 1) * paramInt17 + paramInt16)] != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(i4 + i - 1 - 1 + paramInt11)] = paramArrayOfDouble6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        paramArrayOfDouble4[(i4 + i - 1 - 1 + paramInt12)] = 0.0D;
        i -= 1;
      }
      else
      {
        localdoubleW1.val = paramArrayOfDouble6[(i - 1 - 1 + (i - 1 - 1) * paramInt17 + paramInt16)];
        localdoubleW4.val = paramArrayOfDouble6[(i - 1 + (i - 1 - 1) * paramInt17 + paramInt16)];
        localdoubleW2.val = paramArrayOfDouble6[(i - 1 - 1 + (i - 1) * paramInt17 + paramInt16)];
        localdoubleW6.val = paramArrayOfDouble6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        dlanv2_adapter(localdoubleW1, localdoubleW2, localdoubleW4, localdoubleW6, paramArrayOfDouble3, i4 + i - 2 - 1 + paramInt11, paramArrayOfDouble4, i4 + i - 2 - 1 + paramInt12, paramArrayOfDouble3, i4 + i - 1 - 1 + paramInt11, paramArrayOfDouble4, i4 + i - 1 - 1 + paramInt12, localdoubleW5, localdoubleW9);
        i -= 2;
      }
    }
    if ((paramintW1.val >= k ? 0 : 1) == 0) {}
    if (((d4 != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if ((paramintW1.val <= 1 ? 0 : 1) != 0) {}
      if (((d4 == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dcopy.dcopy(paramintW1.val, paramArrayOfDouble5, paramInt13, paramInt14, paramArrayOfDouble8, paramInt21, 1);
        localdoubleW3.val = paramArrayOfDouble8[(1 - 1 + paramInt21)];
        Dlarfg.dlarfg(paramintW1.val, localdoubleW3, paramArrayOfDouble8, 2 - 1 + paramInt21, 1, localdoubleW10);
        paramArrayOfDouble8[(1 - 1 + paramInt21)] = 1.0D;
        Dlaset.dlaset("L", k - 2, k - 2, 0.0D, 0.0D, paramArrayOfDouble6, 3 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17);
        Dlarf.dlarf("L", paramintW1.val, k, paramArrayOfDouble8, paramInt21, 1, localdoubleW10.val, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, k + 1 - 1 + paramInt21);
        Dlarf.dlarf("R", paramintW1.val, paramintW1.val, paramArrayOfDouble8, paramInt21, 1, localdoubleW10.val, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, k + 1 - 1 + paramInt21);
        Dlarf.dlarf("R", k, paramintW1.val, paramArrayOfDouble8, paramInt21, 1, localdoubleW10.val, paramArrayOfDouble5, paramInt13, paramInt14, paramArrayOfDouble8, k + 1 - 1 + paramInt21);
        Dgehrd.dgehrd(k, 1, paramintW1.val, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, paramInt21, paramArrayOfDouble8, k + 1 - 1 + paramInt21, paramInt22 - k, localintW3);
      }
      if ((i4 <= 1 ? 0 : 1) != 0) {
        paramArrayOfDouble1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)] = (d4 * paramArrayOfDouble5[(1 - 1 + (1 - 1) * paramInt14 + paramInt13)]);
      }
      Dlacpy.dlacpy("U", k, k, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble1, i4 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6);
      Dcopy.dcopy(k - 1, paramArrayOfDouble6, 2 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17 + 1, paramArrayOfDouble1, i4 + 1 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6 + 1);
      if ((paramintW1.val <= 1 ? 0 : 1) != 0) {}
      if (((d4 == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dorghr.dorghr(k, 1, paramintW1.val, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble8, paramInt21, paramArrayOfDouble8, k + 1 - 1 + paramInt21, paramInt22 - k, localintW3);
        Dgemm.dgemm("N", "N", k, paramintW1.val, paramintW1.val, 1.0D, paramArrayOfDouble5, paramInt13, paramInt14, paramArrayOfDouble6, paramInt16, paramInt17, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
        Dlacpy.dlacpy("A", k, paramintW1.val, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble5, paramInt13, paramInt14);
      }
      if (paramBoolean1) {
        i5 = 1;
      } else {
        i5 = paramInt2;
      }
      i3 = i5;
      for (i11 = (i4 - 1 - i5 + paramInt18) / paramInt18; i11 > 0; i11--)
      {
        i2 = Math.min(paramInt18, i4 - i3);
        Dgemm.dgemm("N", "N", i2, k, k, 1.0D, paramArrayOfDouble1, i3 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble5, paramInt13, paramInt14, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
        Dlacpy.dlacpy("A", i2, k, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble1, i3 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6);
        i3 += paramInt18;
      }
      if (paramBoolean1)
      {
        n = paramInt3 + 1;
        for (i11 = (paramInt1 - (paramInt3 + 1) + paramInt15) / paramInt15; i11 > 0; i11--)
        {
          i2 = Math.min(paramInt15, paramInt1 - n + 1);
          Dgemm.dgemm("C", "N", k, i2, k, 1.0D, paramArrayOfDouble5, paramInt13, paramInt14, paramArrayOfDouble1, i4 - 1 + (n - 1) * paramInt6 + paramInt5, paramInt6, 0.0D, paramArrayOfDouble6, paramInt16, paramInt17);
          Dlacpy.dlacpy("A", k, i2, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble1, i4 - 1 + (n - 1) * paramInt6 + paramInt5, paramInt6);
          n += paramInt15;
        }
      }
      if (paramBoolean2)
      {
        i3 = paramInt7;
        for (i11 = (paramInt8 - paramInt7 + paramInt18) / paramInt18; i11 > 0; i11--)
        {
          i2 = Math.min(paramInt18, paramInt8 - i3 + 1);
          Dgemm.dgemm("N", "N", i2, k, k, 1.0D, paramArrayOfDouble2, i3 - 1 + (i4 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble5, paramInt13, paramInt14, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
          Dlacpy.dlacpy("A", i2, k, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble2, i3 - 1 + (i4 - 1) * paramInt10 + paramInt9, paramInt10);
          i3 += paramInt18;
        }
      }
    }
    paramintW2.val = (k - paramintW1.val);
    paramintW1.val -= localintW4.val;
    paramArrayOfDouble8[(1 - 1 + paramInt21)] = i8;
  }
  
  private static void dlanv2_adapter(doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, double[] paramArrayOfDouble3, int paramInt3, double[] paramArrayOfDouble4, int paramInt4, doubleW paramdoubleW5, doubleW paramdoubleW6)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble3[paramInt3]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble4[paramInt4]);
    Dlanv2.dlanv2(paramdoubleW1, paramdoubleW2, paramdoubleW3, paramdoubleW4, localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4, paramdoubleW5, paramdoubleW6);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
    paramArrayOfDouble3[paramInt3] = localdoubleW3.val;
    paramArrayOfDouble4[paramInt4] = localdoubleW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */