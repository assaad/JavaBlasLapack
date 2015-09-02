package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Strsna
{
  public static void strsna(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, intW paramintW1, float[] paramArrayOfFloat6, int paramInt12, int paramInt13, int[] paramArrayOfInt, int paramInt14, intW paramintW2)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int n = 0;
    int i1 = 0;
    intW localintW4 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    float f12 = 0.0F;
    int[] arrayOfInt = new int[3];
    float[] arrayOfFloat = new float[1];
    bool2 = Lsame.lsame(paramString1, "B");
    j = (!Lsame.lsame(paramString1, "E")) && (!bool2) ? 0 : 1;
    k = (!Lsame.lsame(paramString1, "V")) && (!bool2) ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "S");
    paramintW2.val = 0;
    if ((((j ^ 0x1) != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "A") ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0)
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
        if (j == 0) {}
      }
      if ((((paramInt6 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -8;
      }
      else
      {
        if ((paramInt8 >= 1 ? 0 : 1) == 0) {
          if (j == 0) {}
        }
        if ((((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else
        {
          if (bool1)
          {
            paramintW1.val = 0;
            i = 0;
            i1 = 1;
            for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
            {
              if (i != 0) {
                i = 0;
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
                  i = 1;
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
          }
          else
          {
            paramintW1.val = paramInt2;
          }
          if ((paramInt11 >= paramintW1.val ? 0 : 1) != 0)
          {
            paramintW2.val = -13;
          }
          else
          {
            if ((paramInt13 >= 1 ? 0 : 1) == 0) {
              if (k == 0) {}
            }
            if ((((paramInt13 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
              paramintW2.val = -16;
            }
          }
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STRSNA", -paramintW2.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      if ((bool1) && ((paramArrayOfBoolean[(1 - 1 + paramInt1)] ^ 0x1) != 0)) {
        return;
      }
      if (j != 0) {
        paramArrayOfFloat4[(1 - 1 + paramInt9)] = 1.0F;
      }
      if (k != 0) {
        paramArrayOfFloat5[(1 - 1 + paramInt10)] = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
      }
      return;
    }
    f5 = Slamch.slamch("P");
    localfloatW4.val = (Slamch.slamch("S") / f5);
    localfloatW1.val = (1.0F / localfloatW4.val);
    Slabad.slabad(localfloatW4, localfloatW1);
    i2 = 0;
    i = 0;
    i1 = 1;
    for (int i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
    {
      if (i != 0)
      {
        i = 0;
        break label2656;
      }
      else
      {
        if ((i1 >= paramInt2 ? 0 : 1) != 0) {
          i = paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1;
        }
        if (bool1) {
          if (i != 0) {
            if ((((paramArrayOfBoolean[(i1 - 1 + paramInt1)] ^ 0x1) != 0) && ((paramArrayOfBoolean[(i1 + 1 - 1 + paramInt1)] ^ 0x1) != 0) ? 1 : 0) != 0) {
              break label2656;
            }
          } else {
            if ((paramArrayOfBoolean[(i1 - 1 + paramInt1)] ^ 0x1) != 0) {
              break label2656;
            }
          }
        }
        i2 += 1;
        if (j != 0) {
          if ((i ^ 0x1) != 0)
          {
            f8 = Sdot.sdot(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            f11 = Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1);
            f6 = Snrm2.snrm2(paramInt2, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            paramArrayOfFloat4[(i2 - 1 + paramInt9)] = (Math.abs(f8) / (f11 * f6));
          }
          else
          {
            f9 = Sdot.sdot(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1);
            f9 += Sdot.sdot(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1);
            f10 = Sdot.sdot(paramInt2, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1);
            f10 -= Sdot.sdot(paramInt2, paramArrayOfFloat2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1);
            f11 = Slapy2.slapy2(Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt8 + paramInt7, 1), Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i2 + 1 - 1) * paramInt8 + paramInt7, 1));
            f6 = Slapy2.slapy2(Snrm2.snrm2(paramInt2, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt6 + paramInt5, 1), Snrm2.snrm2(paramInt2, paramArrayOfFloat2, 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5, 1));
            f1 = Slapy2.slapy2(f9, f10) / (f11 * f6);
            paramArrayOfFloat4[(i2 - 1 + paramInt9)] = f1;
            paramArrayOfFloat4[(i2 + 1 - 1 + paramInt9)] = f1;
          }
        }
        if (k != 0)
        {
          Slacpy.slacpy("Full", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat6, paramInt12, paramInt13);
          localintW2.val = i1;
          localintW3.val = 1;
          Strexc.strexc("No Q", paramInt2, paramArrayOfFloat6, paramInt12, paramInt13, arrayOfFloat, 0, 1, localintW2, localintW3, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, localintW1);
          if ((localintW1.val != 1 ? 0 : 1) == 0) {}
          if (((localintW1.val != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            localfloatW3.val = 1.0F;
            localfloatW2.val = localfloatW1.val;
          }
          else
          {
            int i6;
            if ((paramArrayOfFloat6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)] != 0.0F ? 0 : 1) != 0)
            {
              m = 2;
              for (i6 = paramInt2 - 2 + 1; i6 > 0; i6--)
              {
                paramArrayOfFloat6[(m - 1 + (m - 1) * paramInt13 + paramInt12)] -= paramArrayOfFloat6[(1 - 1 + (1 - 1) * paramInt13 + paramInt12)];
                m += 1;
              }
              i3 = 1;
              i4 = paramInt2 - 1;
            }
            else
            {
              f7 = (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(1 - 1 + (2 - 1) * paramInt13 + paramInt12)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)]));
              f3 = Slapy2.slapy2(f7, paramArrayOfFloat6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)]);
              f2 = f7 / f3;
              f12 = -(paramArrayOfFloat6[(2 - 1 + (1 - 1) * paramInt13 + paramInt12)] / f3);
              n = 3;
              for (i6 = paramInt2 - 3 + 1; i6 > 0; i6--)
              {
                paramArrayOfFloat6[(2 - 1 + (n - 1) * paramInt13 + paramInt12)] = (f2 * paramArrayOfFloat6[(2 - 1 + (n - 1) * paramInt13 + paramInt12)]);
                paramArrayOfFloat6[(n - 1 + (n - 1) * paramInt13 + paramInt12)] -= paramArrayOfFloat6[(1 - 1 + (1 - 1) * paramInt13 + paramInt12)];
                n += 1;
              }
              paramArrayOfFloat6[(2 - 1 + (2 - 1) * paramInt13 + paramInt12)] = 0.0F;
              paramArrayOfFloat6[(1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12)] = (2.0F * f7);
              m = 2;
              for (i6 = paramInt2 - 1 - 2 + 1; i6 > 0; i6--)
              {
                paramArrayOfFloat6[(m - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12)] = (f12 * paramArrayOfFloat6[(1 - 1 + (m + 1 - 1) * paramInt13 + paramInt12)]);
                m += 1;
              }
              i3 = 2;
              i4 = 2 * (paramInt2 - 1);
            }
            localfloatW2.val = 0.0F;
            localintW4.val = 0;
            for (;;)
            {
              Slacn2.slacn2(i4, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 2 - 1) * paramInt13 + paramInt12, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfInt, paramInt14, localfloatW2, localintW4, arrayOfInt, 0);
              if ((localintW4.val == 0 ? 0 : 1) == 0) {
                break;
              }
              if ((localintW4.val != 1 ? 0 : 1) != 0)
              {
                if ((i3 != 1 ? 0 : 1) != 0) {
                  Slaqtr.slaqtr(true, true, paramInt2 - 1, paramArrayOfFloat6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, arrayOfFloat, 0, f4, localfloatW3, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
                } else {
                  Slaqtr.slaqtr(true, false, paramInt2 - 1, paramArrayOfFloat6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, f7, localfloatW3, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
                }
              }
              else if ((i3 != 1 ? 0 : 1) != 0) {
                Slaqtr.slaqtr(false, true, paramInt2 - 1, paramArrayOfFloat6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, arrayOfFloat, 0, f4, localfloatW3, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
              } else {
                Slaqtr.slaqtr(false, false, paramInt2 - 1, paramArrayOfFloat6, 2 - 1 + (2 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 1 - 1) * paramInt13 + paramInt12, f7, localfloatW3, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 4 - 1) * paramInt13 + paramInt12, paramArrayOfFloat6, 1 - 1 + (paramInt2 + 6 - 1) * paramInt13 + paramInt12, localintW1);
              }
            }
          }
          paramArrayOfFloat5[(i2 - 1 + paramInt10)] = (localfloatW3.val / Math.max(localfloatW2.val, localfloatW4.val));
          if (i != 0) {
            paramArrayOfFloat5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfFloat5[(i2 - 1 + paramInt10)];
          }
        }
        if (i != 0) {
          i2 += 1;
        }
      }
      label2656:
      i1 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strsna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */