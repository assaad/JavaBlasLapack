package org.netlib.arpack;

public final class Sstats
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sstats()
  {
    arpack_timing.nopx.val = 0;
    arpack_timing.nbx.val = 0;
    arpack_timing.nrorth.val = 0;
    arpack_timing.nitref.val = 0;
    arpack_timing.nrstrt.val = 0;
    arpack_timing.tsaupd.val = 0.0F;
    arpack_timing.tsaup2.val = 0.0F;
    arpack_timing.tsaitr.val = 0.0F;
    arpack_timing.tseigt.val = 0.0F;
    arpack_timing.tsgets.val = 0.0F;
    arpack_timing.tsapps.val = 0.0F;
    arpack_timing.tsconv.val = 0.0F;
    arpack_timing.titref.val = 0.0F;
    arpack_timing.tgetv0.val = 0.0F;
    arpack_timing.trvec.val = 0.0F;
    arpack_timing.tmvopx.val = 0.0F;
    arpack_timing.tmvbx.val = 0.0F;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sstats.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */