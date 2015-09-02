/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class NumberParserTokenManager implements NumberParserConstants {
/*   6 */   public java.io.PrintStream debugStream = System.out;
/*   7 */   public void setDebugStream(java.io.PrintStream paramPrintStream) { this.debugStream = paramPrintStream; }
/*     */   
/*     */   private final int jjStopStringLiteralDfa_0(int paramInt, long paramLong) {
/*  10 */     switch (paramInt)
/*     */     {
/*     */     }
/*  13 */     return -1;
/*     */   }
/*     */   
/*     */   private final int jjStartNfa_0(int paramInt, long paramLong)
/*     */   {
/*  18 */     return jjMoveNfa_0(jjStopStringLiteralDfa_0(paramInt, paramLong), paramInt + 1);
/*     */   }
/*     */   
/*     */   private final int jjStopAtPos(int paramInt1, int paramInt2) {
/*  22 */     this.jjmatchedKind = paramInt2;
/*  23 */     this.jjmatchedPos = paramInt1;
/*  24 */     return paramInt1 + 1;
/*     */   }
/*     */   
/*     */   private final int jjStartNfaWithStates_0(int paramInt1, int paramInt2, int paramInt3) {
/*  28 */     this.jjmatchedKind = paramInt2;
/*  29 */     this.jjmatchedPos = paramInt1;
/*  30 */     try { this.curChar = this.input_stream.readChar();
/*  31 */     } catch (IOException localIOException) { return paramInt1 + 1; }
/*  32 */     return jjMoveNfa_0(paramInt3, paramInt1 + 1);
/*     */   }
/*     */   
/*     */   private final int jjMoveStringLiteralDfa0_0() {
/*  36 */     switch (this.curChar)
/*     */     {
/*     */     case ' ': 
/*  39 */       return jjStopAtPos(0, 6);
/*     */     case '+': 
/*  41 */       return jjStopAtPos(0, 8);
/*     */     case '-': 
/*  43 */       return jjStopAtPos(0, 7);
/*     */     }
/*  45 */     return jjMoveNfa_0(0, 0);
/*     */   }
/*     */   
/*     */   private final void jjCheckNAdd(int paramInt)
/*     */   {
/*  50 */     if (this.jjrounds[paramInt] != this.jjround)
/*     */     {
/*  52 */       this.jjstateSet[(this.jjnewStateCnt++)] = paramInt;
/*  53 */       this.jjrounds[paramInt] = this.jjround;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void jjAddStates(int paramInt1, int paramInt2) {
/*     */     do {
/*  59 */       this.jjstateSet[(this.jjnewStateCnt++)] = jjnextStates[paramInt1];
/*  60 */     } while (paramInt1++ != paramInt2);
/*     */   }
/*     */   
/*     */   private final void jjCheckNAddTwoStates(int paramInt1, int paramInt2) {
/*  64 */     jjCheckNAdd(paramInt1);
/*  65 */     jjCheckNAdd(paramInt2);
/*     */   }
/*     */   
/*     */   private final void jjCheckNAddStates(int paramInt1, int paramInt2) {
/*     */     do {
/*  70 */       jjCheckNAdd(jjnextStates[paramInt1]);
/*  71 */     } while (paramInt1++ != paramInt2);
/*     */   }
/*     */   
/*     */   private final void jjCheckNAddStates(int paramInt) {
/*  75 */     jjCheckNAdd(jjnextStates[paramInt]);
/*  76 */     jjCheckNAdd(jjnextStates[(paramInt + 1)]);
/*     */   }
/*     */   
/*     */   private final int jjMoveNfa_0(int paramInt1, int paramInt2)
/*     */   {
/*  81 */     int i = 0;
/*  82 */     this.jjnewStateCnt = 24;
/*  83 */     int j = 1;
/*  84 */     this.jjstateSet[0] = paramInt1;
/*  85 */     int k = Integer.MAX_VALUE;
/*     */     for (;;)
/*     */     {
/*  88 */       if (++this.jjround == Integer.MAX_VALUE)
/*  89 */         ReInitRounds();
/*  90 */       long l1; if (this.curChar < '@')
/*     */       {
/*  92 */         l1 = 1L << this.curChar;
/*     */         do
/*     */         {
/*  95 */           switch (this.jjstateSet[(--j)])
/*     */           {
/*     */           case 0: 
/*  98 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 100 */               if (k > 4)
/* 101 */                 k = 4;
/* 102 */               jjCheckNAddStates(0, 5);
/*     */             }
/* 104 */             else if (this.curChar == '.') {
/* 105 */               jjCheckNAdd(5); }
/* 106 */             if ((0x3FE000000000000 & l1) != 0L)
/*     */             {
/* 108 */               if (k > 1)
/* 109 */                 k = 1;
/* 110 */               jjCheckNAdd(2);
/*     */             }
/* 112 */             else if (this.curChar == '0')
/*     */             {
/* 114 */               if (k > 1)
/* 115 */                 k = 1;
/*     */             }
/*     */             break;
/*     */           case 1: 
/* 119 */             if ((0x3FE000000000000 & l1) != 0L)
/*     */             {
/* 121 */               if (k > 1)
/* 122 */                 k = 1;
/* 123 */               jjCheckNAdd(2); }
/* 124 */             break;
/*     */           case 2: 
/* 126 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 128 */               if (k > 1)
/* 129 */                 k = 1;
/* 130 */               jjCheckNAdd(2); }
/* 131 */             break;
/*     */           case 4: 
/* 133 */             if (this.curChar == '.')
/* 134 */               jjCheckNAdd(5);
/*     */             break;
/*     */           case 5: 
/* 137 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 139 */               if (k > 4)
/* 140 */                 k = 4;
/* 141 */               jjCheckNAddTwoStates(5, 6); }
/* 142 */             break;
/*     */           case 7: 
/* 144 */             if ((0x280000000000 & l1) != 0L)
/* 145 */               jjCheckNAdd(8);
/*     */             break;
/*     */           case 8: 
/* 148 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 150 */               if (k > 4)
/* 151 */                 k = 4;
/* 152 */               jjCheckNAdd(8); }
/* 153 */             break;
/*     */           case 9: 
/* 155 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 157 */               if (k > 4)
/* 158 */                 k = 4;
/* 159 */               jjCheckNAddStates(0, 5); }
/* 160 */             break;
/*     */           case 10: 
/* 162 */             if ((0x3FF000000000000 & l1) != 0L)
/* 163 */               jjCheckNAddTwoStates(10, 11);
/*     */             break;
/*     */           case 11: 
/* 166 */             if (this.curChar == '.')
/*     */             {
/* 168 */               if (k > 4)
/* 169 */                 k = 4;
/* 170 */               jjCheckNAddTwoStates(12, 13); }
/* 171 */             break;
/*     */           case 12: 
/* 173 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 175 */               if (k > 4)
/* 176 */                 k = 4;
/* 177 */               jjCheckNAddTwoStates(12, 13); }
/* 178 */             break;
/*     */           case 14: 
/* 180 */             if ((0x280000000000 & l1) != 0L)
/* 181 */               jjCheckNAdd(15);
/*     */             break;
/*     */           case 15: 
/* 184 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 186 */               if (k > 4)
/* 187 */                 k = 4;
/* 188 */               jjCheckNAdd(15); }
/* 189 */             break;
/*     */           case 16: 
/* 191 */             if ((0x3FF000000000000 & l1) != 0L)
/* 192 */               jjCheckNAddTwoStates(16, 17);
/*     */             break;
/*     */           case 18: 
/* 195 */             if ((0x280000000000 & l1) != 0L)
/* 196 */               jjCheckNAdd(19);
/*     */             break;
/*     */           case 19: 
/* 199 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 201 */               if (k > 4)
/* 202 */                 k = 4;
/* 203 */               jjCheckNAdd(19); }
/* 204 */             break;
/*     */           case 20: 
/* 206 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 208 */               if (k > 4)
/* 209 */                 k = 4;
/* 210 */               jjCheckNAddTwoStates(20, 21); }
/* 211 */             break;
/*     */           case 22: 
/* 213 */             if ((0x280000000000 & l1) != 0L)
/* 214 */               jjCheckNAdd(23);
/*     */             break;
/*     */           case 23: 
/* 217 */             if ((0x3FF000000000000 & l1) != 0L)
/*     */             {
/* 219 */               if (k > 4)
/* 220 */                 k = 4;
/* 221 */               jjCheckNAdd(23);
/*     */             }
/*     */             break;
/*     */           }
/* 225 */         } while (j != i);
/*     */       }
/* 227 */       else if (this.curChar < '')
/*     */       {
/* 229 */         l1 = 1L << (this.curChar & 0x3F);
/*     */         do
/*     */         {
/* 232 */           switch (this.jjstateSet[(--j)])
/*     */           {
/*     */           case 0: 
/* 235 */             if ((0x100040 & l1) != 0L)
/* 236 */               k = 3;
/*     */             break;
/*     */           case 6: 
/* 239 */             if ((0x2000000020 & l1) != 0L)
/* 240 */               jjAddStates(6, 7);
/*     */             break;
/*     */           case 13: 
/* 243 */             if ((0x2000000020 & l1) != 0L)
/* 244 */               jjAddStates(8, 9);
/*     */             break;
/*     */           case 17: 
/* 247 */             if ((0x2000000020 & l1) != 0L)
/* 248 */               jjAddStates(10, 11);
/*     */             break;
/*     */           case 21: 
/* 251 */             if ((0x2000000020 & l1) != 0L) {
/* 252 */               jjAddStates(12, 13);
/*     */             }
/*     */             break;
/*     */           }
/* 256 */         } while (j != i);
/*     */       }
/*     */       else
/*     */       {
/* 260 */         int m = (this.curChar & 0xFF) >> '\006';
/* 261 */         long l2 = 1L << (this.curChar & 0x3F);
/*     */         do
/*     */         {
/* 264 */           switch (this.jjstateSet[(--j)])
/*     */           {
/*     */           }
/*     */           
/* 268 */         } while (j != i);
/*     */       }
/* 270 */       if (k != Integer.MAX_VALUE)
/*     */       {
/* 272 */         this.jjmatchedKind = k;
/* 273 */         this.jjmatchedPos = paramInt2;
/* 274 */         k = Integer.MAX_VALUE;
/*     */       }
/* 276 */       paramInt2++;
/* 277 */       if ((j = this.jjnewStateCnt) == (i = 24 - (this.jjnewStateCnt = i)))
/* 278 */         return paramInt2;
/* 279 */       try { this.curChar = this.input_stream.readChar(); } catch (IOException localIOException) {} }
/* 280 */     return paramInt2;
/*     */   }
/*     */   
/* 283 */   static final int[] jjnextStates = { 10, 11, 16, 17, 20, 21, 7, 8, 14, 15, 18, 19, 22, 23 };
/*     */   
/*     */ 
/* 286 */   public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, " ", "-", "+" };
/*     */   
/* 288 */   public static final String[] lexStateNames = { "DEFAULT" };
/*     */   
/*     */   protected SimpleCharStream input_stream;
/*     */   
/* 292 */   private final int[] jjrounds = new int[24];
/* 293 */   private final int[] jjstateSet = new int[48];
/*     */   
/*     */   protected char curChar;
/*     */   
/*     */ 
/* 298 */   public NumberParserTokenManager(SimpleCharStream paramSimpleCharStream) { this.input_stream = paramSimpleCharStream; }
/*     */   
/*     */   public NumberParserTokenManager(SimpleCharStream paramSimpleCharStream, int paramInt) {
/* 301 */     this(paramSimpleCharStream);
/* 302 */     SwitchTo(paramInt);
/*     */   }
/*     */   
/*     */   public void ReInit(SimpleCharStream paramSimpleCharStream) {
/* 306 */     this.jjmatchedPos = (this.jjnewStateCnt = 0);
/* 307 */     this.curLexState = this.defaultLexState;
/* 308 */     this.input_stream = paramSimpleCharStream;
/* 309 */     ReInitRounds();
/*     */   }
/*     */   
/*     */   private final void ReInitRounds()
/*     */   {
/* 314 */     this.jjround = -2147483647;
/* 315 */     for (int i = 24; i-- > 0;)
/* 316 */       this.jjrounds[i] = Integer.MIN_VALUE;
/*     */   }
/*     */   
/*     */   public void ReInit(SimpleCharStream paramSimpleCharStream, int paramInt) {
/* 320 */     ReInit(paramSimpleCharStream);
/* 321 */     SwitchTo(paramInt);
/*     */   }
/*     */   
/*     */   public void SwitchTo(int paramInt) {
/* 325 */     if ((paramInt >= 1) || (paramInt < 0)) {
/* 326 */       throw new TokenMgrError("Error: Ignoring invalid lexical state : " + paramInt + ". State unchanged.", 2);
/*     */     }
/* 328 */     this.curLexState = paramInt;
/*     */   }
/*     */   
/*     */   protected Token jjFillToken()
/*     */   {
/* 333 */     Token localToken = Token.newToken(this.jjmatchedKind);
/* 334 */     localToken.kind = this.jjmatchedKind;
/* 335 */     String str = jjstrLiteralImages[this.jjmatchedKind];
/* 336 */     localToken.image = (str == null ? this.input_stream.GetImage() : str);
/* 337 */     localToken.beginLine = this.input_stream.getBeginLine();
/* 338 */     localToken.beginColumn = this.input_stream.getBeginColumn();
/* 339 */     localToken.endLine = this.input_stream.getEndLine();
/* 340 */     localToken.endColumn = this.input_stream.getEndColumn();
/* 341 */     return localToken;
/*     */   }
/*     */   
/* 344 */   int curLexState = 0;
/* 345 */   int defaultLexState = 0;
/*     */   
/*     */   int jjnewStateCnt;
/*     */   int jjround;
/*     */   int jjmatchedPos;
/*     */   int jjmatchedKind;
/*     */   
/*     */   public Token getNextToken()
/*     */   {
/* 354 */     Object localObject = null;
/*     */     
/* 356 */     int i = 0;
/*     */     
/*     */ 
/*     */     Token localToken;
/*     */     
/*     */     try
/*     */     {
/* 363 */       this.curChar = this.input_stream.BeginToken();
/*     */     }
/*     */     catch (IOException localIOException1)
/*     */     {
/* 367 */       this.jjmatchedKind = 0;
/* 368 */       return jjFillToken();
/*     */     }
/*     */     
/*     */ 
/* 372 */     this.jjmatchedKind = Integer.MAX_VALUE;
/* 373 */     this.jjmatchedPos = 0;
/* 374 */     i = jjMoveStringLiteralDfa0_0();
/* 375 */     if (this.jjmatchedKind != Integer.MAX_VALUE)
/*     */     {
/* 377 */       if (this.jjmatchedPos + 1 < i)
/* 378 */         this.input_stream.backup(i - this.jjmatchedPos - 1);
/* 379 */       localToken = jjFillToken();
/* 380 */       return localToken;
/*     */     }
/* 382 */     int j = this.input_stream.getEndLine();
/* 383 */     int k = this.input_stream.getEndColumn();
/* 384 */     String str = null;
/* 385 */     boolean bool = false;
/* 386 */     try { this.input_stream.readChar();this.input_stream.backup(1);
/*     */     } catch (IOException localIOException2) {
/* 388 */       bool = true;
/* 389 */       str = i <= 1 ? "" : this.input_stream.GetImage();
/* 390 */       if ((this.curChar == '\n') || (this.curChar == '\r')) {
/* 391 */         j++;
/* 392 */         k = 0;
/*     */       }
/*     */       else {
/* 395 */         k++;
/*     */       } }
/* 397 */     if (!bool) {
/* 398 */       this.input_stream.backup(1);
/* 399 */       str = i <= 1 ? "" : this.input_stream.GetImage();
/*     */     }
/* 401 */     throw new TokenMgrError(bool, this.curLexState, j, k, str, this.curChar, 0);
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/NumberParserTokenManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */