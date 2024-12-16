import java.util.Scanner;

public class Kintai {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int totalAm = 0;
        int totalPm = 0;

        for (int i = 0; i < n; i ++) {
            String[] times = sc.next().split(":");
            int startHour = Integer.parseInt(times[0]);
            int startMinute = Integer.parseInt(times[1]);

            times = sc.next().split(":");
            int endHour = Integer.parseInt(times[0]);
            int endMinute = Integer.parseInt(times[1]);

            int startTotalMinutes = startHour * 60 + startMinute;
            int endTotalMinutes = endHour * 60 + endMinute;

             // 午前の範囲
             int amEnd = Math.min(endTotalMinutes, 11 * 60 + 59);
             if (startTotalMinutes <= amEnd) {
                 totalAm += Math.max(0, amEnd - startTotalMinutes + 1);
             }
 
             // 午後の範囲
             int pmStart = Math.max(startTotalMinutes, 12 * 60);
             if (pmStart <= endTotalMinutes) {
                 totalPm += endTotalMinutes - pmStart + 1;
             }
        }
 
        // 結果を出力
        System.out.println(totalAm / 60 + " " + totalPm / 60);

        
    }
}

