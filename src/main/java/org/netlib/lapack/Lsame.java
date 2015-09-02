package org.netlib.lapack;

public final class Lsame
{
  public static boolean lsame(String paramString1, String paramString2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool = false;
    bool = paramString1.regionMatches(0, paramString2, 0, 1);
    if (bool) {
      return bool;
    }
    k = "Z".charAt(0);
    i = paramString1.charAt(0);
    j = paramString2.charAt(0);
    if ((k != 90 ? 0 : 1) == 0) {}
    if (((k != 122 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if ((i < 97 ? 0 : 1) != 0) {}
      if (((i > 122 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i -= 32;
      }
      if ((j < 97 ? 0 : 1) != 0) {}
      if (((j > 122 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        j -= 32;
      }
    }
    else
    {
      if ((k != 233 ? 0 : 1) == 0) {}
      if (((k != 169 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((i < 129 ? 0 : 1) != 0) {}
        if (((i > 137 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((i < 145 ? 0 : 1) == 0) {}
        }
        if ((((i > 153 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if ((i < 162 ? 0 : 1) == 0) {}
        }
        if ((((i > 169 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          i += 64;
        }
        if ((j < 129 ? 0 : 1) != 0) {}
        if (((j > 137 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((j < 145 ? 0 : 1) == 0) {}
        }
        if ((((j > 153 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if ((j < 162 ? 0 : 1) == 0) {}
        }
        if ((((j > 169 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          j += 64;
        }
      }
      else
      {
        if ((k != 218 ? 0 : 1) == 0) {}
        if (((k != 250 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((i < 225 ? 0 : 1) != 0) {}
          if (((i > 250 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            i -= 32;
          }
          if ((j < 225 ? 0 : 1) != 0) {}
          if (((j > 250 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            j -= 32;
          }
        }
      }
    }
    bool = i == j;
    return bool;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Lsame.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */