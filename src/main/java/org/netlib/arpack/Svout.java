package org.netlib.arpack;

import java.util.Vector;
import org.netlib.util.Util;

public final class Svout
{
  public static void svout(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, String paramString)
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
        for (i1 = (paramInt2 - 1 + 5) / 5; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 4);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1P10E12.3", localVector);
          k += 5;
        }
      }
      else if ((j > 6 ? 0 : 1) != 0)
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 4) / 4; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 3);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P8E14.5", localVector);
          k += 4;
        }
      }
      else if ((j > 10 ? 0 : 1) != 0)
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
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P6E18.9", localVector);
          k += 3;
        }
      }
      else
      {
        k = 1;
        for (i1 = (paramInt2 - 1 + 2) / 2; i1 > 0; i1--)
        {
          m = Math.min(paramInt2, k + 1);
          localVector.clear();
          localVector.addElement(new Integer(k));
          localVector.addElement(new Integer(m));
          i = k;
          for (i2 = m - k + 1; i2 > 0; i2--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
            i += 1;
          }
          Util.f77write("1X,I4,' - ',I4,':',1X,1P5E24.13", localVector);
          k += 2;
        }
      }
    }
    else if ((j > 4 ? 0 : 1) != 0)
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
          localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1P10E12.3", localVector);
        k += 10;
      }
    }
    else if ((j > 6 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 8) / 8; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 7);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P8E14.5", localVector);
        k += 8;
      }
    }
    else if ((j > 10 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = (paramInt2 - 1 + 6) / 6; i1 > 0; i1--)
      {
        m = Math.min(paramInt2, k + 5);
        localVector.clear();
        localVector.addElement(new Integer(k));
        localVector.addElement(new Integer(m));
        i = k;
        for (i2 = m - k + 1; i2 > 0; i2--)
        {
          localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P6E18.9", localVector);
        k += 6;
      }
    }
    else
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
          localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + paramInt3)]));
          i += 1;
        }
        Util.f77write("1X,I4,' - ',I4,':',1X,1P5E24.13", localVector);
        k += 5;
      }
    }
    localVector.clear();
    Util.f77write("1X,' '", localVector);
    return;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Svout.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */