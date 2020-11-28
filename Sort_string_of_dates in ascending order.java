//This is The Coding Area
import java.util.*;
class Test{

    public static ArrayList<String> sortDates(ArrayList<String> date)
     {

       ArrayList<String> mon=new ArrayList<>();
        mon.add("Jan"); mon.add("Feb"); mon.add("Mar");
        mon.add("Apr"); mon.add("May"); mon.add("Jun");
        mon.add("Jul"); mon.add("Aug"); mon.add("Sep");
        mon.add("Oct"); mon.add("Nov"); mon.add("Dec");
        ArrayList<String> ch=new ArrayList();
        for(int i=0;i<date.size();i++)
         {
            String s="";
             s=s+date.get(i).substring(7);
               int mon_int=mon.indexOf(date.get(i).substring(3,6))+1;
               if(mon_int<10) s=s+"0";
             s=s+mon_int+date.get(i).substring(0,2);
             ch.add(s);
         }
         System.out.println(ch); //////////// your code;
         Collections.sort(ch);
         ArrayList<String> res=new ArrayList<>();
          for(int i=0;i<ch.size();i++)
            {
                  String s="";
                  s=s+ch.get(i).substring(6)+" "                              //dd
                     +mon.get(Integer.parseInt(ch.get(i).substring(4,6)))+" " // mm
                     +ch.get(i).substring(0,4);                               // yyyy
                  res.add(s);
            }

         return res;
     }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       ArrayList<String> li=new ArrayList<>();
       li.add("24 Jul 2017");
       li.add("11 Jun 1996");
       li.add("01 Jan 2019");
       li.add("12 Aug 2005");
       li.add("01 Jan 1997");
       System.out.println(sortDates(li));


   }
}
