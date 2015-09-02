/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CJFormat
/*     */ {
/*     */   private int width;
/*     */   private int precision;
/*     */   private String pre;
/*     */   private String post;
/*     */   private boolean leading_zeroes;
/*     */   private boolean show_plus;
/*     */   private boolean alternate;
/*     */   private boolean show_space;
/*     */   private boolean left_align;
/*     */   private char fmt;
/*     */   
/*     */   public CJFormat(String paramString)
/*     */   {
/*  86 */     this.width = 0;
/*  87 */     this.precision = -1;
/*  88 */     this.pre = "";
/*  89 */     this.post = "";
/*  90 */     this.leading_zeroes = false;
/*  91 */     this.show_plus = false;
/*  92 */     this.alternate = false;
/*  93 */     this.show_space = false;
/*  94 */     this.left_align = false;
/*  95 */     this.fmt = ' ';
/*     */     
/*  97 */     int i = 0;
/*  98 */     int j = paramString.length();
/*  99 */     int k = 0;
/*     */     
/*     */ 
/* 102 */     int m = 0;
/*     */     
/* 104 */     while (k == 0) {
/* 105 */       if (m >= j) { k = 5;
/* 106 */       } else if (paramString.charAt(m) == '%') {
/* 107 */         if (m < j - 1) {
/* 108 */           if (paramString.charAt(m + 1) == '%') {
/* 109 */             this.pre += '%';
/* 110 */             m++;
/*     */           }
/*     */           else {
/* 113 */             k = 1;
/*     */           }
/* 115 */         } else throw new IllegalArgumentException();
/*     */       }
/*     */       else
/* 118 */         this.pre += paramString.charAt(m);
/* 119 */       m++;
/*     */     }
/* 121 */     while (k == 1) {
/* 122 */       if (m >= j) { k = 5;
/* 123 */       } else if (paramString.charAt(m) == ' ') { this.show_space = true;
/* 124 */       } else if (paramString.charAt(m) == '-') { this.left_align = true;
/* 125 */       } else if (paramString.charAt(m) == '+') { this.show_plus = true;
/* 126 */       } else if (paramString.charAt(m) == '0') { this.leading_zeroes = true;
/* 127 */       } else if (paramString.charAt(m) == '#') { this.alternate = true;
/* 128 */       } else { k = 2;m--; }
/* 129 */       m++;
/*     */     }
/* 131 */     while (k == 2)
/* 132 */       if (m >= j) { k = 5;
/* 133 */       } else if (('0' <= paramString.charAt(m)) && (paramString.charAt(m) <= '9')) {
/* 134 */         this.width = (this.width * 10 + paramString.charAt(m) - 48);
/* 135 */         m++;
/*     */       }
/* 137 */       else if (paramString.charAt(m) == '.') {
/* 138 */         k = 3;
/* 139 */         this.precision = 0;
/* 140 */         m++;
/*     */       }
/*     */       else {
/* 143 */         k = 4;
/*     */       }
/* 145 */     while (k == 3)
/* 146 */       if (m >= j) { k = 5;
/* 147 */       } else if (('0' <= paramString.charAt(m)) && (paramString.charAt(m) <= '9')) {
/* 148 */         this.precision = (this.precision * 10 + paramString.charAt(m) - 48);
/* 149 */         m++;
/*     */       }
/*     */       else {
/* 152 */         k = 4;
/*     */       }
/* 154 */     if (k == 4) {
/* 155 */       if (m >= j) k = 5; else
/* 156 */         this.fmt = paramString.charAt(m);
/* 157 */       m++;
/*     */     }
/* 159 */     if (m < j) {
/* 160 */       this.post = paramString.substring(m, j);
/*     */     }
/*     */   }
/*     */   
/*     */   public CJFormat() {
/* 165 */     this.width = 0;
/* 166 */     this.precision = -1;
/* 167 */     this.pre = "";
/* 168 */     this.post = "";
/* 169 */     this.leading_zeroes = false;
/* 170 */     this.show_plus = false;
/* 171 */     this.alternate = false;
/* 172 */     this.show_space = false;
/* 173 */     this.left_align = false;
/* 174 */     this.fmt = ' ';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void print(PrintStream paramPrintStream, String paramString, double paramDouble)
/*     */   {
/* 186 */     paramPrintStream.print(new CJFormat(paramString).form(paramDouble));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void print(PrintStream paramPrintStream, String paramString, long paramLong)
/*     */   {
/* 196 */     paramPrintStream.print(new CJFormat(paramString).form(paramLong));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void print(PrintStream paramPrintStream, String paramString, char paramChar)
/*     */   {
/* 207 */     paramPrintStream.print(new CJFormat(paramString).form(paramChar));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void print(PrintStream paramPrintStream, String paramString1, String paramString2)
/*     */   {
/* 217 */     paramPrintStream.print(new CJFormat(paramString1).form(paramString2));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int atoi(String paramString)
/*     */   {
/* 227 */     return (int)atol(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static long atol(String paramString)
/*     */   {
/* 237 */     int i = 0;
/*     */     
/* 239 */     while ((i < paramString.length()) && (Character.isSpace(paramString.charAt(i)))) i++;
/* 240 */     if ((i < paramString.length()) && (paramString.charAt(i) == '0')) {
/* 241 */       if ((i + 1 < paramString.length()) && ((paramString.charAt(i + 1) == 'x') || (paramString.charAt(i + 1) == 'X')))
/* 242 */         return parseLong(paramString.substring(i + 2), 16);
/* 243 */       return parseLong(paramString, 8);
/*     */     }
/* 245 */     return parseLong(paramString, 10);
/*     */   }
/*     */   
/*     */   private static long parseLong(String paramString, int paramInt) {
/* 249 */     int i = 0;
/* 250 */     int j = 1;
/* 251 */     long l = 0L;
/*     */     
/* 253 */     while ((i < paramString.length()) && (Character.isSpace(paramString.charAt(i)))) i++;
/* 254 */     if ((i < paramString.length()) && (paramString.charAt(i) == '-')) { j = -1;i++;
/* 255 */     } else if ((i < paramString.length()) && (paramString.charAt(i) == '+')) { i++; }
/* 256 */     while (i < paramString.length()) {
/* 257 */       int k = paramString.charAt(i);
/* 258 */       if ((48 <= k) && (k < 48 + paramInt)) {
/* 259 */         l = l * paramInt + k - 48L;
/* 260 */       } else if ((65 <= k) && (k < 65 + paramInt - 10)) {
/* 261 */         l = l * paramInt + k - 65L + 10L;
/* 262 */       } else if ((97 <= k) && (k < 97 + paramInt - 10)) {
/* 263 */         l = l * paramInt + k - 97L + 10L;
/*     */       } else
/* 265 */         return l * j;
/* 266 */       i++;
/*     */     }
/* 268 */     return l * j;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double atof(String paramString)
/*     */   {
/* 277 */     int i = 0;
/* 278 */     int j = 1;
/* 279 */     double d1 = 0.0D;
/* 280 */     double d2 = 0.0D;
/* 281 */     double d3 = 1.0D;
/* 282 */     int k = 0;
/*     */     
/* 284 */     while ((i < paramString.length()) && (Character.isSpace(paramString.charAt(i)))) i++;
/* 285 */     if ((i < paramString.length()) && (paramString.charAt(i) == '-')) { j = -1;i++;
/* 286 */     } else if ((i < paramString.length()) && (paramString.charAt(i) == '+')) { i++; }
/* 287 */     while (i < paramString.length()) {
/* 288 */       int m = paramString.charAt(i);
/* 289 */       if ((48 <= m) && (m <= 57)) {
/* 290 */         if (k == 0) {
/* 291 */           d1 = d1 * 10.0D + m - 48.0D;
/* 292 */         } else if (k == 1) {
/* 293 */           d3 /= 10.0D;
/* 294 */           d1 += d3 * (m - 48);
/*     */         }
/*     */       }
/* 297 */       else if (m == 46) {
/* 298 */         if (k == 0) k = 1; else
/* 299 */           return j * d1;
/*     */       } else {
/* 301 */         if ((m == 101) || (m == 69)) {
/* 302 */           long l = (int)parseLong(paramString.substring(i + 1), 10);
/* 303 */           return j * d1 * Math.pow(10.0D, l);
/*     */         }
/* 305 */         return j * d1; }
/* 306 */       i++;
/*     */     }
/* 308 */     return j * d1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String form(double paramDouble)
/*     */   {
/* 320 */     if (this.precision < 0) this.precision = 6;
/* 321 */     int i = 1;
/* 322 */     if (paramDouble < 0.0D) { paramDouble = -paramDouble;i = -1; }
/* 323 */     String str; if (this.fmt == 'f') {
/* 324 */       str = fixed_format(paramDouble);
/* 325 */     } else if ((this.fmt == 'e') || (this.fmt == 'E') || (this.fmt == 'g') || (this.fmt == 'G'))
/* 326 */       str = exp_format(paramDouble); else {
/* 327 */       throw new IllegalArgumentException();
/*     */     }
/* 329 */     return pad(sign(i, str));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String form(long paramLong)
/*     */   {
/* 340 */     int i = 0;
/* 341 */     String str; if ((this.fmt == 'd') || (this.fmt == 'i')) {
/* 342 */       i = 1;
/* 343 */       if (paramLong < 0L) { paramLong = -paramLong;i = -1; }
/* 344 */       str = "" + paramLong;
/*     */     }
/* 346 */     else if (this.fmt == 'o') {
/* 347 */       str = convert(paramLong, 3, 7, "01234567");
/* 348 */     } else if (this.fmt == 'x') {
/* 349 */       str = convert(paramLong, 4, 15, "0123456789abcdef");
/* 350 */     } else if (this.fmt == 'X') {
/* 351 */       str = convert(paramLong, 4, 15, "0123456789ABCDEF");
/* 352 */     } else { throw new IllegalArgumentException();
/*     */     }
/* 354 */     return pad(sign(i, str));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String form(char paramChar)
/*     */   {
/* 364 */     if (this.fmt != 'c') {
/* 365 */       throw new IllegalArgumentException();
/*     */     }
/* 367 */     String str = "" + paramChar;
/* 368 */     return pad(str);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String form(String paramString)
/*     */   {
/* 378 */     if (this.fmt != 's')
/* 379 */       throw new IllegalArgumentException();
/* 380 */     if (this.precision >= 0) paramString = paramString.substring(0, this.precision);
/* 381 */     return pad(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/* 390 */     double d1 = 1.23456789012D;
/* 391 */     double d2 = 123.0D;
/* 392 */     double d3 = 1.2345E30D;
/* 393 */     double d4 = 1.02D;
/* 394 */     double d5 = 1.234E-5D;
/* 395 */     int i = 51966;
/* 396 */     print(System.out, "x = |%f|\n", d1);
/* 397 */     print(System.out, "u = |%20f|\n", d5);
/* 398 */     print(System.out, "x = |% .5f|\n", d1);
/* 399 */     print(System.out, "w = |%20.5f|\n", d4);
/* 400 */     print(System.out, "x = |%020.5f|\n", d1);
/* 401 */     print(System.out, "x = |%+20.5f|\n", d1);
/* 402 */     print(System.out, "x = |%+020.5f|\n", d1);
/* 403 */     print(System.out, "x = |% 020.5f|\n", d1);
/* 404 */     print(System.out, "y = |%#+20.5f|\n", d2);
/* 405 */     print(System.out, "y = |%-+20.5f|\n", d2);
/* 406 */     print(System.out, "z = |%20.5f|\n", d3);
/*     */     
/* 408 */     print(System.out, "x = |%e|\n", d1);
/* 409 */     print(System.out, "u = |%20e|\n", d5);
/* 410 */     print(System.out, "x = |% .5e|\n", d1);
/* 411 */     print(System.out, "w = |%20.5e|\n", d4);
/* 412 */     print(System.out, "x = |%020.5e|\n", d1);
/* 413 */     print(System.out, "x = |%+20.5e|\n", d1);
/* 414 */     print(System.out, "x = |%+020.5e|\n", d1);
/* 415 */     print(System.out, "x = |% 020.5e|\n", d1);
/* 416 */     print(System.out, "y = |%#+20.5e|\n", d2);
/* 417 */     print(System.out, "y = |%-+20.5e|\n", d2);
/*     */     
/* 419 */     print(System.out, "x = |%g|\n", d1);
/* 420 */     print(System.out, "z = |%g|\n", d3);
/* 421 */     print(System.out, "w = |%g|\n", d4);
/* 422 */     print(System.out, "u = |%g|\n", d5);
/* 423 */     print(System.out, "y = |%.2g|\n", d2);
/* 424 */     print(System.out, "y = |%#.2g|\n", d2);
/*     */     
/* 426 */     print(System.out, "d = |%d|\n", i);
/* 427 */     print(System.out, "d = |%20d|\n", i);
/* 428 */     print(System.out, "d = |%020d|\n", i);
/* 429 */     print(System.out, "d = |%+20d|\n", i);
/* 430 */     print(System.out, "d = |% 020d|\n", i);
/* 431 */     print(System.out, "d = |%-20d|\n", i);
/* 432 */     print(System.out, "d = |%20.8d|\n", i);
/* 433 */     print(System.out, "d = |%x|\n", i);
/* 434 */     print(System.out, "d = |%20X|\n", i);
/* 435 */     print(System.out, "d = |%#20x|\n", i);
/* 436 */     print(System.out, "d = |%020X|\n", i);
/* 437 */     print(System.out, "d = |%20.8x|\n", i);
/* 438 */     print(System.out, "d = |%o|\n", i);
/* 439 */     print(System.out, "d = |%020o|\n", i);
/* 440 */     print(System.out, "d = |%#20o|\n", i);
/* 441 */     print(System.out, "d = |%#020o|\n", i);
/* 442 */     print(System.out, "d = |%20.12o|\n", i);
/*     */     
/* 444 */     print(System.out, "s = |%-20s|\n", "Hello");
/* 445 */     print(System.out, "s = |%-20c|\n", '!');
/*     */   }
/*     */   
/*     */   private static String repeat(char paramChar, int paramInt)
/*     */   {
/* 450 */     if (paramInt <= 0) return "";
/* 451 */     StringBuffer localStringBuffer = new StringBuffer(paramInt);
/* 452 */     for (int i = 0; i < paramInt; i++) localStringBuffer.append(paramChar);
/* 453 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   private static String convert(long paramLong, int paramInt1, int paramInt2, String paramString) {
/* 457 */     if (paramLong == 0L) return "0";
/* 458 */     String str = "";
/* 459 */     while (paramLong != 0L) {
/* 460 */       str = paramString.charAt((int)(paramLong & paramInt2)) + str;
/* 461 */       paramLong >>>= paramInt1;
/*     */     }
/* 463 */     return str;
/*     */   }
/*     */   
/*     */   private String pad(String paramString) {
/* 467 */     String str = repeat(' ', this.width - paramString.length());
/* 468 */     if (this.left_align) return this.pre + paramString + str + this.post;
/* 469 */     return this.pre + str + paramString + this.post;
/*     */   }
/*     */   
/*     */   private String sign(int paramInt, String paramString) {
/* 473 */     String str = "";
/* 474 */     if (paramInt < 0) { str = "-";
/* 475 */     } else if (paramInt > 0) {
/* 476 */       if (this.show_plus) { str = "+";
/* 477 */       } else if (this.show_space) { str = " ";
/*     */       }
/*     */     }
/* 480 */     else if ((this.fmt == 'o') && (this.alternate) && (paramString.length() > 0) && (paramString.charAt(0) != '0')) { str = "0";
/* 481 */     } else if ((this.fmt == 'x') && (this.alternate)) { str = "0x";
/* 482 */     } else if ((this.fmt == 'X') && (this.alternate)) { str = "0X";
/*     */     }
/* 484 */     int i = 0;
/* 485 */     if (this.leading_zeroes) {
/* 486 */       i = this.width;
/* 487 */     } else if (((this.fmt == 'd') || (this.fmt == 'i') || (this.fmt == 'x') || (this.fmt == 'X') || (this.fmt == 'o')) && (this.precision > 0)) {
/* 488 */       i = this.precision;
/*     */     }
/* 490 */     return str + repeat('0', i - str.length() - paramString.length()) + paramString;
/*     */   }
/*     */   
/*     */   private String fixed_format(double paramDouble)
/*     */   {
/* 495 */     String str = "";
/*     */     
/* 497 */     if (paramDouble > 9.223372036854776E18D) { return exp_format(paramDouble);
/*     */     }
/* 499 */     long l = (this.precision == 0 ? paramDouble + 0.5D : paramDouble);
/* 500 */     str = str + l;
/*     */     
/* 502 */     double d = paramDouble - l;
/* 503 */     if ((d >= 1.0D) || (d < 0.0D)) { return exp_format(paramDouble);
/*     */     }
/* 505 */     return str + frac_part(d);
/*     */   }
/*     */   
/*     */   private String frac_part(double paramDouble)
/*     */   {
/* 510 */     String str1 = "";
/* 511 */     if (this.precision > 0) {
/* 512 */       double d = 1.0D;
/* 513 */       String str2 = "";
/* 514 */       for (int j = 1; (j <= this.precision) && (d <= 9.223372036854776E18D); j++) {
/* 515 */         d *= 10.0D;
/* 516 */         str2 = str2 + "0";
/*     */       }
/* 518 */       long l = (d * paramDouble + 0.5D);
/*     */       
/* 520 */       str1 = str2 + l;
/* 521 */       str1 = str1.substring(str1.length() - this.precision, str1.length());
/*     */     }
/*     */     
/*     */ 
/* 525 */     if ((this.precision > 0) || (this.alternate)) str1 = "." + str1;
/* 526 */     if (((this.fmt == 'G') || (this.fmt == 'g')) && (!this.alternate))
/*     */     {
/* 528 */       int i = str1.length() - 1;
/* 529 */       while ((i >= 0) && (str1.charAt(i) == '0')) i--;
/* 530 */       if ((i >= 0) && (str1.charAt(i) == '.')) i--;
/* 531 */       str1 = str1.substring(0, i + 1);
/*     */     }
/* 533 */     return str1;
/*     */   }
/*     */   
/*     */   private String exp_format(double paramDouble) {
/* 537 */     String str1 = "";
/* 538 */     int i = 0;
/* 539 */     double d1 = paramDouble;
/* 540 */     double d2 = 1.0D;
/*     */     
/* 542 */     if (paramDouble == NaN.0D)
/* 543 */       return "NaN";
/* 544 */     if (paramDouble == Double.NEGATIVE_INFINITY)
/* 545 */       return "-Inf";
/* 546 */     if (paramDouble == Double.POSITIVE_INFINITY)
/* 547 */       return "Inf";
/* 548 */     if (paramDouble == 0.0D) {
/* 549 */       if ((this.fmt == 'e') || (this.fmt == 'E') || (this.fmt == 'g') || (this.fmt == 'G')) {
/* 550 */         return "0.000E+00";
/*     */       }
/* 552 */       return "0.000";
/*     */     }
/*     */     
/* 555 */     while (d1 > 10.0D) {
/* 556 */       i++;
/* 557 */       d2 /= 10.0D;
/* 558 */       d1 /= 10.0D;
/*     */     }
/* 560 */     while (d1 < 1.0D) {
/* 561 */       i--;
/* 562 */       d2 *= 10.0D;
/* 563 */       d1 *= 10.0D;
/*     */     }
/* 565 */     if (((this.fmt == 'g') || (this.fmt == 'G')) && (i >= -4) && (i < this.precision)) {
/* 566 */       return fixed_format(paramDouble);
/*     */     }
/* 568 */     paramDouble *= d2;
/* 569 */     str1 = str1 + fixed_format(paramDouble);
/*     */     
/* 571 */     if ((this.fmt == 'e') || (this.fmt == 'g')) {
/* 572 */       str1 = str1 + "e";
/*     */     } else {
/* 574 */       str1 = str1 + "E";
/*     */     }
/* 576 */     String str2 = "000";
/* 577 */     if (i >= 0) {
/* 578 */       str1 = str1 + "+";
/* 579 */       str2 = str2 + i;
/*     */     }
/*     */     else {
/* 582 */       str1 = str1 + "-";
/* 583 */       str2 = str2 + -i;
/*     */     }
/*     */     
/* 586 */     return str1 + str2.substring(str2.length() - 3, str2.length());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWidth(int paramInt)
/*     */   {
/* 603 */     this.width = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPrecision(int paramInt)
/*     */   {
/* 609 */     this.precision = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPre(String paramString)
/*     */   {
/* 615 */     this.pre = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPost(String paramString)
/*     */   {
/* 621 */     this.post = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLeadingZeroes(boolean paramBoolean)
/*     */   {
/* 627 */     this.leading_zeroes = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setShowPlus(boolean paramBoolean)
/*     */   {
/* 633 */     this.show_plus = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAlternate(boolean paramBoolean)
/*     */   {
/* 639 */     this.alternate = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setShowSpace(boolean paramBoolean)
/*     */   {
/* 645 */     this.show_space = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLeftAlign(boolean paramBoolean)
/*     */   {
/* 651 */     this.left_align = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFmt(char paramChar)
/*     */   {
/* 657 */     this.fmt = paramChar;
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/CJFormat.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */