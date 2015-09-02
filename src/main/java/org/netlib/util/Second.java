/*    */ package org.netlib.util;
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
/*    */ public class Second
/*    */ {
/*    */   public static float second()
/*    */   {
/* 40 */     float[] arrayOfFloat = new float[2];
/*    */     
/* 42 */     Etime.etime();
/* 43 */     Etime.etime(arrayOfFloat, 0);
/*    */     
/* 45 */     return arrayOfFloat[0];
/*    */   }
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/Second.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */