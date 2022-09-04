package br.com.htapp.http.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthDTO {

    @ApiModelProperty(example = "sample@gmail.com")
    private String email;
    @ApiModelProperty(example = "123456")
    private String password;
}
