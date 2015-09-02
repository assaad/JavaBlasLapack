package org.netlib.lapack;

import org.netlib.blas.Stpmv;
import org.netlib.blas.Stpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sspgvx
{
  public static void sspgvx(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float paramFloat1, float paramFloat2, int paramInt5, int paramInt6, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int[] paramArrayOfInt1, int paramInt11, int[] paramArrayOfInt2, int paramInt12, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = new String(" ");
    int i = 0;
    bool3 = Lsame.lsame(paramString3, "U");
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    paramintW2.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((!bool5) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -2;
    }
    else
    {
      if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -3;
      }
      else if ((((!bool3) && (!Lsame.lsame(paramString3, "L")) ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -4;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -5;
      }
      else if (bool4)
      {
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {}
        if (((paramFloat2 > paramFloat1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -9;
        }
      }
      else if (bool2)
      {
        if ((paramInt5 >= 1 ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else
        {
          if ((paramInt6 >= Math.min(paramInt2, paramInt5) ? 0 : 1) == 0) {}
          if (((paramInt6 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -11;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt9 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt9 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -16;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPGVX", -paramintW2.val);
      return;
    }
    paramintW1.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Spptrf.spptrf(paramString3, paramInt2, paramArrayOfFloat2, paramInt4, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (paramInt2 + paramintW2.val);
      return;
    }
    Sspgst.sspgst(paramInt1, paramString3, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramintW2);
    Sspevx.sspevx(paramString1, paramString2, paramString3, paramInt2, paramArrayOfFloat1, paramInt3, paramFloat1, paramFloat2, paramInt5, paramInt6, paramFloat3, paramintW1, paramArrayOfFloat3, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramArrayOfInt1, paramInt11, paramArrayOfInt2, paramInt12, paramintW2);
    if (bool5)
    {
      if ((paramintW2.val <= 0 ? 0 : 1) != 0) {
        paramintW2.val -= 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      int j;
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "N";
        } else {
          str = "T";
        }
        i = 1;
        for (j = paramintW1.val - 1 + 1; j > 0; j--)
        {
          Stpsv.stpsv(paramString3, str, "Non-unit", paramInt2, paramArrayOfFloat2, paramInt4, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
          i += 1;
        }
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "T";
        } else {
          str = "N";
        }
        i = 1;
        j = paramintW1.val - 1 + 1;
        for (;;)
        {
          Stpmv.stpmv(paramString3, str, "Non-unit", paramInt2, paramArrayOfFloat2, paramInt4, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
          i += 1;
          j--;
          if (j <= 0) {
            break;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspgvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */