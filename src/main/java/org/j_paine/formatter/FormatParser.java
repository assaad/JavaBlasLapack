/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ class FormatParser implements FormatParserConstants
/*     */ {
/*     */   public static final int Integer() throws ParseException {
/*   8 */     Token localToken = jj_consume_token(2);
/*   9 */     return Integer.valueOf(localToken.image).intValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static final FormatElement FormatIOElementFloat()
/*     */     throws ParseException
/*     */   {
/*     */     int k;
/*     */     
/*     */     int j;
/*     */     
/*  21 */     int i = j = k = -1;
/*  22 */     Object localObject; switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 8: 
/*  24 */       jj_consume_token(8);
/*  25 */       i = Integer();
/*  26 */       jj_consume_token(13);
/*  27 */       j = Integer();
/*  28 */       localObject = new FormatF(i, j);
/*  29 */       break;
/*     */     case 9: 
/*  31 */       jj_consume_token(9);
/*  32 */       i = Integer();
/*  33 */       jj_consume_token(13);
/*  34 */       j = Integer();
/*  35 */       localObject = new FormatE(i, j);
/*  36 */       break;
/*     */     case 10: 
/*  38 */       jj_consume_token(10);
/*  39 */       i = Integer();
/*  40 */       jj_consume_token(13);
/*  41 */       j = Integer();
/*  42 */       localObject = new FormatE(i, j);
/*  43 */       break;
/*     */     case 11: 
/*  45 */       jj_consume_token(11);
/*  46 */       i = Integer();
/*  47 */       jj_consume_token(13);
/*  48 */       j = Integer();
/*  49 */       localObject = new FormatE(i, j);
/*  50 */       break;
/*     */     default: 
/*  52 */       jj_la1[0] = jj_gen;
/*  53 */       jj_consume_token(-1);
/*  54 */       throw new ParseException();
/*     */     }
/*  56 */     return (FormatElement)localObject;
/*     */   }
/*     */   
/*     */   public static final FormatElement FormatIOElementNonFloat() throws ParseException
/*     */   {
/*     */     int k;
/*     */     int j;
/*  63 */     int i = j = k = -1;
/*  64 */     Object localObject; switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 4: 
/*  66 */       jj_consume_token(4);
/*  67 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */       case 2: 
/*  69 */         i = Integer();
/*  70 */         break;
/*     */       default: 
/*  72 */         jj_la1[1] = jj_gen;
/*     */       }
/*     */       
/*  75 */       localObject = new FormatA(i);
/*  76 */       break;
/*     */     case 7: 
/*  78 */       jj_consume_token(7);
/*  79 */       i = Integer();
/*  80 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */       case 13: 
/*  82 */         jj_consume_token(13);
/*  83 */         k = Integer();
/*  84 */         break;
/*     */       default: 
/*  86 */         jj_la1[2] = jj_gen;
/*     */       }
/*     */       
/*  89 */       localObject = new FormatI(i);
/*  90 */       break;
/*     */     case 12: 
/*  92 */       jj_consume_token(12);
/*  93 */       i = Integer();
/*  94 */       localObject = new FormatL(i);
/*  95 */       break;
/*     */     default: 
/*  97 */       jj_la1[3] = jj_gen;
/*  98 */       jj_consume_token(-1);
/*  99 */       throw new ParseException();
/*     */     }
/* 101 */     return (FormatElement)localObject;
/*     */   }
/*     */   
/*     */ 
/*     */   public static final FormatElement FormatNonIOElement()
/*     */     throws ParseException
/*     */   {
/* 108 */     jj_consume_token(6);
/* 109 */     return new FormatX();
/*     */   }
/*     */   
/*     */ 
/*     */   public static final FormatElement FormatElement()
/*     */     throws ParseException
/*     */   {
/*     */     FormatElement localFormatElement;
/* 117 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 8: 
/*     */     case 9: 
/*     */     case 10: 
/*     */     case 11: 
/* 122 */       localFormatElement = FormatIOElementFloat();
/* 123 */       break;
/*     */     case 4: 
/*     */     case 7: 
/*     */     case 12: 
/* 127 */       localFormatElement = FormatIOElementNonFloat();
/* 128 */       break;
/*     */     case 6: 
/* 130 */       localFormatElement = FormatNonIOElement();
/* 131 */       break;
/*     */     case 5: 
/* 133 */       localFormatElement = FormatScale();
/* 134 */       break;
/*     */     default: 
/* 136 */       jj_la1[4] = jj_gen;
/* 137 */       jj_consume_token(-1);
/* 138 */       throw new ParseException();
/*     */     }
/* 140 */     return localFormatElement;
/*     */   }
/*     */   
/*     */   public static final FormatElement FormatScale() throws ParseException
/*     */   {
/* 145 */     FormatElement localFormatElement = null;
/* 146 */     int i = 1;
/* 147 */     jj_consume_token(5);
/* 148 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 2: 
/*     */     case 8: 
/*     */     case 9: 
/*     */     case 10: 
/*     */     case 11: 
/* 154 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */       case 2: 
/* 156 */         i = Integer();
/* 157 */         break;
/*     */       default: 
/* 159 */         jj_la1[5] = jj_gen;
/*     */       }
/*     */       
/* 162 */       localFormatElement = FormatIOElementFloat();
/* 163 */       break;
/*     */     case 3: case 4: case 5: case 6: case 7: default: 
/* 165 */       jj_la1[6] = jj_gen;
/*     */     }
/*     */     
/* 168 */     return new FormatP(i, localFormatElement);
/*     */   }
/*     */   
/*     */   public static final FormatSlash FormatSlash() throws ParseException
/*     */   {
/* 173 */     jj_consume_token(14);
/* 174 */     return new FormatSlash();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final FormatString FormatString()
/*     */     throws ParseException
/*     */   {
/* 185 */     Token localToken = jj_consume_token(3);
/* 186 */     String str = localToken.image;
/* 187 */     str = str.substring(1, str.length() - 1);
/* 188 */     return new FormatString(str);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static final void OptionalFormatSlashesOrStrings(Format paramFormat)
/*     */     throws ParseException
/*     */   {
/*     */     for (;;)
/*     */     {
/* 198 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*     */       {
/*     */       case 3: 
/*     */       case 14: 
/*     */         break;
/*     */       default: 
/* 204 */         jj_la1[7] = jj_gen;
/* 205 */         break; }
/*     */       Object localObject;
/* 207 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */       case 14: 
/* 209 */         localObject = FormatSlash();
/* 210 */         break;
/*     */       case 3: 
/* 212 */         localObject = FormatString();
/* 213 */         break;
/*     */       default: 
/* 215 */         jj_la1[8] = jj_gen;
/* 216 */         jj_consume_token(-1);
/* 217 */         throw new ParseException();
/*     */       }
/* 219 */       paramFormat.addElement((FormatUniv)localObject);
/*     */     }
/*     */   }
/*     */   
/*     */   public static final FormatRepeatedItem FormatRepeatedItem() throws ParseException {
/* 224 */     int i = 1;
/*     */     
/* 226 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 2: 
/* 228 */       i = Integer();
/* 229 */       break;
/*     */     default: 
/* 231 */       jj_la1[9] = jj_gen;
/*     */     }
/*     */     Object localObject;
/* 234 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 15: 
/* 236 */       jj_consume_token(15);
/* 237 */       localObject = Format();
/* 238 */       jj_consume_token(16);
/* 239 */       break;
/*     */     case 4: 
/*     */     case 5: 
/*     */     case 6: 
/*     */     case 7: 
/*     */     case 8: 
/*     */     case 9: 
/*     */     case 10: 
/*     */     case 11: 
/*     */     case 12: 
/* 249 */       localObject = FormatElement();
/* 250 */       break;
/*     */     case 13: case 14: default: 
/* 252 */       jj_la1[10] = jj_gen;
/* 253 */       jj_consume_token(-1);
/* 254 */       throw new ParseException();
/*     */     }
/*     */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */     if ((localObject instanceof FormatP))
/*     */     {
/*     */ 
/* 265 */       FormatRepeatedItem localFormatRepeatedItem = ((FormatP)localObject).getRepeatedItem();
/*     */       
/* 267 */       if (localFormatRepeatedItem != null) {
/* 268 */         return localFormatRepeatedItem;
/*     */       }
/* 270 */       return new FormatRepeatedItem(i, (FormatUniv)localObject);
/*     */     }
/*     */     
/* 273 */     return new FormatRepeatedItem(i, (FormatUniv)localObject);
/*     */   }
/*     */   
/*     */   public static final void FormatGroup(Format paramFormat)
/*     */     throws ParseException
/*     */   {
/* 279 */     OptionalFormatSlashesOrStrings(paramFormat);
/* 280 */     switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
/*     */     case 2: 
/*     */     case 4: 
/*     */     case 5: 
/*     */     case 6: 
/*     */     case 7: 
/*     */     case 8: 
/*     */     case 9: 
/*     */     case 10: 
/*     */     case 11: 
/*     */     case 12: 
/*     */     case 15: 
/* 292 */       FormatRepeatedItem localFormatRepeatedItem = FormatRepeatedItem();
/* 293 */       if (localFormatRepeatedItem != null) paramFormat.addElement(localFormatRepeatedItem);
/* 294 */       OptionalFormatSlashesOrStrings(paramFormat);
/* 295 */       break;
/*     */     case 3: case 13: case 14: default: 
/* 297 */       jj_la1[11] = jj_gen;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final Format Format()
/*     */     throws ParseException
/*     */   {
/* 311 */     Format localFormat = new Format();
/* 312 */     FormatGroup(localFormat);
/*     */     for (;;)
/*     */     {
/* 315 */       switch (jj_ntk == -1 ? jj_ntk() : jj_ntk)
/*     */       {
/*     */       case 17: 
/*     */         break;
/*     */       default: 
/* 320 */         jj_la1[12] = jj_gen;
/* 321 */         break;
/*     */       }
/* 323 */       jj_consume_token(17);
/* 324 */       FormatGroup(localFormat);
/*     */     }
/* 326 */     return localFormat;
/*     */   }
/*     */   
/*     */ 
/* 330 */   private static boolean jj_initialized_once = false;
/*     */   public static FormatParserTokenManager token_source;
/*     */   static SimpleCharStream jj_input_stream;
/*     */   public static Token token;
/*     */   public static Token jj_nt;
/*     */   private static int jj_ntk;
/* 336 */   private static int jj_gen; private static final int[] jj_la1 = new int[13];
/*     */   private static int[] jj_la1_0;
/*     */   
/* 339 */   static { jj_la1_0(); }
/*     */   
/*     */   private static void jj_la1_0() {
/* 342 */     jj_la1_0 = new int[] { 3840, 4, 8192, 4240, 8176, 4, 3844, 16392, 16392, 4, 40944, 40948, 131072 };
/*     */   }
/*     */   
/*     */ 
/* 346 */   public FormatParser(java.io.InputStream paramInputStream) { this(paramInputStream, null); }
/*     */   
/*     */   public FormatParser(java.io.InputStream paramInputStream, String paramString) {
/* 349 */     if (jj_initialized_once) {
/* 350 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 351 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 352 */       System.out.println("       during parser generation.");
/* 353 */       throw new Error();
/*     */     }
/* 355 */     jj_initialized_once = true;
/* 356 */     try { jj_input_stream = new SimpleCharStream(paramInputStream, paramString, 1, 1); } catch (java.io.UnsupportedEncodingException localUnsupportedEncodingException) { throw new RuntimeException(localUnsupportedEncodingException); }
/* 357 */     token_source = new FormatParserTokenManager(jj_input_stream);
/* 358 */     token = new Token();
/* 359 */     jj_ntk = -1;
/* 360 */     jj_gen = 0;
/* 361 */     for (int i = 0; i < 13; i++) { jj_la1[i] = -1;
/*     */     }
/*     */   }
/*     */   
/* 365 */   public static void ReInit(java.io.InputStream paramInputStream) { ReInit(paramInputStream, null); }
/*     */   
/*     */   public static void ReInit(java.io.InputStream paramInputStream, String paramString) {
/* 368 */     try { jj_input_stream.ReInit(paramInputStream, paramString, 1, 1); } catch (java.io.UnsupportedEncodingException localUnsupportedEncodingException) { throw new RuntimeException(localUnsupportedEncodingException); }
/* 369 */     FormatParserTokenManager.ReInit(jj_input_stream);
/* 370 */     token = new Token();
/* 371 */     jj_ntk = -1;
/* 372 */     jj_gen = 0;
/* 373 */     for (int i = 0; i < 13; i++) jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public FormatParser(java.io.Reader paramReader) {
/* 377 */     if (jj_initialized_once) {
/* 378 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 379 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 380 */       System.out.println("       during parser generation.");
/* 381 */       throw new Error();
/*     */     }
/* 383 */     jj_initialized_once = true;
/* 384 */     jj_input_stream = new SimpleCharStream(paramReader, 1, 1);
/* 385 */     token_source = new FormatParserTokenManager(jj_input_stream);
/* 386 */     token = new Token();
/* 387 */     jj_ntk = -1;
/* 388 */     jj_gen = 0;
/* 389 */     for (int i = 0; i < 13; i++) jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public static void ReInit(java.io.Reader paramReader) {
/* 393 */     jj_input_stream.ReInit(paramReader, 1, 1);
/* 394 */     FormatParserTokenManager.ReInit(jj_input_stream);
/* 395 */     token = new Token();
/* 396 */     jj_ntk = -1;
/* 397 */     jj_gen = 0;
/* 398 */     for (int i = 0; i < 13; i++) jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public FormatParser(FormatParserTokenManager paramFormatParserTokenManager) {
/* 402 */     if (jj_initialized_once) {
/* 403 */       System.out.println("ERROR: Second call to constructor of static parser.  You must");
/* 404 */       System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
/* 405 */       System.out.println("       during parser generation.");
/* 406 */       throw new Error();
/*     */     }
/* 408 */     jj_initialized_once = true;
/* 409 */     token_source = paramFormatParserTokenManager;
/* 410 */     token = new Token();
/* 411 */     jj_ntk = -1;
/* 412 */     jj_gen = 0;
/* 413 */     for (int i = 0; i < 13; i++) jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public void ReInit(FormatParserTokenManager paramFormatParserTokenManager) {
/* 417 */     token_source = paramFormatParserTokenManager;
/* 418 */     token = new Token();
/* 419 */     jj_ntk = -1;
/* 420 */     jj_gen = 0;
/* 421 */     for (int i = 0; i < 13; i++) jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   private static final Token jj_consume_token(int paramInt) throws ParseException {
/*     */     Token localToken;
/* 426 */     if ((localToken = token).next != null) token = token.next; else
/* 427 */       token = token.next = FormatParserTokenManager.getNextToken();
/* 428 */     jj_ntk = -1;
/* 429 */     if (token.kind == paramInt) {
/* 430 */       jj_gen += 1;
/* 431 */       return token;
/*     */     }
/* 433 */     token = localToken;
/* 434 */     jj_kind = paramInt;
/* 435 */     throw generateParseException();
/*     */   }
/*     */   
/*     */   public static final Token getNextToken() {
/* 439 */     if (token.next != null) token = token.next; else
/* 440 */       token = token.next = FormatParserTokenManager.getNextToken();
/* 441 */     jj_ntk = -1;
/* 442 */     jj_gen += 1;
/* 443 */     return token;
/*     */   }
/*     */   
/*     */   public static final Token getToken(int paramInt) {
/* 447 */     Token localToken = token;
/* 448 */     for (int i = 0; i < paramInt; i++) {
/* 449 */       if (localToken.next != null) localToken = localToken.next; else
/* 450 */         localToken = localToken.next = FormatParserTokenManager.getNextToken();
/*     */     }
/* 452 */     return localToken;
/*     */   }
/*     */   
/*     */   private static final int jj_ntk() {
/* 456 */     if ((jj_nt = token.next) == null) {
/* 457 */       return jj_ntk = (token.next = FormatParserTokenManager.getNextToken()).kind;
/*     */     }
/* 459 */     return jj_ntk = jj_nt.kind;
/*     */   }
/*     */   
/* 462 */   private static java.util.Vector jj_expentries = new java.util.Vector();
/*     */   private static int[] jj_expentry;
/* 464 */   private static int jj_kind = -1;
/*     */   
/*     */   public static ParseException generateParseException() {
/* 467 */     jj_expentries.removeAllElements();
/* 468 */     boolean[] arrayOfBoolean = new boolean[18];
/* 469 */     for (int i = 0; i < 18; i++) {
/* 470 */       arrayOfBoolean[i] = false;
/*     */     }
/* 472 */     if (jj_kind >= 0) {
/* 473 */       arrayOfBoolean[jj_kind] = true;
/* 474 */       jj_kind = -1;
/*     */     }
/* 476 */     for (i = 0; i < 13; i++) {
/* 477 */       if (jj_la1[i] == jj_gen) {
/* 478 */         for (j = 0; j < 32; j++) {
/* 479 */           if ((jj_la1_0[i] & 1 << j) != 0) {
/* 480 */             arrayOfBoolean[j] = true;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 485 */     for (i = 0; i < 18; i++) {
/* 486 */       if (arrayOfBoolean[i] != 0) {
/* 487 */         jj_expentry = new int[1];
/* 488 */         jj_expentry[0] = i;
/* 489 */         jj_expentries.addElement(jj_expentry);
/*     */       }
/*     */     }
/* 492 */     int[][] arrayOfInt = new int[jj_expentries.size()][];
/* 493 */     for (int j = 0; j < jj_expentries.size(); j++) {
/* 494 */       arrayOfInt[j] = ((int[])(int[])jj_expentries.elementAt(j));
/*     */     }
/* 496 */     return new ParseException(token, arrayOfInt, tokenImage);
/*     */   }
/*     */   
/*     */   public static final void enable_tracing() {}
/*     */   
/*     */   public static final void disable_tracing() {}
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatParser.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */