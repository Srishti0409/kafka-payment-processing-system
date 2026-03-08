package com.srishti.payment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.srishti.payment_system.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}