import java.util.Scanner;
class Stack{
	int top = -1;
	int[] s = new int[5];
	Scanner sc = new Scanner(System.in);
	public void push(){
		System.out.println("Enter elements : ");
		int x = sc.nextInt();
		if(top>s.length){
			System.out.println("Stack Overflow!!!!");
		}else{
			top++;
			s[top] = x;
		}
	}

	void display(){
		System.out.println("Stack is :");
		for(int i=0;i<=top;i++){
			System.out.println(s[i]);
		}
	}
}
public class Lab_7_38{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack();
		boolean flag = true;
		while(flag){
			System.out.println("Enter 1 to push, 2 to display, 3 to exit loop");
			int opt=sc.nextInt();
			switch(opt){
				case 1:
				s1.push();
				break;

				case 2:
				s1.display();
				break;

				case 3:
				flag = false;
				s1.display();
			}
		}
	}
}