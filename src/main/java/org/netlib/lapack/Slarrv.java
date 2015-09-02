package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slarrv
{
  public static void slarrv(int paramInt1, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat3, int[] paramArrayOfInt1, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat4, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, int paramInt15, int[] paramArrayOfInt4, int paramInt16, float[] paramArrayOfFloat8, int paramInt17, int[] paramArrayOfInt5, int paramInt18, intW paramintW)
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
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f12 = 0.0F;
    float f13 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    float f20 = 0.0F;
    float f21 = 0.0F;
    floatW localfloatW6 = new floatW(0.0F);
    i15 = paramInt1 + 1;
    i16 = 2 * paramInt1 + 1;
    i17 = 3 * paramInt1 + 1;
    i26 = 12 * paramInt1;
    i3 = 1;
    int i53 = i26 - 1 + 1;
    while (i53 > 0)
    {
      paramArrayOfFloat8[(i3 - 1 + paramInt17)] = 0.0F;
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
    Slaset.slaset("Full", paramInt1, i52, 0.0F, 0.0F, paramArrayOfFloat7, 1 - 1 + (i50 - 1) * paramInt15 + paramInt14, paramInt15);
    f3 = Slamch.slamch("Precision");
    f14 = 2.0F * f3;
    m = 1;
    if ((paramInt6 != 1 ? 0 : 1) != 0) {}
    if (((paramInt7 != paramInt5 ? 0 : 1) != 0 ? 1 : 0) == 0)
    {
      paramfloatW1.val = (4.0F * f3);
      paramfloatW2.val = (4.0F * f3);
    }
    i2 = 0;
    i4 = 1;
    i43 = 1;
    i23 = 1;
    i53 = paramArrayOfInt2[(paramInt5 - 1 + paramInt11)] - 1 + 1;
    label4214:
    label4681:
    label4868:
    label4917:
    while (i53 > 0)
    {
      i6 = paramArrayOfInt1[(i23 - 1 + paramInt4)];
      f17 = paramArrayOfFloat2[(i6 - 1 + paramInt3)];
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
        break label4917;
      }
      else
      {
        if ((i44 >= paramInt6 ? 0 : 1) == 0) {}
        if (((i43 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i4 = i6 + 1;
          i43 = i44 + 1;
          break label4917;
        }
        else
        {
          f7 = paramArrayOfFloat6[(2 * i4 - 1 - 1 + paramInt13)];
          f8 = paramArrayOfFloat6[(2 * i4 - 1 + paramInt13)];
          i3 = i4 + 1;
          int i54 = i6 - (i4 + 1) + 1;
          while (i54 > 0)
          {
            f7 = Math.min(paramArrayOfFloat6[(2 * i3 - 1 - 1 + paramInt13)], f7);
            f8 = Math.max(paramArrayOfFloat6[(2 * i3 - 1 + paramInt13)], f8);
            i3 += 1;
            ???--;
          }
          f18 = f8 - f7;
          i37 = i4 - 1;
          i13 = i6 - i4 + 1;
          i12 = i44 - i43 + 1;
          if ((i4 != i6 ? 0 : 1) != 0)
          {
            i2 += 1;
            paramArrayOfFloat7[(i4 - 1 + (i43 - 1) * paramInt15 + paramInt14)] = 1.0F;
            paramArrayOfInt4[(2 * i43 - 1 - 1 + paramInt16)] = i4;
            paramArrayOfInt4[(2 * i43 - 1 + paramInt16)] = i4;
            paramArrayOfFloat3[(i43 - 1 + paramInt8)] += f17;
            paramArrayOfFloat8[(i43 - 1 + paramInt17)] = paramArrayOfFloat3[(i43 - 1 + paramInt8)];
            i4 = i6 + 1;
            i43 += 1;
          }
          else
          {
            Scopy.scopy(i12, paramArrayOfFloat3, i43 - 1 + paramInt8, 1, paramArrayOfFloat8, i43 - 1 + paramInt17, 1);
            i3 = 1;
            i54 = i12 - 1 + 1;
            while (i54 > 0)
            {
              paramArrayOfFloat3[(i43 + i3 - 1 - 1 + paramInt8)] += f17;
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
                  Scopy.scopy(i13, paramArrayOfFloat7, i4 - 1 + (i22 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat1, i4 - 1 + paramInt2, 1);
                  Scopy.scopy(i13 - 1, paramArrayOfFloat7, i4 - 1 + (i22 + 1 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat2, i4 - 1 + paramInt3, 1);
                  f17 = paramArrayOfFloat7[(i6 - 1 + (i22 + 1 - 1) * paramInt15 + paramInt14)];
                  Slaset.slaset("Full", i13, 2, 0.0F, 0.0F, paramArrayOfFloat7, i4 - 1 + (i22 - 1) * paramInt15 + paramInt14, paramInt15);
                }
                i22 = i4;
                int i55 = i6 - 1 - i4 + 1;
                while (i55 > 0)
                {
                  f20 = paramArrayOfFloat1[(i22 - 1 + paramInt2)] * paramArrayOfFloat2[(i22 - 1 + paramInt3)];
                  paramArrayOfFloat8[(i15 - 1 + i22 - 1 + paramInt17)] = f20;
                  paramArrayOfFloat8[(i16 - 1 + i22 - 1 + paramInt17)] = (f20 * paramArrayOfFloat2[(i22 - 1 + paramInt3)]);
                  i22 += 1;
                  ???--;
                }
                if ((i28 <= 0 ? 0 : 1) != 0)
                {
                  i40 = paramArrayOfInt3[(i43 - 1 + i36 - 1 + paramInt12)];
                  i42 = paramArrayOfInt3[(i43 - 1 + i38 - 1 + paramInt12)];
                  i34 = paramArrayOfInt3[(i43 - 1 + paramInt12)] - 1;
                  Slarrb.slarrb(i13, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat8, i16 + i4 - 1 - 1 + paramInt17, i40, i42, paramfloatW1.val, paramfloatW2.val, i34, paramArrayOfFloat8, i43 - 1 + paramInt17, paramArrayOfFloat5, i43 - 1 + paramInt10, paramArrayOfFloat4, i43 - 1 + paramInt9, paramArrayOfFloat8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramFloat3, f18, i13, localintW1);
                  if ((localintW1.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = -1;
                    return;
                  }
                  if ((i36 <= 1 ? 0 : 1) != 0) {
                    paramArrayOfFloat5[(i43 + i36 - 2 - 1 + paramInt10)] = Math.max(paramArrayOfFloat5[(i43 + i36 - 2 - 1 + paramInt10)], paramArrayOfFloat3[(i43 + i36 - 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i43 + i36 - 1 - 1 + paramInt9)] - paramArrayOfFloat3[(i43 + i36 - 2 - 1 + paramInt8)] - paramArrayOfFloat4[(i43 + i36 - 2 - 1 + paramInt9)]);
                  }
                  if ((i43 + i38 - 1 >= i44 ? 0 : 1) != 0) {
                    paramArrayOfFloat5[(i43 + i38 - 1 - 1 + paramInt10)] = Math.max(paramArrayOfFloat5[(i43 + i38 - 1 - 1 + paramInt10)], paramArrayOfFloat3[(i43 + i38 - 1 + paramInt8)] - paramArrayOfFloat4[(i43 + i38 - 1 + paramInt9)] - paramArrayOfFloat3[(i43 + i38 - 1 - 1 + paramInt8)] - paramArrayOfFloat4[(i43 + i38 - 1 - 1 + paramInt9)]);
                  }
                  i22 = i36;
                  i55 = i38 - i36 + 1;
                  while (i55 > 0)
                  {
                    paramArrayOfFloat8[(i43 + i22 - 1 - 1 + paramInt17)] += f17;
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
                  } else if ((paramArrayOfFloat5[(i43 + i22 - 1 - 1 + paramInt10)] < paramFloat4 * Math.abs(paramArrayOfFloat8[(i43 + i22 - 1 - 1 + paramInt17)]) ? 0 : 1) != 0) {
                    i32 = i22;
                  } else {
                    break label4868;
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
                      f11 = Math.max(0.0F, paramArrayOfFloat3[(i43 - 1 + paramInt8)] - paramArrayOfFloat4[(i43 - 1 + paramInt9)] - paramFloat1);
                    } else {
                      f11 = paramArrayOfFloat5[(i43 + i30 - 2 - 1 + paramInt10)];
                    }
                    f12 = paramArrayOfFloat5[(i43 + i32 - 1 - 1 + paramInt10)];
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
                      Slarrb.slarrb(i13, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat8, i16 + i4 - 1 - 1 + paramInt17, i40, i40, f14, f14, i34, paramArrayOfFloat8, i43 - 1 + paramInt17, paramArrayOfFloat5, i43 - 1 + paramInt10, paramArrayOfFloat4, i43 - 1 + paramInt9, paramArrayOfFloat8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramFloat3, f18, i13, localintW1);
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
                      Slarrf.slarrf(i13, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat2, i4 - 1 + paramInt3, paramArrayOfFloat8, i15 + i4 - 1 - 1 + paramInt17, i30, i32, paramArrayOfFloat8, i43 - 1 + paramInt17, paramArrayOfFloat5, i43 - 1 + paramInt10, paramArrayOfFloat4, i43 - 1 + paramInt9, f18, f11, f12, paramFloat3, localfloatW5, paramArrayOfFloat7, i4 - 1 + (i31 - 1) * paramInt15 + paramInt14, paramArrayOfFloat7, i4 - 1 + (i31 + 1 - 1) * paramInt15 + paramInt14, paramArrayOfFloat8, i17 - 1 + paramInt17, localintW1);
                      if ((localintW1.val != 0 ? 0 : 1) != 0)
                      {
                        f19 = f17 + localfloatW5.val;
                        paramArrayOfFloat7[(i6 - 1 + (i31 + 1 - 1) * paramInt15 + paramInt14)] = f19;
                        i24 = i30;
                        i56 = i32 - i30 + 1;
                        while (i56 > 0)
                        {
                          f4 = 3.0F * f3 * Math.abs(paramArrayOfFloat8[(i43 + i24 - 1 - 1 + paramInt17)]);
                          paramArrayOfFloat8[(i43 + i24 - 1 - 1 + paramInt17)] -= localfloatW5.val;
                          f4 += 4.0F * f3 * Math.abs(paramArrayOfFloat8[(i43 + i24 - 1 - 1 + paramInt17)]);
                          paramArrayOfFloat4[(i43 + i24 - 1 - 1 + paramInt9)] += f4;
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
                    f21 = 4.0F * (float)Math.log(i13) * f3;
                    i24 = i30;
                    i45 = i43 + i24 - 1;
                    i46 = Math.max(i45 - 1, 1);
                    i47 = Math.min(i45 + 1, paramInt5);
                    f9 = paramArrayOfFloat8[(i45 - 1 + paramInt17)];
                    i2 += 1;
                    if ((i45 >= paramInt6 ? 0 : 1) == 0) {}
                    if (((i45 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
                    {
                      i = 1;
                      break label4681;
                    }
                    else
                    {
                      i = 0;
                      f10 = paramArrayOfFloat8[(i45 - 1 + paramInt17)] - paramArrayOfFloat4[(i45 - 1 + paramInt9)];
                      f13 = paramArrayOfFloat8[(i45 - 1 + paramInt17)] + paramArrayOfFloat4[(i45 - 1 + paramInt9)];
                      i14 = paramArrayOfInt3[(i45 - 1 + paramInt12)];
                      if ((i24 != 1 ? 0 : 1) != 0) {
                        f11 = f3 * Math.max(Math.abs(f10), Math.abs(f13));
                      } else {
                        f11 = paramArrayOfFloat5[(i46 - 1 + paramInt10)];
                      }
                      if ((i24 != i12 ? 0 : 1) != 0) {
                        f12 = f3 * Math.max(Math.abs(f10), Math.abs(f13));
                      } else {
                        f12 = paramArrayOfFloat5[(i45 - 1 + paramInt10)];
                      }
                      f5 = Math.min(f11, f12);
                      if ((i24 != 1 ? 0 : 1) == 0) {}
                      if (((i24 != i12 ? 0 : 1) == 0 ? 0 : 1) != 0) {
                        f6 = 0.0F;
                      } else {
                        f6 = f5 * f3;
                      }
                      i18 = i13;
                      i19 = 1;
                      f15 = paramArrayOfFloat5[(i45 - 1 + paramInt10)];
                      paramArrayOfFloat5[(i45 - 1 + paramInt10)] = f5;
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
                          Slarrb.slarrb(i13, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat8, i16 + i4 - 1 - 1 + paramInt17, i14, i14, 0.0F, 2.0F * f3, i34, paramArrayOfFloat8, i43 - 1 + paramInt17, paramArrayOfFloat5, i43 - 1 + paramInt10, paramArrayOfFloat4, i43 - 1 + paramInt9, paramArrayOfFloat8, i17 - 1 + paramInt17, paramArrayOfInt5, i11 - 1 + paramInt18, paramFloat3, f18, i21, localintW1);
                          if ((localintW1.val == 0 ? 0 : 1) != 0)
                          {
                            paramintW.val = -3;
                            return;
                          }
                          f9 = paramArrayOfFloat8[(i45 - 1 + paramInt17)];
                          paramArrayOfInt5[(i10 + i45 - 1 + paramInt18)] = 0;
                        }
                        slar1v_adapter(i13, 1, i13, f9, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat2, i4 - 1 + paramInt3, paramArrayOfFloat8, i15 + i4 - 1 - 1 + paramInt17, paramArrayOfFloat8, i16 + i4 - 1 - 1 + paramInt17, paramFloat3, f6, paramArrayOfFloat7, i4 - 1 + (i45 - 1) * paramInt15 + paramInt14, n ^ 0x1, localintW2, localfloatW6, localfloatW1, paramArrayOfInt5, i10 + i45 - 1 + paramInt18, paramArrayOfInt4, 2 * i45 - 1 - 1 + paramInt16, localfloatW2, localfloatW3, localfloatW4, paramArrayOfFloat8, i17 - 1 + paramInt17);
                        if ((i20 != 0 ? 0 : 1) != 0)
                        {
                          f1 = localfloatW3.val;
                          f2 = f9;
                        }
                        else if ((localfloatW3.val >= f1 ? 0 : 1) != 0)
                        {
                          f1 = localfloatW3.val;
                          f2 = f9;
                        }
                        i18 = Math.min(i18, paramArrayOfInt4[(2 * i45 - 1 - 1 + paramInt16)]);
                        i19 = Math.max(i19, paramArrayOfInt4[(2 * i45 - 1 + paramInt16)]);
                        i20 += 1;
                        if ((localfloatW3.val <= f21 * f5 ? 0 : 1) != 0) {}
                        if (((Math.abs(localfloatW4.val) <= f14 * Math.abs(f9) ? 0 : 1) != 0 ? 1 : 0) != 0) {}
                        if (((n ^ 0x1) != 0 ? 1 : 0) == 0) {
                          break label4214;
                        }
                        if ((i14 > localintW2.val ? 0 : 1) != 0) {
                          f16 = -1.0F;
                        } else {
                          f16 = 1.0F;
                        }
                        if ((localfloatW4.val * f16 < 0.0F ? 0 : 1) != 0) {}
                        if (((f9 + localfloatW4.val > f13 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
                        if (((f9 + localfloatW4.val < f10 ? 0 : 1) != 0 ? 1 : 0) != 0)
                        {
                          i1 = 1;
                          if ((f16 != 1.0F ? 0 : 1) != 0) {
                            f10 = f9;
                          } else {
                            f13 = f9;
                          }
                          paramArrayOfFloat8[(i45 - 1 + paramInt17)] = (0.5F * (f13 + f10));
                          f9 += localfloatW4.val;
                          paramArrayOfFloat4[(i45 - 1 + paramInt9)] = (0.5F * (f13 - f10));
                        }
                        else
                        {
                          j = 1;
                        }
                        if ((f13 - f10 >= f14 * Math.abs(f9) ? 0 : 1) != 0)
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
                      if (((f1 > localfloatW3.val ? 0 : 1) != 0 ? 1 : 0) != 0)
                      {
                        f9 = f2;
                        k = 1;
                      }
                      if (k != 0) {
                        slar1v_adapter(i13, 1, i13, f9, paramArrayOfFloat1, i4 - 1 + paramInt2, paramArrayOfFloat2, i4 - 1 + paramInt3, paramArrayOfFloat8, i15 + i4 - 1 - 1 + paramInt17, paramArrayOfFloat8, i16 + i4 - 1 - 1 + paramInt17, paramFloat3, f6, paramArrayOfFloat7, i4 - 1 + (i45 - 1) * paramInt15 + paramInt14, n ^ 0x1, localintW2, localfloatW6, localfloatW1, paramArrayOfInt5, i10 + i45 - 1 + paramInt18, paramArrayOfInt4, 2 * i45 - 1 - 1 + paramInt16, localfloatW2, localfloatW3, localfloatW4, paramArrayOfFloat8, i17 - 1 + paramInt17);
                      }
                      paramArrayOfFloat8[(i45 - 1 + paramInt17)] = f9;
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
                          paramArrayOfFloat7[(i7 - 1 + (i45 - 1) * paramInt15 + paramInt14)] = 0.0F;
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
                          paramArrayOfFloat7[(i7 - 1 + (i45 - 1) * paramInt15 + paramInt14)] = 0.0F;
                          i7 += 1;
                          ???--;
                        }
                      }
                      Sscal.sscal(i49 - i48 + 1, localfloatW2.val, paramArrayOfFloat7, i48 - 1 + (i45 - 1) * paramInt15 + paramInt14, 1);
                    }
                    paramArrayOfFloat3[(i45 - 1 + paramInt8)] = (f9 + f17);
                    if ((i ^ 0x1) != 0)
                    {
                      if ((i24 <= 1 ? 0 : 1) != 0) {
                        paramArrayOfFloat5[(i46 - 1 + paramInt10)] = Math.max(paramArrayOfFloat5[(i46 - 1 + paramInt10)], paramArrayOfFloat3[(i45 - 1 + paramInt8)] - paramArrayOfFloat4[(i45 - 1 + paramInt9)] - paramArrayOfFloat3[(i46 - 1 + paramInt8)] - paramArrayOfFloat4[(i46 - 1 + paramInt9)]);
                      }
                      if ((i45 >= i44 ? 0 : 1) != 0) {
                        paramArrayOfFloat5[(i45 - 1 + paramInt10)] = Math.max(f15, paramArrayOfFloat3[(i47 - 1 + paramInt8)] - paramArrayOfFloat4[(i47 - 1 + paramInt9)] - paramArrayOfFloat3[(i45 - 1 + paramInt8)] - paramArrayOfFloat4[(i45 - 1 + paramInt9)]);
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
  
  private static void slar1v_adapter(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat5, int paramInt8, boolean paramBoolean, intW paramintW, floatW paramfloatW1, floatW paramfloatW2, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, float[] paramArrayOfFloat6, int paramInt11)
  {
    intW localintW = new intW(paramArrayOfInt1[paramInt9]);
    Slar1v.slar1v(paramInt1, paramInt2, paramInt3, paramFloat1, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramFloat2, paramFloat3, paramArrayOfFloat5, paramInt8, paramBoolean, paramintW, paramfloatW1, paramfloatW2, localintW, paramArrayOfInt2, paramInt10, paramfloatW3, paramfloatW4, paramfloatW5, paramArrayOfFloat6, paramInt11);
    paramArrayOfInt1[paramInt9] = localintW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */