import java.util.Scanner;
public class User{
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		boolean repeat = true;
		int n=0;
		do{
			try{
				repeat = false;
				System.out.println("Are you a: ");
				System.out.println("1) Dog Person");
				System.out.println("2) Cat Person");
				n = kb.nextInt();
			}
			catch(Exception e){
				kb.nextLine();
				repeat = true;
				System.out.println("Not an integer, trya again.");
			}
			if((n!=1)&&(n!=2)){
				System.out.println("Enter 1 or 2");
				repeat = true;
			}
		}while(repeat);
		if(n==1){
			Animal animal = new Dog();
		}
		else if(n==2){
			Animal animal = new Cat();
		}
	}
}
