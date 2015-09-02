/*     */ package org.netlib.util;
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
/*     */ public class StrictUtil
/*     */   extends Util
/*     */ {
/*     */   public static strictfp int max(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  32 */     return StrictMath.max(paramInt1 > paramInt2 ? paramInt1 : paramInt2, StrictMath.max(paramInt2, paramInt3));
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
/*     */   public static strictfp float max(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  47 */     return StrictMath.max(paramFloat1 > paramFloat2 ? paramFloat1 : paramFloat2, StrictMath.max(paramFloat2, paramFloat3));
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
/*     */   public static strictfp double max(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/*  62 */     return StrictMath.max(paramDouble1 > paramDouble2 ? paramDouble1 : paramDouble2, StrictMath.max(paramDouble2, paramDouble3));
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
/*     */   public static strictfp int min(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  77 */     return StrictMath.min(paramInt1 < paramInt2 ? paramInt1 : paramInt2, StrictMath.min(paramInt2, paramInt3));
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
/*     */   public static strictfp float min(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  92 */     return StrictMath.min(paramFloat1 < paramFloat2 ? paramFloat1 : paramFloat2, StrictMath.min(paramFloat2, paramFloat3));
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
/*     */   public static strictfp double min(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 107 */     return StrictMath.min(paramDouble1 < paramDouble2 ? paramDouble1 : paramDouble2, StrictMath.min(paramDouble2, paramDouble3));
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
/*     */   public static strictfp double log10(double paramDouble)
/*     */   {
/* 120 */     return StrictMath.log(paramDouble) / 2.30258509D;
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
/*     */   public static strictfp float log10(float paramFloat)
/*     */   {
/* 133 */     return (float)(StrictMath.log(paramFloat) / 2.30258509D);
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
/*     */   public static strictfp int nint(float paramFloat)
/*     */   {
/* 152 */     return (int)(paramFloat >= 0.0F ? paramFloat + 0.5D : paramFloat - 0.5D);
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
/*     */   public static strictfp int idnint(double paramDouble)
/*     */   {
/* 171 */     return (int)(paramDouble >= 0.0D ? paramDouble + 0.5D : paramDouble - 0.5D);
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
/*     */   public static strictfp float sign(float paramFloat1, float paramFloat2)
/*     */   {
/* 191 */     return paramFloat2 >= 0.0F ? StrictMath.abs(paramFloat1) : -StrictMath.abs(paramFloat1);
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
/*     */   public static strictfp int isign(int paramInt1, int paramInt2)
/*     */   {
/* 211 */     return paramInt2 >= 0 ? StrictMath.abs(paramInt1) : -StrictMath.abs(paramInt1);
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
/*     */   public static strictfp double dsign(double paramDouble1, double paramDouble2)
/*     */   {
/* 231 */     return paramDouble2 >= 0.0D ? StrictMath.abs(paramDouble1) : -StrictMath.abs(paramDouble1);
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
/*     */   public static strictfp float dim(float paramFloat1, float paramFloat2)
/*     */   {
/* 251 */     return paramFloat1 > paramFloat2 ? paramFloat1 - paramFloat2 : 0.0F;
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
/*     */   public static strictfp int idim(int paramInt1, int paramInt2)
/*     */   {
/* 271 */     return paramInt1 > paramInt2 ? paramInt1 - paramInt2 : 0;
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
/*     */   public static strictfp double ddim(double paramDouble1, double paramDouble2)
/*     */   {
/* 291 */     return paramDouble1 > paramDouble2 ? paramDouble1 - paramDouble2 : 0.0D;
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
/*     */   public static strictfp double sinh(double paramDouble)
/*     */   {
/* 304 */     return (StrictMath.exp(paramDouble) - StrictMath.exp(-paramDouble)) * 0.5D;
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
/*     */   public static strictfp double cosh(double paramDouble)
/*     */   {
/* 317 */     return (StrictMath.exp(paramDouble) + StrictMath.exp(-paramDouble)) * 0.5D;
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
/*     */   public static strictfp double tanh(double paramDouble)
/*     */   {
/* 330 */     return sinh(paramDouble) / cosh(paramDouble);
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/StrictUtil.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */