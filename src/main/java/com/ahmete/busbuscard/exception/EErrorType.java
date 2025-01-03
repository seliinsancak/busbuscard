package com.ahmete.busbuscard.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum EErrorType {

	VALIDATION_ERROR(400,"girilen parametreler hatalıdır. Lütfen kontrol ederek tekrar deneyin.",HttpStatus.BAD_REQUEST),
	INTERNAL_SERVER_ERROR(500,"Sunucuda beklenmeyen bir hata oldu. Lütfen tekrar deneyin",HttpStatus.INTERNAL_SERVER_ERROR),

	USER_NOT_FOUND(1001,"Kullanıcı bulunamadı.",HttpStatus.BAD_REQUEST),
	NOT_UNIQUE_TC(1002,"TC kimlik kayıtlıdır! Lütfen tekrar deneyiniz", HttpStatus.BAD_REQUEST),


	INSUFFICIENT_BALANCE_ERROR(5001, "Yetersiz bakiye hatası", HttpStatus.BAD_REQUEST),
	CARD_NOT_FOUND_ERROR(5002,"Kart bulunamadı hatası",HttpStatus.BAD_REQUEST),
	OUT_OF_CARD_ANONYMOUS_ERROR(5003, "Kartlar tükendi hatası ", HttpStatus.BAD_REQUEST),
	OVER_REQUEST_CARD_ERROR(5004,"Fazla kart istek hatası",HttpStatus.BAD_REQUEST),
	INVALID_CARD_ERROR(5005,"Geçersiz  kart hatası",HttpStatus.BAD_REQUEST),

	BANK_CARD_EXPIRY_DATE_ERROR(6001,"Banka kart tarih hatası",HttpStatus.BAD_REQUEST),
	TRANSACTION_INSUFFICIENT_BALANCE(6002,"Para yüklenemedi yetersiz bakiye hatası",HttpStatus.BAD_REQUEST),
	TRANSACTION_OUT_OF_BOUNDS(6012,"Para yükleme kota aşımı hatası",HttpStatus.BAD_REQUEST),


	TRANSPORT_NOT_FOUND_ERROR(7001, "Araç bulunamadı! Ulaşım aracı oluşturun", HttpStatus.BAD_REQUEST),
	TRANSPORT_ALREADY_IN_USER_ERROR(7002, "Araç başka şöför tarafından kullanılmakta!", HttpStatus.BAD_REQUEST),

	PERSONNEL_NOT_FOUND_ERROR(8001, "Personeller yok! Personnel atama işlemi yapınız!", HttpStatus.BAD_REQUEST),
	WRONG_PERSONNEL_CARD_ERROR(8002, "aKü YoK BaBa?", HttpStatus.BAD_REQUEST),
	PERSONNEL_USING_ANOTHER_TRANSPORT(8003, "Yavaş la kaç tana alıyon?", HttpStatus.BAD_REQUEST),

	NO_SUCH_SHIFT_FOUND_ERROR(9001, "Böyle bir aktif şift yok!", HttpStatus.BAD_REQUEST);



	int code;
	String message;
	HttpStatus httpStatus;
}