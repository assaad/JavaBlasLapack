package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgeevx
{
  public static void sgeevx(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, int paramInt9, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat6, int paramInt10, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt11, float[] paramArrayOfFloat8, int paramInt12, float[] paramArrayOfFloat9, int paramInt13, int paramInt14, int[] paramArrayOfInt, int paramInt15, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    String str1 = new String(" ");
    String str2 = new String(" ");
    int k = 0;
    int m = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
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
    paramintW3.val = 0;
    i = paramInt14 != -1 ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString3, "V");
    bool5 = Lsame.lsame(paramString4, "N");
    bool4 = Lsame.lsame(paramString4, "E");
    bool6 = Lsame.lsame(paramString4, "V");
    bool3 = Lsame.lsame(paramString4, "B");
    if (((!Lsame.lsame(paramString1, "N")) && (!Lsame.lsame(paramString1, "S")) ? 0 : 1) == 0) {}
    if ((!Lsame.lsame(paramString1, "P") ? 0 : 1) == 0) {}
    if (((!Lsame.lsame(paramString1, "B") ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if (((!bool5) && (!bool4) ? 0 : 1) == 0) {}
      if ((!bool3 ? 0 : 1) == 0) {}
      if (((!bool6 ? 0 : 1) ^ 0x1) == 0) {
        if (((!bool4) && (!bool3) ? 0 : 1) == 0) {}
      }
      if ((((((bool1) && (bool2) ? 1 : 0) ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -4;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -5;
      }
      else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW3.val = -7;
      }
      else
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {
          if (!bool1) {}
        }
        if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -11;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool2) {}
          }
          if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -13;
          }
        }
      }
    }
    if ((paramintW3.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i4 = 1;
        i3 = 1;
      }
      else
      {
        i3 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGEHRD", " ", paramInt1, 1, paramInt1, 0);
        if (bool1) {
          Shseqr.shseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat9, paramInt13, -1, paramintW3);
        } else if (bool2) {
          Shseqr.shseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, paramInt13, -1, paramintW3);
        } else if (bool5) {
          Shseqr.shseqr("E", "N", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, paramInt13, -1, paramintW3);
        } else {
          Shseqr.shseqr("S", "N", paramInt1, 1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, paramInt13, -1, paramintW3);
        }
        k = (int)paramArrayOfFloat9[(1 - 1 + paramInt13)];
        if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
        {
          i4 = 2 * paramInt1;
          if ((bool5 ^ true)) {
            i4 = Math.max(i4, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, k);
          if ((bool5 ^ true)) {
            i3 = Math.max(i3, paramInt1 * paramInt1 + 6 * paramInt1);
          }
        }
        else
        {
          i4 = 3 * paramInt1;
          if ((((bool5 ^ true)) && ((bool4 ^ true)) ? 1 : 0) != 0) {
            i4 = Math.max(i4, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, k);
          i3 = Math.max(i3, paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGHR", " ", paramInt1, 1, paramInt1, -1));
          if ((((bool5 ^ true)) && ((bool4 ^ true)) ? 1 : 0) != 0) {
            i3 = Math.max(i3, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, 3 * paramInt1);
        }
        i3 = Math.max(i3, i4);
      }
      paramArrayOfFloat9[(1 - 1 + paramInt13)] = i3;
      if ((paramInt14 >= i4 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW3.val = -21;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEEVX", -paramintW3.val);
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
    localintW1.val = 0;
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
      Slascl.slascl("G", 0, 0, f1, f2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW2);
    }
    Sgebal.sgebal(paramString1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramintW1, paramintW2, paramArrayOfFloat6, paramInt10, localintW2);
    paramfloatW.val = Slange.slange("1", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, arrayOfFloat, 0);
    if (j != 0)
    {
      arrayOfFloat[(1 - 1)] = paramfloatW.val;
      Slascl.slascl("G", 0, 0, f2, f1, 1, 1, arrayOfFloat, 0, 1, localintW2);
      paramfloatW.val = arrayOfFloat[(1 - 1)];
    }
    n = 1;
    i1 = n + paramInt1;
    Sgehrd.sgehrd(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat9, n - 1 + paramInt13, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
    if (bool1)
    {
      str2 = "L";
      Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7);
      Sorghr.sorghr(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat9, n - 1 + paramInt13, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
      i1 = n;
      Shseqr.shseqr("S", "V", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
      if (bool2)
      {
        str2 = "B";
        Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9);
      }
    }
    else if (bool2)
    {
      str2 = "R";
      Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat5, paramInt8, paramInt9);
      Sorghr.sorghr(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, n - 1 + paramInt13, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
      i1 = n;
      Shseqr.shseqr("S", "V", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
    }
    else
    {
      if (bool5) {
        str1 = "E";
      } else {
        str1 = "S";
      }
      i1 = n;
      Shseqr.shseqr(str1, "N", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
    }
    if ((paramintW3.val <= 0 ? 0 : 1) == 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0) {
        Strevc.strevc(str2, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9, paramInt1, localintW3, paramArrayOfFloat9, i1 - 1 + paramInt13, localintW2);
      }
      if ((bool5 ^ true)) {
        Strsna.strsna(paramString4, "A", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9, paramArrayOfFloat7, paramInt11, paramArrayOfFloat8, paramInt12, paramInt1, localintW3, paramArrayOfFloat9, i1 - 1 + paramInt13, paramInt1, paramArrayOfInt, paramInt15, localintW1);
      }
      int i5;
      int i6;
      if (bool1)
      {
        Sgebak.sgebak(paramString1, "L", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat6, paramInt10, paramInt1, paramArrayOfFloat4, paramInt6, paramInt7, localintW2);
        m = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
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
            i2 = 1;
            for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat9[(i2 - 1 + paramInt13)] = ((float)Math.pow(paramArrayOfFloat4[(i2 - 1 + (m - 1) * paramInt7 + paramInt6)], 2) + (float)Math.pow(paramArrayOfFloat4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], 2));
              i2 += 1;
            }
            i2 = Isamax.isamax(paramInt1, paramArrayOfFloat9, paramInt13, 1);
            Slartg.slartg(paramArrayOfFloat4[(i2 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfFloat4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], localfloatW2, localfloatW5, localfloatW3);
            Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1, localfloatW2.val, localfloatW5.val);
            paramArrayOfFloat4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          }
          m += 1;
        }
      }
      if (bool2)
      {
        Sgebak.sgebak(paramString1, "R", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat6, paramInt10, paramInt1, paramArrayOfFloat5, paramInt8, paramInt9, localintW2);
        m = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
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
            i2 = 1;
            for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat9[(i2 - 1 + paramInt13)] = ((float)Math.pow(paramArrayOfFloat5[(i2 - 1 + (m - 1) * paramInt9 + paramInt8)], 2) + (float)Math.pow(paramArrayOfFloat5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], 2));
              i2 += 1;
            }
            i2 = Isamax.isamax(paramInt1, paramArrayOfFloat9, paramInt13, 1);
            Slartg.slartg(paramArrayOfFloat5[(i2 - 1 + (m - 1) * paramInt9 + paramInt8)], paramArrayOfFloat5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], localfloatW2, localfloatW5, localfloatW3);
            Srot.srot(paramInt1, paramArrayOfFloat5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1, localfloatW2.val, localfloatW5.val);
            paramArrayOfFloat5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          m += 1;
        }
      }
    }
    if (j != 0)
    {
      Slascl.slascl("G", 0, 0, f2, f1, paramInt1 - paramintW3.val, 1, paramArrayOfFloat2, paramintW3.val + 1 - 1 + paramInt4, Math.max(paramInt1 - paramintW3.val, 1), localintW2);
      Slascl.slascl("G", 0, 0, f2, f1, paramInt1 - paramintW3.val, 1, paramArrayOfFloat3, paramintW3.val + 1 - 1 + paramInt5, Math.max(paramInt1 - paramintW3.val, 1), localintW2);
      if ((paramintW3.val != 0 ? 0 : 1) != 0)
      {
        if (((!bool6) && (!bool3) ? 0 : 1) != 0) {}
        if (((localintW1.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          Slascl.slascl("G", 0, 0, f2, f1, paramInt1, 1, paramArrayOfFloat8, paramInt12, paramInt1, localintW2);
        }
      }
      else
      {
        Slascl.slascl("G", 0, 0, f2, f1, paramintW1.val - 1, 1, paramArrayOfFloat2, paramInt4, paramInt1, localintW2);
        Slascl.slascl("G", 0, 0, f2, f1, paramintW1.val - 1, 1, paramArrayOfFloat3, paramInt5, paramInt1, localintW2);
      }
    }
    paramArrayOfFloat9[(1 - 1 + paramInt13)] = i3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgeevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */