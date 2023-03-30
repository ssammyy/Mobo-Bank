package com.mobobankapi.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * PROJECT :: Mobobank
 * AUTHOR :: sboniface
 */

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DTO {
    private String transaction_reference;
    private String transaction_code;
    private String amount;
    private String narration;
    private String phone_number;
    private Integer actual_balance;
    private Integer available_balance;


}
