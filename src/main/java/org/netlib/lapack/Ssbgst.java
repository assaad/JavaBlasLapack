package org.netlib.lapack;

import org.netlib.blas.Sger;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssbgst
{
  public static void ssbgst(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
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
    float f1 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    i8 = paramInt2 + 1;
    i9 = paramInt3 + 1;
    paramintW.val = 0;
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt7 >= paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!bool2) {}
        }
        if ((((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSBGST", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i1 = paramInt5 * i8;
    if (bool2) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
    }
    i12 = (paramInt1 + paramInt3) / 2;
    i = 1;
    j = paramInt1 + 1;
    int i16;
    int i17;
    for (;;)
    {
      if (i != 0)
      {
        j -= 1;
        i10 = Math.min(paramInt3, j - 1);
        k = j - 1;
        m = Math.min(paramInt1, j + paramInt2);
        n = j - i10 + i8;
        if ((j >= i12 + 1 ? 0 : 1) != 0)
        {
          i = 0;
          j += 1;
          k = i12;
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            break;
          }
          continue;
        }
      }
      else
      {
        j += paramInt2;
        if ((j <= paramInt1 - 1 ? 0 : 1) != 0) {
          break;
        }
      }
      if (bool1)
      {
        if (i != 0)
        {
          f1 = paramArrayOfFloat2[(i9 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i2 = Math.max(1, j - paramInt2);
          for (i16 = j - Math.max(1, j - paramInt2) + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i7 = j - i10;
          for (i16 = j - 1 - (j - i10) + 1; i16 > 0; i16--)
          {
            i2 = j - i10;
            for (i17 = i7 - (j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(i2 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i7 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] + paramArrayOfFloat1[(i8 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfFloat2[(i2 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = Math.max(1, j - paramInt2);
            for (i17 = j - i10 - 1 - Math.max(1, j - paramInt2) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            i7 = Math.max(i2 - paramInt2, j - i10);
            for (i17 = j - 1 - Math.max(i2 - paramInt2, j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Sscal.sscal(paramInt1 - i12, 1.0F / f1, paramArrayOfFloat3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Sger.sger(paramInt1 - i12, i10, -1.0F, paramArrayOfFloat3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat2, i9 - i10 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, i12 + 1 - 1 + (j - i10 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          f2 = paramArrayOfFloat1[(j - m + i8 - 1 + (m - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j - i7 + paramInt2 >= paramInt1 ? 0 : 1) != 0) {}
            if (((j - i7 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(i7 + 1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)], f2, paramArrayOfFloat4, paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10, paramArrayOfFloat4, j - i7 + paramInt2 - i12 - 1 + paramInt10, localfloatW);
              f3 = -(paramArrayOfFloat2[(i9 - i7 - 1 + (j - 1) * paramInt7 + paramInt6)] * f2);
              paramArrayOfFloat4[(j - i7 - 1 + paramInt10)] = (paramArrayOfFloat4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * f3 - paramArrayOfFloat4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * f3 + paramArrayOfFloat4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)]);
              f2 = localfloatW.val;
            }
          }
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.max(i5, j + 2 * paramInt2 - i7 + 1);
          } else {
            i6 = i5;
          }
          i14 = (paramInt1 - i6 + paramInt2) / i8;
          i2 = i6;
          for (i17 = (i3 - i6 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)] *= paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i14, paramArrayOfFloat1, 1 - 1 + (i6 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i6 - i12 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i6 - i12 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i8 - i11 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, paramInt2 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, i8 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i8 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, paramInt2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(paramInt1 - i12, paramArrayOfFloat3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n > paramInt1 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfFloat4[(j - i10 - 1 + paramInt10)] = (-(paramArrayOfFloat2[(i9 - i10 - 1 + (j - 1) * paramInt7 + paramInt6)] * f2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j - i7 - 1 + Math.max(2, i7 - k + 1) * i8;
          } else {
            i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + paramInt2 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i5 - i11 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i5 - i11 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - paramInt2 - 1 + paramInt10, paramArrayOfFloat4, i5 - paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + -i8) / -i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 - paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 - paramInt2 - 1 + paramInt10)];
            i2 += -i8;
          }
          i2 = i5;
          for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j - i7 >= paramInt1 - paramInt2 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfFloat4[(j - i7 + paramInt2 - 1 + paramInt10)] = paramArrayOfFloat4[(j - i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Slargv.slargv(i13, paramArrayOfFloat1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i5 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i8 - i11 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, paramInt2 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, i8 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i8 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, paramInt2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(paramInt1 - i12, paramArrayOfFloat3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = paramInt1 - 1;
          for (i16 = (j - paramInt3 + 2 * paramInt2 + 1 - (paramInt1 - 1) + -1) / -1; i16 > 0; i16--)
          {
            paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 - paramInt2 - i12 - 1 + paramInt10)];
            paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 - paramInt2 - i12 - 1 + paramInt10)];
            i2 += -1;
          }
        }
      }
      else
      {
        if (i != 0)
        {
          f1 = paramArrayOfFloat2[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i2 = Math.max(1, j - paramInt2);
          for (i16 = j - Math.max(1, j - paramInt2) + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i7 = j - i10;
          for (i16 = j - 1 - (j - i10) + 1; i16 > 0; i16--)
          {
            i2 = j - i10;
            for (i17 = i7 - (j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(j - i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + paramArrayOfFloat1[(1 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfFloat2[(j - i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = Math.max(1, j - paramInt2);
            for (i17 = j - i10 - 1 - Math.max(1, j - paramInt2) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            i7 = Math.max(i2 - paramInt2, j - i10);
            for (i17 = j - 1 - Math.max(i2 - paramInt2, j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Sscal.sscal(paramInt1 - i12, 1.0F / f1, paramArrayOfFloat3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Sger.sger(paramInt1 - i12, i10, -1.0F, paramArrayOfFloat3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat2, i10 + 1 - 1 + (j - i10 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfFloat3, i12 + 1 - 1 + (j - i10 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          f2 = paramArrayOfFloat1[(m - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j - i7 + paramInt2 >= paramInt1 ? 0 : 1) != 0) {}
            if (((j - i7 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(i8 - i7 - 1 + (j - 1) * paramInt5 + paramInt4)], f2, paramArrayOfFloat4, paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10, paramArrayOfFloat4, j - i7 + paramInt2 - i12 - 1 + paramInt10, localfloatW);
              f3 = -(paramArrayOfFloat2[(i7 + 1 - 1 + (j - i7 - 1) * paramInt7 + paramInt6)] * f2);
              paramArrayOfFloat4[(j - i7 - 1 + paramInt10)] = (paramArrayOfFloat4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * f3 - paramArrayOfFloat4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * f3 + paramArrayOfFloat4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)]);
              f2 = localfloatW.val;
            }
          }
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.max(i5, j + 2 * paramInt2 - i7 + 1);
          } else {
            i6 = i5;
          }
          i14 = (paramInt1 - i6 + paramInt2) / i8;
          i2 = i6;
          for (i17 = (i3 - i6 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)] *= paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i14, paramArrayOfFloat1, i8 - 1 + (i6 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i6 - i12 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i6 - i12 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i11 + 1 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 2 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 2 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(paramInt1 - i12, paramArrayOfFloat3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n > paramInt1 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfFloat4[(j - i10 - 1 + paramInt10)] = (-(paramArrayOfFloat2[(i10 + 1 - 1 + (j - i10 - 1) * paramInt7 + paramInt6)] * f2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j - i7 - 1 + Math.max(2, i7 - k + 1) * i8;
          } else {
            i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + paramInt2 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i5 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i5 - paramInt2 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - paramInt2 - 1 + paramInt10, paramArrayOfFloat4, i5 - paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + -i8) / -i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 - paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 - paramInt2 - 1 + paramInt10)];
            i2 += -i8;
          }
          i2 = i5;
          for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j - i7 >= paramInt1 - paramInt2 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfFloat4[(j - i7 + paramInt2 - 1 + paramInt10)] = paramArrayOfFloat4[(j - i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Slargv.slargv(i13, paramArrayOfFloat1, i8 - 1 + (i5 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i5 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i11 + 1 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 2 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 2 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(paramInt1 - i12, paramArrayOfFloat3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfFloat4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = paramInt1 - 1;
          for (i16 = (j - paramInt3 + 2 * paramInt2 + 1 - (paramInt1 - 1) + -1) / -1; i16 > 0; i16--)
          {
            paramArrayOfFloat4[(paramInt1 + i2 - i12 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 - paramInt2 - i12 - 1 + paramInt10)];
            paramArrayOfFloat4[(i2 - i12 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 - paramInt2 - i12 - 1 + paramInt10)];
            i2 += -1;
          }
        }
      }
    }
    i = 1;
    j = 0;
    for (;;)
    {
      if (i != 0)
      {
        j += 1;
        i10 = Math.min(paramInt3, i12 - j);
        k = j + 1;
        m = Math.max(1, j - paramInt2);
        n = j + i10 - i8;
        if ((j <= i12 ? 0 : 1) != 0)
        {
          i = 0;
          j -= 1;
          k = i12 + 1;
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            return;
          }
          continue;
        }
      }
      else
      {
        j -= paramInt2;
        if ((j >= 2 ? 0 : 1) != 0) {
          return;
        }
      }
      if ((j >= i12 - i10 ? 0 : 1) != 0) {
        i15 = i12;
      } else {
        i15 = paramInt1;
      }
      if (bool1)
      {
        if (i != 0)
        {
          f1 = paramArrayOfFloat2[(i9 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i2 = j;
          for (i16 = Math.min(paramInt1, j + paramInt2) - j + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i7 = j + 1;
          for (i16 = j + i10 - (j + 1) + 1; i16 > 0; i16--)
          {
            i2 = i7;
            for (i17 = j + i10 - i7 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(j - i2 + i9 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + paramArrayOfFloat1[(i8 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfFloat2[(j - i2 + i9 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = j + i10 + 1;
            for (i17 = Math.min(paramInt1, j + paramInt2) - (j + i10 + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            i7 = j + 1;
            for (i17 = Math.min(i2 + paramInt2, j + i10) - (j + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Sscal.sscal(i15, 1.0F / f1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Sger.sger(i15, i10, -1.0F, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat2, paramInt3 - 1 + (j + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfFloat3, 1 - 1 + (j + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          f2 = paramArrayOfFloat1[(m - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j + i7 - i8 <= 0 ? 0 : 1) != 0) {}
            if (((j + i7 >= i12 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(i7 + 1 - 1 + (j - 1) * paramInt5 + paramInt4)], f2, paramArrayOfFloat4, paramInt1 + j + i7 - paramInt2 - 1 + paramInt10, paramArrayOfFloat4, j + i7 - paramInt2 - 1 + paramInt10, localfloatW);
              f3 = -(paramArrayOfFloat2[(i9 - i7 - 1 + (j + i7 - 1) * paramInt7 + paramInt6)] * f2);
              paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)] = (paramArrayOfFloat4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * f3 - paramArrayOfFloat4[(j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(j + i7 - paramInt2 - 1 + paramInt10)] * f3 + paramArrayOfFloat4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)]);
              f2 = localfloatW.val;
            }
          }
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.min(i5, j - 2 * paramInt2 + i7 - 1);
          } else {
            i6 = i5;
          }
          i14 = (i6 + paramInt2 - 1) / i8;
          i2 = i3;
          for (i17 = (i6 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i14, paramArrayOfFloat1, 1 - 1 + (i3 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i3 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i8 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, paramInt2 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i8 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, paramInt2 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfFloat4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(i15, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n <= 0 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfFloat4[(i12 - paramInt3 + j + i10 - 1 + paramInt10)] = (-(paramArrayOfFloat2[(i9 - i10 - 1 + (j + i10 - 1) * paramInt7 + paramInt6)] * f2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j + i7 + 1 - Math.max(2, i7 + k - i12) * i8;
          } else {
            i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + paramInt2 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i4 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i4 + paramInt2 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            i2 += i8;
          }
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j + i7 <= i8 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - paramInt2 - 1 + paramInt10)] = paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Slargv.slargv(i13, paramArrayOfFloat1, 1 - 1 + (i3 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i8 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, paramInt2 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i8 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, paramInt2 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i4 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(i15, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfFloat4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = 2;
          for (i16 = Math.min(j + paramInt3, i12) - 2 * paramInt2 - 1 - 2 + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 + paramInt2 - 1 + paramInt10)];
            i2 += 1;
          }
        }
      }
      else
      {
        if (i != 0)
        {
          f1 = paramArrayOfFloat2[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i2 = j;
          for (i16 = Math.min(paramInt1, j + paramInt2) - j + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] /= f1;
            i2 += 1;
          }
          i7 = j + 1;
          for (i16 = j + i10 - (j + 1) + 1; i16 > 0; i16--)
          {
            i2 = i7;
            for (i17 = j + i10 - i7 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(i2 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i7 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] + paramArrayOfFloat1[(1 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfFloat2[(i2 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = j + i10 + 1;
            for (i17 = Math.min(paramInt1, j + paramInt2) - (j + i10 + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            i7 = j + 1;
            for (i17 = Math.min(i2 + paramInt2, j + i10) - (j + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfFloat2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Sscal.sscal(i15, 1.0F / f1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Sger.sger(i15, i10, -1.0F, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat2, 2 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, 1 - 1 + (j + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          f2 = paramArrayOfFloat1[(j - m + 1 - 1 + (m - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j + i7 - i8 <= 0 ? 0 : 1) != 0) {}
            if (((j + i7 >= i12 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              slartg_adapter(paramArrayOfFloat1[(i8 - i7 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)], f2, paramArrayOfFloat4, paramInt1 + j + i7 - paramInt2 - 1 + paramInt10, paramArrayOfFloat4, j + i7 - paramInt2 - 1 + paramInt10, localfloatW);
              f3 = -(paramArrayOfFloat2[(i7 + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * f2);
              paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)] = (paramArrayOfFloat4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * f3 - paramArrayOfFloat4[(j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(j + i7 - paramInt2 - 1 + paramInt10)] * f3 + paramArrayOfFloat4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)]);
              f2 = localfloatW.val;
            }
          }
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.min(i5, j - 2 * paramInt2 + i7 - 1);
          } else {
            i6 = i5;
          }
          i14 = (i6 + paramInt2 - 1) / i8;
          i2 = i3;
          for (i17 = (i6 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Slargv.slargv(i14, paramArrayOfFloat1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i3 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i11 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfFloat4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(i15, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n <= 0 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfFloat4[(i12 - paramInt3 + j + i10 - 1 + paramInt10)] = (-(paramArrayOfFloat2[(i10 + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * f2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j + i7 + 1 - Math.max(2, i7 + k - i12) * i8;
          } else {
            i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + paramInt2 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i4 + i11 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i4 + i11 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            i2 += i8;
          }
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)] *= paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] * paramArrayOfFloat1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j + i7 <= i8 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - paramInt2 - 1 + paramInt10)] = paramArrayOfFloat4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Slargv.slargv(i13, paramArrayOfFloat1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Slartv.slartv(i13, paramArrayOfFloat1, i11 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i11 + 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Slar2v.slar2v(i13, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i12 - paramInt3 + i4 - 1 + paramInt10, paramArrayOfFloat4, i12 - paramInt3 + i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Srot.srot(i15, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)], paramArrayOfFloat4[(i12 - paramInt3 + i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Slartv.slartv(i14, paramArrayOfFloat1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfFloat4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfFloat4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = 2;
          for (i16 = Math.min(j + paramInt3, i12) - 2 * paramInt2 - 1 - 2 + 1; i16 > 0; i16--)
          {
            paramArrayOfFloat4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt1 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfFloat4[(i2 - 1 + paramInt10)] = paramArrayOfFloat4[(i2 + paramInt2 - 1 + paramInt10)];
            i2 += 1;
          }
        }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssbgst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */