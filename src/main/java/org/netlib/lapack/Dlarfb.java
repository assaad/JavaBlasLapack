package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dtrmm;

public final class Dlarfb
{
  public static void dlarfb(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11)
  {
    String str = new String(" ");
    int i = 0;
    int j = 0;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt2 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString2, "N")) {
      str = "T";
    } else {
      str = "N";
    }
    int k;
    int m;
    if (Lsame.lsame(paramString4, "C"))
    {
      if (Lsame.lsame(paramString3, "F"))
      {
        if (Lsame.lsame(paramString1, "L"))
        {
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            Dcopy.dcopy(paramInt2, paramArrayOfDouble3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Dtrmm.dtrmm("Right", "Lower", "No transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("Transpose", "No transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
          }
          Dtrmm.dtrmm("Right", "Upper", str, "Non-unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0D, paramArrayOfDouble1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11, 1.0D, paramArrayOfDouble3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Dtrmm.dtrmm("Right", "Lower", "Transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble3[(j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
              i += 1;
            }
            j += 1;
          }
        }
        else if (Lsame.lsame(paramString1, "R"))
        {
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Dtrmm.dtrmm("Right", "Lower", "No transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "No transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
          }
          Dtrmm.dtrmm("Right", "Upper", paramString2, "Non-unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "Transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0D, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Dtrmm.dtrmm("Right", "Lower", "Transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          j = 1;
          k = paramInt3 - 1 + 1;
          for (;;)
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
              i += 1;
            }
            j += 1;
            k--;
            if (k <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString1, "L"))
      {
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          Dcopy.dcopy(paramInt2, paramArrayOfDouble3, paramInt1 - paramInt3 + j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Dtrmm.dtrmm("Right", "Upper", "No transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("Transpose", "No transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
        }
        Dtrmm.dtrmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
        }
        Dtrmm.dtrmm("Right", "Upper", "Transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(paramInt1 - paramInt3 + j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
            i += 1;
          }
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString1, "R"))
      {
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Dtrmm.dtrmm("Right", "Upper", "No transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt2 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "No transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
        }
        Dtrmm.dtrmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "Transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0D, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
        }
        Dtrmm.dtrmm("Right", "Upper", "Transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt2 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        j = 1;
        k = paramInt3 - 1 + 1;
        for (;;)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(i - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
            i += 1;
          }
          j += 1;
          k--;
          if (k <= 0) {
            break;
          }
        }
      }
    }
    else if (Lsame.lsame(paramString4, "R")) {
      if (Lsame.lsame(paramString3, "F"))
      {
        if (Lsame.lsame(paramString1, "L"))
        {
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            Dcopy.dcopy(paramInt2, paramArrayOfDouble3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Dtrmm.dtrmm("Right", "Upper", "Transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
          }
          Dtrmm.dtrmm("Right", "Upper", str, "Non-unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("Transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11, 1.0D, paramArrayOfDouble3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Dtrmm.dtrmm("Right", "Upper", "No transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble3[(j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
              i += 1;
            }
            j += 1;
          }
        }
        else if (Lsame.lsame(paramString1, "R"))
        {
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Dtrmm.dtrmm("Right", "Upper", "Transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
          }
          Dtrmm.dtrmm("Right", "Upper", paramString2, "Non-unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "No transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0D, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Dtrmm.dtrmm("Right", "Upper", "No transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
          j = 1;
          k = paramInt3 - 1 + 1;
          for (;;)
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
              i += 1;
            }
            j += 1;
            k--;
            if (k <= 0) {
              break;
            }
          }
        }
      }
      else if (Lsame.lsame(paramString1, "L"))
      {
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          Dcopy.dcopy(paramInt2, paramArrayOfDouble3, paramInt1 - paramInt3 + j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Dtrmm.dtrmm("Right", "Lower", "Transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt1 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
        }
        Dtrmm.dtrmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("Transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
        }
        Dtrmm.dtrmm("Right", "Lower", "No transpose", "Unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt1 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(paramInt1 - paramInt3 + j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
            i += 1;
          }
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString1, "R"))
      {
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Dtrmm.dtrmm("Right", "Lower", "Transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
        }
        Dtrmm.dtrmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "No transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0D, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
        }
        Dtrmm.dtrmm("Right", "Lower", "No transpose", "Unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble1, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt10, paramInt11);
        j = 1;
        k = paramInt3 - 1 + 1;
        for (;;)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(i - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
            i += 1;
          }
          j += 1;
          k--;
          if (k <= 0) {
            break;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarfb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */