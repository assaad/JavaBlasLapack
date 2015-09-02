package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sgegs
{
  public static void sgegs(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, int paramInt12, float[] paramArrayOfFloat8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
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
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if (Lsame.lsame(paramString1, "N"))
    {
      i2 = 1;
      k = 0;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i2 = 2;
      k = 1;
    }
    else
    {
      i2 = -1;
      k = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      i3 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i3 = 2;
      m = 1;
    }
    else
    {
      i3 = -1;
      m = 0;
    }
    i10 = Math.max(4 * paramInt1, 1);
    i11 = i10;
    paramArrayOfFloat8[(1 - 1 + paramInt13)] = i11;
    n = paramInt14 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((i2 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else
    {
      if ((paramInt10 >= 1 ? 0 : 1) == 0) {
        if (k == 0) {}
      }
      if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -14;
        }
        else
        {
          if ((paramInt14 >= i10 ? 0 : 1) != 0) {}
          if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i13 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt1, -1, -1);
      i14 = Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i15 = Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i12 = Util.max(i13, i14, i15);
      i9 = 2 * paramInt1 + paramInt1 * (i12 + 1);
      paramArrayOfFloat8[(1 - 1 + paramInt13)] = i9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEGS ", -paramintW.val);
      return;
    }
    if (n != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f6 = Slamch.slamch("E") * Slamch.slamch("B");
    f7 = Slamch.slamch("S");
    f8 = paramInt1 * f7 / f6;
    f3 = 1.0F / f8;
    f1 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat8, paramInt13);
    i = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= f8 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      f2 = f8;
      i = 1;
    }
    else if ((f1 <= f3 ? 0 : 1) != 0)
    {
      f2 = f3;
      i = 1;
    }
    if (i != 0)
    {
      Slascl.slascl("G", -1, -1, f1, f2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 9);
        return;
      }
    }
    f4 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat8, paramInt13);
    j = 0;
    if ((f4 <= 0.0F ? 0 : 1) != 0) {}
    if (((f4 >= f8 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      f5 = f8;
      j = 1;
    }
    else if ((f4 <= f3 ? 0 : 1) != 0)
    {
      f5 = f3;
      j = 1;
    }
    if (j != 0)
    {
      Slascl.slascl("G", -1, -1, f4, f5, paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 9);
        return;
      }
    }
    i4 = 1;
    i5 = paramInt1 + 1;
    i8 = i5 + paramInt1;
    Sggbal.sggbal("P", paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, localintW3, localintW1, paramArrayOfFloat8, i4 - 1 + paramInt13, paramArrayOfFloat8, i5 - 1 + paramInt13, paramArrayOfFloat8, i8 - 1 + paramInt13, localintW2);
    if ((localintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt1 + 1);
    }
    else
    {
      i6 = localintW1.val + 1 - localintW3.val;
      i1 = paramInt1 + 1 - localintW3.val;
      i7 = i8;
      i8 = i7 + i6;
      Sgeqrf.sgeqrf(i6, i1, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i7 - 1 + paramInt13, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
      if ((localintW2.val < 0 ? 0 : 1) != 0) {
        i11 = Math.max(i11, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
      }
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 2);
      }
      else
      {
        Sormqr.sormqr("L", "T", i6, i1, i6, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i7 - 1 + paramInt13, paramArrayOfFloat1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
        if ((localintW2.val < 0 ? 0 : 1) != 0) {
          i11 = Math.max(i11, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
        }
        if ((localintW2.val == 0 ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + 3);
        }
        else
        {
          if (k != 0)
          {
            Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat6, paramInt9, paramInt10);
            Slacpy.slacpy("L", i6 - 1, i6 - 1, paramArrayOfFloat2, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10);
            Sorgqr.sorgqr(i6, i6, i6, paramArrayOfFloat6, localintW3.val - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat8, i7 - 1 + paramInt13, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i11 = Math.max(i11, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              paramintW.val = (paramInt1 + 4);
              break label2389;
            }
          }
          if (m != 0) {
            Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat7, paramInt11, paramInt12);
          }
          Sgghrd.sgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW2);
          if ((localintW2.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (paramInt1 + 5);
          }
          else
          {
            i8 = i7;
            Shgeqz.shgeqz("S", paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramArrayOfFloat5, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i11 = Math.max(i11, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              if ((localintW2.val <= 0 ? 0 : 1) != 0) {}
              if (((localintW2.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                paramintW.val = localintW2.val;
              }
              else
              {
                if ((localintW2.val <= paramInt1 ? 0 : 1) != 0) {}
                if (((localintW2.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  localintW2.val -= paramInt1;
                } else {
                  paramintW.val = (paramInt1 + 6);
                }
              }
            }
            else
            {
              if (k != 0)
              {
                Sggbak.sggbak("P", "L", paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat8, i4 - 1 + paramInt13, paramArrayOfFloat8, i5 - 1 + paramInt13, paramInt1, paramArrayOfFloat6, paramInt9, paramInt10, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 7);
                  break label2389;
                }
              }
              if (m != 0)
              {
                Sggbak.sggbak("P", "R", paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat8, i4 - 1 + paramInt13, paramArrayOfFloat8, i5 - 1 + paramInt13, paramInt1, paramArrayOfFloat7, paramInt11, paramInt12, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 8);
                  break label2389;
                }
              }
              if (i != 0)
              {
                Slascl.slascl("H", -1, -1, f2, f1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Slascl.slascl("G", -1, -1, f2, f1, paramInt1, 1, paramArrayOfFloat3, paramInt6, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Slascl.slascl("G", -1, -1, f2, f1, paramInt1, 1, paramArrayOfFloat4, paramInt7, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
              }
              if (j != 0)
              {
                Slascl.slascl("U", -1, -1, f5, f4, paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
                Slascl.slascl("G", -1, -1, f5, f4, paramInt1, 1, paramArrayOfFloat5, paramInt8, paramInt1, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 9);
                  return;
                }
              }
            }
          }
        }
      }
    }
    label2389:
    paramArrayOfFloat8[(1 - 1 + paramInt13)] = i11;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgegs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */