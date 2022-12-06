package com.exampleChecking.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository <Account, Long> {

}
