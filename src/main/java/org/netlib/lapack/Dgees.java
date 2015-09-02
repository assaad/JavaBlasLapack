package org.netlib.lapack;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Dgees
{
  /* Error */
  public static void dgees(String paramString1, String paramString2, Object paramObject, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, org.netlib.util.intW paramintW1, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, boolean[] paramArrayOfBoolean, int paramInt10, org.netlib.util.intW paramintW2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 25
    //   3: iconst_0
    //   4: istore 26
    //   6: iconst_0
    //   7: istore 27
    //   9: iconst_0
    //   10: istore 28
    //   12: iconst_0
    //   13: istore 29
    //   15: iconst_0
    //   16: istore 30
    //   18: iconst_0
    //   19: istore 31
    //   21: iconst_0
    //   22: istore 32
    //   24: iconst_0
    //   25: istore 33
    //   27: iconst_0
    //   28: istore 34
    //   30: iconst_0
    //   31: istore 35
    //   33: iconst_0
    //   34: istore 36
    //   36: new 16	org/netlib/util/intW
    //   39: dup
    //   40: iconst_0
    //   41: invokespecial 19	org/netlib/util/intW:<init>	(I)V
    //   44: astore 37
    //   46: new 16	org/netlib/util/intW
    //   49: dup
    //   50: iconst_0
    //   51: invokespecial 19	org/netlib/util/intW:<init>	(I)V
    //   54: astore 38
    //   56: new 16	org/netlib/util/intW
    //   59: dup
    //   60: iconst_0
    //   61: invokespecial 19	org/netlib/util/intW:<init>	(I)V
    //   64: astore 39
    //   66: new 16	org/netlib/util/intW
    //   69: dup
    //   70: iconst_0
    //   71: invokespecial 19	org/netlib/util/intW:<init>	(I)V
    //   74: astore 40
    //   76: new 16	org/netlib/util/intW
    //   79: dup
    //   80: iconst_0
    //   81: invokespecial 19	org/netlib/util/intW:<init>	(I)V
    //   84: astore 41
    //   86: iconst_0
    //   87: istore 42
    //   89: iconst_0
    //   90: istore 43
    //   92: iconst_0
    //   93: istore 44
    //   95: iconst_0
    //   96: istore 45
    //   98: iconst_0
    //   99: istore 46
    //   101: iconst_0
    //   102: istore 47
    //   104: dconst_0
    //   105: dstore 48
    //   107: new 21	org/netlib/util/doubleW
    //   110: dup
    //   111: dconst_0
    //   112: invokespecial 24	org/netlib/util/doubleW:<init>	(D)V
    //   115: astore 50
    //   117: dconst_0
    //   118: dstore 52
    //   120: dconst_0
    //   121: dstore 54
    //   123: new 21	org/netlib/util/doubleW
    //   126: dup
    //   127: dconst_0
    //   128: invokespecial 24	org/netlib/util/doubleW:<init>	(D)V
    //   131: astore 56
    //   133: new 21	org/netlib/util/doubleW
    //   136: dup
    //   137: dconst_0
    //   138: invokespecial 24	org/netlib/util/doubleW:<init>	(D)V
    //   141: astore 58
    //   143: new 21	org/netlib/util/doubleW
    //   146: dup
    //   147: dconst_0
    //   148: invokespecial 24	org/netlib/util/doubleW:<init>	(D)V
    //   151: astore 60
    //   153: iconst_1
    //   154: newarray <illegal type>
    //   156: astore 62
    //   158: iconst_1
    //   159: newarray <illegal type>
    //   161: astore 63
    //   163: aload_2
    //   164: invokevirtual 28	java/lang/Object:getClass	()Ljava/lang/Class;
    //   167: invokevirtual 34	java/lang/Class:getDeclaredMethods	()[Ljava/lang/reflect/Method;
    //   170: iconst_0
    //   171: aaload
    //   172: astore 65
    //   174: aload 20
    //   176: iconst_0
    //   177: putfield 38	org/netlib/util/intW:val	I
    //   180: iload 17
    //   182: iconst_m1
    //   183: if_icmpeq +7 -> 190
    //   186: iconst_0
    //   187: goto +4 -> 191
    //   190: iconst_1
    //   191: istore 27
    //   193: aload_0
    //   194: ldc 40
    //   196: invokestatic 46	org/netlib/lapack/Lsame:lsame	(Ljava/lang/String;Ljava/lang/String;)Z
    //   199: istore 31
    //   201: aload_1
    //   202: ldc 48
    //   204: invokestatic 46	org/netlib/lapack/Lsame:lsame	(Ljava/lang/String;Ljava/lang/String;)Z
    //   207: istore 30
    //   209: iload 31
    //   211: iconst_1
    //   212: ixor
    //   213: ifeq +18 -> 231
    //   216: aload_0
    //   217: ldc 50
    //   219: invokestatic 46	org/netlib/lapack/Lsame:lsame	(Ljava/lang/String;Ljava/lang/String;)Z
    //   222: iconst_1
    //   223: ixor
    //   224: ifeq +7 -> 231
    //   227: iconst_1
    //   228: goto +4 -> 232
    //   231: iconst_0
    //   232: ifeq +12 -> 244
    //   235: aload 20
    //   237: iconst_m1
    //   238: putfield 38	org/netlib/util/intW:val	I
    //   241: goto +149 -> 390
    //   244: iload 30
    //   246: iconst_1
    //   247: ixor
    //   248: ifeq +18 -> 266
    //   251: aload_1
    //   252: ldc 50
    //   254: invokestatic 46	org/netlib/lapack/Lsame:lsame	(Ljava/lang/String;Ljava/lang/String;)Z
    //   257: iconst_1
    //   258: ixor
    //   259: ifeq +7 -> 266
    //   262: iconst_1
    //   263: goto +4 -> 267
    //   266: iconst_0
    //   267: ifeq +13 -> 280
    //   270: aload 20
    //   272: bipush -2
    //   274: putfield 38	org/netlib/util/intW:val	I
    //   277: goto +113 -> 390
    //   280: iload_3
    //   281: iconst_0
    //   282: if_icmplt +7 -> 289
    //   285: iconst_0
    //   286: goto +4 -> 290
    //   289: iconst_1
    //   290: ifeq +13 -> 303
    //   293: aload 20
    //   295: bipush -4
    //   297: putfield 38	org/netlib/util/intW:val	I
    //   300: goto +90 -> 390
    //   303: iload 6
    //   305: iconst_1
    //   306: iload_3
    //   307: invokestatic 56	java/lang/Math:max	(II)I
    //   310: if_icmplt +7 -> 317
    //   313: iconst_0
    //   314: goto +4 -> 318
    //   317: iconst_1
    //   318: ifeq +13 -> 331
    //   321: aload 20
    //   323: bipush -6
    //   325: putfield 38	org/netlib/util/intW:val	I
    //   328: goto +62 -> 390
    //   331: iload 14
    //   333: iconst_1
    //   334: if_icmplt +7 -> 341
    //   337: iconst_0
    //   338: goto +4 -> 342
    //   341: iconst_1
    //   342: ifne +34 -> 376
    //   345: iload 31
    //   347: ifeq +21 -> 368
    //   350: iload 14
    //   352: iload_3
    //   353: if_icmplt +7 -> 360
    //   356: iconst_0
    //   357: goto +4 -> 361
    //   360: iconst_1
    //   361: ifeq +7 -> 368
    //   364: iconst_1
    //   365: goto +4 -> 369
    //   368: iconst_0
    //   369: ifne +7 -> 376
    //   372: iconst_0
    //   373: goto +4 -> 377
    //   376: iconst_1
    //   377: ifeq +13 -> 390
    //   380: aload 20
    //   382: bipush -11
    //   384: putfield 38	org/netlib/util/intW:val	I
    //   387: goto +3 -> 390
    //   390: aload 20
    //   392: getfield 38	org/netlib/util/intW:val	I
    //   395: iconst_0
    //   396: if_icmpeq +7 -> 403
    //   399: iconst_0
    //   400: goto +4 -> 404
    //   403: iconst_1
    //   404: ifeq +206 -> 610
    //   407: iload_3
    //   408: iconst_0
    //   409: if_icmpeq +7 -> 416
    //   412: iconst_0
    //   413: goto +4 -> 417
    //   416: iconst_1
    //   417: ifeq +12 -> 429
    //   420: iconst_1
    //   421: istore 47
    //   423: iconst_1
    //   424: istore 46
    //   426: goto +135 -> 561
    //   429: iconst_2
    //   430: iload_3
    //   431: imul
    //   432: iload_3
    //   433: iconst_1
    //   434: ldc 58
    //   436: ldc 60
    //   438: iload_3
    //   439: iconst_1
    //   440: iload_3
    //   441: iconst_0
    //   442: invokestatic 66	org/netlib/lapack/Ilaenv:ilaenv	(ILjava/lang/String;Ljava/lang/String;IIII)I
    //   445: imul
    //   446: iadd
    //   447: istore 46
    //   449: iconst_3
    //   450: iload_3
    //   451: imul
    //   452: istore 47
    //   454: ldc 48
    //   456: aload_0
    //   457: iload_3
    //   458: iconst_1
    //   459: iload_3
    //   460: aload 4
    //   462: iload 5
    //   464: iload 6
    //   466: aload 8
    //   468: iload 9
    //   470: aload 10
    //   472: iload 11
    //   474: aload 12
    //   476: iload 13
    //   478: iload 14
    //   480: aload 15
    //   482: iload 16
    //   484: iconst_m1
    //   485: aload 39
    //   487: invokestatic 72	org/netlib/lapack/Dhseqr:dhseqr	(Ljava/lang/String;Ljava/lang/String;III[DII[DI[DI[DII[DIILorg/netlib/util/intW;)V
    //   490: aload 15
    //   492: iconst_1
    //   493: iconst_1
    //   494: isub
    //   495: iload 16
    //   497: iadd
    //   498: daload
    //   499: d2i
    //   500: istore 32
    //   502: iload 31
    //   504: iconst_1
    //   505: ixor
    //   506: ifeq +17 -> 523
    //   509: iload 46
    //   511: iload_3
    //   512: iload 32
    //   514: iadd
    //   515: invokestatic 56	java/lang/Math:max	(II)I
    //   518: istore 46
    //   520: goto +41 -> 561
    //   523: iload 46
    //   525: iconst_2
    //   526: iload_3
    //   527: imul
    //   528: iload_3
    //   529: iconst_1
    //   530: isub
    //   531: iconst_1
    //   532: ldc 74
    //   534: ldc 60
    //   536: iload_3
    //   537: iconst_1
    //   538: iload_3
    //   539: iconst_m1
    //   540: invokestatic 66	org/netlib/lapack/Ilaenv:ilaenv	(ILjava/lang/String;Ljava/lang/String;IIII)I
    //   543: imul
    //   544: iadd
    //   545: invokestatic 56	java/lang/Math:max	(II)I
    //   548: istore 46
    //   550: iload 46
    //   552: iload_3
    //   553: iload 32
    //   555: iadd
    //   556: invokestatic 56	java/lang/Math:max	(II)I
    //   559: istore 46
    //   561: aload 15
    //   563: iconst_1
    //   564: iconst_1
    //   565: isub
    //   566: iload 16
    //   568: iadd
    //   569: iload 46
    //   571: i2d
    //   572: dastore
    //   573: iload 17
    //   575: iload 47
    //   577: if_icmplt +7 -> 584
    //   580: iconst_0
    //   581: goto +4 -> 585
    //   584: iconst_1
    //   585: ifeq +14 -> 599
    //   588: iload 27
    //   590: iconst_1
    //   591: ixor
    //   592: ifeq +7 -> 599
    //   595: iconst_1
    //   596: goto +4 -> 600
    //   599: iconst_0
    //   600: ifeq +10 -> 610
    //   603: aload 20
    //   605: bipush -13
    //   607: putfield 38	org/netlib/util/intW:val	I
    //   610: aload 20
    //   612: getfield 38	org/netlib/util/intW:val	I
    //   615: iconst_0
    //   616: if_icmpne +7 -> 623
    //   619: iconst_0
    //   620: goto +4 -> 624
    //   623: iconst_1
    //   624: ifeq +18 -> 642
    //   627: ldc 76
    //   629: aload 20
    //   631: getfield 38	org/netlib/util/intW:val	I
    //   634: ineg
    //   635: invokestatic 82	org/netlib/err/Xerbla:xerbla	(Ljava/lang/String;I)V
    //   638: return
    //   639: goto +0 -> 639
    //   642: iload 27
    //   644: ifeq +7 -> 651
    //   647: return
    //   648: goto +0 -> 648
    //   651: iload_3
    //   652: iconst_0
    //   653: if_icmpeq +7 -> 660
    //   656: iconst_0
    //   657: goto +4 -> 661
    //   660: iconst_1
    //   661: ifeq +10 -> 671
    //   664: aload 7
    //   666: iconst_0
    //   667: putfield 38	org/netlib/util/intW:val	I
    //   670: return
    //   671: ldc 84
    //   673: invokestatic 90	org/netlib/lapack/Dlamch:dlamch	(Ljava/lang/String;)D
    //   676: dstore 54
    //   678: aload 60
    //   680: ldc 48
    //   682: invokestatic 90	org/netlib/lapack/Dlamch:dlamch	(Ljava/lang/String;)D
    //   685: putfield 93	org/netlib/util/doubleW:val	D
    //   688: aload 50
    //   690: dconst_1
    //   691: aload 60
    //   693: getfield 93	org/netlib/util/doubleW:val	D
    //   696: ddiv
    //   697: putfield 93	org/netlib/util/doubleW:val	D
    //   700: aload 60
    //   702: aload 50
    //   704: invokestatic 99	org/netlib/lapack/Dlabad:dlabad	(Lorg/netlib/util/doubleW;Lorg/netlib/util/doubleW;)V
    //   707: aload 60
    //   709: aload 60
    //   711: getfield 93	org/netlib/util/doubleW:val	D
    //   714: invokestatic 103	java/lang/Math:sqrt	(D)D
    //   717: dload 54
    //   719: ddiv
    //   720: putfield 93	org/netlib/util/doubleW:val	D
    //   723: aload 50
    //   725: dconst_1
    //   726: aload 60
    //   728: getfield 93	org/netlib/util/doubleW:val	D
    //   731: ddiv
    //   732: putfield 93	org/netlib/util/doubleW:val	D
    //   735: ldc 105
    //   737: iload_3
    //   738: iload_3
    //   739: aload 4
    //   741: iload 5
    //   743: iload 6
    //   745: aload 63
    //   747: iconst_0
    //   748: invokestatic 111	org/netlib/lapack/Dlange:dlange	(Ljava/lang/String;II[DII[DI)D
    //   751: dstore 48
    //   753: iconst_0
    //   754: istore 29
    //   756: dload 48
    //   758: dconst_0
    //   759: dcmpl
    //   760: ifgt +7 -> 767
    //   763: iconst_0
    //   764: goto +4 -> 768
    //   767: iconst_1
    //   768: ifeq +26 -> 794
    //   771: dload 48
    //   773: aload 60
    //   775: getfield 93	org/netlib/util/doubleW:val	D
    //   778: dcmpg
    //   779: iflt +7 -> 786
    //   782: iconst_0
    //   783: goto +4 -> 787
    //   786: iconst_1
    //   787: ifeq +7 -> 794
    //   790: iconst_1
    //   791: goto +4 -> 795
    //   794: iconst_0
    //   795: ifeq +16 -> 811
    //   798: iconst_1
    //   799: istore 29
    //   801: aload 60
    //   803: getfield 93	org/netlib/util/doubleW:val	D
    //   806: dstore 52
    //   808: goto +35 -> 843
    //   811: dload 48
    //   813: aload 50
    //   815: getfield 93	org/netlib/util/doubleW:val	D
    //   818: dcmpl
    //   819: ifgt +7 -> 826
    //   822: iconst_0
    //   823: goto +4 -> 827
    //   826: iconst_1
    //   827: ifeq +16 -> 843
    //   830: iconst_1
    //   831: istore 29
    //   833: aload 50
    //   835: getfield 93	org/netlib/util/doubleW:val	D
    //   838: dstore 52
    //   840: goto +3 -> 843
    //   843: iload 29
    //   845: ifeq +24 -> 869
    //   848: ldc 113
    //   850: iconst_0
    //   851: iconst_0
    //   852: dload 48
    //   854: dload 52
    //   856: iload_3
    //   857: iload_3
    //   858: aload 4
    //   860: iload 5
    //   862: iload 6
    //   864: aload 38
    //   866: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   869: iconst_1
    //   870: istore 36
    //   872: ldc 84
    //   874: iload_3
    //   875: aload 4
    //   877: iload 5
    //   879: iload 6
    //   881: aload 41
    //   883: aload 40
    //   885: aload 15
    //   887: iload 36
    //   889: iconst_1
    //   890: isub
    //   891: iload 16
    //   893: iadd
    //   894: aload 38
    //   896: invokestatic 125	org/netlib/lapack/Dgebal:dgebal	(Ljava/lang/String;I[DIILorg/netlib/util/intW;Lorg/netlib/util/intW;[DILorg/netlib/util/intW;)V
    //   899: iload_3
    //   900: iload 36
    //   902: iadd
    //   903: istore 44
    //   905: iload_3
    //   906: iload 44
    //   908: iadd
    //   909: istore 45
    //   911: iload_3
    //   912: aload 41
    //   914: getfield 38	org/netlib/util/intW:val	I
    //   917: aload 40
    //   919: getfield 38	org/netlib/util/intW:val	I
    //   922: aload 4
    //   924: iload 5
    //   926: iload 6
    //   928: aload 15
    //   930: iload 44
    //   932: iconst_1
    //   933: isub
    //   934: iload 16
    //   936: iadd
    //   937: aload 15
    //   939: iload 45
    //   941: iconst_1
    //   942: isub
    //   943: iload 16
    //   945: iadd
    //   946: iload 17
    //   948: iload 45
    //   950: isub
    //   951: iconst_1
    //   952: iadd
    //   953: aload 38
    //   955: invokestatic 131	org/netlib/lapack/Dgehrd:dgehrd	(III[DII[DI[DIILorg/netlib/util/intW;)V
    //   958: iload 31
    //   960: ifeq +69 -> 1029
    //   963: ldc -123
    //   965: iload_3
    //   966: iload_3
    //   967: aload 4
    //   969: iload 5
    //   971: iload 6
    //   973: aload 12
    //   975: iload 13
    //   977: iload 14
    //   979: invokestatic 139	org/netlib/lapack/Dlacpy:dlacpy	(Ljava/lang/String;II[DII[DII)V
    //   982: iload_3
    //   983: aload 41
    //   985: getfield 38	org/netlib/util/intW:val	I
    //   988: aload 40
    //   990: getfield 38	org/netlib/util/intW:val	I
    //   993: aload 12
    //   995: iload 13
    //   997: iload 14
    //   999: aload 15
    //   1001: iload 44
    //   1003: iconst_1
    //   1004: isub
    //   1005: iload 16
    //   1007: iadd
    //   1008: aload 15
    //   1010: iload 45
    //   1012: iconst_1
    //   1013: isub
    //   1014: iload 16
    //   1016: iadd
    //   1017: iload 17
    //   1019: iload 45
    //   1021: isub
    //   1022: iconst_1
    //   1023: iadd
    //   1024: aload 38
    //   1026: invokestatic 144	org/netlib/lapack/Dorghr:dorghr	(III[DII[DI[DIILorg/netlib/util/intW;)V
    //   1029: aload 7
    //   1031: iconst_0
    //   1032: putfield 38	org/netlib/util/intW:val	I
    //   1035: iload 44
    //   1037: istore 45
    //   1039: ldc 48
    //   1041: aload_0
    //   1042: iload_3
    //   1043: aload 41
    //   1045: getfield 38	org/netlib/util/intW:val	I
    //   1048: aload 40
    //   1050: getfield 38	org/netlib/util/intW:val	I
    //   1053: aload 4
    //   1055: iload 5
    //   1057: iload 6
    //   1059: aload 8
    //   1061: iload 9
    //   1063: aload 10
    //   1065: iload 11
    //   1067: aload 12
    //   1069: iload 13
    //   1071: iload 14
    //   1073: aload 15
    //   1075: iload 45
    //   1077: iconst_1
    //   1078: isub
    //   1079: iload 16
    //   1081: iadd
    //   1082: iload 17
    //   1084: iload 45
    //   1086: isub
    //   1087: iconst_1
    //   1088: iadd
    //   1089: aload 39
    //   1091: invokestatic 72	org/netlib/lapack/Dhseqr:dhseqr	(Ljava/lang/String;Ljava/lang/String;III[DII[DI[DI[DII[DIILorg/netlib/util/intW;)V
    //   1094: aload 39
    //   1096: getfield 38	org/netlib/util/intW:val	I
    //   1099: iconst_0
    //   1100: if_icmpgt +7 -> 1107
    //   1103: iconst_0
    //   1104: goto +4 -> 1108
    //   1107: iconst_1
    //   1108: ifeq +13 -> 1121
    //   1111: aload 20
    //   1113: aload 39
    //   1115: getfield 38	org/netlib/util/intW:val	I
    //   1118: putfield 38	org/netlib/util/intW:val	I
    //   1121: iload 30
    //   1123: ifeq +24 -> 1147
    //   1126: aload 20
    //   1128: getfield 38	org/netlib/util/intW:val	I
    //   1131: iconst_0
    //   1132: if_icmpeq +7 -> 1139
    //   1135: iconst_0
    //   1136: goto +4 -> 1140
    //   1139: iconst_1
    //   1140: ifeq +7 -> 1147
    //   1143: iconst_1
    //   1144: goto +4 -> 1148
    //   1147: iconst_0
    //   1148: ifeq +196 -> 1344
    //   1151: iload 29
    //   1153: ifeq +43 -> 1196
    //   1156: ldc 113
    //   1158: iconst_0
    //   1159: iconst_0
    //   1160: dload 52
    //   1162: dload 48
    //   1164: iload_3
    //   1165: iconst_1
    //   1166: aload 8
    //   1168: iload 9
    //   1170: iload_3
    //   1171: aload 38
    //   1173: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   1176: ldc 113
    //   1178: iconst_0
    //   1179: iconst_0
    //   1180: dload 52
    //   1182: dload 48
    //   1184: iload_3
    //   1185: iconst_1
    //   1186: aload 10
    //   1188: iload 11
    //   1190: iload_3
    //   1191: aload 38
    //   1193: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   1196: iconst_1
    //   1197: istore 33
    //   1199: iload_3
    //   1200: iconst_1
    //   1201: isub
    //   1202: iconst_1
    //   1203: iadd
    //   1204: istore 66
    //   1206: goto +45 -> 1251
    //   1209: aload 18
    //   1211: iload 33
    //   1213: iconst_1
    //   1214: isub
    //   1215: iload 19
    //   1217: iadd
    //   1218: aload 65
    //   1220: aload 8
    //   1222: iload 33
    //   1224: iconst_1
    //   1225: isub
    //   1226: iload 9
    //   1228: iadd
    //   1229: aload 10
    //   1231: iload 33
    //   1233: iconst_1
    //   1234: isub
    //   1235: iload 11
    //   1237: iadd
    //   1238: invokestatic 148	org/netlib/lapack/Dgees:select_methcall	(Ljava/lang/reflect/Method;[DI[DI)Z
    //   1241: bastore
    //   1242: iload 33
    //   1244: iconst_1
    //   1245: iadd
    //   1246: istore 33
    //   1248: iinc 66 -1
    //   1251: iload 66
    //   1253: ifgt -44 -> 1209
    //   1256: ldc 50
    //   1258: aload_0
    //   1259: aload 18
    //   1261: iload 19
    //   1263: iload_3
    //   1264: aload 4
    //   1266: iload 5
    //   1268: iload 6
    //   1270: aload 12
    //   1272: iload 13
    //   1274: iload 14
    //   1276: aload 8
    //   1278: iload 9
    //   1280: aload 10
    //   1282: iload 11
    //   1284: aload 7
    //   1286: aload 56
    //   1288: aload 58
    //   1290: aload 15
    //   1292: iload 45
    //   1294: iconst_1
    //   1295: isub
    //   1296: iload 16
    //   1298: iadd
    //   1299: iload 17
    //   1301: iload 45
    //   1303: isub
    //   1304: iconst_1
    //   1305: iadd
    //   1306: aload 62
    //   1308: iconst_0
    //   1309: iconst_1
    //   1310: aload 37
    //   1312: invokestatic 154	org/netlib/lapack/Dtrsen:dtrsen	(Ljava/lang/String;Ljava/lang/String;[ZII[DII[DII[DI[DILorg/netlib/util/intW;Lorg/netlib/util/doubleW;Lorg/netlib/util/doubleW;[DII[IIILorg/netlib/util/intW;)V
    //   1315: aload 37
    //   1317: getfield 38	org/netlib/util/intW:val	I
    //   1320: iconst_0
    //   1321: if_icmpgt +7 -> 1328
    //   1324: iconst_0
    //   1325: goto +4 -> 1329
    //   1328: iconst_1
    //   1329: ifeq +15 -> 1344
    //   1332: aload 20
    //   1334: iload_3
    //   1335: aload 37
    //   1337: getfield 38	org/netlib/util/intW:val	I
    //   1340: iadd
    //   1341: putfield 38	org/netlib/util/intW:val	I
    //   1344: iload 31
    //   1346: ifeq +39 -> 1385
    //   1349: ldc 84
    //   1351: ldc -100
    //   1353: iload_3
    //   1354: aload 41
    //   1356: getfield 38	org/netlib/util/intW:val	I
    //   1359: aload 40
    //   1361: getfield 38	org/netlib/util/intW:val	I
    //   1364: aload 15
    //   1366: iload 36
    //   1368: iconst_1
    //   1369: isub
    //   1370: iload 16
    //   1372: iadd
    //   1373: iload_3
    //   1374: aload 12
    //   1376: iload 13
    //   1378: iload 14
    //   1380: aload 38
    //   1382: invokestatic 162	org/netlib/lapack/Dgebak:dgebak	(Ljava/lang/String;Ljava/lang/String;III[DII[DIILorg/netlib/util/intW;)V
    //   1385: iload 29
    //   1387: ifeq +697 -> 2084
    //   1390: ldc -92
    //   1392: iconst_0
    //   1393: iconst_0
    //   1394: dload 52
    //   1396: dload 48
    //   1398: iload_3
    //   1399: iload_3
    //   1400: aload 4
    //   1402: iload 5
    //   1404: iload 6
    //   1406: aload 38
    //   1408: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   1411: iload_3
    //   1412: aload 4
    //   1414: iload 5
    //   1416: iload 6
    //   1418: iconst_1
    //   1419: iadd
    //   1420: aload 8
    //   1422: iload 9
    //   1424: iconst_1
    //   1425: invokestatic 170	org/netlib/blas/Dcopy:dcopy	(I[DII[DII)V
    //   1428: dload 52
    //   1430: aload 60
    //   1432: getfield 93	org/netlib/util/doubleW:val	D
    //   1435: dcmpl
    //   1436: ifeq +7 -> 1443
    //   1439: iconst_0
    //   1440: goto +4 -> 1444
    //   1443: iconst_1
    //   1444: ifeq +594 -> 2038
    //   1447: aload 39
    //   1449: getfield 38	org/netlib/util/intW:val	I
    //   1452: iconst_0
    //   1453: if_icmpgt +7 -> 1460
    //   1456: iconst_0
    //   1457: goto +4 -> 1461
    //   1460: iconst_1
    //   1461: ifeq +60 -> 1521
    //   1464: aload 39
    //   1466: getfield 38	org/netlib/util/intW:val	I
    //   1469: iconst_1
    //   1470: iadd
    //   1471: istore 34
    //   1473: aload 40
    //   1475: getfield 38	org/netlib/util/intW:val	I
    //   1478: iconst_1
    //   1479: isub
    //   1480: istore 35
    //   1482: ldc 113
    //   1484: iconst_0
    //   1485: iconst_0
    //   1486: dload 52
    //   1488: dload 48
    //   1490: aload 41
    //   1492: getfield 38	org/netlib/util/intW:val	I
    //   1495: iconst_1
    //   1496: isub
    //   1497: iconst_1
    //   1498: aload 10
    //   1500: iload 11
    //   1502: aload 41
    //   1504: getfield 38	org/netlib/util/intW:val	I
    //   1507: iconst_1
    //   1508: isub
    //   1509: iconst_1
    //   1510: invokestatic 56	java/lang/Math:max	(II)I
    //   1513: aload 38
    //   1515: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   1518: goto +35 -> 1553
    //   1521: iload 30
    //   1523: ifeq +14 -> 1537
    //   1526: iconst_1
    //   1527: istore 34
    //   1529: iload_3
    //   1530: iconst_1
    //   1531: isub
    //   1532: istore 35
    //   1534: goto +19 -> 1553
    //   1537: aload 41
    //   1539: getfield 38	org/netlib/util/intW:val	I
    //   1542: istore 34
    //   1544: aload 40
    //   1546: getfield 38	org/netlib/util/intW:val	I
    //   1549: iconst_1
    //   1550: isub
    //   1551: istore 35
    //   1553: iload 34
    //   1555: iconst_1
    //   1556: isub
    //   1557: istore 42
    //   1559: iload 34
    //   1561: istore 33
    //   1563: iload 35
    //   1565: iload 34
    //   1567: isub
    //   1568: iconst_1
    //   1569: iadd
    //   1570: istore 66
    //   1572: goto +461 -> 2033
    //   1575: iload 33
    //   1577: iload 42
    //   1579: if_icmplt +7 -> 1586
    //   1582: iconst_0
    //   1583: goto +4 -> 1587
    //   1586: iconst_1
    //   1587: ifeq +6 -> 1593
    //   1590: goto +434 -> 2024
    //   1593: aload 10
    //   1595: iload 33
    //   1597: iconst_1
    //   1598: isub
    //   1599: iload 11
    //   1601: iadd
    //   1602: daload
    //   1603: dconst_0
    //   1604: dcmpl
    //   1605: ifeq +7 -> 1612
    //   1608: iconst_0
    //   1609: goto +4 -> 1613
    //   1612: iconst_1
    //   1613: ifeq +12 -> 1625
    //   1616: iload 33
    //   1618: iconst_1
    //   1619: iadd
    //   1620: istore 42
    //   1622: goto +402 -> 2024
    //   1625: aload 4
    //   1627: iload 33
    //   1629: iconst_1
    //   1630: iadd
    //   1631: iconst_1
    //   1632: isub
    //   1633: iload 33
    //   1635: iconst_1
    //   1636: isub
    //   1637: iload 6
    //   1639: imul
    //   1640: iadd
    //   1641: iload 5
    //   1643: iadd
    //   1644: daload
    //   1645: dconst_0
    //   1646: dcmpl
    //   1647: ifeq +7 -> 1654
    //   1650: iconst_0
    //   1651: goto +4 -> 1655
    //   1654: iconst_1
    //   1655: ifeq +30 -> 1685
    //   1658: aload 10
    //   1660: iload 33
    //   1662: iconst_1
    //   1663: isub
    //   1664: iload 11
    //   1666: iadd
    //   1667: dconst_0
    //   1668: dastore
    //   1669: aload 10
    //   1671: iload 33
    //   1673: iconst_1
    //   1674: iadd
    //   1675: iconst_1
    //   1676: isub
    //   1677: iload 11
    //   1679: iadd
    //   1680: dconst_0
    //   1681: dastore
    //   1682: goto +336 -> 2018
    //   1685: aload 4
    //   1687: iload 33
    //   1689: iconst_1
    //   1690: iadd
    //   1691: iconst_1
    //   1692: isub
    //   1693: iload 33
    //   1695: iconst_1
    //   1696: isub
    //   1697: iload 6
    //   1699: imul
    //   1700: iadd
    //   1701: iload 5
    //   1703: iadd
    //   1704: daload
    //   1705: dconst_0
    //   1706: dcmpl
    //   1707: ifne +7 -> 1714
    //   1710: iconst_0
    //   1711: goto +4 -> 1715
    //   1714: iconst_1
    //   1715: ifeq +40 -> 1755
    //   1718: aload 4
    //   1720: iload 33
    //   1722: iconst_1
    //   1723: isub
    //   1724: iload 33
    //   1726: iconst_1
    //   1727: iadd
    //   1728: iconst_1
    //   1729: isub
    //   1730: iload 6
    //   1732: imul
    //   1733: iadd
    //   1734: iload 5
    //   1736: iadd
    //   1737: daload
    //   1738: dconst_0
    //   1739: dcmpl
    //   1740: ifeq +7 -> 1747
    //   1743: iconst_0
    //   1744: goto +4 -> 1748
    //   1747: iconst_1
    //   1748: ifeq +7 -> 1755
    //   1751: iconst_1
    //   1752: goto +4 -> 1756
    //   1755: iconst_0
    //   1756: ifeq +262 -> 2018
    //   1759: aload 10
    //   1761: iload 33
    //   1763: iconst_1
    //   1764: isub
    //   1765: iload 11
    //   1767: iadd
    //   1768: dconst_0
    //   1769: dastore
    //   1770: aload 10
    //   1772: iload 33
    //   1774: iconst_1
    //   1775: iadd
    //   1776: iconst_1
    //   1777: isub
    //   1778: iload 11
    //   1780: iadd
    //   1781: dconst_0
    //   1782: dastore
    //   1783: iload 33
    //   1785: iconst_1
    //   1786: if_icmpgt +7 -> 1793
    //   1789: iconst_0
    //   1790: goto +4 -> 1794
    //   1793: iconst_1
    //   1794: ifeq +46 -> 1840
    //   1797: iload 33
    //   1799: iconst_1
    //   1800: isub
    //   1801: aload 4
    //   1803: iconst_1
    //   1804: iconst_1
    //   1805: isub
    //   1806: iload 33
    //   1808: iconst_1
    //   1809: isub
    //   1810: iload 6
    //   1812: imul
    //   1813: iadd
    //   1814: iload 5
    //   1816: iadd
    //   1817: iconst_1
    //   1818: aload 4
    //   1820: iconst_1
    //   1821: iconst_1
    //   1822: isub
    //   1823: iload 33
    //   1825: iconst_1
    //   1826: iadd
    //   1827: iconst_1
    //   1828: isub
    //   1829: iload 6
    //   1831: imul
    //   1832: iadd
    //   1833: iload 5
    //   1835: iadd
    //   1836: iconst_1
    //   1837: invokestatic 175	org/netlib/blas/Dswap:dswap	(I[DII[DII)V
    //   1840: iload_3
    //   1841: iload 33
    //   1843: iconst_1
    //   1844: iadd
    //   1845: if_icmpgt +7 -> 1852
    //   1848: iconst_0
    //   1849: goto +4 -> 1853
    //   1852: iconst_1
    //   1853: ifeq +56 -> 1909
    //   1856: iload_3
    //   1857: iload 33
    //   1859: isub
    //   1860: iconst_1
    //   1861: isub
    //   1862: aload 4
    //   1864: iload 33
    //   1866: iconst_1
    //   1867: isub
    //   1868: iload 33
    //   1870: iconst_2
    //   1871: iadd
    //   1872: iconst_1
    //   1873: isub
    //   1874: iload 6
    //   1876: imul
    //   1877: iadd
    //   1878: iload 5
    //   1880: iadd
    //   1881: iload 6
    //   1883: aload 4
    //   1885: iload 33
    //   1887: iconst_1
    //   1888: iadd
    //   1889: iconst_1
    //   1890: isub
    //   1891: iload 33
    //   1893: iconst_2
    //   1894: iadd
    //   1895: iconst_1
    //   1896: isub
    //   1897: iload 6
    //   1899: imul
    //   1900: iadd
    //   1901: iload 5
    //   1903: iadd
    //   1904: iload 6
    //   1906: invokestatic 175	org/netlib/blas/Dswap:dswap	(I[DII[DII)V
    //   1909: iload 31
    //   1911: ifeq +43 -> 1954
    //   1914: iload_3
    //   1915: aload 12
    //   1917: iconst_1
    //   1918: iconst_1
    //   1919: isub
    //   1920: iload 33
    //   1922: iconst_1
    //   1923: isub
    //   1924: iload 14
    //   1926: imul
    //   1927: iadd
    //   1928: iload 13
    //   1930: iadd
    //   1931: iconst_1
    //   1932: aload 12
    //   1934: iconst_1
    //   1935: iconst_1
    //   1936: isub
    //   1937: iload 33
    //   1939: iconst_1
    //   1940: iadd
    //   1941: iconst_1
    //   1942: isub
    //   1943: iload 14
    //   1945: imul
    //   1946: iadd
    //   1947: iload 13
    //   1949: iadd
    //   1950: iconst_1
    //   1951: invokestatic 175	org/netlib/blas/Dswap:dswap	(I[DII[DII)V
    //   1954: aload 4
    //   1956: iload 33
    //   1958: iconst_1
    //   1959: isub
    //   1960: iload 33
    //   1962: iconst_1
    //   1963: iadd
    //   1964: iconst_1
    //   1965: isub
    //   1966: iload 6
    //   1968: imul
    //   1969: iadd
    //   1970: iload 5
    //   1972: iadd
    //   1973: aload 4
    //   1975: iload 33
    //   1977: iconst_1
    //   1978: iadd
    //   1979: iconst_1
    //   1980: isub
    //   1981: iload 33
    //   1983: iconst_1
    //   1984: isub
    //   1985: iload 6
    //   1987: imul
    //   1988: iadd
    //   1989: iload 5
    //   1991: iadd
    //   1992: daload
    //   1993: dastore
    //   1994: aload 4
    //   1996: iload 33
    //   1998: iconst_1
    //   1999: iadd
    //   2000: iconst_1
    //   2001: isub
    //   2002: iload 33
    //   2004: iconst_1
    //   2005: isub
    //   2006: iload 6
    //   2008: imul
    //   2009: iadd
    //   2010: iload 5
    //   2012: iadd
    //   2013: dconst_0
    //   2014: dastore
    //   2015: goto +3 -> 2018
    //   2018: iload 33
    //   2020: iconst_2
    //   2021: iadd
    //   2022: istore 42
    //   2024: iload 33
    //   2026: iconst_1
    //   2027: iadd
    //   2028: istore 33
    //   2030: iinc 66 -1
    //   2033: iload 66
    //   2035: ifgt -460 -> 1575
    //   2038: ldc 113
    //   2040: iconst_0
    //   2041: iconst_0
    //   2042: dload 52
    //   2044: dload 48
    //   2046: iload_3
    //   2047: aload 39
    //   2049: getfield 38	org/netlib/util/intW:val	I
    //   2052: isub
    //   2053: iconst_1
    //   2054: aload 10
    //   2056: aload 39
    //   2058: getfield 38	org/netlib/util/intW:val	I
    //   2061: iconst_1
    //   2062: iadd
    //   2063: iconst_1
    //   2064: isub
    //   2065: iload 11
    //   2067: iadd
    //   2068: iload_3
    //   2069: aload 39
    //   2071: getfield 38	org/netlib/util/intW:val	I
    //   2074: isub
    //   2075: iconst_1
    //   2076: invokestatic 56	java/lang/Math:max	(II)I
    //   2079: aload 38
    //   2081: invokestatic 119	org/netlib/lapack/Dlascl:dlascl	(Ljava/lang/String;IIDDII[DIILorg/netlib/util/intW;)V
    //   2084: iload 30
    //   2086: ifeq +24 -> 2110
    //   2089: aload 20
    //   2091: getfield 38	org/netlib/util/intW:val	I
    //   2094: iconst_0
    //   2095: if_icmpeq +7 -> 2102
    //   2098: iconst_0
    //   2099: goto +4 -> 2103
    //   2102: iconst_1
    //   2103: ifeq +7 -> 2110
    //   2106: iconst_1
    //   2107: goto +4 -> 2111
    //   2110: iconst_0
    //   2111: ifeq +241 -> 2352
    //   2114: iconst_1
    //   2115: istore 26
    //   2117: iconst_1
    //   2118: istore 28
    //   2120: aload 7
    //   2122: iconst_0
    //   2123: putfield 38	org/netlib/util/intW:val	I
    //   2126: iconst_0
    //   2127: istore 43
    //   2129: iconst_1
    //   2130: istore 33
    //   2132: iload_3
    //   2133: iconst_1
    //   2134: isub
    //   2135: iconst_1
    //   2136: iadd
    //   2137: istore 66
    //   2139: goto +208 -> 2347
    //   2142: aload 65
    //   2144: aload 8
    //   2146: iload 33
    //   2148: iconst_1
    //   2149: isub
    //   2150: iload 9
    //   2152: iadd
    //   2153: aload 10
    //   2155: iload 33
    //   2157: iconst_1
    //   2158: isub
    //   2159: iload 11
    //   2161: iadd
    //   2162: invokestatic 148	org/netlib/lapack/Dgees:select_methcall	(Ljava/lang/reflect/Method;[DI[DI)Z
    //   2165: istore 25
    //   2167: aload 10
    //   2169: iload 33
    //   2171: iconst_1
    //   2172: isub
    //   2173: iload 11
    //   2175: iadd
    //   2176: daload
    //   2177: dconst_0
    //   2178: dcmpl
    //   2179: ifeq +7 -> 2186
    //   2182: iconst_0
    //   2183: goto +4 -> 2187
    //   2186: iconst_1
    //   2187: ifeq +54 -> 2241
    //   2190: iload 25
    //   2192: ifeq +15 -> 2207
    //   2195: aload 7
    //   2197: aload 7
    //   2199: getfield 38	org/netlib/util/intW:val	I
    //   2202: iconst_1
    //   2203: iadd
    //   2204: putfield 38	org/netlib/util/intW:val	I
    //   2207: iconst_0
    //   2208: istore 43
    //   2210: iload 25
    //   2212: ifeq +14 -> 2226
    //   2215: iload 26
    //   2217: iconst_1
    //   2218: ixor
    //   2219: ifeq +7 -> 2226
    //   2222: iconst_1
    //   2223: goto +4 -> 2227
    //   2226: iconst_0
    //   2227: ifeq +11 -> 2238
    //   2230: aload 20
    //   2232: iload_3
    //   2233: iconst_2
    //   2234: iadd
    //   2235: putfield 38	org/netlib/util/intW:val	I
    //   2238: goto +92 -> 2330
    //   2241: iload 43
    //   2243: iconst_1
    //   2244: if_icmpeq +7 -> 2251
    //   2247: iconst_0
    //   2248: goto +4 -> 2252
    //   2251: iconst_1
    //   2252: ifeq +75 -> 2327
    //   2255: iload 25
    //   2257: ifne +12 -> 2269
    //   2260: iload 26
    //   2262: ifne +7 -> 2269
    //   2265: iconst_0
    //   2266: goto +4 -> 2270
    //   2269: iconst_1
    //   2270: istore 25
    //   2272: iload 25
    //   2274: istore 26
    //   2276: iload 25
    //   2278: ifeq +15 -> 2293
    //   2281: aload 7
    //   2283: aload 7
    //   2285: getfield 38	org/netlib/util/intW:val	I
    //   2288: iconst_2
    //   2289: iadd
    //   2290: putfield 38	org/netlib/util/intW:val	I
    //   2293: iconst_m1
    //   2294: istore 43
    //   2296: iload 25
    //   2298: ifeq +14 -> 2312
    //   2301: iload 28
    //   2303: iconst_1
    //   2304: ixor
    //   2305: ifeq +7 -> 2312
    //   2308: iconst_1
    //   2309: goto +4 -> 2313
    //   2312: iconst_0
    //   2313: ifeq +11 -> 2324
    //   2316: aload 20
    //   2318: iload_3
    //   2319: iconst_2
    //   2320: iadd
    //   2321: putfield 38	org/netlib/util/intW:val	I
    //   2324: goto +6 -> 2330
    //   2327: iconst_1
    //   2328: istore 43
    //   2330: iload 26
    //   2332: istore 28
    //   2334: iload 25
    //   2336: istore 26
    //   2338: iload 33
    //   2340: iconst_1
    //   2341: iadd
    //   2342: istore 33
    //   2344: iinc 66 -1
    //   2347: iload 66
    //   2349: ifgt -207 -> 2142
    //   2352: aload 15
    //   2354: iconst_1
    //   2355: iconst_1
    //   2356: isub
    //   2357: iload 16
    //   2359: iadd
    //   2360: iload 46
    //   2362: i2d
    //   2363: dastore
    //   2364: return
    //   2365: goto +0 -> 2365
    //   2368: astore 66
    //   2370: getstatic 181	java/lang/System:err	Ljava/io/PrintStream;
    //   2373: new 183	java/lang/StringBuffer
    //   2376: dup
    //   2377: ldc -71
    //   2379: invokespecial 188	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   2382: aload 66
    //   2384: invokevirtual 194	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   2387: invokevirtual 198	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2390: invokevirtual 201	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   2393: invokevirtual 206	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   2396: goto +31 -> 2427
    //   2399: astore 66
    //   2401: getstatic 181	java/lang/System:err	Ljava/io/PrintStream;
    //   2404: new 183	java/lang/StringBuffer
    //   2407: dup
    //   2408: ldc -71
    //   2410: invokespecial 188	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   2413: aload 66
    //   2415: invokevirtual 194	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   2418: invokevirtual 198	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2421: invokevirtual 201	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   2424: invokevirtual 206	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   2427: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2428	0	paramString1	String
    //   0	2428	1	paramString2	String
    //   0	2428	2	paramObject	Object
    //   0	2428	3	paramInt1	int
    //   0	2428	4	paramArrayOfDouble1	double[]
    //   0	2428	5	paramInt2	int
    //   0	2428	6	paramInt3	int
    //   0	2428	7	paramintW1	org.netlib.util.intW
    //   0	2428	8	paramArrayOfDouble2	double[]
    //   0	2428	9	paramInt4	int
    //   0	2428	10	paramArrayOfDouble3	double[]
    //   0	2428	11	paramInt5	int
    //   0	2428	12	paramArrayOfDouble4	double[]
    //   0	2428	13	paramInt6	int
    //   0	2428	14	paramInt7	int
    //   0	2428	15	paramArrayOfDouble5	double[]
    //   0	2428	16	paramInt8	int
    //   0	2428	17	paramInt9	int
    //   0	2428	18	paramArrayOfBoolean	boolean[]
    //   0	2428	19	paramInt10	int
    //   0	2428	20	paramintW2	org.netlib.util.intW
    //   1	2334	25	bool1	boolean
    //   4	2333	26	i	int
    //   7	636	27	j	int
    //   10	2323	28	k	int
    //   13	1373	29	m	int
    //   16	2069	30	bool2	boolean
    //   19	1891	31	bool3	boolean
    //   22	534	32	n	int
    //   25	2318	33	i1	int
    //   28	1540	34	i2	int
    //   31	1537	35	i3	int
    //   34	1336	36	i4	int
    //   44	1292	37	localintW1	org.netlib.util.intW
    //   54	2026	38	localintW2	org.netlib.util.intW
    //   64	2006	39	localintW3	org.netlib.util.intW
    //   74	1471	40	localintW4	org.netlib.util.intW
    //   84	1454	41	localintW5	org.netlib.util.intW
    //   87	1936	42	i5	int
    //   90	2239	43	i6	int
    //   93	943	44	i7	int
    //   96	1208	45	i8	int
    //   99	2262	46	i9	int
    //   102	476	47	i10	int
    //   105	1940	48	d1	double
    //   115	719	50	localdoubleW1	org.netlib.util.doubleW
    //   118	1925	52	d2	double
    //   121	597	54	d3	double
    //   131	1156	56	localdoubleW2	org.netlib.util.doubleW
    //   141	1148	58	localdoubleW3	org.netlib.util.doubleW
    //   151	1280	60	localdoubleW4	org.netlib.util.doubleW
    //   156	1151	62	arrayOfInt	int[]
    //   161	585	63	arrayOfDouble	double[]
    //   172	1971	65	localMethod	Method
    //   1204	1144	66	i11	int
    //   2368	15	66	localInvocationTargetException	InvocationTargetException
    //   2399	15	66	localIllegalAccessException	IllegalAccessException
    // Exception table:
    //   from	to	target	type
    //   174	2365	2368	java/lang/reflect/InvocationTargetException
    //   174	2365	2399	java/lang/IllegalAccessException
  }
  
  private static boolean select_methcall(Method paramMethod, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2)
    throws InvocationTargetException, IllegalAccessException
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = new Double(paramArrayOfDouble1[paramInt1]);
    arrayOfObject[1] = new Double(paramArrayOfDouble2[paramInt2]);
    return ((Boolean)paramMethod.invoke(null, arrayOfObject)).booleanValue();
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgees.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */