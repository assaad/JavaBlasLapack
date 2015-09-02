package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtrsna
{
  public static void dtrsna(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, intW paramintW1, double[] paramArrayOfDouble6, int paramInt12, int paramInt13, int[] paramArrayOfInt, int paramInt14, intW paramintW2)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int n = 0;
    int i1 = 0;
    intW localintW4 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d12 = 0.0D;
    int[] arrayOfInt = new int[3];
    double[] arrayOfDouble = new double[1];
    bool2 = Lsame.lsame(paramString1, "B");
    j = (!Lsame.lsame(paramString1, "E")) && (!bool2) ? 0 : 1;
    k = (!Lsame.lsame(paramString1, "V")) && (!bool2) ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "S");
    paramintW2.val = 0;
    if ((((j ^ 0x1) != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "A") ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -4;
    }
    else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW2.val = -6;
    }
    else
    {
      if ((paramInt6 >= 1 ? 0 : 1) == 0) {
        if (j == 0) {}
      }
      if ((((paramInt6 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -8;
      }
      else
      {
        if ((paramInt8 >= 1 ? 0 : 1) == 0) {
          if (j == 0) {}
        }
        if ((((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else
        {
          if (bool1)
          {
            paramintW1.val = 0;
            i = 0;
            i1 = 1;
            for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
            {
              if (i != 0) {
                i = 0;
              } else if ((i1 >= paramInt2 ? 0 : 1) != 0)
              {
                if ((paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] != 0.0D ? 0 : 1) != 0)
                {
                  if (paramArrayOfBoolean[(i1 - 1 + paramInt1)] != 0) {
                    paramintW1.val += 1;
                  }
                }
                else
                {
                  i = 1;
                  if (((paramArrayOfBoolean[(i1 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i1 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
                    paramintW1.val += 2;
                  }
                }
              }
              else if (paramArrayOfBoolean[(paramInt2 - 1 + paramInt1)] != 0) {
                paramintW1.val += 1;
              }
              i1 += 1;
            }
          }
          else
          {
            paramintW1.val = paramInt2;
          }
          if ((paramInt11 >= paramintW1.val ? 0 : 1) != 0)
          {
            paramintW2.val = -13;
          }
          else
          {
            if ((paramInt13 >= 1 ? 0 : 1) == 0) {
              if (k == 0) {}
            }
            if ((((paramInt13 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
              paramintW2.val = -16;
            }
          }
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRSNA", -paramintW2.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      if ((bool1) && ((paramArrayOfBoolean[(1 - 1 + paramInt1)] ^ 0x1) != 0)) {
        return;
      }
      if (j != 0) {
        paramArrayOfDouble4[(1 - 1 + paramInt9)] = 1.0D;
      }
      if (k != 0) {
        paramArrayOfDouble5[(1 - 1 + paramInt10)] = Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
      }
      return;
    }
    d5 = Dlamch.dlamch("P");
    localdoubleW4.val = (Dlamch.dlamch("S") / d5);
    localdoubleW1.val = (1.0D / localdoubleW4.val);
    Dlabad.dlabad(localdoubleW4, localdoubleW1);
    i2 = 0;
    i = 0;
    i1 = 1;
    for (int i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
    {
      if (i != 0)
      {
        i = 0;
        break label2654;
      }
      else
      {
        if ((i1 >= paramInt2 ? 0 : 1) != 0) {
          i = paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1;
        }
        if (bool1) {
          if (i != 0) {
            if ((((paramArrayOfBoolean[(i1 - 1 + paramInt1)] ^ 0x1) != 0) && ((paramArrayOfBoolean[(i1 + 1 - 1 + paramInt1)] ^ 0x1) != 0) ? 1 : 0) != 0) {
              break label2654;
            }
          } else {
            if ((paramArrayOfBoolean[(i1 - 1 + paramInt1)] ^ 0x1) != 0) {
              break label2654;
            }
          }
        }
        i2 += 1;
        if (j != 0) {
          if ((i ^ 0x1) != 0)
          {
            d8 = Ddot.ddot(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            d11 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1);
            d6 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            paramArrayOfDouble4[(i2 - 1 + paramInt9)] = (Math.abs(d8) / (d11 * d6));
          }
          else
          {
            d9 = Ddot.ddot(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            d9 += Ddot.ddot(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1);
            d10 = Ddot.ddot(paramInt2, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1);
            d10 -= Ddot.ddot(paramInt2, paramArrayOfDouble2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1);
            d11 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1), Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1));
            d6 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt2, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1), Dnrm2.dnrm2(paramInt2, paramArrayOfDouble2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1));
            d1 = Dlapy2.dlapy2(d9, d10) / (d11 * d6);
            paramArrayOfDouble4[(i2 - 1 + paramInt9)] = d1;
            paramArrayOfDouble4[(i2 + 1 - 1 + paramInt9)] = d1;
          }
        }
        if (k != 0)
        {
          Dlacpy.dlacpy("Full", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble6, paramInt12, paramInt13);
          localintW2.val = i1;
          localintW3.val = 1;
          Dtrexc.dtrexc("No Q", paramInt2, paramArrayOfDouble6, paramInt12, paramInt13, arrayOfDouble, 0, 1, localintW2, localintW3, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, localintW1);
          if ((localintW1.val != 1 ? 0 : 1) == 0) {}
          if (((localintW1.val != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            localdoubleW3.val = 1.0D;
            localdoubleW2.val = localdoubleW1.val;
          }
          else
          {
            int i6;
            if ((paramArrayOfDouble6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)] != 0.0D ? 0 : 1) != 0)
            {
              m = 2;
              for (i6 = paramInt2 - 2 + 1; i6 > 0; i6--)
              {
                paramArrayOfDouble6[(m - 1 + (m - 1) * paramInt13 + paramInt12)] -= paramArrayOfDouble6[(1 - 1 + (1 - 1) * paramInt13 + paramInt12)];
                m += 1;
              }
              i3 = 1;
              i4 = paramInt2 - 1;
            }
            else
            {
              d7 = Math.sqrt(Math.abs(paramArrayOfDouble6[(1 - 1 + (2 - 1) * paramInt13 + paramInt12)])) * Math.sqrt(Math.abs(paramArrayOfDouble6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)]));
              d3 = Dlapy2.dlapy2(d7, paramArrayOfDouble6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)]);
              d2 = d7 / d3;
              d12 = -(paramArrayOfDouble6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)] / d3);
              n = 3;
              for (i6 = paramInt2 - 3 + 1; i6 > 0; i6--)
              {
                paramArrayOfDouble6[(2 - 1 + (n - 1) * paramInt13 + paramInt12)] = (d2 * paramArrayOfDouble6[(2 - 1 + (n - 1) * paramInt13 + paramInt12)]);
                paramArrayOfDouble6[(n - 1 + (n - 1) * paramInt13 + paramInt12)] -= paramArrayOfDouble6[(1 - 1 + (1 - 1) * paramInt13 + paramInt12)];
                n += 1;
              }
              paramArrayOfDouble6[(2 - 1 + (2 - 1) * paramInt13 + paramInt12)] = 0.0D;
              paramArrayOfDouble6[(1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12)] = (2.0D * d7);
              m = 2;
              for (i6 = paramInt2 - 1 - 2 + 1; i6 > 0; i6--)
              {
                paramArrayOfDouble6[(m - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12)] = (d12 * paramArrayOfDouble6[(1 - 1 + (m + 1 - 1) * paramInt13 + paramInt12)]);
                m += 1;
              }
              i3 = 2;
              i4 = 2 * (paramInt2 - 1);
            }
            localdoubleW2.val = 0.0D;
            localintW4.val = 0;
            for (;;)
            {
              Dlacn2.dlacn2(i4, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 2 - 1) * paramInt13 + paramInt12, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfInt, paramInt14, localdoubleW2, localintW4, arrayOfInt, 0);
              if ((localintW4.val == 0 ? 0 : 1) == 0) {
                break;
              }
              if ((localintW4.val != 1 ? 0 : 1) != 0)
              {
                if ((i3 != 1 ? 0 : 1) != 0) {
                  Dlaqtr.dlaqtr(true, true, paramInt2 - 1, paramArrayOfDouble6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, arrayOfDouble, 0, d4, localdoubleW3, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
                } else {
                  Dlaqtr.dlaqtr(true, false, paramInt2 - 1, paramArrayOfDouble6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, d7, localdoubleW3, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
                }
              }
              else if ((i3 != 1 ? 0 : 1) != 0) {
                Dlaqtr.dlaqtr(false, true, paramInt2 - 1, paramArrayOfDouble6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, arrayOfDouble, 0, d4, localdoubleW3, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
              } else {
                Dlaqtr.dlaqtr(false, false, paramInt2 - 1, paramArrayOfDouble6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, d7, localdoubleW3, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfDouble6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
              }
            }
          }
          paramArrayOfDouble5[(i2 - 1 + paramInt10)] = (localdoubleW3.val / Math.max(localdoubleW2.val, localdoubleW4.val));
          if (i != 0) {
            paramArrayOfDouble5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfDouble5[(i2 - 1 + paramInt10)];
          }
        }
        if (i != 0) {
          i2 += 1;
        }
      }
      label2654:
      i1 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtrsna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */