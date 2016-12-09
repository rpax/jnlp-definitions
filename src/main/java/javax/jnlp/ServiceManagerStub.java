package javax.jnlp;

public abstract interface ServiceManagerStub
{
  public abstract Object lookup(String paramString)
    throws UnavailableServiceException;
  
  public abstract String[] getServiceNames();
}
