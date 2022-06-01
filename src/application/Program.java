package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Client> clients = new ArrayList<>();
		
		System.out.print("Enter client's name: ");
		String clientName = sc.next();
		System.out.print("Enter client's CPF: ");
		int clientCpf = sc.nextInt();
		clients.add(new Client(clientName, clientCpf));
		
		sc.close();
	}

}
