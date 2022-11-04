package Draft_Test;
import java.text.DateFormat;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
   
public class test  
{  
/* Driver Code */  
public static void main(String[] args)   
{  
//java 8  
sortDateTimeObject();  
sortDateTimeText();  
}  
   
private static void sortDateTimeObject() {  
List<LocalDateTime>dateTimeList=new ArrayList<LocalDateTime>();  
dateTimeList.add(LocalDateTime.of(2012, 05, 12, 5, 16));  
dateTimeList.add(LocalDateTime.of(2014, 03, 23, 11, 26));  
dateTimeList.add(LocalDateTime.of(2011, 02, 13, 9, 36));  
dateTimeList.add(LocalDateTime.of(2013, 11, 12, 5, 16));  
dateTimeList.add(LocalDateTime.of(2017, 8, 11, 21, 26));  
dateTimeList.add(LocalDateTime.of(2016, 9, 05, 19, 36));  
   
DateTimeFormatter dateTimeFormatter = DateTimeFormatter  
                 .ofPattern("MM/dd/yyyy '@'hh:mm a");  
System.out.println("---> Date & Time Object List Before Sort (MM/dd/yyyy '@'hh:mm a)");  
for(LocalDateTime dateTime:dateTimeList)  
{  
System.out.println(dateTime.format(dateTimeFormatter));  
}  
// LocalDateTime  internally having Comparable interface no need additional Comparator  
Collections.sort(dateTimeList);  
   
System.out.println("---> Date & Time Object List After Sort (MM/dd/yyyy '@'hh:mm a)");  
for(LocalDateTime dateTime:dateTimeList)  
{  
System.out.println(dateTime.format(dateTimeFormatter));  
}  
   
}  
   
private static void sortDateTimeText()  
{  
List<String>dateStrList=new ArrayList<String>();  
// MM/dd/yyyy '@'hh:mm a  
dateStrList.add("01/21/2014 @03:13 PM");  
dateStrList.add("01/21/2011 @04:37 PM");  
dateStrList.add("01/21/2012 @10:41 AM");  
dateStrList.add("01/21/2013 @10:48 AM");  
dateStrList.add("01/22/2015 @06:16 AM");  
dateStrList.add("01/22/2013 @06:19 AM");  
dateStrList.add("01/21/2018 @05:19 PM");  
dateStrList.add("01/21/2013 @05:19 PM");
   
System.out.println("---> Date & Time List Before Sort (MM/dd/yyyy '@'hh:mm a)");  
for(String dateStr:dateStrList)  
System.out.println(dateStr);  
   
//Sort String Date  
Collections.sort(dateStrList, new Comparator<String>() {  
DateFormat f = new SimpleDateFormat("MM/dd/yyyy '@'hh:mm a");  
@Override  
public int compare(String o1, String o2) {  
try {;
  return f.parse(o1).compareTo(f.parse(o2));  
    } catch (ParseException e) {  
      throw new IllegalArgumentException(e);  
    }  
}  
});  
   
System.out.println("---> Date & Time List After Sort (MM/dd/yyyy '@'hh:mm a)");  
for(String dateStr:dateStrList)  
System.out.println(dateStr);  
 }  
}  