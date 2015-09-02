/*    */ package org.j_paine.formatter;
/*    */ 
/*    */ 
/*    */ public abstract interface NumberParserConstants
/*    */ {
/*    */   public static final int EOF = 0;
/*    */   
/*    */   public static final int INTEGER_LITERAL = 1;
/*    */   
/*    */   public static final int DECIMAL_LITERAL = 2;
/*    */   public static final int LOGICAL_LITERAL = 3;
/*    */   public static final int FLOATING_POINT_LITERAL = 4;
/*    */   public static final int EXPONENT = 5;
/*    */   public static final int DEFAULT = 0;
/* 15 */   public static final String[] tokenImage = { "<EOF>", "<INTEGER_LITERAL>", "<DECIMAL_LITERAL>", "<LOGICAL_LITERAL>", "<FLOATING_POINT_LITERAL>", "<EXPONENT>", "\" \"", "\"-\"", "\"+\"" };
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/NumberParserConstants.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */