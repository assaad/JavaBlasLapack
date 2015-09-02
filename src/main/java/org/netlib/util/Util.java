/*     */ package org.netlib.util;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import org.j_paine.formatter.EndOfFileWhenStartingReadException;
/*     */ import org.j_paine.formatter.Formatter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Util
/*     */ {
/*     */   public static String stringInsert(String paramString1, String paramString2, int paramInt1, int paramInt2)
/*     */   {
/*  63 */     String str = new String(paramString1.substring(0, paramInt1 - 1) + paramString2.substring(0, paramInt2 - paramInt1 + 1) + paramString1.substring(paramInt2, paramString1.length()));
/*     */     
/*     */ 
/*     */ 
/*  67 */     return str;
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
/*     */   public static String stringInsert(String paramString1, String paramString2, int paramInt)
/*     */   {
/*  81 */     return stringInsert(paramString1, paramString2, paramInt, paramInt);
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
/*     */   public static String strCharAt(String paramString, int paramInt)
/*     */   {
/*  94 */     return String.valueOf(paramString.charAt(paramInt - 1));
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
/*     */   public static int max(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 107 */     return Math.max(paramInt1 > paramInt2 ? paramInt1 : paramInt2, Math.max(paramInt2, paramInt3));
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
/*     */   public static float max(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 120 */     return Math.max(paramFloat1 > paramFloat2 ? paramFloat1 : paramFloat2, Math.max(paramFloat2, paramFloat3));
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
/*     */   public static double max(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 133 */     return Math.max(paramDouble1 > paramDouble2 ? paramDouble1 : paramDouble2, Math.max(paramDouble2, paramDouble3));
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
/*     */   public static int min(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 146 */     return Math.min(paramInt1 < paramInt2 ? paramInt1 : paramInt2, Math.min(paramInt2, paramInt3));
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
/*     */   public static float min(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 159 */     return Math.min(paramFloat1 < paramFloat2 ? paramFloat1 : paramFloat2, Math.min(paramFloat2, paramFloat3));
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
/*     */   public static double min(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 172 */     return Math.min(paramDouble1 < paramDouble2 ? paramDouble1 : paramDouble2, Math.min(paramDouble2, paramDouble3));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double log10(double paramDouble)
/*     */   {
/* 183 */     return Math.log(paramDouble) / 2.30258509D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float log10(float paramFloat)
/*     */   {
/* 194 */     return (float)(Math.log(paramFloat) / 2.30258509D);
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
/*     */   public static int nint(float paramFloat)
/*     */   {
/* 211 */     return (int)(paramFloat >= 0.0F ? paramFloat + 0.5D : paramFloat - 0.5D);
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
/*     */   public static int idnint(double paramDouble)
/*     */   {
/* 228 */     return (int)(paramDouble >= 0.0D ? paramDouble + 0.5D : paramDouble - 0.5D);
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
/*     */   public static float sign(float paramFloat1, float paramFloat2)
/*     */   {
/* 246 */     return paramFloat2 >= 0.0F ? Math.abs(paramFloat1) : -Math.abs(paramFloat1);
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
/*     */   public static int isign(int paramInt1, int paramInt2)
/*     */   {
/* 264 */     return paramInt2 >= 0 ? Math.abs(paramInt1) : -Math.abs(paramInt1);
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
/*     */   public static double dsign(double paramDouble1, double paramDouble2)
/*     */   {
/* 282 */     return paramDouble2 >= 0.0D ? Math.abs(paramDouble1) : -Math.abs(paramDouble1);
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
/*     */   public static float dim(float paramFloat1, float paramFloat2)
/*     */   {
/* 300 */     return paramFloat1 > paramFloat2 ? paramFloat1 - paramFloat2 : 0.0F;
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
/*     */   public static int idim(int paramInt1, int paramInt2)
/*     */   {
/* 318 */     return paramInt1 > paramInt2 ? paramInt1 - paramInt2 : 0;
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
/*     */   public static double ddim(double paramDouble1, double paramDouble2)
/*     */   {
/* 336 */     return paramDouble1 > paramDouble2 ? paramDouble1 - paramDouble2 : 0.0D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double sinh(double paramDouble)
/*     */   {
/* 347 */     return (Math.exp(paramDouble) - Math.exp(-paramDouble)) * 0.5D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double cosh(double paramDouble)
/*     */   {
/* 358 */     return (Math.exp(paramDouble) + Math.exp(-paramDouble)) * 0.5D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static double tanh(double paramDouble)
/*     */   {
/* 369 */     return sinh(paramDouble) / cosh(paramDouble);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void pause()
/*     */   {
/* 378 */     pause(null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void pause(String paramString)
/*     */   {
/* 390 */     if (paramString != null) {
/* 391 */       System.err.println("PAUSE: " + paramString);
/*     */     } else {
/* 393 */       System.err.print("PAUSE: ");
/*     */     }
/* 395 */     System.err.println("To resume execution, type:   go");
/* 396 */     System.err.println("Any other input will terminate the program.");
/*     */     
/* 398 */     BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(System.in));
/*     */     
/* 400 */     String str = null;
/*     */     try
/*     */     {
/* 403 */       str = localBufferedReader.readLine();
/*     */     } catch (IOException localIOException) {
/* 405 */       str = null;
/*     */     }
/*     */     
/* 408 */     if ((str == null) || (!str.equals("go"))) {
/* 409 */       System.err.println("STOP");
/* 410 */       System.exit(0);
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
/*     */   public static void f77write(String paramString, Vector paramVector)
/*     */   {
/* 423 */     if (paramString == null) {
/* 424 */       f77write(paramVector);
/* 425 */       return;
/*     */     }
/*     */     try
/*     */     {
/* 429 */       Formatter localFormatter = new Formatter(paramString);
/* 430 */       localObject = processVector(paramVector);
/* 431 */       localFormatter.write((Vector)localObject, System.out);
/* 432 */       System.out.println();
/*     */     }
/*     */     catch (Exception localException) {
/* 435 */       Object localObject = localException.getMessage();
/*     */       
/* 437 */       if (localObject != null) {
/* 438 */         System.out.println((String)localObject);
/*     */       } else {
/* 440 */         System.out.println();
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
/*     */   public static void f77write(Vector paramVector)
/*     */   {
/* 455 */     Vector localVector = processVector(paramVector);
/*     */     
/* 457 */     Enumeration localEnumeration = localVector.elements();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */     if (localEnumeration.hasMoreElements()) {
/* 466 */       Object localObject = localEnumeration.nextElement();
/* 467 */       if ((localObject instanceof String))
/* 468 */         System.out.print(" ");
/* 469 */       output_unformatted_element(localObject);
/*     */     }
/*     */     
/* 472 */     while (localEnumeration.hasMoreElements()) {
/* 473 */       output_unformatted_element(localEnumeration.nextElement());
/*     */     }
/* 475 */     System.out.println();
/*     */   }
/*     */   
/*     */   private static void output_unformatted_element(Object paramObject) {
/* 479 */     if ((paramObject instanceof Boolean))
/*     */     {
/* 481 */       if (((Boolean)paramObject).booleanValue()) {
/* 482 */         System.out.print(" T");
/*     */       } else {
/* 484 */         System.out.print(" F");
/*     */       }
/* 486 */     } else if (((paramObject instanceof Float)) || ((paramObject instanceof Double))) {
/* 487 */       System.out.print("  " + paramObject);
/* 488 */     } else if ((paramObject instanceof String)) {
/* 489 */       System.out.print(paramObject);
/*     */     } else {
/* 491 */       System.out.print(" " + paramObject);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int f77read(String paramString, Vector paramVector)
/*     */   {
/*     */     try
/*     */     {
/* 504 */       Formatter localFormatter = new Formatter(paramString);
/* 505 */       localFormatter.read(paramVector, new DataInputStream(System.in));
/*     */     }
/*     */     catch (EndOfFileWhenStartingReadException localEndOfFileWhenStartingReadException) {
/* 508 */       return 0;
/*     */     }
/*     */     catch (Exception localException) {
/* 511 */       String str = localException.getMessage();
/*     */       
/* 513 */       if (str != null) {
/* 514 */         System.out.println(str);
/*     */       } else {
/* 516 */         System.out.println("Warning: READ exception.");
/*     */       }
/* 518 */       return -1;
/*     */     }
/*     */     
/* 521 */     return paramVector.size();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   static Vector processVector(Vector paramVector)
/*     */   {
/* 532 */     Vector localVector = new Vector();
/*     */     
/* 534 */     for (Enumeration localEnumeration = paramVector.elements(); localEnumeration.hasMoreElements();) {
/* 535 */       Object localObject = localEnumeration.nextElement();
/*     */       
/* 537 */       if ((localObject instanceof ArraySpec)) {
/* 538 */         localVector.addAll(((ArraySpec)localObject).get_vec());
/*     */       } else {
/* 540 */         localVector.addElement(localObject);
/*     */       }
/*     */     }
/* 543 */     return localVector;
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/Util.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */