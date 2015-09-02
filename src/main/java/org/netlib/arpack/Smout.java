package org.netlib.arpack;

import java.util.Vector;
import org.netlib.util.ArraySpec;
import org.netlib.util.Util;

public final class Smout
{
  public static String icol = "Col";
  
  public static void smout(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat, int paramInt4, int paramInt5, int paramInt6, String paramString)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    String str = new String("                                                                                ");
    Vector localVector = new Vector();
    i1 = Math.min(1, 80);
    i = 1;
    for (int i2 = i1 - 1 + 1; i2 > 0; i2--)
    {
      str = Util.stringInsert(str, "-", i, i);
      i += 1;
    }
    i = i1 + 1;
    for (i2 = 80 - (i1 + 1) + 1; i2 > 0; i2--)
    {
      str = Util.stringInsert(str, " ", i, i);
      i += 1;
    }
    localVector.clear();
    localVector.addElement(new String(paramString));
    localVector.addElement(new String(str.substring(1 + -1, i1)));
    Util.f77write("/1X,A/1X,A", localVector);
    if ((paramInt2 > 0 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt5 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    k = paramInt6;
    if ((paramInt6 != 0 ? 0 : 1) != 0) {
      k = 4;
    }
    int i3;
    int i4;
    if ((paramInt6 >= 0 ? 0 : 1) != 0)
    {
      k = -paramInt6;
      if ((k > 4 ? 0 : 1) != 0)
      {
        m = 1;
        for (i2 = (paramInt3 - 1 + 5) / 5; i2 > 0; i2--)
        {
          n = Math.min(paramInt3, m + 4);
          localVector.clear();
          i = m;
          for (i3 = n - m + 1; i3 > 0; i3--)
          {
            localVector.addElement(new ArraySpec(icol));
            localVector.addElement(new Integer(i));
            i += 1;
          }
          Util.f77write("10X,10(4X,3A1,I4,1X)", localVector);
          i = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            localVector.clear();
            localVector.addElement(new Integer(i));
            j = m;
            for (i4 = n - m + 1; i4 > 0; i4--)
            {
              localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
              j += 1;
            }
            Util.f77write("1X,' Row',I4,':',1X,1P10E12.3", localVector);
            i += 1;
          }
          m += 5;
        }
      }
      else if ((k > 6 ? 0 : 1) != 0)
      {
        m = 1;
        for (i2 = (paramInt3 - 1 + 4) / 4; i2 > 0; i2--)
        {
          n = Math.min(paramInt3, m + 3);
          localVector.clear();
          i = m;
          for (i3 = n - m + 1; i3 > 0; i3--)
          {
            localVector.addElement(new ArraySpec(icol));
            localVector.addElement(new Integer(i));
            i += 1;
          }
          Util.f77write("10X,8(5X,3A1,I4,2X)", localVector);
          i = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            localVector.clear();
            localVector.addElement(new Integer(i));
            j = m;
            for (i4 = n - m + 1; i4 > 0; i4--)
            {
              localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
              j += 1;
            }
            Util.f77write("1X,' Row',I4,':',1X,1P8E14.5", localVector);
            i += 1;
          }
          m += 4;
        }
      }
      else if ((k > 10 ? 0 : 1) != 0)
      {
        m = 1;
        for (i2 = (paramInt3 - 1 + 3) / 3; i2 > 0; i2--)
        {
          n = Math.min(paramInt3, m + 2);
          localVector.clear();
          i = m;
          for (i3 = n - m + 1; i3 > 0; i3--)
          {
            localVector.addElement(new ArraySpec(icol));
            localVector.addElement(new Integer(i));
            i += 1;
          }
          Util.f77write("10X,6(7X,3A1,I4,4X)", localVector);
          i = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            localVector.clear();
            localVector.addElement(new Integer(i));
            j = m;
            for (i4 = n - m + 1; i4 > 0; i4--)
            {
              localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
              j += 1;
            }
            Util.f77write("1X,' Row',I4,':',1X,1P6E18.9", localVector);
            i += 1;
          }
          m += 3;
        }
      }
      else
      {
        m = 1;
        for (i2 = (paramInt3 - 1 + 2) / 2; i2 > 0; i2--)
        {
          n = Math.min(paramInt3, m + 1);
          localVector.clear();
          i = m;
          for (i3 = n - m + 1; i3 > 0; i3--)
          {
            localVector.addElement(new ArraySpec(icol));
            localVector.addElement(new Integer(i));
            i += 1;
          }
          Util.f77write("10X,5(9X,3A1,I4,6X)", localVector);
          i = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            localVector.clear();
            localVector.addElement(new Integer(i));
            j = m;
            for (i4 = n - m + 1; i4 > 0; i4--)
            {
              localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
              j += 1;
            }
            Util.f77write("1X,' Row',I4,':',1X,1P5E22.13", localVector);
            i += 1;
          }
          m += 2;
        }
      }
    }
    else if ((k > 4 ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = (paramInt3 - 1 + 10) / 10; i2 > 0; i2--)
      {
        n = Math.min(paramInt3, m + 9);
        localVector.clear();
        i = m;
        for (i3 = n - m + 1; i3 > 0; i3--)
        {
          localVector.addElement(new ArraySpec(icol));
          localVector.addElement(new Integer(i));
          i += 1;
        }
        Util.f77write("10X,10(4X,3A1,I4,1X)", localVector);
        i = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          localVector.clear();
          localVector.addElement(new Integer(i));
          j = m;
          for (i4 = n - m + 1; i4 > 0; i4--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            j += 1;
          }
          Util.f77write("1X,' Row',I4,':',1X,1P10E12.3", localVector);
          i += 1;
        }
        m += 10;
      }
    }
    else if ((k > 6 ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = (paramInt3 - 1 + 8) / 8; i2 > 0; i2--)
      {
        n = Math.min(paramInt3, m + 7);
        localVector.clear();
        i = m;
        for (i3 = n - m + 1; i3 > 0; i3--)
        {
          localVector.addElement(new ArraySpec(icol));
          localVector.addElement(new Integer(i));
          i += 1;
        }
        Util.f77write("10X,8(5X,3A1,I4,2X)", localVector);
        i = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          localVector.clear();
          localVector.addElement(new Integer(i));
          j = m;
          for (i4 = n - m + 1; i4 > 0; i4--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            j += 1;
          }
          Util.f77write("1X,' Row',I4,':',1X,1P8E14.5", localVector);
          i += 1;
        }
        m += 8;
      }
    }
    else if ((k > 10 ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = (paramInt3 - 1 + 6) / 6; i2 > 0; i2--)
      {
        n = Math.min(paramInt3, m + 5);
        localVector.clear();
        i = m;
        for (i3 = n - m + 1; i3 > 0; i3--)
        {
          localVector.addElement(new ArraySpec(icol));
          localVector.addElement(new Integer(i));
          i += 1;
        }
        Util.f77write("10X,6(7X,3A1,I4,4X)", localVector);
        i = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          localVector.clear();
          localVector.addElement(new Integer(i));
          j = m;
          for (i4 = n - m + 1; i4 > 0; i4--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            j += 1;
          }
          Util.f77write("1X,' Row',I4,':',1X,1P6E18.9", localVector);
          i += 1;
        }
        m += 6;
      }
    }
    else
    {
      m = 1;
      for (i2 = (paramInt3 - 1 + 5) / 5; i2 > 0; i2--)
      {
        n = Math.min(paramInt3, m + 4);
        localVector.clear();
        i = m;
        for (i3 = n - m + 1; i3 > 0; i3--)
        {
          localVector.addElement(new ArraySpec(icol));
          localVector.addElement(new Integer(i));
          i += 1;
        }
        Util.f77write("10X,5(9X,3A1,I4,6X)", localVector);
        i = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          localVector.clear();
          localVector.addElement(new Integer(i));
          j = m;
          for (i4 = n - m + 1; i4 > 0; i4--)
          {
            localVector.addElement(new Float(paramArrayOfFloat[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            j += 1;
          }
          Util.f77write("1X,' Row',I4,':',1X,1P5E22.13", localVector);
          i += 1;
        }
        m += 5;
      }
    }
    localVector.clear();
    Util.f77write("1X,' '", localVector);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Smout.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */