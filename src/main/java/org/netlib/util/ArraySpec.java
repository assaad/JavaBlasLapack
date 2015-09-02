/*     */ package org.netlib.util;
/*     */ 
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
/*     */ public class ArraySpec
/*     */ {
/*     */   private Vector vec;
/*     */   
/*     */   public ArraySpec(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  30 */     this.vec = new Vector();
/*     */     
/*  32 */     for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
/*  33 */       this.vec.addElement(new Integer(paramArrayOfInt[i]));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArraySpec(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
/*     */   {
/*  45 */     this.vec = new Vector();
/*     */     
/*  47 */     for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
/*  48 */       this.vec.addElement(new Double(paramArrayOfDouble[i]));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArraySpec(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
/*     */   {
/*  60 */     this.vec = new Vector();
/*     */     
/*  62 */     for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
/*  63 */       this.vec.addElement(new Float(paramArrayOfFloat[i]));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArraySpec(String[] paramArrayOfString, int paramInt1, int paramInt2)
/*     */   {
/*  75 */     this.vec = new Vector();
/*     */     
/*  77 */     for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
/*  78 */       this.vec.addElement(new String(paramArrayOfString[i]));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArraySpec(String paramString)
/*     */   {
/*  89 */     char[] arrayOfChar = paramString.toCharArray();
/*  90 */     this.vec = new Vector();
/*     */     
/*  92 */     for (int i = 0; i < arrayOfChar.length; i++) {
/*  93 */       this.vec.addElement(new String(String.valueOf(arrayOfChar[i])));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Vector get_vec()
/*     */   {
/* 102 */     return this.vec;
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/ArraySpec.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */