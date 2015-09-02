package org.j_paine.formatter;

abstract interface FormatOutputList
{
  public abstract boolean hasCurrentElement();
  
  public abstract void checkCurrentElementForWrite(FormatElement paramFormatElement)
    throws EndOfVectorOnWriteException;
  
  public abstract Object getCurrentElement();
  
  public abstract Object getCurrentElementAndAdvance();
  
  public abstract int getPtr();
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatOutputList.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */