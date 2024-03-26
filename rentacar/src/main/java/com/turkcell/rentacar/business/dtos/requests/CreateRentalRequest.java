package com.turkcell.rentacar.business.dtos.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateRentalRequest {
    @NotNull
    private int carId;

    @NotNull
    private int customerId;

    @NotNull
    private LocalDate returnDate;

    private List<CreateRentalExtraWithRentalRequest> extras;

    @NotNull
    private CreditCardPaymentRequest creditCardPaymentRequest; //todo: type birden çok ödeme sistemine uygun hale getirilebilir
}
