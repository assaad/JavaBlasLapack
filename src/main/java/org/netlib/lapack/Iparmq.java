package org.netlib.lapack;

import org.netlib.util.Util;

public final class Iparmq
{
  public static int iparmq(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    if ((paramInt1 != 15 ? 0 : 1) == 0) {}
    if (((paramInt1 != 13 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt1 != 16 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      i = paramInt4 - paramInt3 + 1;
      j = 2;
      if ((i < 30 ? 0 : 1) != 0) {
        j = 4;
      }
      if ((i < 60 ? 0 : 1) != 0) {
        j = 10;
      }
      if ((i < 150 ? 0 : 1) != 0) {
        j = Math.max(10, i / Util.nint((float)Math.log(i) / (float)Math.log(2.0F)));
      }
      if ((i < 590 ? 0 : 1) != 0) {
        j = 64;
      }
      if ((i < 3000 ? 0 : 1) != 0) {
        j = 128;
      }
      if ((i < 6000 ? 0 : 1) != 0) {
        j = 256;
      }
      j = Math.max(2, j - j % 2);
    }
    if ((paramInt1 != 12 ? 0 : 1) != 0)
    {
      k = 75;
    }
    else if ((paramInt1 != 14 ? 0 : 1) != 0)
    {
      k = 14;
    }
    else if ((paramInt1 != 15 ? 0 : 1) != 0)
    {
      k = j;
    }
    else if ((paramInt1 != 13 ? 0 : 1) != 0)
    {
      if ((i > 500 ? 0 : 1) != 0) {
        k = j;
      } else {
        k = 3 * j / 2;
      }
    }
    else if ((paramInt1 != 16 ? 0 : 1) != 0)
    {
      k = 0;
      if ((j < 14 ? 0 : 1) != 0) {
        k = 1;
      }
      if ((j < 14 ? 0 : 1) != 0) {
        k = 2;
      }
    }
    else
    {
      k = -1;
    }
    return k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Iparmq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */