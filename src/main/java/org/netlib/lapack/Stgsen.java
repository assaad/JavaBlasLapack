package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgsen
{
  public static void stgsen(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean[] paramArrayOfBoolean, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, int paramInt14, intW paramintW1, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat8, int paramInt15, float[] paramArrayOfFloat9, int paramInt16, int paramInt17, int[] paramArrayOfInt, int paramInt18, int paramInt19, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW1 = new intW(0);
    int i4 = 0;
    int i5 = 0;
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f2 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW2.val = 0;
    if ((paramInt17 != -1 ? 0 : 1) == 0) {}
    i = (paramInt19 != -1 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 5 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -5;
    }
    else if ((paramInt5 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW2.val = -7;
    }
    else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW2.val = -9;
    }
    else
    {
      if ((paramInt12 >= 1 ? 0 : 1) == 0) {
        if (!paramBoolean1) {}
      }
      if ((((paramInt12 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -14;
      }
      else
      {
        if ((paramInt14 >= 1 ? 0 : 1) == 0) {
          if (!paramBoolean2) {}
        }
        if ((((paramInt14 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW2.val = -16;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGSEN", -paramintW2.val);
      return;
    }
    f1 = Slamch.slamch("P");
    f2 = Slamch.slamch("S") / f1;
    localintW1.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    i2 = (paramInt1 < 4 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 != 2 ? 0 : 1) == 0) {}
    n = (paramInt1 != 4 ? 0 : 1) == 0 ? 0 : 1;
    if ((paramInt1 != 3 ? 0 : 1) == 0) {}
    i1 = (paramInt1 != 5 ? 0 : 1) == 0 ? 0 : 1;
    m = (n == 0) && (i1 == 0) ? 0 : 1;
    paramintW1.val = 0;
    j = 0;
    i5 = 1;
    for (int i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
    {
      if (j != 0) {
        j = 0;
      } else if ((i5 >= paramInt3 ? 0 : 1) != 0)
      {
        if ((paramArrayOfFloat1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] != 0.0F ? 0 : 1) != 0)
        {
          if (paramArrayOfBoolean[(i5 - 1 + paramInt2)] != 0) {
            paramintW1.val += 1;
          }
        }
        else
        {
          j = 1;
          if (((paramArrayOfBoolean[(i5 - 1 + paramInt2)] == 0) && (paramArrayOfBoolean[(i5 + 1 - 1 + paramInt2)] == 0) ? 0 : 1) != 0) {
            paramintW1.val += 2;
          }
        }
      }
      else if (paramArrayOfBoolean[(paramInt3 - 1 + paramInt2)] != 0) {
        paramintW1.val += 1;
      }
      i5 += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt1 != 4 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      i7 = Util.max(1, 4 * paramInt3 + 16, 2 * paramintW1.val * (paramInt3 - paramintW1.val));
      i6 = Math.max(1, paramInt3 + 6);
    }
    else
    {
      if ((paramInt1 != 3 ? 0 : 1) == 0) {}
      if (((paramInt1 != 5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i7 = Util.max(1, 4 * paramInt3 + 16, 4 * paramintW1.val * (paramInt3 - paramintW1.val));
        i6 = Util.max(1, 2 * paramintW1.val * (paramInt3 - paramintW1.val), paramInt3 + 6);
      }
      else
      {
        i7 = Math.max(1, 4 * paramInt3 + 16);
        i6 = 1;
      }
    }
    paramArrayOfFloat9[(1 - 1 + paramInt16)] = i7;
    paramArrayOfInt[(1 - 1 + paramInt18)] = i6;
    if ((paramInt17 >= i7 ? 0 : 1) != 0) {}
    if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
    {
      paramintW2.val = -22;
    }
    else
    {
      if ((paramInt19 >= i6 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -24;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STGSEN", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramintW1.val != paramInt3 ? 0 : 1) == 0) {}
    if (((paramintW1.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if (i2 != 0)
      {
        paramfloatW1.val = 1.0F;
        paramfloatW2.val = 1.0F;
      }
      if (m != 0)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        i3 = 1;
        for (i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
        {
          Slassq.slassq(paramInt3, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, localfloatW1, localfloatW2);
          Slassq.slassq(paramInt3, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1, localfloatW1, localfloatW2);
          i3 += 1;
        }
        paramArrayOfFloat8[(1 - 1 + paramInt15)] = (localfloatW1.val * (float)Math.sqrt(localfloatW2.val));
        paramArrayOfFloat8[(2 - 1 + paramInt15)] = paramArrayOfFloat8[(1 - 1 + paramInt15)];
      }
    }
    else
    {
      localintW4.val = 0;
      j = 0;
      i5 = 1;
      for (i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
      {
        if (j != 0)
        {
          j = 0;
        }
        else
        {
          k = paramArrayOfBoolean[(i5 - 1 + paramInt2)];
          if ((i5 >= paramInt3 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0)
            {
              j = 1;
              k = (k == 0) && (paramArrayOfBoolean[(i5 + 1 - 1 + paramInt2)] == 0) ? 0 : 1;
            }
          }
          if (k != 0)
          {
            localintW4.val += 1;
            localintW3.val = i5;
            if ((i5 == localintW4.val ? 0 : 1) != 0) {
              Stgexc.stgexc(paramBoolean1, paramBoolean2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt11, paramInt12, paramArrayOfFloat7, paramInt13, paramInt14, localintW3, localintW4, paramArrayOfFloat9, paramInt16, paramInt17, localintW1);
            }
            if ((localintW1.val <= 0 ? 0 : 1) != 0)
            {
              paramintW2.val = 1;
              if (i2 != 0)
              {
                paramfloatW1.val = 0.0F;
                paramfloatW2.val = 0.0F;
              }
              if (m != 0)
              {
                paramArrayOfFloat8[(1 - 1 + paramInt15)] = 0.0F;
                paramArrayOfFloat8[(2 - 1 + paramInt15)] = 0.0F;
              }
              break;
            }
            if (j != 0) {
              localintW4.val += 1;
            }
          }
        }
        i5 += 1;
      }
      if (i2 != 0)
      {
        i9 = paramintW1.val;
        i10 = paramInt3 - paramintW1.val;
        i3 = i9 + 1;
        i4 = 0;
        Slacpy.slacpy("Full", i9, i10, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i9);
        Slacpy.slacpy("Full", i9, i10, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i9);
        stgsyl_adapter("N", i4, i9, i10, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i9, localfloatW1, paramArrayOfFloat8, 1 - 1 + paramInt15, paramArrayOfFloat9, i9 * i10 * 2 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
        localfloatW3.val = 0.0F;
        localfloatW2.val = 1.0F;
        Slassq.slassq(i9 * i10, paramArrayOfFloat9, paramInt16, 1, localfloatW3, localfloatW2);
        localfloatW3.val *= (float)Math.sqrt(localfloatW2.val);
        if ((paramfloatW1.val != 0.0F ? 0 : 1) != 0) {
          paramfloatW1.val = 1.0F;
        } else {
          localfloatW1.val /= (float)Math.sqrt(localfloatW1.val * localfloatW1.val / paramfloatW1.val + paramfloatW1.val) * (float)Math.sqrt(paramfloatW1.val);
        }
        localfloatW3.val = 0.0F;
        localfloatW2.val = 1.0F;
        Slassq.slassq(i9 * i10, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, 1, localfloatW3, localfloatW2);
        localfloatW3.val *= (float)Math.sqrt(localfloatW2.val);
        if ((paramfloatW2.val != 0.0F ? 0 : 1) != 0) {
          paramfloatW2.val = 1.0F;
        } else {
          localfloatW1.val /= (float)Math.sqrt(localfloatW1.val * localfloatW1.val / paramfloatW2.val + paramfloatW2.val) * (float)Math.sqrt(paramfloatW2.val);
        }
      }
      if (m != 0) {
        if (n != 0)
        {
          i9 = paramintW1.val;
          i10 = paramInt3 - paramintW1.val;
          i3 = i9 + 1;
          i4 = 3;
          stgsyl_adapter("N", i4, i9, i10, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i9, localfloatW1, paramArrayOfFloat8, 1 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
          stgsyl_adapter("N", i4, i10, i9, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i10, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i10, localfloatW1, paramArrayOfFloat8, 2 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
        }
        else
        {
          localintW2.val = 0;
          i9 = paramintW1.val;
          i10 = paramInt3 - paramintW1.val;
          i3 = i9 + 1;
          i4 = 0;
          i8 = 2 * i9 * i10;
          for (;;)
          {
            slacn2_adapter(i8, paramArrayOfFloat9, i8 + 1 - 1 + paramInt16, paramArrayOfFloat9, paramInt16, paramArrayOfInt, paramInt18, paramArrayOfFloat8, 1 - 1 + paramInt15, localintW2, arrayOfInt, 0);
            if ((localintW2.val == 0 ? 0 : 1) == 0) {
              break;
            }
            if ((localintW2.val != 1 ? 0 : 1) != 0) {
              stgsyl_adapter("N", i4, i9, i10, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i9, localfloatW1, paramArrayOfFloat8, 1 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            } else {
              stgsyl_adapter("T", i4, i9, i10, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i9, localfloatW1, paramArrayOfFloat8, 1 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            }
          }
          paramArrayOfFloat8[(1 - 1 + paramInt15)] = (localfloatW1.val / paramArrayOfFloat8[(1 - 1 + paramInt15)]);
          for (;;)
          {
            slacn2_adapter(i8, paramArrayOfFloat9, i8 + 1 - 1 + paramInt16, paramArrayOfFloat9, paramInt16, paramArrayOfInt, paramInt18, paramArrayOfFloat8, 2 - 1 + paramInt15, localintW2, arrayOfInt, 0);
            if ((localintW2.val == 0 ? 0 : 1) == 0) {
              break;
            }
            if ((localintW2.val != 1 ? 0 : 1) != 0) {
              stgsyl_adapter("N", i4, i10, i9, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i10, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i10, localfloatW1, paramArrayOfFloat8, 2 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            } else {
              stgsyl_adapter("T", i4, i10, i9, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat9, paramInt16, i10, paramArrayOfFloat2, i3 - 1 + (i3 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat9, i9 * i10 + 1 - 1 + paramInt16, i10, localfloatW1, paramArrayOfFloat8, 2 - 1 + paramInt15, paramArrayOfFloat9, 2 * i9 * i10 + 1 - 1 + paramInt16, paramInt17 - 2 * i9 * i10, paramArrayOfInt, paramInt18, localintW1);
            }
          }
          paramArrayOfFloat8[(2 - 1 + paramInt15)] = (localfloatW1.val / paramArrayOfFloat8[(2 - 1 + paramInt15)]);
        }
      }
    }
    j = 0;
    i5 = 1;
    for (i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
    {
      if (j != 0)
      {
        j = 0;
      }
      else
      {
        if ((i5 >= paramInt3 ? 0 : 1) != 0) {
          if ((paramArrayOfFloat1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0) {
            j = 1;
          }
        }
        if (j != 0)
        {
          paramArrayOfFloat9[(1 - 1 + paramInt16)] = paramArrayOfFloat1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat9[(2 - 1 + paramInt16)] = paramArrayOfFloat1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat9[(3 - 1 + paramInt16)] = paramArrayOfFloat1[(i5 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat9[(4 - 1 + paramInt16)] = paramArrayOfFloat1[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat9[(5 - 1 + paramInt16)] = paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat9[(6 - 1 + paramInt16)] = paramArrayOfFloat2[(i5 + 1 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat9[(7 - 1 + paramInt16)] = paramArrayOfFloat2[(i5 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          paramArrayOfFloat9[(8 - 1 + paramInt16)] = paramArrayOfFloat2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          slag2_adapter(paramArrayOfFloat9, paramInt16, 2, paramArrayOfFloat9, 5 - 1 + paramInt16, 2, f2 * f1, paramArrayOfFloat5, i5 - 1 + paramInt10, paramArrayOfFloat5, i5 + 1 - 1 + paramInt10, paramArrayOfFloat3, i5 - 1 + paramInt8, paramArrayOfFloat3, i5 + 1 - 1 + paramInt8, paramArrayOfFloat4, i5 - 1 + paramInt9);
          paramArrayOfFloat4[(i5 + 1 - 1 + paramInt9)] = (-paramArrayOfFloat4[(i5 - 1 + paramInt9)]);
        }
        else
        {
          if ((Util.sign(1.0F, paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]) >= 0.0F ? 0 : 1) != 0)
          {
            i3 = 1;
            for (int i12 = paramInt3 - 1 + 1; i12 > 0; i12--)
            {
              paramArrayOfFloat1[(i5 - 1 + (i3 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i5 - 1 + (i3 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat2[(i5 - 1 + (i3 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i5 - 1 + (i3 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfFloat6[(i3 - 1 + (i5 - 1) * paramInt12 + paramInt11)] = (-paramArrayOfFloat6[(i3 - 1 + (i5 - 1) * paramInt12 + paramInt11)]);
              i3 += 1;
            }
          }
          paramArrayOfFloat3[(i5 - 1 + paramInt8)] = paramArrayOfFloat1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat4[(i5 - 1 + paramInt9)] = 0.0F;
          paramArrayOfFloat5[(i5 - 1 + paramInt10)] = paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)];
        }
      }
      i5 += 1;
    }
    paramArrayOfFloat9[(1 - 1 + paramInt16)] = i7;
    paramArrayOfInt[(1 - 1 + paramInt18)] = i6;
  }
  
  private static void stgsyl_adapter(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt16, float[] paramArrayOfFloat8, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat7[paramInt16]);
    Stgsyl.stgsyl(paramString, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, paramInt12, paramInt13, paramArrayOfFloat6, paramInt14, paramInt15, paramfloatW, localfloatW, paramArrayOfFloat8, paramInt17, paramInt18, paramArrayOfInt, paramInt19, paramintW);
    paramArrayOfFloat7[paramInt16] = localfloatW.val;
  }
  
  private static void slacn2_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt5]);
    Slacn2.slacn2(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfInt1, paramInt4, localfloatW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfFloat3[paramInt5] = localfloatW.val;
  }
  
  private static void slag2_adapter(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float paramFloat, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, float[] paramArrayOfFloat7, int paramInt9)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat3[paramInt5]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat4[paramInt6]);
    floatW localfloatW3 = new floatW(paramArrayOfFloat5[paramInt7]);
    floatW localfloatW4 = new floatW(paramArrayOfFloat6[paramInt8]);
    floatW localfloatW5 = new floatW(paramArrayOfFloat7[paramInt9]);
    Slag2.slag2(paramArrayOfFloat1, paramInt1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramFloat, localfloatW1, localfloatW2, localfloatW3, localfloatW4, localfloatW5);
    paramArrayOfFloat3[paramInt5] = localfloatW1.val;
    paramArrayOfFloat4[paramInt6] = localfloatW2.val;
    paramArrayOfFloat5[paramInt7] = localfloatW3.val;
    paramArrayOfFloat6[paramInt8] = localfloatW4.val;
    paramArrayOfFloat7[paramInt9] = localfloatW5.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgsen.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */