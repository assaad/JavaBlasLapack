package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dscal;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlarrv
{
  public static void dlarrv(int paramInt1, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble3, int[] paramArrayOfInt1, int paramInt4, int paramInt5, int paramInt6, int paramInt7, double paramDouble4, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, int paramInt15, int[] paramArrayOfInt4, int paramInt16, double[] paramArrayOfDouble8, int paramInt17, int[] paramArrayOfInt5, int paramInt18, intW paramintW)
  {
    ;
    ;
    ;
    ;
    int i = 0;
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
    int i11 = 0;
    intW localintW1 = new intW(0);
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    int i26 = 0;
    int i27 = 0;
    int i28 = 0;
    intW localintW2 = new intW(0);
    int i29 = 0;
    int i30 = 0;
    int i31 = 0;
    int i32 = 0;
    int i33 = 0;
    int i34 = 0;
    int i35 = 0;
    int i36 = 0;
    int i37 = 0;
    int i38 = 0;
    int i39 = 0;
    int i40 = 0;
    int i41 = 0;
    int i42 = 0;
    int i43 = 0;
    int i44 = 0;
    int i45 = 0;
    int i46 = 0;
    int i47 = 0;
    int i48 = 0;
    int i49 = 0;
    int i50 = 0;
    int i51 = 0;
    int i52 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d12 = 0.0D;
    double d13 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d20 = 0.0D;
    double d21 = 0.0D;
    doubleW localdoubleW6 = new doubleW(0.0D);
    i15 = paramInt1 + 1;
    i16 = 2 * paramInt1 + 1;
    i17 = 3 * paramInt1 + 1;
    i26 = 12 * paramInt1;
    i3 = 1;
    int i53 = i26 - 1 + 1;
    while (i53 > 0)
    {
      paramArrayOfDouble8[(i3 - 1 + paramInt17)] = 0.0D;
      i3 += 1;
      ???--;
    }
    i10 = 0;
    i8 = paramInt1;
    i9 = 2 * paramInt1;
    i11 = 3 * paramInt1 + 1;
    i25 = 7 * paramInt1;
    i3 = 1;
    i53 = i25 - 1 + 1;
    while (i53 > 0)
    {
      paramArrayOfInt5[(i3 - 1 + paramInt18)] = 0;
      i3 += 1;
      ???--;
    }
    i50 = 1;
    if ((paramInt6 <= 1 ? 0 : 1) != 0) {
      i50 = paramInt6 - 1;
    }
    i51 = paramInt5;
    if ((paramInt7 >= paramInt5 ? 0 : 1) != 0) {
      i51 = paramInt7 + 1;
    }
    i52 = i51 - i50 + 1;
    Dlaset.dlaset("Full", paramInt1, i52, 0.0D, 0.0D, paramArrayOfDouble7, 1 - 1 + (i50 - 1) * paramInt15 + paramInt14, paramInt15);
    d3 = Dlamch.dlamch("Precision");
    d14 = 2.0D * d3;
    m = 1;
    if ((paramInt6 != 1 ? 0 : 1) != 0) {}
    if (((paramInt7 != paramInt5 ? 0 : 1) != 0 ? 1 : 0) == 0)
    {
      paramdoubleW1.val = (4.0D * d3);
      paramdoubleW2.val = (4.0D * d3);
    }
    i2 = 0;
    i4 = 1;
    i43 = 1;
    i23 = 1;
    i53 = paramArrayOfInt2[(paramInt5 - 1 + paramInt11)] - 1 + 1;
    label4231:
    label4699:
    label4886:
    label4935:
    while (i53 > 0)
    {
      i6 = paramArrayOfInt1[(i23 - 1 + paramInt4)];
      d17 = paramArrayOfDouble2[(i6 - 1 + paramInt3)];
      i44 = i43 - 1;
      while ((i44 >= paramInt5 ? 0 : 1) != 0)
      {
        if ((paramArrayOfInt2[(i44 + 1 - 1 + paramInt11)] != i23 ? 0 : 1) == 0) {
          break;
        }
        i44 += 1;
      }
      if ((i44 >= i43 ? 0 : 1) != 0)
      {
        i4 = i6 + 1;
        break label4935;
      }
      else
      {
        if ((i44 >= paramInt6 ? 0 : 1) == 0) {}
        if (((i43 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i4 = i6 + 1;
          i43 = i44 + 1;
          break label4935;
        }
        else
        {
          d7 = paramArrayOfDouble6[(2 * i4 - 1 - 1 + paramInt13)];
          d8 = paramArrayOfDouble6[(2 * i4 - 1 + paramInt13)];
          i3 = i4 + 1;
          int i54 = i6 - (i4 + 1) + 1;
          while (i54 > 0)
          {
            d7 = Math.min(paramArrayOfDouble6[(2 * i3 - 1 - 1 + paramInt13)], d7);
            d8 = Math.max(paramArrayOfDouble6[(2 * i3 - 1 + paramInt13)], d8);
            i3 += 1;
            ???--;
          }
          d18 = d8 - d7;
          i37 = i4 - 1;
          i13 = i6 - i4 + 1;
          i12 = i44 - i43 + 1;
          if ((i4 != i6 ? 0 : 1) != 0)
          {
            i2 += 1;
            paramArrayOfDouble7[(i4 - 1 + (i43 - 1) * paramInt15 + paramInt14)] = 1.0D;
            paramArrayOfInt4[(2 * i43 - 1 - 1 + paramInt16)] = i4;
            paramArrayOfInt4[(2 * i43 - 1 + paramInt16)] = i4;
            paramArrayOfDouble3[(i43 - 1 + paramInt8)] += d17;
            paramArrayOfDouble8[(i43 - 1 + paramInt17)] = paramArrayOfDouble3[(i43 - 1 + paramInt8)];
            i4 = i6 + 1;
            i43 += 1;
          }
          else
          {
            Dcopy.dcopy(i12, paramArrayOfDouble3, i43 - 1 + paramInt8, 1, paramArrayOfDouble8, i43 - 1 + paramInt17, 1);
            i3 = 1;
            i54 = i12 - 1 + 1;
            while (i54 > 0)
            {
              paramArrayOfDouble3[(i43 + i3 - 1 - 1 + paramInt8)] += d17;
              i3 += 1;
              ???--;
            }
            i28 = 0;
            i41 = 1;
            i27 = 1;
            paramArrayOfInt5[(i8 + 1 - 1 + paramInt18)] = 1;
            paramArrayOfInt5[(i8 + 2 - 1 + paramInt18)] = i12;
            i5 = 0;
            while ((i5 >= i12 ? 0 : 1) != 0)
            {
              if ((i28 <= paramInt5 ? 0 : 1) != 0)
              {
                paramintW.val = -2;
                return;
              }
              i39 = i27;
              i27 = 0;
              i41 = 1 - i41;
              if ((i41 != 0 ? 0 : 1) != 0)
              {
                i35 = i8;
                i29 = i9;
              }
              else
              {
                i35 = i9;
                i29 = i8;
              }
              i3 = 1;
              i54 = i39 - 1 + 1;
              while (i54 > 0)
              {
                i22 = i35 + 2 * i3;
                i36 = paramArrayOfInt5[(i22 - 1 - 1 + paramInt18)];
                i38 = paramArrayOfInt5[(i22 - 1 + paramInt18)];
                if ((i28 <= 0 ? 0 : 1) != 0)
                {
                  if ((paramInt6 != 1 ? 0 : 1) != 0) {}
                  if (((paramInt7 != paramInt5 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                    i22 = i43 + i36 - 1;
                  } else if ((i43 + i36 - 1 >= paramInt6 ? 0 : 1) != 0) {
                    i22 = paramInt6 - 1;
                  } else if ((i43 + i36 - 1 <= paramInt7 ? 0 : 1) != 0) {
                    i22 = paramInt7;
                  } else {
                    i22 = i43 + i36 - 1;
                  }
                  Dcopy.dcopy(i13, paramArrayOfDouble7, i4 - 1 + (i22 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble1, i4 - 1 + paramInt2, 1);
                  Dcopy.dcopy(i13 - 1, paramArrayOfDouble7, i4 - 1 + (i22 + 1 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble2, i4 - 1 + paramInt3, 1);
                  d17 = paramArrayOfDouble7[(i6 - 1 + (i22 + 1 - 1) * paramInt15 + paramInt14)];
                  Dlaset.dlaset("Full", i13, 2, 0.0D, 0.0D, paramArrayOfDouble7, i4 - 1 + (i22 - 1) * paramInt15 + paramInt14, paramInt15);
                }
                i22 = i4;
                int i55 = i6 - 1 - i4 + 1;
                while (i55 > 0)
                {
                  d20 = paramArrayOfDouble1[(i22 - 1 + paramInt2)] * paramArrayOfDouble2[(i22 - 1 + paramInt3)];
                  paramArrayOfDouble8[(i15 - 1 + i22 - 1 + paramInt17)] = d20;
                  paramArrayOfDouble8[(i16 - 1 + i22 - 1 + paramInt17)] = (d20 * paramArrayOfDouble2[(i22 - 1 + paramInt3)]);
                  i22 += 1;
                  ???--;
                }
                if ((i28 <= 0 ? 0 : 1) != 0)
                {
                  i40 = paramArrayOfInt3[(i43 - 1 + i36 - 1 + paramInt12)];
                  i42 = paramArrayOfInt3[(i43 - 1 + i38 - 1 + paramInt12)];
                  i34 = paramArrayOfInt3[(i43 - 1 + paramInt12)] - 1;
                  Dlarrb.dlarrb(i13, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble8, i16 + i4 - 1 - 1 + paramInt17, i40, i42, paramdoubleW1.val, paramdoubleW2.val, i34, paramArrayOfDouble8, i43 - 1 + paramInt17, paramArrayOfDouble5, i43 - 1 + paramInt10, paramArrayOfDouble4, i43 - 1 + paramInt9, paramArrayOfDouble8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramDouble3, d18, i13, localintW1);
                  if ((localintW1.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = -1;
                    return;
                  }
                  if ((i36 <= 1 ? 0 : 1) != 0) {
                    paramArrayOfDouble5[(i43 + i36 - 2 - 1 + paramInt10)] = Math.max(paramArrayOfDouble5[(i43 + i36 - 2 - 1 + paramInt10)], paramArrayOfDouble3[(i43 + i36 - 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i43 + i36 - 1 - 1 + paramInt9)] - paramArrayOfDouble3[(i43 + i36 - 2 - 1 + paramInt8)] - paramArrayOfDouble4[(i43 + i36 - 2 - 1 + paramInt9)]);
                  }
                  if ((i43 + i38 - 1 >= i44 ? 0 : 1) != 0) {
                    paramArrayOfDouble5[(i43 + i38 - 1 - 1 + paramInt10)] = Math.max(paramArrayOfDouble5[(i43 + i38 - 1 - 1 + paramInt10)], paramArrayOfDouble3[(i43 + i38 - 1 + paramInt8)] - paramArrayOfDouble4[(i43 + i38 - 1 + paramInt9)] - paramArrayOfDouble3[(i43 + i38 - 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i43 + i38 - 1 - 1 + paramInt9)]);
                  }
                  i22 = i36;
                  i55 = i38 - i36 + 1;
                  while (i55 > 0)
                  {
                    paramArrayOfDouble8[(i43 + i22 - 1 - 1 + paramInt17)] += d17;
                    i22 += 1;
                    ???--;
                  }
                }
                i30 = i36;
                i22 = i36;
                i55 = i38 - i36 + 1;
                while (i55 > 0)
                {
                  if ((i22 != i38 ? 0 : 1) != 0) {
                    i32 = i22;
                  } else if ((paramArrayOfDouble5[(i43 + i22 - 1 - 1 + paramInt10)] < paramDouble4 * Math.abs(paramArrayOfDouble8[(i43 + i22 - 1 - 1 + paramInt17)]) ? 0 : 1) != 0) {
                    i32 = i22;
                  } else {
                    break label4886;
                  }
                  i33 = i32 - i30 + 1;
                  if ((paramInt6 != 1 ? 0 : 1) != 0) {}
                  if (((paramInt7 != paramInt5 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                    i31 = i43 + i30 - 1;
                  } else if ((i43 + i30 - 1 >= paramInt6 ? 0 : 1) != 0) {
                    i31 = paramInt6 - 1;
                  } else if ((i43 + i30 - 1 <= paramInt7 ? 0 : 1) != 0) {
                    i31 = paramInt7;
                  } else {
                    i31 = i43 + i30 - 1;
                  }
                  int i56;
                  if ((i33 <= 1 ? 0 : 1) != 0)
                  {
                    if ((i30 != 1 ? 0 : 1) != 0) {
                      d11 = Math.max(0.0D, paramArrayOfDouble3[(i43 - 1 + paramInt8)] - paramArrayOfDouble4[(i43 - 1 + paramInt9)] - paramDouble1);
                    } else {
                      d11 = paramArrayOfDouble5[(i43 + i30 - 2 - 1 + paramInt10)];
                    }
                    d12 = paramArrayOfDouble5[(i43 + i32 - 1 - 1 + paramInt10)];
                    i24 = 1;
                    i56 = 2 - 1 + 1;
                    while (i56 > 0)
                    {
                      if ((i24 != 1 ? 0 : 1) != 0) {
                        i40 = paramArrayOfInt3[(i43 - 1 + i30 - 1 + paramInt12)];
                      } else {
                        i40 = paramArrayOfInt3[(i43 - 1 + i32 - 1 + paramInt12)];
                      }
                      i34 = paramArrayOfInt3[(i43 - 1 + paramInt12)] - 1;
                      Dlarrb.dlarrb(i13, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble8, i16 + i4 - 1 - 1 + paramInt17, i40, i40, d14, d14, i34, paramArrayOfDouble8, i43 - 1 + paramInt17, paramArrayOfDouble5, i43 - 1 + paramInt10, paramArrayOfDouble4, i43 - 1 + paramInt9, paramArrayOfDouble8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramDouble3, d18, i13, localintW1);
                      i24 += 1;
                      ???--;
                    }
                    if ((i43 + i32 - 1 >= paramInt6 ? 0 : 1) == 0) {}
                    if (((i43 + i30 - 1 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
                    {
                      i5 = i5 + i32 - i30 + 1;
                    }
                    else
                    {
                      Dlarrf.dlarrf(i13, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble2, i4 - 1 + paramInt3, paramArrayOfDouble8, i15 + i4 - 1 - 1 + paramInt17, i30, i32, paramArrayOfDouble8, i43 - 1 + paramInt17, paramArrayOfDouble5, i43 - 1 + paramInt10, paramArrayOfDouble4, i43 - 1 + paramInt9, d18, d11, d12, paramDouble3, localdoubleW5, paramArrayOfDouble7, i4 - 1 + (i31 - 1) * paramInt15 + paramInt14, paramArrayOfDouble7, i4 - 1 + (i31 + 1 - 1) * paramInt15 + paramInt14, paramArrayOfDouble8, i17 - 1 + paramInt17, localintW1);
                      if ((localintW1.val != 0 ? 0 : 1) != 0)
                      {
                        d19 = d17 + localdoubleW5.val;
                        paramArrayOfDouble7[(i6 - 1 + (i31 + 1 - 1) * paramInt15 + paramInt14)] = d19;
                        i24 = i30;
                        i56 = i32 - i30 + 1;
                        while (i56 > 0)
                        {
                          d4 = 3.0D * d3 * Math.abs(paramArrayOfDouble8[(i43 + i24 - 1 - 1 + paramInt17)]);
                          paramArrayOfDouble8[(i43 + i24 - 1 - 1 + paramInt17)] -= localdoubleW5.val;
                          d4 += 4.0D * d3 * Math.abs(paramArrayOfDouble8[(i43 + i24 - 1 - 1 + paramInt17)]);
                          paramArrayOfDouble4[(i43 + i24 - 1 - 1 + paramInt9)] += d4;
                          i24 += 1;
                          ???--;
                        }
                        i27 += 1;
                        i24 = i29 + 2 * i27;
                        paramArrayOfInt5[(i24 - 1 - 1 + paramInt18)] = i30;
                        paramArrayOfInt5[(i24 - 1 + paramInt18)] = i32;
                      }
                      else
                      {
                        paramintW.val = -2;
                        return;
                      }
                    }
                  }
                  else
                  {
                    i20 = 0;
                    d21 = 4.0D * Math.log(i13) * d3;
                    i24 = i30;
                    i45 = i43 + i24 - 1;
                    i46 = Math.max(i45 - 1, 1);
                    i47 = Math.min(i45 + 1, paramInt5);
                    d9 = paramArrayOfDouble8[(i45 - 1 + paramInt17)];
                    i2 += 1;
                    if ((i45 >= paramInt6 ? 0 : 1) == 0) {}
                    if (((i45 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
                    {
                      i = 1;
                      break label4699;
                    }
                    else
                    {
                      i = 0;
                      d10 = paramArrayOfDouble8[(i45 - 1 + paramInt17)] - paramArrayOfDouble4[(i45 - 1 + paramInt9)];
                      d13 = paramArrayOfDouble8[(i45 - 1 + paramInt17)] + paramArrayOfDouble4[(i45 - 1 + paramInt9)];
                      i14 = paramArrayOfInt3[(i45 - 1 + paramInt12)];
                      if ((i24 != 1 ? 0 : 1) != 0) {
                        d11 = d3 * Math.max(Math.abs(d10), Math.abs(d13));
                      } else {
                        d11 = paramArrayOfDouble5[(i46 - 1 + paramInt10)];
                      }
                      if ((i24 != i12 ? 0 : 1) != 0) {
                        d12 = d3 * Math.max(Math.abs(d10), Math.abs(d13));
                      } else {
                        d12 = paramArrayOfDouble5[(i45 - 1 + paramInt10)];
                      }
                      d5 = Math.min(d11, d12);
                      if ((i24 != 1 ? 0 : 1) == 0) {}
                      if (((i24 != i12 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                        d6 = 0.0D;
                      } else {
                        d6 = d5 * d3;
                      }
                      i18 = i13;
                      i19 = 1;
                      d15 = paramArrayOfDouble5[(i45 - 1 + paramInt10)];
                      paramArrayOfDouble5[(i45 - 1 + paramInt10)] = d5;
                      n = 0;
                      i1 = 0;
                      j = m ^ 0x1;
                      for (;;)
                      {
                        if (j != 0)
                        {
                          n = 1;
                          i21 = paramArrayOfInt5[(i10 + i45 - 1 + paramInt18)];
                          i34 = paramArrayOfInt3[(i43 - 1 + paramInt12)] - 1;
                          Dlarrb.dlarrb(i13, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble8, i16 + i4 - 1 - 1 + paramInt17, i14, i14, 0.0D, 2.0D * d3, i34, paramArrayOfDouble8, i43 - 1 + paramInt17, paramArrayOfDouble5, i43 - 1 + paramInt10, paramArrayOfDouble4, i43 - 1 + paramInt9, paramArrayOfDouble8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramDouble3, d18, i21, localintW1);
                          if ((localintW1.val == 0 ? 0 : 1) != 0)
                          {
                            paramintW.val = -3;
                            return;
                          }
                          d9 = paramArrayOfDouble8[(i45 - 1 + paramInt17)];
                          paramArrayOfInt5[(i10 + i45 - 1 + paramInt18)] = 0;
                        }
                        dlar1v_adapter(i13, 1, i13, d9, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble2, i4 - 1 + paramInt3, paramArrayOfDouble8, i15 + i4 - 1 - 1 + paramInt17, paramArrayOfDouble8, i16 + i4 - 1 - 1 + paramInt17, paramDouble3, d6, paramArrayOfDouble7, i4 - 1 + (i45 - 1) * paramInt15 + paramInt14, n ^ 0x1, localintW2, localdoubleW6, localdoubleW1, paramArrayOfInt5, i10 + i45 - 1 + paramInt18, paramArrayOfInt4, 2 * i45 - 1 - 1 + paramInt16, localdoubleW2, localdoubleW3, localdoubleW4, paramArrayOfDouble8, i17 - 1 + paramInt17);
                        if ((i20 != 0 ? 0 : 1) != 0)
                        {
                          d1 = localdoubleW3.val;
                          d2 = d9;
                        }
                        else if ((localdoubleW3.val >= d1 ? 0 : 1) != 0)
                        {
                          d1 = localdoubleW3.val;
                          d2 = d9;
                        }
                        i18 = Math.min(i18, paramArrayOfInt4[(2 * i45 - 1 - 1 + paramInt16)]);
                        i19 = Math.max(i19, paramArrayOfInt4[(2 * i45 - 1 + paramInt16)]);
                        i20 += 1;
                        if ((localdoubleW3.val <= d21 * d5 ? 0 : 1) != 0) {}
                        if (((Math.abs(localdoubleW4.val) <= d14 * Math.abs(d9) ? 0 : 1) != 0 ? 1 : 0) != 0) {}
                        if (((n ^ 0x1) != 0 ? 1 : 0) == 0) {
                          break label4231;
                        }
                        if ((i14 > localintW2.val ? 0 : 1) != 0) {
                          d16 = -1.0D;
                        } else {
                          d16 = 1.0D;
                        }
                        if ((localdoubleW4.val * d16 < 0.0D ? 0 : 1) != 0) {}
                        if (((d9 + localdoubleW4.val > d13 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
                        if (((d9 + localdoubleW4.val < d10 ? 0 : 1) != 0 ? 1 : 0) != 0)
                        {
                          i1 = 1;
                          if ((d16 != 1.0D ? 0 : 1) != 0) {
                            d10 = d9;
                          } else {
                            d13 = d9;
                          }
                          paramArrayOfDouble8[(i45 - 1 + paramInt17)] = (0.5D * (d13 + d10));
                          d9 += localdoubleW4.val;
                          paramArrayOfDouble4[(i45 - 1 + paramInt9)] = (0.5D * (d13 - d10));
                        }
                        else
                        {
                          j = 1;
                        }
                        if ((d13 - d10 >= d14 * Math.abs(d9) ? 0 : 1) != 0)
                        {
                          n = 1;
                        }
                        else if ((i20 >= 10 ? 0 : 1) != 0) {}else
                        {
                          if ((i20 != 10 ? 0 : 1) == 0) {
                            break;
                          }
                          j = 1;
                        }
                      }
                      paramintW.val = 5;
                      return;
                      k = 0;
                      if (((i1 != 0) && (n != 0) ? 1 : 0) != 0) {}
                      if (((d1 > localdoubleW3.val ? 0 : 1) != 0 ? 1 : 0) != 0)
                      {
                        d9 = d2;
                        k = 1;
                      }
                      if (k != 0) {
                        dlar1v_adapter(i13, 1, i13, d9, paramArrayOfDouble1, i4 - 1 + paramInt2, paramArrayOfDouble2, i4 - 1 + paramInt3, paramArrayOfDouble8, i15 + i4 - 1 - 1 + paramInt17, paramArrayOfDouble8, i16 + i4 - 1 - 1 + paramInt17, paramDouble3, d6, paramArrayOfDouble7, i4 - 1 + (i45 - 1) * paramInt15 + paramInt14, n ^ 0x1, localintW2, localdoubleW6, localdoubleW1, paramArrayOfInt5, i10 + i45 - 1 + paramInt18, paramArrayOfInt4, 2 * i45 - 1 - 1 + paramInt16, localdoubleW2, localdoubleW3, localdoubleW4, paramArrayOfDouble8, i17 - 1 + paramInt17);
                      }
                      paramArrayOfDouble8[(i45 - 1 + paramInt17)] = d9;
                      paramArrayOfInt4[(2 * i45 - 1 - 1 + paramInt16)] += i37;
                      paramArrayOfInt4[(2 * i45 - 1 + paramInt16)] += i37;
                      i48 = paramArrayOfInt4[(2 * i45 - 1 - 1 + paramInt16)];
                      i49 = paramArrayOfInt4[(2 * i45 - 1 + paramInt16)];
                      i18 += i37;
                      i19 += i37;
                      if ((i18 >= i48 ? 0 : 1) != 0)
                      {
                        i7 = i18;
                        i56 = i48 - 1 - i18 + 1;
                        while (i56 > 0)
                        {
                          paramArrayOfDouble7[(i7 - 1 + (i45 - 1) * paramInt15 + paramInt14)] = 0.0D;
                          i7 += 1;
                          ???--;
                        }
                      }
                      if ((i19 <= i49 ? 0 : 1) != 0)
                      {
                        i7 = i49 + 1;
                        i56 = i19 - (i49 + 1) + 1;
                        while (i56 > 0)
                        {
                          paramArrayOfDouble7[(i7 - 1 + (i45 - 1) * paramInt15 + paramInt14)] = 0.0D;
                          i7 += 1;
                          ???--;
                        }
                      }
                      Dscal.dscal(i49 - i48 + 1, localdoubleW2.val, paramArrayOfDouble7, i48 - 1 + (i45 - 1) * paramInt15 + paramInt14, 1);
                    }
                    paramArrayOfDouble3[(i45 - 1 + paramInt8)] = (d9 + d17);
                    if ((i ^ 0x1) != 0)
                    {
                      if ((i24 <= 1 ? 0 : 1) != 0) {
                        paramArrayOfDouble5[(i46 - 1 + paramInt10)] = Math.max(paramArrayOfDouble5[(i46 - 1 + paramInt10)], paramArrayOfDouble3[(i45 - 1 + paramInt8)] - paramArrayOfDouble4[(i45 - 1 + paramInt9)] - paramArrayOfDouble3[(i46 - 1 + paramInt8)] - paramArrayOfDouble4[(i46 - 1 + paramInt9)]);
                      }
                      if ((i45 >= i44 ? 0 : 1) != 0) {
                        paramArrayOfDouble5[(i45 - 1 + paramInt10)] = Math.max(d15, paramArrayOfDouble3[(i47 - 1 + paramInt8)] - paramArrayOfDouble4[(i47 - 1 + paramInt9)] - paramArrayOfDouble3[(i45 - 1 + paramInt8)] - paramArrayOfDouble4[(i45 - 1 + paramInt9)]);
                      }
                    }
                    i5 += 1;
                  }
                  i30 = i22 + 1;
                  i22 += 1;
                  ???--;
                }
                i3 += 1;
                ???--;
              }
              i28 += 1;
            }
            i4 = i6 + 1;
            i43 = i44 + 1;
          }
        }
      }
      i23 += 1;
      ???--;
    }
  }
  
  private static void dlar1v_adapter(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double paramDouble2, double paramDouble3, double[] paramArrayOfDouble5, int paramInt8, boolean paramBoolean, intW paramintW, doubleW paramdoubleW1, doubleW paramdoubleW2, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, double[] paramArrayOfDouble6, int paramInt11)
  {
    intW localintW = new intW(paramArrayOfInt1[paramInt9]);
    Dlar1v.dlar1v(paramInt1, paramInt2, paramInt3, paramDouble1, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramDouble2, paramDouble3, paramArrayOfDouble5, paramInt8, paramBoolean, paramintW, paramdoubleW1, paramdoubleW2, localintW, paramArrayOfInt2, paramInt10, paramdoubleW3, paramdoubleW4, paramdoubleW5, paramArrayOfDouble6, paramInt11);
    paramArrayOfInt1[paramInt9] = localintW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */