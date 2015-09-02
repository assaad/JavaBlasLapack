package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgsyl
{
  public static void stgsyl(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat7, int paramInt16, int paramInt17, int[] paramArrayOfInt, int paramInt18, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
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
    intW localintW1 = new intW(0);
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i11 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    i = paramInt17 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if (bool)
    {
      if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt1 <= 4 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -2;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      if ((paramInt2 > 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt3 > 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt5 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -6;
      } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -8;
      } else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -10;
      } else if ((paramInt11 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -12;
      } else if ((paramInt13 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -14;
      } else if ((paramInt15 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool)
      {
        if ((paramInt1 != 1 ? 0 : 1) == 0) {}
        if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i7 = Math.max(1, 2 * paramInt2 * paramInt3);
        } else {
          i7 = 1;
        }
      }
      else
      {
        i7 = 1;
      }
      paramArrayOfFloat7[(1 - 1 + paramInt16)] = i7;
      if ((paramInt17 >= i7 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -20;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGSYL", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1;
      if (bool) {
        if ((paramInt1 == 0 ? 0 : 1) != 0) {
          paramfloatW2.val = 0;
        }
      }
      return;
    }
    i8 = Ilaenv.ilaenv(2, "STGSYL", paramString, paramInt2, paramInt3, -1, -1);
    i9 = Ilaenv.ilaenv(5, "STGSYL", paramString, paramInt2, paramInt3, -1, -1);
    i2 = 1;
    m = 0;
    if (bool) {
      if ((paramInt1 < 3 ? 0 : 1) != 0)
      {
        m = paramInt1 - 2;
        Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, paramInt9);
        Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat6, paramInt14, paramInt15);
      }
      else
      {
        if ((paramInt1 < 1 ? 0 : 1) != 0) {}
        if ((bool ? 1 : 0) != 0) {
          i2 = 2;
        }
      }
    }
    if ((i8 > 1 ? 0 : 1) != 0) {}
    if (((i9 > 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
      if ((i8 < paramInt2 ? 0 : 1) == 0) {}
    }
    int i12;
    if ((((i9 < paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
    {
      n = 1;
      for (i12 = i2 - 1 + 1; i12 > 0; i12--)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        localintW3.val = 0;
        Stgsy2.stgsy2(paramString, m, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramInt15, paramfloatW1, localfloatW2, localfloatW1, paramArrayOfInt, paramInt18, localintW3, paramintW);
        if ((localfloatW1.val == 0.0F ? 0 : 1) != 0)
        {
          if ((paramInt1 != 1 ? 0 : 1) == 0) {}
          if (((paramInt1 != 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramfloatW2.val = ((float)Math.sqrt(2 * paramInt2 * paramInt3) / (localfloatW1.val * (float)Math.sqrt(localfloatW2.val)));
          } else {
            paramfloatW2.val = ((float)Math.sqrt(localintW3.val) / (localfloatW1.val * (float)Math.sqrt(localfloatW2.val)));
          }
        }
        if ((i2 != 2 ? 0 : 1) != 0) {}
        if (((n != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if (bool) {
            m = paramInt1;
          }
          f = paramfloatW1.val;
          Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat7, paramInt16, paramInt2);
          Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat6, paramInt14, paramInt15, paramArrayOfFloat7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2);
          Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, paramInt9);
          Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat6, paramInt14, paramInt15);
        }
        else
        {
          if ((i2 != 2 ? 0 : 1) != 0) {}
          if (((n != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat7, paramInt16, paramInt2, paramArrayOfFloat3, paramInt8, paramInt9);
            Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2, paramArrayOfFloat6, paramInt14, paramInt15);
            paramfloatW1.val = f;
          }
        }
        n += 1;
      }
      return;
    }
    i10 = 0;
    j = 1;
    while ((j <= paramInt2 ? 0 : 1) == 0)
    {
      i10 += 1;
      paramArrayOfInt[(i10 - 1 + paramInt18)] = j;
      j += i8;
      if ((j < paramInt2 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfFloat1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0) {
        j += 1;
      }
    }
    paramArrayOfInt[(i10 + 1 - 1 + paramInt18)] = (paramInt2 + 1);
    if ((paramArrayOfInt[(i10 - 1 + paramInt18)] != paramArrayOfInt[(i10 + 1 - 1 + paramInt18)] ? 0 : 1) != 0) {
      i10 -= 1;
    }
    i11 = i10 + 1;
    i3 = 1;
    while ((i3 <= paramInt3 ? 0 : 1) == 0)
    {
      i11 += 1;
      paramArrayOfInt[(i11 - 1 + paramInt18)] = i3;
      i3 += i9;
      if ((i3 < paramInt3 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfFloat2[(i3 - 1 + (i3 - 1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0) {
        i3 += 1;
      }
    }
    paramArrayOfInt[(i11 + 1 - 1 + paramInt18)] = (paramInt3 + 1);
    if ((paramArrayOfInt[(i11 - 1 + paramInt18)] != paramArrayOfInt[(i11 + 1 - 1 + paramInt18)] ? 0 : 1) != 0) {
      i11 -= 1;
    }
    int i13;
    int i14;
    if (bool)
    {
      n = 1;
      for (i12 = i2 - 1 + 1; i12 > 0; i12--)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        localintW3.val = 0;
        paramfloatW1.val = 1.0F;
        i3 = i10 + 2;
        for (i13 = i11 - (i10 + 2) + 1; i13 > 0; i13--)
        {
          i5 = paramArrayOfInt[(i3 - 1 + paramInt18)];
          i4 = paramArrayOfInt[(i3 + 1 - 1 + paramInt18)] - 1;
          i9 = i4 - i5 + 1;
          j = i10;
          for (i14 = (1 - i10 + -1) / -1; i14 > 0; i14--)
          {
            i1 = paramArrayOfInt[(j - 1 + paramInt18)];
            k = paramArrayOfInt[(j + 1 - 1 + paramInt18)] - 1;
            i8 = k - i1 + 1;
            localintW2.val = 0;
            Stgsy2.stgsy2(paramString, m, i8, i9, paramArrayOfFloat1, i1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i5 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, i1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat5, i5 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, localfloatW3, localfloatW2, localfloatW1, paramArrayOfInt, i11 + 2 - 1 + paramInt18, localintW2, localintW1);
            if ((localintW1.val <= 0 ? 0 : 1) != 0) {
              paramintW.val = localintW1.val;
            }
            localintW3.val += localintW2.val;
            if ((localfloatW3.val == 1.0F ? 0 : 1) != 0)
            {
              i6 = 1;
              for (int i15 = i5 - 1 - 1 + 1; i15 > 0; i15--)
              {
                Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i5;
              for (int i15 = i4 - i5 + 1; i15 > 0; i15--)
              {
                Sscal.sscal(i1 - 1, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Sscal.sscal(i1 - 1, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i5;
              for (int i15 = i4 - i5 + 1; i15 > 0; i15--)
              {
                Sscal.sscal(paramInt2 - k, localfloatW3.val, paramArrayOfFloat3, k + 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Sscal.sscal(paramInt2 - k, localfloatW3.val, paramArrayOfFloat6, k + 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i4 + 1;
              for (int i15 = paramInt3 - (i4 + 1) + 1; i15 > 0; i15--)
              {
                Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              paramfloatW1.val *= localfloatW3.val;
            }
            if ((j <= 1 ? 0 : 1) != 0)
            {
              Sgemm.sgemm("N", "N", i1 - 1, i9, i8, -1.0F, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat3, 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
              Sgemm.sgemm("N", "N", i1 - 1, i9, i8, -1.0F, paramArrayOfFloat4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat6, 1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            if ((i3 >= i11 ? 0 : 1) != 0)
            {
              Sgemm.sgemm("N", "N", i8, paramInt3 - i4, i9, 1.0F, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat2, i5 - 1 + (i4 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat3, i1 - 1 + (i4 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
              Sgemm.sgemm("N", "N", i8, paramInt3 - i4, i9, 1.0F, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat5, i5 - 1 + (i4 + 1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat6, i1 - 1 + (i4 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            j += -1;
          }
          i3 += 1;
        }
        if ((localfloatW1.val == 0.0F ? 0 : 1) != 0)
        {
          if ((paramInt1 != 1 ? 0 : 1) == 0) {}
          if (((paramInt1 != 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramfloatW2.val = ((float)Math.sqrt(2 * paramInt2 * paramInt3) / (localfloatW1.val * (float)Math.sqrt(localfloatW2.val)));
          } else {
            paramfloatW2.val = ((float)Math.sqrt(localintW3.val) / (localfloatW1.val * (float)Math.sqrt(localfloatW2.val)));
          }
        }
        if ((i2 != 2 ? 0 : 1) != 0) {}
        if (((n != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if (bool) {
            m = paramInt1;
          }
          f = paramfloatW1.val;
          Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat7, paramInt16, paramInt2);
          Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat6, paramInt14, paramInt15, paramArrayOfFloat7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2);
          Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, paramInt9);
          Slaset.slaset("F", paramInt2, paramInt3, 0.0F, 0.0F, paramArrayOfFloat6, paramInt14, paramInt15);
        }
        else
        {
          if ((i2 != 2 ? 0 : 1) != 0) {}
          if (((n != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat7, paramInt16, paramInt2, paramArrayOfFloat3, paramInt8, paramInt9);
            Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2, paramArrayOfFloat6, paramInt14, paramInt15);
            paramfloatW1.val = f;
          }
        }
        n += 1;
      }
    }
    else
    {
      paramfloatW1.val = 1.0F;
      j = 1;
      for (i12 = i10 - 1 + 1; i12 > 0; i12--)
      {
        i1 = paramArrayOfInt[(j - 1 + paramInt18)];
        k = paramArrayOfInt[(j + 1 - 1 + paramInt18)] - 1;
        i8 = k - i1 + 1;
        i3 = i11;
        for (i13 = (i10 + 2 - i11 + -1) / -1; i13 > 0; i13--)
        {
          i5 = paramArrayOfInt[(i3 - 1 + paramInt18)];
          i4 = paramArrayOfInt[(i3 + 1 - 1 + paramInt18)] - 1;
          i9 = i4 - i5 + 1;
          Stgsy2.stgsy2(paramString, m, i8, i9, paramArrayOfFloat1, i1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i5 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, i1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat5, i5 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, localfloatW3, localfloatW2, localfloatW1, paramArrayOfInt, i11 + 2 - 1 + paramInt18, localintW2, localintW1);
          if ((localintW1.val <= 0 ? 0 : 1) != 0) {
            paramintW.val = localintW1.val;
          }
          if ((localfloatW3.val == 1.0F ? 0 : 1) != 0)
          {
            i6 = 1;
            for (i14 = i5 - 1 - 1 + 1; i14 > 0; i14--)
            {
              Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i5;
            for (i14 = i4 - i5 + 1; i14 > 0; i14--)
            {
              Sscal.sscal(i1 - 1, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Sscal.sscal(i1 - 1, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i5;
            for (i14 = i4 - i5 + 1; i14 > 0; i14--)
            {
              Sscal.sscal(paramInt2 - k, localfloatW3.val, paramArrayOfFloat3, k + 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Sscal.sscal(paramInt2 - k, localfloatW3.val, paramArrayOfFloat6, k + 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i4 + 1;
            for (i14 = paramInt3 - (i4 + 1) + 1; i14 > 0; i14--)
            {
              Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Sscal.sscal(paramInt2, localfloatW3.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            paramfloatW1.val *= localfloatW3.val;
          }
          if ((i3 <= i10 + 2 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("N", "T", i8, i5 - 1, i9, 1.0F, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
            Sgemm.sgemm("N", "T", i8, i5 - 1, i9, 1.0F, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat5, 1 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
          }
          if ((j >= i10 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("T", "N", paramInt2 - k, i9, i8, -1.0F, paramArrayOfFloat1, i1 - 1 + (k + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat3, k + 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
            Sgemm.sgemm("T", "N", paramInt2 - k, i9, i8, -1.0F, paramArrayOfFloat4, i1 - 1 + (k + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, 1.0F, paramArrayOfFloat3, k + 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          i3 += -1;
        }
        j += 1;
      }
    }
    paramArrayOfFloat7[(1 - 1 + paramInt16)] = i7;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgsyl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */