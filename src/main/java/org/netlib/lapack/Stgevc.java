package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgevc
{
  public static void stgevc(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, int paramInt11, intW paramintW1, float[] paramArrayOfFloat5, int paramInt12, intW paramintW2)
  {
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
    intW localintW = new intW(0);
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
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    float f17 = 0.0F;
    float f18 = 0.0F;
    floatW localfloatW6 = new floatW(0.0F);
    float f19 = 0.0F;
    floatW localfloatW7 = new floatW(0.0F);
    floatW localfloatW8 = new floatW(0.0F);
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2 * 2];
    float[] arrayOfFloat3 = new float[2 * 2];
    float[] arrayOfFloat4 = new float[2 * 2];
    if (Lsame.lsame(paramString2, "A"))
    {
      i11 = 1;
      n = 1;
      i1 = 0;
    }
    else if (Lsame.lsame(paramString2, "S"))
    {
      i11 = 2;
      n = 0;
      i1 = 0;
    }
    else if (Lsame.lsame(paramString2, "B"))
    {
      i11 = 3;
      n = 1;
      i1 = 1;
    }
    else
    {
      i11 = -1;
      n = 1;
    }
    if (Lsame.lsame(paramString1, "R"))
    {
      i13 = 1;
      i = 0;
      j = 1;
    }
    else if (Lsame.lsame(paramString1, "L"))
    {
      i13 = 2;
      i = 1;
      j = 0;
    }
    else if (Lsame.lsame(paramString1, "B"))
    {
      i13 = 3;
      i = 1;
      j = 1;
    }
    else
    {
      i13 = -1;
    }
    paramintW2.val = 0;
    if ((i13 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((i11 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -4;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -6;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -8;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGEVC", -paramintW2.val);
      return;
    }
    if ((n ^ 0x1) != 0)
    {
      i12 = 0;
      i4 = 0;
      i14 = 1;
      for (i22 = paramInt2 - 1 + 1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          if ((i14 >= paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0) {
              i4 = 1;
            }
          }
          if (i4 != 0)
          {
            if (((paramArrayOfBoolean[(i14 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i14 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
              i12 += 2;
            }
          }
          else if (paramArrayOfBoolean[(i14 - 1 + paramInt1)] != 0) {
            i12 += 1;
          }
        }
        i14 += 1;
      }
    }
    else
    {
      i12 = paramInt2;
    }
    m = 0;
    i2 = 0;
    i14 = 1;
    for (int i22 = paramInt2 - 1 - 1 + 1; i22 > 0; i22--)
    {
      if ((paramArrayOfFloat1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
      {
        if ((paramArrayOfFloat2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)] != 0.0F ? 0 : 1) == 0) {}
        if (((paramArrayOfFloat2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)] != 0.0F ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((paramArrayOfFloat2[(i14 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i2 = 1;
        }
        if ((i14 >= paramInt2 - 1 ? 0 : 1) != 0) {
          if ((paramArrayOfFloat1[(i14 + 2 - 1 + (i14 + 1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0) {
            m = 1;
          }
        }
      }
      i14 += 1;
    }
    if (m != 0)
    {
      paramintW2.val = -5;
    }
    else if (i2 != 0)
    {
      paramintW2.val = -7;
    }
    else
    {
      if (i != 0) {}
      if (((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      if (((paramInt8 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -10;
      }
      else
      {
        if (j != 0) {}
        if (((paramInt10 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((paramInt10 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW2.val = -12;
        } else if ((paramInt11 >= i12 ? 0 : 1) != 0) {
          paramintW2.val = -13;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGEVC", -paramintW2.val);
      return;
    }
    paramintW1.val = i12;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    localfloatW5.val = Slamch.slamch("Safe minimum");
    localfloatW4.val = (1.0F / localfloatW5.val);
    Slabad.slabad(localfloatW5, localfloatW4);
    f22 = Slamch.slamch("Epsilon") * Slamch.slamch("Base");
    f19 = localfloatW5.val * paramInt2 / f22;
    localfloatW4.val = (1.0F / f19);
    f5 = 1.0F / (localfloatW5.val * paramInt2);
    f2 = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    if ((paramInt2 <= 1 ? 0 : 1) != 0) {
      f2 += Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    }
    f6 = Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
    paramArrayOfFloat5[(1 - 1 + paramInt12)] = 0.0F;
    paramArrayOfFloat5[(paramInt2 + 1 - 1 + paramInt12)] = 0.0F;
    i14 = 2;
    int i23;
    for (i22 = paramInt2 - 2 + 1; i22 > 0; i22--)
    {
      localfloatW7.val = 0.0F;
      localfloatW8.val = 0.0F;
      if ((paramArrayOfFloat1[(i14 - 1 + (i14 - 1 - 1) * paramInt4 + paramInt3)] != 0.0F ? 0 : 1) != 0) {
        i10 = i14 - 1;
      } else {
        i10 = i14 - 2;
      }
      i7 = 1;
      for (i23 = i10 - 1 + 1; i23 > 0; i23--)
      {
        localfloatW7.val += Math.abs(paramArrayOfFloat1[(i7 - 1 + (i14 - 1) * paramInt4 + paramInt3)]);
        localfloatW8.val += Math.abs(paramArrayOfFloat2[(i7 - 1 + (i14 - 1) * paramInt6 + paramInt5)]);
        i7 += 1;
      }
      paramArrayOfFloat5[(i14 - 1 + paramInt12)] = localfloatW7.val;
      paramArrayOfFloat5[(paramInt2 + i14 - 1 + paramInt12)] = localfloatW8.val;
      i7 = i10 + 1;
      for (i23 = Math.min(i14 + 1, paramInt2) - (i10 + 1) + 1; i23 > 0; i23--)
      {
        localfloatW7.val += Math.abs(paramArrayOfFloat1[(i7 - 1 + (i14 - 1) * paramInt4 + paramInt3)]);
        localfloatW8.val += Math.abs(paramArrayOfFloat2[(i7 - 1 + (i14 - 1) * paramInt6 + paramInt5)]);
        i7 += 1;
      }
      f2 = Math.max(f2, localfloatW7.val);
      f6 = Math.max(f6, localfloatW8.val);
      i14 += 1;
    }
    f3 = 1.0F / Math.max(f2, localfloatW5.val);
    f7 = 1.0F / Math.max(f6, localfloatW5.val);
    int i24;
    int i25;
    if (i != 0)
    {
      i9 = 0;
      i4 = 0;
      i17 = 1;
      for (i22 = paramInt2 - 1 + 1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          i21 = 1;
          if ((i17 >= paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i17 + 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
            {
              i4 = 1;
              i21 = 2;
            }
          }
          if (n != 0) {
            i3 = 1;
          } else if (i4 != 0) {
            i3 = (paramArrayOfBoolean[(i17 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i17 + 1 - 1 + paramInt1)] == 0) ? 0 : 1;
          } else {
            i3 = paramArrayOfBoolean[(i17 - 1 + paramInt1)];
          }
          if ((i3 ^ 0x1) == 0)
          {
            if ((i4 ^ 0x1) != 0)
            {
              if ((Math.abs(paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) > localfloatW5.val ? 0 : 1) != 0) {}
              if (((Math.abs(paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) > localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i9 += 1;
                i18 = 1;
                for (i23 = paramInt2 - 1 + 1; i23 > 0; i23--)
                {
                  paramArrayOfFloat3[(i18 - 1 + (i9 - 1) * paramInt8 + paramInt7)] = 0.0F;
                  i18 += 1;
                }
                paramArrayOfFloat3[(i9 - 1 + (i9 - 1) * paramInt8 + paramInt7)] = 1.0F;
                break label5277;
              }
            }
            i18 = 1;
            for (i23 = i21 * paramInt2 - 1 + 1; i23 > 0; i23--)
            {
              paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] = 0.0F;
              i18 += 1;
            }
            if ((i4 ^ 0x1) != 0)
            {
              localfloatW7.val = (1.0F / Util.max(Math.abs(paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) * f3, Math.abs(paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) * f7, localfloatW5.val));
              f17 = localfloatW7.val * paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] * f3;
              f18 = localfloatW7.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)] * f7;
              localfloatW1.val = (f18 * f3);
              localfloatW3.val = (f17 * f7);
              localfloatW2.val = 0.0F;
              localfloatW6.val = 1.0F;
              if ((Math.abs(f18) < localfloatW5.val ? 0 : 1) != 0) {}
              i5 = (Math.abs(localfloatW1.val) >= f19 ? 0 : 1) != 0 ? 1 : 0;
              if ((Math.abs(f17) < localfloatW5.val ? 0 : 1) != 0) {}
              i6 = (Math.abs(localfloatW3.val) >= f19 ? 0 : 1) != 0 ? 1 : 0;
              if (i5 != 0) {
                localfloatW6.val = (f19 / Math.abs(f18) * Math.min(f2, localfloatW4.val));
              }
              if (i6 != 0) {
                localfloatW6.val = Math.max(localfloatW6.val, f19 / Math.abs(f17) * Math.min(f6, localfloatW4.val));
              }
              if (((i5 == 0) && (i6 == 0) ? 0 : 1) != 0)
              {
                localfloatW6.val = Math.min(localfloatW6.val, 1.0F / (localfloatW5.val * Util.max(1.0F, Math.abs(localfloatW1.val), Math.abs(localfloatW3.val))));
                if (i5 != 0) {
                  localfloatW1.val = (f3 * (localfloatW6.val * f18));
                } else {
                  localfloatW6.val *= localfloatW1.val;
                }
                if (i6 != 0) {
                  localfloatW3.val = (f7 * (localfloatW6.val * f17));
                } else {
                  localfloatW6.val *= localfloatW3.val;
                }
              }
              f1 = Math.abs(localfloatW1.val);
              f4 = Math.abs(localfloatW3.val);
              paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0F;
              f23 = 1.0F;
            }
            else
            {
              Slag2.slag2(paramArrayOfFloat1, i17 - 1 + (i17 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i17 - 1 + (i17 - 1) * paramInt6 + paramInt5, paramInt6, localfloatW5.val * 100.0F, localfloatW1, localfloatW7, localfloatW3, localfloatW8, localfloatW2);
              localfloatW2.val = (-localfloatW2.val);
              if ((localfloatW2.val != 0.0F ? 0 : 1) != 0)
              {
                paramintW2.val = i17;
                return;
              }
              f1 = Math.abs(localfloatW1.val);
              f4 = Math.abs(localfloatW3.val) + Math.abs(localfloatW2.val);
              localfloatW6.val = 1.0F;
              if ((f1 * f22 >= localfloatW5.val ? 0 : 1) != 0) {}
              if (((f1 < localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localfloatW6.val = (localfloatW5.val / f22 / f1);
              }
              if ((f4 * f22 >= localfloatW5.val ? 0 : 1) != 0) {}
              if (((f4 < localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localfloatW6.val = Math.max(localfloatW6.val, localfloatW5.val / f22 / f4);
              }
              if ((localfloatW5.val * f1 <= f3 ? 0 : 1) != 0) {
                localfloatW6.val = (f3 / (localfloatW5.val * f1));
              }
              if ((localfloatW5.val * f4 <= f7 ? 0 : 1) != 0) {
                localfloatW6.val = Math.min(localfloatW6.val, f7 / (localfloatW5.val * f4));
              }
              if ((localfloatW6.val == 1.0F ? 0 : 1) != 0)
              {
                localfloatW6.val *= localfloatW1.val;
                f1 = Math.abs(localfloatW1.val);
                localfloatW6.val *= localfloatW3.val;
                localfloatW6.val *= localfloatW2.val;
                f4 = Math.abs(localfloatW3.val) + Math.abs(localfloatW2.val);
              }
              localfloatW1.val *= paramArrayOfFloat1[(i17 + 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)];
              f21 = localfloatW1.val * paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] - localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)];
              f20 = -(localfloatW2.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
              if ((Math.abs(localfloatW7.val) <= Math.abs(f21) + Math.abs(f20) ? 0 : 1) != 0)
              {
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0F;
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)] = 0.0F;
                paramArrayOfFloat5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)] = (-(f21 / localfloatW7.val));
                paramArrayOfFloat5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)] = (-(f20 / localfloatW7.val));
              }
              else
              {
                paramArrayOfFloat5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)] = 1.0F;
                paramArrayOfFloat5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)] = 0.0F;
                localfloatW1.val *= paramArrayOfFloat1[(i17 - 1 + (i17 + 1 - 1) * paramInt4 + paramInt3)];
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = ((localfloatW3.val * paramArrayOfFloat2[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt6 + paramInt5)] - localfloatW1.val * paramArrayOfFloat1[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt4 + paramInt3)]) / localfloatW7.val);
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)] = (localfloatW2.val * paramArrayOfFloat2[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt6 + paramInt5)] / localfloatW7.val);
              }
              f23 = Math.max(Math.abs(paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)]) + Math.abs(paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)]), Math.abs(paramArrayOfFloat5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)]) + Math.abs(paramArrayOfFloat5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)]));
            }
            f16 = Util.max(f22 * f1 * f2, f22 * f4 * f6, localfloatW5.val);
            k = 0;
            i14 = i17 + i21;
            for (i23 = paramInt2 - (i17 + i21) + 1; i23 > 0; i23--)
            {
              if (k != 0)
              {
                k = 0;
              }
              else
              {
                i20 = 1;
                arrayOfFloat1[(1 - 1)] = paramArrayOfFloat2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)];
                if ((i14 >= paramInt2 ? 0 : 1) != 0) {
                  if ((paramArrayOfFloat1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
                  {
                    k = 1;
                    arrayOfFloat1[(2 - 1)] = paramArrayOfFloat2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)];
                    i20 = 2;
                  }
                }
                f24 = 1.0F / Math.max(1.0F, f23);
                localfloatW7.val = Util.max(paramArrayOfFloat5[(i14 - 1 + paramInt12)], paramArrayOfFloat5[(paramInt2 + i14 - 1 + paramInt12)], f1 * paramArrayOfFloat5[(i14 - 1 + paramInt12)] + f4 * paramArrayOfFloat5[(paramInt2 + i14 - 1 + paramInt12)]);
                if (k != 0) {
                  localfloatW7.val = Math.max(Util.max(localfloatW7.val, paramArrayOfFloat5[(i14 + 1 - 1 + paramInt12)], paramArrayOfFloat5[(paramInt2 + i14 + 1 - 1 + paramInt12)]), f1 * paramArrayOfFloat5[(i14 + 1 - 1 + paramInt12)] + f4 * paramArrayOfFloat5[(paramInt2 + i14 + 1 - 1 + paramInt12)]);
                }
                if ((localfloatW7.val <= f5 * f24 ? 0 : 1) != 0)
                {
                  i19 = 0;
                  for (i24 = i21 - 1 - 0 + 1; i24 > 0; i24--)
                  {
                    i18 = i17;
                    for (i25 = i14 - 1 - i17 + 1; i25 > 0; i25--)
                    {
                      paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (f24 * paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                    }
                    i19 += 1;
                  }
                  f23 *= f24;
                }
                i19 = 1;
                for (i24 = i21 - 1 + 1; i24 > 0; i24--)
                {
                  i15 = 1;
                  for (i25 = i20 - 1 + 1; i25 > 0; i25--)
                  {
                    arrayOfFloat3[(i15 - 1 + (i19 - 1) * 2)] = 0.0F;
                    arrayOfFloat4[(i15 - 1 + (i19 - 1) * 2)] = 0.0F;
                    i18 = i17;
                    for (int i26 = i14 - 1 - i17 + 1; i26 > 0; i26--)
                    {
                      arrayOfFloat3[(i15 - 1 + (i19 - 1) * 2)] += paramArrayOfFloat1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat5[((i19 + 1) * paramInt2 + i18 - 1 + paramInt12)];
                      arrayOfFloat4[(i15 - 1 + (i19 - 1) * 2)] += paramArrayOfFloat2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat5[((i19 + 1) * paramInt2 + i18 - 1 + paramInt12)];
                      i18 += 1;
                    }
                    i15 += 1;
                  }
                  i19 += 1;
                }
                i15 = 1;
                for (i24 = i20 - 1 + 1; i24 > 0; i24--)
                {
                  if (i4 != 0)
                  {
                    arrayOfFloat2[(i15 - 1 + (1 - 1) * 2)] = (-(localfloatW1.val * arrayOfFloat3[(i15 - 1 + (1 - 1) * 2)]) + localfloatW3.val * arrayOfFloat4[(i15 - 1 + (1 - 1) * 2)] - localfloatW2.val * arrayOfFloat4[(i15 - 1 + (2 - 1) * 2)]);
                    arrayOfFloat2[(i15 - 1 + (2 - 1) * 2)] = (-(localfloatW1.val * arrayOfFloat3[(i15 - 1 + (2 - 1) * 2)]) + localfloatW3.val * arrayOfFloat4[(i15 - 1 + (2 - 1) * 2)] + localfloatW2.val * arrayOfFloat4[(i15 - 1 + (1 - 1) * 2)]);
                  }
                  else
                  {
                    arrayOfFloat2[(i15 - 1 + (1 - 1) * 2)] = (-(localfloatW1.val * arrayOfFloat3[(i15 - 1 + (1 - 1) * 2)]) + localfloatW3.val * arrayOfFloat4[(i15 - 1 + (1 - 1) * 2)]);
                  }
                  i15 += 1;
                }
                Slaln2.slaln2(true, i20, i21, f16, localfloatW1.val, paramArrayOfFloat1, i14 - 1 + (i14 - 1) * paramInt4 + paramInt3, paramInt4, arrayOfFloat1[(1 - 1)], arrayOfFloat1[(2 - 1)], arrayOfFloat2, 0, 2, localfloatW3.val, localfloatW2.val, paramArrayOfFloat5, 2 * paramInt2 + i14 - 1 + paramInt12, paramInt2, localfloatW6, localfloatW7, localintW);
                if ((localfloatW6.val >= 1.0F ? 0 : 1) != 0)
                {
                  i19 = 0;
                  for (i24 = i21 - 1 - 0 + 1; i24 > 0; i24--)
                  {
                    i18 = i17;
                    for (i25 = i14 - 1 - i17 + 1; i25 > 0; i25--)
                    {
                      paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (localfloatW6.val * paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                    }
                    i19 += 1;
                  }
                  f23 = localfloatW6.val * f23;
                }
                f23 = Math.max(f23, localfloatW7.val);
              }
              i14 += 1;
            }
            i9 += 1;
            if (i1 != 0)
            {
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                Sgemv.sgemv("N", paramInt2, paramInt2 + 1 - i17, 1.0F, paramArrayOfFloat3, 1 - 1 + (i17 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat5, (i19 + 2) * paramInt2 + i17 - 1 + paramInt12, 1, 0.0F, paramArrayOfFloat5, (i19 + 4) * paramInt2 + 1 - 1 + paramInt12, 1);
                i19 += 1;
              }
              Slacpy.slacpy(" ", paramInt2, i21, paramArrayOfFloat5, 4 * paramInt2 + 1 - 1 + paramInt12, paramInt2, paramArrayOfFloat3, 1 - 1 + (i17 - 1) * paramInt8 + paramInt7, paramInt8);
              i8 = 1;
            }
            else
            {
              Slacpy.slacpy(" ", paramInt2, i21, paramArrayOfFloat5, 2 * paramInt2 + 1 - 1 + paramInt12, paramInt2, paramArrayOfFloat3, 1 - 1 + (i9 - 1) * paramInt8 + paramInt7, paramInt8);
              i8 = i17;
            }
            f23 = 0.0F;
            if (i4 != 0)
            {
              i14 = i8;
              for (i23 = paramInt2 - i8 + 1; i23 > 0; i23--)
              {
                f23 = Math.max(f23, Math.abs(paramArrayOfFloat3[(i14 - 1 + (i9 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat3[(i14 - 1 + (i9 + 1 - 1) * paramInt8 + paramInt7)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = i8;
              for (i23 = paramInt2 - i8 + 1; i23 > 0; i23--)
              {
                f23 = Math.max(f23, Math.abs(paramArrayOfFloat3[(i14 - 1 + (i9 - 1) * paramInt8 + paramInt7)]));
                i14 += 1;
              }
            }
            if ((f23 <= localfloatW5.val ? 0 : 1) != 0)
            {
              f24 = 1.0F / f23;
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                i18 = i8;
                for (i24 = paramInt2 - i8 + 1; i24 > 0; i24--)
                {
                  paramArrayOfFloat3[(i18 - 1 + (i9 + i19 - 1) * paramInt8 + paramInt7)] = (f24 * paramArrayOfFloat3[(i18 - 1 + (i9 + i19 - 1) * paramInt8 + paramInt7)]);
                  i18 += 1;
                }
                i19 += 1;
              }
            }
            i9 = i9 + i21 - 1;
          }
        }
        label5277:
        i17 += 1;
      }
    }
    if (j != 0)
    {
      i9 = i12 + 1;
      i4 = 0;
      i17 = paramInt2;
      for (i22 = (1 - paramInt2 + -1) / -1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          i21 = 1;
          if ((i17 <= 1 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i17 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
            {
              i4 = 1;
              i21 = 2;
            }
          }
          if (n != 0) {
            i3 = 1;
          } else if (i4 != 0) {
            i3 = (paramArrayOfBoolean[(i17 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i17 - 1 - 1 + paramInt1)] == 0) ? 0 : 1;
          } else {
            i3 = paramArrayOfBoolean[(i17 - 1 + paramInt1)];
          }
          if ((i3 ^ 0x1) == 0)
          {
            if ((i4 ^ 0x1) != 0)
            {
              if ((Math.abs(paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) > localfloatW5.val ? 0 : 1) != 0) {}
              if (((Math.abs(paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) > localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i9 -= 1;
                i18 = 1;
                for (i23 = paramInt2 - 1 + 1; i23 > 0; i23--)
                {
                  paramArrayOfFloat4[(i18 - 1 + (i9 - 1) * paramInt10 + paramInt9)] = 0.0F;
                  i18 += 1;
                }
                paramArrayOfFloat4[(i9 - 1 + (i9 - 1) * paramInt10 + paramInt9)] = 1.0F;
                break label9855;
              }
            }
            i19 = 0;
            for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
            {
              i18 = 1;
              for (i24 = paramInt2 - 1 + 1; i24 > 0; i24--)
              {
                paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = 0.0F;
                i18 += 1;
              }
              i19 += 1;
            }
            if ((i4 ^ 0x1) != 0)
            {
              localfloatW7.val = (1.0F / Util.max(Math.abs(paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) * f3, Math.abs(paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) * f7, localfloatW5.val));
              f17 = localfloatW7.val * paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] * f3;
              f18 = localfloatW7.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)] * f7;
              localfloatW1.val = (f18 * f3);
              localfloatW3.val = (f17 * f7);
              localfloatW2.val = 0.0F;
              localfloatW6.val = 1.0F;
              if ((Math.abs(f18) < localfloatW5.val ? 0 : 1) != 0) {}
              i5 = (Math.abs(localfloatW1.val) >= f19 ? 0 : 1) != 0 ? 1 : 0;
              if ((Math.abs(f17) < localfloatW5.val ? 0 : 1) != 0) {}
              i6 = (Math.abs(localfloatW3.val) >= f19 ? 0 : 1) != 0 ? 1 : 0;
              if (i5 != 0) {
                localfloatW6.val = (f19 / Math.abs(f18) * Math.min(f2, localfloatW4.val));
              }
              if (i6 != 0) {
                localfloatW6.val = Math.max(localfloatW6.val, f19 / Math.abs(f17) * Math.min(f6, localfloatW4.val));
              }
              if (((i5 == 0) && (i6 == 0) ? 0 : 1) != 0)
              {
                localfloatW6.val = Math.min(localfloatW6.val, 1.0F / (localfloatW5.val * Util.max(1.0F, Math.abs(localfloatW1.val), Math.abs(localfloatW3.val))));
                if (i5 != 0) {
                  localfloatW1.val = (f3 * (localfloatW6.val * f18));
                } else {
                  localfloatW6.val *= localfloatW1.val;
                }
                if (i6 != 0) {
                  localfloatW3.val = (f7 * (localfloatW6.val * f17));
                } else {
                  localfloatW6.val *= localfloatW3.val;
                }
              }
              f1 = Math.abs(localfloatW1.val);
              f4 = Math.abs(localfloatW3.val);
              paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0F;
              f23 = 1.0F;
              i18 = 1;
              for (i23 = i17 - 1 - 1 + 1; i23 > 0; i23--)
              {
                paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (localfloatW3.val * paramArrayOfFloat2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)] - localfloatW1.val * paramArrayOfFloat1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)]);
                i18 += 1;
              }
            }
            else
            {
              Slag2.slag2(paramArrayOfFloat1, i17 - 1 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5, paramInt6, localfloatW5.val * 100.0F, localfloatW1, localfloatW7, localfloatW3, localfloatW8, localfloatW2);
              if ((localfloatW2.val != 0.0F ? 0 : 1) != 0)
              {
                paramintW2.val = (i17 - 1);
                return;
              }
              f1 = Math.abs(localfloatW1.val);
              f4 = Math.abs(localfloatW3.val) + Math.abs(localfloatW2.val);
              localfloatW6.val = 1.0F;
              if ((f1 * f22 >= localfloatW5.val ? 0 : 1) != 0) {}
              if (((f1 < localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localfloatW6.val = (localfloatW5.val / f22 / f1);
              }
              if ((f4 * f22 >= localfloatW5.val ? 0 : 1) != 0) {}
              if (((f4 < localfloatW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localfloatW6.val = Math.max(localfloatW6.val, localfloatW5.val / f22 / f4);
              }
              if ((localfloatW5.val * f1 <= f3 ? 0 : 1) != 0) {
                localfloatW6.val = (f3 / (localfloatW5.val * f1));
              }
              if ((localfloatW5.val * f4 <= f7 ? 0 : 1) != 0) {
                localfloatW6.val = Math.min(localfloatW6.val, f7 / (localfloatW5.val * f4));
              }
              if ((localfloatW6.val == 1.0F ? 0 : 1) != 0)
              {
                localfloatW6.val *= localfloatW1.val;
                f1 = Math.abs(localfloatW1.val);
                localfloatW6.val *= localfloatW3.val;
                localfloatW6.val *= localfloatW2.val;
                f4 = Math.abs(localfloatW3.val) + Math.abs(localfloatW2.val);
              }
              localfloatW1.val *= paramArrayOfFloat1[(i17 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)];
              f21 = localfloatW1.val * paramArrayOfFloat1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] - localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)];
              f20 = -(localfloatW2.val * paramArrayOfFloat2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
              if ((Math.abs(localfloatW7.val) < Math.abs(f21) + Math.abs(f20) ? 0 : 1) != 0)
              {
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0F;
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)] = 0.0F;
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] = (-(f21 / localfloatW7.val));
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)] = (-(f20 / localfloatW7.val));
              }
              else
              {
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] = 1.0F;
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)] = 0.0F;
                localfloatW1.val *= paramArrayOfFloat1[(i17 - 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)];
                paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] = ((localfloatW3.val * paramArrayOfFloat2[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - localfloatW1.val * paramArrayOfFloat1[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) / localfloatW7.val);
                paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)] = (localfloatW2.val * paramArrayOfFloat2[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] / localfloatW7.val);
              }
              f23 = Math.max(Math.abs(paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)]) + Math.abs(paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)]), Math.abs(paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)]) + Math.abs(paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)]));
              f14 = localfloatW1.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              f10 = localfloatW1.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              f15 = localfloatW3.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] - localfloatW2.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              f11 = localfloatW2.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] + localfloatW3.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              f12 = localfloatW1.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)];
              f8 = localfloatW1.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              f13 = localfloatW3.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] - localfloatW2.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              f9 = localfloatW2.val * paramArrayOfFloat5[(2 * paramInt2 + i17 - 1 + paramInt12)] + localfloatW3.val * paramArrayOfFloat5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              i18 = 1;
              for (i23 = i17 - 2 - 1 + 1; i23 > 0; i23--)
              {
                paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (-(f14 * paramArrayOfFloat1[(i18 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) + f15 * paramArrayOfFloat2[(i18 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - f12 * paramArrayOfFloat1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)] + f13 * paramArrayOfFloat2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat5[(3 * paramInt2 + i18 - 1 + paramInt12)] = (-(f10 * paramArrayOfFloat1[(i18 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) + f11 * paramArrayOfFloat2[(i18 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - f8 * paramArrayOfFloat1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)] + f9 * paramArrayOfFloat2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
                i18 += 1;
              }
            }
            f16 = Util.max(f22 * f1 * f2, f22 * f4 * f6, localfloatW5.val);
            k = 0;
            i14 = i17 - i21;
            for (i23 = (1 - (i17 - i21) + -1) / -1; i23 > 0; i23--)
            {
              if ((k ^ 0x1) != 0) {}
              if (((i14 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                if ((paramArrayOfFloat1[(i14 - 1 + (i14 - 1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
                {
                  k = 1;
                  break label9108;
                }
              }
              arrayOfFloat1[(1 - 1)] = paramArrayOfFloat2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)];
              if (k != 0)
              {
                i20 = 2;
                arrayOfFloat1[(2 - 1)] = paramArrayOfFloat2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)];
              }
              else
              {
                i20 = 1;
              }
              Slaln2.slaln2(false, i20, i21, f16, localfloatW1.val, paramArrayOfFloat1, i14 - 1 + (i14 - 1) * paramInt4 + paramInt3, paramInt4, arrayOfFloat1[(1 - 1)], arrayOfFloat1[(2 - 1)], paramArrayOfFloat5, 2 * paramInt2 + i14 - 1 + paramInt12, paramInt2, localfloatW3.val, localfloatW2.val, arrayOfFloat2, 0, 2, localfloatW6, localfloatW7, localintW);
              if ((localfloatW6.val >= 1.0F ? 0 : 1) != 0)
              {
                i19 = 0;
                for (i24 = i21 - 1 - 0 + 1; i24 > 0; i24--)
                {
                  i18 = 1;
                  for (i25 = i17 - 1 + 1; i25 > 0; i25--)
                  {
                    paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (localfloatW6.val * paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                    i18 += 1;
                  }
                  i19 += 1;
                }
              }
              f23 = Math.max(localfloatW6.val * f23, localfloatW7.val);
              i19 = 1;
              for (i24 = i21 - 1 + 1; i24 > 0; i24--)
              {
                i15 = 1;
                for (i25 = i20 - 1 + 1; i25 > 0; i25--)
                {
                  paramArrayOfFloat5[((i19 + 1) * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] = arrayOfFloat2[(i15 - 1 + (i19 - 1) * 2)];
                  i15 += 1;
                }
                i19 += 1;
              }
              if ((i14 <= 1 ? 0 : 1) != 0)
              {
                f24 = 1.0F / Math.max(1.0F, f23);
                localfloatW7.val = (f1 * paramArrayOfFloat5[(i14 - 1 + paramInt12)] + f4 * paramArrayOfFloat5[(paramInt2 + i14 - 1 + paramInt12)]);
                if (k != 0) {
                  localfloatW7.val = Math.max(localfloatW7.val, f1 * paramArrayOfFloat5[(i14 + 1 - 1 + paramInt12)] + f4 * paramArrayOfFloat5[(paramInt2 + i14 + 1 - 1 + paramInt12)]);
                }
                localfloatW7.val = Util.max(localfloatW7.val, f1, f4);
                if ((localfloatW7.val <= f5 * f24 ? 0 : 1) != 0)
                {
                  i19 = 0;
                  for (i24 = i21 - 1 - 0 + 1; i24 > 0; i24--)
                  {
                    i18 = 1;
                    for (i25 = i17 - 1 + 1; i25 > 0; i25--)
                    {
                      paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (f24 * paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                    }
                    i19 += 1;
                  }
                  f23 *= f24;
                }
                i15 = 1;
                for (i24 = i20 - 1 + 1; i24 > 0; i24--)
                {
                  if (i4 != 0)
                  {
                    f14 = localfloatW1.val * paramArrayOfFloat5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    f10 = localfloatW1.val * paramArrayOfFloat5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    f15 = localfloatW3.val * paramArrayOfFloat5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] - localfloatW2.val * paramArrayOfFloat5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    f11 = localfloatW2.val * paramArrayOfFloat5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] + localfloatW3.val * paramArrayOfFloat5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    i18 = 1;
                    for (i25 = i14 - 1 - 1 + 1; i25 > 0; i25--)
                    {
                      paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] - f14 * paramArrayOfFloat1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + f15 * paramArrayOfFloat2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      paramArrayOfFloat5[(3 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfFloat5[(3 * paramInt2 + i18 - 1 + paramInt12)] - f10 * paramArrayOfFloat1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + f11 * paramArrayOfFloat2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      i18 += 1;
                    }
                  }
                  else
                  {
                    f14 = localfloatW1.val * paramArrayOfFloat5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    f15 = localfloatW3.val * paramArrayOfFloat5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    i18 = 1;
                    for (i25 = i14 - 1 - 1 + 1; i25 > 0; i25--)
                    {
                      paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfFloat5[(2 * paramInt2 + i18 - 1 + paramInt12)] - f14 * paramArrayOfFloat1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + f15 * paramArrayOfFloat2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      i18 += 1;
                    }
                  }
                  i15 += 1;
                }
              }
              k = 0;
              label9108:
              i14 += -1;
            }
            i9 -= i21;
            if (i1 != 0)
            {
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                i18 = 1;
                for (i24 = paramInt2 - 1 + 1; i24 > 0; i24--)
                {
                  paramArrayOfFloat5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfFloat5[((i19 + 2) * paramInt2 + 1 - 1 + paramInt12)] * paramArrayOfFloat4[(i18 - 1 + (1 - 1) * paramInt10 + paramInt9)]);
                  i18 += 1;
                }
                i16 = 2;
                for (i24 = i17 - 2 + 1; i24 > 0; i24--)
                {
                  i18 = 1;
                  for (i25 = paramInt2 - 1 + 1; i25 > 0; i25--)
                  {
                    paramArrayOfFloat5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)] += paramArrayOfFloat5[((i19 + 2) * paramInt2 + i16 - 1 + paramInt12)] * paramArrayOfFloat4[(i18 - 1 + (i16 - 1) * paramInt10 + paramInt9)];
                    i18 += 1;
                  }
                  i16 += 1;
                }
                i19 += 1;
              }
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                i18 = 1;
                for (i24 = paramInt2 - 1 + 1; i24 > 0; i24--)
                {
                  paramArrayOfFloat4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = paramArrayOfFloat5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)];
                  i18 += 1;
                }
                i19 += 1;
              }
              i10 = paramInt2;
            }
            else
            {
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                i18 = 1;
                for (i24 = paramInt2 - 1 + 1; i24 > 0; i24--)
                {
                  paramArrayOfFloat4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = paramArrayOfFloat5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)];
                  i18 += 1;
                }
                i19 += 1;
              }
              i10 = i17;
            }
            f23 = 0.0F;
            if (i4 != 0)
            {
              i14 = 1;
              for (i23 = i10 - 1 + 1; i23 > 0; i23--)
              {
                f23 = Math.max(f23, Math.abs(paramArrayOfFloat4[(i14 - 1 + (i9 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfFloat4[(i14 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = 1;
              for (i23 = i10 - 1 + 1; i23 > 0; i23--)
              {
                f23 = Math.max(f23, Math.abs(paramArrayOfFloat4[(i14 - 1 + (i9 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            if ((f23 <= localfloatW5.val ? 0 : 1) != 0)
            {
              f24 = 1.0F / f23;
              i19 = 0;
              for (i23 = i21 - 1 - 0 + 1; i23 > 0; i23--)
              {
                i18 = 1;
                for (i24 = i10 - 1 + 1; i24 > 0; i24--)
                {
                  paramArrayOfFloat4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = (f24 * paramArrayOfFloat4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)]);
                  i18 += 1;
                }
                i19 += 1;
              }
            }
          }
        }
        label9855:
        i17 += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgevc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */