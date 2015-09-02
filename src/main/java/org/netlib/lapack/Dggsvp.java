package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dggsvp
{
  public static void dggsvp(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double paramDouble1, double paramDouble2, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, int[] paramArrayOfInt, int paramInt14, double[] paramArrayOfDouble6, int paramInt15, double[] paramArrayOfDouble7, int paramInt16, intW paramintW3)
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
      Xerbla.xerbla("DGGSVP", -paramintW3.val);
      return;
    }
    i = 1;
    for (int k = paramInt3 - 1 + 1; k > 0; k--)
    {
      paramArrayOfInt[(i - 1 + paramInt14)] = 0;
      i += 1;
    }
    Dgeqpf.dgeqpf(paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfInt, paramInt14, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
    Dlapmt.dlapmt(bool1, paramInt1, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfInt, paramInt14);
    paramintW2.val = 0;
    i = 1;
    for (k = Math.min(paramInt2, paramInt3) - 1 + 1; k > 0; k--)
    {
      if ((Math.abs(paramArrayOfDouble2[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) <= paramDouble2 ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      i += 1;
    }
    if (bool4)
    {
      Dlaset.dlaset("Full", paramInt2, paramInt2, 0.0D, 0.0D, paramArrayOfDouble4, paramInt10, paramInt11);
      if ((paramInt2 <= 1 ? 0 : 1) != 0) {
        Dlacpy.dlacpy("Lower", paramInt2 - 1, paramInt3, paramArrayOfDouble2, 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, 2 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11);
      }
      Dorg2r.dorg2r(paramInt2, paramInt2, Math.min(paramInt2, paramInt3), paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
    }
    j = 1;
    int m;
    for (k = paramintW2.val - 1 - 1 + 1; k > 0; k--)
    {
      i = j + 1;
      for (m = paramintW2.val - (j + 1) + 1; m > 0; m--)
      {
        paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = 0.0D;
        i += 1;
      }
      j += 1;
    }
    if ((paramInt2 <= paramintW2.val ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt2 - paramintW2.val, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramintW2.val + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
    }
    if (bool2)
    {
      Dlaset.dlaset("Full", paramInt3, paramInt3, 0.0D, 1.0D, paramArrayOfDouble5, paramInt12, paramInt13);
      Dlapmt.dlapmt(bool1, paramInt3, paramInt3, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfInt, paramInt14);
    }
    if ((paramInt2 < paramintW2.val ? 0 : 1) != 0) {}
    if (((paramInt3 == paramintW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dgerq2.dgerq2(paramintW2.val, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
      Dormr2.dormr2("Right", "Transpose", paramInt1, paramInt3, paramintW2.val, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble6, paramInt15, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble7, paramInt16, paramintW3);
      if (bool2) {
        Dormr2.dormr2("Right", "Transpose", paramInt3, paramInt3, paramintW2.val, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble6, paramInt15, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble7, paramInt16, paramintW3);
      }
      Dlaset.dlaset("Full", paramintW2.val, paramInt3 - paramintW2.val, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      j = paramInt3 - paramintW2.val + 1;
      for (k = paramInt3 - (paramInt3 - paramintW2.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW2.val + 1;
        for (m = paramintW2.val - (j - paramInt3 + paramintW2.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = 0.0D;
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
    Dgeqpf.dgeqpf(paramInt1, paramInt3 - paramintW2.val, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfInt, paramInt14, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
    paramintW1.val = 0;
    i = 1;
    for (k = Math.min(paramInt1, paramInt3 - paramintW2.val) - 1 + 1; k > 0; k--)
    {
      if ((Math.abs(paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)]) <= paramDouble1 ? 0 : 1) != 0) {
        paramintW1.val += 1;
      }
      i += 1;
    }
    Dorm2r.dorm2r("Left", "Transpose", paramInt1, paramintW2.val, Math.min(paramInt1, paramInt3 - paramintW2.val), paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt15, paramArrayOfDouble1, 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble7, paramInt16, paramintW3);
    if (bool3)
    {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, paramInt9);
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Dlacpy.dlacpy("Lower", paramInt1 - 1, paramInt3 - paramintW2.val, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      }
      Dorg2r.dorg2r(paramInt1, paramInt1, Math.min(paramInt1, paramInt3 - paramintW2.val), paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
    }
    if (bool2) {
      Dlapmt.dlapmt(bool1, paramInt3, paramInt3 - paramintW2.val, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfInt, paramInt14);
    }
    j = 1;
    for (k = paramintW1.val - 1 - 1 + 1; k > 0; k--)
    {
      i = j + 1;
      for (m = paramintW1.val - (j + 1) + 1; m > 0; m--)
      {
        paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0D;
        i += 1;
      }
      j += 1;
    }
    if ((paramInt1 <= paramintW1.val ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1 - paramintW1.val, paramInt3 - paramintW2.val, 0.0D, 0.0D, paramArrayOfDouble1, paramintW1.val + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
    }
    if ((paramInt3 - paramintW2.val <= paramintW1.val ? 0 : 1) != 0)
    {
      Dgerq2.dgerq2(paramintW1.val, paramInt3 - paramintW2.val, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
      if (bool2) {
        Dormr2.dormr2("Right", "Transpose", paramInt3, paramInt3 - paramintW2.val, paramintW1.val, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt15, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble7, paramInt16, paramintW3);
      }
      Dlaset.dlaset("Full", paramintW1.val, paramInt3 - paramintW2.val - paramintW1.val, 0.0D, 0.0D, paramArrayOfDouble1, paramInt4, paramInt5);
      j = paramInt3 - paramintW2.val - paramintW1.val + 1;
      for (k = paramInt3 - paramintW2.val - (paramInt3 - paramintW2.val - paramintW1.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW2.val + paramintW1.val + 1;
        for (m = paramintW1.val - (j - paramInt3 + paramintW2.val + paramintW1.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0D;
          i += 1;
        }
        j += 1;
      }
    }
    if ((paramInt1 <= paramintW1.val ? 0 : 1) != 0)
    {
      Dgeqr2.dgeqr2(paramInt1 - paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramintW1.val + 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramintW3);
      if (bool3) {
        Dorm2r.dorm2r("Right", "No transpose", paramInt1, paramInt1 - paramintW1.val, Math.min(paramInt1 - paramintW1.val, paramintW2.val), paramArrayOfDouble1, paramintW1.val + 1 - 1 + (paramInt3 - paramintW2.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramInt15, paramArrayOfDouble3, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, paramInt16, paramintW3);
      }
      j = paramInt3 - paramintW2.val + 1;
      for (k = paramInt3 - (paramInt3 - paramintW2.val + 1) + 1; k > 0; k--)
      {
        i = j - paramInt3 + paramintW1.val + paramintW2.val + 1;
        for (m = paramInt1 - (j - paramInt3 + paramintW1.val + paramintW2.val + 1) + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0D;
          i += 1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggsvp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */