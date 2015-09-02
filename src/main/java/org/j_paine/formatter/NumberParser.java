/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ 
/*     */ class NumberParser implements NumberParserConstants { public NumberParserTokenManager token_source;
/*     */   
/*   7 */   public final int Float() throws ParseException { int i = 0;
/*     */     for (;;)
/*     */     {
/*  10 */       switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk)
/*     */       {
/*     */       case 6: 
/*     */         break;
/*     */       default: 
/*  15 */         this.jj_la1[0] = this.jj_gen;
/*  16 */         break;
/*     */       }
/*  18 */       jj_consume_token(6);
/*  19 */       i++;
/*     */     }
/*  21 */     switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
/*     */     case 7: 
/*     */     case 8: 
/*  24 */       switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
/*     */       case 7: 
/*  26 */         jj_consume_token(7);
/*  27 */         break;
/*     */       case 8: 
/*  29 */         jj_consume_token(8);
/*  30 */         break;
/*     */       default: 
/*  32 */         this.jj_la1[1] = this.jj_gen;
/*  33 */         jj_consume_token(-1);
/*  34 */         throw new ParseException();
/*     */       }
/*     */       break;
/*     */     default: 
/*  38 */       this.jj_la1[2] = this.jj_gen;
/*     */     }
/*     */     
/*  41 */     switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
/*     */     case 1: 
/*  43 */       jj_consume_token(1);
/*  44 */       break;
/*     */     case 4: 
/*  46 */       jj_consume_token(4);
/*  47 */       break;
/*     */     default: 
/*  49 */       this.jj_la1[3] = this.jj_gen;
/*  50 */       jj_consume_token(-1);
/*  51 */       throw new ParseException();
/*     */     }
/*  53 */     jj_consume_token(0);
/*  54 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */   SimpleCharStream jj_input_stream;
/*     */   
/*     */   public Token token;
/*     */   public final int Integer()
/*     */     throws ParseException
/*     */   {
/*  64 */     int i = 0;
/*     */     for (;;)
/*     */     {
/*  67 */       switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk)
/*     */       {
/*     */       case 6: 
/*     */         break;
/*     */       default: 
/*  72 */         this.jj_la1[4] = this.jj_gen;
/*  73 */         break;
/*     */       }
/*  75 */       jj_consume_token(6);
/*  76 */       i++;
/*     */     }
/*  78 */     switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
/*     */     case 7: 
/*     */     case 8: 
/*  81 */       switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
/*     */       case 7: 
/*  83 */         jj_consume_token(7);
/*  84 */         break;
/*     */       case 8: 
/*  86 */         jj_consume_token(8);
/*  87 */         break;
/*     */       default: 
/*  89 */         this.jj_la1[5] = this.jj_gen;
/*  90 */         jj_consume_token(-1);
/*  91 */         throw new ParseException();
/*     */       }
/*     */       break;
/*     */     default: 
/*  95 */       this.jj_la1[6] = this.jj_gen;
/*     */     }
/*     */     
/*  98 */     jj_consume_token(1);
/*  99 */     jj_consume_token(0);
/* 100 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public final int Boolean()
/*     */     throws ParseException
/*     */   {
/* 109 */     int i = 0;
/*     */     for (;;)
/*     */     {
/* 112 */       switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk)
/*     */       {
/*     */       case 6: 
/*     */         break;
/*     */       default: 
/* 117 */         this.jj_la1[7] = this.jj_gen;
/* 118 */         break;
/*     */       }
/* 120 */       jj_consume_token(6);
/* 121 */       i++;
/*     */     }
/* 123 */     jj_consume_token(3);
/* 124 */     jj_consume_token(0);
/* 125 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */   public Token jj_nt;
/*     */   
/*     */   private int jj_ntk;
/*     */   
/*     */   private int jj_gen;
/* 134 */   private final int[] jj_la1 = new int[8];
/*     */   
/*     */   private static int[] jj_la1_0;
/*     */   
/*     */   private static void jj_la1_0()
/*     */   {
/* 140 */     jj_la1_0 = new int[] { 64, 384, 384, 18, 64, 384, 384, 64 };
/*     */   }
/*     */   
/*     */ 
/* 144 */   public NumberParser(InputStream paramInputStream) { this(paramInputStream, null); }
/*     */   
/*     */   public NumberParser(InputStream paramInputStream, String paramString) {
/* 147 */     try { this.jj_input_stream = new SimpleCharStream(paramInputStream, paramString, 1, 1); } catch (java.io.UnsupportedEncodingException localUnsupportedEncodingException) { throw new RuntimeException(localUnsupportedEncodingException); }
/* 148 */     this.token_source = new NumberParserTokenManager(this.jj_input_stream);
/* 149 */     this.token = new Token();
/* 150 */     this.jj_ntk = -1;
/* 151 */     this.jj_gen = 0;
/* 152 */     for (int i = 0; i < 8; i++) { this.jj_la1[i] = -1;
/*     */     }
/*     */   }
/*     */   
/* 156 */   public void ReInit(InputStream paramInputStream) { ReInit(paramInputStream, null); }
/*     */   
/*     */   public void ReInit(InputStream paramInputStream, String paramString) {
/* 159 */     try { this.jj_input_stream.ReInit(paramInputStream, paramString, 1, 1); } catch (java.io.UnsupportedEncodingException localUnsupportedEncodingException) { throw new RuntimeException(localUnsupportedEncodingException); }
/* 160 */     this.token_source.ReInit(this.jj_input_stream);
/* 161 */     this.token = new Token();
/* 162 */     this.jj_ntk = -1;
/* 163 */     this.jj_gen = 0;
/* 164 */     for (int i = 0; i < 8; i++) this.jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public NumberParser(java.io.Reader paramReader) {
/* 168 */     this.jj_input_stream = new SimpleCharStream(paramReader, 1, 1);
/* 169 */     this.token_source = new NumberParserTokenManager(this.jj_input_stream);
/* 170 */     this.token = new Token();
/* 171 */     this.jj_ntk = -1;
/* 172 */     this.jj_gen = 0;
/* 173 */     for (int i = 0; i < 8; i++) this.jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public void ReInit(java.io.Reader paramReader) {
/* 177 */     this.jj_input_stream.ReInit(paramReader, 1, 1);
/* 178 */     this.token_source.ReInit(this.jj_input_stream);
/* 179 */     this.token = new Token();
/* 180 */     this.jj_ntk = -1;
/* 181 */     this.jj_gen = 0;
/* 182 */     for (int i = 0; i < 8; i++) this.jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public NumberParser(NumberParserTokenManager paramNumberParserTokenManager) {
/* 186 */     this.token_source = paramNumberParserTokenManager;
/* 187 */     this.token = new Token();
/* 188 */     this.jj_ntk = -1;
/* 189 */     this.jj_gen = 0;
/* 190 */     for (int i = 0; i < 8; i++) this.jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   public void ReInit(NumberParserTokenManager paramNumberParserTokenManager) {
/* 194 */     this.token_source = paramNumberParserTokenManager;
/* 195 */     this.token = new Token();
/* 196 */     this.jj_ntk = -1;
/* 197 */     this.jj_gen = 0;
/* 198 */     for (int i = 0; i < 8; i++) this.jj_la1[i] = -1;
/*     */   }
/*     */   
/*     */   private final Token jj_consume_token(int paramInt) throws ParseException {
/*     */     Token localToken;
/* 203 */     if ((localToken = this.token).next != null) this.token = this.token.next; else
/* 204 */       this.token = (this.token.next = this.token_source.getNextToken());
/* 205 */     this.jj_ntk = -1;
/* 206 */     if (this.token.kind == paramInt) {
/* 207 */       this.jj_gen += 1;
/* 208 */       return this.token;
/*     */     }
/* 210 */     this.token = localToken;
/* 211 */     this.jj_kind = paramInt;
/* 212 */     throw generateParseException();
/*     */   }
/*     */   
/*     */   public final Token getNextToken() {
/* 216 */     if (this.token.next != null) this.token = this.token.next; else
/* 217 */       this.token = (this.token.next = this.token_source.getNextToken());
/* 218 */     this.jj_ntk = -1;
/* 219 */     this.jj_gen += 1;
/* 220 */     return this.token;
/*     */   }
/*     */   
/*     */   public final Token getToken(int paramInt) {
/* 224 */     Token localToken = this.token;
/* 225 */     for (int i = 0; i < paramInt; i++) {
/* 226 */       if (localToken.next != null) localToken = localToken.next; else
/* 227 */         localToken = localToken.next = this.token_source.getNextToken();
/*     */     }
/* 229 */     return localToken;
/*     */   }
/*     */   
/*     */   private final int jj_ntk() {
/* 233 */     if ((this.jj_nt = this.token.next) == null) {
/* 234 */       return this.jj_ntk = (this.token.next = this.token_source.getNextToken()).kind;
/*     */     }
/* 236 */     return this.jj_ntk = this.jj_nt.kind;
/*     */   }
/*     */   
/* 239 */   private java.util.Vector jj_expentries = new java.util.Vector();
/*     */   private int[] jj_expentry;
/* 241 */   private int jj_kind = -1;
/*     */   
/*     */   public ParseException generateParseException() {
/* 244 */     this.jj_expentries.removeAllElements();
/* 245 */     boolean[] arrayOfBoolean = new boolean[9];
/* 246 */     for (int i = 0; i < 9; i++) {
/* 247 */       arrayOfBoolean[i] = false;
/*     */     }
/* 249 */     if (this.jj_kind >= 0) {
/* 250 */       arrayOfBoolean[this.jj_kind] = true;
/* 251 */       this.jj_kind = -1;
/*     */     }
/* 253 */     for (i = 0; i < 8; i++) {
/* 254 */       if (this.jj_la1[i] == this.jj_gen) {
/* 255 */         for (j = 0; j < 32; j++) {
/* 256 */           if ((jj_la1_0[i] & 1 << j) != 0) {
/* 257 */             arrayOfBoolean[j] = true;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 262 */     for (i = 0; i < 9; i++) {
/* 263 */       if (arrayOfBoolean[i] != 0) {
/* 264 */         this.jj_expentry = new int[1];
/* 265 */         this.jj_expentry[0] = i;
/* 266 */         this.jj_expentries.addElement(this.jj_expentry);
/*     */       }
/*     */     }
/* 269 */     int[][] arrayOfInt = new int[this.jj_expentries.size()][];
/* 270 */     for (int j = 0; j < this.jj_expentries.size(); j++) {
/* 271 */       arrayOfInt[j] = ((int[])(int[])this.jj_expentries.elementAt(j));
/*     */     }
/* 273 */     return new ParseException(this.token, arrayOfInt, tokenImage);
/*     */   }
/*     */   
/*     */   public final void enable_tracing() {}
/*     */   
/*     */   public final void disable_tracing() {}
/*     */   
/*     */   static {}
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/NumberParser.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */