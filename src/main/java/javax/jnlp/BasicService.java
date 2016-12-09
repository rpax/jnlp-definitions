package javax.jnlp;

import java.net.URL;

public abstract interface BasicService
{
  public abstract URL getCodeBase();
  
  public abstract boolean isOffline();
  
  public abstract boolean showDocument(URL paramURL);
  
  public abstract boolean isWebBrowserSupported();
}
