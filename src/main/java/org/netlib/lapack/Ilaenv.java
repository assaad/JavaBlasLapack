package org.netlib.lapack;

import org.netlib.util.Util;

public final class Ilaenv
{
  public static int ilaenv(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    String str1 = new String(" ");
    String str2 = new String("  ");
    String str3 = new String("  ");
    String str4 = new String("   ");
    String str5 = new String("      ");
    int i4 = 0;
    int i5 = paramInt1;
    if ((i5 != 1) && (i5 != 2) && (i5 != 3))
    {
      if (i5 != 4)
      {
        if (i5 == 5) {
          break label4535;
        }
        if (i5 == 6) {
          break label4541;
        }
        if (i5 == 7) {
          break label4557;
        }
        if (i5 == 8) {
          break label4563;
        }
        if (i5 == 9) {
          break label4570;
        }
        if (i5 == 10) {
          break label4577;
        }
        if (i5 == 11) {
          break label4605;
        }
        if ((i5 == 12) || (i5 == 13) || (i5 == 14) || (i5 == 15) || (i5 == 16)) {
          break label4633;
        }
        i4 = -1;
        return i4;
      }
    }
    else
    {
      i4 = 1;
      str5 = paramString1;
      j = str5.substring(1 + -1, 1).charAt(0);
      k = "Z".charAt(0);
      if ((k != 90 ? 0 : 1) == 0) {}
      if (((k != 122 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((j < 97 ? 0 : 1) != 0) {}
        if (((j > 122 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          str5 = Util.stringInsert(str5, new Character(j - 32).toString(), 1, 1);
          i = 2;
          for (i5 = 6 - 2 + 1; i5 > 0; i5--)
          {
            j = str5.substring(i + -1, i).charAt(0);
            if ((j < 97 ? 0 : 1) != 0) {}
            if (((j > 122 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              str5 = Util.stringInsert(str5, new Character(j - 32).toString(), i, i);
            }
            i += 1;
          }
        }
      }
      else
      {
        if ((k != 233 ? 0 : 1) == 0) {}
        if (((k != 169 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((j < 129 ? 0 : 1) != 0) {}
          if (((j > 137 ? 0 : 1) != 0 ? 1 : 0) == 0) {
            if ((j < 145 ? 0 : 1) == 0) {}
          }
          if ((((j > 153 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
            if ((j < 162 ? 0 : 1) == 0) {}
          }
          if ((((j > 169 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            str5 = Util.stringInsert(str5, new Character(j + 64).toString(), 1, 1);
            i = 2;
            for (i5 = 6 - 2 + 1; i5 > 0; i5--)
            {
              j = str5.substring(i + -1, i).charAt(0);
              if ((j < 129 ? 0 : 1) != 0) {}
              if (((j > 137 ? 0 : 1) != 0 ? 1 : 0) == 0) {
                if ((j < 145 ? 0 : 1) == 0) {}
              }
              if ((((j > 153 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
                if ((j < 162 ? 0 : 1) == 0) {}
              }
              if ((((j > 169 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
                str5 = Util.stringInsert(str5, new Character(j + 64).toString(), i, i);
              }
              i += 1;
            }
          }
        }
        else
        {
          if ((k != 218 ? 0 : 1) == 0) {}
          if (((k != 250 ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            if ((j < 225 ? 0 : 1) != 0) {}
            if (((j > 250 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              str5 = Util.stringInsert(str5, new Character(j - 32).toString(), 1, 1);
              i = 2;
              i5 = 6 - 2 + 1;
            }
            for (;;)
            {
              j = str5.substring(i + -1, i).charAt(0);
              if ((j < 225 ? 0 : 1) != 0) {}
              if (((j > 250 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                str5 = Util.stringInsert(str5, new Character(j - 32).toString(), i, i);
              }
              i += 1;
              i5--;
              if (i5 <= 0) {
                break;
              }
            }
          }
        }
      }
      str1 = str5.substring(1 + -1, 1);
      i3 = (!str1.regionMatches(0, "S", 0, 1)) && (!str1.regionMatches(0, "D", 0, 1)) ? 0 : 1;
      i2 = (!str1.regionMatches(0, "C", 0, 1)) && (!str1.regionMatches(0, "Z", 0, 1)) ? 0 : 1;
      if ((((i2 == 0) && (i3 == 0) ? 0 : 1) ^ 0x1) != 0) {
        return i4;
      }
      str2 = str5.substring(2 + -1, 3);
      str4 = str5.substring(4 + -1, 6);
      str3 = str4.substring(2 + -1, 3);
      i5 = paramInt1;
      if (i5 != 1)
      {
        if (i5 != 2) {
          if (i5 == 3) {
            break label3859;
          }
        }
      }
      else
      {
        m = 1;
        if (str2.regionMatches(0, "GE", 0, 2))
        {
          if (str4.regionMatches(0, "TRF", 0, 3))
          {
            if (i3 != 0) {
              m = 64;
            } else {
              m = 64;
            }
          }
          else
          {
            if (((!str4.regionMatches(0, "QRF", 0, 3)) && (!str4.regionMatches(0, "RQF", 0, 3)) ? 0 : 1) == 0) {}
            if ((!str4.regionMatches(0, "LQF", 0, 3) ? 0 : 1) == 0) {}
            if ((!str4.regionMatches(0, "QLF", 0, 3) ? 0 : 1) != 0)
            {
              if (i3 != 0) {
                m = 32;
              } else {
                m = 32;
              }
            }
            else if (str4.regionMatches(0, "HRD", 0, 3))
            {
              if (i3 != 0) {
                m = 32;
              } else {
                m = 32;
              }
            }
            else if (str4.regionMatches(0, "BRD", 0, 3))
            {
              if (i3 != 0) {
                m = 32;
              } else {
                m = 32;
              }
            }
            else if (str4.regionMatches(0, "TRI", 0, 3)) {
              if (i3 != 0) {
                m = 64;
              } else {
                m = 64;
              }
            }
          }
        }
        else if (str2.regionMatches(0, "PO", 0, 2))
        {
          if (str4.regionMatches(0, "TRF", 0, 3)) {
            if (i3 != 0) {
              m = 64;
            } else {
              m = 64;
            }
          }
        }
        else if (str2.regionMatches(0, "SY", 0, 2))
        {
          if (str4.regionMatches(0, "TRF", 0, 3))
          {
            if (i3 != 0) {
              m = 64;
            } else {
              m = 64;
            }
          }
          else if (((i3 != 0) && (str4.regionMatches(0, "TRD", 0, 3)) ? 1 : 0) != 0) {
            m = 32;
          } else if (((i3 != 0) && (str4.regionMatches(0, "GST", 0, 3)) ? 1 : 0) != 0) {
            m = 64;
          }
        }
        else if (((i2 != 0) && (str2.regionMatches(0, "HE", 0, 2)) ? 1 : 0) != 0)
        {
          if (str4.regionMatches(0, "TRF", 0, 3)) {
            m = 64;
          } else if (str4.regionMatches(0, "TRD", 0, 3)) {
            m = 32;
          } else if (str4.regionMatches(0, "GST", 0, 3)) {
            m = 64;
          }
        }
        else if (((i3 != 0) && (str2.regionMatches(0, "OR", 0, 2)) ? 1 : 0) != 0)
        {
          if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
          {
            if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
              m = 32;
            }
          }
          else if (str4.substring(1 + -1, 1).regionMatches(0, "M", 0, 1))
          {
            if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
              m = 32;
            }
          }
        }
        else if (((i2 != 0) && (str2.regionMatches(0, "UN", 0, 2)) ? 1 : 0) != 0)
        {
          if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
          {
            if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
              m = 32;
            }
          }
          else if (str4.substring(1 + -1, 1).regionMatches(0, "M", 0, 1))
          {
            if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
            if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
              m = 32;
            }
          }
        }
        else if (str2.regionMatches(0, "GB", 0, 2))
        {
          if (str4.regionMatches(0, "TRF", 0, 3)) {
            if (i3 != 0)
            {
              if ((paramInt5 > 64 ? 0 : 1) != 0) {
                m = 1;
              } else {
                m = 32;
              }
            }
            else if ((paramInt5 > 64 ? 0 : 1) != 0) {
              m = 1;
            } else {
              m = 32;
            }
          }
        }
        else if (str2.regionMatches(0, "PB", 0, 2))
        {
          if (str4.regionMatches(0, "TRF", 0, 3)) {
            if (i3 != 0)
            {
              if ((paramInt3 > 64 ? 0 : 1) != 0) {
                m = 1;
              } else {
                m = 32;
              }
            }
            else if ((paramInt3 > 64 ? 0 : 1) != 0) {
              m = 1;
            } else {
              m = 32;
            }
          }
        }
        else if (str2.regionMatches(0, "TR", 0, 2))
        {
          if (str4.regionMatches(0, "TRI", 0, 3)) {
            if (i3 != 0) {
              m = 64;
            } else {
              m = 64;
            }
          }
        }
        else if (str2.regionMatches(0, "LA", 0, 2))
        {
          if (str4.regionMatches(0, "UUM", 0, 3)) {
            if (i3 != 0) {
              m = 64;
            } else {
              m = 64;
            }
          }
        }
        else if (((i3 != 0) && (str2.regionMatches(0, "ST", 0, 2)) ? 1 : 0) != 0) {
          if (str4.regionMatches(0, "EBZ", 0, 3)) {
            m = 1;
          }
        }
        i4 = m;
        return i4;
      }
      n = 2;
      if (str2.regionMatches(0, "GE", 0, 2))
      {
        if (((!str4.regionMatches(0, "QRF", 0, 3)) && (!str4.regionMatches(0, "RQF", 0, 3)) ? 0 : 1) == 0) {}
        if ((!str4.regionMatches(0, "LQF", 0, 3) ? 0 : 1) == 0) {}
        if ((!str4.regionMatches(0, "QLF", 0, 3) ? 0 : 1) != 0)
        {
          if (i3 != 0) {
            n = 2;
          } else {
            n = 2;
          }
        }
        else if (str4.regionMatches(0, "HRD", 0, 3))
        {
          if (i3 != 0) {
            n = 2;
          } else {
            n = 2;
          }
        }
        else if (str4.regionMatches(0, "BRD", 0, 3))
        {
          if (i3 != 0) {
            n = 2;
          } else {
            n = 2;
          }
        }
        else if (str4.regionMatches(0, "TRI", 0, 3)) {
          if (i3 != 0) {
            n = 2;
          } else {
            n = 2;
          }
        }
      }
      else if (str2.regionMatches(0, "SY", 0, 2))
      {
        if (str4.regionMatches(0, "TRF", 0, 3))
        {
          if (i3 != 0) {
            n = 8;
          } else {
            n = 8;
          }
        }
        else if (((i3 != 0) && (str4.regionMatches(0, "TRD", 0, 3)) ? 1 : 0) != 0) {
          n = 2;
        }
      }
      else if (((i2 != 0) && (str2.regionMatches(0, "HE", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.regionMatches(0, "TRD", 0, 3)) {
          n = 2;
        }
      }
      else if (((i3 != 0) && (str2.regionMatches(0, "OR", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            n = 2;
          }
        }
        else if (str4.substring(1 + -1, 1).regionMatches(0, "M", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            n = 2;
          }
        }
      }
      else if (((i2 != 0) && (str2.regionMatches(0, "UN", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            n = 2;
          }
        }
        else if (str4.substring(1 + -1, 1).regionMatches(0, "M", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            n = 2;
          }
        }
      }
      i4 = n;
      return i4;
      label3859:
      i1 = 0;
      if (str2.regionMatches(0, "GE", 0, 2))
      {
        if (((!str4.regionMatches(0, "QRF", 0, 3)) && (!str4.regionMatches(0, "RQF", 0, 3)) ? 0 : 1) == 0) {}
        if ((!str4.regionMatches(0, "LQF", 0, 3) ? 0 : 1) == 0) {}
        if ((!str4.regionMatches(0, "QLF", 0, 3) ? 0 : 1) != 0)
        {
          if (i3 != 0) {
            i1 = 128;
          } else {
            i1 = 128;
          }
        }
        else if (str4.regionMatches(0, "HRD", 0, 3))
        {
          if (i3 != 0) {
            i1 = 128;
          } else {
            i1 = 128;
          }
        }
        else if (str4.regionMatches(0, "BRD", 0, 3)) {
          if (i3 != 0) {
            i1 = 128;
          } else {
            i1 = 128;
          }
        }
      }
      else if (str2.regionMatches(0, "SY", 0, 2))
      {
        if (((i3 != 0) && (str4.regionMatches(0, "TRD", 0, 3)) ? 1 : 0) != 0) {
          i1 = 32;
        }
      }
      else if (((i2 != 0) && (str2.regionMatches(0, "HE", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.regionMatches(0, "TRD", 0, 3)) {
          i1 = 32;
        }
      }
      else if (((i3 != 0) && (str2.regionMatches(0, "OR", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            i1 = 128;
          }
        }
      }
      else if (((i2 != 0) && (str2.regionMatches(0, "UN", 0, 2)) ? 1 : 0) != 0)
      {
        if (str4.substring(1 + -1, 1).regionMatches(0, "G", 0, 1))
        {
          if (((!str3.regionMatches(0, "QR", 0, 2)) && (!str3.regionMatches(0, "RQ", 0, 2)) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "LQ", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "QL", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "HR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "TR", 0, 2) ? 0 : 1) == 0) {}
          if ((!str3.regionMatches(0, "BR", 0, 2) ? 0 : 1) != 0) {
            i1 = 128;
          }
        }
      }
      i4 = i1;
      return i4;
    }
    i4 = 6;
    return i4;
    label4535:
    i4 = 2;
    return i4;
    label4541:
    i4 = (int)(Math.min(paramInt2, paramInt3) * 1.6F);
    return i4;
    label4557:
    i4 = 1;
    return i4;
    label4563:
    i4 = 50;
    return i4;
    label4570:
    i4 = 25;
    return i4;
    label4577:
    i4 = 1;
    if ((i4 != 1 ? 0 : 1) != 0) {
      i4 = Ieeeck.ieeeck(0, 0.0F, 1.0F);
    }
    return i4;
    label4605:
    i4 = 1;
    if ((i4 != 1 ? 0 : 1) != 0) {
      i4 = Ieeeck.ieeeck(1, 0.0F, 1.0F);
    }
    return i4;
    label4633:
    i4 = Iparmq.iparmq(paramInt1, paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
    return i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ilaenv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */