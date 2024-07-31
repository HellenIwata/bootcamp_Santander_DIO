package com.classification.client_classification.service;

import com.classification.client_classification.model.Client;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;

/**
 * Service implementado para classificar os clientes com base no tempo de cadastro e no consumo total mensal
 */

@Service
public class ClientClassificationService {

    public void classifyClient(Client client){
        LocalDate currentDate = LocalDate.now();
        LocalDate registrationDate = client.getRegistrationDate();
        Double totalMonthlyConsum = client.getTotalMonthlyConsum();

        long monthsSinceRegistration = registrationDate.until(currentDate).toTotalMonths();

        //Criando a lógica para a classificação dos clientes

        if (monthsSinceRegistration >= 120 && totalMonthlyConsum >= 500) {
            client.setClassify("Black");
            client.setGift("Vale-presente no valor de R$ 350,00");
        } else if(monthsSinceRegistration >= 60 && totalMonthlyConsum >= 350){
            client.setClassify("Platinum");
            client.setGift("Vale-presente no valor de R$ 150,00");
        } else if (monthsSinceRegistration >= 30 && totalMonthlyConsum >= 100) {
            client.setClassify("Gold");
            client.setGift("Voucher de descontro de 45% em qualquer produto da Loja");
        }else if(monthsSinceRegistration >= 15 && totalMonthlyConsum >= 50){
            client.setClassify("Silver");
            client.setGift("Par de ingresso para o cinema");
        } else{
            client.setClassify("Bronze");
            client.setGift("Voucher de desconto de 5% em qualquer produto da Loja");
        }
    }

    @Autowired
    private ClientRepository ClientRepository;
    public Lsit<Client> findByName(String name){
        return ClientRepository.findByName(name);
    }
    public Lsit<Client> findByClassify(String classify){
        return ClientRepository.findByClassify(classify);
    }

}
