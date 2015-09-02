package org.j_paine.formatter;

import java.io.PrintStream;

abstract class FormatUniv
{
  abstract void write(FormatOutputList paramFormatOutputList, PrintStream paramPrintStream)
    throws OutputFormatException;
  
  abstract void read(FormatInputList paramFormatInputList, InputStreamAndBuffer paramInputStreamAndBuffer, FormatMap paramFormatMap)
    throws InputFormatException;
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/j_paine/formatter/FormatUniv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */