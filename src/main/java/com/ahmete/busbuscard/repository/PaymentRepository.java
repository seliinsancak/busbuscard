package com.ahmete.busbuscard.repository;

import com.ahmete.busbuscard.entity.Payment;
import com.ahmete.busbuscard.views.VwLatestPayment;
import com.ahmete.busbuscard.views.VwPaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	@Query("select new com.ahmete.busbuscard.views.VwPaymentDetail(p.amount, p.transport,p.paymentDate) from Payment p where p.cardId = :cardId")
	List<VwPaymentDetail> getAllPaymentDetailByCardId(Long cardId);

	@Query("select new com.ahmete.busbuscard.views.VwLatestPayment(p.paymentDate, p.amount) from Payment p where p.cardId = :cardId order by p.paymentDate desc limit 1")
	Optional<VwLatestPayment> findLatestPaymentDateAndAmountByCardId(Long cardId);
}