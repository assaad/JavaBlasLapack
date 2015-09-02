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
/*    */ public class Etime
/*    */ {
/* 31 */   private static int call_num = 0;
/* 32 */   private static long start_time = 0L;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void etime()
/*    */   {
/* 39 */     float[] arrayOfFloat = new float[2];
/* 40 */     etime(arrayOfFloat, 0);
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
/*    */ 
/*    */   public static float etime(float[] paramArrayOfFloat, int paramInt)
/*    */   {
/* 58 */     if (call_num++ == 0)
/*    */     {
/* 60 */       start_time = System.currentTimeMillis();
/* 61 */       paramArrayOfFloat[(0 + paramInt)] = 0.0F;
/* 62 */       paramArrayOfFloat[(1 + paramInt)] = 0.0F;
/* 63 */       return 0.0F;
/*    */     }
/*    */     
/* 66 */     paramArrayOfFloat[(0 + paramInt)] = ((float)(System.currentTimeMillis() - start_time) / 1000.0F);
/* 67 */     paramArrayOfFloat[(1 + paramInt)] = paramArrayOfFloat[(0 + paramInt)];
/* 68 */     return paramArrayOfFloat[(0 + paramInt)];
/*    */   }
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/Etime.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */