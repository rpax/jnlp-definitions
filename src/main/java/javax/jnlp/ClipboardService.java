package javax.jnlp;

import java.awt.datatransfer.Transferable;

public abstract interface ClipboardService
{
  public abstract Transferable getContents();
  
  public abstract void setContents(Transferable paramTransferable);
}
