package org.j_paine.formatter;

abstract interface FormatInputList
{
  public abstract void checkCurrentElementForRead(FormatElement paramFormatElement, InputStreamAndBuffer paramInputStreamAndBuffer)
    throws InputFormatException;
  
  public abstract void putElementAndAdvance(Object paramObject, FormatElement paramFormatElement, InputStreamAndBuffer paramInputStreamAndBuffer)
    throws InputFormatException;
  
  public abstract int getPtr();
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatInputList.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */