/*     */ package org.j_paine.formatter;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Hashtable;
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
/*     */ public class Formatter
/*     */ {
/*  24 */   private Format format = null;
/*  25 */   private FormatMap format_map = null;
/*     */   
/*     */   public Formatter(String paramString)
/*     */     throws InvalidFormatException
/*     */   {
/*  30 */     this(new Format(paramString));
/*     */   }
/*     */   
/*     */   public Formatter(Format paramFormat)
/*     */   {
/*  35 */     this.format = paramFormat;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFormatMap(FormatMap paramFormatMap)
/*     */   {
/*  41 */     this.format_map = paramFormatMap;
/*     */   }
/*     */   
/*     */ 
/*     */   public void write(Vector paramVector, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  48 */     FormatX localFormatX = new FormatX();
/*  49 */     VectorAndPointer localVectorAndPointer = new VectorAndPointer(paramVector);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*     */       for (;;)
/*     */       {
/*  58 */         this.format.write(localVectorAndPointer, paramPrintStream);
/*  59 */         localVectorAndPointer.checkCurrentElementForWrite(localFormatX);
/*  60 */         paramPrintStream.println();
/*     */       }
/*     */       return;
/*     */     }
/*     */     catch (EndOfVectorOnWriteException localEndOfVectorOnWriteException) {}
/*     */   }
/*     */   
/*     */   public void write(int paramInt, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  70 */     write(new Integer(paramInt), paramPrintStream);
/*     */   }
/*     */   
/*     */   public void write(long paramLong, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  76 */     write(new Long(paramLong), paramPrintStream);
/*     */   }
/*     */   
/*     */   public void write(float paramFloat, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  82 */     write(new Float(paramFloat), paramPrintStream);
/*     */   }
/*     */   
/*     */   public void write(double paramDouble, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  88 */     write(new Double(paramDouble), paramPrintStream);
/*     */   }
/*     */   
/*     */   public void write(Object paramObject, PrintStream paramPrintStream)
/*     */     throws OutputFormatException
/*     */   {
/*  94 */     Vector localVector = new Vector();
/*  95 */     localVector.addElement(paramObject);
/*  96 */     write(localVector, paramPrintStream);
/*     */   }
/*     */   
/*     */ 
/*     */   public void read(Vector paramVector, DataInputStream paramDataInputStream)
/*     */     throws InputFormatException
/*     */   {
/* 103 */     VectorAndPointer localVectorAndPointer = new VectorAndPointer(paramVector);
/* 104 */     InputStreamAndBuffer localInputStreamAndBuffer = new InputStreamAndBuffer(paramDataInputStream);
/* 105 */     this.format.read(localVectorAndPointer, localInputStreamAndBuffer, this.format_map);
/*     */   }
/*     */   
/*     */   public void read(Vector paramVector, Hashtable paramHashtable, DataInputStream paramDataInputStream)
/*     */     throws InputFormatException
/*     */   {
/* 111 */     StringsHashtableAndPointer localStringsHashtableAndPointer = new StringsHashtableAndPointer(paramVector, paramHashtable);
/* 112 */     InputStreamAndBuffer localInputStreamAndBuffer = new InputStreamAndBuffer(paramDataInputStream);
/* 113 */     this.format.read(localStringsHashtableAndPointer, localInputStreamAndBuffer, this.format_map);
/*     */   }
/*     */   
/*     */   public void read(String[] paramArrayOfString, Hashtable paramHashtable, DataInputStream paramDataInputStream)
/*     */     throws InputFormatException
/*     */   {
/* 119 */     Vector localVector = new Vector();
/* 120 */     for (int i = 0; i < paramArrayOfString.length; i++)
/* 121 */       localVector.addElement(paramArrayOfString[i]);
/* 122 */     read(localVector, paramHashtable, paramDataInputStream);
/*     */   }
/*     */   
/*     */   public Object read(DataInputStream paramDataInputStream)
/*     */     throws InputFormatException
/*     */   {
/* 128 */     Vector localVector = new Vector();
/* 129 */     read(localVector, paramDataInputStream);
/* 130 */     return localVector.elementAt(0);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean eof(DataInputStream paramDataInputStream)
/*     */     throws IOException
/*     */   {
/* 137 */     return paramDataInputStream.available() <= 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public String toString()
/*     */   {
/* 143 */     return "[Formatter " + this.format.toString() + "]";
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/Formatter.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */