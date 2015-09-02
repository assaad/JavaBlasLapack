package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorgrq
{
  public static void sorgrq(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    paramintW.val = 0;
    i = paramInt8 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -5;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 > 0 ? 0 : 1) != 0)
      {
        i5 = 1;
      }
      else
      {
        i6 = Ilaenv.ilaenv(1, "SORGRQ", " ", paramInt1, paramInt2, paramInt3, -1);
        i5 = paramInt1 * i6;
      }
      paramArrayOfFloat3[(1 - 1 + paramInt7)] = i5;
      if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -8;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORGRQ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    i7 = 2;
    i8 = 0;
    n = paramInt1;
    if ((i6 <= 1 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i8 = Math.max(0, Ilaenv.ilaenv(3, "SORGRQ", " ", paramInt1, paramInt2, paramInt3, -1));
      if ((i8 >= paramInt3 ? 0 : 1) != 0)
      {
        i4 = paramInt1;
        n = i4 * i6;
        if ((paramInt8 >= n ? 0 : 1) != 0)
        {
          i6 = paramInt8 / i4;
          i7 = Math.max(2, Ilaenv.ilaenv(2, "SORGRQ", " ", paramInt1, paramInt2, paramInt3, -1));
        }
      }
    }
    if ((i6 < i7 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    int i9;
    int i10;
    if (((i8 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i2 = Math.min(paramInt3, (paramInt3 - i8 + i6 - 1) / i6 * i6);
      i1 = paramInt2 - i2 + 1;
      for (i9 = paramInt2 - (paramInt2 - i2 + 1) + 1; i9 > 0; i9--)
      {
        j = 1;
        for (i10 = paramInt1 - i2 - 1 + 1; i10 > 0; i10--)
        {
          paramArrayOfFloat1[(j - 1 + (i1 - 1) * paramInt5 + paramInt4)] = 0.0F;
          j += 1;
        }
        i1 += 1;
      }
    }
    else
    {
      i2 = 0;
    }
    Sorgr2.sorgr2(paramInt1 - i2, paramInt2 - i2, paramInt3 - i2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, localintW);
    if ((i2 <= 0 ? 0 : 1) != 0)
    {
      j = paramInt3 - i2 + 1;
      for (i9 = (paramInt3 - (paramInt3 - i2 + 1) + i6) / i6; i9 > 0; i9--)
      {
        k = Math.min(i6, paramInt3 - j + 1);
        m = paramInt1 - paramInt3 + j;
        if ((m <= 1 ? 0 : 1) != 0)
        {
          Slarft.slarft("Backward", "Rowwise", paramInt2 - paramInt3 + j + k - 1, k, paramArrayOfFloat1, m - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, j - 1 + paramInt6, paramArrayOfFloat3, paramInt7, i4);
          Slarfb.slarfb("Right", "Transpose", "Backward", "Rowwise", m - 1, paramInt2 - paramInt3 + j + k - 1, k, paramArrayOfFloat1, m - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7, i4, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, k + 1 - 1 + paramInt7, i4);
        }
        Sorgr2.sorgr2(k, paramInt2 - paramInt3 + j + k - 1, k, paramArrayOfFloat1, m - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, j - 1 + paramInt6, paramArrayOfFloat3, paramInt7, localintW);
        i3 = paramInt2 - paramInt3 + j + k;
        for (i10 = paramInt2 - (paramInt2 - paramInt3 + j + k) + 1; i10 > 0; i10--)
        {
          i1 = m;
          for (int i11 = m + k - 1 - m + 1; i11 > 0; i11--)
          {
            paramArrayOfFloat1[(i1 - 1 + (i3 - 1) * paramInt5 + paramInt4)] = 0.0F;
            i1 += 1;
          }
          i3 += 1;
        }
        j += i6;
      }
    }
    paramArrayOfFloat3[(1 - 1 + paramInt7)] = n;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorgrq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */