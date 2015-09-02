/*    */ package org.j_paine.formatter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EndOfFileWhenStartingReadException
/*    */   extends InputFormatException
/*    */ {
/*    */   public EndOfFileWhenStartingReadException(int paramInt1, String paramString1, String paramString2, int paramInt2)
/*    */   {
/* 16 */     this("End of file when starting read of formatted data:\n  Index  = " + paramInt1 + "\n" + "  Format = " + paramString1 + "\n" + "Last line was number " + paramInt2 + ":\n" + paramString2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public EndOfFileWhenStartingReadException(String paramString)
/*    */   {
/* 26 */     super(paramString);
/*    */   }
/*    */   
/*    */   public EndOfFileWhenStartingReadException() {}
/*    */ }


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/EndOfFileWhenStartingReadException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */