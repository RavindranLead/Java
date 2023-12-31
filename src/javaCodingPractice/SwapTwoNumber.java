package javaCodingPractice;

public class SwapTwoNumber {

	public static void main(String[] args) {

		int mySalary = 100;
		int managerSalary= 50;

		System.out.println("Before Swapp" + "My Salary : " + mySalary);
		System.out.println("Before Swapp" + "Manager Salary : " + managerSalary);



		System.out.println("-------------------------------------------------------");


		int temp=mySalary;
		mySalary = managerSalary;
		managerSalary=temp;
		System.out.println("After Swapp" + "My Salary : " + mySalary);
		System.out.println("After Swapp" + "Manager Salary : " + managerSalary);


	}

}
