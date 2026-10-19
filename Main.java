import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        DogWalkCompany[] companies = new DogWalkCompany[100];
        for (int i = 0; i < 100; i++) {
            companies[i] = new DogWalkCompany(s.nextLine());
        }

        f = new File("walkers.txt");
        s = new Scanner(f);
        int totalPay = 0;
        for (int i = 0; i < 100; i++) 
        {
            int company = s.nextInt();
            int maxDogs = s.nextInt();
            DogWalker walker = new DogWalker(maxDogs, companies[company]);
            int startHour = s.nextInt();
            int endHour = s.nextInt();
            int pay = walker.dogWalkShift(startHour, endHour);
            totalPay += pay;
        }
        System.out.println(totalPay);
    }
}