package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i;

		Champion cA;
		Champion cB;

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nameA = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeA = sc.nextInt();
		System.out.print("Ataque: ");
		int attackA = sc.nextInt();
		System.out.print("Armadura: ");
		int armorA = sc.nextInt();
		System.out.println();
		cA = new Champion(nameA, lifeA, attackA, armorA);

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameB = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeB = sc.nextInt();
		System.out.print("Ataque: ");
		int attackB = sc.nextInt();
		System.out.print("Armadura: ");
		int armorB = sc.nextInt();
		System.out.println();
		cB = new Champion(nameB, lifeB, attackB, armorB);

		cA.takeDamage(cB);
		cB.takeDamage(cA);

		System.out.print("Quantos turnos você deseja executar? ");
		n = sc.nextInt();
		
		System.out.println(cA.getLife());
		System.out.println(cB.getLife());

		for (i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ":");
			if (cA.getLife() != 0 && cB.getLife() != 0) {
				System.out.println(cA.getLife());
				System.out.println(cB.getLife());
			} else {
				System.out.println("FIM DO COMBATE");
			}
			
		}
		System.out.println("FIM DO COMBATE");

		
		sc.close();
	}

}
