package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgex2
{
  public static void stgex2(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, float[] paramArrayOfFloat5, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f3 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    int[] arrayOfInt = new int[4];
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float[] arrayOfFloat3 = new float[2];
    float[] arrayOfFloat4 = new float[4 * 4];
    float[] arrayOfFloat5 = new float[4 * 4];
    float[] arrayOfFloat6 = new float[4 * 4];
    float[] arrayOfFloat7 = new float[4 * 4];
    float[] arrayOfFloat8 = new float[4 * 4];
    float[] arrayOfFloat9 = new float[4 * 4];
    float[] arrayOfFloat10 = new float[4 * 4];
    float[] arrayOfFloat11 = new float[4];
    float[] arrayOfFloat12 = new float[4];
    float[] arrayOfFloat13 = new float[4 * 4];
    paramintW.val = 0;
    if ((paramInt1 > 1 ? 0 : 1) == 0) {}
    if (((paramInt11 > 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt12 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt11 <= paramInt1 ? 0 : 1) == 0) {}
    if (((paramInt10 + paramInt11 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    m = paramInt11 + paramInt12;
    if ((paramInt14 >= Math.max(paramInt1 * m, m * m * 2) ? 0 : 1) != 0)
    {
      paramintW.val = -16;
      paramArrayOfFloat5[(1 - 1 + paramInt13)] = Math.max(paramInt1 * m, m * m * 2);
      return;
    }
    j = 0;
    i = 0;
    Slaset.slaset("Full", 4, 4, 0.0F, 0.0F, arrayOfFloat6, 0, 4);
    Slaset.slaset("Full", 4, 4, 0.0F, 0.0F, arrayOfFloat4, 0, 4);
    Slacpy.slacpy("Full", m, m, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfFloat8, 0, 4);
    Slacpy.slacpy("Full", m, m, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat10, 0, 4);
    f4 = Slamch.slamch("P");
    f9 = Slamch.slamch("S") / f4;
    localfloatW2.val = 0.0F;
    localfloatW3.val = 1.0F;
    Slacpy.slacpy("Full", m, m, arrayOfFloat8, 0, 4, paramArrayOfFloat5, paramInt13, m);
    Slassq.slassq(m * m, paramArrayOfFloat5, paramInt13, 1, localfloatW2, localfloatW3);
    Slacpy.slacpy("Full", m, m, arrayOfFloat10, 0, 4, paramArrayOfFloat5, paramInt13, m);
    Slassq.slassq(m * m, paramArrayOfFloat5, paramInt13, 1, localfloatW2, localfloatW3);
    f3 = localfloatW2.val * (float)Math.sqrt(localfloatW3.val);
    f11 = Math.max(10.0F * f4 * f3, f9);
    if ((m != 2 ? 0 : 1) != 0)
    {
      f5 = arrayOfFloat8[(2 - 1 + (2 - 1) * 4)] * arrayOfFloat10[(1 - 1 + (1 - 1) * 4)] - arrayOfFloat10[(2 - 1 + (2 - 1) * 4)] * arrayOfFloat8[(1 - 1 + (1 - 1) * 4)];
      f6 = arrayOfFloat8[(2 - 1 + (2 - 1) * 4)] * arrayOfFloat10[(1 - 1 + (2 - 1) * 4)] - arrayOfFloat10[(2 - 1 + (2 - 1) * 4)] * arrayOfFloat8[(1 - 1 + (2 - 1) * 4)];
      f8 = Math.abs(arrayOfFloat10[(2 - 1 + (2 - 1) * 4)]);
      f7 = Math.abs(arrayOfFloat8[(2 - 1 + (2 - 1) * 4)]);
      slartg_adapter(f5, f6, arrayOfFloat4, 1 - 1 + (2 - 1) * 4, arrayOfFloat4, 1 - 1 + (1 - 1) * 4, localfloatW1);
      arrayOfFloat4[(2 - 1 + (1 - 1) * 4)] = (-arrayOfFloat4[(1 - 1 + (2 - 1) * 4)]);
      arrayOfFloat4[(2 - 1 + (2 - 1) * 4)] = arrayOfFloat4[(1 - 1 + (1 - 1) * 4)];
      Srot.srot(2, arrayOfFloat8, 1 - 1 + (1 - 1) * 4, 1, arrayOfFloat8, 1 - 1 + (2 - 1) * 4, 1, arrayOfFloat4[(1 - 1 + (1 - 1) * 4)], arrayOfFloat4[(2 - 1 + (1 - 1) * 4)]);
      Srot.srot(2, arrayOfFloat10, 1 - 1 + (1 - 1) * 4, 1, arrayOfFloat10, 1 - 1 + (2 - 1) * 4, 1, arrayOfFloat4[(1 - 1 + (1 - 1) * 4)], arrayOfFloat4[(2 - 1 + (1 - 1) * 4)]);
      if ((f7 < f8 ? 0 : 1) != 0) {
        slartg_adapter(arrayOfFloat8[(1 - 1 + (1 - 1) * 4)], arrayOfFloat8[(2 - 1 + (1 - 1) * 4)], arrayOfFloat6, 1 - 1 + (1 - 1) * 4, arrayOfFloat6, 2 - 1 + (1 - 1) * 4, localfloatW1);
      } else {
        slartg_adapter(arrayOfFloat10[(1 - 1 + (1 - 1) * 4)], arrayOfFloat10[(2 - 1 + (1 - 1) * 4)], arrayOfFloat6, 1 - 1 + (1 - 1) * 4, arrayOfFloat6, 2 - 1 + (1 - 1) * 4, localfloatW1);
      }
      Srot.srot(2, arrayOfFloat8, 1 - 1 + (1 - 1) * 4, 4, arrayOfFloat8, 2 - 1 + (1 - 1) * 4, 4, arrayOfFloat6[(1 - 1 + (1 - 1) * 4)], arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
      Srot.srot(2, arrayOfFloat10, 1 - 1 + (1 - 1) * 4, 4, arrayOfFloat10, 2 - 1 + (1 - 1) * 4, 4, arrayOfFloat6[(1 - 1 + (1 - 1) * 4)], arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
      arrayOfFloat6[(2 - 1 + (2 - 1) * 4)] = arrayOfFloat6[(1 - 1 + (1 - 1) * 4)];
      arrayOfFloat6[(1 - 1 + (2 - 1) * 4)] = (-arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
      f12 = Math.abs(arrayOfFloat8[(2 - 1 + (1 - 1) * 4)]) + Math.abs(arrayOfFloat10[(2 - 1 + (1 - 1) * 4)]);
      j = f12 > f11 ? 0 : 1;
      if ((j ^ 0x1) == 0) {
        if (1 != 0)
        {
          Slacpy.slacpy("Full", m, m, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
          Sgemm.sgemm("N", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat8, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
          Sgemm.sgemm("N", "T", m, m, m, -1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 1.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
          localfloatW2.val = 0.0F;
          localfloatW3.val = 1.0F;
          Slassq.slassq(m * m, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, 1, localfloatW2, localfloatW3);
          Slacpy.slacpy("Full", m, m, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
          Sgemm.sgemm("N", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat10, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
          Sgemm.sgemm("N", "T", m, m, m, -1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 1.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
          Slassq.slassq(m * m, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, 1, localfloatW2, localfloatW3);
          f10 = localfloatW2.val * (float)Math.sqrt(localfloatW3.val);
          i = f10 > f11 ? 0 : 1;
          if ((i ^ 0x1) != 0) {}
        }
        else
        {
          Srot.srot(paramInt10 + 1, paramArrayOfFloat1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (paramInt10 + 1 - 1) * paramInt3 + paramInt2, 1, arrayOfFloat4[(1 - 1 + (1 - 1) * 4)], arrayOfFloat4[(2 - 1 + (1 - 1) * 4)]);
          Srot.srot(paramInt10 + 1, paramArrayOfFloat2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (paramInt10 + 1 - 1) * paramInt5 + paramInt4, 1, arrayOfFloat4[(1 - 1 + (1 - 1) * 4)], arrayOfFloat4[(2 - 1 + (1 - 1) * 4)]);
          Srot.srot(paramInt1 - paramInt10 + 1, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfFloat6[(1 - 1 + (1 - 1) * 4)], arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
          Srot.srot(paramInt1 - paramInt10 + 1, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat6[(1 - 1 + (1 - 1) * 4)], arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
          paramArrayOfFloat1[(paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2)] = 0.0F;
          paramArrayOfFloat2[(paramInt10 + 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4)] = 0.0F;
          if (paramBoolean2) {
            Srot.srot(paramInt1, paramArrayOfFloat4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + (paramInt10 + 1 - 1) * paramInt9 + paramInt8, 1, arrayOfFloat4[(1 - 1 + (1 - 1) * 4)], arrayOfFloat4[(2 - 1 + (1 - 1) * 4)]);
          }
          if (paramBoolean1) {
            Srot.srot(paramInt1, paramArrayOfFloat3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, 1 - 1 + (paramInt10 + 1 - 1) * paramInt7 + paramInt6, 1, arrayOfFloat6[(1 - 1 + (1 - 1) * 4)], arrayOfFloat6[(2 - 1 + (1 - 1) * 4)]);
          }
          return;
        }
      }
    }
    else
    {
      Slacpy.slacpy("Full", paramInt11, paramInt12, arrayOfFloat10, 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfFloat6, 0, 4);
      Slacpy.slacpy("Full", paramInt11, paramInt12, arrayOfFloat8, 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfFloat4, paramInt12 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4);
      Stgsy2.stgsy2("N", 0, paramInt11, paramInt12, arrayOfFloat8, 0, 4, arrayOfFloat8, paramInt11 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfFloat4, paramInt12 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfFloat10, 0, 4, arrayOfFloat10, paramInt11 + 1 - 1 + (paramInt11 + 1 - 1) * 4, 4, arrayOfFloat6, 0, 4, localfloatW4, localfloatW3, localfloatW2, arrayOfInt, 0, localintW1, localintW2);
      k = 1;
      for (int n = paramInt12 - 1 + 1; n > 0; n--)
      {
        Sscal.sscal(paramInt11, -1.0F, arrayOfFloat6, 1 - 1 + (k - 1) * 4, 1);
        arrayOfFloat6[(paramInt11 + k - 1 + (k - 1) * 4)] = localfloatW4.val;
        k += 1;
      }
      Sgeqr2.sgeqr2(m, paramInt12, arrayOfFloat6, 0, 4, arrayOfFloat11, 0, paramArrayOfFloat5, paramInt13, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) == 0)
      {
        Sorg2r.sorg2r(m, m, paramInt12, arrayOfFloat6, 0, 4, arrayOfFloat11, 0, paramArrayOfFloat5, paramInt13, localintW2);
        if ((localintW2.val == 0 ? 0 : 1) == 0)
        {
          k = 1;
          for (n = paramInt11 - 1 + 1; n > 0; n--)
          {
            arrayOfFloat4[(paramInt12 + k - 1 + (k - 1) * 4)] = localfloatW4.val;
            k += 1;
          }
          Sgerq2.sgerq2(paramInt11, m, arrayOfFloat4, paramInt12 + 1 - 1 + (1 - 1) * 4, 4, arrayOfFloat12, 0, paramArrayOfFloat5, paramInt13, localintW2);
          if ((localintW2.val == 0 ? 0 : 1) == 0)
          {
            Sorgr2.sorgr2(m, m, paramInt11, arrayOfFloat4, 0, 4, arrayOfFloat12, 0, paramArrayOfFloat5, paramInt13, localintW2);
            if ((localintW2.val == 0 ? 0 : 1) == 0)
            {
              Sgemm.sgemm("T", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat8, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
              Sgemm.sgemm("N", "T", m, m, m, 1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 0.0F, arrayOfFloat8, 0, 4);
              Sgemm.sgemm("T", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat10, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
              Sgemm.sgemm("N", "T", m, m, m, 1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 0.0F, arrayOfFloat10, 0, 4);
              Slacpy.slacpy("F", m, m, arrayOfFloat8, 0, 4, arrayOfFloat9, 0, 4);
              Slacpy.slacpy("F", m, m, arrayOfFloat10, 0, 4, arrayOfFloat13, 0, 4);
              Slacpy.slacpy("F", m, m, arrayOfFloat4, 0, 4, arrayOfFloat5, 0, 4);
              Slacpy.slacpy("F", m, m, arrayOfFloat6, 0, 4, arrayOfFloat7, 0, 4);
              Sgerq2.sgerq2(m, m, arrayOfFloat10, 0, 4, arrayOfFloat12, 0, paramArrayOfFloat5, paramInt13, localintW2);
              if ((localintW2.val == 0 ? 0 : 1) == 0)
              {
                Sormr2.sormr2("R", "T", m, m, m, arrayOfFloat10, 0, 4, arrayOfFloat12, 0, arrayOfFloat8, 0, 4, paramArrayOfFloat5, paramInt13, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) == 0)
                {
                  Sormr2.sormr2("L", "N", m, m, m, arrayOfFloat10, 0, 4, arrayOfFloat12, 0, arrayOfFloat4, 0, 4, paramArrayOfFloat5, paramInt13, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) == 0)
                  {
                    localfloatW2.val = 0.0F;
                    localfloatW3.val = 1.0F;
                    k = 1;
                    for (n = paramInt12 - 1 + 1; n > 0; n--)
                    {
                      Slassq.slassq(paramInt11, arrayOfFloat8, paramInt12 + 1 - 1 + (k - 1) * 4, 1, localfloatW2, localfloatW3);
                      k += 1;
                    }
                    f2 = localfloatW2.val * (float)Math.sqrt(localfloatW3.val);
                    Sgeqr2.sgeqr2(m, m, arrayOfFloat13, 0, 4, arrayOfFloat11, 0, paramArrayOfFloat5, paramInt13, localintW2);
                    if ((localintW2.val == 0 ? 0 : 1) == 0)
                    {
                      Sorm2r.sorm2r("L", "T", m, m, m, arrayOfFloat13, 0, 4, arrayOfFloat11, 0, arrayOfFloat9, 0, 4, paramArrayOfFloat5, paramInt13, paramintW);
                      Sorm2r.sorm2r("R", "N", m, m, m, arrayOfFloat13, 0, 4, arrayOfFloat11, 0, arrayOfFloat7, 0, 4, paramArrayOfFloat5, paramInt13, paramintW);
                      if ((localintW2.val == 0 ? 0 : 1) == 0)
                      {
                        localfloatW2.val = 0.0F;
                        localfloatW3.val = 1.0F;
                        k = 1;
                        for (n = paramInt12 - 1 + 1; n > 0; n--)
                        {
                          Slassq.slassq(paramInt11, arrayOfFloat9, paramInt12 + 1 - 1 + (k - 1) * 4, 1, localfloatW2, localfloatW3);
                          k += 1;
                        }
                        f1 = localfloatW2.val * (float)Math.sqrt(localfloatW3.val);
                        if ((f1 > f2 ? 0 : 1) != 0) {}
                        if (((f1 > f11 ? 0 : 1) != 0 ? 1 : 0) != 0)
                        {
                          Slacpy.slacpy("F", m, m, arrayOfFloat9, 0, 4, arrayOfFloat8, 0, 4);
                          Slacpy.slacpy("F", m, m, arrayOfFloat13, 0, 4, arrayOfFloat10, 0, 4);
                          Slacpy.slacpy("F", m, m, arrayOfFloat5, 0, 4, arrayOfFloat4, 0, 4);
                          Slacpy.slacpy("F", m, m, arrayOfFloat7, 0, 4, arrayOfFloat6, 0, 4);
                        }
                        else if ((f2 < f11 ? 0 : 1) != 0)
                        {
                          break label5352;
                        }
                        Slaset.slaset("Lower", m - 1, m - 1, 0.0F, 0.0F, arrayOfFloat10, 2 - 1 + (1 - 1) * 4, 4);
                        if (1 != 0)
                        {
                          Slacpy.slacpy("Full", m, m, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
                          Sgemm.sgemm("N", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat8, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
                          Sgemm.sgemm("N", "N", m, m, m, -1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 1.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
                          localfloatW2.val = 0.0F;
                          localfloatW3.val = 1.0F;
                          Slassq.slassq(m * m, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, 1, localfloatW2, localfloatW3);
                          Slacpy.slacpy("Full", m, m, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
                          Sgemm.sgemm("N", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, arrayOfFloat10, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
                          Sgemm.sgemm("N", "N", m, m, m, -1.0F, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4, 1.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
                          Slassq.slassq(m * m, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, 1, localfloatW2, localfloatW3);
                          f10 = localfloatW2.val * (float)Math.sqrt(localfloatW3.val);
                          i = f10 > f11 ? 0 : 1;
                          if ((i ^ 0x1) != 0) {}
                        }
                        else
                        {
                          Slaset.slaset("Full", paramInt11, paramInt12, 0.0F, 0.0F, arrayOfFloat8, paramInt12 + 1 - 1 + (1 - 1) * 4, 4);
                          Slacpy.slacpy("F", m, m, arrayOfFloat8, 0, 4, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3);
                          Slacpy.slacpy("F", m, m, arrayOfFloat10, 0, 4, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5);
                          Slaset.slaset("Full", 4, 4, 0.0F, 0.0F, arrayOfFloat10, 0, 4);
                          k = 1;
                          for (n = m * m - 1 + 1; n > 0; n--)
                          {
                            paramArrayOfFloat5[(k - 1 + paramInt13)] = 0.0F;
                            k += 1;
                          }
                          paramArrayOfFloat5[(1 - 1 + paramInt13)] = 1.0F;
                          arrayOfFloat10[(1 - 1 + (1 - 1) * 4)] = 1.0F;
                          localintW1.val = (paramInt14 - m * m - 2);
                          if ((paramInt12 <= 1 ? 0 : 1) != 0)
                          {
                            slagv2_adapter(paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat2, 0, arrayOfFloat1, 0, arrayOfFloat3, 0, paramArrayOfFloat5, 1 - 1 + paramInt13, paramArrayOfFloat5, 2 - 1 + paramInt13, arrayOfFloat10, 1 - 1 + (1 - 1) * 4, arrayOfFloat10, 2 - 1 + (1 - 1) * 4);
                            paramArrayOfFloat5[(m + 1 - 1 + paramInt13)] = (-paramArrayOfFloat5[(2 - 1 + paramInt13)]);
                            paramArrayOfFloat5[(m + 2 - 1 + paramInt13)] = paramArrayOfFloat5[(1 - 1 + paramInt13)];
                            arrayOfFloat10[(paramInt12 - 1 + (paramInt12 - 1) * 4)] = arrayOfFloat10[(1 - 1 + (1 - 1) * 4)];
                            arrayOfFloat10[(1 - 1 + (2 - 1) * 4)] = (-arrayOfFloat10[(2 - 1 + (1 - 1) * 4)]);
                          }
                          paramArrayOfFloat5[(m * m - 1 + paramInt13)] = 1.0F;
                          arrayOfFloat10[(m - 1 + (m - 1) * 4)] = 1.0F;
                          if ((paramInt11 <= 1 ? 0 : 1) != 0)
                          {
                            slagv2_adapter(paramArrayOfFloat1, paramInt10 + paramInt12 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt10 + paramInt12 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat12, 0, arrayOfFloat11, 0, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, paramArrayOfFloat5, paramInt12 * m + paramInt12 + 1 - 1 + paramInt13, paramArrayOfFloat5, paramInt12 * m + paramInt12 + 2 - 1 + paramInt13, arrayOfFloat10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, arrayOfFloat10, m - 1 + (m - 1 - 1) * 4);
                            paramArrayOfFloat5[(m * m - 1 + paramInt13)] = paramArrayOfFloat5[(paramInt12 * m + paramInt12 + 1 - 1 + paramInt13)];
                            paramArrayOfFloat5[(m * m - 1 - 1 + paramInt13)] = (-paramArrayOfFloat5[(paramInt12 * m + paramInt12 + 2 - 1 + paramInt13)]);
                            arrayOfFloat10[(m - 1 + (m - 1) * 4)] = arrayOfFloat10[(paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4)];
                            arrayOfFloat10[(m - 1 - 1 + (m - 1) * 4)] = (-arrayOfFloat10[(m - 1 + (m - 1 - 1) * 4)]);
                          }
                          Sgemm.sgemm("T", "N", paramInt12, paramInt11, paramInt12, 1.0F, paramArrayOfFloat5, paramInt13, m, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, 0.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, paramInt12);
                          Slacpy.slacpy("Full", paramInt12, paramInt11, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, paramInt12, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3);
                          Sgemm.sgemm("T", "N", paramInt12, paramInt11, paramInt12, 1.0F, paramArrayOfFloat5, paramInt13, m, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, paramInt12);
                          Slacpy.slacpy("Full", paramInt12, paramInt11, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, paramInt12, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5);
                          Sgemm.sgemm("N", "N", m, m, m, 1.0F, arrayOfFloat6, 0, 4, paramArrayOfFloat5, paramInt13, m, 0.0F, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m);
                          Slacpy.slacpy("Full", m, m, paramArrayOfFloat5, m * m + 1 - 1 + paramInt13, m, arrayOfFloat6, 0, 4);
                          Sgemm.sgemm("N", "N", paramInt12, paramInt11, paramInt11, 1.0F, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfFloat10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, 4, 0.0F, paramArrayOfFloat5, paramInt13, paramInt12);
                          Slacpy.slacpy("Full", paramInt12, paramInt11, paramArrayOfFloat5, paramInt13, paramInt12, paramArrayOfFloat1, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt3 + paramInt2, paramInt3);
                          Sgemm.sgemm("N", "N", paramInt12, paramInt11, paramInt11, 1.0F, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat10, paramInt12 + 1 - 1 + (paramInt12 + 1 - 1) * 4, 4, 0.0F, paramArrayOfFloat5, paramInt13, paramInt12);
                          Slacpy.slacpy("Full", paramInt12, paramInt11, paramArrayOfFloat5, paramInt13, paramInt12, paramArrayOfFloat2, paramInt10 - 1 + (paramInt10 + paramInt12 - 1) * paramInt5 + paramInt4, paramInt5);
                          Sgemm.sgemm("T", "N", m, m, m, 1.0F, arrayOfFloat4, 0, 4, arrayOfFloat10, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, m);
                          Slacpy.slacpy("Full", m, m, paramArrayOfFloat5, paramInt13, m, arrayOfFloat4, 0, 4);
                          if (paramBoolean1)
                          {
                            Sgemm.sgemm("N", "N", paramInt1, m, m, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfFloat6, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, paramInt1);
                            Slacpy.slacpy("Full", paramInt1, m, paramArrayOfFloat5, paramInt13, paramInt1, paramArrayOfFloat3, 1 - 1 + (paramInt10 - 1) * paramInt7 + paramInt6, paramInt7);
                          }
                          if (paramBoolean2)
                          {
                            Sgemm.sgemm("N", "N", paramInt1, m, m, 1.0F, paramArrayOfFloat4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, paramInt9, arrayOfFloat4, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, paramInt1);
                            Slacpy.slacpy("Full", paramInt1, m, paramArrayOfFloat5, paramInt13, paramInt1, paramArrayOfFloat4, 1 - 1 + (paramInt10 - 1) * paramInt9 + paramInt8, paramInt9);
                          }
                          k = paramInt10 + m;
                          if ((k > paramInt1 ? 0 : 1) != 0)
                          {
                            Sgemm.sgemm("T", "N", m, paramInt1 - k + 1, m, 1.0F, arrayOfFloat6, 0, 4, paramArrayOfFloat1, paramInt10 - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 0.0F, paramArrayOfFloat5, paramInt13, m);
                            Slacpy.slacpy("Full", m, paramInt1 - k + 1, paramArrayOfFloat5, paramInt13, m, paramArrayOfFloat1, paramInt10 - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3);
                            Sgemm.sgemm("T", "N", m, paramInt1 - k + 1, m, 1.0F, arrayOfFloat6, 0, 4, paramArrayOfFloat2, paramInt10 - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat5, paramInt13, m);
                            Slacpy.slacpy("Full", m, paramInt1 - k + 1, paramArrayOfFloat5, paramInt13, m, paramArrayOfFloat2, paramInt10 - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5);
                          }
                          k = paramInt10 - 1;
                          if ((k <= 0 ? 0 : 1) != 0)
                          {
                            Sgemm.sgemm("N", "N", k, m, m, 1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfFloat4, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, k);
                            Slacpy.slacpy("Full", k, m, paramArrayOfFloat5, paramInt13, k, paramArrayOfFloat1, 1 - 1 + (paramInt10 - 1) * paramInt3 + paramInt2, paramInt3);
                            Sgemm.sgemm("N", "N", k, m, m, 1.0F, paramArrayOfFloat2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat4, 0, 4, 0.0F, paramArrayOfFloat5, paramInt13, k);
                            Slacpy.slacpy("Full", k, m, paramArrayOfFloat5, paramInt13, k, paramArrayOfFloat2, 1 - 1 + (paramInt10 - 1) * paramInt5 + paramInt4, paramInt5);
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label5352:
    paramintW.val = 1;
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, floatW paramfloatW)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    Slartg.slartg(paramFloat1, paramFloat2, localfloatW1, localfloatW2, paramfloatW);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
  }
  
  private static void slagv2_adapter(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, float[] paramArrayOfFloat7, int paramInt9, float[] paramArrayOfFloat8, int paramInt10, float[] paramArrayOfFloat9, int paramInt11)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat6[paramInt8]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat7[paramInt9]);
    floatW localfloatW3 = new floatW(paramArrayOfFloat8[paramInt10]);
    floatW localfloatW4 = new floatW(paramArrayOfFloat9[paramInt11]);
    Slagv2.slagv2(paramArrayOfFloat1, paramInt1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, localfloatW1, localfloatW2, localfloatW3, localfloatW4);
    paramArrayOfFloat6[paramInt8] = localfloatW1.val;
    paramArrayOfFloat7[paramInt9] = localfloatW2.val;
    paramArrayOfFloat8[paramInt10] = localfloatW3.val;
    paramArrayOfFloat9[paramInt11] = localfloatW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgex2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */