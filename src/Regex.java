public class Regex {
    public static void main(String[] args) {
        String s = "javartgrfgfgfgPython";


        // ^ $
//ssss
        if(s.matches("^java.*(Python)+$"))
            System.out.println("yes");
        else System.out.println("no");


    /*
     // [] poryadok ne imeet znacheniye
     // () poryadok imeet znacheniye
     String s = "jabcabcabcabcva";
        if(s.matches("j[abc]+va"))
            System.out.println("yes");
        else System.out.println("no");
*/

        /*
        String s = "d1-javansmqoaynrienctslmgkxsdf";
        // * ot 0 do beskonechnosti
        // + ot 1 do beskonechnosti
        // ? libo 1 raz libo 0 raz
        // {n} n raz, n-r n = 5 -> 5 raz
        // {n,} minimum n raz do beskonechnosti
        // {n,m} ot n do m raz

        if(s.matches(".{3}java.*"))
            System.out.println("yes");
        else System.out.println("no");
*/
  /*      // \s \S \d \D \w \W

        if (s.matches("J\\w&&[^_].a"))
            System.out.println("YES");
        else System.out.println("NO");

*/
   /*  if(s.matches("J[a-zA-Z0-9].a"))
         System.out.println("YES");
     else System.out.println("NO");
        if(s.equals("Java"))
            System.out.println("Equals");
        else System.out.println("Not equal");
    */
    }

}