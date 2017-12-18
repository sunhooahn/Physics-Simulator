package physics;

import java.util.Scanner;


public class Calculator {
	Scanner input = new Scanner(System.in);
	static String numberSelection;



	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.kinematics();

	}

	public void kinematics(){


		String ivelocity;
		String fvelocity;
		String acceleration;
		String time;
		String displacement;
		System.out.println("Input x for unknown values(only initial velocity works right now)");

		System.out.println("Enter initial velocity(meters per second): ");
		ivelocity = input.nextLine();
		System.out.println("Enter final velocity(meters per second): ");
		fvelocity = input.nextLine();
		System.out.println("Enter acceleration(meters per second squared): ");
		acceleration = input.nextLine();
		System.out.println("Enter time(seconds): ");
		time = input.nextLine();
		System.out.println("Enter displacement(meters): ");
		displacement = input.nextLine();
		//sorry for bad var names

		if (ivelocity.equals("x") && displacement.equals("x")){
			float finalv = Float.parseFloat(fvelocity);
			float acc = Float.parseFloat(acceleration);
			float sec = Float.parseFloat(time);


			float initial = finalv - acc*sec;
			System.out.println(initial);

		}

		else if (ivelocity.equals("x") && acceleration.equals("x")){
			float finalv = Float.parseFloat(fvelocity);
			float sec = Float.parseFloat(time);
			float dis = Float.parseFloat(displacement);

			float initial = ((2*dis)/sec) - finalv;
			System.out.println(initial);

		}

		else if (ivelocity.equals("x") && fvelocity.equals("x") ){
			float sec = Float.parseFloat(time);
			float dis = Float.parseFloat(displacement);
			float acc = Float.parseFloat(acceleration);

			float initial = (dis/sec)-((acc*sec)/2);
			System.out.println(initial);

		}


		else if(ivelocity.equals("x") && time.equals("x")) {

			float finalv = Float.parseFloat(fvelocity);
			float dis = Float.parseFloat(displacement);
			float acc = Float.parseFloat(acceleration);

			float initial = (float) Math.sqrt((finalv*finalv - (2*acc*dis)));
			System.out.println(initial);


		}
		
		else if(ivelocity.equals("x")) {
			float sec = Float.parseFloat(time);
			float finalv = Float.parseFloat(fvelocity);
			float acc = Float.parseFloat(acceleration);
			
			float initial = finalv -sec*acc;
			System.out.println(initial);
		}
		
		
			
			
		
		

	}

}
