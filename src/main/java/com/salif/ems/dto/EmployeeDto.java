package com.salif.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Note=> dto is used to trnasfer data btn a client and a server
public class EmployeeDto {
    private Long id;
    private String firstName;
    private  String lastName;
    private String email;

}
