package com.javapractice;

public class ParameterizedConstructor {

	String doctorName;
	String doctorSpecilization;



	public ParameterizedConstructor(String name,String specialization) {
		doctorName=name;
		doctorSpecilization=specialization;

	}

	private void sayAboutDoctor() {
		System.out.println("The doctor name is  " + doctorName + ". he is specialized in " + doctorSpecilization);

	}



	public static void main(String[] args) {

		ParameterizedConstructor constructor = new ParameterizedConstructor
				("Arjun", "Dermatology");
		constructor.sayAboutDoctor();
		
		ParameterizedConstructor constructor1 = new ParameterizedConstructor
				("Ravi", "Oncology");
		constructor1.sayAboutDoctor();
		
	}

}
