package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dorglq
{
  public static void dorglq(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, intW paramintW)
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
    int i8 = 0;
    paramintW.val = 0;
    i6 = Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt3, -1);
    i5 = Math.max(1, paramInt1) * i6;
    paramArrayOfDouble3[(1 - 1 + paramInt7)] = i5;
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
      if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -3;
      }
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else
      {
        if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -8;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORGLQ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(1 - 1 + paramInt7)] = 1;
      return;
    }
    i7 = 2;
    i8 = 0;
    m = paramInt1;
    if ((i6 <= 1 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i8 = Math.max(0, Ilaenv.ilaenv(3, "DORGLQ", " ", paramInt1, paramInt2, paramInt3, -1));
      if ((i8 >= paramInt3 ? 0 : 1) != 0)
      {
        i4 = paramInt1;
        m = i4 * i6;
        if ((paramInt8 >= m ? 0 : 1) != 0)
        {
          i6 = paramInt8 / i4;
          i7 = Math.max(2, Ilaenv.ilaenv(2, "DORGLQ", " ", paramInt1, paramInt2, paramInt3, -1));
        }
      }
    }
    if ((i6 < i7 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    int i9;
    int i10;
    if (((i8 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i1 = (paramInt3 - i8 - 1) / i6 * i6;
      i2 = Math.min(paramInt3, i1 + i6);
      n = 1;
      for (i9 = i2 - 1 + 1; i9 > 0; i9--)
      {
        j = i2 + 1;
        for (i10 = paramInt1 - (i2 + 1) + 1; i10 > 0; i10--)
        {
          paramArrayOfDouble1[(j - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0D;
          j += 1;
        }
        n += 1;
      }
    }
    else
    {
      i2 = 0;
    }
    if ((i2 >= paramInt1 ? 0 : 1) != 0) {
      Dorgl2.dorgl2(paramInt1 - i2, paramInt2 - i2, paramInt3 - i2, paramArrayOfDouble1, i2 + 1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i2 + 1 - 1 + paramInt6, paramArrayOfDouble3, paramInt7, localintW);
    }
    if ((i2 <= 0 ? 0 : 1) != 0)
    {
      j = i1 + 1;
      for (i9 = (1 - (i1 + 1) + -i6) / -i6; i9 > 0; i9--)
      {
        k = Math.min(i6, paramInt3 - j + 1);
        if ((j + k > paramInt1 ? 0 : 1) != 0)
        {
          Dlarft.dlarft("Forward", "Rowwise", paramInt2 - j + 1, k, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, j - 1 + paramInt6, paramArrayOfDouble3, paramInt7, i4);
          Dlarfb.dlarfb("Right", "Transpose", "Forward", "Rowwise", paramInt1 - j - k + 1, paramInt2 - j + 1, k, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7, i4, paramArrayOfDouble1, j + k - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, k + 1 - 1 + paramInt7, i4);
        }
        Dorgl2.dorgl2(k, paramInt2 - j + 1, k, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, j - 1 + paramInt6, paramArrayOfDouble3, paramInt7, localintW);
        n = 1;
        for (i10 = j - 1 - 1 + 1; i10 > 0; i10--)
        {
          i3 = j;
          for (int i11 = j + k - 1 - j + 1; i11 > 0; i11--)
          {
            paramArrayOfDouble1[(i3 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0D;
            i3 += 1;
          }
          n += 1;
        }
        j += -i6;
      }
    }
    paramArrayOfDouble3[(1 - 1 + paramInt7)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dorglq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */