package com.tayoNew.tayopr;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tayoNew.tayopr.company.Company;
import com.tayoNew.tayopr.company.CompanyRepository;
import com.tayoNew.tayopr.member.Member;
import com.tayoNew.tayopr.member.MemberRepository;
import com.tayoNew.tayopr.organization.Organization;
import com.tayoNew.tayopr.organization.OrganizationRepository;


@SpringBootTest
class TayoNewApplicationTests {
	@Autowired
	   private MemberRepository memberRepository;
	@Autowired
	   private CompanyRepository companyRepository;
	@Autowired
	   private OrganizationRepository organizationRepository;
	   
	   @Test
	   void testJpa() {
	      LocalDateTime now = LocalDateTime.now();
	      Date date = Timestamp.valueOf(now);
	      
	      Optional<Company> company = companyRepository.findById((long) 1);
	      Optional<Organization> organization = organizationRepository.findById((long) 1);
	      Member m1 = new Member();
	      m1.setName("김민성");
	      m1.setEmail("minseong1202@naver.com");
	      m1.setPassword("1234");
	      m1.setPhone("01093182782");
	      m1.setCompany(company.get());
	      m1.setOrganization(organization.get());
	      m1.setRankName("부장");
	      m1.setRegistDate(date);
	      this.memberRepository.save(m1);
	      Member m2 = new Member();
	      m2.setName("우태균");
	      m2.setEmail("wootaekyun10@gmail.com");
	      m2.setPassword("1234");
	      m2.setPhone("01065008783");
	      m2.setCompany(company.get());
	      m2.setOrganization(organization.get());
	      m2.setRankName("신");
	      m2.setRegistDate(date);
	      this.memberRepository.save(m2);
	      Member m3 = new Member();
	      m3.setName("이태호");
	      m3.setEmail("zzdlxoghzz11@gmail.com");
	      m3.setPassword("1234");
	      m3.setPhone("01048982821");
	      m3.setCompany(company.get());
	      m3.setOrganization(organization.get());
	      m3.setRankName("과장");
	      m3.setRegistDate(date);
	      this.memberRepository.save(m3);
	      
	      
	      for(int i = 1; i<10; i++) {
	         Member mem = new Member();
	         mem.setName(String.format("사람[%d]", i));
	         mem.setEmail(String.format("newperson[%d]@gmail.com", i));
	         mem.setPassword("1234");
	         mem.setPhone(String.format("010[%d]", i*11111111));
	         mem.setCompany(company.get());
	         mem.setOrganization(organization.get());
	         mem.setRankName("직원");
	         mem.setRegistDate(date);
	         this.memberRepository.save(mem);
	      }
	   }
}
