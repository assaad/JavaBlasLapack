package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Stzrzf
{
  public static void stzrzf(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, intW paramintW)
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
    paramintW.val = 0;
    i = paramInt7 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) == 0) {}
      if (((paramInt1 != paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i3 = 1;
      }
      else
      {
        i6 = Ilaenv.ilaenv(1, "SGERQF", " ", paramInt1, paramInt2, -1, -1);
        i3 = paramInt1 * i6;
      }
      paramArrayOfFloat3[(1 - 1 + paramInt6)] = i3;
      if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STZRZF", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int i9;
    if ((paramInt1 != paramInt2 ? 0 : 1) != 0)
    {
      j = 1;
      for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfFloat2[(j - 1 + paramInt5)] = 0.0F;
        j += 1;
      }
      return;
    }
    i7 = 2;
    i8 = 1;
    m = paramInt1;
    if ((i6 <= 1 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i8 = Math.max(0, Ilaenv.ilaenv(3, "SGERQF", " ", paramInt1, paramInt2, -1, -1));
      if ((i8 >= paramInt1 ? 0 : 1) != 0)
      {
        i2 = paramInt1;
        m = i2 * i6;
        if ((paramInt7 >= m ? 0 : 1) != 0)
        {
          i6 = paramInt7 / i2;
          i7 = Math.max(2, Ilaenv.ilaenv(2, "SGERQF", " ", paramInt1, paramInt2, -1, -1));
        }
      }
    }
    if ((i6 < i7 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    if (((i8 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i4 = Math.min(paramInt1 + 1, paramInt2);
      n = (paramInt1 - i8 - 1) / i6 * i6;
      i1 = Math.min(paramInt1, n + i6);
      j = paramInt1 - i1 + n + 1;
      for (i9 = (paramInt1 - i1 + 1 - (paramInt1 - i1 + n + 1) + -i6) / -i6; i9 > 0; i9--)
      {
        k = Math.min(paramInt1 - j + 1, i6);
        Slatrz.slatrz(k, paramInt2 - j + 1, paramInt2 - paramInt1, paramArrayOfFloat1, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, j - 1 + paramInt5, paramArrayOfFloat3, paramInt6);
        if ((j <= 1 ? 0 : 1) != 0)
        {
          Slarzt.slarzt("Backward", "Rowwise", paramInt2 - paramInt1, k, paramArrayOfFloat1, j - 1 + (i4 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, j - 1 + paramInt5, paramArrayOfFloat3, paramInt6, i2);
          Slarzb.slarzb("Right", "No transpose", "Backward", "Rowwise", j - 1, paramInt2 - j + 1, k, paramInt2 - paramInt1, paramArrayOfFloat1, j - 1 + (i4 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, i2, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, k + 1 - 1 + paramInt6, i2);
        }
        j += -i6;
      }
      i5 = j + i6 - 1;
    }
    else
    {
      i5 = paramInt1;
    }
    if ((i5 <= 0 ? 0 : 1) != 0) {
      Slatrz.slatrz(i5, paramInt2, paramInt2 - paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat3, paramInt6);
    }
    paramArrayOfFloat3[(1 - 1 + paramInt6)] = i3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stzrzf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */