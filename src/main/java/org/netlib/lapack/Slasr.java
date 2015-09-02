package org.netlib.lapack;

import org.netlib.err.Xerbla;

public final class Slasr
{
  public static void slasr(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    j = 0;
    if ((((!Lsame.lsame(paramString1, "L")) && (!Lsame.lsame(paramString1, "R")) ? 0 : 1) ^ 0x1) != 0)
    {
      j = 1;
    }
    else
    {
      if (((!Lsame.lsame(paramString2, "V")) && (!Lsame.lsame(paramString2, "T")) ? 0 : 1) == 0) {}
      if (((!Lsame.lsame(paramString2, "B") ? 0 : 1) ^ 0x1) != 0) {
        j = 2;
      } else if ((((!Lsame.lsame(paramString3, "F")) && (!Lsame.lsame(paramString3, "B")) ? 0 : 1) ^ 0x1) != 0) {
        j = 3;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        j = 4;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        j = 5;
      } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 9;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASR ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    int n;
    if (Lsame.lsame(paramString1, "L"))
    {
      if (Lsame.lsame(paramString2, "V"))
      {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 1;
          for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k + 1 - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k + 1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt1 - 1;
          m = (1 - (paramInt1 - 1) + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k + 1 - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k + 1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString2, "T"))
      {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 2;
          for (m = paramInt1 - 2 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt1;
          m = (2 - paramInt1 + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(1 - 1 + (i - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString2, "B")) {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 1;
          for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] + f1 * f3);
                paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] - f2 * f3);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt1 - 1;
          m = (1 - (paramInt1 - 1) + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt2 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(k - 1 + (i - 1) * paramInt6 + paramInt5)] = (f2 * paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] + f1 * f3);
                paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] = (f1 * paramArrayOfFloat3[(paramInt1 - 1 + (i - 1) * paramInt6 + paramInt5)] - f2 * f3);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
    }
    else if (Lsame.lsame(paramString1, "R")) {
      if (Lsame.lsame(paramString2, "V"))
      {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 1;
          for (m = paramInt2 - 1 - 1 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k + 1 - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k + 1 - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt2 - 1;
          m = (1 - (paramInt2 - 1) + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k + 1 - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k + 1 - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString2, "T"))
      {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 2;
          for (m = paramInt2 - 2 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt2;
          m = (2 - paramInt2 + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f1 * f3 - f2 * paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)]);
                paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)] = (f2 * f3 + f1 * paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString2, "B")) {
        if (Lsame.lsame(paramString3, "F"))
        {
          k = 1;
          for (m = paramInt2 - 1 - 1 + 1; m > 0; m--)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f2 * paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] + f1 * f3);
                paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] = (f1 * paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] - f2 * f3);
                i += 1;
              }
            }
            k += 1;
          }
        }
        else if (Lsame.lsame(paramString3, "B"))
        {
          k = paramInt2 - 1;
          m = (1 - (paramInt2 - 1) + -1) / -1;
          for (;;)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt3)];
            f2 = paramArrayOfFloat2[(k - 1 + paramInt4)];
            if ((f1 == 1.0F ? 0 : 1) == 0) {}
            if (((f2 == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              i = 1;
              for (n = paramInt1 - 1 + 1; n > 0; n--)
              {
                f3 = paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
                paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f2 * paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] + f1 * f3);
                paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] = (f1 * paramArrayOfFloat3[(i - 1 + (paramInt2 - 1) * paramInt6 + paramInt5)] - f2 * f3);
                i += 1;
              }
            }
            k += -1;
            m--;
            if (m <= 0) {
              break;
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */