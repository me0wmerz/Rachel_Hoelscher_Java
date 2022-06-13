package com.gamesRus.com.gamesRusInvoicing.repository;

import com.gamesRus.com.gamesRusInvoicing.model.ProcessingFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingFeeRepository extends JpaRepository<ProcessingFee, String> {
}

