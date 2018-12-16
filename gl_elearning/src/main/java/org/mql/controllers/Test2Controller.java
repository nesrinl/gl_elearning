package org.mql.controllers;


import org.mql.crudrepositories.FormationRepository;
import org.mql.crudrepositories.MemberRepository;
import org.mql.models.Following;
import org.mql.models.Formation;
import org.mql.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private FormationRepository formationRepository;

	@GetMapping(path = "/testingAdd") // Map ONLY GET Requests
	public @ResponseBody String addNewUser() {

		Member member1 = new Member();
		member1.setFirstName("Khalid");
		member1.setLastName("Chahboune");
		
		
		
		Member member2 = new Member();
		member2.setFirstName("Omar");
		member2.setLastName("Moussamih");
		
		
		Formation formation1 = new Formation();
		formation1.setTitle("Informatique S1");
		
		
		Formation formation2 = new Formation();
		formation2.setTitle("Math S3");
		
		
		formationRepository.save(formation1);
		formationRepository.save(formation2);
		
		
		
		
		memberRepository.save(member1);
		memberRepository.save(member2);
		
		
		return "Saved";
	}

	@GetMapping(path = "/testingShowAll")
	public @ResponseBody String getAllUsers() {

		return memberRepository.findAll().toString();
		
	}
	
	@GetMapping(path = "/testingCount")
	public @ResponseBody long count() {

		return memberRepository.count();
		
	}
	
	@GetMapping(path = "/testingManyToMany")
	public @ResponseBody String ManyToMany() {
		Member member = memberRepository.findById(1).get();
		Formation formation = formationRepository.findById(1).get();
		Following following = new Following();
		following.setFormation(formation);
		following.setMember(member);
		member.addFollowing(following);
		System.out.println(member);
		memberRepository.save(member);
		System.out.println(member);
		Following following2 = new Following();
		following2.setMember(member);
		following2.setFormation(formationRepository.findById(2).get());
		member.addFollowing(following2);
		
		memberRepository.save(member);
		
		return memberRepository.findAll().toString();
	}
}
