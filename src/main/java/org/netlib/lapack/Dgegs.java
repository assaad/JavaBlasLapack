package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dgegs
{
  public static void dgegs(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, int paramInt12, double[] paramArrayOfDouble8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    if (Lsame.lsame(paramString1, "N"))
    {
      i2 = 1;
      k = 0;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i2 = 2;
      k = 1;
    }
    else
    {
      i2 = -1;
      k = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      i3 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i3 = 2;
      m = 1;
    }
    else
    {
      i3 = -1;
      m = 0;
    }
    i10 = Math.max(4 * paramInt1, 1);
    i11 = i10;
    paramArrayOfDouble8[(1 - 1 + paramInt13)] = i11;
    n = paramInt14 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((i2 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else
    {
      if ((paramInt10 >= 1 ? 0 : 1) == 0) {
        if (k == 0) {}
      }
      if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -14;
        }
        else
        {
          if ((paramInt14 >= i10 ? 0 : 1) != 0) {}
          if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i13 = Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt1, -1, -1);
      i14 = Ilaenv.ilaenv(1, "DORMQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i15 = Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i12 = Util.max(i13, i14, i15);
      i9 = 2 * paramInt1 + paramInt1 * (i12 + 1);
      paramArrayOfDouble8[(1 - 1 + paramInt13)] = i9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEGS ", -paramintW.val);
      return;
    }
    if (n != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d6 = Dlamch.dlamch("E") * Dlamch.dlamch("B");
    d7 = Dlamch.dlamch("S");
    d8 = paramInt1 * d7 / d6;
    d3 = 1.0D / d8;
    d1 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble8, paramInt13);
    i = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= d8 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      d2 = d8;
      i = 1;
    }
    else if ((d1 <= d3 ? 0 : 1) != 0)
    {
      d2 = d3;
      i = 1;
    }
    if (i != 0)
    {
      Dlascl.dlascl("G", -1, -1, d1, d2, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 9);
        return;
      }
    }
    d4 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble8, paramInt13);
    j = 0;
    if ((d4 <= 0.0D ? 0 : 1) != 0) {}
    if (((d4 >= d8 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      d5 = d8;
      j = 1;
    }
    else if ((d4 <= d3 ? 0 : 1) != 0)
    {
      d5 = d3;
      j = 1;
    }
    if (j != 0)
    {
      Dlascl.dlascl("G", -1, -1, d4, d5, paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 9);
        return;
      }
    }
    i4 = 1;
    i5 = paramInt1 + 1;
    i8 = i5 + paramInt1;
    Dggbal.dggbal("P", paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, localintW3, localintW1, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, localintW2);
    if ((localintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt1 + 1);
    }
    else
    {
      i6 = localintW1.val + 1 - localintW3.val;
      i1 = paramInt1 + 1 - localintW3.val;
      i7 = i8;
      i8 = i7 + i6;
      Dgeqrf.dgeqrf(i6, i1, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
      if ((localintW2.val < 0 ? 0 : 1) != 0) {
        i11 = Math.max(i11, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
      }
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 2);
      }
      else
      {
        Dormqr.dormqr("L", "T", i6, i1, i6, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
        if ((localintW2.val < 0 ? 0 : 1) != 0) {
          i11 = Math.max(i11, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
        }
        if ((localintW2.val == 0 ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + 3);
        }
        else
        {
          if (k != 0)
          {
            Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble6, paramInt9, paramInt10);
            Dlacpy.dlacpy("L", i6 - 1, i6 - 1, paramArrayOfDouble2, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10);
            Dorgqr.dorgqr(i6, i6, i6, paramArrayOfDouble6, localintW3.val - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i11 = Math.max(i11, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              paramintW.val = (paramInt1 + 4);
              break label2389;
            }
          }
          if (m != 0) {
            Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble7, paramInt11, paramInt12);
          }
          Dgghrd.dgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW2);
          if ((localintW2.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (paramInt1 + 5);
          }
          else
          {
            i8 = i7;
            Dhgeqz.dhgeqz("S", paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramArrayOfDouble5, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i11 = Math.max(i11, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              if ((localintW2.val <= 0 ? 0 : 1) != 0) {}
              if (((localintW2.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                paramintW.val = localintW2.val;
              }
              else
              {
                if ((localintW2.val <= paramInt1 ? 0 : 1) != 0) {}
                if (((localintW2.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  localintW2.val -= paramInt1;
                } else {
                  paramintW.val = (paramInt1 + 6);
                }
              }
            }
            else
            {
              if (k != 0)
              {
                Dggbak.dggbak("P", "L", paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramInt1, paramArrayOfDouble6, paramInt9, paramInt10, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 7);
                  break label2389;
                }
              }
              if (m != 0)
              {
                Dggbak.dggbak("P", "R", paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramInt1, paramArrayOfDouble7, paramInt11, paramInt12, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 8);
                  break label2389;
                }
              }
              if (i != 0)
              {
                Dlascl.dlascl("H", -1, -1, d2, d1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Dlascl.dlascl("G", -1, -1, d2, d1, paramInt1, 1, paramArrayOfDouble3, paramInt6, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Dlascl.dlascl("G", -1, -1, d2, d1, paramInt1, 1, paramArrayOfDouble4, paramInt7, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
              }
              if (j != 0)
              {
                Dlascl.dlascl("U", -1, -1, d5, d4, paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Dlascl.dlascl("G", -1, -1, d5, d4, paramInt1, 1, paramArrayOfDouble5, paramInt8, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
              }
            }
          }
        }
      }
    }
    label2389:
    paramArrayOfDouble8[(1 - 1 + paramInt13)] = i11;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgegs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */