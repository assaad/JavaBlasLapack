package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sggsvp
{
  public static void sggsvp(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float paramFloat1, float paramFloat2, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, int[] paramArrayOfInt, int paramInt14, float[] paramArrayOfFloat6, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, intW paramintW3)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int i = 0;
    int j = 0;
    bool3 = Lsame.lsame(paramString1, "U");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString3, "Q");
    bool1 = true;
    paramintW3.val = 0;
    if ((((!bool3) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((((!bool4) && (!Lsame.lsame(paramString2, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((((!bool2) && (!Lsame.lsame(paramString3, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -4;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -5;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -6;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -8;
    }
    else if ((paramInt7 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW3.val = -10;
    }
    else
    {
      if ((paramInt9 >= 1 ? 0 : 1) == 0) {
        if (!bool3) {}
      }
      if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -16;
      }
      else
      {
        if ((paramInt11 >= 1 ? 0 : 1) == 0) {
          if (!bool4) {}
        }
        if ((((paramInt11 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -18;
        }
        else
        {
          if ((paramInt13 >= 1 ? 0 : 1) == 0) {
            if (!bool2) {}
          }
          if ((((paramInt13 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -20;
          }
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGSVP", -paramintW3.val);
      return;
    }
    i = 1;
    for (int k = paramInt3 - 1 + 1; k > 0; k--)
    {
      paramArrayOfInt[(i - 1 + paramInt14)] = 0;
      i += 1;
    }
    Sgeqpf.sgeqpf(paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfInt, paramInt14, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
    Slapmt.slapmt(bool1, paramInt1, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfInt, paramInt14);
    paramintW2.val = 0;
    i = 1;
    for (k = Math.min(paramInt2, paramInt3) - 1 + 1; k > 0; k--)
    {
      if ((Math.abs(paramArrayOfFloat2[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) <= paramFloat2 ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      i += 1;
    }
    if (bool4)
    {
      Slaset.slaset("Full", paramInt2, paramInt2, 0.0F, 0.0F, paramArrayOfFloat4, paramInt10, paramInt11);
      if ((paramInt2 <= 1 ? 0 : 1) != 0) {
        Slacpy.slacpy("Lower", paramInt2 - 1, paramInt3, paramArrayOfFloat2, 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, 2 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11);
      }
      Sorg2r.sorg2r(paramInt2, paramInt2, Math.min(paramInt2, paramInt3), paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
    }
    j = 1;
    int m;
    for (k = paramintW2.val - 1 - 1 + 1; k > 0; k--)
    {
      i = j + 1;
      for (m = paramintW2.val - (j + 1) + 1; m > 0; m--)
      {
        paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = 0.0F;
        i += 1;
      }
      j += 1;
    }
    if ((paramInt2 <= paramintW2.val ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt2 - paramintW2.val, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramintW2.val + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
    }
    if (bool2)
    {
      Slaset.slaset("Full", paramInt3, paramInt3, 0.0F, 1.0F, paramArrayOfFloat5, paramInt12, paramInt13);
      Slapmt.slapmt(bool1, paramInt3, paramInt3, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfInt, paramInt14);
    }
    if ((paramInt2 < paramintW2.val ? 0 : 1) != 0) {}
    if (((paramInt3 == paramintW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Sgerq2.sgerq2(paramintW2.val, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
      Sormr2.sormr2("Right", "Transpose", paramInt1, paramInt3, paramintW2.val, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt15, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat7, paramInt16, paramintW3);
      if (bool2) {
        Sormr2.sormr2("Right", "Transpose", paramInt3, paramInt3, paramintW2.val, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt15, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat7, paramInt16, paramintW3);
      }
      Slaset.slaset("Full", paramintW2.val, paramInt3 - paramintW2.val, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      j = paramInt3 - paramintW2.val + 1;
      for (k = paramInt3 - (paramInt3 - paramintW2.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW2.val + 1;
        for (m = paramintW2.val - (j - paramInt3 + paramintW2.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = 0.0F;
          i += 1;
        }
        j += 1;
      }
    }
    i = 1;
    for (k = paramInt3 - paramintW2.val - 1 + 1; k > 0; k--)
    {
      paramArrayOfInt[(i - 1 + paramInt14)] = 0;
      i += 1;
    }
    Sgeqpf.sgeqpf(paramInt1, paramInt3 - paramintW2.val, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfInt, paramInt14, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
    paramintW1.val = 0;
    i = 1;
    for (k = Math.min(paramInt1, paramInt3 - paramintW2.val) - 1 + 1; k > 0; k--)
    {
      if ((Math.abs(paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)]) <= paramFloat1 ? 0 : 1) != 0) {
        paramintW1.val += 1;
      }
      i += 1;
    }
    Sorm2r.sorm2r("Left", "Transpose", paramInt1, paramintW2.val, Math.min(paramInt1, paramInt3 - paramintW2.val), paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt15, paramArrayOfFloat1, 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat7, paramInt16, paramintW3);
    if (bool3)
    {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, paramInt9);
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Slacpy.slacpy("Lower", paramInt1 - 1, paramInt3 - paramintW2.val, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      }
      Sorg2r.sorg2r(paramInt1, paramInt1, Math.min(paramInt1, paramInt3 - paramintW2.val), paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
    }
    if (bool2) {
      Slapmt.slapmt(bool1, paramInt3, paramInt3 - paramintW2.val, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfInt, paramInt14);
    }
    j = 1;
    for (k = paramintW1.val - 1 - 1 + 1; k > 0; k--)
    {
      i = j + 1;
      for (m = paramintW1.val - (j + 1) + 1; m > 0; m--)
      {
        paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
        i += 1;
      }
      j += 1;
    }
    if ((paramInt1 <= paramintW1.val ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1 - paramintW1.val, paramInt3 - paramintW2.val, 0.0F, 0.0F, paramArrayOfFloat1, paramintW1.val + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
    }
    if ((paramInt3 - paramintW2.val <= paramintW1.val ? 0 : 1) != 0)
    {
      Sgerq2.sgerq2(paramintW1.val, paramInt3 - paramintW2.val, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
      if (bool2) {
        Sormr2.sormr2("Right", "Transpose", paramInt3, paramInt3 - paramintW2.val, paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt15, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat7, paramInt16, paramintW3);
      }
      Slaset.slaset("Full", paramintW1.val, paramInt3 - paramintW2.val - paramintW1.val, 0.0F, 0.0F, paramArrayOfFloat1, paramInt4, paramInt5);
      j = paramInt3 - paramintW2.val - paramintW1.val + 1;
      for (k = paramInt3 - paramintW2.val - (paramInt3 - paramintW2.val - paramintW1.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW2.val + paramintW1.val + 1;
        for (m = paramintW1.val - (j - paramInt3 + paramintW2.val + paramintW1.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
          i += 1;
        }
        j += 1;
      }
    }
    if ((paramInt1 <= paramintW1.val ? 0 : 1) != 0)
    {
      Sgeqr2.sgeqr2(paramInt1 - paramintW1.val, paramintW2.val, paramArrayOfFloat1, paramintW1.val + 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramintW3);
      if (bool3) {
        Sorm2r.sorm2r("Right", "No transpose", paramInt1, paramInt1 - paramintW1.val, Math.min(paramInt1 - paramintW1.val, paramintW2.val), paramArrayOfFloat1, paramintW1.val + 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, paramInt15, paramArrayOfFloat3, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, paramInt16, paramintW3);
      }
      j = paramInt3 - paramintW2.val + 1;
      for (k = paramInt3 - (paramInt3 - paramintW2.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW1.val + paramintW2.val + 1;
        for (m = paramInt1 - (j - paramInt3 + paramintW1.val + paramintW2.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
          i += 1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggsvp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */