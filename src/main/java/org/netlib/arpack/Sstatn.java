package org.netlib.arpack;

public final class Sstatn
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sstatn()
  {
    arpack_timing.nopx.val = 0;
    arpack_timing.nbx.val = 0;
    arpack_timing.nrorth.val = 0;
    arpack_timing.nitref.val = 0;
    arpack_timing.nrstrt.val = 0;
    arpack_timing.tnaupd.val = 0.0F;
    arpack_timing.tnaup2.val = 0.0F;
    arpack_timing.tnaitr.val = 0.0F;
    arpack_timing.tneigh.val = 0.0F;
    arpack_timing.tngets.val = 0.0F;
    arpack_timing.tnapps.val = 0.0F;
    arpack_timing.tnconv.val = 0.0F;
    arpack_timing.titref.val = 0.0F;
    arpack_timing.tgetv0.val = 0.0F;
    arpack_timing.trvec.val = 0.0F;
    arpack_timing.tmvopx.val = 0.0F;
    arpack_timing.tmvbx.val = 0.0F;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sstatn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */