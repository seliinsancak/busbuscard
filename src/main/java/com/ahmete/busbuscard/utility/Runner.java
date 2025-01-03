package com.ahmete.busbuscard.utility;

import com.ahmete.busbuscard.entity.*;
import com.ahmete.busbuscard.service.*;
import com.ahmete.busbuscard.utility.enums.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.sql.ParameterMetaData;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class Runner implements ApplicationRunner {

    private final UserService userService;
    private final CardService cardService;
    private final JgovService jgovService;
    private final PaymentService paymentService;
    private final TransactionService transactionService;

//    @PostConstruct
//    public void init() {}

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        userService.save(User.builder()
//                .name("Ahmet")
//                .surname("Kaya")
//                .gender(EGender.MALE)
//                .tc("11223322114")
//                .build());
//        cardService.save(Card.builder()
//                .balance(0L)
//                .type(ECardType.EYT)
//                .expiryDate(LocalDate.of(2025,10,19))
//                .build());
//        jgovService.save(Jgov.builder()
//                        .cardId(1L)
//                        .userId(1L)
//                        .address("ABC")
//                        .title(ETitle.CIVIL)
//               .build());
//        transactionService.addMoney(Transaction.builder()
//                        .cardId(1L)
//                        .amount(100L)
//                        .transactionType(ETransactionType.CASH)
//                .build());
//        paymentService.payTicket(Payment.builder()
//                        .cardId(1L)
//                        .amount(10L)
//                        .transport(ETransportType.HIGHWAY)
//                .build());
    }
}
