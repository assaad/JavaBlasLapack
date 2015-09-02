/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParseException
/*     */   extends Exception
/*     */ {
/*     */   protected boolean specialConstructor;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Token currentToken;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int[][] expectedTokenSequences;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String[] tokenImage;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ParseException(Token paramToken, int[][] paramArrayOfInt, String[] paramArrayOfString)
/*     */   {
/*  32 */     super("");
/*  33 */     this.specialConstructor = true;
/*  34 */     this.currentToken = paramToken;
/*  35 */     this.expectedTokenSequences = paramArrayOfInt;
/*  36 */     this.tokenImage = paramArrayOfString;
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
/*     */   public ParseException()
/*     */   {
/*  51 */     this.specialConstructor = false;
/*     */   }
/*     */   
/*     */   public ParseException(String paramString) {
/*  55 */     super(paramString);
/*  56 */     this.specialConstructor = false;
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
/*     */   public String getMessage()
/*     */   {
/*  98 */     if (!this.specialConstructor) {
/*  99 */       return super.getMessage();
/*     */     }
/* 101 */     StringBuffer localStringBuffer = new StringBuffer();
/* 102 */     int i = 0;
/* 103 */     for (int j = 0; j < this.expectedTokenSequences.length; j++) {
/* 104 */       if (i < this.expectedTokenSequences[j].length) {
/* 105 */         i = this.expectedTokenSequences[j].length;
/*     */       }
/* 107 */       for (int k = 0; k < this.expectedTokenSequences[j].length; k++) {
/* 108 */         localStringBuffer.append(this.tokenImage[this.expectedTokenSequences[j][k]]).append(" ");
/*     */       }
/* 110 */       if (this.expectedTokenSequences[j][(this.expectedTokenSequences[j].length - 1)] != 0) {
/* 111 */         localStringBuffer.append("...");
/*     */       }
/* 113 */       localStringBuffer.append(this.eol).append("    ");
/*     */     }
/* 115 */     String str = "Encountered \"";
/* 116 */     Token localToken = this.currentToken.next;
/* 117 */     for (int m = 0; m < i; m++) {
/* 118 */       if (m != 0) str = str + " ";
/* 119 */       if (localToken.kind == 0) {
/* 120 */         str = str + this.tokenImage[0];
/* 121 */         break;
/*     */       }
/* 123 */       str = str + add_escapes(localToken.image);
/* 124 */       localToken = localToken.next;
/*     */     }
/* 126 */     str = str + "\" at line " + this.currentToken.next.beginLine + ", column " + this.currentToken.next.beginColumn;
/* 127 */     str = str + "." + this.eol;
/* 128 */     if (this.expectedTokenSequences.length == 1) {
/* 129 */       str = str + "Was expecting:" + this.eol + "    ";
/*     */     } else {
/* 131 */       str = str + "Was expecting one of:" + this.eol + "    ";
/*     */     }
/* 133 */     str = str + localStringBuffer.toString();
/* 134 */     return str;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/* 140 */   protected String eol = System.getProperty("line.separator", "\n");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String add_escapes(String paramString)
/*     */   {
/* 148 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 150 */     for (int i = 0; i < paramString.length(); i++) {
/* 151 */       switch (paramString.charAt(i))
/*     */       {
/*     */       case '\000': 
/*     */         break;
/*     */       case '\b': 
/* 156 */         localStringBuffer.append("\\b");
/* 157 */         break;
/*     */       case '\t': 
/* 159 */         localStringBuffer.append("\\t");
/* 160 */         break;
/*     */       case '\n': 
/* 162 */         localStringBuffer.append("\\n");
/* 163 */         break;
/*     */       case '\f': 
/* 165 */         localStringBuffer.append("\\f");
/* 166 */         break;
/*     */       case '\r': 
/* 168 */         localStringBuffer.append("\\r");
/* 169 */         break;
/*     */       case '"': 
/* 171 */         localStringBuffer.append("\\\"");
/* 172 */         break;
/*     */       case '\'': 
/* 174 */         localStringBuffer.append("\\'");
/* 175 */         break;
/*     */       case '\\': 
/* 177 */         localStringBuffer.append("\\\\");
/* 178 */         break;
/*     */       default:  char c;
/* 180 */         if (((c = paramString.charAt(i)) < ' ') || (c > '~')) {
/* 181 */           String str = "0000" + Integer.toString(c, 16);
/* 182 */           localStringBuffer.append("\\u" + str.substring(str.length() - 4, str.length()));
/*     */         } else {
/* 184 */           localStringBuffer.append(c);
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/* 189 */     return localStringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/ParseException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */