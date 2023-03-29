package com.mobo.mobobank.Package;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PROJECT :: Mobobank
 * AUTHOR :: sboniface
 */

/***
 * @MockApplication rest controller class.
 * @/get-balance api mocks a balance request api that returns the clients balance response that is
 * @actual_balance and
 * @available_balance .
 */
@RestController
@RequestMapping("/mobo/api/v1")
public class Controller {
    /***
     *
     * @param dto
     * @return response(client actual_balance and available_balance).
     * @POST request
     */
    @PostMapping("/get-balance")
    public ResponseEntity<DTO> getBalance(@RequestBody DTO dto){
        try {
            DTO response = new DTO();
            response.setActual_balance(500);
            response.setAvailable_balance(500);
            response.setAmount(dto.getAmount());
            response.setNarration(dto.getNarration());
            response.setPhone_number(dto.getPhone_number());
            response.setTransaction_code(dto.getTransaction_code());
            response.setTransaction_reference(dto.getTransaction_reference());

            return ResponseEntity.ok(response);
        }
        catch (Exception ex){
            return (ResponseEntity<DTO>) ResponseEntity.badRequest();
        }

    }
}
