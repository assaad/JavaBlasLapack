package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Strexc
{
  public static void strexc(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat3, int paramInt6, intW paramintW3)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    paramintW3.val = 0;
    bool = Lsame.lsame(paramString, "V");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -4;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if (!bool) {}
      }
      if ((((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -6;
      }
      else
      {
        if ((paramintW1.val >= 1 ? 0 : 1) == 0) {}
        if (((paramintW1.val <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -7;
        }
        else
        {
          if ((paramintW2.val >= 1 ? 0 : 1) == 0) {}
          if (((paramintW2.val <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -8;
          }
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STREXC", -paramintW3.val);
      return;
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    if ((paramintW1.val <= 1 ? 0 : 1) != 0) {
      if ((paramArrayOfFloat1[(paramintW1.val - 1 + (paramintW1.val - 1 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
        paramintW1.val -= 1;
      }
    }
    j = 1;
    if ((paramintW1.val >= paramInt1 ? 0 : 1) != 0) {
      if ((paramArrayOfFloat1[(paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
        j = 2;
      }
    }
    if ((paramintW2.val <= 1 ? 0 : 1) != 0) {
      if ((paramArrayOfFloat1[(paramintW2.val - 1 + (paramintW2.val - 1 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
        paramintW2.val -= 1;
      }
    }
    k = 1;
    if ((paramintW2.val >= paramInt1 ? 0 : 1) != 0) {
      if ((paramArrayOfFloat1[(paramintW2.val + 1 - 1 + (paramintW2.val - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
        k = 2;
      }
    }
    if ((paramintW1.val != paramintW2.val ? 0 : 1) != 0) {
      return;
    }
    if ((paramintW1.val >= paramintW2.val ? 0 : 1) != 0)
    {
      if ((j != 2 ? 0 : 1) != 0) {}
      if (((k != 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val -= 1;
      }
      if ((j != 1 ? 0 : 1) != 0) {}
      if (((k != 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val += 1;
      }
      i = paramintW1.val;
      do
      {
        if ((j != 1 ? 0 : 1) == 0) {}
        if (((j != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          m = 1;
          if ((i + j + 1 > paramInt1 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i + j + 1 - 1 + (i + j - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
              m = 2;
            }
          }
          Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, j, m, paramArrayOfFloat3, paramInt6, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = i;
            return;
          }
          i += m;
          if ((j != 2 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
              j = 3;
            }
          }
        }
        else
        {
          m = 1;
          if ((i + 3 > paramInt1 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i + 3 - 1 + (i + 2 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
              m = 2;
            }
          }
          Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i + 1, 1, m, paramArrayOfFloat3, paramInt6, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = i;
            return;
          }
          if ((m != 1 ? 0 : 1) != 0)
          {
            Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, 1, m, paramArrayOfFloat3, paramInt6, paramintW3);
            i += 1;
          }
          else
          {
            if ((paramArrayOfFloat1[(i + 2 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
              m = 1;
            }
            if ((m != 2 ? 0 : 1) != 0)
            {
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, 1, m, paramArrayOfFloat3, paramInt6, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = i;
                return;
              }
              i += 2;
            }
            else
            {
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, 1, 1, paramArrayOfFloat3, paramInt6, paramintW3);
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i + 1, 1, 1, paramArrayOfFloat3, paramInt6, paramintW3);
              i += 2;
            }
          }
        }
      } while ((i >= paramintW2.val ? 0 : 1) != 0);
    }
    else
    {
      i = paramintW1.val;
      do
      {
        if ((j != 1 ? 0 : 1) == 0) {}
        if (((j != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          m = 1;
          if ((i < 3 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i - 1 - 1 + (i - 2 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
              m = 2;
            }
          }
          Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i - m, m, j, paramArrayOfFloat3, paramInt6, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = i;
            return;
          }
          i -= m;
          if ((j != 2 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
              j = 3;
            }
          }
        }
        else
        {
          m = 1;
          if ((i < 3 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(i - 1 - 1 + (i - 2 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0) {
              m = 2;
            }
          }
          Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i - m, m, 1, paramArrayOfFloat3, paramInt6, paramintW3);
          if ((paramintW3.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = i;
            return;
          }
          if ((m != 1 ? 0 : 1) != 0)
          {
            Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, m, 1, paramArrayOfFloat3, paramInt6, paramintW3);
            i -= 1;
          }
          else
          {
            if ((paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
              m = 1;
            }
            if ((m != 2 ? 0 : 1) != 0)
            {
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i - 1, 2, 1, paramArrayOfFloat3, paramInt6, paramintW3);
              if ((paramintW3.val == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = i;
                return;
              }
              i -= 2;
            }
            else
            {
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i, 1, 1, paramArrayOfFloat3, paramInt6, paramintW3);
              Slaexc.slaexc(bool, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, i - 1, 1, 1, paramArrayOfFloat3, paramInt6, paramintW3);
              i -= 2;
            }
          }
        }
      } while ((i <= paramintW2.val ? 0 : 1) != 0);
    }
    paramintW2.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strexc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */