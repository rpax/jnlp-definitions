package javax.jnlp;

import java.io.IOException;

public abstract interface FileOpenService
{
  public abstract FileContents openFileDialog(String paramString, String[] paramArrayOfString)
    throws IOException;
  
  public abstract FileContents[] openMultiFileDialog(String paramString, String[] paramArrayOfString)
    throws IOException;
}
