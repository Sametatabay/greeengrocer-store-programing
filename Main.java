import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double apple,oranage,patato,chery,tomato;
    double appleKg=2.14,orangeKg=3.67,patatoKg=1.11,cheryKg=0.95,tomatoKg=5.00;
    double appleSum,orangeSum,patatoSum,cherySum,tomatoSum,total;
    Scanner inp =new Scanner(System.in);

    System.out.println("How many kilos is the apple :");
    apple=inp.nextDouble();
    appleSum=apple*appleKg;
    System.out.println("Apple Price : "+appleSum);


    System.out.println("How many kilos is the orange :");
    oranage=inp.nextDouble();
    orangeSum=oranage*orangeKg;
    System.out.println("Orange Price : "+orangeSum);

    System.out.println("How many kilos is the patato :");
    patato=inp.nextDouble();
    patatoSum=patato*patatoKg;
    System.out.println("Patato Price :" +patatoSum);

    System.out.println("How many kilos is the chery :");
    chery=inp.nextDouble();
    cherySum=chery*cheryKg;
    System.out.println("Chery Price : "+cherySum);

    System.out.println("How many kilos is the tomato :");
    tomato=inp.nextDouble();
    tomatoSum=tomato*tomatoKg;
    System.out.println("Tomato Price : "+tomato);

    total=appleSum+orangeSum+patatoSum+cherySum+tomatoSum;
    System.out.println("Total Sum : "+total);

    }
}
