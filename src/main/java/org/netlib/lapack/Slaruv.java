package org.netlib.lapack;

public final class Slaruv
{
  public static int[] mm = new int['' * 4];
  
  static
  {
    mm[(1 - 1 + (1 - 1) * 128)] = 494;
    mm[(1 - 1 + (2 - 1) * 128)] = 322;
    mm[(1 - 1 + (3 - 1) * 128)] = 2508;
    mm[(1 - 1 + (4 - 1) * 128)] = 2549;
    mm[(2 - 1 + (1 - 1) * 128)] = 2637;
    mm[(2 - 1 + (2 - 1) * 128)] = 789;
    mm[(2 - 1 + (3 - 1) * 128)] = 3754;
    mm[(2 - 1 + (4 - 1) * 128)] = 1145;
    mm[(3 - 1 + (1 - 1) * 128)] = 255;
    mm[(3 - 1 + (2 - 1) * 128)] = 1440;
    mm[(3 - 1 + (3 - 1) * 128)] = 1766;
    mm[(3 - 1 + (4 - 1) * 128)] = 2253;
    mm[(4 - 1 + (1 - 1) * 128)] = 2008;
    mm[(4 - 1 + (2 - 1) * 128)] = 752;
    mm[(4 - 1 + (3 - 1) * 128)] = 3572;
    mm[(4 - 1 + (4 - 1) * 128)] = 305;
    mm[(5 - 1 + (1 - 1) * 128)] = 1253;
    mm[(5 - 1 + (2 - 1) * 128)] = 2859;
    mm[(5 - 1 + (3 - 1) * 128)] = 2893;
    mm[(5 - 1 + (4 - 1) * 128)] = 3301;
    mm[(6 - 1 + (1 - 1) * 128)] = 3344;
    mm[(6 - 1 + (2 - 1) * 128)] = 123;
    mm[(6 - 1 + (3 - 1) * 128)] = 307;
    mm[(6 - 1 + (4 - 1) * 128)] = 1065;
    mm[(7 - 1 + (1 - 1) * 128)] = 4084;
    mm[(7 - 1 + (2 - 1) * 128)] = 1848;
    mm[(7 - 1 + (3 - 1) * 128)] = 1297;
    mm[(7 - 1 + (4 - 1) * 128)] = 3133;
    mm[(8 - 1 + (1 - 1) * 128)] = 1739;
    mm[(8 - 1 + (2 - 1) * 128)] = 643;
    mm[(8 - 1 + (3 - 1) * 128)] = 3966;
    mm[(8 - 1 + (4 - 1) * 128)] = 2913;
    mm[(9 - 1 + (1 - 1) * 128)] = 3143;
    mm[(9 - 1 + (2 - 1) * 128)] = 2405;
    mm[(9 - 1 + (3 - 1) * 128)] = 758;
    mm[(9 - 1 + (4 - 1) * 128)] = 3285;
    mm[(10 - 1 + (1 - 1) * 128)] = 3468;
    mm[(10 - 1 + (2 - 1) * 128)] = 2638;
    mm[(10 - 1 + (3 - 1) * 128)] = 2598;
    mm[(10 - 1 + (4 - 1) * 128)] = 1241;
    mm[(11 - 1 + (1 - 1) * 128)] = 688;
    mm[(11 - 1 + (2 - 1) * 128)] = 2344;
    mm[(11 - 1 + (3 - 1) * 128)] = 3406;
    mm[(11 - 1 + (4 - 1) * 128)] = 1197;
    mm[(12 - 1 + (1 - 1) * 128)] = 1657;
    mm[(12 - 1 + (2 - 1) * 128)] = 46;
    mm[(12 - 1 + (3 - 1) * 128)] = 2922;
    mm[(12 - 1 + (4 - 1) * 128)] = 3729;
    mm[(13 - 1 + (1 - 1) * 128)] = 1238;
    mm[(13 - 1 + (2 - 1) * 128)] = 3814;
    mm[(13 - 1 + (3 - 1) * 128)] = 1038;
    mm[(13 - 1 + (4 - 1) * 128)] = 2501;
    mm[(14 - 1 + (1 - 1) * 128)] = 3166;
    mm[(14 - 1 + (2 - 1) * 128)] = 913;
    mm[(14 - 1 + (3 - 1) * 128)] = 2934;
    mm[(14 - 1 + (4 - 1) * 128)] = 1673;
    mm[(15 - 1 + (1 - 1) * 128)] = 1292;
    mm[(15 - 1 + (2 - 1) * 128)] = 3649;
    mm[(15 - 1 + (3 - 1) * 128)] = 2091;
    mm[(15 - 1 + (4 - 1) * 128)] = 541;
    mm[(16 - 1 + (1 - 1) * 128)] = 3422;
    mm[(16 - 1 + (2 - 1) * 128)] = 339;
    mm[(16 - 1 + (3 - 1) * 128)] = 2451;
    mm[(16 - 1 + (4 - 1) * 128)] = 2753;
    mm[(17 - 1 + (1 - 1) * 128)] = 1270;
    mm[(17 - 1 + (2 - 1) * 128)] = 3808;
    mm[(17 - 1 + (3 - 1) * 128)] = 1580;
    mm[(17 - 1 + (4 - 1) * 128)] = 949;
    mm[(18 - 1 + (1 - 1) * 128)] = 2016;
    mm[(18 - 1 + (2 - 1) * 128)] = 822;
    mm[(18 - 1 + (3 - 1) * 128)] = 1958;
    mm[(18 - 1 + (4 - 1) * 128)] = 2361;
    mm[(19 - 1 + (1 - 1) * 128)] = 154;
    mm[(19 - 1 + (2 - 1) * 128)] = 2832;
    mm[(19 - 1 + (3 - 1) * 128)] = 2055;
    mm[(19 - 1 + (4 - 1) * 128)] = 1165;
    mm[(20 - 1 + (1 - 1) * 128)] = 2862;
    mm[(20 - 1 + (2 - 1) * 128)] = 3078;
    mm[(20 - 1 + (3 - 1) * 128)] = 1507;
    mm[(20 - 1 + (4 - 1) * 128)] = 4081;
    mm[(21 - 1 + (1 - 1) * 128)] = 697;
    mm[(21 - 1 + (2 - 1) * 128)] = 3633;
    mm[(21 - 1 + (3 - 1) * 128)] = 1078;
    mm[(21 - 1 + (4 - 1) * 128)] = 2725;
    mm[(22 - 1 + (1 - 1) * 128)] = 1706;
    mm[(22 - 1 + (2 - 1) * 128)] = 2970;
    mm[(22 - 1 + (3 - 1) * 128)] = 3273;
    mm[(22 - 1 + (4 - 1) * 128)] = 3305;
    mm[(23 - 1 + (1 - 1) * 128)] = 491;
    mm[(23 - 1 + (2 - 1) * 128)] = 637;
    mm[(23 - 1 + (3 - 1) * 128)] = 17;
    mm[(23 - 1 + (4 - 1) * 128)] = 3069;
    mm[(24 - 1 + (1 - 1) * 128)] = 931;
    mm[(24 - 1 + (2 - 1) * 128)] = 2249;
    mm[(24 - 1 + (3 - 1) * 128)] = 854;
    mm[(24 - 1 + (4 - 1) * 128)] = 3617;
    mm[(25 - 1 + (1 - 1) * 128)] = 1444;
    mm[(25 - 1 + (2 - 1) * 128)] = 2081;
    mm[(25 - 1 + (3 - 1) * 128)] = 2916;
    mm[(25 - 1 + (4 - 1) * 128)] = 3733;
    mm[(26 - 1 + (1 - 1) * 128)] = 444;
    mm[(26 - 1 + (2 - 1) * 128)] = 4019;
    mm[(26 - 1 + (3 - 1) * 128)] = 3971;
    mm[(26 - 1 + (4 - 1) * 128)] = 409;
    mm[(27 - 1 + (1 - 1) * 128)] = 3577;
    mm[(27 - 1 + (2 - 1) * 128)] = 1478;
    mm[(27 - 1 + (3 - 1) * 128)] = 2889;
    mm[(27 - 1 + (4 - 1) * 128)] = 2157;
    mm[(28 - 1 + (1 - 1) * 128)] = 3944;
    mm[(28 - 1 + (2 - 1) * 128)] = 242;
    mm[(28 - 1 + (3 - 1) * 128)] = 3831;
    mm[(28 - 1 + (4 - 1) * 128)] = 1361;
    mm[(29 - 1 + (1 - 1) * 128)] = 2184;
    mm[(29 - 1 + (2 - 1) * 128)] = 481;
    mm[(29 - 1 + (3 - 1) * 128)] = 2621;
    mm[(29 - 1 + (4 - 1) * 128)] = 3973;
    mm[(30 - 1 + (1 - 1) * 128)] = 1661;
    mm[(30 - 1 + (2 - 1) * 128)] = 2075;
    mm[(30 - 1 + (3 - 1) * 128)] = 1541;
    mm[(30 - 1 + (4 - 1) * 128)] = 1865;
    mm[(31 - 1 + (1 - 1) * 128)] = 3482;
    mm[(31 - 1 + (2 - 1) * 128)] = 4058;
    mm[(31 - 1 + (3 - 1) * 128)] = 893;
    mm[(31 - 1 + (4 - 1) * 128)] = 2525;
    mm[(32 - 1 + (1 - 1) * 128)] = 657;
    mm[(32 - 1 + (2 - 1) * 128)] = 622;
    mm[(32 - 1 + (3 - 1) * 128)] = 736;
    mm[(32 - 1 + (4 - 1) * 128)] = 1409;
    mm[(33 - 1 + (1 - 1) * 128)] = 3023;
    mm[(33 - 1 + (2 - 1) * 128)] = 3376;
    mm[(33 - 1 + (3 - 1) * 128)] = 3992;
    mm[(33 - 1 + (4 - 1) * 128)] = 3445;
    mm[(34 - 1 + (1 - 1) * 128)] = 3618;
    mm[(34 - 1 + (2 - 1) * 128)] = 812;
    mm[(34 - 1 + (3 - 1) * 128)] = 787;
    mm[(34 - 1 + (4 - 1) * 128)] = 3577;
    mm[(35 - 1 + (1 - 1) * 128)] = 1267;
    mm[(35 - 1 + (2 - 1) * 128)] = 234;
    mm[(35 - 1 + (3 - 1) * 128)] = 2125;
    mm[(35 - 1 + (4 - 1) * 128)] = 77;
    mm[(36 - 1 + (1 - 1) * 128)] = 1828;
    mm[(36 - 1 + (2 - 1) * 128)] = 641;
    mm[(36 - 1 + (3 - 1) * 128)] = 2364;
    mm[(36 - 1 + (4 - 1) * 128)] = 3761;
    mm[(37 - 1 + (1 - 1) * 128)] = 164;
    mm[(37 - 1 + (2 - 1) * 128)] = 4005;
    mm[(37 - 1 + (3 - 1) * 128)] = 2460;
    mm[(37 - 1 + (4 - 1) * 128)] = 2149;
    mm[(38 - 1 + (1 - 1) * 128)] = 3798;
    mm[(38 - 1 + (2 - 1) * 128)] = 1122;
    mm[(38 - 1 + (3 - 1) * 128)] = 257;
    mm[(38 - 1 + (4 - 1) * 128)] = 1449;
    mm[(39 - 1 + (1 - 1) * 128)] = 3087;
    mm[(39 - 1 + (2 - 1) * 128)] = 3135;
    mm[(39 - 1 + (3 - 1) * 128)] = 1574;
    mm[(39 - 1 + (4 - 1) * 128)] = 3005;
    mm[(40 - 1 + (1 - 1) * 128)] = 2400;
    mm[(40 - 1 + (2 - 1) * 128)] = 2640;
    mm[(40 - 1 + (3 - 1) * 128)] = 3912;
    mm[(40 - 1 + (4 - 1) * 128)] = 225;
    mm[(41 - 1 + (1 - 1) * 128)] = 2870;
    mm[(41 - 1 + (2 - 1) * 128)] = 2302;
    mm[(41 - 1 + (3 - 1) * 128)] = 1216;
    mm[(41 - 1 + (4 - 1) * 128)] = 85;
    mm[(42 - 1 + (1 - 1) * 128)] = 3876;
    mm[(42 - 1 + (2 - 1) * 128)] = 40;
    mm[(42 - 1 + (3 - 1) * 128)] = 3248;
    mm[(42 - 1 + (4 - 1) * 128)] = 3673;
    mm[(43 - 1 + (1 - 1) * 128)] = 1905;
    mm[(43 - 1 + (2 - 1) * 128)] = 1832;
    mm[(43 - 1 + (3 - 1) * 128)] = 3401;
    mm[(43 - 1 + (4 - 1) * 128)] = 3117;
    mm[(44 - 1 + (1 - 1) * 128)] = 1593;
    mm[(44 - 1 + (2 - 1) * 128)] = 2247;
    mm[(44 - 1 + (3 - 1) * 128)] = 2124;
    mm[(44 - 1 + (4 - 1) * 128)] = 3089;
    mm[(45 - 1 + (1 - 1) * 128)] = 1797;
    mm[(45 - 1 + (2 - 1) * 128)] = 2034;
    mm[(45 - 1 + (3 - 1) * 128)] = 2762;
    mm[(45 - 1 + (4 - 1) * 128)] = 1349;
    mm[(46 - 1 + (1 - 1) * 128)] = 1234;
    mm[(46 - 1 + (2 - 1) * 128)] = 2637;
    mm[(46 - 1 + (3 - 1) * 128)] = 149;
    mm[(46 - 1 + (4 - 1) * 128)] = 2057;
    mm[(47 - 1 + (1 - 1) * 128)] = 3460;
    mm[(47 - 1 + (2 - 1) * 128)] = 1287;
    mm[(47 - 1 + (3 - 1) * 128)] = 2245;
    mm[(47 - 1 + (4 - 1) * 128)] = 413;
    mm[(48 - 1 + (1 - 1) * 128)] = 328;
    mm[(48 - 1 + (2 - 1) * 128)] = 1691;
    mm[(48 - 1 + (3 - 1) * 128)] = 166;
    mm[(48 - 1 + (4 - 1) * 128)] = 65;
    mm[(49 - 1 + (1 - 1) * 128)] = 2861;
    mm[(49 - 1 + (2 - 1) * 128)] = 496;
    mm[(49 - 1 + (3 - 1) * 128)] = 466;
    mm[(49 - 1 + (4 - 1) * 128)] = 1845;
    mm[(50 - 1 + (1 - 1) * 128)] = 1950;
    mm[(50 - 1 + (2 - 1) * 128)] = 1597;
    mm[(50 - 1 + (3 - 1) * 128)] = 4018;
    mm[(50 - 1 + (4 - 1) * 128)] = 697;
    mm[(51 - 1 + (1 - 1) * 128)] = 617;
    mm[(51 - 1 + (2 - 1) * 128)] = 2394;
    mm[(51 - 1 + (3 - 1) * 128)] = 1399;
    mm[(51 - 1 + (4 - 1) * 128)] = 3085;
    mm[(52 - 1 + (1 - 1) * 128)] = 2070;
    mm[(52 - 1 + (2 - 1) * 128)] = 2584;
    mm[(52 - 1 + (3 - 1) * 128)] = 190;
    mm[(52 - 1 + (4 - 1) * 128)] = 3441;
    mm[(53 - 1 + (1 - 1) * 128)] = 3331;
    mm[(53 - 1 + (2 - 1) * 128)] = 1843;
    mm[(53 - 1 + (3 - 1) * 128)] = 2879;
    mm[(53 - 1 + (4 - 1) * 128)] = 1573;
    mm[(54 - 1 + (1 - 1) * 128)] = 769;
    mm[(54 - 1 + (2 - 1) * 128)] = 336;
    mm[(54 - 1 + (3 - 1) * 128)] = 153;
    mm[(54 - 1 + (4 - 1) * 128)] = 3689;
    mm[(55 - 1 + (1 - 1) * 128)] = 1558;
    mm[(55 - 1 + (2 - 1) * 128)] = 1472;
    mm[(55 - 1 + (3 - 1) * 128)] = 2320;
    mm[(55 - 1 + (4 - 1) * 128)] = 2941;
    mm[(56 - 1 + (1 - 1) * 128)] = 2412;
    mm[(56 - 1 + (2 - 1) * 128)] = 2407;
    mm[(56 - 1 + (3 - 1) * 128)] = 18;
    mm[(56 - 1 + (4 - 1) * 128)] = 929;
    mm[(57 - 1 + (1 - 1) * 128)] = 2800;
    mm[(57 - 1 + (2 - 1) * 128)] = 433;
    mm[(57 - 1 + (3 - 1) * 128)] = 712;
    mm[(57 - 1 + (4 - 1) * 128)] = 533;
    mm[(58 - 1 + (1 - 1) * 128)] = 189;
    mm[(58 - 1 + (2 - 1) * 128)] = 2096;
    mm[(58 - 1 + (3 - 1) * 128)] = 2159;
    mm[(58 - 1 + (4 - 1) * 128)] = 2841;
    mm[(59 - 1 + (1 - 1) * 128)] = 287;
    mm[(59 - 1 + (2 - 1) * 128)] = 1761;
    mm[(59 - 1 + (3 - 1) * 128)] = 2318;
    mm[(59 - 1 + (4 - 1) * 128)] = 4077;
    mm[(60 - 1 + (1 - 1) * 128)] = 2045;
    mm[(60 - 1 + (2 - 1) * 128)] = 2810;
    mm[(60 - 1 + (3 - 1) * 128)] = 2091;
    mm[(60 - 1 + (4 - 1) * 128)] = 721;
    mm[(61 - 1 + (1 - 1) * 128)] = 1227;
    mm[(61 - 1 + (2 - 1) * 128)] = 566;
    mm[(61 - 1 + (3 - 1) * 128)] = 3443;
    mm[(61 - 1 + (4 - 1) * 128)] = 2821;
    mm[(62 - 1 + (1 - 1) * 128)] = 2838;
    mm[(62 - 1 + (2 - 1) * 128)] = 442;
    mm[(62 - 1 + (3 - 1) * 128)] = 1510;
    mm[(62 - 1 + (4 - 1) * 128)] = 2249;
    mm[(63 - 1 + (1 - 1) * 128)] = 209;
    mm[(63 - 1 + (2 - 1) * 128)] = 41;
    mm[(63 - 1 + (3 - 1) * 128)] = 449;
    mm[(63 - 1 + (4 - 1) * 128)] = 2397;
    mm[(64 - 1 + (1 - 1) * 128)] = 2770;
    mm[(64 - 1 + (2 - 1) * 128)] = 1238;
    mm[(64 - 1 + (3 - 1) * 128)] = 1956;
    mm[(64 - 1 + (4 - 1) * 128)] = 2817;
    mm[(65 - 1 + (1 - 1) * 128)] = 3654;
    mm[(65 - 1 + (2 - 1) * 128)] = 1086;
    mm[(65 - 1 + (3 - 1) * 128)] = 2201;
    mm[(65 - 1 + (4 - 1) * 128)] = 245;
    mm[(66 - 1 + (1 - 1) * 128)] = 3993;
    mm[(66 - 1 + (2 - 1) * 128)] = 603;
    mm[(66 - 1 + (3 - 1) * 128)] = 3137;
    mm[(66 - 1 + (4 - 1) * 128)] = 1913;
    mm[(67 - 1 + (1 - 1) * 128)] = 192;
    mm[(67 - 1 + (2 - 1) * 128)] = 840;
    mm[(67 - 1 + (3 - 1) * 128)] = 3399;
    mm[(67 - 1 + (4 - 1) * 128)] = 1997;
    mm[(68 - 1 + (1 - 1) * 128)] = 2253;
    mm[(68 - 1 + (2 - 1) * 128)] = 3168;
    mm[(68 - 1 + (3 - 1) * 128)] = 1321;
    mm[(68 - 1 + (4 - 1) * 128)] = 3121;
    mm[(69 - 1 + (1 - 1) * 128)] = 3491;
    mm[(69 - 1 + (2 - 1) * 128)] = 1499;
    mm[(69 - 1 + (3 - 1) * 128)] = 2271;
    mm[(69 - 1 + (4 - 1) * 128)] = 997;
    mm[(70 - 1 + (1 - 1) * 128)] = 2889;
    mm[(70 - 1 + (2 - 1) * 128)] = 1084;
    mm[(70 - 1 + (3 - 1) * 128)] = 3667;
    mm[(70 - 1 + (4 - 1) * 128)] = 1833;
    mm[(71 - 1 + (1 - 1) * 128)] = 2857;
    mm[(71 - 1 + (2 - 1) * 128)] = 3438;
    mm[(71 - 1 + (3 - 1) * 128)] = 2703;
    mm[(71 - 1 + (4 - 1) * 128)] = 2877;
    mm[(72 - 1 + (1 - 1) * 128)] = 2094;
    mm[(72 - 1 + (2 - 1) * 128)] = 2408;
    mm[(72 - 1 + (3 - 1) * 128)] = 629;
    mm[(72 - 1 + (4 - 1) * 128)] = 1633;
    mm[(73 - 1 + (1 - 1) * 128)] = 1818;
    mm[(73 - 1 + (2 - 1) * 128)] = 1589;
    mm[(73 - 1 + (3 - 1) * 128)] = 2365;
    mm[(73 - 1 + (4 - 1) * 128)] = 981;
    mm[(74 - 1 + (1 - 1) * 128)] = 688;
    mm[(74 - 1 + (2 - 1) * 128)] = 2391;
    mm[(74 - 1 + (3 - 1) * 128)] = 2431;
    mm[(74 - 1 + (4 - 1) * 128)] = 2009;
    mm[(75 - 1 + (1 - 1) * 128)] = 1407;
    mm[(75 - 1 + (2 - 1) * 128)] = 288;
    mm[(75 - 1 + (3 - 1) * 128)] = 1113;
    mm[(75 - 1 + (4 - 1) * 128)] = 941;
    mm[(76 - 1 + (1 - 1) * 128)] = 634;
    mm[(76 - 1 + (2 - 1) * 128)] = 26;
    mm[(76 - 1 + (3 - 1) * 128)] = 3922;
    mm[(76 - 1 + (4 - 1) * 128)] = 2449;
    mm[(77 - 1 + (1 - 1) * 128)] = 3231;
    mm[(77 - 1 + (2 - 1) * 128)] = 512;
    mm[(77 - 1 + (3 - 1) * 128)] = 2554;
    mm[(77 - 1 + (4 - 1) * 128)] = 197;
    mm[(78 - 1 + (1 - 1) * 128)] = 815;
    mm[(78 - 1 + (2 - 1) * 128)] = 1456;
    mm[(78 - 1 + (3 - 1) * 128)] = 184;
    mm[(78 - 1 + (4 - 1) * 128)] = 2441;
    mm[(79 - 1 + (1 - 1) * 128)] = 3524;
    mm[(79 - 1 + (2 - 1) * 128)] = 171;
    mm[(79 - 1 + (3 - 1) * 128)] = 2099;
    mm[(79 - 1 + (4 - 1) * 128)] = 285;
    mm[(80 - 1 + (1 - 1) * 128)] = 1914;
    mm[(80 - 1 + (2 - 1) * 128)] = 1677;
    mm[(80 - 1 + (3 - 1) * 128)] = 3228;
    mm[(80 - 1 + (4 - 1) * 128)] = 1473;
    mm[(81 - 1 + (1 - 1) * 128)] = 516;
    mm[(81 - 1 + (2 - 1) * 128)] = 2657;
    mm[(81 - 1 + (3 - 1) * 128)] = 4012;
    mm[(81 - 1 + (4 - 1) * 128)] = 2741;
    mm[(82 - 1 + (1 - 1) * 128)] = 164;
    mm[(82 - 1 + (2 - 1) * 128)] = 2270;
    mm[(82 - 1 + (3 - 1) * 128)] = 1921;
    mm[(82 - 1 + (4 - 1) * 128)] = 3129;
    mm[(83 - 1 + (1 - 1) * 128)] = 303;
    mm[(83 - 1 + (2 - 1) * 128)] = 2587;
    mm[(83 - 1 + (3 - 1) * 128)] = 3452;
    mm[(83 - 1 + (4 - 1) * 128)] = 909;
    mm[(84 - 1 + (1 - 1) * 128)] = 2144;
    mm[(84 - 1 + (2 - 1) * 128)] = 2961;
    mm[(84 - 1 + (3 - 1) * 128)] = 3901;
    mm[(84 - 1 + (4 - 1) * 128)] = 2801;
    mm[(85 - 1 + (1 - 1) * 128)] = 3480;
    mm[(85 - 1 + (2 - 1) * 128)] = 1970;
    mm[(85 - 1 + (3 - 1) * 128)] = 572;
    mm[(85 - 1 + (4 - 1) * 128)] = 421;
    mm[(86 - 1 + (1 - 1) * 128)] = 119;
    mm[(86 - 1 + (2 - 1) * 128)] = 1817;
    mm[(86 - 1 + (3 - 1) * 128)] = 3309;
    mm[(86 - 1 + (4 - 1) * 128)] = 4073;
    mm[(87 - 1 + (1 - 1) * 128)] = 3357;
    mm[(87 - 1 + (2 - 1) * 128)] = 676;
    mm[(87 - 1 + (3 - 1) * 128)] = 3171;
    mm[(87 - 1 + (4 - 1) * 128)] = 2813;
    mm[(88 - 1 + (1 - 1) * 128)] = 837;
    mm[(88 - 1 + (2 - 1) * 128)] = 1410;
    mm[(88 - 1 + (3 - 1) * 128)] = 817;
    mm[(88 - 1 + (4 - 1) * 128)] = 2337;
    mm[(89 - 1 + (1 - 1) * 128)] = 2826;
    mm[(89 - 1 + (2 - 1) * 128)] = 3723;
    mm[(89 - 1 + (3 - 1) * 128)] = 3039;
    mm[(89 - 1 + (4 - 1) * 128)] = 1429;
    mm[(90 - 1 + (1 - 1) * 128)] = 2332;
    mm[(90 - 1 + (2 - 1) * 128)] = 2803;
    mm[(90 - 1 + (3 - 1) * 128)] = 1696;
    mm[(90 - 1 + (4 - 1) * 128)] = 1177;
    mm[(91 - 1 + (1 - 1) * 128)] = 2089;
    mm[(91 - 1 + (2 - 1) * 128)] = 3185;
    mm[(91 - 1 + (3 - 1) * 128)] = 1256;
    mm[(91 - 1 + (4 - 1) * 128)] = 1901;
    mm[(92 - 1 + (1 - 1) * 128)] = 3780;
    mm[(92 - 1 + (2 - 1) * 128)] = 184;
    mm[(92 - 1 + (3 - 1) * 128)] = 3715;
    mm[(92 - 1 + (4 - 1) * 128)] = 81;
    mm[(93 - 1 + (1 - 1) * 128)] = 1700;
    mm[(93 - 1 + (2 - 1) * 128)] = 663;
    mm[(93 - 1 + (3 - 1) * 128)] = 2077;
    mm[(93 - 1 + (4 - 1) * 128)] = 1669;
    mm[(94 - 1 + (1 - 1) * 128)] = 3712;
    mm[(94 - 1 + (2 - 1) * 128)] = 499;
    mm[(94 - 1 + (3 - 1) * 128)] = 3019;
    mm[(94 - 1 + (4 - 1) * 128)] = 2633;
    mm[(95 - 1 + (1 - 1) * 128)] = 150;
    mm[(95 - 1 + (2 - 1) * 128)] = 3784;
    mm[(95 - 1 + (3 - 1) * 128)] = 1497;
    mm[(95 - 1 + (4 - 1) * 128)] = 2269;
    mm[(96 - 1 + (1 - 1) * 128)] = 2000;
    mm[(96 - 1 + (2 - 1) * 128)] = 1631;
    mm[(96 - 1 + (3 - 1) * 128)] = 1101;
    mm[(96 - 1 + (4 - 1) * 128)] = 129;
    mm[(97 - 1 + (1 - 1) * 128)] = 3375;
    mm[(97 - 1 + (2 - 1) * 128)] = 1925;
    mm[(97 - 1 + (3 - 1) * 128)] = 717;
    mm[(97 - 1 + (4 - 1) * 128)] = 1141;
    mm[(98 - 1 + (1 - 1) * 128)] = 1621;
    mm[(98 - 1 + (2 - 1) * 128)] = 3912;
    mm[(98 - 1 + (3 - 1) * 128)] = 51;
    mm[(98 - 1 + (4 - 1) * 128)] = 249;
    mm[(99 - 1 + (1 - 1) * 128)] = 3090;
    mm[(99 - 1 + (2 - 1) * 128)] = 1398;
    mm[(99 - 1 + (3 - 1) * 128)] = 981;
    mm[(99 - 1 + (4 - 1) * 128)] = 3917;
    mm[(100 - 1 + (1 - 1) * 128)] = 3765;
    mm[(100 - 1 + (2 - 1) * 128)] = 1349;
    mm[(100 - 1 + (3 - 1) * 128)] = 1978;
    mm[(100 - 1 + (4 - 1) * 128)] = 2481;
    mm[(101 - 1 + (1 - 1) * 128)] = 1149;
    mm[(101 - 1 + (2 - 1) * 128)] = 1441;
    mm[(101 - 1 + (3 - 1) * 128)] = 1813;
    mm[(101 - 1 + (4 - 1) * 128)] = 3941;
    mm[(102 - 1 + (1 - 1) * 128)] = 3146;
    mm[(102 - 1 + (2 - 1) * 128)] = 2224;
    mm[(102 - 1 + (3 - 1) * 128)] = 3881;
    mm[(102 - 1 + (4 - 1) * 128)] = 2217;
    mm[(103 - 1 + (1 - 1) * 128)] = 33;
    mm[(103 - 1 + (2 - 1) * 128)] = 2411;
    mm[(103 - 1 + (3 - 1) * 128)] = 76;
    mm[(103 - 1 + (4 - 1) * 128)] = 2749;
    mm[(104 - 1 + (1 - 1) * 128)] = 3082;
    mm[(104 - 1 + (2 - 1) * 128)] = 1907;
    mm[(104 - 1 + (3 - 1) * 128)] = 3846;
    mm[(104 - 1 + (4 - 1) * 128)] = 3041;
    mm[(105 - 1 + (1 - 1) * 128)] = 2741;
    mm[(105 - 1 + (2 - 1) * 128)] = 3192;
    mm[(105 - 1 + (3 - 1) * 128)] = 3694;
    mm[(105 - 1 + (4 - 1) * 128)] = 1877;
    mm[(106 - 1 + (1 - 1) * 128)] = 359;
    mm[(106 - 1 + (2 - 1) * 128)] = 2786;
    mm[(106 - 1 + (3 - 1) * 128)] = 1682;
    mm[(106 - 1 + (4 - 1) * 128)] = 345;
    mm[(107 - 1 + (1 - 1) * 128)] = 3316;
    mm[(107 - 1 + (2 - 1) * 128)] = 382;
    mm[(107 - 1 + (3 - 1) * 128)] = 124;
    mm[(107 - 1 + (4 - 1) * 128)] = 2861;
    mm[(108 - 1 + (1 - 1) * 128)] = 1749;
    mm[(108 - 1 + (2 - 1) * 128)] = 37;
    mm[(108 - 1 + (3 - 1) * 128)] = 1660;
    mm[(108 - 1 + (4 - 1) * 128)] = 1809;
    mm[(109 - 1 + (1 - 1) * 128)] = 185;
    mm[(109 - 1 + (2 - 1) * 128)] = 759;
    mm[(109 - 1 + (3 - 1) * 128)] = 3997;
    mm[(109 - 1 + (4 - 1) * 128)] = 3141;
    mm[(110 - 1 + (1 - 1) * 128)] = 2784;
    mm[(110 - 1 + (2 - 1) * 128)] = 2948;
    mm[(110 - 1 + (3 - 1) * 128)] = 479;
    mm[(110 - 1 + (4 - 1) * 128)] = 2825;
    mm[(111 - 1 + (1 - 1) * 128)] = 2202;
    mm[(111 - 1 + (2 - 1) * 128)] = 1862;
    mm[(111 - 1 + (3 - 1) * 128)] = 1141;
    mm[(111 - 1 + (4 - 1) * 128)] = 157;
    mm[(112 - 1 + (1 - 1) * 128)] = 2199;
    mm[(112 - 1 + (2 - 1) * 128)] = 3802;
    mm[(112 - 1 + (3 - 1) * 128)] = 886;
    mm[(112 - 1 + (4 - 1) * 128)] = 2881;
    mm[(113 - 1 + (1 - 1) * 128)] = 1364;
    mm[(113 - 1 + (2 - 1) * 128)] = 2423;
    mm[(113 - 1 + (3 - 1) * 128)] = 3514;
    mm[(113 - 1 + (4 - 1) * 128)] = 3637;
    mm[(114 - 1 + (1 - 1) * 128)] = 1244;
    mm[(114 - 1 + (2 - 1) * 128)] = 2051;
    mm[(114 - 1 + (3 - 1) * 128)] = 1301;
    mm[(114 - 1 + (4 - 1) * 128)] = 1465;
    mm[(115 - 1 + (1 - 1) * 128)] = 2020;
    mm[(115 - 1 + (2 - 1) * 128)] = 2295;
    mm[(115 - 1 + (3 - 1) * 128)] = 3604;
    mm[(115 - 1 + (4 - 1) * 128)] = 2829;
    mm[(116 - 1 + (1 - 1) * 128)] = 3160;
    mm[(116 - 1 + (2 - 1) * 128)] = 1332;
    mm[(116 - 1 + (3 - 1) * 128)] = 1888;
    mm[(116 - 1 + (4 - 1) * 128)] = 2161;
    mm[(117 - 1 + (1 - 1) * 128)] = 2785;
    mm[(117 - 1 + (2 - 1) * 128)] = 1832;
    mm[(117 - 1 + (3 - 1) * 128)] = 1836;
    mm[(117 - 1 + (4 - 1) * 128)] = 3365;
    mm[(118 - 1 + (1 - 1) * 128)] = 2772;
    mm[(118 - 1 + (2 - 1) * 128)] = 2405;
    mm[(118 - 1 + (3 - 1) * 128)] = 1990;
    mm[(118 - 1 + (4 - 1) * 128)] = 361;
    mm[(119 - 1 + (1 - 1) * 128)] = 1217;
    mm[(119 - 1 + (2 - 1) * 128)] = 3638;
    mm[(119 - 1 + (3 - 1) * 128)] = 2058;
    mm[(119 - 1 + (4 - 1) * 128)] = 2685;
    mm[(120 - 1 + (1 - 1) * 128)] = 1822;
    mm[(120 - 1 + (2 - 1) * 128)] = 3661;
    mm[(120 - 1 + (3 - 1) * 128)] = 692;
    mm[(120 - 1 + (4 - 1) * 128)] = 3745;
    mm[(121 - 1 + (1 - 1) * 128)] = 1245;
    mm[(121 - 1 + (2 - 1) * 128)] = 327;
    mm[(121 - 1 + (3 - 1) * 128)] = 1194;
    mm[(121 - 1 + (4 - 1) * 128)] = 2325;
    mm[(122 - 1 + (1 - 1) * 128)] = 2252;
    mm[(122 - 1 + (2 - 1) * 128)] = 3660;
    mm[(122 - 1 + (3 - 1) * 128)] = 20;
    mm[(122 - 1 + (4 - 1) * 128)] = 3609;
    mm[(123 - 1 + (1 - 1) * 128)] = 3904;
    mm[(123 - 1 + (2 - 1) * 128)] = 716;
    mm[(123 - 1 + (3 - 1) * 128)] = 3285;
    mm[(123 - 1 + (4 - 1) * 128)] = 3821;
    mm[(124 - 1 + (1 - 1) * 128)] = 2774;
    mm[(124 - 1 + (2 - 1) * 128)] = 1842;
    mm[(124 - 1 + (3 - 1) * 128)] = 2046;
    mm[(124 - 1 + (4 - 1) * 128)] = 3537;
    mm[(125 - 1 + (1 - 1) * 128)] = 997;
    mm[(125 - 1 + (2 - 1) * 128)] = 3987;
    mm[(125 - 1 + (3 - 1) * 128)] = 2107;
    mm[(125 - 1 + (4 - 1) * 128)] = 517;
    mm[(126 - 1 + (1 - 1) * 128)] = 2573;
    mm[(126 - 1 + (2 - 1) * 128)] = 1368;
    mm[(126 - 1 + (3 - 1) * 128)] = 3508;
    mm[(126 - 1 + (4 - 1) * 128)] = 3017;
    mm[(127 - 1 + (1 - 1) * 128)] = 1148;
    mm[(127 - 1 + (2 - 1) * 128)] = 1848;
    mm[(127 - 1 + (3 - 1) * 128)] = 3525;
    mm[(127 - 1 + (4 - 1) * 128)] = 2141;
    mm[('' - 1 + (1 - 1) * 128)] = 545;
    mm[('' - 1 + (2 - 1) * 128)] = 2366;
    mm[('' - 1 + (3 - 1) * 128)] = 3801;
    mm[('' - 1 + (4 - 1) * 128)] = 1537;
  }
  
  public static void slaruv(int[] paramArrayOfInt, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    j = paramArrayOfInt[(1 - 1 + paramInt1)];
    k = paramArrayOfInt[(2 - 1 + paramInt1)];
    m = paramArrayOfInt[(3 - 1 + paramInt1)];
    n = paramArrayOfInt[(4 - 1 + paramInt1)];
    i = 1;
    for (int i6 = Math.min(paramInt2, 128) - 1 + 1; i6 > 0; i6--)
    {
      for (;;)
      {
        i4 = n * mm[(i - 1 + (4 - 1) * 128)];
        i3 = i4 / 4096;
        i4 -= 4096 * i3;
        i3 = i3 + m * mm[(i - 1 + (4 - 1) * 128)] + n * mm[(i - 1 + (3 - 1) * 128)];
        i2 = i3 / 4096;
        i3 -= 4096 * i2;
        i2 = i2 + k * mm[(i - 1 + (4 - 1) * 128)] + m * mm[(i - 1 + (3 - 1) * 128)] + n * mm[(i - 1 + (2 - 1) * 128)];
        i1 = i2 / 4096;
        i2 -= 4096 * i1;
        i1 = i1 + j * mm[(i - 1 + (4 - 1) * 128)] + k * mm[(i - 1 + (3 - 1) * 128)] + m * mm[(i - 1 + (2 - 1) * 128)] + n * mm[(i - 1 + (1 - 1) * 128)];
        i1 %= 4096;
        paramArrayOfFloat[(i - 1 + paramInt3)] = (2.4414062E-4F * (i1 + 2.4414062E-4F * (i2 + 2.4414062E-4F * (i3 + 2.4414062E-4F * i4))));
        if ((paramArrayOfFloat[(i - 1 + paramInt3)] != 1.0F ? 0 : 1) == 0) {
          break;
        }
        j += 2;
        k += 2;
        m += 2;
        n += 2;
      }
      i += 1;
    }
    paramArrayOfInt[(1 - 1 + paramInt1)] = i1;
    paramArrayOfInt[(2 - 1 + paramInt1)] = i2;
    paramArrayOfInt[(3 - 1 + paramInt1)] = i3;
    paramArrayOfInt[(4 - 1 + paramInt1)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaruv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */