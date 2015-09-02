package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd4
{
  public static void slasd4(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
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
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float f25 = 0.0F;
    float f26 = 0.0F;
    float f27 = 0.0F;
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = new float[3];
    paramintW.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramfloatW.val = ((float)Math.sqrt(paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat1[(1 - 1 + paramInt3)] + paramFloat * paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat2[(1 - 1 + paramInt4)]));
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = 1.0F;
      paramArrayOfFloat4[(1 - 1 + paramInt6)] = 1.0F;
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Slasd5.slasd5(paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, paramfloatW, paramArrayOfFloat4, paramInt6);
      return;
    }
    f15 = Slamch.slamch("Epsilon");
    f20 = 1.0F / paramFloat;
    int i5;
    int i6;
    if ((paramInt2 != paramInt1 ? 0 : 1) != 0)
    {
      k = paramInt1 - 1;
      i4 = 1;
      f24 = paramFloat / 2.0F;
      f25 = f24 / (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + (float)Math.sqrt(paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] * paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + f24));
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat4[(i3 - 1 + paramInt6)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + f25);
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - f25);
        i3 += 1;
      }
      f19 = 0.0F;
      i3 = 1;
      for (i5 = paramInt1 - 2 - 1 + 1; i5 > 0; i5--)
      {
        f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat3[(i3 - 1 + paramInt5)] * paramArrayOfFloat4[(i3 - 1 + paramInt6)]);
        i3 += 1;
      }
      f3 = f20 + f19;
      f27 = f3 + paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat2[(k - 1 + paramInt4)] / (paramArrayOfFloat3[(k - 1 + paramInt5)] * paramArrayOfFloat4[(k - 1 + paramInt6)]) + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)]);
      if ((f27 > 0.0F ? 0 : 1) != 0)
      {
        f25 = (float)Math.sqrt(paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] * paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + paramFloat);
        f24 = paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] / ((paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] + f25) * (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] + paramFloat / (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + f25))) + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramFloat;
        if ((f3 > f24 ? 0 : 1) != 0)
        {
          f23 = paramFloat;
        }
        else
        {
          f4 = (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)]) * (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)]);
          f1 = -(f3 * f4) + paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
          f2 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f4;
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            f23 = 2.0F * f2 / ((float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3) - f1);
          } else {
            f23 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3)) / (2.0F * f3);
          }
        }
      }
      else
      {
        f4 = (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)]) * (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)]);
        f1 = -(f3 * f4) + paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f4;
        if ((f1 >= 0.0F ? 0 : 1) != 0) {
          f23 = 2.0F * f2 / ((float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3) - f1);
        } else {
          f23 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3)) / (2.0F * f3);
        }
      }
      localfloatW.val = (f23 / (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + (float)Math.sqrt(paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] * paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + f23)));
      paramfloatW.val = (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] + localfloatW.val);
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - localfloatW.val);
        paramArrayOfFloat4[(i3 - 1 + paramInt6)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + localfloatW.val);
        i3 += 1;
      }
      f7 = 0.0F;
      f19 = 0.0F;
      f16 = 0.0F;
      i3 = 1;
      for (i5 = k - 1 + 1; i5 > 0; i5--)
      {
        f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat3[(i3 - 1 + paramInt5)] * paramArrayOfFloat4[(i3 - 1 + paramInt6)]);
        f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
        f7 += f24 * f24;
        f16 += f19;
        i3 += 1;
      }
      f16 = Math.abs(f16);
      f24 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)]);
      f17 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f24;
      f6 = f24 * f24;
      f16 = 8.0F * (-f17 - f19) + f16 - f17 + f20 + Math.abs(f23) * (f7 + f6);
      f27 = f20 + f17 + f19;
      if ((Math.abs(f27) > f15 * f16 ? 0 : 1) == 0)
      {
        i4 += 1;
        f13 = paramArrayOfFloat4[(paramInt1 - 1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)];
        f12 = paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
        f3 = f27 - f13 * f7 - f12 * f6;
        f1 = (f12 + f13) * f27 - f12 * f13 * (f7 + f6);
        f2 = f12 * f13 * f27;
        if ((f3 >= 0.0F ? 0 : 1) != 0) {
          f3 = Math.abs(f3);
        }
        if ((f3 != 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (paramFloat - paramfloatW.val * paramfloatW.val);
        } else if ((f1 < 0.0F ? 0 : 1) != 0) {
          localfloatW.val = ((f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
        } else {
          localfloatW.val = (2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
        }
        if ((f27 * localfloatW.val <= 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (-(f27 / (f7 + f6)));
        }
        f24 = localfloatW.val - f12;
        if ((f24 <= paramFloat ? 0 : 1) != 0) {
          localfloatW.val = (paramFloat + f12);
        }
        f23 += localfloatW.val;
        localfloatW.val /= (paramfloatW.val + (float)Math.sqrt(localfloatW.val + paramfloatW.val * paramfloatW.val));
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
          paramArrayOfFloat4[(i3 - 1 + paramInt6)] += localfloatW.val;
          i3 += 1;
        }
        paramfloatW.val += localfloatW.val;
        f7 = 0.0F;
        f19 = 0.0F;
        f16 = 0.0F;
        i3 = 1;
        for (i5 = k - 1 + 1; i5 > 0; i5--)
        {
          f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
          f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
          f7 += f24 * f24;
          f16 += f19;
          i3 += 1;
        }
        f16 = Math.abs(f16);
        f24 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)]);
        f17 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f24;
        f6 = f24 * f24;
        f16 = 8.0F * (-f17 - f19) + f16 - f17 + f20 + Math.abs(f23) * (f7 + f6);
        f27 = f20 + f17 + f19;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 20 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(f27) > f15 * f16 ? 0 : 1) != 0) {
            break;
          }
          f13 = paramArrayOfFloat4[(paramInt1 - 1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)];
          f12 = paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
          f3 = f27 - f13 * f7 - f12 * f6;
          f1 = (f12 + f13) * f27 - f13 * f12 * (f7 + f6);
          f2 = f13 * f12 * f27;
          if ((f1 < 0.0F ? 0 : 1) != 0) {
            localfloatW.val = ((f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
          } else {
            localfloatW.val = (2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
          }
          if ((f27 * localfloatW.val <= 0.0F ? 0 : 1) != 0) {
            localfloatW.val = (-(f27 / (f7 + f6)));
          }
          f24 = localfloatW.val - f12;
          if ((f24 > 0.0F ? 0 : 1) != 0) {
            localfloatW.val /= 2.0F;
          }
          f23 += localfloatW.val;
          localfloatW.val /= (paramfloatW.val + (float)Math.sqrt(localfloatW.val + paramfloatW.val * paramfloatW.val));
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
            paramArrayOfFloat4[(i3 - 1 + paramInt6)] += localfloatW.val;
            i3 += 1;
          }
          paramfloatW.val += localfloatW.val;
          f7 = 0.0F;
          f19 = 0.0F;
          f16 = 0.0F;
          i3 = 1;
          for (i6 = k - 1 + 1; i6 > 0; i6--)
          {
            f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
            f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
            f7 += f24 * f24;
            f16 += f19;
            i3 += 1;
          }
          f16 = Math.abs(f16);
          f24 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfFloat4[(paramInt1 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)]);
          f17 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f24;
          f6 = f24 * f24;
          f16 = 8.0F * (-f17 - f19) + f16 - f17 + f20 + Math.abs(f23) * (f7 + f6);
          f27 = f20 + f17 + f19;
          i4 += 1;
        }
        paramintW.val = 1;
        return;
      }
    }
    else
    {
      i4 = 1;
      i1 = paramInt2 + 1;
      f4 = (paramArrayOfFloat1[(i1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)]) * (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)]);
      f5 = f4 / 2.0F;
      f24 = f5 / (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + (float)Math.sqrt(paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] * paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f5));
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat4[(i3 - 1 + paramInt6)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f24);
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - f24);
        i3 += 1;
      }
      f19 = 0.0F;
      i3 = 1;
      for (i5 = paramInt2 - 1 - 1 + 1; i5 > 0; i5--)
      {
        f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
        i3 += 1;
      }
      f17 = 0.0F;
      i3 = paramInt1;
      for (i5 = (paramInt2 + 2 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        f17 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
        i3 += -1;
      }
      f3 = f20 + f19 + f17;
      f27 = f3 + paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / (paramArrayOfFloat4[(paramInt2 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)]) + paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] / (paramArrayOfFloat4[(i1 - 1 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)]);
      if ((f27 <= 0.0F ? 0 : 1) != 0)
      {
        bool = true;
        f21 = 0.0F;
        f22 = f5;
        f1 = f3 * f4 + paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * f4;
        if ((f1 <= 0.0F ? 0 : 1) != 0) {
          f23 = 2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3)));
        } else {
          f23 = (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3);
        }
        localfloatW.val = (f23 / (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + (float)Math.sqrt(paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] * paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f23)));
      }
      else
      {
        bool = false;
        f21 = -f5;
        f22 = 0.0F;
        f1 = f3 * f4 - paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] - paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] * f4;
        if ((f1 >= 0.0F ? 0 : 1) != 0) {
          f23 = 2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 + 4.0F * f2 * f3)));
        } else {
          f23 = -((f1 + (float)Math.sqrt(Math.abs(f1 * f1 + 4.0F * f2 * f3))) / (2.0F * f3));
        }
        localfloatW.val = (f23 / (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i1 - 1 + paramInt3)] * paramArrayOfFloat1[(i1 - 1 + paramInt3)] + f23))));
      }
      if (bool)
      {
        k = paramInt2;
        paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + localfloatW.val);
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat4[(i3 - 1 + paramInt6)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] + paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + localfloatW.val);
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - localfloatW.val);
          i3 += 1;
        }
      }
      else
      {
        k = paramInt2 + 1;
        paramfloatW.val = (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + localfloatW.val);
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat4[(i3 - 1 + paramInt6)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] + paramArrayOfFloat1[(i1 - 1 + paramInt3)] + localfloatW.val);
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(i1 - 1 + paramInt3)] - localfloatW.val);
          i3 += 1;
        }
      }
      m = k - 1;
      n = k + 1;
      f7 = 0.0F;
      f19 = 0.0F;
      f16 = 0.0F;
      i3 = 1;
      for (i5 = m - 1 + 1; i5 > 0; i5--)
      {
        f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
        f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
        f7 += f24 * f24;
        f16 += f19;
        i3 += 1;
      }
      f16 = Math.abs(f16);
      f6 = 0.0F;
      f17 = 0.0F;
      i3 = paramInt1;
      for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
        f17 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
        f6 += f24 * f24;
        f16 += f17;
        i3 += -1;
      }
      f27 = f20 + f17 + f19;
      j = 0;
      if (bool)
      {
        if ((f27 >= 0.0F ? 0 : 1) != 0) {
          j = 1;
        }
      }
      else if ((f27 <= 0.0F ? 0 : 1) != 0) {
        j = 1;
      }
      if ((k != 1 ? 0 : 1) == 0) {}
      if (((k != paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 0;
      }
      f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] / (paramArrayOfFloat4[(k - 1 + paramInt6)] * paramArrayOfFloat3[(k - 1 + paramInt5)]);
      f14 = f7 + f6 + f24 * f24;
      f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f24;
      f27 += f24;
      f16 = 8.0F * (f17 - f19) + f16 + 2.0F * f20 + 3.0F * Math.abs(f24) + Math.abs(f23) * f14;
      if ((Math.abs(f27) > f15 * f16 ? 0 : 1) == 0)
      {
        if ((f27 > 0.0F ? 0 : 1) != 0) {
          f21 = Math.max(f21, f23);
        } else {
          f22 = Math.min(f22, f23);
        }
        i4 += 1;
        if ((j ^ 0x1) != 0)
        {
          f10 = paramArrayOfFloat4[(i1 - 1 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
          f11 = paramArrayOfFloat4[(paramInt2 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)];
          if (bool) {
            f3 = f27 - f10 * f14 + f4 * (float)Math.pow(paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / f11, 2);
          } else {
            f3 = f27 - f11 * f14 - f4 * (float)Math.pow(paramArrayOfFloat2[(i1 - 1 + paramInt4)] / f10, 2);
          }
          f1 = (f10 + f11) * f27 - f10 * f11 * f14;
          f2 = f10 * f11 * f27;
          if ((f3 != 0.0F ? 0 : 1) != 0)
          {
            if ((f1 != 0.0F ? 0 : 1) != 0) {
              if (bool) {
                f1 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + f10 * f10 * (f7 + f6);
              } else {
                f1 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + f11 * f11 * (f7 + f6);
              }
            }
            localfloatW.val = (f2 / f1);
          }
          else if ((f1 > 0.0F ? 0 : 1) != 0)
          {
            localfloatW.val = ((f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
          }
          else
          {
            localfloatW.val = (2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
          }
        }
        else
        {
          f8 = paramArrayOfFloat4[(m - 1 + paramInt6)] * paramArrayOfFloat3[(m - 1 + paramInt5)];
          f9 = paramArrayOfFloat4[(n - 1 + paramInt6)] * paramArrayOfFloat3[(n - 1 + paramInt5)];
          f24 = f20 + f19 + f17;
          if (bool)
          {
            f25 = paramArrayOfFloat2[(m - 1 + paramInt4)] / f8;
            f25 *= f25;
            f3 = f24 - f9 * (f7 + f6) - (paramArrayOfFloat1[(m - 1 + paramInt3)] - paramArrayOfFloat1[(n - 1 + paramInt3)]) * (paramArrayOfFloat1[(m - 1 + paramInt3)] + paramArrayOfFloat1[(n - 1 + paramInt3)]) * f25;
            arrayOfFloat2[(1 - 1)] = (paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat2[(m - 1 + paramInt4)]);
            if ((f7 >= f25 ? 0 : 1) != 0) {
              arrayOfFloat2[(3 - 1)] = (f9 * f9 * f6);
            } else {
              arrayOfFloat2[(3 - 1)] = (f9 * f9 * (f7 - f25 + f6));
            }
          }
          else
          {
            f25 = paramArrayOfFloat2[(n - 1 + paramInt4)] / f9;
            f25 *= f25;
            f3 = f24 - f8 * (f7 + f6) - (paramArrayOfFloat1[(n - 1 + paramInt3)] - paramArrayOfFloat1[(m - 1 + paramInt3)]) * (paramArrayOfFloat1[(m - 1 + paramInt3)] + paramArrayOfFloat1[(n - 1 + paramInt3)]) * f25;
            if ((f6 >= f25 ? 0 : 1) != 0) {
              arrayOfFloat2[(1 - 1)] = (f8 * f8 * f7);
            } else {
              arrayOfFloat2[(1 - 1)] = (f8 * f8 * (f7 + (f6 - f25)));
            }
            arrayOfFloat2[(3 - 1)] = (paramArrayOfFloat2[(n - 1 + paramInt4)] * paramArrayOfFloat2[(n - 1 + paramInt4)]);
          }
          arrayOfFloat2[(2 - 1)] = (paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat2[(k - 1 + paramInt4)]);
          arrayOfFloat1[(1 - 1)] = f8;
          arrayOfFloat1[(2 - 1)] = (paramArrayOfFloat3[(k - 1 + paramInt5)] * paramArrayOfFloat4[(k - 1 + paramInt6)]);
          arrayOfFloat1[(3 - 1)] = f9;
          Slaed6.slaed6(i4, bool, f3, arrayOfFloat1, 0, arrayOfFloat2, 0, f27, localfloatW, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        if ((f27 * localfloatW.val < 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (-(f27 / f14));
        }
        if (bool)
        {
          f25 = paramArrayOfFloat4[(paramInt2 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)];
          f24 = localfloatW.val - f25;
        }
        else
        {
          f25 = paramArrayOfFloat4[(i1 - 1 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
          f24 = localfloatW.val - f25;
        }
        if ((f24 <= f22 ? 0 : 1) == 0) {}
        if (((f24 >= f21 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((f27 >= 0.0F ? 0 : 1) != 0) {
            localfloatW.val = ((f22 - f23) / 2.0F);
          } else {
            localfloatW.val = ((f21 - f23) / 2.0F);
          }
        }
        f23 += localfloatW.val;
        localfloatW.val /= (paramfloatW.val + (float)Math.sqrt(paramfloatW.val * paramfloatW.val + localfloatW.val));
        f18 = f27;
        paramfloatW.val += localfloatW.val;
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat4[(i3 - 1 + paramInt6)] += localfloatW.val;
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
          i3 += 1;
        }
        f7 = 0.0F;
        f19 = 0.0F;
        f16 = 0.0F;
        i3 = 1;
        for (i5 = m - 1 + 1; i5 > 0; i5--)
        {
          f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
          f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
          f7 += f24 * f24;
          f16 += f19;
          i3 += 1;
        }
        f16 = Math.abs(f16);
        f6 = 0.0F;
        f17 = 0.0F;
        i3 = paramInt1;
        for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
        {
          f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
          f17 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
          f6 += f24 * f24;
          f16 += f17;
          i3 += -1;
        }
        f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] / (paramArrayOfFloat4[(k - 1 + paramInt6)] * paramArrayOfFloat3[(k - 1 + paramInt5)]);
        f14 = f7 + f6 + f24 * f24;
        f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f24;
        f27 = f20 + f17 + f19 + f24;
        f16 = 8.0F * (f17 - f19) + f16 + 2.0F * f20 + 3.0F * Math.abs(f24) + Math.abs(f23) * f14;
        if ((f27 > 0.0F ? 0 : 1) != 0) {
          f21 = Math.max(f21, f23);
        } else {
          f22 = Math.min(f22, f23);
        }
        i = 0;
        if (bool)
        {
          if ((-f27 <= Math.abs(f18) / 10.0F ? 0 : 1) != 0) {
            i = 1;
          }
        }
        else if ((f27 <= Math.abs(f18) / 10.0F ? 0 : 1) != 0) {
          i = 1;
        }
        i2 = i4 + 1;
        i4 = i2;
        i5 = 20 - i2 + 1;
        while ((Math.abs(f27) > f15 * f16 ? 0 : 1) == 0)
        {
          if ((j ^ 0x1) != 0)
          {
            f10 = paramArrayOfFloat4[(i1 - 1 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
            f11 = paramArrayOfFloat4[(paramInt2 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)];
            if ((i ^ 0x1) != 0)
            {
              if (bool) {
                f3 = f27 - f10 * f14 + f4 * (float)Math.pow(paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / f11, 2);
              } else {
                f3 = f27 - f11 * f14 - f4 * (float)Math.pow(paramArrayOfFloat2[(i1 - 1 + paramInt4)] / f10, 2);
              }
            }
            else
            {
              f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] / (paramArrayOfFloat4[(k - 1 + paramInt6)] * paramArrayOfFloat3[(k - 1 + paramInt5)]);
              if (bool) {
                f7 += f24 * f24;
              } else {
                f6 += f24 * f24;
              }
              f3 = f27 - f11 * f7 - f10 * f6;
            }
            f1 = (f10 + f11) * f27 - f10 * f11 * f14;
            f2 = f10 * f11 * f27;
            if ((f3 != 0.0F ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) != 0) {
                if ((i ^ 0x1) != 0)
                {
                  if (bool) {
                    f1 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + f10 * f10 * (f7 + f6);
                  } else {
                    f1 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + f11 * f11 * (f7 + f6);
                  }
                }
                else {
                  f1 = f11 * f11 * f7 + f10 * f10 * f6;
                }
              }
              localfloatW.val = (f2 / f1);
            }
            else if ((f1 > 0.0F ? 0 : 1) != 0)
            {
              localfloatW.val = ((f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
            }
            else
            {
              localfloatW.val = (2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
            }
          }
          else
          {
            f8 = paramArrayOfFloat4[(m - 1 + paramInt6)] * paramArrayOfFloat3[(m - 1 + paramInt5)];
            f9 = paramArrayOfFloat4[(n - 1 + paramInt6)] * paramArrayOfFloat3[(n - 1 + paramInt5)];
            f24 = f20 + f19 + f17;
            if (i != 0)
            {
              f3 = f24 - f8 * f7 - f9 * f6;
              arrayOfFloat2[(1 - 1)] = (f8 * f8 * f7);
              arrayOfFloat2[(3 - 1)] = (f9 * f9 * f6);
            }
            else if (bool)
            {
              f25 = paramArrayOfFloat2[(m - 1 + paramInt4)] / f8;
              f25 *= f25;
              f26 = (paramArrayOfFloat1[(m - 1 + paramInt3)] - paramArrayOfFloat1[(n - 1 + paramInt3)]) * (paramArrayOfFloat1[(m - 1 + paramInt3)] + paramArrayOfFloat1[(n - 1 + paramInt3)]) * f25;
              f3 = f24 - f9 * (f7 + f6) - f26;
              arrayOfFloat2[(1 - 1)] = (paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat2[(m - 1 + paramInt4)]);
              if ((f7 >= f25 ? 0 : 1) != 0) {
                arrayOfFloat2[(3 - 1)] = (f9 * f9 * f6);
              } else {
                arrayOfFloat2[(3 - 1)] = (f9 * f9 * (f7 - f25 + f6));
              }
            }
            else
            {
              f25 = paramArrayOfFloat2[(n - 1 + paramInt4)] / f9;
              f25 *= f25;
              f26 = (paramArrayOfFloat1[(n - 1 + paramInt3)] - paramArrayOfFloat1[(m - 1 + paramInt3)]) * (paramArrayOfFloat1[(m - 1 + paramInt3)] + paramArrayOfFloat1[(n - 1 + paramInt3)]) * f25;
              f3 = f24 - f8 * (f7 + f6) - f26;
              if ((f6 >= f25 ? 0 : 1) != 0) {
                arrayOfFloat2[(1 - 1)] = (f8 * f8 * f7);
              } else {
                arrayOfFloat2[(1 - 1)] = (f8 * f8 * (f7 + (f6 - f25)));
              }
              arrayOfFloat2[(3 - 1)] = (paramArrayOfFloat2[(n - 1 + paramInt4)] * paramArrayOfFloat2[(n - 1 + paramInt4)]);
            }
            arrayOfFloat1[(1 - 1)] = f8;
            arrayOfFloat1[(2 - 1)] = (paramArrayOfFloat3[(k - 1 + paramInt5)] * paramArrayOfFloat4[(k - 1 + paramInt6)]);
            arrayOfFloat1[(3 - 1)] = f9;
            Slaed6.slaed6(i4, bool, f3, arrayOfFloat1, 0, arrayOfFloat2, 0, f27, localfloatW, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              break;
            }
          }
          if ((f27 * localfloatW.val < 0.0F ? 0 : 1) != 0) {
            localfloatW.val = (-(f27 / f14));
          }
          if (bool)
          {
            f25 = paramArrayOfFloat4[(paramInt2 - 1 + paramInt6)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)];
            f24 = localfloatW.val - f25;
          }
          else
          {
            f25 = paramArrayOfFloat4[(i1 - 1 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
            f24 = localfloatW.val - f25;
          }
          if ((f24 <= f22 ? 0 : 1) == 0) {}
          if (((f24 >= f21 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((f27 >= 0.0F ? 0 : 1) != 0) {
              localfloatW.val = ((f22 - f23) / 2.0F);
            } else {
              localfloatW.val = ((f21 - f23) / 2.0F);
            }
          }
          f23 += localfloatW.val;
          localfloatW.val /= (paramfloatW.val + (float)Math.sqrt(paramfloatW.val * paramfloatW.val + localfloatW.val));
          paramfloatW.val += localfloatW.val;
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfFloat4[(i3 - 1 + paramInt6)] += localfloatW.val;
            paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
            i3 += 1;
          }
          f18 = f27;
          f7 = 0.0F;
          f19 = 0.0F;
          f16 = 0.0F;
          i3 = 1;
          for (i6 = m - 1 + 1; i6 > 0; i6--)
          {
            f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
            f19 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
            f7 += f24 * f24;
            f16 += f19;
            i3 += 1;
          }
          f16 = Math.abs(f16);
          f6 = 0.0F;
          f17 = 0.0F;
          i3 = paramInt1;
          for (i6 = (n - paramInt1 + -1) / -1; i6 > 0; i6--)
          {
            f24 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / (paramArrayOfFloat4[(i3 - 1 + paramInt6)] * paramArrayOfFloat3[(i3 - 1 + paramInt5)]);
            f17 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f24;
            f6 += f24 * f24;
            f16 += f17;
            i3 += -1;
          }
          f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] / (paramArrayOfFloat4[(k - 1 + paramInt6)] * paramArrayOfFloat3[(k - 1 + paramInt5)]);
          f14 = f7 + f6 + f24 * f24;
          f24 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f24;
          f27 = f20 + f17 + f19 + f24;
          f16 = 8.0F * (f17 - f19) + f16 + 2.0F * f20 + 3.0F * Math.abs(f24) + Math.abs(f23) * f14;
          if ((f27 * f18 <= 0.0F ? 0 : 1) != 0) {}
          if (((Math.abs(f27) <= Math.abs(f18) / 10.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
            i ^= 0x1;
          }
          if ((f27 > 0.0F ? 0 : 1) != 0) {
            f21 = Math.max(f21, f23);
          } else {
            f22 = Math.min(f22, f23);
          }
          i4 += 1;
          i5--;
          if (i5 <= 0) {
            paramintW.val = 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */