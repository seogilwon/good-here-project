package bitcamp.goodhere.service;

import java.util.List;
import bitcamp.goodhere.vo.Student;

public interface StudentService {
  void add(Student student);
  List<Student> list(String keyword);
  Student get(int no);
  Student get(String email, String password);
  Student get(String email);
  void update(Student student);
  void delete(int no);
}





