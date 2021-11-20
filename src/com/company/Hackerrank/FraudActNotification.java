package com.company.Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class FraudActNotification {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int d = scan.nextInt();
        List<Integer> expenditure = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            expenditure.add(scan.nextInt());
        }
        System.out.println(activityNotifications(expenditure, d));
    }

    public static int activityNotifications(List<Integer> list, int d) {
        int count = 0;
        while (list.size() > d) {
            List<Integer> extract = new ArrayList<>();
            for (int i = 0; i < d; i++) {
                extract.add(list.get(i));
            }
            Collections.sort(extract);
            int spend = 0;
            if (d % 2 == 0) {
                spend += extract.get((d / 2) - 1);
            }
            spend += extract.get(d / 2);
            if (list.get(d) >= 2 * spend) count++;
            list.remove(0);
        }
        return count;
    }
}
