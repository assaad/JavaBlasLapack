package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Strmm;

public final class Slarfb
{
  public static void slarfb(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11)
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
            Scopy.scopy(paramInt2, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Strmm.strmm("Right", "Lower", "No transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("Transpose", "No transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
          }
          Strmm.strmm("Right", "Upper", str, "Non-unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11, 1.0F, paramArrayOfFloat3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Strmm.strmm("Right", "Lower", "Transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat3[(j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
            Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Strmm.strmm("Right", "Lower", "No transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "No transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
          }
          Strmm.strmm("Right", "Upper", paramString2, "Non-unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "Transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0F, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat1, paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Strmm.strmm("Right", "Lower", "Transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          j = 1;
          k = paramInt3 - 1 + 1;
          for (;;)
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
          Scopy.scopy(paramInt2, paramArrayOfFloat3, paramInt1 - paramInt3 + j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Strmm.strmm("Right", "Upper", "No transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("Transpose", "No transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
        }
        Strmm.strmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
        }
        Strmm.strmm("Right", "Upper", "Transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(paramInt1 - paramInt3 + j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
          Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Strmm.strmm("Right", "Upper", "No transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt2 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "No transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
        }
        Strmm.strmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "Transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0F, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
        }
        Strmm.strmm("Right", "Upper", "Transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt2 - paramInt3 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        j = 1;
        k = paramInt3 - 1 + 1;
        for (;;)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(i - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
            Scopy.scopy(paramInt2, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Strmm.strmm("Right", "Upper", "Transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
          }
          Strmm.strmm("Right", "Upper", str, "Non-unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("Transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11, 1.0F, paramArrayOfFloat3, paramInt3 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Strmm.strmm("Right", "Upper", "No transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          j = 1;
          for (k = paramInt3 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = paramInt2 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat3[(j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
            Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
            j += 1;
          }
          Strmm.strmm("Right", "Upper", "Transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
          }
          Strmm.strmm("Right", "Upper", paramString2, "Non-unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
          if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "No transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0F, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat1, 1 - 1 + (paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Strmm.strmm("Right", "Upper", "No transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
          j = 1;
          k = paramInt3 - 1 + 1;
          for (;;)
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
          Scopy.scopy(paramInt2, paramArrayOfFloat3, paramInt1 - paramInt3 + j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Strmm.strmm("Right", "Lower", "Transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt1 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt1 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
        }
        Strmm.strmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt1 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("Transpose", "Transpose", paramInt1 - paramInt3, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
        }
        Strmm.strmm("Right", "Lower", "No transpose", "Unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt1 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        j = 1;
        for (k = paramInt3 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(paramInt1 - paramInt3 + j - 1 + (i - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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
          Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
          j += 1;
        }
        Strmm.strmm("Right", "Lower", "Transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt2 - paramInt3, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt10, paramInt11);
        }
        Strmm.strmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11);
        if ((paramInt2 <= paramInt3 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "No transpose", paramInt1, paramInt2 - paramInt3, paramInt3, -1.0F, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, paramInt8, paramInt9);
        }
        Strmm.strmm("Right", "Lower", "No transpose", "Unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt10, paramInt11);
        j = 1;
        k = paramInt3 - 1 + 1;
        for (;;)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(i - 1 + (paramInt2 - paramInt3 + j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt11 + paramInt10)];
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarfb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */