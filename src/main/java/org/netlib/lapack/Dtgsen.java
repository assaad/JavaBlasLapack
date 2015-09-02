package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgsen
{
  public static void dtgsen(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean[] paramArrayOfBoolean, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, int paramInt12, double[] paramArrayOfDouble7, int paramInt13, int paramInt14, intW paramintW1, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble8, int paramInt15, double[] paramArrayOfDouble9, int paramInt16, int paramInt17, int[] paramArrayOfInt, int paramInt18, int paramInt19, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW1 = new intW(0);
    int i4 = 0;
    int i5 = 0;
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d2 = 0.0D;
    int[] arrayOfInt = new int[3];
    paramintW2.val = 0;
    if ((paramInt17 != -1 ? 0 : 1) == 0) {}
    i = (paramInt19 != -1 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 5 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -5;
    }
    else if ((paramInt5 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW2.val = -7;
    }
    else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW2.val = -9;
    }
    else
    {
      if ((paramInt12 >= 1 ? 0 : 1) == 0) {
        if (!paramBoolean1) {}
      }
      if ((((paramInt12 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -14;
      }
      else
      {
        if ((paramInt14 >= 1 ? 0 : 1) == 0) {
          if (!paramBoolean2) {}
        }
        if ((((paramInt14 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW2.val = -16;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGSEN", -paramintW2.val);
      return;
    }
    d1 = Dlamch.dlamch("P");
    d2 = Dlamch.dlamch("S") / d1;
    localintW1.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    i2 = (paramInt1 < 4 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 != 2 ? 0 : 1) == 0) {}
    n = (paramInt1 != 4 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 != 3 ? 0 : 1) == 0) {}
    i1 = (paramInt1 != 5 ? 0 : 1) == 0 ? 0 : 1;
    m = (n == 0) && (i1 == 0) ? 0 : 1;
    paramintW1.val = 0;
    j = 0;
    i5 = 1;
    for (int i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
    {
      if (j != 0) {
        j = 0;
      } else if ((i5 >= paramInt3 ? 0 : 1) != 0)
      {
        if ((paramArrayOfDouble1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) != 0)
        {
          if (paramArrayOfBoolean[(i5 - 1 + paramInt2)] != false) {
            paramintW1.val += 1;
          }
        }
        else
        {
          j = 1;
          if (((paramArrayOfBoolean[(i5 - 1 + paramInt2)] == false) && (paramArrayOfBoolean[(i5 + 1 - 1 + paramInt2)] == false) ? 0 : 1) != 0) {
            paramintW1.val += 2;
          }
        }
      }
      else if (paramArrayOfBoolean[(paramInt3 - 1 + paramInt2)] != false) {
        paramintW1.val += 1;
      }
      i5 += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt1 != 4 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      i7 = Util.max(1, 4 * paramInt3 + 16, 2 * paramintW1.val * (paramInt3 - paramintW1.val));
      i6 = Math.max(1, paramInt3 + 6);
    }
    else
    {
      if ((paramInt1 != 3 ? 0 : 1) == 0) {}
      if (((paramInt1 != 5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i7 = Util.max(1, 4 * paramInt3 + 16, 4 * paramintW1.val * (paramInt3 - paramintW1.val));
        i6 = Util.max(1, 2 * paramintW1.val * (paramInt3 - paramintW1.val), paramInt3 + 6);
      }
      else
      {
        i7 = Math.max(1, 4 * paramInt3 + 16);
        i6 = 1;
      }
    }
    paramArrayOfDouble9[(1 - 1 + paramInt16)] = i7;
    paramArrayOfInt[(1 - 1 + paramInt18)] = i6;
    if ((paramInt17 >= i7 ? 0 : 1) != 0) {}
    if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
    {
      paramintW2.val = -22;
    }
    else
    {
      if ((paramInt19 >= i6 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -24;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGSEN", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramintW1.val != paramInt3 ? 0 : 1) == 0) {}
    if (((paramintW1.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if (i2 != 0)
      {
        paramdoubleW1.val = 1.0D;
        paramdoubleW2.val = 1.0D;
      }
      if (m != 0)
      {
        localdoubleW1.val = 0.0D;
        localdoubleW2.val = 1.0D;
        i3 = 1;
        for (i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
        {
          Dlassq.dlassq(paramInt3, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, localdoubleW1, localdoubleW2);
          Dlassq.dlassq(paramInt3, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1, localdoubleW1, localdoubleW2);
          i3 += 1;
        }
        paramArrayOfDouble8[(1 - 1 + paramInt15)] = (localdoubleW1.val * Math.sqrt(localdoubleW2.val));
        paramArrayOfDouble8[(2 - 1 + paramInt15)] = paramArrayOfDouble8[(1 - 1 + paramInt15)];
      }
    }
    else
    {
      localintW4.val = 0;
      j = 0;
      i5 = 1;
      for (int i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
      {
        if (j != 0)
        {
          j = 0;
        }
        else
        {
          k = paramArrayOfBoolean[(i5 - 1 + paramInt2)]==false ?0:1;
          if ((i5 >= paramInt3 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0)
            {
              j = 1;
              k = (k == 0) && (paramArrayOfBoolean[(i5 + 1 - 1 + paramInt2)] == false) ? 0 : 1;
            }
          }
          if (k != 0)
          {
            localintW4.val += 1;
            localintW3.val = i5;
            if ((i5 == localintW4.val ? 0 : 1) != 0) {
              Dtgexc.dtgexc(paramBoolean1, paramBoolean2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble6, paramInt11, paramInt12, paramArrayOfDouble7, paramInt13, paramInt14, localintW3, localintW4, paramArrayOfDouble9, paramInt16, paramInt17, localintW1);
            }
            if ((localintW1.val <= 0 ? 0 : 1) != 0)
            {
              paramintW2.val = 1;
              if (i2 != 0)
              {
                paramdoubleW1.val = 0.0D;
                paramdoubleW2.val = 0.0D;
              }
              if (m != 0)
              {
                paramArrayOfDouble8[(1 - 1 + paramInt15)] = 0.0D;
                paramArrayOfDouble8[(2 - 1 + paramInt15)] = 0.0D;
              }
              break;
            }
            if (j != 0) {
              localintW4.val += 1;
            }
          }
        }
        i5 += 1;
      }
      if (i2 != 0)
      {
        i9 = paramintW1.val;
        i10 = paramInt3 - paramintW1.val;
        i3 = i9 + 1;
        i4 = 0;
        Dlacpy.dlacpy("Full", i9, i10, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i9);
        Dlacpy.dlacpy("Full", i9, i10, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i9);
        dtgsyl_adapter("N", i4, i9, i10, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i9, localdoubleW1, paramArrayOfDouble8, 1 - 1 + paramInt15, paramArrayOfDouble9, i9 * i10 * 2 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
        localdoubleW3.val = 0.0D;
        localdoubleW2.val = 1.0D;
        Dlassq.dlassq(i9 * i10, paramArrayOfDouble9, paramInt16, 1, localdoubleW3, localdoubleW2);
        localdoubleW3.val *= Math.sqrt(localdoubleW2.val);
        if ((paramdoubleW1.val != 0.0D ? 0 : 1) != 0) {
          paramdoubleW1.val = 1.0D;
        } else {
          localdoubleW1.val /= Math.sqrt(localdoubleW1.val * localdoubleW1.val / paramdoubleW1.val + paramdoubleW1.val) * Math.sqrt(paramdoubleW1.val);
        }
        localdoubleW3.val = 0.0D;
        localdoubleW2.val = 1.0D;
        Dlassq.dlassq(i9 * i10, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, 1, localdoubleW3, localdoubleW2);
        localdoubleW3.val *= Math.sqrt(localdoubleW2.val);
        if ((paramdoubleW2.val != 0.0D ? 0 : 1) != 0) {
          paramdoubleW2.val = 1.0D;
        } else {
          localdoubleW1.val /= Math.sqrt(localdoubleW1.val * localdoubleW1.val / paramdoubleW2.val + paramdoubleW2.val) * Math.sqrt(paramdoubleW2.val);
        }
      }
      if (m != 0) {
        if (n != 0)
        {
          i9 = paramintW1.val;
          i10 = paramInt3 - paramintW1.val;
          i3 = i9 + 1;
          i4 = 3;
          dtgsyl_adapter("N", i4, i9, i10, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i9, localdoubleW1, paramArrayOfDouble8, 1 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
          dtgsyl_adapter("N", i4, i10, i9, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i10, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i10, localdoubleW1, paramArrayOfDouble8, 2 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
        }
        else
        {
          localintW2.val = 0;
          i9 = paramintW1.val;
          i10 = paramInt3 - paramintW1.val;
          i3 = i9 + 1;
          i4 = 0;
          i8 = 2 * i9 * i10;
          for (;;)
          {
            dlacn2_adapter(i8, paramArrayOfDouble9, i8 + 1 - 1 + paramInt16, paramArrayOfDouble9, paramInt16, paramArrayOfInt, paramInt18, paramArrayOfDouble8, 1 - 1 + paramInt15, localintW2, arrayOfInt, 0);
            if ((localintW2.val == 0 ? 0 : 1) == 0) {
              break;
            }
            if ((localintW2.val != 1 ? 0 : 1) != 0) {
              dtgsyl_adapter("N", i4, i9, i10, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i9, localdoubleW1, paramArrayOfDouble8, 1 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            } else {
              dtgsyl_adapter("T", i4, i9, i10, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i9, localdoubleW1, paramArrayOfDouble8, 1 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            }
          }
          paramArrayOfDouble8[(1 - 1 + paramInt15)] = (localdoubleW1.val / paramArrayOfDouble8[(1 - 1 + paramInt15)]);
          for (;;)
          {
            dlacn2_adapter(i8, paramArrayOfDouble9, i8 + 1 - 1 + paramInt16, paramArrayOfDouble9, paramInt16, paramArrayOfInt, paramInt18, paramArrayOfDouble8, 2 - 1 + paramInt15, localintW2, arrayOfInt, 0);
            if ((localintW2.val == 0 ? 0 : 1) == 0) {
              break;
            }
            if ((localintW2.val != 1 ? 0 : 1) != 0) {
              dtgsyl_adapter("N", i4, i10, i9, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i10, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i10, localdoubleW1, paramArrayOfDouble8, 2 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            } else {
              dtgsyl_adapter("T", i4, i10, i9, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble9, paramInt16, i10, paramArrayOfDouble2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble9, i9 * i10 + 1 - 1 + paramInt16, i10, localdoubleW1, paramArrayOfDouble8, 2 - 1 + paramInt15, paramArrayOfDouble9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            }
          }
          paramArrayOfDouble8[(2 - 1 + paramInt15)] = (localdoubleW1.val / paramArrayOfDouble8[(2 - 1 + paramInt15)]);
        }
      }
    }
    j = 0;
    i5 = 1;
    for (int i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
    {
      if (j != 0)
      {
        j = 0;
      }
      else
      {
        if ((i5 >= paramInt3 ? 0 : 1) != 0) {
          if ((paramArrayOfDouble1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0) {
            j = 1;
          }
        }
        if (j != 0)
        {
          paramArrayOfDouble9[(1 - 1 + paramInt16)] = paramArrayOfDouble1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble9[(2 - 1 + paramInt16)] = paramArrayOfDouble1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble9[(3 - 1 + paramInt16)] = paramArrayOfDouble1[(i5 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble9[(4 - 1 + paramInt16)] = paramArrayOfDouble1[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble9[(5 - 1 + paramInt16)] = paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble9[(6 - 1 + paramInt16)] = paramArrayOfDouble2[(i5 + 1 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble9[(7 - 1 + paramInt16)] = paramArrayOfDouble2[(i5 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfDouble9[(8 - 1 + paramInt16)] = paramArrayOfDouble2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          dlag2_adapter(paramArrayOfDouble9, paramInt16, 2, paramArrayOfDouble9, 5 - 1 + paramInt16, 2, d2 * d1, paramArrayOfDouble5, i5 - 1 + paramInt10, paramArrayOfDouble5, i5 + 1 - 1 + paramInt10, paramArrayOfDouble3, i5 - 1 + paramInt8, paramArrayOfDouble3, i5 + 1 - 1 + paramInt8, paramArrayOfDouble4, i5 - 1 + paramInt9);
          paramArrayOfDouble4[(i5 + 1 - 1 + paramInt9)] = (-paramArrayOfDouble4[(i5 - 1 + paramInt9)]);
        }
        else
        {
          if ((Util.dsign(1.0D, paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]) >= 0.0D ? 0 : 1) != 0)
          {
            i3 = 1;
            for (int i12 = paramInt3 - 1 + 1; i12 > 0; i12--)
            {
              paramArrayOfDouble1[(i5 - 1 + (i3 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i5 - 1 + (i3 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble2[(i5 - 1 + (i3 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i5 - 1 + (i3 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfDouble6[(i3 - 1 + (i5 - 1) * paramInt12 + paramInt11)] = (-paramArrayOfDouble6[(i3 - 1 + (i5 - 1) * paramInt12 + paramInt11)]);
              i3 += 1;
            }
          }
          paramArrayOfDouble3[(i5 - 1 + paramInt8)] = paramArrayOfDouble1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble4[(i5 - 1 + paramInt9)] = 0.0D;
          paramArrayOfDouble5[(i5 - 1 + paramInt10)] = paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
        }
      }
      i5 += 1;
    }
    paramArrayOfDouble9[(1 - 1 + paramInt16)] = i7;
    paramArrayOfInt[(1 - 1 + paramInt18)] = i6;
  }
  
  private static void dtgsyl_adapter(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt16, double[] paramArrayOfDouble8, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble7[paramInt16]);
    Dtgsyl.dtgsyl(paramString, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramInt15, paramdoubleW, localdoubleW, paramArrayOfDouble8, paramInt17, paramInt18, paramArrayOfInt, paramInt19, paramintW);
    paramArrayOfDouble7[paramInt16] = localdoubleW.val;
  }
  
  private static void dlacn2_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlacn2.dlacn2(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfInt1, paramInt4, localdoubleW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfDouble3[paramInt5] = localdoubleW.val;
  }
  
  private static void dlag2_adapter(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double paramDouble, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, double[] paramArrayOfDouble7, int paramInt9)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble3[paramInt5]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble4[paramInt6]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble5[paramInt7]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble6[paramInt8]);
    doubleW localdoubleW5 = new doubleW(paramArrayOfDouble7[paramInt9]);
    Dlag2.dlag2(paramArrayOfDouble1, paramInt1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramDouble, localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4, localdoubleW5);
    paramArrayOfDouble3[paramInt5] = localdoubleW1.val;
    paramArrayOfDouble4[paramInt6] = localdoubleW2.val;
    paramArrayOfDouble5[paramInt7] = localdoubleW3.val;
    paramArrayOfDouble6[paramInt8] = localdoubleW4.val;
    paramArrayOfDouble7[paramInt9] = localdoubleW5.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgsen.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */