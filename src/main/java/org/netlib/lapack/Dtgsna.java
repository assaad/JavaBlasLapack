package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgsna
{
  public static void dtgsna(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, int paramInt13, intW paramintW1, double[] paramArrayOfDouble7, int paramInt14, int paramInt15, int[] paramArrayOfInt, int paramInt16, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double[] arrayOfDouble1 = new double[1];
    double[] arrayOfDouble2 = new double[1];
    bool2 = Lsame.lsame(paramString1, "B");
    m = (!Lsame.lsame(paramString1, "E")) && (!bool2) ? 0 : 1;
    k = (!Lsame.lsame(paramString1, "V")) && (!bool2) ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "S");
    paramintW2.val = 0;
    i = paramInt15 != -1 ? 0 : 1;
    if ((((m ^ 0x1) != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0)
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
    else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW2.val = -8;
    }
    else
    {
      if (m != 0) {}
      if (((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -10;
      }
      else
      {
        if (m != 0) {}
        if (((paramInt10 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -12;
        }
        else
        {
          if (bool1)
          {
            paramintW1.val = 0;
            j = 0;
            i2 = 1;
            for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
            {
              if (j != 0) {
                j = 0;
              } else if ((i2 >= paramInt2 ? 0 : 1) != 0)
              {
                if ((paramArrayOfDouble1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] != 0.0D ? 0 : 1) != 0)
                {
                  if (paramArrayOfBoolean[(i2 - 1 + paramInt1)] != 0) {
                    paramintW1.val += 1;
                  }
                }
                else
                {
                  j = 1;
                  if (((paramArrayOfBoolean[(i2 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i2 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
                    paramintW1.val += 2;
                  }
                }
              }
              else if (paramArrayOfBoolean[(paramInt2 - 1 + paramInt1)] != 0) {
                paramintW1.val += 1;
              }
              i2 += 1;
            }
          }
          else
          {
            paramintW1.val = paramInt2;
          }
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            i4 = 1;
          } else if (((!Lsame.lsame(paramString1, "V")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0) {
            i4 = 2 * paramInt2 * (paramInt2 + 2) + 16;
          } else {
            i4 = paramInt2;
          }
          paramArrayOfDouble7[(1 - 1 + paramInt14)] = i4;
          if ((paramInt13 >= paramintW1.val ? 0 : 1) != 0)
          {
            paramintW2.val = -15;
          }
          else
          {
            if ((paramInt15 >= i4 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW2.val = -18;
            }
          }
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGSNA", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    d5 = Dlamch.dlamch("P");
    d10 = Dlamch.dlamch("S") / d5;
    i3 = 0;
    j = 0;
    i2 = 1;
    for (int i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      if (j != 0)
      {
        j = 0;
        break label2835;
      }
      else
      {
        if ((i2 >= paramInt2 ? 0 : 1) != 0) {
          j = paramArrayOfDouble1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1;
        }
        if (bool1) {
          if (j != 0) {
            if ((((paramArrayOfBoolean[(i2 - 1 + paramInt1)] ^ 0x1) != 0) && ((paramArrayOfBoolean[(i2 + 1 - 1 + paramInt1)] ^ 0x1) != 0) ? 1 : 0) != 0) {
              break label2835;
            }
          } else {
            if ((paramArrayOfBoolean[(i2 - 1 + paramInt1)] ^ 0x1) != 0) {
              break label2835;
            }
          }
        }
        i3 += 1;
        if (m != 0) {
          if (j != 0)
          {
            d7 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt2, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1), Dnrm2.dnrm2(paramInt2, paramArrayOfDouble4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1));
            d6 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1), Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1));
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d14 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            d13 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d11 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            d12 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            d15 = d14 + d11;
            d16 = d12 - d13;
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d14 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            d13 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d11 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            d12 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            d17 = d14 + d11;
            d18 = d12 - d13;
            d15 = Dlapy2.dlapy2(d15, d16);
            d17 = Dlapy2.dlapy2(d17, d18);
            d4 = Dlapy2.dlapy2(d15, d17);
            paramArrayOfDouble5[(i3 - 1 + paramInt11)] = (d4 / (d7 * d6));
            paramArrayOfDouble5[(i3 + 1 - 1 + paramInt11)] = paramArrayOfDouble5[(i3 - 1 + paramInt11)];
          }
          else
          {
            d7 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1);
            d6 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d15 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("N", paramInt2, paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0D, paramArrayOfDouble7, paramInt14, 1);
            d17 = Ddot.ddot(paramInt2, paramArrayOfDouble7, paramInt14, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            d4 = Dlapy2.dlapy2(d15, d17);
            if ((d4 != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble5[(i3 - 1 + paramInt11)] = -1.0D;
            } else {
              paramArrayOfDouble5[(i3 - 1 + paramInt11)] = (d4 / (d7 * d6));
            }
          }
        }
        if (k != 0)
        {
          if ((paramInt2 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble6[(i3 - 1 + paramInt12)] = Dlapy2.dlapy2(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
            break label2835;
          }
          if (j != 0)
          {
            paramArrayOfDouble7[(1 - 1 + paramInt14)] = paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            paramArrayOfDouble7[(2 - 1 + paramInt14)] = paramArrayOfDouble1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            paramArrayOfDouble7[(3 - 1 + paramInt14)] = paramArrayOfDouble1[(i2 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)];
            paramArrayOfDouble7[(4 - 1 + paramInt14)] = paramArrayOfDouble1[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)];
            paramArrayOfDouble7[(5 - 1 + paramInt14)] = paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt6 + paramInt5)];
            paramArrayOfDouble7[(6 - 1 + paramInt14)] = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 - 1) * paramInt6 + paramInt5)];
            paramArrayOfDouble7[(7 - 1 + paramInt14)] = paramArrayOfDouble2[(i2 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5)];
            paramArrayOfDouble7[(8 - 1 + paramInt14)] = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5)];
            dlag2_adapter(paramArrayOfDouble7, paramInt14, 2, paramArrayOfDouble7, 5 - 1 + paramInt14, 2, d10 * d5, localdoubleW3, arrayOfDouble2, 1 - 1, localdoubleW2, arrayOfDouble1, 1 - 1, localdoubleW1);
            d1 = 1.0D;
            d2 = 2.0D * (localdoubleW2.val * localdoubleW2.val + localdoubleW1.val * localdoubleW1.val + localdoubleW3.val * localdoubleW3.val);
            d3 = 4.0D * localdoubleW3.val * localdoubleW3.val * localdoubleW1.val * localdoubleW1.val;
            d8 = d2 + Math.sqrt(d2 * d2 - 4.0D * d3);
            d9 = d3 / d8;
            d8 /= 2.0D;
            d4 = Math.min(Math.sqrt(d8), Math.sqrt(d9));
          }
          Dlacpy.dlacpy("Full", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble7, paramInt14, paramInt2);
          Dlacpy.dlacpy("Full", paramInt2, paramInt2, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble7, paramInt2 * paramInt2 + 1 - 1 + paramInt14, paramInt2);
          localintW2.val = i2;
          localintW3.val = 1;
          Dtgexc.dtgexc(false, false, paramInt2, paramArrayOfDouble7, paramInt14, paramInt2, paramArrayOfDouble7, paramInt2 * paramInt2 + 1 - 1 + paramInt14, paramInt2, arrayOfDouble1, 0, 1, arrayOfDouble2, 0, 1, localintW2, localintW3, paramArrayOfDouble7, paramInt2 * paramInt2 * 2 + 1 - 1 + paramInt14, paramInt15 - 2 * paramInt2 * paramInt2, localintW1);
          if ((localintW1.val <= 0 ? 0 : 1) != 0)
          {
            paramArrayOfDouble6[(i3 - 1 + paramInt12)] = 0.0D;
          }
          else
          {
            i5 = 1;
            if ((paramArrayOfDouble7[(2 - 1 + paramInt14)] == 0.0D ? 0 : 1) != 0) {
              i5 = 2;
            }
            i6 = paramInt2 - i5;
            if ((i6 != 0 ? 0 : 1) != 0)
            {
              paramArrayOfDouble6[(i3 - 1 + paramInt12)] = d4;
            }
            else
            {
              n = paramInt2 * paramInt2 + 1;
              i1 = 2 * paramInt2 * paramInt2 + 1;
              dtgsyl_adapter("N", 3, i6, i5, paramArrayOfDouble7, paramInt2 * i5 + i5 + 1 - 1 + paramInt14, paramInt2, paramArrayOfDouble7, paramInt14, paramInt2, paramArrayOfDouble7, i5 + 1 - 1 + paramInt14, paramInt2, paramArrayOfDouble7, paramInt2 * i5 + i5 + n - 1 + paramInt14, paramInt2, paramArrayOfDouble7, n - 1 + paramInt14, paramInt2, paramArrayOfDouble7, i5 + n - 1 + paramInt14, paramInt2, localdoubleW4, paramArrayOfDouble6, i3 - 1 + paramInt12, paramArrayOfDouble7, i1 + 1 - 1 + paramInt14, paramInt15 - 2 * paramInt2 * paramInt2, paramArrayOfInt, paramInt16, localintW1);
              if (j != 0) {
                paramArrayOfDouble6[(i3 - 1 + paramInt12)] = Math.min(Math.max(1.0D, d1) * paramArrayOfDouble6[(i3 - 1 + paramInt12)], d4);
              }
            }
          }
          if (j != 0) {
            paramArrayOfDouble6[(i3 + 1 - 1 + paramInt12)] = paramArrayOfDouble6[(i3 - 1 + paramInt12)];
          }
        }
        if (j != 0) {
          i3 += 1;
        }
      }
      label2835:
      i2 += 1;
    }
    paramArrayOfDouble7[(1 - 1 + paramInt14)] = i4;
  }
  
  private static void dlag2_adapter(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double paramDouble, doubleW paramdoubleW1, double[] paramArrayOfDouble3, int paramInt5, doubleW paramdoubleW2, double[] paramArrayOfDouble4, int paramInt6, doubleW paramdoubleW3)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble3[paramInt5]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble4[paramInt6]);
    Dlag2.dlag2(paramArrayOfDouble1, paramInt1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramDouble, paramdoubleW1, localdoubleW1, paramdoubleW2, localdoubleW2, paramdoubleW3);
    paramArrayOfDouble3[paramInt5] = localdoubleW1.val;
    paramArrayOfDouble4[paramInt6] = localdoubleW2.val;
  }
  
  private static void dtgsyl_adapter(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt16, double[] paramArrayOfDouble8, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble7[paramInt16]);
    Dtgsyl.dtgsyl(paramString, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramInt15, paramdoubleW, localdoubleW, paramArrayOfDouble8, paramInt17, paramInt18, paramArrayOfInt, paramInt19, paramintW);
    paramArrayOfDouble7[paramInt16] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgsna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */