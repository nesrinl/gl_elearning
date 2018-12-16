package org.mql.crudrepositories;

import org.mql.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Integer>{

}
