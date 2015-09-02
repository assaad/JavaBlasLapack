package org.netlib.arpack;

import java.util.Vector;
import org.netlib.util.Util;

public final class Ivout
{
  public static void ivout(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, String paramString)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    String str = new String("                                                                                ");
    Vector localVector = new Vector();
    n = Math.min(1, 80);
    i = 1;
    for (int i1 = n - 1 + 1; i1 > 0; i1--)
    {
      str = Util.stringInsert(str, "-", i, i);
      i += 1;
    }
    i = n + 1;
    for (i1 = 80 - (n + 1) + 1; i1 > 0; i1--)
    {
      str = Util.stringInsert(str, " ", i, i);
      i += 1;
    }
    localVector.clear();
    localVector.addElement(new String(paramString));
    localVector.addElement(new String(str.substring(1 + -1, n)));
    Util.f77write("/1X,A/1X,A", localVector);
    if ((paramInt2 > 0 ? 0 : 1) != 0) {
      return;
    }
    j = paramInt4;
    if ((paramInt4 != 0 ? 0 : 1) != 0) {
      j = 4;
    }
    int i2;
    if ((paramInt4 >= 0 ? 0 : 1) != 0)
    {
      j = -paramInt4;
      if ((j > 4 ? 0 : 1) != 0)
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 10) / 10; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 9);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',20(1X,I5)", localVector);
          k += 10;
        }
      }
      else if ((j > 6 ? 0 : 1) != 0)
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 7) / 7; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 6);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',15(1X,I7)", localVector);
          k += 7;
        }
      }
      else if ((j > 10 ? 0 : 1) != 0)
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 5) / 5; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 4);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',10(1X,I11)", localVector);
          k += 5;
        }
      }
      else
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 3) / 3; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 2);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',7(1X,I15)", localVector);
          k += 3;
        }
      }
    }
    else if ((j > 4 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 20) / 20; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 19);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',20(1X,I5)", localVector);
        k += 20;
      }
    }
    else if ((j > 6 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 15) / 15; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 14);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',15(1X,I7)", localVector);
        k += 15;
      }
    }
    else if ((j > 10 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 10) / 10; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 9);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',10(1X,I11)", localVector);
        k += 10;
      }
    }
    else
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 7) / 7; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 6);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Integer(paramArrayOfInt[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',7(1X,I15)", localVector);
        k += 7;
      }
    }
    localVector.clear();
    Util.f77write("1X,' '", localVector);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ivout.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */