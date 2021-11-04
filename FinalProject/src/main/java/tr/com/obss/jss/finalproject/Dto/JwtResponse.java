package tr.com.obss.jss.finalproject.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Builder
public class JwtResponse {

    private String token;

    @Builder.Default
    private String type = "Bearer";

    private Long id;

    private String username;

    private String email;

    private List<String> roles;

}
