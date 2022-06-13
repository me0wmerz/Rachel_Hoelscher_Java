package com.gamesRus.com.gamesRusInvoicing.repository;

import com.gamesRus.com.gamesRusInvoicing.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
}
