package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorgql
{
  public static void sorgql(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    paramintW.val = 0;
    i = paramInt8 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -5;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt2 != 0 ? 0 : 1) != 0)
      {
        i4 = 1;
      }
      else
      {
        i5 = Ilaenv.ilaenv(1, "SORGQL", " ", paramInt1, paramInt2, paramInt3, -1);
        i4 = paramInt2 * i5;
      }
      paramArrayOfFloat3[(1 - 1 + paramInt7)] = i4;
      if ((paramInt8 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -8;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORGQL", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 > 0 ? 0 : 1) != 0) {
      return;
    }
    i6 = 2;
    i7 = 0;
    m = paramInt2;
    if ((i5 <= 1 ? 0 : 1) != 0) {}
    if (((i5 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i7 = Math.max(0, Ilaenv.ilaenv(3, "SORGQL", " ", paramInt1, paramInt2, paramInt3, -1));
      if ((i7 >= paramInt3 ? 0 : 1) != 0)
      {
        i3 = paramInt2;
        m = i3 * i5;
        if ((paramInt8 >= m ? 0 : 1) != 0)
        {
          i5 = paramInt8 / i3;
          i6 = Math.max(2, Ilaenv.ilaenv(2, "SORGQL", " ", paramInt1, paramInt2, paramInt3, -1));
        }
      }
    }
    if ((i5 < i6 ? 0 : 1) != 0) {}
    if (((i5 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    int i8;
    int i9;
    if (((i7 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i1 = Math.min(paramInt3, (paramInt3 - i7 + i5 - 1) / i5 * i5);
      n = 1;
      for (i8 = paramInt2 - i1 - 1 + 1; i8 > 0; i8--)
      {
        j = paramInt1 - i1 + 1;
        for (i9 = paramInt1 - (paramInt1 - i1 + 1) + 1; i9 > 0; i9--)
        {
          paramArrayOfFloat1[(j - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0F;
          j += 1;
        }
        n += 1;
      }
    }
    else
    {
      i1 = 0;
    }
    Sorg2l.sorg2l(paramInt1 - i1, paramInt2 - i1, paramInt3 - i1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, localintW);
    if ((i1 <= 0 ? 0 : 1) != 0)
    {
      j = paramInt3 - i1 + 1;
      for (i8 = (paramInt3 - (paramInt3 - i1 + 1) + i5) / i5; i8 > 0; i8--)
      {
        k = Math.min(i5, paramInt3 - j + 1);
        if ((paramInt2 - paramInt3 + j <= 1 ? 0 : 1) != 0)
        {
          Slarft.slarft("Backward", "Columnwise", paramInt1 - paramInt3 + j + k - 1, k, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, j - 1 + paramInt6, paramArrayOfFloat3, paramInt7, i3);
          Slarfb.slarfb("Left", "No transpose", "Backward", "Columnwise", paramInt1 - paramInt3 + j + k - 1, paramInt2 - paramInt3 + j - 1, k, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7, i3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, k + 1 - 1 + paramInt7, i3);
        }
        Sorg2l.sorg2l(paramInt1 - paramInt3 + j + k - 1, k, k, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, j - 1 + paramInt6, paramArrayOfFloat3, paramInt7, localintW);
        n = paramInt2 - paramInt3 + j;
        for (i9 = paramInt2 - paramInt3 + j + k - 1 - (paramInt2 - paramInt3 + j) + 1; i9 > 0; i9--)
        {
          i2 = paramInt1 - paramInt3 + j + k;
          for (int i10 = paramInt1 - (paramInt1 - paramInt3 + j + k) + 1; i10 > 0; i10--)
          {
            paramArrayOfFloat1[(i2 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0F;
            i2 += 1;
          }
          n += 1;
        }
        j += i5;
      }
    }
    paramArrayOfFloat3[(1 - 1 + paramInt7)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorgql.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */