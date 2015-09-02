/*     */ package org.netlib.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
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
/*     */ public class EasyIn
/*     */ {
/*  40 */   static String line = null;
/*     */   static int idx;
/*  42 */   static int len; static String blank_string = "                                                                                           ";
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String myCrappyReadLine()
/*     */     throws IOException
/*     */   {
/*  50 */     StringBuffer localStringBuffer = new StringBuffer();
/*  51 */     int i = 0;
/*     */     
/*  53 */     while (i >= 0) {
/*  54 */       i = System.in.read();
/*     */       
/*  56 */       if (i < 0) {
/*  57 */         return null;
/*     */       }
/*  59 */       if ((char)i == '\n') {
/*     */         break;
/*     */       }
/*  62 */       localStringBuffer.append((char)i);
/*     */     }
/*     */     
/*  65 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void initTokenizer()
/*     */     throws IOException
/*     */   {
/*     */     do
/*     */     {
/*  75 */       line = myCrappyReadLine();
/*     */       
/*  77 */       if (line == null) {
/*  78 */         throw new IOException("EOF");
/*     */       }
/*  80 */       idx = 0;
/*  81 */       len = line.length();
/*  82 */     } while (!hasTokens(line));
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
/*     */   private boolean hasTokens(String paramString)
/*     */   {
/*  96 */     int j = paramString.length();
/*     */     
/*  98 */     for (int i = 0; i < j; i++) {
/*  99 */       if (!isDelim(paramString.charAt(i)))
/* 100 */         return true;
/*     */     }
/* 102 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean isDelim(char paramChar)
/*     */   {
/* 114 */     return (paramChar == ' ') || (paramChar == '\t') || (paramChar == '\r') || (paramChar == '\n');
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean moreTokens()
/*     */   {
/* 124 */     return idx < len;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private String getToken()
/*     */     throws IOException
/*     */   {
/* 137 */     if ((line == null) || (!moreTokens())) {
/* 138 */       initTokenizer();
/*     */     }
/* 140 */     while ((idx < len) && (isDelim(line.charAt(idx)))) {
/* 141 */       idx += 1;
/*     */     }
/* 143 */     if (idx == len) {
/* 144 */       initTokenizer();
/* 145 */       while ((idx < len) && (isDelim(line.charAt(idx)))) {
/* 146 */         idx += 1;
/*     */       }
/*     */     }
/* 149 */     int i = idx;
/*     */     
/* 151 */     while ((idx < len) && (!isDelim(line.charAt(idx)))) {
/* 152 */       idx += 1;
/*     */     }
/* 154 */     int j = idx;
/*     */     
/* 156 */     return line.substring(i, j);
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
/*     */   public String readchars(int paramInt)
/*     */     throws IOException
/*     */   {
/* 172 */     if ((line == null) || (!moreTokens())) {
/* 173 */       initTokenizer();
/*     */     }
/* 175 */     int i = idx;
/*     */     
/* 177 */     if (i + paramInt < len)
/*     */     {
/* 179 */       idx += paramInt;
/* 180 */       return line.substring(i, i + paramInt);
/*     */     }
/*     */     
/*     */ 
/* 184 */     idx = len;
/* 185 */     return line.substring(i, len) + blank_string.substring(0, paramInt - (len - i));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String readChars(int paramInt)
/*     */   {
/*     */     try
/*     */     {
/* 199 */       return readchars(paramInt);
/*     */     } catch (IOException localIOException) {
/* 201 */       System.err.println("IO Exception in EasyIn.readChars"); }
/* 202 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void skipRemaining()
/*     */   {
/* 210 */     line = null;
/* 211 */     idx = len;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean readboolean()
/*     */     throws IOException
/*     */   {
/* 222 */     int i = getToken().charAt(0);
/* 223 */     if ((i == 116) || (i == 84)) {
/* 224 */       return true;
/*     */     }
/* 226 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean readBoolean()
/*     */   {
/*     */     try
/*     */     {
/* 237 */       int i = getToken().charAt(0);
/* 238 */       if ((i == 116) || (i == 84)) {
/* 239 */         return true;
/*     */       }
/* 241 */       return false;
/*     */     } catch (IOException localIOException) {
/* 243 */       System.err.println("IO Exception in EasyIn.readBoolean"); }
/* 244 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte readbyte()
/*     */     throws IOException
/*     */   {
/* 256 */     return Byte.parseByte(getToken());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte readByte()
/*     */   {
/*     */     try
/*     */     {
/* 267 */       return Byte.parseByte(getToken());
/*     */     } catch (IOException localIOException) {
/* 269 */       System.err.println("IO Exception in EasyIn.readByte"); }
/* 270 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public short readshort()
/*     */     throws IOException
/*     */   {
/* 282 */     return Short.parseShort(getToken());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public short readShort()
/*     */   {
/*     */     try
/*     */     {
/* 293 */       return Short.parseShort(getToken());
/*     */     } catch (IOException localIOException) {
/* 295 */       System.err.println("IO Exception in EasyIn.readShort"); }
/* 296 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int readint()
/*     */     throws IOException
/*     */   {
/* 308 */     return Integer.parseInt(getToken());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int readInt()
/*     */   {
/*     */     try
/*     */     {
/* 319 */       return Integer.parseInt(getToken());
/*     */     } catch (IOException localIOException) {
/* 321 */       System.err.println("IO Exception in EasyIn.readInt"); }
/* 322 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long readlong()
/*     */     throws IOException
/*     */   {
/* 334 */     return Long.parseLong(getToken());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public long readLong()
/*     */   {
/*     */     try
/*     */     {
/* 345 */       return Long.parseLong(getToken());
/*     */     } catch (IOException localIOException) {
/* 347 */       System.err.println("IO Exception in EasyIn.readLong"); }
/* 348 */     return 0L;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public float readfloat()
/*     */     throws IOException
/*     */   {
/* 360 */     return new Float(getToken()).floatValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public float readFloat()
/*     */   {
/*     */     try
/*     */     {
/* 371 */       return new Float(getToken()).floatValue();
/*     */     } catch (IOException localIOException) {
/* 373 */       System.err.println("IO Exception in EasyIn.readFloat"); }
/* 374 */     return 0.0F;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public double readdouble()
/*     */     throws IOException
/*     */   {
/* 386 */     String str = getToken();
/*     */     
/* 388 */     str = str.replace('D', 'E');
/* 389 */     str = str.replace('d', 'e');
/*     */     
/* 391 */     return new Double(str).doubleValue();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public double readDouble()
/*     */   {
/*     */     try
/*     */     {
/* 402 */       String str = getToken();
/*     */       
/* 404 */       str = str.replace('D', 'E');
/* 405 */       str = str.replace('d', 'e');
/*     */       
/* 407 */       return new Double(str).doubleValue();
/*     */     } catch (IOException localIOException) {
/* 409 */       System.err.println("IO Exception in EasyIn.readDouble"); }
/* 410 */     return 0.0D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public char readchar()
/*     */     throws IOException
/*     */   {
/* 422 */     return getToken().charAt(0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public char readChar()
/*     */   {
/*     */     try
/*     */     {
/* 433 */       return getToken().charAt(0);
/*     */     } catch (IOException localIOException) {
/* 435 */       System.err.println("IO Exception in EasyIn.readChar"); }
/* 436 */     return '\000';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String readstring()
/*     */     throws IOException
/*     */   {
/* 448 */     return myCrappyReadLine();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String readString()
/*     */   {
/*     */     try
/*     */     {
/* 459 */       return myCrappyReadLine();
/*     */     } catch (IOException localIOException) {
/* 461 */       System.err.println("IO Exception in EasyIn.readString"); }
/* 462 */     return "";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/* 471 */     EasyIn localEasyIn = new EasyIn();
/*     */     
/* 473 */     System.out.print("enter char: ");System.out.flush();
/* 474 */     System.out.println("You entered: " + localEasyIn.readChar());
/*     */     
/* 476 */     System.out.print("enter String: ");System.out.flush();
/* 477 */     System.out.println("You entered: " + localEasyIn.readString());
/*     */     
/* 479 */     System.out.print("enter boolean: ");System.out.flush();
/* 480 */     System.out.println("You entered: " + localEasyIn.readBoolean());
/*     */     
/* 482 */     System.out.print("enter byte: ");System.out.flush();
/* 483 */     System.out.println("You entered: " + localEasyIn.readByte());
/*     */     
/* 485 */     System.out.print("enter short: ");System.out.flush();
/* 486 */     System.out.println("You entered: " + localEasyIn.readShort());
/*     */     
/* 488 */     System.out.print("enter int: ");System.out.flush();
/* 489 */     System.out.println("You entered: " + localEasyIn.readInt());
/*     */     
/* 491 */     System.out.print("enter long: ");System.out.flush();
/* 492 */     System.out.println("You entered: " + localEasyIn.readLong());
/*     */     
/* 494 */     System.out.print("enter float: ");System.out.flush();
/* 495 */     System.out.println("You entered: " + localEasyIn.readFloat());
/*     */     
/* 497 */     System.out.print("enter double: ");System.out.flush();
/* 498 */     System.out.println("You entered: " + localEasyIn.readDouble());
/*     */   }
/*     */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/util/EasyIn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */