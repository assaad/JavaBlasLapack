package org.netlib.err;

import java.util.Vector;
import org.netlib.util.Util;

public final class Xerbla
{
  public static void xerbla(String paramString, int paramInt)
  {
    Vector localVector = new Vector();
    localVector.clear();
    localVector.addElement(new String(paramString));
    localVector.addElement(new Integer(paramInt));
    Util.f77write("' ** On entry to ',A6,' parameter number ',I2,' had ','an illegal value'", localVector);
    System.exit(0);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/err/Xerbla.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */