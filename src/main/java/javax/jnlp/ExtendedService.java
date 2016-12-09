package javax.jnlp;

import java.io.File;
import java.io.IOException;

public abstract interface ExtendedService
{
  public abstract FileContents openFile(File paramFile)
    throws IOException;
  
  public abstract FileContents[] openFiles(File[] paramArrayOfFile)
    throws IOException;
}
