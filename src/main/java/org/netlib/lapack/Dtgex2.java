package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgex2
{
  public static void dtgex2(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, double[] paramArrayOfDouble5, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d3 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    int[] arrayOfInt = new int[4];
    double[] arrayOfDouble1 = new double[2];
    double[] arrayOfDouble2 = new double[2];
    double[] arrayOfDouble3 = new double[2];
    double[] arrayOfDouble4 = new double[4 * 4];
    double[] arrayOfDouble5 = new double[4 * 4];
    double[] arrayOfDouble6 = new double[4 * 4];
    double[] arrayOfDouble7 = new double[4 * 4];
    double[] arrayOfDouble8 = new double[4 * 4];
    double[] arrayOfDouble9 = new double[4 * 4];
    double[] arrayOfDouble10 = new double[4 * 4];
    double[] arrayOfDouble11 = new double[4];
    double[] arrayOfDouble12 = new double[4];
    double[] arrayOfDouble13 = new double[4 * 4];
    paramintW.val = 0;
    if ((paramInt1 > 1 ? 0 : 1) == 0) {}
    if (((paramInt11 > 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt12 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt11 <= paramInt1 ? 0 : 1) == 0) {}
    if (((paramInt10 + paramInt11 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    m = paramInt11 + paramInt12;
    if ((paramInt14 >= Util.max(1, paramInt1 * m, m * m * 2) ? 0 : 1) != 0)
    {
      paramintW.val = -16;
      paramArrayOfDouble5[(1 - 1 + paramInt13)] = Util.max(1, paramInt1 * m, m * m * 2);
      return;
    }
    j = 0;
    i = 0;
    Dlaset.dlaset("Full", 4, 4, 0.0D, 0.0D, arrayOfDouble6, 0, 4);
    Dlaset.dlaset("Full", 4, 4, 0.0D, 0.0D, arrayOfDouble4, 0, 4);
    Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfDouble8, 0, 4);
    Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble10, 0, 4);
    d4 = Dlamch.dlamch("P");
    d9 = Dlamch.dlamch("S") / d4;
    localdoubleW2.val = 0.0D;
    localdoubleW3.val = 1.0D;
    Dlacpy.dlacpy("Full", m, m, arrayOfDouble8, 0, 4, paramArrayOfDouble5, paramInt13, m);
    Dlassq.dlassq(m * m, paramArrayOfDouble5, paramInt13, 1, localdoubleW2, localdoubleW3);
    Dlacpy.dlacpy("Full", m, m, arrayOfDouble10, 0, 4, paramArrayOfDouble5, paramInt13, m);
    Dlassq.dlassq(m * m, paramArrayOfDouble5, paramInt13, 1, localdoubleW2, localdoubleW3);
    d3 = localdoubleW2.val * Math.sqrt(localdoubleW3.val);
    d11 = Math.max(10.0D * d4 * d3, d9);
    if ((m != 2 ? 0 : 1) != 0)
    {
      d5 = arrayOfDouble8[(2 - 1 + (2 - 1) * 4)] * arrayOfDouble10[(1 - 1 + (1 - 1) * 4)] - arrayOfDouble10[(2 - 1 + (2 - 1) * 4)] * arrayOfDouble8[(1 - 1 + (1 - 1) * 4)];
      d6 = arrayOfDouble8[(2 - 1 + (2 - 1) * 4)] * arrayOfDouble10[(1 - 1 + (2 - 1) * 4)] - arrayOfDouble10[(2 - 1 + (2 - 1) * 4)] * arrayOfDouble8[(1 - 1 + (2 - 1) * 4)];
      d8 = Math.abs(arrayOfDouble10[(2 - 1 + (2 - 1) * 4)]);
      d7 = Math.abs(arrayOfDouble8[(2 - 1 + (2 - 1) * 4)]);
      dlartg_adapter(d5, d6, arrayOfDouble4, 1 - 1 + (2 - 1) * 4, arrayOfDouble4, 1 - 1 + (1 - 1) * 4, localdoubleW1);
      arrayOfDouble4[(2 - 1 + (1 - 1) * 4)] = (-arrayOfDouble4[(1 - 1 + (2 - 1) * 4)]);
      arrayOfDouble4[(2 - 1 + (2 - 1) * 4)] = arrayOfDouble4[(1 - 1 + (1 - 1) * 4)];
      Drot.drot(2, arrayOfDouble8, 1 - 1 + (1 - 1) * 4, 1, arrayOfDouble8, 1 - 1 + (2 - 1) * 4, 1, arrayOfDouble4[(1 - 1 + (1 - 1) * 4)], arrayOfDouble4[(2 - 1 + (1 - 1) * 4)]);
      Drot.drot(2, arrayOfDouble10, 1 - 1 + (1 - 1) * 4, 1, arrayOfDouble10, 1 - 1 + (2 - 1) * 4, 1, arrayOfDouble4[(1 - 1 + (1 - 1) * 4)], arrayOfDouble4[(2 - 1 + (1 - 1) * 4)]);
      if ((d7 < d8 ? 0 : 1) != 0) {
        dlartg_adapter(arrayOfDouble8[(1 - 1 + (1 - 1) * 4)], arrayOfDouble8[(2 - 1 + (1 - 1) * 4)], arrayOfDouble6, 1 - 1 + (1 - 1) * 4, arrayOfDouble6, 2 - 1 + (1 - 1) * 4, localdoubleW1);
      } else {
        dlartg_adapter(arrayOfDouble10[(1 - 1 + (1 - 1) * 4)], arrayOfDouble10[(2 - 1 + (1 - 1) * 4)], arrayOfDouble6, 1 - 1 + (1 - 1) * 4, arrayOfDouble6, 2 - 1 + (1 - 1) * 4, localdoubleW1);
      }
      Drot.drot(2, arrayOfDouble8, 1 - 1 + (1 - 1) * 4, 4, arrayOfDouble8, 2 - 1 + (1 - 1) * 4, 4, arrayOfDouble6[(1 - 1 + (1 - 1) * 4)], arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
      Drot.drot(2, arrayOfDouble10, 1 - 1 + (1 - 1) * 4, 4, arrayOfDouble10, 2 - 1 + (1 - 1) * 4, 4, arrayOfDouble6[(1 - 1 + (1 - 1) * 4)], arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
      arrayOfDouble6[(2 - 1 + (2 - 1) * 4)] = arrayOfDouble6[(1 - 1 + (1 - 1) * 4)];
      arrayOfDouble6[(1 - 1 + (2 - 1) * 4)] = (-arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
      d12 = Math.abs(arrayOfDouble8[(2 - 1 + (1 - 1) * 4)]) + Math.abs(arrayOfDouble10[(2 - 1 + (1 - 1) * 4)]);
      j = d12 > d11 ? 0 : 1;
      if ((j ^ 0x1) == 0) {
        if (1 != 0)
        {
          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
          Dgemm.dgemm("N", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble8, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
          Dgemm.dgemm("N", "T", m, m, m, -1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 1.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
          localdoubleW2.val = 0.0D;
          localdoubleW3.val = 1.0D;
          Dlassq.dlassq(m * m, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, 1, localdoubleW2, localdoubleW3);
          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
          Dgemm.dgemm("N", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble10, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
          Dgemm.dgemm("N", "T", m, m, m, -1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 1.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
          Dlassq.dlassq(m * m, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, 1, localdoubleW2, localdoubleW3);
          d10 = localdoubleW2.val * Math.sqrt(localdoubleW3.val);
          i = d10 > d11 ? 0 : 1;
          if ((i ^ 0x1) != 0) {}
        }
        else
        {
          Drot.drot(paramInt10 + 1, paramArrayOfDouble1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (paramInt10 + 1 - 1) * paramInt3 + paramInt2, 1, arrayOfDouble4[(1 - 1 + (1 - 1) * 4)], arrayOfDouble4[(2 - 1 + (1 - 1) * 4)]);
          Drot.drot(paramInt10 + 1, paramArrayOfDouble2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (paramInt10 + 1 - 1) * paramInt5 + paramInt4, 1, arrayOfDouble4[(1 - 1 + (1 - 1) * 4)], arrayOfDouble4[(2 - 1 + (1 - 1) * 4)]);
          Drot.drot(paramInt1 - paramInt10 + 1, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfDouble6[(1 - 1 + (1 - 1) * 4)], arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
          Drot.drot(paramInt1 - paramInt10 + 1, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble6[(1 - 1 + (1 - 1) * 4)], arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
          paramArrayOfDouble1[(paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2)] = 0.0D;
          paramArrayOfDouble2[(paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4)] = 0.0D;
          if (paramBoolean2) {
            Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + (paramInt10 + 1 - 1) * paramInt9 + paramInt8, 1, arrayOfDouble4[(1 - 1 + (1 - 1) * 4)], arrayOfDouble4[(2 - 1 + (1 - 1) * 4)]);
          }
          if (paramBoolean1) {
            Drot.drot(paramInt1, paramArrayOfDouble3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, 1 - 1 + (paramInt10 + 1 - 1) * paramInt7 + paramInt6, 1, arrayOfDouble6[(1 - 1 + (1 - 1) * 4)], arrayOfDouble6[(2 - 1 + (1 - 1) * 4)]);
          }
          return;
        }
      }
    }
    else
    {
      Dlacpy.dlacpy("Full", paramInt11, paramInt12, arrayOfDouble10, 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfDouble6, 0, 4);
      Dlacpy.dlacpy("Full", paramInt11, paramInt12, arrayOfDouble8, 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfDouble4, paramInt12 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4);
      Dtgsy2.dtgsy2("N", 0, paramInt11, paramInt12, arrayOfDouble8, 0, 4, arrayOfDouble8, paramInt11 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfDouble4, paramInt12 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfDouble10, 0, 4, arrayOfDouble10, paramInt11 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfDouble6, 0, 4, localdoubleW4, localdoubleW3, localdoubleW2, arrayOfInt, 0, localintW1, localintW2);
      k = 1;
      for (int n = paramInt12 - 1 + 1; n > 0; n--)
      {
        Dscal.dscal(paramInt11, -1.0D, arrayOfDouble6, 1 - 1 + (k - 1) * 4, 1);
        arrayOfDouble6[(paramInt11 + k - 1 + (k - 1) * 4)] = localdoubleW4.val;
        k += 1;
      }
      Dgeqr2.dgeqr2(m, paramInt12, arrayOfDouble6, 0, 4, arrayOfDouble11, 0, paramArrayOfDouble5, paramInt13, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) == 0)
      {
        Dorg2r.dorg2r(m, m, paramInt12, arrayOfDouble6, 0, 4, arrayOfDouble11, 0, paramArrayOfDouble5, paramInt13, localintW2);
        if ((localintW2.val == 0 ? 0 : 1) == 0)
        {
          k = 1;
          for (n = paramInt11 - 1 + 1; n > 0; n--)
          {
            arrayOfDouble4[(paramInt12 + k - 1 + (k - 1) * 4)] = localdoubleW4.val;
            k += 1;
          }
          Dgerq2.dgerq2(paramInt11, m, arrayOfDouble4, paramInt12 + 1 - 1 + (1 - 1) * 4, 4, arrayOfDouble12, 0, paramArrayOfDouble5, paramInt13, localintW2);
          if ((localintW2.val == 0 ? 0 : 1) == 0)
          {
            Dorgr2.dorgr2(m, m, paramInt11, arrayOfDouble4, 0, 4, arrayOfDouble12, 0, paramArrayOfDouble5, paramInt13, localintW2);
            if ((localintW2.val == 0 ? 0 : 1) == 0)
            {
              Dgemm.dgemm("T", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble8, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
              Dgemm.dgemm("N", "T", m, m, m, 1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 0.0D, arrayOfDouble8, 0, 4);
              Dgemm.dgemm("T", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble10, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
              Dgemm.dgemm("N", "T", m, m, m, 1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 0.0D, arrayOfDouble10, 0, 4);
              Dlacpy.dlacpy("F", m, m, arrayOfDouble8, 0, 4, arrayOfDouble9, 0, 4);
              Dlacpy.dlacpy("F", m, m, arrayOfDouble10, 0, 4, arrayOfDouble13, 0, 4);
              Dlacpy.dlacpy("F", m, m, arrayOfDouble4, 0, 4, arrayOfDouble5, 0, 4);
              Dlacpy.dlacpy("F", m, m, arrayOfDouble6, 0, 4, arrayOfDouble7, 0, 4);
              Dgerq2.dgerq2(m, m, arrayOfDouble10, 0, 4, arrayOfDouble12, 0, paramArrayOfDouble5, paramInt13, localintW2);
              if ((localintW2.val == 0 ? 0 : 1) == 0)
              {
                Dormr2.dormr2("R", "T", m, m, m, arrayOfDouble10, 0, 4, arrayOfDouble12, 0, arrayOfDouble8, 0, 4, paramArrayOfDouble5, paramInt13, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) == 0)
                {
                  Dormr2.dormr2("L", "N", m, m, m, arrayOfDouble10, 0, 4, arrayOfDouble12, 0, arrayOfDouble4, 0, 4, paramArrayOfDouble5, paramInt13, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) == 0)
                  {
                    localdoubleW2.val = 0.0D;
                    localdoubleW3.val = 1.0D;
                    k = 1;
                    for (n = paramInt12 - 1 + 1; n > 0; n--)
                    {
                      Dlassq.dlassq(paramInt11, arrayOfDouble8, paramInt12 + 1 - 1 + (k - 1) * 4, 1, localdoubleW2, localdoubleW3);
                      k += 1;
                    }
                    d2 = localdoubleW2.val * Math.sqrt(localdoubleW3.val);
                    Dgeqr2.dgeqr2(m, m, arrayOfDouble13, 0, 4, arrayOfDouble11, 0, paramArrayOfDouble5, paramInt13, localintW2);
                    if ((localintW2.val == 0 ? 0 : 1) == 0)
                    {
                      Dorm2r.dorm2r("L", "T", m, m, m, arrayOfDouble13, 0, 4, arrayOfDouble11, 0, arrayOfDouble9, 0, 4, paramArrayOfDouble5, paramInt13, paramintW);
                      Dorm2r.dorm2r("R", "N", m, m, m, arrayOfDouble13, 0, 4, arrayOfDouble11, 0, arrayOfDouble7, 0, 4, paramArrayOfDouble5, paramInt13, paramintW);
                      if ((localintW2.val == 0 ? 0 : 1) == 0)
                      {
                        localdoubleW2.val = 0.0D;
                        localdoubleW3.val = 1.0D;
                        k = 1;
                        for (n = paramInt12 - 1 + 1; n > 0; n--)
                        {
                          Dlassq.dlassq(paramInt11, arrayOfDouble9, paramInt12 + 1 - 1 + (k - 1) * 4, 1, localdoubleW2, localdoubleW3);
                          k += 1;
                        }
                        d1 = localdoubleW2.val * Math.sqrt(localdoubleW3.val);
                        if ((d1 > d2 ? 0 : 1) != 0) {}
                        if (((d1 > d11 ? 0 : 1) != 0 ? 1 : 0) != 0)
                        {
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble9, 0, 4, arrayOfDouble8, 0, 4);
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble13, 0, 4, arrayOfDouble10, 0, 4);
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble5, 0, 4, arrayOfDouble4, 0, 4);
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble7, 0, 4, arrayOfDouble6, 0, 4);
                        }
                        else if ((d2 < d11 ? 0 : 1) != 0)
                        {
                          break label5350;
                        }
                        Dlaset.dlaset("Lower", m - 1, m - 1, 0.0D, 0.0D, arrayOfDouble10, 2 - 1 + (1 - 1) * 4, 4);
                        if (1 != 0)
                        {
                          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
                          Dgemm.dgemm("N", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble8, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
                          Dgemm.dgemm("N", "N", m, m, m, -1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 1.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
                          localdoubleW2.val = 0.0D;
                          localdoubleW3.val = 1.0D;
                          Dlassq.dlassq(m * m, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, 1, localdoubleW2, localdoubleW3);
                          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
                          Dgemm.dgemm("N", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, arrayOfDouble10, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
                          Dgemm.dgemm("N", "N", m, m, m, -1.0D, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4, 1.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
                          Dlassq.dlassq(m * m, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, 1, localdoubleW2, localdoubleW3);
                          d10 = localdoubleW2.val * Math.sqrt(localdoubleW3.val);
                          i = d10 > d11 ? 0 : 1;
                          if ((i ^ 0x1) != 0) {}
                        }
                        else
                        {
                          Dlaset.dlaset("Full", paramInt11, paramInt12, 0.0D, 0.0D, arrayOfDouble8, paramInt12 + 1 - 1 + (1 - 1) * 4, 4);
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble8, 0, 4, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3);
                          Dlacpy.dlacpy("F", m, m, arrayOfDouble10, 0, 4, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5);
                          Dlaset.dlaset("Full", 4, 4, 0.0D, 0.0D, arrayOfDouble10, 0, 4);
                          k = 1;
                          for (n = m * m - 1 + 1; n > 0; n--)
                          {
                            paramArrayOfDouble5[(k - 1 + paramInt13)] = 0.0D;
                            k += 1;
                          }
                          paramArrayOfDouble5[(1 - 1 + paramInt13)] = 1.0D;
                          arrayOfDouble10[(1 - 1 + (1 - 1) * 4)] = 1.0D;
                          localintW1.val = (paramInt14 - m * m - 2);
                          if ((paramInt12 <= 1 ? 0 : 1) != 0)
                          {
                            dlagv2_adapter(paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble2, 0, arrayOfDouble1, 0, arrayOfDouble3, 0, paramArrayOfDouble5, 1 - 1 + paramInt13, paramArrayOfDouble5, 2 - 1 + paramInt13, arrayOfDouble10, 1 - 1 + (1 - 1) * 4, arrayOfDouble10, 2 - 1 + (1 - 1) * 4);
                            paramArrayOfDouble5[(m + 1 - 1 + paramInt13)] = (-paramArrayOfDouble5[(2 - 1 + paramInt13)]);
                            paramArrayOfDouble5[(m + 2 - 1 + paramInt13)] = paramArrayOfDouble5[(1 - 1 + paramInt13)];
                            arrayOfDouble10[(paramInt12 - 1 + (paramInt12 - 1) * 4)] = arrayOfDouble10[(1 - 1 + (1 - 1) * 4)];
                            arrayOfDouble10[(1 - 1 + (2 - 1) * 4)] = (-arrayOfDouble10[(2 - 1 + (1 - 1) * 4)]);
                          }
                          paramArrayOfDouble5[(m * m - 1 + paramInt13)] = 1.0D;
                          arrayOfDouble10[(m - 1 + (m - 1) * 4)] = 1.0D;
                          if ((paramInt11 <= 1 ? 0 : 1) != 0)
                          {
                            dlagv2_adapter(paramArrayOfDouble1, paramInt10 + paramInt12 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt10 + paramInt12 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble12, 0, arrayOfDouble11, 0, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, paramArrayOfDouble5, paramInt12 * m + paramInt12 + 1 - 1 + paramInt13, paramArrayOfDouble5, paramInt12 * m + paramInt12 + 2 - 1 + paramInt13, arrayOfDouble10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, arrayOfDouble10, m - 1 + (m - 1 - 1) * 4);
                            paramArrayOfDouble5[(m * m - 1 + paramInt13)] = paramArrayOfDouble5[(paramInt12 * m + paramInt12 + 1 - 1 + paramInt13)];
                            paramArrayOfDouble5[(m * m - 1 - 1 + paramInt13)] = (-paramArrayOfDouble5[(paramInt12 * m + paramInt12 + 2 - 1 + paramInt13)]);
                            arrayOfDouble10[(m - 1 + (m - 1) * 4)] = arrayOfDouble10[(paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4)];
                            arrayOfDouble10[(m - 1 - 1 + (m - 1) * 4)] = (-arrayOfDouble10[(m - 1 + (m - 1 - 1) * 4)]);
                          }
                          Dgemm.dgemm("T", "N", paramInt12, paramInt11, paramInt12, 1.0D, paramArrayOfDouble5, paramInt13, m, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, 0.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, paramInt12);
                          Dlacpy.dlacpy("Full", paramInt12, paramInt11, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, paramInt12, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3);
                          Dgemm.dgemm("T", "N", paramInt12, paramInt11, paramInt12, 1.0D, paramArrayOfDouble5, paramInt13, m, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, paramInt12);
                          Dlacpy.dlacpy("Full", paramInt12, paramInt11, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, paramInt12, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5);
                          Dgemm.dgemm("N", "N", m, m, m, 1.0D, arrayOfDouble6, 0, 4, paramArrayOfDouble5, paramInt13, m, 0.0D, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m);
                          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble5, m * m + 1 - 1 + paramInt13, m, arrayOfDouble6, 0, 4);
                          Dgemm.dgemm("N", "N", paramInt12, paramInt11, paramInt11, 1.0D, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfDouble10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, 4, 0.0D, paramArrayOfDouble5, paramInt13, paramInt12);
                          Dlacpy.dlacpy("Full", paramInt12, paramInt11, paramArrayOfDouble5, paramInt13, paramInt12, paramArrayOfDouble1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3);
                          Dgemm.dgemm("N", "N", paramInt12, paramInt11, paramInt11, 1.0D, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, 4, 0.0D, paramArrayOfDouble5, paramInt13, paramInt12);
                          Dlacpy.dlacpy("Full", paramInt12, paramInt11, paramArrayOfDouble5, paramInt13, paramInt12, paramArrayOfDouble2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5);
                          Dgemm.dgemm("T", "N", m, m, m, 1.0D, arrayOfDouble4, 0, 4, arrayOfDouble10, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, m);
                          Dlacpy.dlacpy("Full", m, m, paramArrayOfDouble5, paramInt13, m, arrayOfDouble4, 0, 4);
                          if (paramBoolean1)
                          {
                            Dgemm.dgemm("N", "N", paramInt1, m, m, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfDouble6, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, paramInt1);
                            Dlacpy.dlacpy("Full", paramInt1, m, paramArrayOfDouble5, paramInt13, paramInt1, paramArrayOfDouble3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, paramInt7);
                          }
                          if (paramBoolean2)
                          {
                            Dgemm.dgemm("N", "N", paramInt1, m, m, 1.0D, paramArrayOfDouble4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, paramInt9, arrayOfDouble4, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, paramInt1);
                            Dlacpy.dlacpy("Full", paramInt1, m, paramArrayOfDouble5, paramInt13, paramInt1, paramArrayOfDouble4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, paramInt9);
                          }
                          k = paramInt10 + m;
                          if ((k > paramInt1 ? 0 : 1) != 0)
                          {
                            Dgemm.dgemm("T", "N", m, paramInt1 - k + 1, m, 1.0D, arrayOfDouble6, 0, 4, paramArrayOfDouble1, paramInt10 - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 0.0D, paramArrayOfDouble5, paramInt13, m);
                            Dlacpy.dlacpy("Full", m, paramInt1 - k + 1, paramArrayOfDouble5, paramInt13, m, paramArrayOfDouble1, paramInt10 - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3);
                            Dgemm.dgemm("T", "N", m, paramInt1 - k + 1, m, 1.0D, arrayOfDouble6, 0, 4, paramArrayOfDouble2, paramInt10 - 1 + (k - 1) * paramInt5 + paramInt4, paramInt3, 0.0D, paramArrayOfDouble5, paramInt13, m);
                            Dlacpy.dlacpy("Full", m, paramInt1 - k + 1, paramArrayOfDouble5, paramInt13, m, paramArrayOfDouble2, paramInt10 - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5);
                          }
                          k = paramInt10 - 1;
                          if ((k <= 0 ? 0 : 1) != 0)
                          {
                            Dgemm.dgemm("N", "N", k, m, m, 1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfDouble4, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, k);
                            Dlacpy.dlacpy("Full", k, m, paramArrayOfDouble5, paramInt13, k, paramArrayOfDouble1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3);
                            Dgemm.dgemm("N", "N", k, m, m, 1.0D, paramArrayOfDouble2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble4, 0, 4, 0.0D, paramArrayOfDouble5, paramInt13, k);
                            Dlacpy.dlacpy("Full", k, m, paramArrayOfDouble5, paramInt13, k, paramArrayOfDouble2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5);
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label5350:
    paramintW.val = 1;
  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, doubleW paramdoubleW)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    Dlartg.dlartg(paramDouble1, paramDouble2, localdoubleW1, localdoubleW2, paramdoubleW);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
  }
  
  private static void dlagv2_adapter(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, double[] paramArrayOfDouble7, int paramInt9, double[] paramArrayOfDouble8, int paramInt10, double[] paramArrayOfDouble9, int paramInt11)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble6[paramInt8]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble7[paramInt9]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble8[paramInt10]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble9[paramInt11]);
    Dlagv2.dlagv2(paramArrayOfDouble1, paramInt1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4);
    paramArrayOfDouble6[paramInt8] = localdoubleW1.val;
    paramArrayOfDouble7[paramInt9] = localdoubleW2.val;
    paramArrayOfDouble8[paramInt10] = localdoubleW3.val;
    paramArrayOfDouble9[paramInt11] = localdoubleW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgex2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */