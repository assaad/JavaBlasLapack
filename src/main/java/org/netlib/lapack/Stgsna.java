package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgsna
{
  public static void stgsna(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, int paramInt13, intW paramintW1, float[] paramArrayOfFloat7, int paramInt14, int paramInt15, int[] paramArrayOfInt, int paramInt16, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float[] arrayOfFloat1 = new float[1];
    float[] arrayOfFloat2 = new float[1];
    bool2 = Lsame.lsame(paramString1, "B");
    m = (!Lsame.lsame(paramString1, "E")) && (!bool2) ? 0 : 1;
    k = (!Lsame.lsame(paramString1, "V")) && (!bool2) ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "S");
    paramintW2.val = 0;
    i = paramInt15 != -1 ? 0 : 1;
    if ((((m ^ 0x1) != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0)
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
    else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW2.val = -8;
    }
    else
    {
      if (m != 0) {}
      if (((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -10;
      }
      else
      {
        if (m != 0) {}
        if (((paramInt10 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -12;
        }
        else
        {
          if (bool1)
          {
            paramintW1.val = 0;
            j = 0;
            i2 = 1;
            for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
            {
              if (j != 0) {
                j = 0;
              } else if ((i2 >= paramInt2 ? 0 : 1) != 0)
              {
                if ((paramArrayOfFloat1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] != 0.0F ? 0 : 1) != 0)
                {
                  if (paramArrayOfBoolean[(i2 - 1 + paramInt1)] != 0) {
                    paramintW1.val += 1;
                  }
                }
                else
                {
                  j = 1;
                  if (((paramArrayOfBoolean[(i2 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i2 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
                    paramintW1.val += 2;
                  }
                }
              }
              else if (paramArrayOfBoolean[(paramInt2 - 1 + paramInt1)] != 0) {
                paramintW1.val += 1;
              }
              i2 += 1;
            }
          }
          else
          {
            paramintW1.val = paramInt2;
          }
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            i4 = 1;
          } else if (((!Lsame.lsame(paramString1, "V")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0) {
            i4 = 2 * paramInt2 * (paramInt2 + 2) + 16;
          } else {
            i4 = paramInt2;
          }
          paramArrayOfFloat7[(1 - 1 + paramInt14)] = i4;
          if ((paramInt13 >= paramintW1.val ? 0 : 1) != 0)
          {
            paramintW2.val = -15;
          }
          else
          {
            if ((paramInt15 >= i4 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW2.val = -18;
            }
          }
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGSNA", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    f5 = Slamch.slamch("P");
    f10 = Slamch.slamch("S") / f5;
    i3 = 0;
    j = 0;
    i2 = 1;
    for (int i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
    {
      if (j != 0)
      {
        j = 0;
        break label2834;
      }
      else
      {
        if ((i2 >= paramInt2 ? 0 : 1) != 0) {
          j = paramArrayOfFloat1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1;
        }
        if (bool1) {
          if (j != 0) {
            if ((((paramArrayOfBoolean[(i2 - 1 + paramInt1)] ^ 0x1) != 0) && ((paramArrayOfBoolean[(i2 + 1 - 1 + paramInt1)] ^ 0x1) != 0) ? 1 : 0) != 0) {
              break label2834;
            }
          } else {
            if ((paramArrayOfBoolean[(i2 - 1 + paramInt1)] ^ 0x1) != 0) {
              break label2834;
            }
          }
        }
        i3 += 1;
        if (m != 0) {
          if (j != 0)
          {
            f7 = Slapy2.slapy2(Snrm2.snrm2(paramInt2, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1), Snrm2.snrm2(paramInt2, paramArrayOfFloat4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1));
            f6 = Slapy2.slapy2(Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1), Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1));
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f14 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            f13 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f11 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            f12 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            f15 = f14 + f11;
            f16 = f12 - f13;
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f14 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            f13 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, 1 - 1 + (i3 + 1 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f11 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 + 1 - 1) * paramInt8 + paramInt7, 1);
            f12 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            f17 = f14 + f11;
            f18 = f12 - f13;
            f15 = Slapy2.slapy2(f15, f16);
            f17 = Slapy2.slapy2(f17, f18);
            f4 = Slapy2.slapy2(f15, f17);
            paramArrayOfFloat5[(i3 - 1 + paramInt11)] = (f4 / (f7 * f6));
            paramArrayOfFloat5[(i3 + 1 - 1 + paramInt11)] = paramArrayOfFloat5[(i3 - 1 + paramInt11)];
          }
          else
          {
            f7 = Snrm2.snrm2(paramInt2, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1);
            f6 = Snrm2.snrm2(paramInt2, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f15 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("N", paramInt2, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, 1 - 1 + (i3 - 1) * paramInt10 + paramInt9, 1, 0.0F, paramArrayOfFloat7, paramInt14, 1);
            f17 = Sdot.sdot(paramInt2, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt8 + paramInt7, 1);
            f4 = Slapy2.slapy2(f15, f17);
            if ((f4 != 0.0F ? 0 : 1) != 0) {
              paramArrayOfFloat5[(i3 - 1 + paramInt11)] = -1.0F;
            } else {
              paramArrayOfFloat5[(i3 - 1 + paramInt11)] = (f4 / (f7 * f6));
            }
          }
        }
        if (k != 0)
        {
          if ((paramInt2 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfFloat6[(i3 - 1 + paramInt12)] = Slapy2.slapy2(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
            break label2834;
          }
          if (j != 0)
          {
            paramArrayOfFloat7[(1 - 1 + paramInt14)] = paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            paramArrayOfFloat7[(2 - 1 + paramInt14)] = paramArrayOfFloat1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            paramArrayOfFloat7[(3 - 1 + paramInt14)] = paramArrayOfFloat1[(i2 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)];
            paramArrayOfFloat7[(4 - 1 + paramInt14)] = paramArrayOfFloat1[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)];
            paramArrayOfFloat7[(5 - 1 + paramInt14)] = paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt6 + paramInt5)];
            paramArrayOfFloat7[(6 - 1 + paramInt14)] = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 - 1) * paramInt6 + paramInt5)];
            paramArrayOfFloat7[(7 - 1 + paramInt14)] = paramArrayOfFloat2[(i2 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5)];
            paramArrayOfFloat7[(8 - 1 + paramInt14)] = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt6 + paramInt5)];
            slag2_adapter(paramArrayOfFloat7, paramInt14, 2, paramArrayOfFloat7, 5 - 1 + paramInt14, 2, f10 * f5, localfloatW3, arrayOfFloat2, 1 - 1, localfloatW2, arrayOfFloat1, 1 - 1, localfloatW1);
            f1 = 1.0F;
            f2 = 2.0F * (localfloatW2.val * localfloatW2.val + localfloatW1.val * localfloatW1.val + localfloatW3.val * localfloatW3.val);
            f3 = 4.0F * localfloatW3.val * localfloatW3.val * localfloatW1.val * localfloatW1.val;
            f8 = f2 + (float)Math.sqrt(f2 * f2 - 4.0F * f3);
            f9 = f3 / f8;
            f8 /= 2.0F;
            f4 = Math.min((float)Math.sqrt(f8), (float)Math.sqrt(f9));
          }
          Slacpy.slacpy("Full", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat7, paramInt14, paramInt2);
          Slacpy.slacpy("Full", paramInt2, paramInt2, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat7, paramInt2 * paramInt2 + 1 - 1 + paramInt14, paramInt2);
          localintW2.val = i2;
          localintW3.val = 1;
          Stgexc.stgexc(false, false, paramInt2, paramArrayOfFloat7, paramInt14, paramInt2, paramArrayOfFloat7, paramInt2 * paramInt2 + 1 - 1 + paramInt14, paramInt2, arrayOfFloat1, 0, 1, arrayOfFloat2, 0, 1, localintW2, localintW3, paramArrayOfFloat7, paramInt2 * paramInt2 * 2 + 1 - 1 + paramInt14, paramInt15 - 2 * paramInt2 * paramInt2, localintW1);
          if ((localintW1.val <= 0 ? 0 : 1) != 0)
          {
            paramArrayOfFloat6[(i3 - 1 + paramInt12)] = 0.0F;
          }
          else
          {
            i5 = 1;
            if ((paramArrayOfFloat7[(2 - 1 + paramInt14)] == 0.0F ? 0 : 1) != 0) {
              i5 = 2;
            }
            i6 = paramInt2 - i5;
            if ((i6 != 0 ? 0 : 1) != 0)
            {
              paramArrayOfFloat6[(i3 - 1 + paramInt12)] = f4;
            }
            else
            {
              n = paramInt2 * paramInt2 + 1;
              i1 = 2 * paramInt2 * paramInt2 + 1;
              stgsyl_adapter("N", 3, i6, i5, paramArrayOfFloat7, paramInt2 * i5 + i5 + 1 - 1 + paramInt14, paramInt2, paramArrayOfFloat7, paramInt14, paramInt2, paramArrayOfFloat7, i5 + 1 - 1 + paramInt14, paramInt2, paramArrayOfFloat7, paramInt2 * i5 + i5 + n - 1 + paramInt14, paramInt2, paramArrayOfFloat7, n - 1 + paramInt14, paramInt2, paramArrayOfFloat7, i5 + n - 1 + paramInt14, paramInt2, localfloatW4, paramArrayOfFloat6, i3 - 1 + paramInt12, paramArrayOfFloat7, i1 + 1 - 1 + paramInt14, paramInt15 - 2 * paramInt2 * paramInt2, paramArrayOfInt, paramInt16, localintW1);
              if (j != 0) {
                paramArrayOfFloat6[(i3 - 1 + paramInt12)] = Math.min(Math.max(1.0F, f1) * paramArrayOfFloat6[(i3 - 1 + paramInt12)], f4);
              }
            }
          }
          if (j != 0) {
            paramArrayOfFloat6[(i3 + 1 - 1 + paramInt12)] = paramArrayOfFloat6[(i3 - 1 + paramInt12)];
          }
        }
        if (j != 0) {
          i3 += 1;
        }
      }
      label2834:
      i2 += 1;
    }
    paramArrayOfFloat7[(1 - 1 + paramInt14)] = i4;
  }
  
  private static void slag2_adapter(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float paramFloat, floatW paramfloatW1, float[] paramArrayOfFloat3, int paramInt5, floatW paramfloatW2, float[] paramArrayOfFloat4, int paramInt6, floatW paramfloatW3)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat3[paramInt5]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat4[paramInt6]);
    Slag2.slag2(paramArrayOfFloat1, paramInt1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramFloat, paramfloatW1, localfloatW1, paramfloatW2, localfloatW2, paramfloatW3);
    paramArrayOfFloat3[paramInt5] = localfloatW1.val;
    paramArrayOfFloat4[paramInt6] = localfloatW2.val;
  }
  
  private static void stgsyl_adapter(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt16, float[] paramArrayOfFloat8, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat7[paramInt16]);
    Stgsyl.stgsyl(paramString, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramInt15, paramfloatW, localfloatW, paramArrayOfFloat8, paramInt17, paramInt18, paramArrayOfInt, paramInt19, paramintW);
    paramArrayOfFloat7[paramInt16] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgsna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */