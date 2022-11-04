package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import entidade.DadosDosPacientes;
import entidade.LoginCheckout;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("O(a) paciente foi diagnosticado positivo para COVID-19? s/n: ");
		char paciente = sc.next().charAt(0);
		System.out.println();
		if (paciente == 's') {
			System.out.println("Por favor, informe o seu login (USUÁRIO EM LETRA minúscula): ");
			System.out.println();
			System.out.print("Usuário: ");
			String usuario = sc.next();
			System.out.print("Senha: ");
			String senha = sc.next();

			LoginCheckout loginCheckout = new LoginCheckout(usuario, senha);

			if (loginCheckout.login() == true) {
				System.out.println();
				System.out.print("Informe o Nome completo do(a) paciente: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Informe o CPF do(a) paciente: ");
				String cpf = sc.nextLine();
				System.out.print("Informe o Telefone do(a) paciente: ");
				String telefone = sc.nextLine();
				System.out.print("Informe o Nome da Rua/Avenida do(a) paciente: ");
				String endereco1 = sc.nextLine();
				System.out.print("Informe o Número da casa do(a) paciente: ");
				String endereco2 = sc.next();
				System.out.print("Informe a Data de Nascimento do(a) paciente: ");
				LocalDate nascimento = LocalDate.parse(sc.next(), formato);
				System.out.print("Informe o Email do(a) paciente: ");
				String email = sc.next();
				System.out.print("Informe a Data de Diagnostico do(a) paciente: ");
				LocalDate diagnostico = LocalDate.parse(sc.next(), formato);
				System.out.print("O(a) paciente tem Comorbidades? s/n: ");

				char comorbidade1 = sc.next().charAt(0);
				long idade1 = ChronoUnit.YEARS.between(nascimento, LocalDate.now());

				if (comorbidade1 == 's') {
					System.out.print("Quais? ");
					sc.nextLine();
					String comorbidade2 = sc.nextLine();
					System.out.println();

					DadosDosPacientes dados = new DadosDosPacientes(nome, cpf, telefone, endereco1, endereco2,
							nascimento, email, diagnostico, comorbidade2);

					System.out.println(dados);
				}

				else if (idade1 >= 65 && comorbidade1 == 'n') {
					System.out.println();
					String comorbidade2 = "O(a) paciente não possui comorbidades";

					DadosDosPacientes dados = new DadosDosPacientes(nome, cpf, telefone, endereco1, endereco2,
							nascimento, email, diagnostico, comorbidade2);

					System.out.println(dados);
				}

				else {
					System.out.println();
					System.out.println("Programa encerrado!");
				}
			}

			else {
				System.out.println();
				System.out.println("Login/Senha incorreto!");
			}

		}

		else {
			System.out.println("Programa encerrado!");
		}

		sc.close();
	}
}