package com.tayoNew.tayopr.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateForm {
	@NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String name;
	
	@NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;
	
	@Size(min = 8, max = 20)
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;

	@Size(min = 8, max = 20)
    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String checkpw;
}
