package org.j_paine.formatter;

import java.io.PrintStream;

abstract class FormatElement
  extends FormatUniv
{
  public abstract void write(FormatOutputList paramFormatOutputList, PrintStream paramPrintStream)
    throws OutputFormatException;
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatElement.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */