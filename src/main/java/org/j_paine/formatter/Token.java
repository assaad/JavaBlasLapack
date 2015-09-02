/*    */ package org.j_paine.formatter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Token
/*    */ {
/*    */   public int kind;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int beginLine;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int beginColumn;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int endLine;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int endColumn;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String image;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Token next;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Token specialToken;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 58 */     return this.image;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final Token newToken(int paramInt)
/*    */   {
/* 75 */     switch (paramInt) {
/*    */     }
/* 77 */     return new Token();
/*    */   }
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/Token.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */