/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.io.StringBufferInputStream;
/*     */ import java.util.Vector;
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
/*     */ class Format
/*     */   extends FormatUniv
/*     */ {
/* 173 */   private Vector elements = new Vector();
/*     */   
/*     */   public Format(String paramString) throws InvalidFormatException
/*     */   {
/* 177 */     FormatParser localFormatParser = Parsers.theParsers().format_parser;
/*     */     
/* 179 */     FormatParser.ReInit(new StringBufferInputStream(paramString));
/*     */     try {
/* 181 */       Format localFormat = FormatParser.Format();
/* 182 */       this.elements = localFormat.elements;
/*     */     }
/*     */     catch (ParseException localParseException) {
/* 185 */       throw new InvalidFormatException(localParseException.getMessage());
/*     */     }
/*     */     catch (TokenMgrError localTokenMgrError) {
/* 188 */       throw new InvalidFormatException(localTokenMgrError.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   Format() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void addElement(FormatUniv paramFormatUniv)
/*     */   {
/* 201 */     this.elements.addElement(paramFormatUniv);
/*     */   }
/*     */   
/*     */ 
/*     */   public void write(FormatOutputList paramFormatOutputList, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/* 208 */     for (int i = 0; i < this.elements.size(); i++) {
/* 209 */       FormatUniv localFormatUniv = (FormatUniv)this.elements.elementAt(i);
/* 210 */       localFormatUniv.write(paramFormatOutputList, paramPrintStream);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void read(FormatInputList paramFormatInputList, InputStreamAndBuffer paramInputStreamAndBuffer, FormatMap paramFormatMap)
/*     */     throws InputFormatException
/*     */   {
/* 221 */     for (int i = 0; i < this.elements.size(); i++) {
/* 222 */       FormatUniv localFormatUniv = (FormatUniv)this.elements.elementAt(i);
/* 223 */       localFormatUniv.read(paramFormatInputList, paramInputStreamAndBuffer, paramFormatMap);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public String toString()
/*     */   {
/* 230 */     String str = "";
/* 231 */     for (int i = 0; i < this.elements.size(); i++) {
/* 232 */       if (i != 0)
/* 233 */         str = str + ", ";
/* 234 */       str = str + this.elements.elementAt(i).toString();
/*     */     }
/* 236 */     return str;
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/Format.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */