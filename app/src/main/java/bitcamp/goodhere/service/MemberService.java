package bitcamp.goodhere.service;

import java.util.List;

public interface MemberService {

  void add(Member member);

  List<Member> list();

  Member get(int no);

  Member get(String email, String password);

  void update(Member member);

  void delete(int no);
}





