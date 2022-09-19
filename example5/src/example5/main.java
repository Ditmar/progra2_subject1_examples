package example5;

import java.util.Scanner;

import manager.ManagerGrades;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String option;
		ManagerGrades manager = new ManagerGrades();
		
		do {
			showOptions();
			option = scanner.nextLine();
			if (option.equals("1")) {
				String grade = scanner.nextLine();
				manager.addGrade(Integer.parseInt(grade));
			} else if (option.equals("2")) {
				manager.showApproved();
			} else if (option.equals("3")) {
				Integer average = manager.getAverage();
				System.out.println("EL promedio es " + average);
			} else if (option.equals("4")) {
				manager.showGrades();
			}
		} while(!option.equals("5"));
	
	}
	public static void showOptions() {
		System.out.println("1) Agregar Nota");
		System.out.println("2) Ver aprobados ");
		System.out.println("3) Ver promedio");
		System.out.println("4) Ver Notas");
		System.out.println("5) Salir");
	}

}
