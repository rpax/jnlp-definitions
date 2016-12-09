package javax.jnlp;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;

public abstract interface PrintService
{
  public abstract PageFormat getDefaultPage();
  
  public abstract PageFormat showPageFormatDialog(PageFormat paramPageFormat);
  
  public abstract boolean print(Pageable paramPageable);
  
  public abstract boolean print(Printable paramPrintable);
}
