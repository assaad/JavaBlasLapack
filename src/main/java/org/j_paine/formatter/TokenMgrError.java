/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TokenMgrError
/*     */   extends Error
/*     */ {
/*     */   static final int LEXICAL_ERROR = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int STATIC_LEXER_ERROR = 1;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int INVALID_LEXICAL_STATE = 2;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   static final int LOOP_DETECTED = 3;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   int errorCode;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected static final String addEscapes(String paramString)
/*     */   {
/*  41 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  43 */     for (int i = 0; i < paramString.length(); i++) {
/*  44 */       switch (paramString.charAt(i))
/*     */       {
/*     */       case '\000': 
/*     */         break;
/*     */       case '\b': 
/*  49 */         localStringBuffer.append("\\b");
/*  50 */         break;
/*     */       case '\t': 
/*  52 */         localStringBuffer.append("\\t");
/*  53 */         break;
/*     */       case '\n': 
/*  55 */         localStringBuffer.append("\\n");
/*  56 */         break;
/*     */       case '\f': 
/*  58 */         localStringBuffer.append("\\f");
/*  59 */         break;
/*     */       case '\r': 
/*  61 */         localStringBuffer.append("\\r");
/*  62 */         break;
/*     */       case '"': 
/*  64 */         localStringBuffer.append("\\\"");
/*  65 */         break;
/*     */       case '\'': 
/*  67 */         localStringBuffer.append("\\'");
/*  68 */         break;
/*     */       case '\\': 
/*  70 */         localStringBuffer.append("\\\\");
/*  71 */         break;
/*     */       default:  char c;
/*  73 */         if (((c = paramString.charAt(i)) < ' ') || (c > '~')) {
/*  74 */           String str = "0000" + Integer.toString(c, 16);
/*  75 */           localStringBuffer.append("\\u" + str.substring(str.length() - 4, str.length()));
/*     */         } else {
/*  77 */           localStringBuffer.append(c);
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/*  82 */     return localStringBuffer.toString();
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
/*     */   protected static String LexicalError(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, String paramString, char paramChar)
/*     */   {
/*  98 */     return "Lexical error at line " + paramInt2 + ", column " + paramInt3 + ".  Encountered: " + (paramBoolean ? "<EOF> " : new StringBuffer().append("\"").append(addEscapes(String.valueOf(paramChar))).append("\"").append(" (").append(paramChar).append("), ").toString()) + "after : \"" + addEscapes(paramString) + "\"";
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
/*     */   public String getMessage()
/*     */   {
/* 115 */     return super.getMessage();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public TokenMgrError() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public TokenMgrError(String paramString, int paramInt)
/*     */   {
/* 126 */     super(paramString);
/* 127 */     this.errorCode = paramInt;
/*     */   }
/*     */   
/*     */   public TokenMgrError(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, String paramString, char paramChar, int paramInt4) {
/* 131 */     this(LexicalError(paramBoolean, paramInt1, paramInt2, paramInt3, paramString, paramChar), paramInt4);
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/TokenMgrError.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */