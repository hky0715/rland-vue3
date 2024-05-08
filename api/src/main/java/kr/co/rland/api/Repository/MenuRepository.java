package kr.co.rland.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.rland.api.entity.Menu;

/* JPA를 사용하려면 JPARepository를 상속해야함!!!!! 
 * interface가 interface를 상속받을 수 있지!!!!! 빚을 떠안자! 
 * JPARepository가 정의해놓은 것을 그대로 써야한다! 
 * */
public interface MenuRepository extends JpaRepository<Menu, Long> {
    
}
