package com.atividademod42.errorhandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationErro extends ApiSubError {
	 private String object;
	 private String field;
	 private Object rejectedValue;
	 private String message;

	   ApiValidationErro(String object, String message) {
	      this.object = object;
	      this.message = message;
	   }
}
