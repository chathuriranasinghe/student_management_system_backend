package com.SCTT.SMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

        private String indexNo;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String gender;
        private String email;
        private String address;
        private String nicNo;
        private String degree;
}
