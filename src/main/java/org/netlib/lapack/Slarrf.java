package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slarrf
{
  public static void slarrf(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt10, float[] paramArrayOfFloat8, int paramInt11, float[] paramArrayOfFloat9, int paramInt12, intW paramintW)
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
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float f25 = 0.0F;
    paramintW.val = 0;
    f5 = (int)Math.pow(2, 1);
    f4 = Slamch.slamch("Precision");
    i5 = 0;
    j = 0;
    k = 1;
    f3 = Math.abs(paramArrayOfFloat4[(paramInt6 - 1 + paramInt7)] - paramArrayOfFloat4[(paramInt5 - 1 + paramInt7)]) + paramArrayOfFloat6[(paramInt6 - 1 + paramInt9)] + paramArrayOfFloat6[(paramInt5 - 1 + paramInt9)];
    f1 = f3 / (paramInt6 - paramInt5);
    f14 = Math.min(paramFloat2, paramFloat3);
    f11 = Math.min(paramArrayOfFloat4[(paramInt5 - 1 + paramInt7)], paramArrayOfFloat4[(paramInt6 - 1 + paramInt7)]) - paramArrayOfFloat6[(paramInt5 - 1 + paramInt9)];
    f21 = Math.max(paramArrayOfFloat4[(paramInt5 - 1 + paramInt7)], paramArrayOfFloat4[(paramInt6 - 1 + paramInt7)]) + paramArrayOfFloat6[(paramInt6 - 1 + paramInt9)];
    f11 -= Math.abs(f11) * 2.0F * f4;
    f21 += Math.abs(f21) * 2.0F * f4;
    f10 = 0.25F * f14 + 2.0F * paramFloat4;
    f18 = 0.25F * f14 + 2.0F * paramFloat4;
    f9 = Math.max(f1, paramArrayOfFloat5[(paramInt5 - 1 + paramInt8)]) / f5;
    f17 = Math.max(f1, paramArrayOfFloat5[(paramInt6 - 1 - 1 + paramInt8)]) / f5;
    f22 = Slamch.slamch("S");
    f23 = 1.0F / f22;
    f6 = (paramInt1 - 1) * f14 / (paramFloat1 * f4);
    f7 = (paramInt1 - 1) * f14 / (paramFloat1 * (float)Math.sqrt(f4));
    f2 = f11;
    i4 = 0;
    f8 = 8.0F * paramFloat1;
    for (;;)
    {
      m = 0;
      n = 0;
      f9 = Math.min(f10, f9);
      f17 = Math.min(f18, f17);
      f22 = -f11;
      paramArrayOfFloat1[(1 - 1 + paramInt2)] += f22;
      if ((Math.abs(paramArrayOfFloat7[(1 - 1 + paramInt10)]) >= paramFloat4 ? 0 : 1) != 0)
      {
        paramArrayOfFloat7[(1 - 1 + paramInt10)] = (-paramFloat4);
        m = 1;
      }
      f12 = Math.abs(paramArrayOfFloat7[(1 - 1 + paramInt10)]);
      i2 = 1;
      for (int i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfFloat3[(i2 - 1 + paramInt4)] /= paramArrayOfFloat7[(i2 - 1 + paramInt10)];
        f22 = f22 * paramArrayOfFloat8[(i2 - 1 + paramInt11)] * paramArrayOfFloat2[(i2 - 1 + paramInt3)] - f11;
        paramArrayOfFloat1[(i2 + 1 - 1 + paramInt2)] += f22;
        if ((Math.abs(paramArrayOfFloat7[(i2 + 1 - 1 + paramInt10)]) >= paramFloat4 ? 0 : 1) != 0)
        {
          paramArrayOfFloat7[(i2 + 1 - 1 + paramInt10)] = (-paramFloat4);
          m = 1;
        }
        f12 = Math.max(f12, Math.abs(paramArrayOfFloat7[(i2 + 1 - 1 + paramInt10)]));
        i2 += 1;
      }
      m = (m == 0) && (!Sisnan.sisnan(f12)) ? 0 : 1;
      if (j == 0) {
        if ((f12 > f8 ? 0 : 1) == 0) {}
      }
      if ((((m ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = f11;
        i5 = 1;
        break label1992;
      }
      f22 = -f21;
      paramArrayOfFloat1[(1 - 1 + paramInt2)] += f22;
      if ((Math.abs(paramArrayOfFloat9[(1 - 1 + paramInt12)]) >= paramFloat4 ? 0 : 1) != 0)
      {
        paramArrayOfFloat9[(1 - 1 + paramInt12)] = (-paramFloat4);
        n = 1;
      }
      f13 = Math.abs(paramArrayOfFloat9[(1 - 1 + paramInt12)]);
      i2 = 1;
      for (i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfFloat9[(paramInt1 + i2 - 1 + paramInt12)] = (paramArrayOfFloat3[(i2 - 1 + paramInt4)] / paramArrayOfFloat9[(i2 - 1 + paramInt12)]);
        f22 = f22 * paramArrayOfFloat9[(paramInt1 + i2 - 1 + paramInt12)] * paramArrayOfFloat2[(i2 - 1 + paramInt3)] - f21;
        paramArrayOfFloat1[(i2 + 1 - 1 + paramInt2)] += f22;
        if ((Math.abs(paramArrayOfFloat9[(i2 + 1 - 1 + paramInt12)]) >= paramFloat4 ? 0 : 1) != 0)
        {
          paramArrayOfFloat9[(i2 + 1 - 1 + paramInt12)] = (-paramFloat4);
          n = 1;
        }
        f13 = Math.max(f13, Math.abs(paramArrayOfFloat9[(i2 + 1 - 1 + paramInt12)]));
        i2 += 1;
      }
      n = (n == 0) && (!Sisnan.sisnan(f13)) ? 0 : 1;
      if (j == 0) {
        if ((f13 > f8 ? 0 : 1) == 0) {}
      }
      if ((((n ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = f21;
        i5 = 2;
        break label1992;
      }
      if (((m != 0) && (n != 0) ? 1 : 0) != 0)
      {
        break label1871;
      }
      else
      {
        if ((m ^ 0x1) != 0)
        {
          i3 = 1;
          if ((f12 > f23 ? 0 : 1) != 0)
          {
            f23 = f12;
            f2 = f11;
          }
        }
        if ((n ^ 0x1) != 0)
        {
          if (m == 0) {}
          if (((f13 > f12 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            i3 = 2;
          }
          if ((f13 > f23 ? 0 : 1) != 0)
          {
            f23 = f13;
            f2 = f21;
          }
        }
        if ((f3 >= f14 / '' ? 0 : 1) != 0) {}
        if (((Math.min(f12, f13) >= f7 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((m ^ 0x1) != 0 ? 1 : 0) != 0) {}
        if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
          i = 1;
        } else {
          i = 0;
        }
        i1 = 1;
        if (((i1 != 0) && (i != 0) ? 1 : 0) != 0) {
          if ((i3 != 1 ? 0 : 1) != 0)
          {
            f24 = Math.abs(paramArrayOfFloat7[(paramInt1 - 1 + paramInt10)]);
            f25 = 1.0F;
            f16 = 1.0F;
            f15 = 1.0F;
            i2 = paramInt1 - 1;
            for (i6 = (1 - (paramInt1 - 1) + -1) / -1; i6 > 0; i6--)
            {
              if ((f16 > f4 ? 0 : 1) != 0) {
                f16 = paramArrayOfFloat7[(i2 + 1 - 1 + paramInt10)] * paramArrayOfFloat9[(paramInt1 + i2 + 1 - 1 + paramInt12)] / (paramArrayOfFloat7[(i2 - 1 + paramInt10)] * paramArrayOfFloat9[(paramInt1 + i2 - 1 + paramInt12)]) * f15;
              } else {
                f16 *= Math.abs(paramArrayOfFloat9[(paramInt1 + i2 - 1 + paramInt12)]);
              }
              f15 = f16;
              f25 += (float)Math.pow(f16, 2);
              f24 = Math.max(f24, Math.abs(paramArrayOfFloat7[(i2 - 1 + paramInt10)] * f16));
              i2 += -1;
            }
            f19 = f24 / (paramFloat1 * (float)Math.sqrt(f25));
            if ((f19 > 8.0F ? 0 : 1) != 0)
            {
              paramfloatW.val = f11;
              i5 = 1;
              break label1992;
            }
          }
          else if ((i3 != 2 ? 0 : 1) != 0)
          {
            f24 = Math.abs(paramArrayOfFloat9[(paramInt1 - 1 + paramInt12)]);
            f25 = 1.0F;
            f16 = 1.0F;
            f15 = 1.0F;
            i2 = paramInt1 - 1;
            for (i6 = (1 - (paramInt1 - 1) + -1) / -1; i6 > 0; i6--)
            {
              if ((f16 > f4 ? 0 : 1) != 0) {
                f16 = paramArrayOfFloat9[(i2 + 1 - 1 + paramInt12)] * paramArrayOfFloat8[(i2 + 1 - 1 + paramInt11)] / (paramArrayOfFloat9[(i2 - 1 + paramInt12)] * paramArrayOfFloat8[(i2 - 1 + paramInt11)]) * f15;
              } else {
                f16 *= Math.abs(paramArrayOfFloat8[(i2 - 1 + paramInt11)]);
              }
              f15 = f16;
              f25 += (float)Math.pow(f16, 2);
              f24 = Math.max(f24, Math.abs(paramArrayOfFloat9[(i2 - 1 + paramInt12)] * f16));
              i2 += -1;
            }
            f20 = f24 / (paramFloat1 * (float)Math.sqrt(f25));
            if ((f20 > 8.0F ? 0 : 1) != 0)
            {
              paramfloatW.val = f21;
              i5 = 2;
              break label1992;
            }
          }
        }
      }
      label1871:
      if ((i4 >= 1 ? 0 : 1) != 0)
      {
        f11 = Math.max(f11 - f9, f11 - f10);
        f21 = Math.min(f21 + f17, f21 + f18);
        f9 = 2.0F * f9;
        f17 = 2.0F * f17;
        i4 += 1;
      }
      else
      {
        if ((f23 >= f6 ? 0 : 1) == 0) {}
        if ((k == 0 ? 0 : 1) == 0) {
          break;
        }
        f11 = f2;
        f21 = f2;
        j = 1;
      }
    }
    paramintW.val = 1;
    return;
    label1992:
    if ((i5 != 1 ? 0 : 1) == 0) {
      if ((i5 != 2 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat9, paramInt12, 1, paramArrayOfFloat7, paramInt10, 1);
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat9, paramInt1 + 1 - 1 + paramInt12, 1, paramArrayOfFloat8, paramInt11, 1);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */