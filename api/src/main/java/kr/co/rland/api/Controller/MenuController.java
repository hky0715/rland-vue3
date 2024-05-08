package kr.co.rland.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rland.api.Repository.MenuRepository;

@RestController
@RequestMapping("menus")
public class MenuController {
    
    /* api의 업무로직은 어디에 있을까? api는 업무를 갖고있는게 아님. api는 그냥 정보를 던져줄뿐! 
       즉, 로직은 client에 있음. 사용자의 행위를 담당하는 부분에서 로직을 담당해야함!
       로직이 너무 복잡하다면 backend 쓰세용..
    */
    @Autowired
    private MenuRepository repository;
    
    @GetMapping
    public String list() {
        return "";
    }

    // menus/2
    @GetMapping("menus/{id}")
    public String item(@PathVariable Long id) {
        return "";
    }

    @PutMapping
    public String save() {
        return "";
    }
}


