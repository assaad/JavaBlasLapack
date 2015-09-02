package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgels
{
  public static void sgels(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, intW paramintW)
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
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float[] arrayOfFloat = new float[1];
    paramintW.val = 0;
    i3 = Math.min(paramInt1, paramInt2);
    i = paramInt9 != -1 ? 0 : 1;
    if ((((!Lsame.lsame(paramString, "N")) && (!Lsame.lsame(paramString, "T")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt7 >= Util.max(1, paramInt1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt9 >= Math.max(1, i3 + Math.max(i3, paramInt3)) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) == 0) {}
    if (((paramintW.val != -10 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      j = 1;
      if (Lsame.lsame(paramString, "N")) {
        j = 0;
      }
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
      {
        i4 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
        if (j != 0) {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "SORMQR", "LN", paramInt1, paramInt3, paramInt2, -1));
        } else {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "SORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
        }
      }
      else
      {
        i4 = Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
        if (j != 0) {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "SORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
        } else {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "SORMLQ", "LN", paramInt2, paramInt3, paramInt1, -1));
        }
      }
      i6 = Math.max(1, i3 + Math.max(i3, paramInt3) * i4);
      paramArrayOfFloat3[(1 - 1 + paramInt8)] = i6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGELS ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((Util.min(paramInt1, paramInt2, paramInt3) != 0 ? 0 : 1) != 0)
    {
      Slaset.slaset("Full", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      return;
    }
    localfloatW2.val = (Slamch.slamch("S") / Slamch.slamch("P"));
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    f1 = Slange.slange("M", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, arrayOfFloat, 0);
    n = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW);
      n = 1;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW);
      n = 2;
    }
    else if ((f1 != 0.0F ? 0 : 1) != 0)
    {
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      break label1788;
    }
    k = paramInt1;
    if (j != 0) {
      k = paramInt2;
    }
    f2 = Slange.slange("M", k, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, arrayOfFloat, 0);
    i1 = 0;
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW2.val, k, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
      i1 = 1;
    }
    else if ((f2 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW1.val, k, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
      i1 = 2;
    }
    int i7;
    int i8;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
      if ((j ^ 0x1) != 0)
      {
        Sormqr.sormqr("Left", "Transpose", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        Strtrs.strtrs("Upper", "No transpose", "Non-unit", paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i5 = paramInt2;
      }
      else
      {
        Strtrs.strtrs("Upper", "Transpose", "Non-unit", paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i2 = 1;
        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
        {
          m = paramInt2 + 1;
          for (i8 = paramInt1 - (paramInt2 + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat2[(m - 1 + (i2 - 1) * paramInt7 + paramInt6)] = 0.0F;
            m += 1;
          }
          i2 += 1;
        }
        Sormqr.sormqr("Left", "No transpose", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        i5 = paramInt1;
      }
    }
    else
    {
      Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
      if ((j ^ 0x1) != 0)
      {
        Strtrs.strtrs("Lower", "No transpose", "Non-unit", paramInt1, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i2 = 1;
        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
        {
          m = paramInt1 + 1;
          for (i8 = paramInt2 - (paramInt1 + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat2[(m - 1 + (i2 - 1) * paramInt7 + paramInt6)] = 0.0F;
            m += 1;
          }
          i2 += 1;
        }
        Sormlq.sormlq("Left", "Transpose", paramInt2, paramInt3, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        i5 = paramInt2;
      }
      else
      {
        Sormlq.sormlq("Left", "No transpose", paramInt2, paramInt3, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt8, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        Strtrs.strtrs("Lower", "Transpose", "Non-unit", paramInt1, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i5 = paramInt1;
      }
    }
    if ((n != 1 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, i5, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
    } else if ((n != 2 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, i5, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW2.val, f2, i5, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
    } else if ((i1 != 2 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW1.val, f2, i5, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
    }
    label1788:
    paramArrayOfFloat3[(1 - 1 + paramInt8)] = i6;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgels.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */