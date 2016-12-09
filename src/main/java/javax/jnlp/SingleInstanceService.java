package javax.jnlp;

public abstract interface SingleInstanceService
{
  public abstract void addSingleInstanceListener(SingleInstanceListener paramSingleInstanceListener);
  
  public abstract void removeSingleInstanceListener(SingleInstanceListener paramSingleInstanceListener);
}