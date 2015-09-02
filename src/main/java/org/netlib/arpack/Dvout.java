package org.netlib.arpack;

import java.util.Vector;
import org.netlib.util.Util;

public final class Dvout
{
  public static void dvout(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, String paramString)
  {
    String str = new String("                                                                                ");
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    Vector localVector = new Vector();
    m = Math.min(paramString.length(), 80);
    i = 1;
    for (int i1 = m - 1 + 1; i1 > 0; i1--)
    {
      str = Util.stringInsert(str, "-", i, i);
      i += 1;
    }
    i = m + 1;
    for (i1 = 80 - (m + 1) + 1; i1 > 0; i1--)
    {
      str = Util.stringInsert(str, " ", i, i);
      i += 1;
    }
    localVector.clear();
    localVector.addElement(new String(paramString));
    localVector.addElement(new String(str.substring(1 + -1, m)));
    Util.f77write("/1X,A,/1X,A", localVector);
    if ((paramInt2 > 0 ? 0 : 1) != 0) {
      return;
    }
    n = paramInt4;
    if ((paramInt4 != 0 ? 0 : 1) != 0) {
      n = 4;
    }
    int i2;
    if ((paramInt4 >= 0 ? 0 : 1) != 0)
    {
      n = -paramInt4;
      if ((n > 4 ? 0 : 1) != 0)
      {
        j = 1;
        for (i1 = (paramInt2 - 1 + 5) / 5; i1 > 0; i1--)
        {
          k = Math.min(paramInt2, j + 4);
          localVector.clear();
          localVector.addElement(new Integer(j));
          localVector.addElement(new Integer(k));
          i = j;
          for (i2 = k - j + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1P,10D12.3", localVector);
          j += 5;
        }
      }
      else if ((n > 6 ? 0 : 1) != 0)
      {
        j = 1;
        for (i1 = (paramInt2 - 1 + 4) / 4; i1 > 0; i1--)
        {
          k = Math.min(paramInt2, j + 3);
          localVector.clear();
          localVector.addElement(new Integer(j));
          localVector.addElement(new Integer(k));
          i = j;
          for (i2 = k - j + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P,8D14.5", localVector);
          j += 4;
        }
      }
      else if ((n > 10 ? 0 : 1) != 0)
      {
        j = 1;
        for (i1 = (paramInt2 - 1 + 3) / 3; i1 > 0; i1--)
        {
          k = Math.min(paramInt2, j + 2);
          localVector.clear();
          localVector.addElement(new Integer(j));
          localVector.addElement(new Integer(k));
          i = j;
          for (i2 = k - j + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P,6D18.9", localVector);
          j += 3;
        }
      }
      else
      {
        j = 1;
        for (i1 = (paramInt2 - 1 + 2) / 2; i1 > 0; i1--)
        {
          k = Math.min(paramInt2, j + 1);
          localVector.clear();
          localVector.addElement(new Integer(j));
          localVector.addElement(new Integer(k));
          i = j;
          for (i2 = k - j + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P,5D24.13", localVector);
          j += 2;
        }
      }
    }
    else if ((n > 4 ? 0 : 1) != 0)
    {
      j = 1;
      for (i1 = (paramInt2 - 1 + 10) / 10; i1 > 0; i1--)
      {
        k = Math.min(paramInt2, j + 9);
        localVector.clear();
        localVector.addElement(new Integer(j));
        localVector.addElement(new Integer(k));
        i = j;
        for (i2 = k - j + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1P,10D12.3", localVector);
        j += 10;
      }
    }
    else if ((n > 6 ? 0 : 1) != 0)
    {
      j = 1;
      for (i1 = (paramInt2 - 1 + 8) / 8; i1 > 0; i1--)
      {
        k = Math.min(paramInt2, j + 7);
        localVector.clear();
        localVector.addElement(new Integer(j));
        localVector.addElement(new Integer(k));
        i = j;
        for (i2 = k - j + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P,8D14.5", localVector);
        j += 8;
      }
    }
    else if ((n > 10 ? 0 : 1) != 0)
    {
      j = 1;
      for (i1 = (paramInt2 - 1 + 6) / 6; i1 > 0; i1--)
      {
        k = Math.min(paramInt2, j + 5);
        localVector.clear();
        localVector.addElement(new Integer(j));
        localVector.addElement(new Integer(k));
        i = j;
        for (i2 = k - j + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P,6D18.9", localVector);
        j += 6;
      }
    }
    else
    {
      j = 1;
      for (i1 = (paramInt2 - 1 + 5) / 5; i1 > 0; i1--)
      {
        k = Math.min(paramInt2, j + 4);
        localVector.clear();
        localVector.addElement(new Integer(j));
        localVector.addElement(new Integer(k));
        i = j;
        for (i2 = k - j + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Double(paramArrayOfDouble[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P,5D24.13", localVector);
        j += 5;
      }
    }
    localVector.clear();
    Util.f77write("1X,' '", localVector);
    return;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dvout.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */