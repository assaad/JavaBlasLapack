/*    */ package org.netlib.util;
/*    */ 
/*    */ import java.io.PrintStream;
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
/*    */ public class Dummy
/*    */ {
/*    */   public static void go_to(String paramString, int paramInt)
/*    */   {
/* 32 */     System.err.println("Warning: Untransformed goto remaining in program! (" + paramString + ", " + paramInt + ")");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void label(String paramString, int paramInt)
/*    */   {
/* 43 */     System.err.println("Warning: Untransformed label remaining in program! (" + paramString + ", " + paramInt + ")");
/*    */   }
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/Dummy.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */