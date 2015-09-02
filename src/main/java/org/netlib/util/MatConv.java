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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MatConv
/*     */ {
/*     */   public static double[] doubleTwoDtoOneD(double[][] paramArrayOfDouble)
/*     */   {
/*  35 */     int i = paramArrayOfDouble.length;
/*  36 */     double[] arrayOfDouble = new double[i * paramArrayOfDouble[0].length];
/*     */     
/*  38 */     for (int j = 0; j < i; j++) {
/*  39 */       for (int k = 0; k < paramArrayOfDouble[0].length; k++)
/*  40 */         arrayOfDouble[(j + k * i)] = paramArrayOfDouble[j][k];
/*     */     }
/*  42 */     return arrayOfDouble;
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
/*     */   public static double[][] doubleOneDtoTwoD(double[] paramArrayOfDouble, int paramInt)
/*     */   {
/*  57 */     double[][] arrayOfDouble = new double[paramInt][paramArrayOfDouble.length / paramInt];
/*     */     
/*     */ 
/*  60 */     for (int i = 0; i < paramInt; i++) {
/*  61 */       for (int j = 0; j < arrayOfDouble[0].length; j++)
/*  62 */         arrayOfDouble[i][j] = paramArrayOfDouble[(i + j * paramInt)];
/*     */     }
/*  64 */     return arrayOfDouble;
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
/*     */   public static float[] floatTwoDtoOneD(float[][] paramArrayOfFloat)
/*     */   {
/*  82 */     int i = paramArrayOfFloat.length;
/*  83 */     float[] arrayOfFloat = new float[i * paramArrayOfFloat[0].length];
/*     */     
/*  85 */     for (int j = 0; j < i; j++) {
/*  86 */       for (int k = 0; k < paramArrayOfFloat[0].length; k++)
/*  87 */         arrayOfFloat[(j + k * i)] = paramArrayOfFloat[j][k];
/*     */     }
/*  89 */     return arrayOfFloat;
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
/*     */   public static float[][] floatOneDtoTwoD(float[] paramArrayOfFloat, int paramInt)
/*     */   {
/* 104 */     float[][] arrayOfFloat = new float[paramInt][paramArrayOfFloat.length / paramInt];
/*     */     
/* 106 */     for (int i = 0; i < paramInt; i++) {
/* 107 */       for (int j = 0; j < arrayOfFloat[0].length; j++)
/* 108 */         arrayOfFloat[i][j] = paramArrayOfFloat[(i + j * paramInt)];
/*     */     }
/* 110 */     return arrayOfFloat;
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
/*     */   public static int[] intTwoDtoOneD(int[][] paramArrayOfInt)
/*     */   {
/* 128 */     int i = paramArrayOfInt.length;
/* 129 */     int[] arrayOfInt = new int[i * paramArrayOfInt[0].length];
/*     */     
/* 131 */     for (int j = 0; j < i; j++) {
/* 132 */       for (int k = 0; k < paramArrayOfInt[0].length; k++)
/* 133 */         arrayOfInt[(j + k * i)] = paramArrayOfInt[j][k];
/*     */     }
/* 135 */     return arrayOfInt;
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
/*     */   public static int[][] intOneDtoTwoD(int[] paramArrayOfInt, int paramInt)
/*     */   {
/* 150 */     int[][] arrayOfInt = new int[paramInt][paramArrayOfInt.length / paramInt];
/*     */     
/*     */ 
/* 153 */     for (int i = 0; i < paramInt; i++) {
/* 154 */       for (int j = 0; j < arrayOfInt[0].length; j++)
/* 155 */         arrayOfInt[i][j] = paramArrayOfInt[(i + j * paramInt)];
/*     */     }
/* 157 */     return arrayOfInt;
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
/*     */   public static void copyOneDintoTwoD(double[][] paramArrayOfDouble, double[] paramArrayOfDouble1)
/*     */   {
/* 172 */     int k = paramArrayOfDouble.length;
/*     */     
/* 174 */     for (int i = 0; i < k; i++) {
/* 175 */       for (int j = 0; j < paramArrayOfDouble[0].length; j++) {
/* 176 */         paramArrayOfDouble[i][j] = paramArrayOfDouble1[(i + j * k)];
/*     */       }
/*     */     }
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
/*     */   public static void copyOneDintoTwoD(float[][] paramArrayOfFloat, float[] paramArrayOfFloat1)
/*     */   {
/* 191 */     int k = paramArrayOfFloat.length;
/*     */     
/* 193 */     for (int i = 0; i < k; i++) {
/* 194 */       for (int j = 0; j < paramArrayOfFloat[0].length; j++) {
/* 195 */         paramArrayOfFloat[i][j] = paramArrayOfFloat1[(i + j * k)];
/*     */       }
/*     */     }
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
/*     */   public static void copyOneDintoTwoD(int[][] paramArrayOfInt, int[] paramArrayOfInt1)
/*     */   {
/* 210 */     int k = paramArrayOfInt.length;
/*     */     
/* 212 */     for (int i = 0; i < k; i++) {
/* 213 */       for (int j = 0; j < paramArrayOfInt[0].length; j++) {
/* 214 */         paramArrayOfInt[i][j] = paramArrayOfInt1[(i + j * k)];
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/MatConv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */