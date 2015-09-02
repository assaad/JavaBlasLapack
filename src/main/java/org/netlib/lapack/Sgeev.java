package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgeev
{
  public static void sgeev(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW4 = new intW(0);
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f4 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    boolean[] arrayOfBoolean = new boolean[1];
    float[] arrayOfFloat = new float[1];
    paramintW.val = 0;
    i = paramInt11 != -1 ? 0 : 1;
    bool1 = Lsame.lsame(paramString1, "V");
    bool2 = Lsame.lsame(paramString2, "V");
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "N") ^ true)) ? 1 : 0) != 0)
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
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool1) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!bool2) {}
        }
        if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i5 = 1;
        i4 = 1;
      }
      else
      {
        i4 = 2 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGEHRD", " ", paramInt1, 1, paramInt1, 0);
        if (bool1)
        {
          i5 = 4 * paramInt1;
          i4 = Math.max(i4, 2 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGHR", " ", paramInt1, 1, paramInt1, -1));
          Shseqr.shseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfFloat6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
          i4 = Math.max(i4, 4 * paramInt1);
        }
        else if (bool2)
        {
          i5 = 4 * paramInt1;
          i4 = Math.max(i4, 2 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGHR", " ", paramInt1, 1, paramInt1, -1));
          Shseqr.shseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfFloat6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
          i4 = Math.max(i4, 4 * paramInt1);
        }
        else
        {
          i5 = 3 * paramInt1;
          Shseqr.shseqr("E", "N", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfFloat6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
        }
        i4 = Math.max(i4, i5);
      }
      paramArrayOfFloat6[(1 - 1 + paramInt10)] = i4;
      if ((paramInt11 >= i5 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -13;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEEV ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f3 = Slamch.slamch("P");
    localfloatW4.val = Slamch.slamch("S");
    localfloatW1.val = (1.0F / localfloatW4.val);
    Slabad.slabad(localfloatW4, localfloatW1);
    localfloatW4.val = ((float)Math.sqrt(localfloatW4.val) / f3);
    localfloatW1.val = (1.0F / localfloatW4.val);
    f1 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, arrayOfFloat, 0);
    j = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW4.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      f2 = localfloatW4.val;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      j = 1;
      f2 = localfloatW1.val;
    }
    if (j != 0) {
      Slascl.slascl("G", 0, 0, f1, f2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW1);
    }
    n = 1;
    Sgebal.sgebal("B", paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW3, localintW2, paramArrayOfFloat6, n - 1 + paramInt10, localintW1);
    i1 = n + paramInt1;
    i2 = i1 + paramInt1;
    Sgehrd.sgehrd(paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat6, i1 - 1 + paramInt10, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
    if (bool1)
    {
      str = "L";
      Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7);
      Sorghr.sorghr(paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat6, i1 - 1 + paramInt10, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
      i2 = i1;
      Shseqr.shseqr("S", "V", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
      if (bool2)
      {
        str = "B";
        Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9);
      }
    }
    else if (bool2)
    {
      str = "R";
      Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat5, paramInt8, paramInt9);
      Sorghr.sorghr(paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, i1 - 1 + paramInt10, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
      i2 = i1;
      Shseqr.shseqr("S", "V", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
    }
    else
    {
      i2 = i1;
      Shseqr.shseqr("E", "N", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
    }
    if ((paramintW.val <= 0 ? 0 : 1) == 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0) {
        Strevc.strevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9, paramInt1, localintW4, paramArrayOfFloat6, i2 - 1 + paramInt10, localintW1);
      }
      int i6;
      int i7;
      if (bool1)
      {
        Sgebak.sgebak("B", "L", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat6, n - 1 + paramInt10, paramInt1, paramArrayOfFloat4, paramInt6, paramInt7, localintW1);
        m = 1;
        for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
        {
          if ((paramArrayOfFloat3[(m - 1 + paramInt5)] != 0.0F ? 0 : 1) != 0)
          {
            f4 = 1.0F / Snrm2.snrm2(paramInt1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
          }
          else if ((paramArrayOfFloat3[(m - 1 + paramInt5)] <= 0.0F ? 0 : 1) != 0)
          {
            f4 = 1.0F / Slapy2.slapy2(Snrm2.snrm2(paramInt1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1), Snrm2.snrm2(paramInt1, paramArrayOfFloat4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1));
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1);
            i3 = 1;
            for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
            {
              paramArrayOfFloat6[(i2 + i3 - 1 - 1 + paramInt10)] = ((float)Math.pow(paramArrayOfFloat4[(i3 - 1 + (m - 1) * paramInt7 + paramInt6)], 2) + (float)Math.pow(paramArrayOfFloat4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], 2));
              i3 += 1;
            }
            i3 = Isamax.isamax(paramInt1, paramArrayOfFloat6, i2 - 1 + paramInt10, 1);
            Slartg.slartg(paramArrayOfFloat4[(i3 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfFloat4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], localfloatW2, localfloatW5, localfloatW3);
            Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1, localfloatW2.val, localfloatW5.val);
            paramArrayOfFloat4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          }
          m += 1;
        }
      }
      if (bool2)
      {
        Sgebak.sgebak("B", "R", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat6, n - 1 + paramInt10, paramInt1, paramArrayOfFloat5, paramInt8, paramInt9, localintW1);
        m = 1;
        for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
        {
          if ((paramArrayOfFloat3[(m - 1 + paramInt5)] != 0.0F ? 0 : 1) != 0)
          {
            f4 = 1.0F / Snrm2.snrm2(paramInt1, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
          }
          else if ((paramArrayOfFloat3[(m - 1 + paramInt5)] <= 0.0F ? 0 : 1) != 0)
          {
            f4 = 1.0F / Slapy2.slapy2(Snrm2.snrm2(paramInt1, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1), Snrm2.snrm2(paramInt1, paramArrayOfFloat5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1));
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
            Sscal.sscal(paramInt1, f4, paramArrayOfFloat5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1);
            i3 = 1;
            for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
            {
              paramArrayOfFloat6[(i2 + i3 - 1 - 1 + paramInt10)] = ((float)Math.pow(paramArrayOfFloat5[(i3 - 1 + (m - 1) * paramInt9 + paramInt8)], 2) + (float)Math.pow(paramArrayOfFloat5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], 2));
              i3 += 1;
            }
            i3 = Isamax.isamax(paramInt1, paramArrayOfFloat6, i2 - 1 + paramInt10, 1);
            Slartg.slartg(paramArrayOfFloat5[(i3 - 1 + (m - 1) * paramInt9 + paramInt8)], paramArrayOfFloat5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], localfloatW2, localfloatW5, localfloatW3);
            Srot.srot(paramInt1, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1, localfloatW2.val, localfloatW5.val);
            paramArrayOfFloat5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          m += 1;
        }
      }
    }
    if (j != 0)
    {
      Slascl.slascl("G", 0, 0, f2, f1, paramInt1 - paramintW.val, 1, paramArrayOfFloat2, paramintW.val + 1 - 1 + paramInt4, Math.max(paramInt1 - paramintW.val, 1), localintW1);
      Slascl.slascl("G", 0, 0, f2, f1, paramInt1 - paramintW.val, 1, paramArrayOfFloat3, paramintW.val + 1 - 1 + paramInt5, Math.max(paramInt1 - paramintW.val, 1), localintW1);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        Slascl.slascl("G", 0, 0, f2, f1, localintW3.val - 1, 1, paramArrayOfFloat2, paramInt4, paramInt1, localintW1);
        Slascl.slascl("G", 0, 0, f2, f1, localintW3.val - 1, 1, paramArrayOfFloat3, paramInt5, paramInt1, localintW1);
      }
    }
    paramArrayOfFloat6[(1 - 1 + paramInt10)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgeev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */