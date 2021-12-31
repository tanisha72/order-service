package com.ibm.order.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidateTokenResponseBody {

    @JsonProperty("IsValid")
	private boolean isValid;
    
    @JsonProperty("UserId")
    private int userId;
}
