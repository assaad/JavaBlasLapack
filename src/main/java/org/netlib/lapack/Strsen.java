package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Strsen
{
  public static void strsen(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, intW paramintW1, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat5, int paramInt9, int paramInt10, int[] paramArrayOfInt, int paramInt11, int paramInt12, intW paramintW2)
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
    floatW localfloatW1 = new floatW(0.0F);
    float f = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
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
            if ((paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] != 0.0F ? 0 : 1) != 0)
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
      paramArrayOfFloat5[(1 - 1 + paramInt9)] = i3;
      paramArrayOfInt[(1 - 1 + paramInt11)] = i2;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STRSEN", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramintW1.val != paramInt2 ? 0 : 1) == 0) {}
    if (((paramintW1.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if (m != 0) {
        paramfloatW1.val = 1.0F;
      }
      if (n != 0) {
        paramfloatW2.val = Slange.slange("1", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, paramInt9);
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
            if ((paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
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
              Strexc.strexc(paramString2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, localintW3, localintW4, paramArrayOfFloat5, paramInt9, localintW1);
            }
            if ((localintW1.val != 1 ? 0 : 1) == 0) {}
            if (((localintW1.val != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              paramintW2.val = 1;
              if (m != 0) {
                paramfloatW1.val = 0.0F;
              }
              if (n != 0) {
                paramfloatW2.val = 0.0F;
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
        Slacpy.slacpy("F", i4, i5, paramArrayOfFloat1, 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, paramInt9, i4);
        Strsyl.strsyl("N", "N", -1, i4, i5, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, paramInt9, i4, localfloatW2, localintW1);
        f = Slange.slange("F", i4, i5, paramArrayOfFloat5, paramInt9, i4, paramArrayOfFloat5, paramInt9);
        if ((f != 0.0F ? 0 : 1) != 0) {
          paramfloatW1.val = 1.0F;
        } else {
          localfloatW2.val /= (float)Math.sqrt(localfloatW2.val * localfloatW2.val / f + f) * (float)Math.sqrt(f);
        }
      }
      if (n != 0)
      {
        localfloatW1.val = 0.0F;
        localintW2.val = 0;
        for (;;)
        {
          Slacn2.slacn2(i6, paramArrayOfFloat5, i6 + 1 - 1 + paramInt9, paramArrayOfFloat5, paramInt9, paramArrayOfInt, paramInt11, localfloatW1, localintW2, arrayOfInt, 0);
          if ((localintW2.val == 0 ? 0 : 1) == 0) {
            break;
          }
          if ((localintW2.val != 1 ? 0 : 1) != 0) {
            Strsyl.strsyl("N", "N", -1, i4, i5, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, paramInt9, i4, localfloatW2, localintW1);
          } else {
            Strsyl.strsyl("T", "T", -1, i4, i5, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat1, i4 + 1 - 1 + (i4 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, paramInt9, i4, localfloatW2, localintW1);
          }
        }
        localfloatW2.val /= localfloatW1.val;
      }
    }
    i1 = 1;
    for (int i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfFloat3[(i1 - 1 + paramInt7)] = paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt4 + paramInt3)];
      paramArrayOfFloat4[(i1 - 1 + paramInt8)] = 0.0F;
      i1 += 1;
    }
    i1 = 1;
    for (i7 = paramInt2 - 1 - 1 + 1; i7 > 0; i7--)
    {
      if ((paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat4[(i1 - 1 + paramInt8)] = ((float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 + 1 - 1) * paramInt4 + paramInt3)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)])));
        paramArrayOfFloat4[(i1 + 1 - 1 + paramInt8)] = (-paramArrayOfFloat4[(i1 - 1 + paramInt8)]);
      }
      i1 += 1;
    }
    paramArrayOfFloat5[(1 - 1 + paramInt9)] = i3;
    paramArrayOfInt[(1 - 1 + paramInt11)] = i2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strsen.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */