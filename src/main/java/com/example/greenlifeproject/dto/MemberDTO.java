package com.example.greenlifeproject.dto;

import com.example.greenlifeproject.constant.Role;
import com.example.greenlifeproject.entity.MemberEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class MemberDTO {

    private Long id;
    
    @NotBlank(message = "이름은 필수값 입니다.")
    private String name;

    @NotEmpty(message = "이메일은 필수값 입니다.")
    private String email;

    @NotEmpty(message = "주소는 필수값 입니다.")
    private String address;

    @NotEmpty(message = "비밀번호는 필수값 입니다.")
    private String password;

    @NotEmpty(message = "휴대폰 번호는 필수값 입니다.")
    private String phoneNumber;

    @NotEmpty(message = "생년 월일은 필수값 입니다.")
    private String birthDate;
    
    private Role role;

    public static MemberEntity convertToMemberEntity(MemberDTO memberDTO) {
        MemberEntity member = new MemberEntity();
        member.setId(memberDTO.getId());
        member.setName(memberDTO.getName());
        member.setEmail(memberDTO.getEmail());
        member.setPassword(memberDTO.getPassword());
        member.setAddress(memberDTO.getAddress());
        member.setPhoneNumber(memberDTO.getPhoneNumber());
        member.setBirthDate(memberDTO.getBirthDate());
        member.setRole(Role.USER);//유저값으로 설정해둠
        return member;
    }

}