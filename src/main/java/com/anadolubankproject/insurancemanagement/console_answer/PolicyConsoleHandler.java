package com.anadolubankproject.insurancemanagement.console_answer;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.anadolubankproject.insurancemanagement.entity.Policy;
import com.anadolubankproject.insurancemanagement.service.IPolicyService;
import com.anadolubankproject.insurancemanagement.service.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class PolicyConsoleHandler {


	public static Scanner input = new Scanner(System.in);

	private IPolicyService policyService;

	@Autowired
	public PolicyConsoleHandler(IPolicyService policyService) {
		super();
		this.policyService = policyService;
	}

	/*
	 * - Kullanıcı geçmiş dönemlere ait finansal verilere ulaşabilecektir. Kullanıcı
	 * geçmiş döneme ait verilere tablo formatında erişebilmeli veya PL/SQL
	 * sorgulama dili kullanarak erişebilmelidir.
	 */


	public void tableFinanceData() {

		List<Policy> policyList = policyService.findAll();

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Total Earning | Profit Earning | Start Date | End Date | Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < policyList.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-14s | %-11s| %-9s| %-11s | %-10s |\n",
					policyList.get(i).getId(), policyList.get(i).getTotalEarnings(),
					policyList.get(i).getProfitEarning(), policyList.get(i).getStartingDate(),
					policyList.get(i).getEndDate(), policyList.get(i).getCustomer().getId(),
					policyList.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	/* - Kullanıcı geçmiş döneme ilişkin verileri kullanarak tablo görünümünde rapor oluşturabilmelidir.
	 */
	public void makeReportTable() {

		List<Policy> policyList = policyService.findAll();
		List<Policy> policyListFilter = new ArrayList<>();

		System.out.println("Please select the start date.(Make the report from started date)");
		int cevap = input.nextInt();
		input.hasNextLine();
		for (int i = 0; i < policyList.size(); i++) {
			if (policyList.get(i).getStartingDate() >= cevap) {
				policyListFilter.add(policyList.get(i));
			}
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Total Earning | Profit Earning | Start Date | End Date | Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < policyListFilter.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-14s | %-11s| %-9s| %-11s | %-10s |\n",
					policyListFilter.get(i).getId(), policyListFilter.get(i).getTotalEarnings(),
					policyListFilter.get(i).getProfitEarning(), policyListFilter.get(i).getStartingDate(),
					policyListFilter.get(i).getEndDate(), policyListFilter.get(i).getCustomer().getId(),
					policyListFilter.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
	/* - Kullanıcı geçmiş döneme ilişkin verileri birbirleriyle karşılaştırabilmelidir.
	 */
	public void compareData() {
		List<Policy> policyList = policyService.findAll();
		List<Integer> listOfIndex = new ArrayList<>();

		System.out.println("How many comparison you want to do ? ");
		int cevap = input.nextInt();
		input.nextLine();

		System.out.println("Enter the comparison ID number .");

		for (int i = 0; i < cevap; i++) {
			int id_deger = input.nextInt();
			listOfIndex.add(id_deger);
		}

		List<Policy> selectedPolicy = new ArrayList<>();

		for (int i = 0; i < listOfIndex.size(); i++) {
			if (policyService.getPolicyById(listOfIndex.get(i)) != null) {
				selectedPolicy.add(policyService.getPolicyById(listOfIndex.get(i)).get());
			}
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"| ID  | Total Earning | Profit Earning | Start Date | End Date | Customer ID | Agent ID   |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < selectedPolicy.size(); i++) {

			System.out.printf("| %-3s | %-14s| %-14s | %-11s| %-9s| %-11s | %-10s |\n",
					selectedPolicy.get(i).getId(), selectedPolicy.get(i).getTotalEarnings(),
					selectedPolicy.get(i).getProfitEarning(), selectedPolicy.get(i).getStartingDate(),
					selectedPolicy.get(i).getEndDate(), selectedPolicy.get(i).getCustomer().getId(),
					selectedPolicy.get(i).getAgent().getId());

		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	/* - Kullanıcı geçmiş döneme ait verileri grafik üzerinde görebilmelidir.
	*/
}
