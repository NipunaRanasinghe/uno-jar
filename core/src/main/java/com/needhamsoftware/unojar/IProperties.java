package com.needhamsoftware.unojar;

/**
 * Interface to the controlling properties for a JarClassLoader.
 *
 * @author simon
 */
public interface IProperties {

  public void setVerbose(boolean verbose);

  public void setInfo(boolean info);

  public void setSilent(boolean silent);

  public void setRecord(boolean record);

  public void setFlatten(boolean flatten);

  public void setRecording(String recording);

}
