package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slalsd
{
  public static void slalsd(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float paramFloat, intW paramintW1, float[] paramArrayOfFloat4, int paramInt8, int[] paramArrayOfInt, int paramInt9, intW paramintW2)
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
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f3 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f4 = 0.0F;
    paramintW2.val = 0;
    if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -3;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -4;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt7 >= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -8;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLALSD", -paramintW2.val);
      return;
    }
    f1 = Slamch.slamch("Epsilon");
    if ((paramFloat > 0.0F ? 0 : 1) == 0) {}
    if (((paramFloat < 1.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
      f3 = f1;
    } else {
      f3 = paramFloat;
    }
    paramintW1.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfFloat1[(1 - 1 + paramInt4)] != 0.0F ? 0 : 1) != 0)
      {
        Slaset.slaset("A", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
      }
      else
      {
        paramintW1.val = 1;
        Slascl.slascl("G", 0, 0, paramArrayOfFloat1[(1 - 1 + paramInt4)], 1.0F, 1, paramInt3, paramArrayOfFloat3, paramInt6, paramInt7, paramintW2);
        paramArrayOfFloat1[(1 - 1 + paramInt4)] = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt4)]);
      }
      return;
    }
    if (paramString.regionMatches(0, "L", 0, 1))
    {
      i4 = 1;
      for (i26 = paramInt2 - 1 - 1 + 1; i26 > 0; i26--)
      {
        Slartg.slartg(paramArrayOfFloat1[(i4 - 1 + paramInt4)], paramArrayOfFloat2[(i4 - 1 + paramInt5)], localfloatW1, localfloatW3, localfloatW2);
        paramArrayOfFloat1[(i4 - 1 + paramInt4)] = localfloatW2.val;
        paramArrayOfFloat2[(i4 - 1 + paramInt5)] = (localfloatW3.val * paramArrayOfFloat1[(i4 + 1 - 1 + paramInt4)]);
        paramArrayOfFloat1[(i4 + 1 - 1 + paramInt4)] = (localfloatW1.val * paramArrayOfFloat1[(i4 + 1 - 1 + paramInt4)]);
        if ((paramInt3 != 1 ? 0 : 1) != 0)
        {
          Srot.srot(1, paramArrayOfFloat3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, i4 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, localfloatW1.val, localfloatW3.val);
        }
        else
        {
          paramArrayOfFloat4[(i4 * 2 - 1 - 1 + paramInt8)] = localfloatW1.val;
          paramArrayOfFloat4[(i4 * 2 - 1 + paramInt8)] = localfloatW3.val;
        }
        i4 += 1;
      }
      if ((paramInt3 <= 1 ? 0 : 1) != 0)
      {
        i4 = 1;
        for (i26 = paramInt3 - 1 + 1; i26 > 0; i26--)
        {
          i8 = 1;
          for (int i27 = paramInt2 - 1 - 1 + 1; i27 > 0; i27--)
          {
            localfloatW1.val = paramArrayOfFloat4[(i8 * 2 - 1 - 1 + paramInt8)];
            localfloatW3.val = paramArrayOfFloat4[(i8 * 2 - 1 + paramInt8)];
            Srot.srot(1, paramArrayOfFloat3, i8 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, i8 + 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, localfloatW1.val, localfloatW3.val);
            i8 += 1;
          }
          i4 += 1;
        }
      }
    }
    i11 = paramInt2 - 1;
    f2 = Slanst.slanst("M", paramInt2, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5);
    if ((f2 != 0.0F ? 0 : 1) != 0)
    {
      Slaset.slaset("A", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
      return;
    }
    Slascl.slascl("G", 0, 0, f2, 1.0F, paramInt2, 1, paramArrayOfFloat1, paramInt4, paramInt2, paramintW2);
    Slascl.slascl("G", 0, 0, f2, 1.0F, i11, 1, paramArrayOfFloat2, paramInt5, i11, paramintW2);
    if ((paramInt2 > paramInt1 ? 0 : 1) != 0)
    {
      i14 = 1 + paramInt2 * paramInt2;
      Slaset.slaset("A", paramInt2, paramInt2, 0.0F, 1.0F, paramArrayOfFloat4, paramInt8, paramInt2);
      Slasdq.slasdq("U", 0, paramInt2, paramInt2, 0, paramInt3, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat4, paramInt8, paramInt2, paramArrayOfFloat4, paramInt8, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, i14 - 1 + paramInt8, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0) {
        return;
      }
      f4 = f3 * Math.abs(paramArrayOfFloat1[(org.netlib.blas.Isamax.isamax(paramInt2, paramArrayOfFloat1, paramInt4, 1) - 1 + paramInt4)]);
      i4 = 1;
      for (i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
      {
        if ((paramArrayOfFloat1[(i4 - 1 + paramInt4)] > f4 ? 0 : 1) != 0)
        {
          Slaset.slaset("A", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
        else
        {
          Slascl.slascl("G", 0, 0, paramArrayOfFloat1[(i4 - 1 + paramInt4)], 1.0F, 1, paramInt3, paramArrayOfFloat3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramintW2);
          paramintW1.val += 1;
        }
        i4 += 1;
      }
      Sgemm.sgemm("T", "N", paramInt2, paramInt3, paramInt2, 1.0F, paramArrayOfFloat4, paramInt8, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, i14 - 1 + paramInt8, paramInt2);
      Slacpy.slacpy("A", paramInt2, paramInt3, paramArrayOfFloat4, i14 - 1 + paramInt8, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7);
      Slascl.slascl("G", 0, 0, 1.0F, f2, paramInt2, 1, paramArrayOfFloat1, paramInt4, paramInt2, paramintW2);
      Slasrt.slasrt("D", paramInt2, paramArrayOfFloat1, paramInt4, paramintW2);
      Slascl.slascl("G", 0, 0, f2, 1.0F, paramInt2, paramInt3, paramArrayOfFloat3, paramInt6, paramInt7, paramintW2);
      return;
    }
    i10 = (int)((float)Math.log(paramInt2 / (paramInt1 + 1)) / (float)Math.log(2.0F)) + 1;
    i19 = paramInt1 + 1;
    i23 = 1;
    i24 = 1 + paramInt1 * paramInt2;
    m = i24 + i19 * paramInt2;
    n = m + i10 * paramInt2;
    i25 = n + i10 * paramInt2 * 2;
    k = i25 + i10 * paramInt2;
    i17 = k + paramInt2;
    i16 = i17 + paramInt2;
    i2 = i16 + 2 * i10 * paramInt2;
    i = i2 + 2 * i10 * paramInt2;
    i14 = i + paramInt2 * paramInt3;
    i18 = 1 + paramInt2;
    i9 = i18 + paramInt2;
    i3 = i9 + paramInt2;
    i15 = i3 + paramInt2;
    i1 = i15 + i10 * paramInt2;
    i7 = i1 + i10 * paramInt2 * 2;
    i21 = 1;
    i20 = 0;
    i5 = 1;
    i6 = 0;
    i13 = 0;
    i4 = 1;
    for (int i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt4)]) >= f1 ? 0 : 1) != 0) {
        paramArrayOfFloat1[(i4 - 1 + paramInt4)] = Util.sign(f1, paramArrayOfFloat1[(i4 - 1 + paramInt4)]);
      }
      i4 += 1;
    }
    i4 = 1;
    for (i26 = i11 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfFloat2[(i4 - 1 + paramInt5)]) >= f1 ? 0 : 1) == 0) {}
      if (((i4 != i11 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i13 += 1;
        paramArrayOfInt[(i13 - 1 + paramInt9)] = i21;
        if ((i4 >= i11 ? 0 : 1) != 0)
        {
          i12 = i4 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
        }
        else if ((Math.abs(paramArrayOfFloat2[(i4 - 1 + paramInt5)]) < f1 ? 0 : 1) != 0)
        {
          i12 = paramInt2 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
        }
        else
        {
          i12 = i4 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
          i13 += 1;
          paramArrayOfInt[(i13 - 1 + paramInt9)] = paramInt2;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = 1;
          Scopy.scopy(paramInt3, paramArrayOfFloat3, paramInt2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i + i11 - 1 + paramInt8, paramInt2);
        }
        i22 = i21 - 1;
        if ((i12 != 1 ? 0 : 1) != 0)
        {
          Scopy.scopy(paramInt3, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i + i22 - 1 + paramInt8, paramInt2);
        }
        else if ((i12 > paramInt1 ? 0 : 1) != 0)
        {
          Slaset.slaset("A", i12, i12, 0.0F, 1.0F, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramInt2);
          Slasdq.slasdq("U", 0, i12, i12, 0, paramInt3, paramArrayOfFloat1, i21 - 1 + paramInt4, paramArrayOfFloat2, i21 - 1 + paramInt5, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramInt2, paramArrayOfFloat4, i14 - 1 + paramInt8, paramInt2, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i14 - 1 + paramInt8, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
          Slacpy.slacpy("A", i12, paramInt3, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i + i22 - 1 + paramInt8, paramInt2);
        }
        else
        {
          Slasda.slasda(i5, paramInt1, i12, i20, paramArrayOfFloat1, i21 - 1 + paramInt4, paramArrayOfFloat2, i21 - 1 + paramInt5, paramArrayOfFloat4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfFloat4, m + i22 - 1 + paramInt8, paramArrayOfFloat4, n + i22 - 1 + paramInt8, paramArrayOfFloat4, i25 + i22 - 1 + paramInt8, paramArrayOfFloat4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfFloat4, i2 + i22 - 1 + paramInt8, paramArrayOfFloat4, k + i22 - 1 + paramInt8, paramArrayOfFloat4, i17 + i22 - 1 + paramInt8, paramArrayOfFloat4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
          j = i + i22;
          Slalsa.slalsa(i6, paramInt1, i12, paramInt3, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, j - 1 + paramInt8, paramInt2, paramArrayOfFloat4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfFloat4, m + i22 - 1 + paramInt8, paramArrayOfFloat4, n + i22 - 1 + paramInt8, paramArrayOfFloat4, i25 + i22 - 1 + paramInt8, paramArrayOfFloat4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfFloat4, i2 + i22 - 1 + paramInt8, paramArrayOfFloat4, k + i22 - 1 + paramInt8, paramArrayOfFloat4, i17 + i22 - 1 + paramInt8, paramArrayOfFloat4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        i21 = i4 + 1;
      }
      i4 += 1;
    }
    f4 = f3 * Math.abs(paramArrayOfFloat1[(org.netlib.blas.Isamax.isamax(paramInt2, paramArrayOfFloat1, paramInt4, 1) - 1 + paramInt4)]);
    i4 = 1;
    for (i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt4)]) > f4 ? 0 : 1) != 0)
      {
        Slaset.slaset("A", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat4, i + i4 - 1 - 1 + paramInt8, paramInt2);
      }
      else
      {
        paramintW1.val += 1;
        Slascl.slascl("G", 0, 0, paramArrayOfFloat1[(i4 - 1 + paramInt4)], 1.0F, 1, paramInt3, paramArrayOfFloat4, i + i4 - 1 - 1 + paramInt8, paramInt2, paramintW2);
      }
      paramArrayOfFloat1[(i4 - 1 + paramInt4)] = Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt4)]);
      i4 += 1;
    }
    i6 = 1;
    i4 = 1;
    for (i26 = i13 - 1 + 1; i26 > 0; i26--)
    {
      i21 = paramArrayOfInt[(i4 - 1 + paramInt9)];
      i22 = i21 - 1;
      i12 = paramArrayOfInt[(i18 + i4 - 1 - 1 + paramInt9)];
      j = i + i22;
      if ((i12 != 1 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt3, paramArrayOfFloat4, j - 1 + paramInt8, paramInt2, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      else if ((i12 > paramInt1 ? 0 : 1) != 0)
      {
        Sgemm.sgemm("T", "N", i12, paramInt3, i12, 1.0F, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramInt2, paramArrayOfFloat4, j - 1 + paramInt8, paramInt2, 0.0F, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      else
      {
        Slalsa.slalsa(i6, paramInt1, i12, paramInt3, paramArrayOfFloat4, j - 1 + paramInt8, paramInt2, paramArrayOfFloat3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfFloat4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfFloat4, m + i22 - 1 + paramInt8, paramArrayOfFloat4, n + i22 - 1 + paramInt8, paramArrayOfFloat4, i25 + i22 - 1 + paramInt8, paramArrayOfFloat4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfFloat4, i2 + i22 - 1 + paramInt8, paramArrayOfFloat4, k + i22 - 1 + paramInt8, paramArrayOfFloat4, i17 + i22 - 1 + paramInt8, paramArrayOfFloat4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          return;
        }
      }
      i4 += 1;
    }
    Slascl.slascl("G", 0, 0, 1.0F, f2, paramInt2, 1, paramArrayOfFloat1, paramInt4, paramInt2, paramintW2);
    Slasrt.slasrt("D", paramInt2, paramArrayOfFloat1, paramInt4, paramintW2);
    Slascl.slascl("G", 0, 0, f2, 1.0F, paramInt2, paramInt3, paramArrayOfFloat3, paramInt6, paramInt7, paramintW2);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slalsd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */