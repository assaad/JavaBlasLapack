package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dhseqr
{
  public static void dhseqr(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, intW paramintW)
  {
    double[] arrayOfDouble1 = new double[49 * 49];
    double[] arrayOfDouble2 = new double[49];
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool1 = false;
    int m = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    bool2 = Lsame.lsame(paramString1, "S");
    bool1 = Lsame.lsame(paramString2, "I");
    bool3 = (bool1) || (Lsame.lsame(paramString2, "V"));
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = Math.max(1, paramInt1);
    m = paramInt11 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString1, "E") ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((bool3 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else
      {
        if ((paramInt3 >= Math.min(paramInt2, paramInt1) ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -5;
        }
        else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
        {
          paramintW.val = -7;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool3) {}
          }
          if ((((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW.val = -11;
          }
          else
          {
            if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
            if (((m ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW.val = -13;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DHSEQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (m != 0)
    {
      Dlaqr0.dlaqr0(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt2, paramInt3, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt10, paramInt11, paramintW);
      paramArrayOfDouble5[(1 - 1 + paramInt10)] = Math.max(Math.max(1, paramInt1), paramArrayOfDouble5[(1 - 1 + paramInt10)]);
      return;
    }
    i = 1;
    for (int n = paramInt2 - 1 - 1 + 1; n > 0; n--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble3[(i - 1 + paramInt7)] = 0.0D;
      i += 1;
    }
    i = paramInt3 + 1;
    for (n = paramInt1 - (paramInt3 + 1) + 1; n > 0; n--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble3[(i - 1 + paramInt7)] = 0.0D;
      i += 1;
    }
    if (bool1) {
      Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt8, paramInt9);
    }
    if ((paramInt2 != paramInt3 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(paramInt2 - 1 + paramInt6)] = paramArrayOfDouble1[(paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble3[(paramInt2 - 1 + paramInt7)] = 0.0D;
      return;
    }
    k = Ilaenv.ilaenv(12, "DHSEQR", paramString1.substring(1 + -1, 1) + paramString2.substring(1 + -1, 1), paramInt1, paramInt2, paramInt3, paramInt11);
    k = Math.max(11, k);
    if ((paramInt1 <= k ? 0 : 1) != 0)
    {
      Dlaqr0.dlaqr0(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt2, paramInt3, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt10, paramInt11, paramintW);
    }
    else
    {
      Dlahqr.dlahqr(bool2, bool3, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt2, paramInt3, paramArrayOfDouble4, paramInt8, paramInt9, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        j = paramintW.val;
        if ((paramInt1 < 49 ? 0 : 1) != 0)
        {
          Dlaqr0.dlaqr0(bool2, bool3, paramInt1, paramInt2, j, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt2, paramInt3, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt10, paramInt11, paramintW);
        }
        else
        {
          Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, arrayOfDouble1, 0, 49);
          arrayOfDouble1[(paramInt1 + 1 - 1 + (paramInt1 - 1) * 49)] = 0.0D;
          Dlaset.dlaset("A", 49, 49 - paramInt1, 0.0D, 0.0D, arrayOfDouble1, 1 - 1 + (paramInt1 + 1 - 1) * 49, 49);
          Dlaqr0.dlaqr0(bool2, bool3, 49, paramInt2, j, arrayOfDouble1, 0, 49, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt2, paramInt3, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble2, 0, 49, paramintW);
          if (!bool2) {}
          if (((paramintW.val == 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            Dlacpy.dlacpy("A", paramInt1, paramInt1, arrayOfDouble1, 0, 49, paramArrayOfDouble1, paramInt4, paramInt5);
          }
        }
      }
    }
    if (!bool2) {}
    if (((paramintW.val == 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {}
    if (((paramInt1 <= 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      Dlaset.dlaset("L", paramInt1 - 2, paramInt1 - 2, 0.0D, 0.0D, paramArrayOfDouble1, 3 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
    }
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = Math.max(Math.max(1, paramInt1), paramArrayOfDouble5[(1 - 1 + paramInt10)]);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dhseqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */