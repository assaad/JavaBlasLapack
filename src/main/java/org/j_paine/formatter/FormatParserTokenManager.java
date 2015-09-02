/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class FormatParserTokenManager implements FormatParserConstants {
/*   6 */   public static java.io.PrintStream debugStream = System.out;
/*   7 */   public static void setDebugStream(java.io.PrintStream paramPrintStream) { debugStream = paramPrintStream; }
/*     */   
/*     */   private static final int jjStopStringLiteralDfa_0(int paramInt, long paramLong) {
/*  10 */     switch (paramInt)
/*     */     {
/*     */     }
/*  13 */     return -1;
/*     */   }
/*     */   
/*     */   private static final int jjStartNfa_0(int paramInt, long paramLong)
/*     */   {
/*  18 */     return jjMoveNfa_0(jjStopStringLiteralDfa_0(paramInt, paramLong), paramInt + 1);
/*     */   }
/*     */   
/*     */   private static final int jjStopAtPos(int paramInt1, int paramInt2) {
/*  22 */     jjmatchedKind = paramInt2;
/*  23 */     jjmatchedPos = paramInt1;
/*  24 */     return paramInt1 + 1;
/*     */   }
/*     */   
/*     */   private static final int jjStartNfaWithStates_0(int paramInt1, int paramInt2, int paramInt3) {
/*  28 */     jjmatchedKind = paramInt2;
/*  29 */     jjmatchedPos = paramInt1;
/*  30 */     try { curChar = input_stream.readChar();
/*  31 */     } catch (IOException localIOException) { return paramInt1 + 1; }
/*  32 */     return jjMoveNfa_0(paramInt3, paramInt1 + 1);
/*     */   }
/*     */   
/*     */   private static final int jjMoveStringLiteralDfa0_0() {
/*  36 */     switch (curChar)
/*     */     {
/*     */     case '(': 
/*  39 */       return jjStopAtPos(0, 15);
/*     */     case ')': 
/*  41 */       return jjStopAtPos(0, 16);
/*     */     case ',': 
/*  43 */       return jjStopAtPos(0, 17);
/*     */     case '.': 
/*  45 */       return jjStopAtPos(0, 13);
/*     */     case '/': 
/*  47 */       return jjStopAtPos(0, 14);
/*     */     }
/*  49 */     return jjMoveNfa_0(2, 0);
/*     */   }
/*     */   
/*     */   private static final void jjCheckNAdd(int paramInt)
/*     */   {
/*  54 */     if (jjrounds[paramInt] != jjround)
/*     */     {
/*  56 */       jjstateSet[(jjnewStateCnt++)] = paramInt;
/*  57 */       jjrounds[paramInt] = jjround;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void jjAddStates(int paramInt1, int paramInt2) {
/*     */     do {
/*  63 */       jjstateSet[(jjnewStateCnt++)] = jjnextStates[paramInt1];
/*  64 */     } while (paramInt1++ != paramInt2);
/*     */   }
/*     */   
/*     */   private static final void jjCheckNAddTwoStates(int paramInt1, int paramInt2) {
/*  68 */     jjCheckNAdd(paramInt1);
/*  69 */     jjCheckNAdd(paramInt2);
/*     */   }
/*     */   
/*     */   private static final void jjCheckNAddStates(int paramInt1, int paramInt2) {
/*     */     do {
/*  74 */       jjCheckNAdd(jjnextStates[paramInt1]);
/*  75 */     } while (paramInt1++ != paramInt2);
/*     */   }
/*     */   
/*     */   private static final void jjCheckNAddStates(int paramInt) {
/*  79 */     jjCheckNAdd(jjnextStates[paramInt]);
/*  80 */     jjCheckNAdd(jjnextStates[(paramInt + 1)]); }
/*     */   
/*  82 */   static final long[] jjbitVec0 = { 0L, 0L, -1L, -1L };
/*     */   
/*     */ 
/*     */ 
/*     */   private static final int jjMoveNfa_0(int paramInt1, int paramInt2)
/*     */   {
/*  88 */     int i = 0;
/*  89 */     jjnewStateCnt = 14;
/*  90 */     int j = 1;
/*  91 */     jjstateSet[0] = paramInt1;
/*  92 */     int k = Integer.MAX_VALUE;
/*     */     for (;;)
/*     */     {
/*  95 */       if (++jjround == Integer.MAX_VALUE)
/*  96 */         ReInitRounds();
/*  97 */       long l1; if (curChar < '@')
/*     */       {
/*  99 */         l1 = 1L << curChar;
/*     */         do
/*     */         {
/* 102 */           switch (jjstateSet[(--j)])
/*     */           {
/*     */           case 2: 
/* 105 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 107 */               if (k > 2)
/* 108 */                 k = 2;
/* 109 */               jjCheckNAdd(1);
/*     */             }
/* 111 */             else if (curChar == '\'') {
/* 112 */               jjCheckNAddTwoStates(3, 4);
/* 113 */             } else if (curChar == ' ')
/*     */             {
/* 115 */               if (k > 1)
/* 116 */                 k = 1;
/* 117 */               jjCheckNAdd(0);
/*     */             }
/*     */             break;
/*     */           case 0: 
/* 121 */             if (curChar == ' ')
/*     */             {
/* 123 */               if (k > 1)
/* 124 */                 k = 1;
/* 125 */               jjCheckNAdd(0); }
/* 126 */             break;
/*     */           case 1: 
/* 128 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 130 */               if (k > 2)
/* 131 */                 k = 2;
/* 132 */               jjCheckNAdd(1); }
/* 133 */             break;
/*     */           case 3: 
/* 135 */             if ((0xFFFFFF7FFFFFFFFF & l1) != 0L)
/* 136 */               jjCheckNAddTwoStates(3, 4);
/*     */             break;
/*     */           case 4: 
/* 139 */             if ((curChar == '\'') && (k > 3)) {
/* 140 */               k = 3;
/*     */             }
/*     */             break;
/*     */           }
/* 144 */         } while (j != i);
/*     */       }
/* 146 */       else if (curChar < '')
/*     */       {
/* 148 */         l1 = 1L << (curChar & 0x3F);
/*     */         do
/*     */         {
/* 151 */           switch (jjstateSet[(--j)])
/*     */           {
/*     */           case 2: 
/* 154 */             if ((0x100000001000 & l1) != 0L)
/*     */             {
/* 156 */               if (k > 12) {
/* 157 */                 k = 12;
/*     */               }
/* 159 */             } else if ((0x8000000080 & l1) != 0L)
/*     */             {
/* 161 */               if (k > 11) {
/* 162 */                 k = 11;
/*     */               }
/* 164 */             } else if ((0x2000000020 & l1) != 0L)
/*     */             {
/* 166 */               if (k > 10) {
/* 167 */                 k = 10;
/*     */               }
/* 169 */             } else if ((0x1000000010 & l1) != 0L)
/*     */             {
/* 171 */               if (k > 9) {
/* 172 */                 k = 9;
/*     */               }
/* 174 */             } else if ((0x4000000040 & l1) != 0L)
/*     */             {
/* 176 */               if (k > 8) {
/* 177 */                 k = 8;
/*     */               }
/* 179 */             } else if ((0x20000000200 & l1) != 0L)
/*     */             {
/* 181 */               if (k > 7) {
/* 182 */                 k = 7;
/*     */               }
/* 184 */             } else if ((0x100000001000000 & l1) != 0L)
/*     */             {
/* 186 */               if (k > 6) {
/* 187 */                 k = 6;
/*     */               }
/* 189 */             } else if ((0x1000000010000 & l1) != 0L)
/*     */             {
/* 191 */               if (k > 5) {
/* 192 */                 k = 5;
/*     */               }
/* 194 */             } else if ((0x200000002 & l1) != 0L)
/*     */             {
/* 196 */               if (k > 4)
/* 197 */                 k = 4;
/*     */             }
/*     */             break;
/*     */           case 3: 
/* 201 */             jjAddStates(0, 1);
/* 202 */             break;
/*     */           case 5: 
/* 204 */             if (((0x200000002 & l1) != 0L) && (k > 4))
/* 205 */               k = 4;
/*     */             break;
/*     */           case 6: 
/* 208 */             if (((0x1000000010000 & l1) != 0L) && (k > 5))
/* 209 */               k = 5;
/*     */             break;
/*     */           case 7: 
/* 212 */             if (((0x100000001000000 & l1) != 0L) && (k > 6))
/* 213 */               k = 6;
/*     */             break;
/*     */           case 8: 
/* 216 */             if (((0x20000000200 & l1) != 0L) && (k > 7))
/* 217 */               k = 7;
/*     */             break;
/*     */           case 9: 
/* 220 */             if (((0x4000000040 & l1) != 0L) && (k > 8))
/* 221 */               k = 8;
/*     */             break;
/*     */           case 10: 
/* 224 */             if (((0x1000000010 & l1) != 0L) && (k > 9))
/* 225 */               k = 9;
/*     */             break;
/*     */           case 11: 
/* 228 */             if (((0x2000000020 & l1) != 0L) && (k > 10))
/* 229 */               k = 10;
/*     */             break;
/*     */           case 12: 
/* 232 */             if (((0x8000000080 & l1) != 0L) && (k > 11))
/* 233 */               k = 11;
/*     */             break;
/*     */           case 13: 
/* 236 */             if (((0x100000001000 & l1) != 0L) && (k > 12)) {
/* 237 */               k = 12;
/*     */             }
/*     */             break;
/*     */           }
/* 241 */         } while (j != i);
/*     */       }
/*     */       else
/*     */       {
/* 245 */         int m = (curChar & 0xFF) >> '\006';
/* 246 */         long l2 = 1L << (curChar & 0x3F);
/*     */         do
/*     */         {
/* 249 */           switch (jjstateSet[(--j)])
/*     */           {
/*     */           case 3: 
/* 252 */             if ((jjbitVec0[m] & l2) != 0L) {
/* 253 */               jjAddStates(0, 1);
/*     */             }
/*     */             break;
/*     */           }
/* 257 */         } while (j != i);
/*     */       }
/* 259 */       if (k != Integer.MAX_VALUE)
/*     */       {
/* 261 */         jjmatchedKind = k;
/* 262 */         jjmatchedPos = paramInt2;
/* 263 */         k = Integer.MAX_VALUE;
/*     */       }
/* 265 */       paramInt2++;
/* 266 */       if ((j = jjnewStateCnt) == (i = 14 - (jjnewStateCnt = i)))
/* 267 */         return paramInt2;
/* 268 */       try { curChar = input_stream.readChar(); } catch (IOException localIOException) {} }
/* 269 */     return paramInt2;
/*     */   }
/*     */   
/* 272 */   static final int[] jjnextStates = { 3, 4 };
/*     */   
/*     */ 
/* 275 */   public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, null, null, null, ".", "/", "(", ")", "," };
/*     */   
/*     */ 
/* 278 */   public static final String[] lexStateNames = { "DEFAULT" };
/*     */   
/*     */ 
/* 281 */   static final long[] jjtoToken = { 262141L };
/*     */   
/*     */ 
/* 284 */   static final long[] jjtoSkip = { 2L };
/*     */   
/*     */   protected static SimpleCharStream input_stream;
/*     */   
/* 288 */   private static final int[] jjrounds = new int[14];
/* 289 */   private static final int[] jjstateSet = new int[28];
/*     */   protected static char curChar;
/*     */   
/* 292 */   public FormatParserTokenManager(SimpleCharStream paramSimpleCharStream) { if (input_stream != null)
/* 293 */       throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", 1);
/* 294 */     input_stream = paramSimpleCharStream;
/*     */   }
/*     */   
/* 297 */   public FormatParserTokenManager(SimpleCharStream paramSimpleCharStream, int paramInt) { this(paramSimpleCharStream);
/* 298 */     SwitchTo(paramInt);
/*     */   }
/*     */   
/*     */   public static void ReInit(SimpleCharStream paramSimpleCharStream) {
/* 302 */     jjmatchedPos = jjnewStateCnt = 0;
/* 303 */     curLexState = defaultLexState;
/* 304 */     input_stream = paramSimpleCharStream;
/* 305 */     ReInitRounds();
/*     */   }
/*     */   
/*     */   private static final void ReInitRounds()
/*     */   {
/* 310 */     jjround = -2147483647;
/* 311 */     for (int i = 14; i-- > 0;)
/* 312 */       jjrounds[i] = Integer.MIN_VALUE;
/*     */   }
/*     */   
/*     */   public static void ReInit(SimpleCharStream paramSimpleCharStream, int paramInt) {
/* 316 */     ReInit(paramSimpleCharStream);
/* 317 */     SwitchTo(paramInt);
/*     */   }
/*     */   
/*     */   public static void SwitchTo(int paramInt) {
/* 321 */     if ((paramInt >= 1) || (paramInt < 0)) {
/* 322 */       throw new TokenMgrError("Error: Ignoring invalid lexical state : " + paramInt + ". State unchanged.", 2);
/*     */     }
/* 324 */     curLexState = paramInt;
/*     */   }
/*     */   
/*     */   protected static Token jjFillToken()
/*     */   {
/* 329 */     Token localToken = Token.newToken(jjmatchedKind);
/* 330 */     localToken.kind = jjmatchedKind;
/* 331 */     String str = jjstrLiteralImages[jjmatchedKind];
/* 332 */     localToken.image = (str == null ? input_stream.GetImage() : str);
/* 333 */     localToken.beginLine = input_stream.getBeginLine();
/* 334 */     localToken.beginColumn = input_stream.getBeginColumn();
/* 335 */     localToken.endLine = input_stream.getEndLine();
/* 336 */     localToken.endColumn = input_stream.getEndColumn();
/* 337 */     return localToken;
/*     */   }
/*     */   
/* 340 */   static int curLexState = 0;
/* 341 */   static int defaultLexState = 0;
/*     */   
/*     */   static int jjnewStateCnt;
/*     */   static int jjround;
/*     */   static int jjmatchedPos;
/*     */   static int jjmatchedKind;
/*     */   
/*     */   public static Token getNextToken()
/*     */   {
/* 350 */     Object localObject = null;
/*     */     
/* 352 */     int i = 0;
/*     */     
/*     */ 
/*     */     do
/*     */     {
/*     */       try
/*     */       {
/* 359 */         curChar = input_stream.BeginToken();
/*     */       }
/*     */       catch (IOException localIOException1)
/*     */       {
/* 363 */         jjmatchedKind = 0;
/* 364 */         return jjFillToken();
/*     */       }
/*     */       
/*     */ 
/* 368 */       jjmatchedKind = Integer.MAX_VALUE;
/* 369 */       jjmatchedPos = 0;
/* 370 */       i = jjMoveStringLiteralDfa0_0();
/* 371 */       if (jjmatchedKind == Integer.MAX_VALUE)
/*     */         break;
/* 373 */       if (jjmatchedPos + 1 < i)
/* 374 */         input_stream.backup(i - jjmatchedPos - 1);
/* 375 */     } while ((jjtoToken[(jjmatchedKind >> 6)] & 1L << (jjmatchedKind & 0x3F)) == 0L);
/*     */     
/* 377 */     Token localToken = jjFillToken();
/* 378 */     return localToken;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */     int j = input_stream.getEndLine();
/* 386 */     int k = input_stream.getEndColumn();
/* 387 */     String str = null;
/* 388 */     boolean bool = false;
/* 389 */     try { input_stream.readChar();input_stream.backup(1);
/*     */     } catch (IOException localIOException2) {
/* 391 */       bool = true;
/* 392 */       str = i <= 1 ? "" : input_stream.GetImage();
/* 393 */       if ((curChar == '\n') || (curChar == '\r')) {
/* 394 */         j++;
/* 395 */         k = 0;
/*     */       }
/*     */       else {
/* 398 */         k++;
/*     */       } }
/* 400 */     if (!bool) {
/* 401 */       input_stream.backup(1);
/* 402 */       str = i <= 1 ? "" : input_stream.GetImage();
/*     */     }
/* 404 */     throw new TokenMgrError(bool, curLexState, j, k, str, curChar, 0);
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatParserTokenManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */