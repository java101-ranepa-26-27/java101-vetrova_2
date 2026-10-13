package ru.ranepa;
import java.util.Scanner;
import java.util.ArrayList;

public class student {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ArrayList<Integer> grades = new ArrayList<>();
        while (true)
        {
            int g = sc.nextInt();
            if (g == 0) break;
            grades.add(g);
        }
        int sum = 0;
        for (int g : grades) sum += g;
        System.out.println("Студент: " + name);
        System.out.println("Оценки: " + grades);
        if (grades.isEmpty())
        {
            System.out.println("Без оценок");
        }
        else {
            double avg = (double) sum / grades.size();
            System.out.println("Средний балл: " + avg);
            String status;
            if (avg >= 4.5)
            {
                status = "отличник";
            }
            else if (avg >= 3.5)
            {
                status = "хорошист";
            }
            else if (avg >= 2.5)
            {
                status = "троечник";
            }
            else
            {
                status = "двоечник";
            }
            System.out.println("Статус: " + status);
        }
    }
}