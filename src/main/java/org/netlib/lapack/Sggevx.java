package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sggevx
{
  public static void sggevx(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, int paramInt12, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat8, int paramInt13, float[] paramArrayOfFloat9, int paramInt14, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat10, int paramInt15, float[] paramArrayOfFloat11, int paramInt16, float[] paramArrayOfFloat12, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, boolean[] paramArrayOfBoolean, int paramInt20, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    String str = new String(" ");
    int i4 = 0;
    int i5 = 0;
    intW localintW1 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    intW localintW2 = new intW(0);
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    intW localintW3 = new intW(0);
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f6 = 0.0F;
    boolean[] arrayOfBoolean = new boolean[1];
    if (Lsame.lsame(paramString2, "N"))
    {
      i6 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i6 = 2;
      m = 1;
    }
    else
    {
      i6 = -1;
      m = 0;
    }
    if (Lsame.lsame(paramString3, "N"))
    {
      i7 = 1;
      n = 0;
    }
    else if (Lsame.lsame(paramString3, "V"))
    {
      i7 = 2;
      n = 1;
    }
    else
    {
      i7 = -1;
      n = 0;
    }
    k = (m == 0) && (n == 0) ? 0 : 1;
    i2 = (!Lsame.lsame(paramString1, "N")) && (!Lsame.lsame(paramString1, "P")) ? 0 : 1;
    bool3 = Lsame.lsame(paramString4, "N");
    bool2 = Lsame.lsame(paramString4, "E");
    bool4 = Lsame.lsame(paramString4, "V");
    bool1 = Lsame.lsame(paramString4, "B");
    paramintW3.val = 0;
    i1 = paramInt18 != -1 ? 0 : 1;
    if (((i2 == 0) && (!Lsame.lsame(paramString1, "S")) ? 0 : 1) == 0) {}
    if (((!Lsame.lsame(paramString1, "B") ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((i6 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if (((!bool3) && (!bool2) ? 0 : 1) == 0) {}
      if ((!bool1 ? 0 : 1) == 0) {}
      if (((!bool4 ? 0 : 1) ^ 0x1) != 0)
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
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW3.val = -9;
      }
      else
      {
        if ((paramInt10 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -14;
        }
        else
        {
          if ((paramInt12 >= 1 ? 0 : 1) == 0) {
            if (n == 0) {}
          }
          if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -16;
          }
        }
      }
    }
    if ((paramintW3.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i16 = 1;
        i15 = 1;
      }
      else
      {
        if (((i2 != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0) {
          i16 = 2 * paramInt1;
        } else {
          i16 = 6 * paramInt1;
        }
        if (bool2) {
          i16 = 10 * paramInt1;
        } else if (((!bool4) && (!bool1) ? 0 : 1) != 0) {
          i16 = 2 * paramInt1 * (paramInt1 + 4) + 16;
        }
        i15 = i16;
        i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, 1, paramInt1, 0));
        i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, 1, paramInt1, 0));
        if (m != 0) {
          i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, 1, paramInt1, 0));
        }
      }
      paramArrayOfFloat12[(1 - 1 + paramInt17)] = i15;
      if ((paramInt18 >= i16 ? 0 : 1) != 0) {}
      if (((i1 ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW3.val = -26;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGEVX", -paramintW3.val);
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
    f1 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat12, paramInt17);
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
    f3 = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat12, paramInt17);
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
    Sggbal.sggbal(paramString1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramintW1, paramintW2, paramArrayOfFloat8, paramInt13, paramArrayOfFloat9, paramInt14, paramArrayOfFloat12, paramInt17, localintW1);
    paramfloatW1.val = Slange.slange("1", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat12, 1 - 1 + paramInt17);
    if (i != 0)
    {
      paramArrayOfFloat12[(1 - 1 + paramInt17)] = paramfloatW1.val;
      Slascl.slascl("G", 0, 0, f2, f1, 1, 1, paramArrayOfFloat12, 1 - 1 + paramInt17, 1, localintW1);
      paramfloatW1.val = paramArrayOfFloat12[(1 - 1 + paramInt17)];
    }
    paramfloatW2.val = Slange.slange("1", paramInt1, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat12, 1 - 1 + paramInt17);
    if (j != 0)
    {
      paramArrayOfFloat12[(1 - 1 + paramInt17)] = paramfloatW2.val;
      Slascl.slascl("G", 0, 0, f4, f3, 1, 1, paramArrayOfFloat12, 1 - 1 + paramInt17, 1, localintW1);
      paramfloatW2.val = paramArrayOfFloat12[(1 - 1 + paramInt17)];
    }
    i8 = paramintW2.val + 1 - paramintW1.val;
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      i5 = paramInt1 + 1 - paramintW1.val;
    } else {
      i5 = i8;
    }
    i9 = 1;
    i10 = i9 + i8;
    Sgeqrf.sgeqrf(i8, i5, paramArrayOfFloat2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat12, i9 - 1 + paramInt17, paramArrayOfFloat12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    Sormqr.sormqr("L", "T", i8, i5, i8, paramArrayOfFloat2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat12, i9 - 1 + paramInt17, paramArrayOfFloat1, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    if (m != 0)
    {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat6, paramInt9, paramInt10);
      if ((i8 <= 1 ? 0 : 1) != 0) {
        Slacpy.slacpy("L", i8 - 1, i8 - 1, paramArrayOfFloat2, paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt10 + paramInt9, paramInt10);
      }
      Sorgqr.sorgqr(i8, i8, i8, paramArrayOfFloat6, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat12, i9 - 1 + paramInt17, paramArrayOfFloat12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    }
    if (n != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat7, paramInt11, paramInt12);
    }
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      Sgghrd.sgghrd(paramString2, paramString3, paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
    } else {
      Sgghrd.sgghrd("N", "N", i8, 1, i8, paramArrayOfFloat1, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
    }
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      str = "S";
    } else {
      str = "E";
    }
    Shgeqz.shgeqz(str, paramString2, paramString3, paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramArrayOfFloat5, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramArrayOfFloat12, paramInt17, paramInt18, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      if ((localintW1.val <= 0 ? 0 : 1) != 0) {}
      if (((localintW1.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW3.val = localintW1.val;
      }
      else
      {
        if ((localintW1.val <= paramInt1 ? 0 : 1) != 0) {}
        if (((localintW1.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          localintW1.val -= paramInt1;
        } else {
          paramintW3.val = (paramInt1 + 1);
        }
      }
    }
    else
    {
      int i18;
      int i19;
      if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0)
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
          Stgevc.stgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramInt12, paramInt1, localintW2, paramArrayOfFloat12, paramInt17, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW3.val = (paramInt1 + 2);
            break label3964;
          }
        }
        if ((bool3 ^ true))
        {
          i3 = 0;
          i4 = 1;
          for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
          {
            if (i3 != 0)
            {
              i3 = 0;
            }
            else
            {
              i17 = 1;
              if ((i4 >= paramInt1 ? 0 : 1) != 0) {
                if ((paramArrayOfFloat1[(i4 + 1 - 1 + (i4 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0)
                {
                  i3 = 1;
                  i17 = 2;
                }
              }
              i12 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                paramArrayOfBoolean[(i12 - 1 + paramInt20)] = false;
                i12 += 1;
              }
              if ((i17 != 1 ? 0 : 1) != 0)
              {
                paramArrayOfBoolean[(i4 - 1 + paramInt20)] = true;
              }
              else if ((i17 != 2 ? 0 : 1) != 0)
              {
                paramArrayOfBoolean[(i4 - 1 + paramInt20)] = true;
                paramArrayOfBoolean[(i4 + 1 - 1 + paramInt20)] = true;
              }
              i10 = i17 * paramInt1 + 1;
              i11 = i10 + i17 * paramInt1;
              if (((!bool2) && (!bool1) ? 0 : 1) != 0)
              {
                Stgevc.stgevc("B", "S", paramArrayOfBoolean, paramInt20, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat12, 1 - 1 + paramInt17, paramInt1, paramArrayOfFloat12, i10 - 1 + paramInt17, paramInt1, i17, localintW3, paramArrayOfFloat12, i11 - 1 + paramInt17, localintW1);
                if ((localintW1.val == 0 ? 0 : 1) != 0)
                {
                  paramintW3.val = (paramInt1 + 2);
                  break;
                }
              }
              Stgsna.stgsna(paramString4, "S", paramArrayOfBoolean, paramInt20, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat12, 1 - 1 + paramInt17, paramInt1, paramArrayOfFloat12, i10 - 1 + paramInt17, paramInt1, paramArrayOfFloat10, i4 - 1 + paramInt15, paramArrayOfFloat11, i4 - 1 + paramInt16, i17, localintW3, paramArrayOfFloat12, i11 - 1 + paramInt17, paramInt18 - i11 + 1, paramArrayOfInt, paramInt19, localintW1);
            }
            i4 += 1;
          }
        }
      }
      if (m != 0)
      {
        Sggbak.sggbak(paramString1, "L", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat8, paramInt13, paramArrayOfFloat9, paramInt14, paramInt1, paramArrayOfFloat6, paramInt9, paramInt10, localintW1);
        i13 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
          {
            f6 = 0.0F;
            if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                f6 = Math.max(f6, Math.abs(paramArrayOfFloat6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                f6 = Math.max(f6, Math.abs(paramArrayOfFloat6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfFloat6[(i14 - 1 + (i13 + 1 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            if ((f6 >= localfloatW2.val ? 0 : 1) == 0)
            {
              f6 = 1.0F / f6;
              if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfFloat6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)] *= f6;
                  i14 += 1;
                }
              }
              else
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfFloat6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)] *= f6;
                  paramArrayOfFloat6[(i14 - 1 + (i13 + 1 - 1) * paramInt10 + paramInt9)] *= f6;
                  i14 += 1;
                }
              }
            }
          }
          i13 += 1;
        }
      }
      if (n != 0)
      {
        Sggbak.sggbak(paramString1, "R", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfFloat8, paramInt13, paramArrayOfFloat9, paramInt14, paramInt1, paramArrayOfFloat7, paramInt11, paramInt12, localintW1);
        i13 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] >= 0.0F ? 0 : 1) == 0)
          {
            f6 = 0.0F;
            if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                f6 = Math.max(f6, Math.abs(paramArrayOfFloat7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                f6 = Math.max(f6, Math.abs(paramArrayOfFloat7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat7[(i14 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]));
                i14 += 1;
              }
            }
            if ((f6 >= localfloatW2.val ? 0 : 1) == 0)
            {
              f6 = 1.0F / f6;
              if ((paramArrayOfFloat4[(i13 - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfFloat7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)] *= f6;
                  i14 += 1;
                }
              }
              else
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfFloat7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)] *= f6;
                  paramArrayOfFloat7[(i14 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] *= f6;
                  i14 += 1;
                }
              }
            }
          }
          i13 += 1;
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
    label3964:
    paramArrayOfFloat12[(1 - 1 + paramInt17)] = i15;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */