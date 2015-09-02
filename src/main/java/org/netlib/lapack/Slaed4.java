package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed4
{
  public static void slaed4(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, floatW paramfloatW, intW paramintW)
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
    floatW localfloatW = new floatW(0.0F);
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float[] arrayOfFloat = new float[3];
    paramintW.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramfloatW.val = (paramArrayOfFloat1[(1 - 1 + paramInt3)] + paramFloat * paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat2[(1 - 1 + paramInt4)]);
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = 1.0F;
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Slaed5.slaed5(paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, paramfloatW);
      return;
    }
    f10 = Slamch.slamch("Epsilon");
    f16 = 1.0F / paramFloat;
    int i5;
    int i6;
    if ((paramInt2 != paramInt1 ? 0 : 1) != 0)
    {
      k = paramInt1 - 1;
      i4 = 1;
      f12 = paramFloat / 2.0F;
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - f12);
        i3 += 1;
      }
      f15 = 0.0F;
      i3 = 1;
      for (i5 = paramInt1 - 2 - 1 + 1; i5 > 0; i5--)
      {
        f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        i3 += 1;
      }
      f3 = f16 + f15;
      f20 = f3 + paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat2[(k - 1 + paramInt4)] / paramArrayOfFloat3[(k - 1 + paramInt5)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
      if ((f20 > 0.0F ? 0 : 1) != 0)
      {
        f18 = paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] / (paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] + paramFloat) + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramFloat;
        if ((f3 > f18 ? 0 : 1) != 0)
        {
          f17 = paramFloat;
        }
        else
        {
          f4 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)];
          f1 = -(f3 * f4) + paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
          f2 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f4;
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            f17 = 2.0F * f2 / ((float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3) - f1);
          } else {
            f17 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3)) / (2.0F * f3);
          }
        }
        f5 = f12;
        f6 = paramFloat;
      }
      else
      {
        f4 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)];
        f1 = -(f3 * f4) + paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f4;
        if ((f1 >= 0.0F ? 0 : 1) != 0) {
          f17 = 2.0F * f2 / ((float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3) - f1);
        } else {
          f17 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2 * f3)) / (2.0F * f3);
        }
        f5 = 0.0F;
        f6 = f12;
      }
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - f17);
        i3 += 1;
      }
      f8 = 0.0F;
      f15 = 0.0F;
      f11 = 0.0F;
      i3 = 1;
      for (i5 = k - 1 + 1; i5 > 0; i5--)
      {
        f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
        f8 += f18 * f18;
        f11 += f15;
        i3 += 1;
      }
      f11 = Math.abs(f11);
      f18 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
      f13 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f18;
      f7 = f18 * f18;
      f11 = 8.0F * (-f13 - f15) + f11 - f13 + f16 + Math.abs(f17) * (f8 + f7);
      f20 = f16 + f13 + f15;
      if ((Math.abs(f20) > f10 * f11 ? 0 : 1) != 0)
      {
        paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
      }
      else
      {
        if ((f20 > 0.0F ? 0 : 1) != 0) {
          f5 = Math.max(f5, f17);
        } else {
          f6 = Math.min(f6, f17);
        }
        i4 += 1;
        f3 = f20 - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * f8 - paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * f7;
        f1 = (paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] + paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)]) * f20 - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * (f8 + f7);
        f2 = paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * f20;
        if ((f3 >= 0.0F ? 0 : 1) != 0) {
          f3 = Math.abs(f3);
        }
        if ((f3 != 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (f6 - f17);
        } else if ((f1 < 0.0F ? 0 : 1) != 0) {
          localfloatW.val = ((f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
        } else {
          localfloatW.val = (2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
        }
        if ((f20 * localfloatW.val <= 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (-(f20 / (f8 + f7)));
        }
        f18 = f17 + localfloatW.val;
        if ((f18 <= f6 ? 0 : 1) == 0) {}
        if (((f18 >= f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((f20 >= 0.0F ? 0 : 1) != 0) {
            localfloatW.val = ((f6 - f17) / 2.0F);
          } else {
            localfloatW.val = ((f5 - f17) / 2.0F);
          }
        }
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
          i3 += 1;
        }
        f17 += localfloatW.val;
        f8 = 0.0F;
        f15 = 0.0F;
        f11 = 0.0F;
        i3 = 1;
        for (i5 = k - 1 + 1; i5 > 0; i5--)
        {
          f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
          f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
          f8 += f18 * f18;
          f11 += f15;
          i3 += 1;
        }
        f11 = Math.abs(f11);
        f18 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
        f13 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f18;
        f7 = f18 * f18;
        f11 = 8.0F * (-f13 - f15) + f11 - f13 + f16 + Math.abs(f17) * (f8 + f7);
        f20 = f16 + f13 + f15;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 30 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(f20) > f10 * f11 ? 0 : 1) != 0)
          {
            paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
            break;
          }
          if ((f20 > 0.0F ? 0 : 1) != 0) {
            f5 = Math.max(f5, f17);
          } else {
            f6 = Math.min(f6, f17);
          }
          f3 = f20 - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * f8 - paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * f7;
          f1 = (paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] + paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)]) * f20 - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * (f8 + f7);
          f2 = paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)] * f20;
          if ((f1 < 0.0F ? 0 : 1) != 0) {
            localfloatW.val = ((f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3));
          } else {
            localfloatW.val = (2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))));
          }
          if ((f20 * localfloatW.val <= 0.0F ? 0 : 1) != 0) {
            localfloatW.val = (-(f20 / (f8 + f7)));
          }
          f18 = f17 + localfloatW.val;
          if ((f18 <= f6 ? 0 : 1) == 0) {}
          if (((f18 >= f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((f20 >= 0.0F ? 0 : 1) != 0) {
              localfloatW.val = ((f6 - f17) / 2.0F);
            } else {
              localfloatW.val = ((f5 - f17) / 2.0F);
            }
          }
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
            i3 += 1;
          }
          f17 += localfloatW.val;
          f8 = 0.0F;
          f15 = 0.0F;
          f11 = 0.0F;
          i3 = 1;
          for (i6 = k - 1 + 1; i6 > 0; i6--)
          {
            f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
            f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
            f8 += f18 * f18;
            f11 += f15;
            i3 += 1;
          }
          f11 = Math.abs(f11);
          f18 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt1 - 1 + paramInt5)];
          f13 = paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * f18;
          f7 = f18 * f18;
          f11 = 8.0F * (-f13 - f15) + f11 - f13 + f16 + Math.abs(f17) * (f8 + f7);
          f20 = f16 + f13 + f15;
          i4 += 1;
        }
        paramintW.val = 1;
        paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
        return;
      }
    }
    else
    {
      i4 = 1;
      i1 = paramInt2 + 1;
      f4 = paramArrayOfFloat1[(i1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)];
      f12 = f4 / 2.0F;
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - f12);
        i3 += 1;
      }
      f15 = 0.0F;
      i3 = 1;
      for (i5 = paramInt2 - 1 - 1 + 1; i5 > 0; i5--)
      {
        f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        i3 += 1;
      }
      f13 = 0.0F;
      i3 = paramInt1;
      for (i5 = (paramInt2 + 2 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        f13 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        i3 += -1;
      }
      f3 = f16 + f15 + f13;
      f20 = f3 + paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] + paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] / paramArrayOfFloat3[(i1 - 1 + paramInt5)];
      if ((f20 <= 0.0F ? 0 : 1) != 0)
      {
        bool = true;
        f1 = f3 * f4 + paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * f4;
        if ((f1 <= 0.0F ? 0 : 1) != 0) {
          f17 = 2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3)));
        } else {
          f17 = (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f3))) / (2.0F * f3);
        }
        f5 = 0.0F;
        f6 = f12;
      }
      else
      {
        bool = false;
        f1 = f3 * f4 - paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] - paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
        f2 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] * f4;
        if ((f1 >= 0.0F ? 0 : 1) != 0) {
          f17 = 2.0F * f2 / (f1 - (float)Math.sqrt(Math.abs(f1 * f1 + 4.0F * f2 * f3)));
        } else {
          f17 = -((f1 + (float)Math.sqrt(Math.abs(f1 * f1 + 4.0F * f2 * f3))) / (2.0F * f3));
        }
        f5 = -f12;
        f6 = 0.0F;
      }
      if (bool)
      {
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - f17);
          i3 += 1;
        }
      }
      else
      {
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] = (paramArrayOfFloat1[(i3 - 1 + paramInt3)] - paramArrayOfFloat1[(i1 - 1 + paramInt3)] - f17);
          i3 += 1;
        }
      }
      if (bool) {
        k = paramInt2;
      } else {
        k = paramInt2 + 1;
      }
      m = k - 1;
      n = k + 1;
      f8 = 0.0F;
      f15 = 0.0F;
      f11 = 0.0F;
      i3 = 1;
      for (i5 = m - 1 + 1; i5 > 0; i5--)
      {
        f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
        f8 += f18 * f18;
        f11 += f15;
        i3 += 1;
      }
      f11 = Math.abs(f11);
      f7 = 0.0F;
      f13 = 0.0F;
      i3 = paramInt1;
      for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
        f13 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
        f7 += f18 * f18;
        f11 += f13;
        i3 += -1;
      }
      f20 = f16 + f13 + f15;
      j = 0;
      if (bool)
      {
        if ((f20 >= 0.0F ? 0 : 1) != 0) {
          j = 1;
        }
      }
      else if ((f20 <= 0.0F ? 0 : 1) != 0) {
        j = 1;
      }
      if ((k != 1 ? 0 : 1) == 0) {}
      if (((k != paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 0;
      }
      f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] / paramArrayOfFloat3[(k - 1 + paramInt5)];
      f9 = f8 + f7 + f18 * f18;
      f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f18;
      f20 += f18;
      f11 = 8.0F * (f13 - f15) + f11 + 2.0F * f16 + 3.0F * Math.abs(f18) + Math.abs(f17) * f9;
      if ((Math.abs(f20) > f10 * f11 ? 0 : 1) != 0)
      {
        if (bool) {
          paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
        } else {
          paramfloatW.val = (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + f17);
        }
      }
      else
      {
        if ((f20 > 0.0F ? 0 : 1) != 0) {
          f5 = Math.max(f5, f17);
        } else {
          f6 = Math.min(f6, f17);
        }
        i4 += 1;
        if ((j ^ 0x1) != 0)
        {
          if (bool) {
            f3 = f20 - paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f9 - (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - paramArrayOfFloat1[(i1 - 1 + paramInt3)]) * (float)Math.pow(paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)], 2);
          } else {
            f3 = f20 - paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * f9 - (paramArrayOfFloat1[(i1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)]) * (float)Math.pow(paramArrayOfFloat2[(i1 - 1 + paramInt4)] / paramArrayOfFloat3[(i1 - 1 + paramInt5)], 2);
          }
          f1 = (paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] + paramArrayOfFloat3[(i1 - 1 + paramInt5)]) * f20 - paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f9;
          f2 = paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f20;
          if ((f3 != 0.0F ? 0 : 1) != 0)
          {
            if ((f1 != 0.0F ? 0 : 1) != 0) {
              if (bool) {
                f1 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + paramArrayOfFloat3[(i1 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * (f8 + f7);
              } else {
                f1 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * (f8 + f7);
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
          f18 = f16 + f15 + f13;
          if (bool)
          {
            f19 = paramArrayOfFloat2[(m - 1 + paramInt4)] / paramArrayOfFloat3[(m - 1 + paramInt5)];
            f19 *= f19;
            f3 = f18 - paramArrayOfFloat3[(n - 1 + paramInt5)] * (f8 + f7) - (paramArrayOfFloat1[(m - 1 + paramInt3)] - paramArrayOfFloat1[(n - 1 + paramInt3)]) * f19;
            arrayOfFloat[(1 - 1)] = (paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat2[(m - 1 + paramInt4)]);
            arrayOfFloat[(3 - 1)] = (paramArrayOfFloat3[(n - 1 + paramInt5)] * paramArrayOfFloat3[(n - 1 + paramInt5)] * (f8 - f19 + f7));
          }
          else
          {
            f19 = paramArrayOfFloat2[(n - 1 + paramInt4)] / paramArrayOfFloat3[(n - 1 + paramInt5)];
            f19 *= f19;
            f3 = f18 - paramArrayOfFloat3[(m - 1 + paramInt5)] * (f8 + f7) - (paramArrayOfFloat1[(n - 1 + paramInt3)] - paramArrayOfFloat1[(m - 1 + paramInt3)]) * f19;
            arrayOfFloat[(1 - 1)] = (paramArrayOfFloat3[(m - 1 + paramInt5)] * paramArrayOfFloat3[(m - 1 + paramInt5)] * (f8 + (f7 - f19)));
            arrayOfFloat[(3 - 1)] = (paramArrayOfFloat2[(n - 1 + paramInt4)] * paramArrayOfFloat2[(n - 1 + paramInt4)]);
          }
          arrayOfFloat[(2 - 1)] = (paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat2[(k - 1 + paramInt4)]);
          Slaed6.slaed6(i4, bool, f3, paramArrayOfFloat3, m - 1 + paramInt5, arrayOfFloat, 0, f20, localfloatW, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        if ((f20 * localfloatW.val < 0.0F ? 0 : 1) != 0) {
          localfloatW.val = (-(f20 / f9));
        }
        f18 = f17 + localfloatW.val;
        if ((f18 <= f6 ? 0 : 1) == 0) {}
        if (((f18 >= f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((f20 >= 0.0F ? 0 : 1) != 0) {
            localfloatW.val = ((f6 - f17) / 2.0F);
          } else {
            localfloatW.val = ((f5 - f17) / 2.0F);
          }
        }
        f14 = f20;
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
          i3 += 1;
        }
        f8 = 0.0F;
        f15 = 0.0F;
        f11 = 0.0F;
        i3 = 1;
        for (i5 = m - 1 + 1; i5 > 0; i5--)
        {
          f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
          f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
          f8 += f18 * f18;
          f11 += f15;
          i3 += 1;
        }
        f11 = Math.abs(f11);
        f7 = 0.0F;
        f13 = 0.0F;
        i3 = paramInt1;
        for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
        {
          f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
          f13 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
          f7 += f18 * f18;
          f11 += f13;
          i3 += -1;
        }
        f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] / paramArrayOfFloat3[(k - 1 + paramInt5)];
        f9 = f8 + f7 + f18 * f18;
        f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f18;
        f20 = f16 + f13 + f15 + f18;
        f11 = 8.0F * (f13 - f15) + f11 + 2.0F * f16 + 3.0F * Math.abs(f18) + Math.abs(f17 + localfloatW.val) * f9;
        i = 0;
        if (bool)
        {
          if ((-f20 <= Math.abs(f14) / 10.0F ? 0 : 1) != 0) {
            i = 1;
          }
        }
        else if ((f20 <= Math.abs(f14) / 10.0F ? 0 : 1) != 0) {
          i = 1;
        }
        f17 += localfloatW.val;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 30 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(f20) > f10 * f11 ? 0 : 1) != 0)
          {
            if (bool) {
              paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
            } else {
              paramfloatW.val = (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + f17);
            }
            break;
          }
          if ((f20 > 0.0F ? 0 : 1) != 0) {
            f5 = Math.max(f5, f17);
          } else {
            f6 = Math.min(f6, f17);
          }
          if ((j ^ 0x1) != 0)
          {
            if ((i ^ 0x1) != 0)
            {
              if (bool) {
                f3 = f20 - paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f9 - (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] - paramArrayOfFloat1[(i1 - 1 + paramInt3)]) * (float)Math.pow(paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] / paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)], 2);
              } else {
                f3 = f20 - paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * f9 - (paramArrayOfFloat1[(i1 - 1 + paramInt3)] - paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)]) * (float)Math.pow(paramArrayOfFloat2[(i1 - 1 + paramInt4)] / paramArrayOfFloat3[(i1 - 1 + paramInt5)], 2);
              }
            }
            else
            {
              f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] / paramArrayOfFloat3[(k - 1 + paramInt5)];
              if (bool) {
                f8 += f18 * f18;
              } else {
                f7 += f18 * f18;
              }
              f3 = f20 - paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * f8 - paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f7;
            }
            f1 = (paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] + paramArrayOfFloat3[(i1 - 1 + paramInt5)]) * f20 - paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f9;
            f2 = paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f20;
            if ((f3 != 0.0F ? 0 : 1) != 0)
            {
              if ((f1 != 0.0F ? 0 : 1) != 0) {
                if ((i ^ 0x1) != 0)
                {
                  if (bool) {
                    f1 = paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] * paramArrayOfFloat2[(paramInt2 - 1 + paramInt4)] + paramArrayOfFloat3[(i1 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * (f8 + f7);
                  } else {
                    f1 = paramArrayOfFloat2[(i1 - 1 + paramInt4)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * (f8 + f7);
                  }
                }
                else {
                  f1 = paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * paramArrayOfFloat3[(paramInt2 - 1 + paramInt5)] * f8 + paramArrayOfFloat3[(i1 - 1 + paramInt5)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] * f7;
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
            f18 = f16 + f15 + f13;
            if (i != 0)
            {
              f3 = f18 - paramArrayOfFloat3[(m - 1 + paramInt5)] * f8 - paramArrayOfFloat3[(n - 1 + paramInt5)] * f7;
              arrayOfFloat[(1 - 1)] = (paramArrayOfFloat3[(m - 1 + paramInt5)] * paramArrayOfFloat3[(m - 1 + paramInt5)] * f8);
              arrayOfFloat[(3 - 1)] = (paramArrayOfFloat3[(n - 1 + paramInt5)] * paramArrayOfFloat3[(n - 1 + paramInt5)] * f7);
            }
            else if (bool)
            {
              f19 = paramArrayOfFloat2[(m - 1 + paramInt4)] / paramArrayOfFloat3[(m - 1 + paramInt5)];
              f19 *= f19;
              f3 = f18 - paramArrayOfFloat3[(n - 1 + paramInt5)] * (f8 + f7) - (paramArrayOfFloat1[(m - 1 + paramInt3)] - paramArrayOfFloat1[(n - 1 + paramInt3)]) * f19;
              arrayOfFloat[(1 - 1)] = (paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat2[(m - 1 + paramInt4)]);
              arrayOfFloat[(3 - 1)] = (paramArrayOfFloat3[(n - 1 + paramInt5)] * paramArrayOfFloat3[(n - 1 + paramInt5)] * (f8 - f19 + f7));
            }
            else
            {
              f19 = paramArrayOfFloat2[(n - 1 + paramInt4)] / paramArrayOfFloat3[(n - 1 + paramInt5)];
              f19 *= f19;
              f3 = f18 - paramArrayOfFloat3[(m - 1 + paramInt5)] * (f8 + f7) - (paramArrayOfFloat1[(n - 1 + paramInt3)] - paramArrayOfFloat1[(m - 1 + paramInt3)]) * f19;
              arrayOfFloat[(1 - 1)] = (paramArrayOfFloat3[(m - 1 + paramInt5)] * paramArrayOfFloat3[(m - 1 + paramInt5)] * (f8 + (f7 - f19)));
              arrayOfFloat[(3 - 1)] = (paramArrayOfFloat2[(n - 1 + paramInt4)] * paramArrayOfFloat2[(n - 1 + paramInt4)]);
            }
            Slaed6.slaed6(i4, bool, f3, paramArrayOfFloat3, m - 1 + paramInt5, arrayOfFloat, 0, f20, localfloatW, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              break;
            }
          }
          if ((f20 * localfloatW.val < 0.0F ? 0 : 1) != 0) {
            localfloatW.val = (-(f20 / f9));
          }
          f18 = f17 + localfloatW.val;
          if ((f18 <= f6 ? 0 : 1) == 0) {}
          if (((f18 >= f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((f20 >= 0.0F ? 0 : 1) != 0) {
              localfloatW.val = ((f6 - f17) / 2.0F);
            } else {
              localfloatW.val = ((f5 - f17) / 2.0F);
            }
          }
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfFloat3[(i3 - 1 + paramInt5)] -= localfloatW.val;
            i3 += 1;
          }
          f17 += localfloatW.val;
          f14 = f20;
          f8 = 0.0F;
          f15 = 0.0F;
          f11 = 0.0F;
          i3 = 1;
          for (i6 = m - 1 + 1; i6 > 0; i6--)
          {
            f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
            f15 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
            f8 += f18 * f18;
            f11 += f15;
            i3 += 1;
          }
          f11 = Math.abs(f11);
          f7 = 0.0F;
          f13 = 0.0F;
          i3 = paramInt1;
          for (i6 = (n - paramInt1 + -1) / -1; i6 > 0; i6--)
          {
            f18 = paramArrayOfFloat2[(i3 - 1 + paramInt4)] / paramArrayOfFloat3[(i3 - 1 + paramInt5)];
            f13 += paramArrayOfFloat2[(i3 - 1 + paramInt4)] * f18;
            f7 += f18 * f18;
            f11 += f13;
            i3 += -1;
          }
          f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] / paramArrayOfFloat3[(k - 1 + paramInt5)];
          f9 = f8 + f7 + f18 * f18;
          f18 = paramArrayOfFloat2[(k - 1 + paramInt4)] * f18;
          f20 = f16 + f13 + f15 + f18;
          f11 = 8.0F * (f13 - f15) + f11 + 2.0F * f16 + 3.0F * Math.abs(f18) + Math.abs(f17) * f9;
          if ((f20 * f14 <= 0.0F ? 0 : 1) != 0) {}
          if (((Math.abs(f20) <= Math.abs(f14) / 10.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
            i ^= 0x1;
          }
          i4 += 1;
        }
        paramintW.val = 1;
        if (bool) {
          paramfloatW.val = (paramArrayOfFloat1[(paramInt2 - 1 + paramInt3)] + f17);
        } else {
          paramfloatW.val = (paramArrayOfFloat1[(i1 - 1 + paramInt3)] + f17);
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */