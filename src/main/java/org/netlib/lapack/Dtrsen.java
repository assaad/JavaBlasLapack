package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtrsen
{
  public static void dtrsen(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, intW paramintW1, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble5, int paramInt9, int paramInt10, int[] paramArrayOfInt, int paramInt11, int paramInt12, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    intW localintW1 = new intW(0);
    int i1 = 0;
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    int[] arrayOfInt = new int[3];
    bool1 = Lsame.lsame(paramString1, "B");
    m = (!Lsame.lsame(paramString1, "E")) && (!bool1) ? 0 : 1;
    n = (!Lsame.lsame(paramString1, "V")) && (!bool1) ? 0 : 1;
    bool2 = Lsame.lsame(paramString2, "V");
    paramintW2.val = 0;
    i = paramInt10 != -1 ? 0 : 1;
    if ((((Lsame.lsame(paramString1, "N") ^ true)) && ((m ^ 0x1) != 0) ? 1 : 0) != 0) {}
    if (((n ^ 0x1) != 0 ? 1 : 0) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -4;
    }
    else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW2.val = -6;
    }
    else
    {
      if ((paramInt6 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt6 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -8;
      }
      else
      {
        paramintW1.val = 0;
        j = 0;
        i1 = 1;
        for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
        {
          if (j != 0) {
            j = 0;
          } else if ((i1 >= paramInt2 ? 0 : 1) != 0)
          {
            if ((paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] != 0.0D ? 0 : 1) != 0)
            {
              if (paramArrayOfBoolean[(i1 - 1 + paramInt1)] != 0) {
                paramintW1.val += 1;
              }
            }
            else
            {
              j = 1;
              if (((paramArrayOfBoolean[(i1 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i1 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
                paramintW1.val += 2;
              }
            }
          }
          else if (paramArrayOfBoolean[(paramInt2 - 1 + paramInt1)] != 0) {
            paramintW1.val += 1;
          }
          i1 += 1;
        }
        i4 = paramintW1.val;
        i5 = paramInt2 - paramintW1.val;
        i6 = i4 * i5;
        if (n != 0)
        {
          i3 = Math.max(1, 2 * i6);
          i2 = Math.max(1, i6);
        }
        else if (Lsame.lsame(paramString1, "N"))
        {
          i3 = Math.max(1, paramInt2);
          i2 = 1;
        }
        else if (Lsame.lsame(paramString1, "E"))
        {
          i3 = Math.max(1, i6);
          i2 = 1;
        }
        if ((paramInt10 >= i3 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -15;
        }
        else
        {
          if ((paramInt12 >= i2 ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW2.val = -17;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble5[(1 - 1 + paramInt9)] = i3;
      paramArrayOfInt[(1 - 1 + paramInt11)] = i2;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRSEN", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramintW1.val != paramInt2 ? 0 : 1) == 0) {}
    if (((paramintW1.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if (m != 0) {
        paramdoubleW1.val = 1.0D;
      }
      if (n != 0) {
        paramdoubleW2.val = Dlange.dlange("1", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, paramInt9);
      }
    }
    else
    {
      localintW4.val = 0;
      j = 0;
      i1 = 1;
      for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
      {
        if (j != 0)
        {
          j = 0;
        }
        else
        {
          k = paramArrayOfBoolean[(i1 - 1 + paramInt1)];
          if ((i1 >= paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              j = 1;
              k = (k == 0) && (paramArrayOfBoolean[(i1 + 1 - 1 + paramInt1)] == 0) ? 0 : 1;
            }
          }
          if (k != 0)
          {
            localintW4.val += 1;
            localintW1.val = 0;
            localintW3.val = i1;
            if ((i1 == localintW4.val ? 0 : 1) != 0) {
              Dtrexc.dtrexc(paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, localintW3, localintW4, paramArrayOfDouble5, paramInt9, localintW1);
            }
            if ((localintW1.val != 1 ? 0 : 1) == 0) {}
            if (((localintW1.val != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = 1;
              if (m != 0) {
                paramdoubleW1.val = 0.0D;
              }
              if (n != 0) {
                paramdoubleW2.val = 0.0D;
              }
              break;
            }
            if (j != 0) {
              localintW4.val += 1;
            }
          }
        }
        i1 += 1;
      }
      if (m != 0)
      {
        Dlacpy.dlacpy("F", i4, i5, paramArrayOfDouble1, 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, paramInt9, i4);
        Dtrsyl.dtrsyl("N", "N", -1, i4, i5, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, paramInt9, i4, localdoubleW2, localintW1);
        d = Dlange.dlange("F", i4, i5, paramArrayOfDouble5, paramInt9, i4, paramArrayOfDouble5, paramInt9);
        if ((d != 0.0D ? 0 : 1) != 0) {
          paramdoubleW1.val = 1.0D;
        } else {
          localdoubleW2.val /= Math.sqrt(localdoubleW2.val * localdoubleW2.val / d + d) * Math.sqrt(d);
        }
      }
      if (n != 0)
      {
        localdoubleW1.val = 0.0D;
        localintW2.val = 0;
        for (;;)
        {
          Dlacn2.dlacn2(i6, paramArrayOfDouble5, i6 + 1 - 1 + paramInt9, paramArrayOfDouble5, paramInt9, paramArrayOfInt, paramInt11, localdoubleW1, localintW2, arrayOfInt, 0);
          if ((localintW2.val == 0 ? 0 : 1) == 0) {
            break;
          }
          if ((localintW2.val != 1 ? 0 : 1) != 0) {
            Dtrsyl.dtrsyl("N", "N", -1, i4, i5, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, paramInt9, i4, localdoubleW2, localintW1);
          } else {
            Dtrsyl.dtrsyl("T", "T", -1, i4, i5, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, paramInt9, i4, localdoubleW2, localintW1);
          }
        }
        localdoubleW2.val /= localdoubleW1.val;
      }
    }
    i1 = 1;
    for (int i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble3[(i1 - 1 + paramInt7)] = paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt4 + paramInt3)];
      paramArrayOfDouble4[(i1 - 1 + paramInt8)] = 0.0D;
      i1 += 1;
    }
    i1 = 1;
    for (i7 = paramInt2 - 1 - 1 + 1; i7 > 0; i7--)
    {
      if ((paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble4[(i1 - 1 + paramInt8)] = (Math.sqrt(Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 + 1 - 1) * paramInt4 + paramInt3)])) * Math.sqrt(Math.abs(paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)])));
        paramArrayOfDouble4[(i1 + 1 - 1 + paramInt8)] = (-paramArrayOfDouble4[(i1 - 1 + paramInt8)]);
      }
      i1 += 1;
    }
    paramArrayOfDouble5[(1 - 1 + paramInt9)] = i3;
    paramArrayOfInt[(1 - 1 + paramInt11)] = i2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtrsen.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */