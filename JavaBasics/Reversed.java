class Reverse {
    public static String reverseString(String text) {
        // Add your code below
        String reversed = new String("");

        for (int i = 0; i < text.length(); i++) {
            char nextCharacter = text.charAt(i);
            reversed = nextCharacter + reversed;
        }
        return reversed;

    }

    public static String replaceCharacter(String text, char charToReplace, char replacement) {
          // Add your code below
          for(int i=0;i<text.length();i++)
          {
            if(text.charAt(i) == charToReplace)
            {
              text = text.substring(0,i) + replacement + text.substring(i+1);
            }
          }
          return text;
        }

    public static void main(String[] args) {
        String text = new String(
                "\".<romr<v<N\" sa <man hcus htiW\n ,rood r<bmahc sih <voba tsub d<rutplucs <ht nopu tsa<b ro driB —rood r<bmahc sih <voba drib gni<<s htiw d<ss<lb saw t<y r<v< gni<b namuh gnivil on taht gni<<rga pl<h tonnac <w roF ;<rob ycnav<l<r <lttil—gnina<m <lttil r<wsna sti hguohT ,ylnialp os <sruocsid ra<h ot lwof ylniagnu siht d<ll<vram I hcuM\n\n\".<romr<v<N\" n<vaR <ht htouQ\n \"!<rohs nainotulP s’thgiN <ht no si <man yldrol yht tahw <m ll<T —<rohs ylthgiN <ht morf gnir<dnaw n<vaR tn<icna dna mirg yltsahG ,n<varc on <rus tra\" ,dias I \",uoht ,n<vahs dna nrohs <b ts<rc yht hguohT\",<row ti <cnan<tnuoc <ht fo muroc<d nr<ts dna <varg <ht yB ,gnilims otni ycnaf das ym gniliug<b drib ynob< siht n<hT");

        System.out.println(reverseString(text));

        String reversedText = reverseString(text);

        System.out.println(replaceCharacter(reversedText, '<', 'e'));

    }
}