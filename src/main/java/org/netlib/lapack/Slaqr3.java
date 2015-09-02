package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaqr3
{
  public static void slaqr3(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float[] paramArrayOfFloat2, int paramInt9, int paramInt10, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat3, int paramInt11, float[] paramArrayOfFloat4, int paramInt12, float[] paramArrayOfFloat5, int paramInt13, int paramInt14, int paramInt15, float[] paramArrayOfFloat6, int paramInt16, int paramInt17, int paramInt18, float[] paramArrayOfFloat7, int paramInt19, int paramInt20, float[] paramArrayOfFloat8, int paramInt21, int paramInt22)
  {
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW7 = new floatW(0.0F);
    floatW localfloatW8 = new floatW(0.0F);
    float f5 = 0.0F;
    floatW localfloatW9 = new floatW(0.0F);
    floatW localfloatW10 = new floatW(0.0F);
    float f6 = 0.0F;
    int i = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
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
    int i12 = 0;
    k = Math.min(paramInt4, paramInt3 - paramInt2 + 1);
    if ((k > 2 ? 0 : 1) != 0)
    {
      i9 = 1;
    }
    else
    {
      Sgehrd.sgehrd(k, 1, k - 1, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, paramInt21, paramArrayOfFloat8, paramInt21, -1, localintW3);
      i6 = (int)paramArrayOfFloat8[(1 - 1 + paramInt21)];
      Sorghr.sorghr(k, 1, k - 1, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, paramInt21, paramArrayOfFloat8, paramInt21, -1, localintW3);
      i7 = (int)paramArrayOfFloat8[(1 - 1 + paramInt21)];
      Slaqr4.slaqr4(true, true, k, 1, k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat3, paramInt11, paramArrayOfFloat4, paramInt12, 1, k, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat8, paramInt21, -1, localintW4);
      i8 = (int)paramArrayOfFloat8[(1 - 1 + paramInt21)];
      i9 = Math.max(k + Math.max(i6, i7), i8);
    }
    if ((paramInt22 != -1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat8[(1 - 1 + paramInt21)] = i9;
      return;
    }
    paramintW1.val = 0;
    paramintW2.val = 0;
    if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt4 >= 1 ? 0 : 1) != 0) {
      return;
    }
    localfloatW8.val = Slamch.slamch("SAFE MINIMUM");
    localfloatW7.val = (1.0F / localfloatW8.val);
    Slabad.slabad(localfloatW8, localfloatW7);
    f6 = Slamch.slamch("PRECISION");
    f5 = localfloatW8.val * (paramInt1 / f6);
    k = Math.min(paramInt4, paramInt3 - paramInt2 + 1);
    i4 = paramInt3 - k + 1;
    if ((i4 != paramInt2 ? 0 : 1) != 0) {
      f4 = 0.0F;
    } else {
      f4 = paramArrayOfFloat1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)];
    }
    if ((paramInt3 != i4 ? 0 : 1) != 0)
    {
      paramArrayOfFloat3[(i4 - 1 + paramInt11)] = paramArrayOfFloat1[(i4 - 1 + (i4 - 1) * paramInt6 + paramInt5)];
      paramArrayOfFloat4[(i4 - 1 + paramInt12)] = 0.0F;
      paramintW1.val = 1;
      paramintW2.val = 0;
      if ((Math.abs(f4) > Math.max(f5, f6 * Math.abs(paramArrayOfFloat1[(i4 - 1 + (i4 - 1) * paramInt6 + paramInt5)])) ? 0 : 1) != 0)
      {
        paramintW1.val = 0;
        paramintW2.val = 1;
        if ((i4 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfFloat1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)] = 0.0F;
        }
      }
      return;
    }
    Slacpy.slacpy("U", k, k, paramArrayOfFloat1, i4 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat6, paramInt16, paramInt17);
    Scopy.scopy(k - 1, paramArrayOfFloat1, i4 + 1 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6 + 1, paramArrayOfFloat6, 2 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17 + 1);
    Slaset.slaset("A", k, k, 0.0F, 1.0F, paramArrayOfFloat5, paramInt13, paramInt14);
    i10 = Ilaenv.ilaenv(12, "SLAQR3", "SV", k, 1, k, paramInt22);
    if ((k <= i10 ? 0 : 1) != 0) {
      Slaqr4.slaqr4(true, true, k, 1, k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat3, i4 - 1 + paramInt11, paramArrayOfFloat4, i4 - 1 + paramInt12, 1, k, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat8, paramInt21, paramInt22, localintW4);
    } else {
      Slahqr.slahqr(true, true, k, 1, k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat3, i4 - 1 + paramInt11, paramArrayOfFloat4, i4 - 1 + paramInt12, 1, k, paramArrayOfFloat5, paramInt13, paramInt14, localintW4);
    }
    j = 1;
    for (int i13 = k - 3 - 1 + 1; i13 > 0; i13--)
    {
      paramArrayOfFloat6[(j + 2 - 1 + (j - 1) * paramInt17 + paramInt16)] = 0.0F;
      paramArrayOfFloat6[(j + 3 - 1 + (j - 1) * paramInt17 + paramInt16)] = 0.0F;
      j += 1;
    }
    if ((k <= 2 ? 0 : 1) != 0) {
      paramArrayOfFloat6[(k - 1 + (k - 2 - 1) * paramInt17 + paramInt16)] = 0.0F;
    }
    paramintW1.val = k;
    localintW4.val += 1;
    while ((localintW2.val > paramintW1.val ? 0 : 1) != 0)
    {
      if ((paramintW1.val != 1 ? 0 : 1) != 0) {
        i11 = 0;
      } else {
        i11 = paramArrayOfFloat6[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt17 + paramInt16)] == 0.0F ? 0 : 1;
      }
      if ((i11 ^ 0x1) != 0)
      {
        f3 = Math.abs(paramArrayOfFloat6[(paramintW1.val - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]);
        if ((f3 != 0.0F ? 0 : 1) != 0) {
          f3 = Math.abs(f4);
        }
        if ((Math.abs(f4 * paramArrayOfFloat5[(1 - 1 + (paramintW1.val - 1) * paramInt14 + paramInt13)]) > Math.max(f5, f6 * f3) ? 0 : 1) != 0)
        {
          paramintW1.val -= 1;
        }
        else
        {
          localintW1.val = paramintW1.val;
          Strexc.strexc("V", k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfFloat8, paramInt21, localintW3);
          localintW2.val += 1;
        }
      }
      else
      {
        f3 = Math.abs(paramArrayOfFloat6[(paramintW1.val - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]) + (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt17 + paramInt16)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(paramintW1.val - 1 - 1 + (paramintW1.val - 1) * paramInt17 + paramInt16)]));
        if ((f3 != 0.0F ? 0 : 1) != 0) {
          f3 = Math.abs(f4);
        }
        if ((Math.max(Math.abs(f4 * paramArrayOfFloat5[(1 - 1 + (paramintW1.val - 1) * paramInt14 + paramInt13)]), Math.abs(f4 * paramArrayOfFloat5[(1 - 1 + (paramintW1.val - 1 - 1) * paramInt14 + paramInt13)])) > Math.max(f5, f6 * f3) ? 0 : 1) != 0)
        {
          paramintW1.val -= 2;
        }
        else
        {
          localintW1.val = paramintW1.val;
          Strexc.strexc("V", k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfFloat8, paramInt21, localintW3);
          localintW2.val += 2;
        }
      }
    }
    if ((paramintW1.val != 0 ? 0 : 1) != 0) {
      f4 = 0.0F;
    }
    if ((paramintW1.val >= k ? 0 : 1) != 0)
    {
      i12 = 0;
      i = paramintW1.val + 1;
      while (i12 == 0)
      {
        i12 = 1;
        i1 = i - 1;
        i = localintW4.val + 1;
        if ((i != paramintW1.val ? 0 : 1) != 0) {
          m = i + 1;
        } else if ((paramArrayOfFloat6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)] != 0.0F ? 0 : 1) != 0) {
          m = i + 1;
        } else {
          m = i + 2;
        }
        while ((m > i1 ? 0 : 1) != 0)
        {
          if ((m != i + 1 ? 0 : 1) != 0) {
            f1 = Math.abs(paramArrayOfFloat6[(i - 1 + (i - 1) * paramInt17 + paramInt16)]);
          } else {
            f1 = Math.abs(paramArrayOfFloat6[(i - 1 + (i - 1) * paramInt17 + paramInt16)]) + (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(i - 1 + (i + 1 - 1) * paramInt17 + paramInt16)]));
          }
          if ((m != i1 ? 0 : 1) != 0) {
            f2 = Math.abs(paramArrayOfFloat6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]);
          } else if ((paramArrayOfFloat6[(m + 1 - 1 + (m - 1) * paramInt17 + paramInt16)] != 0.0F ? 0 : 1) != 0) {
            f2 = Math.abs(paramArrayOfFloat6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]);
          } else {
            f2 = Math.abs(paramArrayOfFloat6[(m - 1 + (m - 1) * paramInt17 + paramInt16)]) + (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(m + 1 - 1 + (m - 1) * paramInt17 + paramInt16)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(m - 1 + (m + 1 - 1) * paramInt17 + paramInt16)]));
          }
          if ((f1 < f2 ? 0 : 1) != 0)
          {
            i = m;
          }
          else
          {
            i12 = 0;
            localintW1.val = i;
            localintW2.val = m;
            Strexc.strexc("V", k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat5, paramInt13, paramInt14, localintW1, localintW2, paramArrayOfFloat8, paramInt21, localintW3);
            if ((localintW3.val != 0 ? 0 : 1) != 0) {
              i = localintW2.val;
            } else {
              i = m;
            }
          }
          if ((i != i1 ? 0 : 1) != 0) {
            m = i + 1;
          } else if ((paramArrayOfFloat6[(i + 1 - 1 + (i - 1) * paramInt17 + paramInt16)] != 0.0F ? 0 : 1) != 0) {
            m = i + 1;
          } else {
            m = i + 2;
          }
        }
      }
    }
    i = k;
    while ((i < localintW4.val + 1 ? 0 : 1) != 0) {
      if ((i != localintW4.val + 1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(i4 + i - 1 - 1 + paramInt11)] = paramArrayOfFloat6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        paramArrayOfFloat4[(i4 + i - 1 - 1 + paramInt12)] = 0.0F;
        i -= 1;
      }
      else if ((paramArrayOfFloat6[(i - 1 + (i - 1 - 1) * paramInt17 + paramInt16)] != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(i4 + i - 1 - 1 + paramInt11)] = paramArrayOfFloat6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        paramArrayOfFloat4[(i4 + i - 1 - 1 + paramInt12)] = 0.0F;
        i -= 1;
      }
      else
      {
        localfloatW1.val = paramArrayOfFloat6[(i - 1 - 1 + (i - 1 - 1) * paramInt17 + paramInt16)];
        localfloatW4.val = paramArrayOfFloat6[(i - 1 + (i - 1 - 1) * paramInt17 + paramInt16)];
        localfloatW2.val = paramArrayOfFloat6[(i - 1 - 1 + (i - 1) * paramInt17 + paramInt16)];
        localfloatW6.val = paramArrayOfFloat6[(i - 1 + (i - 1) * paramInt17 + paramInt16)];
        slanv2_adapter(localfloatW1, localfloatW2, localfloatW4, localfloatW6, paramArrayOfFloat3, i4 + i - 2 - 1 + paramInt11, paramArrayOfFloat4, i4 + i - 2 - 1 + paramInt12, paramArrayOfFloat3, i4 + i - 1 - 1 + paramInt11, paramArrayOfFloat4, i4 + i - 1 - 1 + paramInt12, localfloatW5, localfloatW9);
        i -= 2;
      }
    }
    if ((paramintW1.val >= k ? 0 : 1) == 0) {}
    if (((f4 != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if ((paramintW1.val <= 1 ? 0 : 1) != 0) {}
      if (((f4 == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Scopy.scopy(paramintW1.val, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat8, paramInt21, 1);
        localfloatW3.val = paramArrayOfFloat8[(1 - 1 + paramInt21)];
        Slarfg.slarfg(paramintW1.val, localfloatW3, paramArrayOfFloat8, 2 - 1 + paramInt21, 1, localfloatW10);
        paramArrayOfFloat8[(1 - 1 + paramInt21)] = 1.0F;
        Slaset.slaset("L", k - 2, k - 2, 0.0F, 0.0F, paramArrayOfFloat6, 3 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17);
        Slarf.slarf("L", paramintW1.val, k, paramArrayOfFloat8, paramInt21, 1, localfloatW10.val, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, k + 1 - 1 + paramInt21);
        Slarf.slarf("R", paramintW1.val, paramintW1.val, paramArrayOfFloat8, paramInt21, 1, localfloatW10.val, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, k + 1 - 1 + paramInt21);
        Slarf.slarf("R", k, paramintW1.val, paramArrayOfFloat8, paramInt21, 1, localfloatW10.val, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat8, k + 1 - 1 + paramInt21);
        Sgehrd.sgehrd(k, 1, paramintW1.val, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, paramInt21, paramArrayOfFloat8, k + 1 - 1 + paramInt21, paramInt22 - k, localintW3);
      }
      if ((i4 <= 1 ? 0 : 1) != 0) {
        paramArrayOfFloat1[(i4 - 1 + (i4 - 1 - 1) * paramInt6 + paramInt5)] = (f4 * paramArrayOfFloat5[(1 - 1 + (1 - 1) * paramInt14 + paramInt13)]);
      }
      Slacpy.slacpy("U", k, k, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat1, i4 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6);
      Scopy.scopy(k - 1, paramArrayOfFloat6, 2 - 1 + (1 - 1) * paramInt17 + paramInt16, paramInt17 + 1, paramArrayOfFloat1, i4 + 1 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6 + 1);
      if ((paramintW1.val <= 1 ? 0 : 1) != 0) {}
      if (((f4 == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Sorghr.sorghr(k, 1, paramintW1.val, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat8, paramInt21, paramArrayOfFloat8, k + 1 - 1 + paramInt21, paramInt22 - k, localintW3);
        Sgemm.sgemm("N", "N", k, paramintW1.val, paramintW1.val, 1.0F, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat6, paramInt16, paramInt17, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
        Slacpy.slacpy("A", k, paramintW1.val, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat5, paramInt13, paramInt14);
      }
      if (paramBoolean1) {
        i5 = 1;
      } else {
        i5 = paramInt2;
      }
      i3 = i5;
      for (int i13 = (i4 - 1 - i5 + paramInt18) / paramInt18; i13 > 0; i13--)
      {
        i2 = Math.min(paramInt18, i4 - i3);
        Sgemm.sgemm("N", "N", i2, k, k, 1.0F, paramArrayOfFloat1, i3 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat5, paramInt13, paramInt14, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
        Slacpy.slacpy("A", i2, k, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat1, i3 - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6);
        i3 += paramInt18;
      }
      if (paramBoolean1)
      {
        n = paramInt3 + 1;
        for (int i13 = (paramInt1 - (paramInt3 + 1) + paramInt15) / paramInt15; i13 > 0; i13--)
        {
          i2 = Math.min(paramInt15, paramInt1 - n + 1);
          Sgemm.sgemm("C", "N", k, i2, k, 1.0F, paramArrayOfFloat5, paramInt13, paramInt14, paramArrayOfFloat1, i4 - 1 + (n - 1) * paramInt6 + paramInt5, paramInt6, 0.0F, paramArrayOfFloat6, paramInt16, paramInt17);
          Slacpy.slacpy("A", k, i2, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat1, i4 - 1 + (n - 1) * paramInt6 + paramInt5, paramInt6);
          n += paramInt15;
        }
      }
      if (paramBoolean2)
      {
        i3 = paramInt7;
        for (int i13 = (paramInt8 - paramInt7 + paramInt18) / paramInt18; i13 > 0; i13--)
        {
          i2 = Math.min(paramInt18, paramInt8 - i3 + 1);
          Sgemm.sgemm("N", "N", i2, k, k, 1.0F, paramArrayOfFloat2, i3 - 1 + (i4 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat5, paramInt13, paramInt14, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
          Slacpy.slacpy("A", i2, k, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat2, i3 - 1 + (i4 - 1) * paramInt10 + paramInt9, paramInt10);
          i3 += paramInt18;
        }
      }
    }
    paramintW2.val = (k - paramintW1.val);
    paramintW1.val -= localintW4.val;
    paramArrayOfFloat8[(1 - 1 + paramInt21)] = i9;
  }
  
  private static void slanv2_adapter(floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float[] paramArrayOfFloat3, int paramInt3, float[] paramArrayOfFloat4, int paramInt4, floatW paramfloatW5, floatW paramfloatW6)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    floatW localfloatW3 = new floatW(paramArrayOfFloat3[paramInt3]);
    floatW localfloatW4 = new floatW(paramArrayOfFloat4[paramInt4]);
    Slanv2.slanv2(paramfloatW1, paramfloatW2, paramfloatW3, paramfloatW4, localfloatW1, localfloatW2, localfloatW3, localfloatW4, paramfloatW5, paramfloatW6);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
    paramArrayOfFloat3[paramInt3] = localfloatW3.val;
    paramArrayOfFloat4[paramInt4] = localfloatW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqr3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */