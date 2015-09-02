package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgbbrd
{
  public static void sgbbrd(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat1, int paramInt6, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, intW paramintW)
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
    floatW localfloatW1 = new floatW(0.0F);
    float f = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    bool = Lsame.lsame(paramString, "B");
    k = (!Lsame.lsame(paramString, "Q")) && (!bool) ? 0 : 1;
    j = (!Lsame.lsame(paramString, "P")) && (!bool) ? 0 : 1;
    i = paramInt3 <= 0 ? 0 : 1;
    i8 = paramInt4 + paramInt5 + 1;
    paramintW.val = 0;
    if ((((k ^ 0x1) != 0) && ((j ^ 0x1) != 0) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "N") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt4 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt5 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt7 >= i8 ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (k == 0) {}
      }
      if ((((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt13 >= 1 ? 0 : 1) == 0) {
          if (j == 0) {}
        }
        if ((((paramInt13 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -14;
        }
        else
        {
          if ((paramInt15 >= 1 ? 0 : 1) == 0) {
            if (i == 0) {}
          }
          if ((((paramInt15 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBBRD", -paramintW.val);
      return;
    }
    if (k != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
    }
    if (j != 0) {
      Slaset.slaset("Full", paramInt2, paramInt2, 0.0F, 1.0F, paramArrayOfFloat5, paramInt12, paramInt13);
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    i11 = Math.min(paramInt1, paramInt2);
    int i19;
    if ((paramInt4 + paramInt5 <= 1 ? 0 : 1) != 0)
    {
      if ((paramInt5 <= 0 ? 0 : 1) != 0)
      {
        i13 = 1;
        i16 = 2;
      }
      else
      {
        i13 = 2;
        i16 = 1;
      }
      i14 = Math.max(paramInt1, paramInt2);
      i7 = Math.min(paramInt1 - 1, paramInt4);
      i9 = Math.min(paramInt2 - 1, paramInt5);
      i4 = i7 + i9;
      i5 = i4 + 1;
      n = i5 * paramInt7;
      i17 = 0;
      i2 = i7 + 2;
      i3 = 1 - i9;
      m = 1;
      for (i19 = i11 - 1 + 1; i19 > 0; i19--)
      {
        i12 = i7 + 1;
        i15 = i9 + 1;
        i6 = 1;
        for (int i20 = i4 - 1 + 1; i20 > 0; i20--)
        {
          i2 += i4;
          i3 += i4;
          if ((i17 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i17, paramArrayOfFloat1, i8 - 1 + (i2 - i7 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat7, i2 - 1 + paramInt16, i5, paramArrayOfFloat7, i14 + i2 - 1 + paramInt16, i5);
          }
          i10 = 1;
          for (int i21 = i4 - 1 + 1; i21 > 0; i21--)
          {
            if ((i3 - i7 + i10 - 1 <= paramInt2 ? 0 : 1) != 0) {
              i18 = i17 - 1;
            } else {
              i18 = i17;
            }
            if ((i18 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i18, paramArrayOfFloat1, i8 - i10 - 1 + (i2 - i7 + i10 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat1, i8 - i10 + 1 - 1 + (i2 - i7 + i10 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat7, i14 + i2 - 1 + paramInt16, paramArrayOfFloat7, i2 - 1 + paramInt16, i5);
            }
            i10 += 1;
          }
          if ((i12 <= i13 ? 0 : 1) != 0)
          {
            if ((i12 > paramInt1 - m + 1 ? 0 : 1) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(paramInt5 + i12 - 1 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfFloat1[(paramInt5 + i12 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfFloat7, i14 + m + i12 - 1 - 1 + paramInt16, paramArrayOfFloat7, m + i12 - 1 - 1 + paramInt16, localfloatW1);
              paramArrayOfFloat1[(paramInt5 + i12 - 1 - 1 + (m - 1) * paramInt7 + paramInt6)] = localfloatW1.val;
              if ((m >= paramInt2 ? 0 : 1) != 0) {
                Srot.srot(Math.min(paramInt5 + i12 - 2, paramInt2 - m), paramArrayOfFloat1, paramInt5 + i12 - 2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfFloat1, paramInt5 + i12 - 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfFloat7[(i14 + m + i12 - 1 - 1 + paramInt16)], paramArrayOfFloat7[(m + i12 - 1 - 1 + paramInt16)]);
              }
            }
            i17 += 1;
            i2 -= i5;
          }
          if (k != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (i1 - 1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat7[(i14 + i1 - 1 + paramInt16)], paramArrayOfFloat7[(i1 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if (i != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Srot.srot(paramInt3, paramArrayOfFloat6, i1 - 1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat7[(i14 + i1 - 1 + paramInt16)], paramArrayOfFloat7[(i1 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if ((i3 + i9 <= paramInt2 ? 0 : 1) != 0)
          {
            i17 -= 1;
            i3 -= i5;
          }
          i1 = i2;
          for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
          {
            paramArrayOfFloat7[(i1 + i9 - 1 + paramInt16)] = (paramArrayOfFloat7[(i1 - 1 + paramInt16)] * paramArrayOfFloat1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat7[(i14 + i1 - 1 + paramInt16)] * paramArrayOfFloat1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            i1 += i5;
          }
          if ((i17 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i17, paramArrayOfFloat1, 1 - 1 + (i2 + i9 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat7, i2 + i9 - 1 + paramInt16, i5, paramArrayOfFloat7, i14 + i2 + i9 - 1 + paramInt16, i5);
          }
          i10 = 1;
          for (i21 = i4 - 1 + 1; i21 > 0; i21--)
          {
            if ((i3 + i10 - 1 <= paramInt1 ? 0 : 1) != 0) {
              i18 = i17 - 1;
            } else {
              i18 = i17;
            }
            if ((i18 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i18, paramArrayOfFloat1, i10 + 1 - 1 + (i2 + i9 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat1, i10 - 1 + (i2 + i9 - 1) * paramInt7 + paramInt6, n, paramArrayOfFloat7, i14 + i2 + i9 - 1 + paramInt16, paramArrayOfFloat7, i2 + i9 - 1 + paramInt16, i5);
            }
            i10 += 1;
          }
          if ((i12 != i13 ? 0 : 1) != 0) {}
          if (((i15 <= i16 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            if ((i15 > paramInt2 - m + 1 ? 0 : 1) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(paramInt5 - i15 + 3 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6)], paramArrayOfFloat1[(paramInt5 - i15 + 2 - 1 + (m + i15 - 1 - 1) * paramInt7 + paramInt6)], paramArrayOfFloat7, i14 + m + i15 - 1 - 1 + paramInt16, paramArrayOfFloat7, m + i15 - 1 - 1 + paramInt16, localfloatW1);
              paramArrayOfFloat1[(paramInt5 - i15 + 3 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6)] = localfloatW1.val;
              Srot.srot(Math.min(paramInt4 + i15 - 2, paramInt1 - m), paramArrayOfFloat1, paramInt5 - i15 + 4 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat1, paramInt5 - i15 + 3 - 1 + (m + i15 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat7[(i14 + m + i15 - 1 - 1 + paramInt16)], paramArrayOfFloat7[(m + i15 - 1 - 1 + paramInt16)]);
            }
            i17 += 1;
            i2 -= i5;
          }
          if (j != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Srot.srot(paramInt2, paramArrayOfFloat5, i1 + i9 - 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat5, i1 + i9 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat7[(i14 + i1 + i9 - 1 + paramInt16)], paramArrayOfFloat7[(i1 + i9 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if ((i3 + i4 <= paramInt1 ? 0 : 1) != 0)
          {
            i17 -= 1;
            i3 -= i5;
          }
          i1 = i2;
          for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
          {
            paramArrayOfFloat7[(i1 + i9 - 1 + paramInt16)] *= paramArrayOfFloat1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat7[(i14 + i1 + i9 - 1 + paramInt16)] * paramArrayOfFloat1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            i1 += i5;
          }
          if ((i12 <= i13 ? 0 : 1) != 0) {
            i12 -= 1;
          } else {
            i15 -= 1;
          }
          i6 += 1;
        }
        m += 1;
      }
    }
    if ((paramInt5 != 0 ? 0 : 1) != 0) {}
    if (((paramInt4 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      m = 1;
      for (i19 = Math.min(paramInt1 - 1, paramInt2) - 1 + 1; i19 > 0; i19--)
      {
        Slartg.slartg(paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfFloat1[(2 - 1 + (m - 1) * paramInt7 + paramInt6)], localfloatW2, localfloatW3, localfloatW1);
        paramArrayOfFloat2[(m - 1 + paramInt8)] = localfloatW1.val;
        if ((m >= paramInt2 ? 0 : 1) != 0)
        {
          paramArrayOfFloat3[(m - 1 + paramInt9)] = (localfloatW3.val * paramArrayOfFloat1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)]);
          paramArrayOfFloat1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = (localfloatW2.val * paramArrayOfFloat1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)]);
        }
        if (k != 0) {
          Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat4, 1 - 1 + (m + 1 - 1) * paramInt11 + paramInt10, 1, localfloatW2.val, localfloatW3.val);
        }
        if (i != 0) {
          Srot.srot(paramInt3, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat6, m + 1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, localfloatW2.val, localfloatW3.val);
        }
        m += 1;
      }
      if ((paramInt1 > paramInt2 ? 0 : 1) != 0) {
        paramArrayOfFloat2[(paramInt1 - 1 + paramInt8)] = paramArrayOfFloat1[(1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)];
      }
    }
    else if ((paramInt5 <= 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 >= paramInt2 ? 0 : 1) != 0)
      {
        f = paramArrayOfFloat1[(paramInt5 - 1 + (paramInt1 + 1 - 1) * paramInt7 + paramInt6)];
        m = paramInt1;
        for (i19 = (1 - paramInt1 + -1) / -1; i19 > 0; i19--)
        {
          Slartg.slartg(paramArrayOfFloat1[(paramInt5 + 1 - 1 + (m - 1) * paramInt7 + paramInt6)], f, localfloatW2, localfloatW3, localfloatW1);
          paramArrayOfFloat2[(m - 1 + paramInt8)] = localfloatW1.val;
          if ((m <= 1 ? 0 : 1) != 0)
          {
            f = -(localfloatW3.val * paramArrayOfFloat1[(paramInt5 - 1 + (m - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat3[(m - 1 - 1 + paramInt9)] = (localfloatW2.val * paramArrayOfFloat1[(paramInt5 - 1 + (m - 1) * paramInt7 + paramInt6)]);
          }
          if (j != 0) {
            Srot.srot(paramInt2, paramArrayOfFloat5, m - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat5, paramInt1 + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, localfloatW2.val, localfloatW3.val);
          }
          m += -1;
        }
      }
      else
      {
        m = 1;
        for (i19 = i11 - 1 - 1 + 1; i19 > 0; i19--)
        {
          paramArrayOfFloat3[(m - 1 + paramInt9)] = paramArrayOfFloat1[(paramInt5 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)];
          m += 1;
        }
        m = 1;
        for (i19 = i11 - 1 + 1; i19 > 0; i19--)
        {
          paramArrayOfFloat2[(m - 1 + paramInt8)] = paramArrayOfFloat1[(paramInt5 + 1 - 1 + (m - 1) * paramInt7 + paramInt6)];
          m += 1;
        }
      }
    }
    else
    {
      m = 1;
      for (i19 = i11 - 1 - 1 + 1; i19 > 0; i19--)
      {
        paramArrayOfFloat3[(m - 1 + paramInt9)] = 0.0F;
        m += 1;
      }
      m = 1;
      for (i19 = i11 - 1 + 1; i19 > 0; i19--)
      {
        paramArrayOfFloat2[(m - 1 + paramInt8)] = paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt7 + paramInt6)];
        m += 1;
      }
    }
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, floatW paramfloatW)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    Slartg.slartg(paramFloat1, paramFloat2, localfloatW1, localfloatW2, paramfloatW);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbbrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */