package com.classification.client_classification.repository;

import com.classification.client_classification.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByName(String name);
    List<Client> findByClassify(String Classify);


}
