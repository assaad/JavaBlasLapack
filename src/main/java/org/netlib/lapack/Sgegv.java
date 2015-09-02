package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sgegv
{
  public static void sgegv(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, int paramInt12, float[] paramArrayOfFloat8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    String str = new String(" ");
    int i1 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
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
    int i16 = 0;
    int i17 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    boolean[] arrayOfBoolean = new boolean[1];
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
    j = (k == 0) && (m == 0) ? 0 : 1;
    i12 = Math.max(8 * paramInt1, 1);
    i13 = i12;
    paramArrayOfFloat8[(1 - 1 + paramInt13)] = i13;
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
          if ((paramInt14 >= i12 ? 0 : 1) != 0) {}
          if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i15 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt1, -1, -1);
      i16 = Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i17 = Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i14 = Util.max(i15, i16, i17);
      i11 = 2 * paramInt1 + Math.max(6 * paramInt1, paramInt1 * (i14 + 1));
      paramArrayOfFloat8[(1 - 1 + paramInt13)] = i11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEGV ", -paramintW.val);
      return;
    }
    if (n != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f10 = Slamch.slamch("E") * Slamch.slamch("B");
    f13 = Slamch.slamch("S");
    f13 += f13;
    f12 = 1.0F / f13;
    f11 = 1.0F + 4 * f10;
    f4 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat8, paramInt13);
    f5 = f4;
    f6 = 1.0F;
    if ((f4 >= 1.0F ? 0 : 1) != 0) {
      if ((f12 * f4 >= 1.0F ? 0 : 1) != 0)
      {
        f5 = f13;
        f6 = f12 * f4;
      }
    }
    if ((f4 <= 0.0F ? 0 : 1) != 0)
    {
      Slascl.slascl("G", -1, -1, f4, 1.0F, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 10);
        return;
      }
    }
    f7 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat8, paramInt13);
    f8 = f7;
    f9 = 1.0F;
    if ((f7 >= 1.0F ? 0 : 1) != 0) {
      if ((f12 * f7 >= 1.0F ? 0 : 1) != 0)
      {
        f8 = f13;
        f9 = f12 * f7;
      }
    }
    if ((f7 <= 0.0F ? 0 : 1) != 0)
    {
      Slascl.slascl("G", -1, -1, f7, 1.0F, paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 10);
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
      if (j != 0) {
        i1 = paramInt1 + 1 - localintW3.val;
      } else {
        i1 = i6;
      }
      i7 = i8;
      i8 = i7 + i6;
      Sgeqrf.sgeqrf(i6, i1, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i7 - 1 + paramInt13, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
      if ((localintW2.val < 0 ? 0 : 1) != 0) {
        i13 = Math.max(i13, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
      }
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 2);
      }
      else
      {
        Sormqr.sormqr("L", "T", i6, i1, i6, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, i7 - 1 + paramInt13, paramArrayOfFloat1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
        if ((localintW2.val < 0 ? 0 : 1) != 0) {
          i13 = Math.max(i13, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
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
              i13 = Math.max(i13, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              paramintW.val = (paramInt1 + 4);
              break label3996;
            }
          }
          if (m != 0) {
            Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat7, paramInt11, paramInt12);
          }
          if (j != 0) {
            Sgghrd.sgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW2);
          } else {
            Sgghrd.sgghrd("N", "N", i6, 1, i6, paramArrayOfFloat1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW2);
          }
          if ((localintW2.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (paramInt1 + 5);
          }
          else
          {
            i8 = i7;
            if (j != 0) {
              str = "S";
            } else {
              str = "E";
            }
            Shgeqz.shgeqz(str, paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramArrayOfFloat5, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramArrayOfFloat8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i13 = Math.max(i13, (int)paramArrayOfFloat8[(i8 - 1 + paramInt13)] + i8 - 1);
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
              if (j != 0)
              {
                if (k != 0)
                {
                  if (m != 0) {
                    str = "B";
                  } else {
                    str = "L";
                  }
                }
                else {
                  str = "R";
                }
                Stgevc.stgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramInt1, localintW4, paramArrayOfFloat8, i8 - 1 + paramInt13, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 7);
                  break label3996;
                }
                int i19;
                if (k != 0)
                {
                  Sggbak.sggbak("P", "L", paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat8, i4 - 1 + paramInt13, paramArrayOfFloat8, i5 - 1 + paramInt13, paramInt1, paramArrayOfFloat6, paramInt9, paramInt10, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = (paramInt1 + 8);
                    break label3996;
                  }
                  i9 = 1;
                  for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
                  {
                    if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
                    {
                      f18 = 0.0F;
                      if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          f18 = Math.max(f18, Math.abs(paramArrayOfFloat6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)]));
                          i10 += 1;
                        }
                      }
                      else
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          f18 = Math.max(f18, Math.abs(paramArrayOfFloat6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfFloat6[(i10 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)]));
                          i10 += 1;
                        }
                      }
                      if ((f18 >= f13 ? 0 : 1) == 0)
                      {
                        f18 = 1.0F / f18;
                        if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfFloat6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)] *= f18;
                            i10 += 1;
                          }
                        }
                        else
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfFloat6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)] *= f18;
                            paramArrayOfFloat6[(i10 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)] *= f18;
                            i10 += 1;
                          }
                        }
                      }
                    }
                    i9 += 1;
                  }
                }
                if (m != 0)
                {
                  Sggbak.sggbak("P", "R", paramInt1, localintW3.val, localintW1.val, paramArrayOfFloat8, i4 - 1 + paramInt13, paramArrayOfFloat8, i5 - 1 + paramInt13, paramInt1, paramArrayOfFloat7, paramInt11, paramInt12, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = (paramInt1 + 9);
                    break label3996;
                  }
                  i9 = 1;
                  for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
                  {
                    if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
                    {
                      f18 = 0.0F;
                      if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          f18 = Math.max(f18, Math.abs(paramArrayOfFloat7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)]));
                          i10 += 1;
                        }
                      }
                      else
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          f18 = Math.max(f18, Math.abs(paramArrayOfFloat7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat7[(i10 - 1 + (i9 + 1 - 1) * paramInt12 + paramInt11)]));
                          i10 += 1;
                        }
                      }
                      if ((f18 >= f13 ? 0 : 1) == 0)
                      {
                        f18 = 1.0F / f18;
                        if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfFloat7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)] *= f18;
                            i10 += 1;
                          }
                        }
                        else
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfFloat7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)] *= f18;
                            paramArrayOfFloat7[(i10 - 1 + (i9 + 1 - 1) * paramInt12 + paramInt11)] *= f18;
                            i10 += 1;
                          }
                        }
                      }
                    }
                    i9 += 1;
                  }
                }
              }
              i9 = 1;
              for (int i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
              {
                f2 = Math.abs(paramArrayOfFloat3[(i9 - 1 + paramInt6)]);
                f1 = Math.abs(paramArrayOfFloat4[(i9 - 1 + paramInt7)]);
                f3 = Math.abs(paramArrayOfFloat5[(i9 - 1 + paramInt8)]);
                f15 = f4 * paramArrayOfFloat3[(i9 - 1 + paramInt6)];
                f14 = f4 * paramArrayOfFloat4[(i9 - 1 + paramInt7)];
                f16 = f7 * paramArrayOfFloat5[(i9 - 1 + paramInt8)];
                i = 0;
                f17 = 1.0F;
                if ((Math.abs(f14) >= f13 ? 0 : 1) != 0) {}
                if (((f1 < Util.max(f13, f10 * f2, f10 * f3) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  f17 = f11 * f13 / f5 / Math.max(f11 * f13, f6 * f1);
                }
                else if ((f14 != 0.0F ? 0 : 1) != 0)
                {
                  if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] >= 0.0F ? 0 : 1) != 0) {}
                  if (((i9 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    paramArrayOfFloat4[(i9 - 1 - 1 + paramInt7)] = 0.0F;
                  }
                  else
                  {
                    if ((paramArrayOfFloat4[(i9 - 1 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {}
                    if (((i9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                      paramArrayOfFloat4[(i9 + 1 - 1 + paramInt7)] = 0.0F;
                    }
                  }
                }
                if ((Math.abs(f15) >= f13 ? 0 : 1) != 0) {}
                if (((f2 < Util.max(f13, f10 * f1, f10 * f3) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  f17 = Math.max(f17, f11 * f13 / f5 / Math.max(f11 * f13, f6 * f2));
                }
                if ((Math.abs(f16) >= f13 ? 0 : 1) != 0) {}
                if (((f3 < Util.max(f13, f10 * f2, f10 * f1) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  f17 = Math.max(f17, f11 * f13 / f8 / Math.max(f11 * f13, f9 * f3));
                }
                if (i != 0)
                {
                  f18 = f17 * f13 * Util.max(Math.abs(f15), Math.abs(f14), Math.abs(f16));
                  if ((f18 <= 1.0F ? 0 : 1) != 0) {
                    f17 /= f18;
                  }
                  if ((f17 >= 1.0F ? 0 : 1) != 0) {
                    i = 0;
                  }
                }
                if (i != 0)
                {
                  f15 = f17 * paramArrayOfFloat3[(i9 - 1 + paramInt6)] * f4;
                  f14 = f17 * paramArrayOfFloat4[(i9 - 1 + paramInt7)] * f4;
                  f16 = f17 * paramArrayOfFloat5[(i9 - 1 + paramInt8)] * f7;
                }
                paramArrayOfFloat3[(i9 - 1 + paramInt6)] = f15;
                paramArrayOfFloat4[(i9 - 1 + paramInt7)] = f14;
                paramArrayOfFloat5[(i9 - 1 + paramInt8)] = f16;
                i9 += 1;
              }
            }
          }
        }
      }
    }
    label3996:
    paramArrayOfFloat8[(1 - 1 + paramInt13)] = i13;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgegv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */