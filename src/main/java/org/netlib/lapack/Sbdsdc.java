package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sbdsdc
{
  public static void sbdsdc(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, int[] paramArrayOfInt1, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW = new intW(0);
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
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    paramintW.val = 0;
    i7 = 0;
    if (Lsame.lsame(paramString1, "U")) {
      i7 = 1;
    }
    if (Lsame.lsame(paramString1, "L")) {
      i7 = 2;
    }
    if (Lsame.lsame(paramString2, "N")) {
      i3 = 0;
    } else if (Lsame.lsame(paramString2, "P")) {
      i3 = 1;
    } else if (Lsame.lsame(paramString2, "I")) {
      i3 = 2;
    } else {
      i3 = -1;
    }
    if ((i7 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((i3 != 2 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {
          if ((i3 != 2 ? 0 : 1) == 0) {}
        }
        if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -9;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SBDSDC", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i18 = Ilaenv.ilaenv(9, "SBDSDC", " ", 0, 0, 0, 0);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat5[(1 - 1 + paramInt8)] = Util.sign(1.0F, paramArrayOfFloat1[(1 - 1 + paramInt2)]);
        paramArrayOfFloat5[(1 + i18 * paramInt1 - 1 + paramInt8)] = 1.0F;
      }
      else if ((i3 != 2 ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = Util.sign(1.0F, paramArrayOfFloat1[(1 - 1 + paramInt2)]);
        paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 1.0F;
      }
      paramArrayOfFloat1[(1 - 1 + paramInt2)] = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]);
      return;
    }
    i13 = paramInt1 - 1;
    i22 = 1;
    i17 = 3;
    if ((i3 != 1 ? 0 : 1) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat5, 1 - 1 + paramInt8, 1);
      Scopy.scopy(paramInt1 - 1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat5, paramInt1 + 1 - 1 + paramInt8, 1);
    }
    if ((i7 != 2 ? 0 : 1) != 0)
    {
      i17 = 5;
      i22 = 2 * paramInt1 - 1;
      i1 = 1;
      for (i24 = paramInt1 - 1 - 1 + 1; i24 > 0; i24--)
      {
        Slartg.slartg(paramArrayOfFloat1[(i1 - 1 + paramInt2)], paramArrayOfFloat2[(i1 - 1 + paramInt3)], localfloatW1, localfloatW3, localfloatW2);
        paramArrayOfFloat1[(i1 - 1 + paramInt2)] = localfloatW2.val;
        paramArrayOfFloat2[(i1 - 1 + paramInt3)] = (localfloatW3.val * paramArrayOfFloat1[(i1 + 1 - 1 + paramInt2)]);
        paramArrayOfFloat1[(i1 + 1 - 1 + paramInt2)] = (localfloatW1.val * paramArrayOfFloat1[(i1 + 1 - 1 + paramInt2)]);
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i1 + 2 * paramInt1 - 1 + paramInt8)] = localfloatW1.val;
          paramArrayOfFloat5[(i1 + 3 * paramInt1 - 1 + paramInt8)] = localfloatW3.val;
        }
        else if ((i3 != 2 ? 0 : 1) != 0)
        {
          paramArrayOfFloat6[(i1 - 1 + paramInt10)] = localfloatW1.val;
          paramArrayOfFloat6[(i13 + i1 - 1 + paramInt10)] = (-localfloatW3.val);
        }
        i1 += 1;
      }
    }
    if ((i3 != 0 ? 0 : 1) != 0)
    {
      Slasdq.slasdq("U", 0, paramInt1, 0, 0, 0, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat6, i22 - 1 + paramInt10, paramintW);
    }
    else if ((paramInt1 > i18 ? 0 : 1) != 0)
    {
      if ((i3 != 2 ? 0 : 1) != 0)
      {
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt4, paramInt5);
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt6, paramInt7);
        Slasdq.slasdq("U", 0, paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat6, i22 - 1 + paramInt10, paramintW);
      }
      else if ((i3 != 1 ? 0 : 1) != 0)
      {
        i6 = 1;
        i8 = i6 + paramInt1;
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1);
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat5, i8 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1);
        Slasdq.slasdq("U", 0, paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat5, i8 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfFloat5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfFloat5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfFloat6, i22 - 1 + paramInt10, paramintW);
      }
    }
    else
    {
      if ((i3 != 2 ? 0 : 1) != 0)
      {
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt4, paramInt5);
        Slaset.slaset("A", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt6, paramInt7);
      }
      f2 = Slanst.slanst("M", paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
      if ((f2 != 0.0F ? 0 : 1) != 0) {
        return;
      }
      Slascl.slascl("G", 0, 0, f2, 1.0F, paramInt1, 1, paramArrayOfFloat1, paramInt2, paramInt1, localintW);
      Slascl.slascl("G", 0, 0, f2, 1.0F, i13, 1, paramArrayOfFloat2, paramInt3, i13, localintW);
      f1 = Slamch.slamch("Epsilon");
      i12 = (int)((float)Math.log(paramInt1 / (i18 + 1)) / (float)Math.log(2.0F)) + 1;
      i19 = i18 + 1;
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        i6 = 1;
        i8 = 1 + i18;
        i = i8 + i19;
        j = i + i12;
        i23 = j + i12 * 2;
        i2 = i23 + i12;
        i5 = i2 + 1;
        i16 = i5 + 1;
        m = i16 + 2 * i12;
        i10 = 1;
        n = 2;
        i15 = 3;
        k = i15 + i12;
      }
      i1 = 1;
      for (i24 = paramInt1 - 1 + 1; i24 > 0; i24--)
      {
        if ((Math.abs(paramArrayOfFloat1[(i1 - 1 + paramInt2)]) >= f1 ? 0 : 1) != 0) {
          paramArrayOfFloat1[(i1 - 1 + paramInt2)] = Util.sign(f1, paramArrayOfFloat1[(i1 - 1 + paramInt2)]);
        }
        i1 += 1;
      }
      i21 = 1;
      i20 = 0;
      i1 = 1;
      for (i24 = i13 - 1 + 1; i24 > 0; i24--)
      {
        if ((Math.abs(paramArrayOfFloat2[(i1 - 1 + paramInt3)]) >= f1 ? 0 : 1) == 0) {}
        if (((i1 != i13 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((i1 >= i13 ? 0 : 1) != 0)
          {
            i14 = i1 - i21 + 1;
          }
          else if ((Math.abs(paramArrayOfFloat2[(i1 - 1 + paramInt3)]) < f1 ? 0 : 1) != 0)
          {
            i14 = paramInt1 - i21 + 1;
          }
          else
          {
            i14 = i1 - i21 + 1;
            if ((i3 != 2 ? 0 : 1) != 0)
            {
              paramArrayOfFloat3[(paramInt1 - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = Util.sign(1.0F, paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)]);
              paramArrayOfFloat4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = 1.0F;
            }
            else if ((i3 != 1 ? 0 : 1) != 0)
            {
              paramArrayOfFloat5[(paramInt1 + (i17 - 1) * paramInt1 - 1 + paramInt8)] = Util.sign(1.0F, paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)]);
              paramArrayOfFloat5[(paramInt1 + (i18 + i17 - 1) * paramInt1 - 1 + paramInt8)] = 1.0F;
            }
            paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] = Math.abs(paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)]);
          }
          if ((i3 != 2 ? 0 : 1) != 0)
          {
            Slasd0.slasd0(i14, i20, paramArrayOfFloat1, i21 - 1 + paramInt2, paramArrayOfFloat2, i21 - 1 + paramInt3, paramArrayOfFloat3, i21 - 1 + (i21 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, i21 - 1 + (i21 - 1) * paramInt7 + paramInt6, paramInt7, i18, paramArrayOfInt2, paramInt11, paramArrayOfFloat6, i22 - 1 + paramInt10, paramintW);
          }
          else
          {
            Slasda.slasda(i3, i18, i14, i20, paramArrayOfFloat1, i21 - 1 + paramInt2, paramArrayOfFloat2, i21 - 1 + paramInt3, paramArrayOfFloat5, i21 + (i6 + i17 - 2) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfFloat5, i21 + (i8 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfInt1, i21 + i10 * paramInt1 - 1 + paramInt9, paramArrayOfFloat5, i21 + (i + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat5, i21 + (j + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat5, i21 + (i23 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat5, i21 + (i16 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfInt1, i21 + n * paramInt1 - 1 + paramInt9, paramArrayOfInt1, i21 + k * paramInt1 - 1 + paramInt9, paramInt1, paramArrayOfInt1, i21 + i15 * paramInt1 - 1 + paramInt9, paramArrayOfFloat5, i21 + (m + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat5, i21 + (i2 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat5, i21 + (i5 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfFloat6, i22 - 1 + paramInt10, paramArrayOfInt2, paramInt11, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              return;
            }
          }
          i21 = i1 + 1;
        }
        i1 += 1;
      }
      Slascl.slascl("G", 0, 0, 1.0F, f2, paramInt1, 1, paramArrayOfFloat1, paramInt2, paramInt1, localintW);
    }
    i4 = 2;
    for (int i24 = paramInt1 - 2 + 1; i24 > 0; i24--)
    {
      i1 = i4 - 1;
      i11 = i1;
      f3 = paramArrayOfFloat1[(i1 - 1 + paramInt2)];
      i9 = i4;
      for (int i25 = paramInt1 - i4 + 1; i25 > 0; i25--)
      {
        if ((paramArrayOfFloat1[(i9 - 1 + paramInt2)] <= f3 ? 0 : 1) != 0)
        {
          i11 = i9;
          f3 = paramArrayOfFloat1[(i9 - 1 + paramInt2)];
        }
        i9 += 1;
      }
      if ((i11 == i1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(i11 - 1 + paramInt2)] = paramArrayOfFloat1[(i1 - 1 + paramInt2)];
        paramArrayOfFloat1[(i1 - 1 + paramInt2)] = f3;
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt1[(i1 - 1 + paramInt9)] = i11;
        }
        else if ((i3 != 2 ? 0 : 1) != 0)
        {
          Sswap.sswap(paramInt1, paramArrayOfFloat3, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i11 - 1) * paramInt5 + paramInt4, 1);
          Sswap.sswap(paramInt1, paramArrayOfFloat4, i1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i11 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
      }
      else if ((i3 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfInt1[(i1 - 1 + paramInt9)] = i1;
      }
      i4 += 1;
    }
    if ((i3 != 1 ? 0 : 1) != 0) {
      if ((i7 != 1 ? 0 : 1) != 0) {
        paramArrayOfInt1[(paramInt1 - 1 + paramInt9)] = 1;
      } else {
        paramArrayOfInt1[(paramInt1 - 1 + paramInt9)] = 0;
      }
    }
    if ((i7 != 2 ? 0 : 1) != 0) {}
    if (((i3 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      Slasr.slasr("L", "V", "B", paramInt1, paramInt1, paramArrayOfFloat6, 1 - 1 + paramInt10, paramArrayOfFloat6, paramInt1 - 1 + paramInt10, paramArrayOfFloat3, paramInt4, paramInt5);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sbdsdc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */