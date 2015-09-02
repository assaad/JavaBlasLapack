/*    */ package org.j_paine.formatter;
/*    */ 
/*    */ 
/*    */ public abstract interface FormatParserConstants
/*    */ {
/*    */   public static final int EOF = 0;
/*    */   
/*    */   public static final int INTEGER = 2;
/*    */   
/*    */   public static final int STRING = 3;
/*    */   public static final int A_DESC = 4;
/*    */   public static final int P_DESC = 5;
/*    */   public static final int X_DESC = 6;
/*    */   public static final int I_DESC = 7;
/*    */   public static final int F_DESC = 8;
/*    */   public static final int D_DESC = 9;
/*    */   public static final int E_DESC = 10;
/*    */   public static final int G_DESC = 11;
/*    */   public static final int L_DESC = 12;
/*    */   public static final int DEFAULT = 0;
/* 21 */   public static final String[] tokenImage = { "<EOF>", "<token of kind 1>", "<INTEGER>", "<STRING>", "<A_DESC>", "<P_DESC>", "<X_DESC>", "<I_DESC>", "<F_DESC>", "<D_DESC>", "<E_DESC>", "<G_DESC>", "<L_DESC>", "\".\"", "\"/\"", "\"(\"", "\")\"", "\",\"" };
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatParserConstants.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */