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
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		cA = new Champion(name, life, attack, armor);

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		System.out.println();
		cB = new Champion(name, life, attack, armor);

		System.out.print("Quantos turnos você deseja executar? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			if (cA.getLife() <= 0 || cB.getLife() <= 0) {
				break;
			} else {
				System.out.println();
				System.out.println("Resultado do turno " + (i + 1) + ":");
				cA.takeDamage(cB);
				cB.takeDamage(cA);
				System.out.println(cA.getLife());
				System.out.println(cB.getLife());
			}
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
