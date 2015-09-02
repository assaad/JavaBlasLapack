package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sggev
{
  public static void sggev(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, int paramInt12, float[] paramArrayOfFloat8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    String str = new String(" ");
    int i2 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f6 = 0.0F;
    boolean[] arrayOfBoolean = new boolean[1];
    if (Lsame.lsame(paramString1, "N"))
    {
      i3 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i3 = 2;
      m = 1;
    }
    else
    {
      i3 = -1;
      m = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      i4 = 1;
      n = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i4 = 2;
      n = 1;
    }
    else
    {
      i4 = -1;
      n = 0;
    }
    k = (m == 0) && (n == 0) ? 0 : 1;
    paramintW.val = 0;
    i1 = paramInt14 != -1 ? 0 : 1;
    if ((i3 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i4 > 0 ? 0 : 1) != 0)
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
        if (m == 0) {}
      }
      if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (n == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -14;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i13 = Math.max(1, 8 * paramInt1);
      i12 = Math.max(1, paramInt1 * (7 + Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, 1, paramInt1, 0)));
      i12 = Math.max(i12, paramInt1 * (7 + Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, 1, paramInt1, 0)));
      if (m != 0) {
        i12 = Math.max(i12, paramInt1 * (7 + Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, 1, paramInt1, -1)));
      }
      paramArrayOfFloat8[(1 - 1 + paramInt13)] = i12;
      if ((paramInt14 >= i13 ? 0 : 1) != 0) {}
      if (((i1 ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGEV ", -paramintW.val);
      return;
    }
    if (i1 != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f5 = Slamch.slamch("P");
    localfloatW2.val = Slamch.slamch("S");
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    localfloatW2.val = ((float)Math.sqrt(localfloatW2.val) / f5);
    localfloatW1.val = (1.0F / localfloatW2.val);
    f1 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat8, paramInt13);
    i = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      f2 = localfloatW2.val;
      i = 1;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      f2 = localfloatW1.val;
      i = 1;
    }
    if (i != 0) {
      Slascl.slascl("G", 0, 0, f1, f2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW1);
    }
    f3 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat8, paramInt13);
    j = 0;
    if ((f3 <= 0.0F ? 0 : 1) != 0) {}
    if (((f3 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      f4 = localfloatW2.val;
      j = 1;
    }
    else if ((f3 <= localfloatW1.val ? 0 : 1) != 0)
    {
      f4 = localfloatW1.val;
      j = 1;
    }
    if (j != 0) {
      Slascl.slascl("G", 0, 0, f3, f4, paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, localintW1);
    }
    i5 = 1;
    i6 = paramInt1 + 1;
    i9 = i6 + paramInt1;
    Sggbal.sggbal("P", paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, localintW3, localintW2, paramArrayOfFloat8, i5 - 1 + paramInt13, paramArrayOfFloat8, i6 - 1 + paramInt13, paramArrayOfFloat8, i9 - 1 + paramInt13, localintW1);
    i7 = localintW2.val + 1 - localintW3.val;
    if (k != 0) {
      i2 = paramInt1 + 1 - localintW3.val;
    } else {
      i2 = i7;
    }
    i8 = i9;
    i9 = i8 + i7;
    Sgeqrf.sgeqrf(i7, i2, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i8 - 1 + paramInt13, paramArrayOfFloat8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    Sormqr.sormqr("L", "T", i7, i2, i7, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i8 - 1 + paramInt13, paramArrayOfFloat1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    if (m != 0)
    {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat6, paramInt9, paramInt10);
      if ((i7 <= 1 ? 0 : 1) != 0) {
        Slacpy.slacpy("L", i7 - 1, i7 - 1, paramArrayOfFloat2, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10);
      }
      Sorgqr.sorgqr(i7, i7, i7, paramArrayOfFloat6, localintW3.val - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat8, i8 - 1 + paramInt13, paramArrayOfFloat8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    }
    if (n != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat7, paramInt11, paramInt12);
    }
    if (k != 0) {
      Sgghrd.sgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
    } else {
      Sgghrd.sgghrd("N", "N", i7, 1, i7, paramArrayOfFloat1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
    }
    i9 = i8;
    if (k != 0) {
      str = "S";
    } else {
      str = "E";
    }
    Shgeqz.shgeqz(str, paramString1, paramString2, paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramArrayOfFloat5, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramArrayOfFloat8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      if ((localintW1.val <= 0 ? 0 : 1) != 0) {}
      if (((localintW1.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = localintW1.val;
      }
      else
      {
        if ((localintW1.val <= paramInt1 ? 0 : 1) != 0) {}
        if (((localintW1.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          localintW1.val -= paramInt1;
        } else {
          paramintW.val = (paramInt1 + 1);
        }
      }
    }
    else
    {
      if (k != 0)
      {
        if (m != 0)
        {
          if (n != 0) {
            str = "B";
          } else {
            str = "L";
          }
        }
        else {
          str = "R";
        }
        Stgevc.stgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramInt1, localintW4, paramArrayOfFloat8, i9 - 1 + paramInt13, localintW1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + 2);
          break label3022;
        }
        int i14;
        int i15;
        if (m != 0)
        {
          Sggbak.sggbak("P", "L", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat8, i5 - 1 + paramInt13, paramArrayOfFloat8, i6 - 1 + paramInt13, paramInt1, paramArrayOfFloat6, paramInt9, paramInt10, localintW1);
          i10 = 1;
          for (i14 = paramInt1 - 1 + 1; i14 > 0; i14--)
          {
            if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
            {
              f6 = 0.0F;
              if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  f6 = Math.max(f6, Math.abs(paramArrayOfFloat6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)]));
                  i11 += 1;
                }
              }
              else
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  f6 = Math.max(f6, Math.abs(paramArrayOfFloat6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfFloat6[(i11 - 1 + (i10 + 1 - 1) * paramInt10 + paramInt9)]));
                  i11 += 1;
                }
              }
              if ((f6 >= localfloatW2.val ? 0 : 1) == 0)
              {
                f6 = 1.0F / f6;
                if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfFloat6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)] *= f6;
                    i11 += 1;
                  }
                }
                else
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfFloat6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)] *= f6;
                    paramArrayOfFloat6[(i11 - 1 + (i10 + 1 - 1) * paramInt10 + paramInt9)] *= f6;
                    i11 += 1;
                  }
                }
              }
            }
            i10 += 1;
          }
        }
        if (n != 0)
        {
          Sggbak.sggbak("P", "R", paramInt1, localintW3.val, localintW2.val, paramArrayOfFloat8, i5 - 1 + paramInt13, paramArrayOfFloat8, i6 - 1 + paramInt13, paramInt1, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
          i10 = 1;
          for (i14 = paramInt1 - 1 + 1; i14 > 0; i14--)
          {
            if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
            {
              f6 = 0.0F;
              if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  f6 = Math.max(f6, Math.abs(paramArrayOfFloat7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)]));
                  i11 += 1;
                }
              }
              else
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  f6 = Math.max(f6, Math.abs(paramArrayOfFloat7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat7[(i11 - 1 + (i10 + 1 - 1) * paramInt12 + paramInt11)]));
                  i11 += 1;
                }
              }
              if ((f6 >= localfloatW2.val ? 0 : 1) == 0)
              {
                f6 = 1.0F / f6;
                if ((paramArrayOfFloat4[(i10 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfFloat7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)] *= f6;
                    i11 += 1;
                  }
                }
                else
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfFloat7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)] *= f6;
                    paramArrayOfFloat7[(i11 - 1 + (i10 + 1 - 1) * paramInt12 + paramInt11)] *= f6;
                    i11 += 1;
                  }
                }
              }
            }
            i10 += 1;
          }
        }
      }
      if (i != 0)
      {
        Slascl.slascl("G", 0, 0, f2, f1, paramInt1, 1, paramArrayOfFloat3, paramInt6, paramInt1, localintW1);
        Slascl.slascl("G", 0, 0, f2, f1, paramInt1, 1, paramArrayOfFloat4, paramInt7, paramInt1, localintW1);
      }
      if (j != 0) {
        Slascl.slascl("G", 0, 0, f4, f3, paramInt1, 1, paramArrayOfFloat5, paramInt8, paramInt1, localintW1);
      }
    }
    label3022:
    paramArrayOfFloat8[(1 - 1 + paramInt13)] = i12;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */