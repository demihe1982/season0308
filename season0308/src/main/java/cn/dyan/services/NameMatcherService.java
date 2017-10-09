package cn.dyan.services;

import cn.dyan.domain.Menu;
import cn.dyan.mapping.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameMatcherService {

    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> queryAll(){
        return menuMapper.selectAll();
    }
    public void addMenu(Menu menu){
        menuMapper.insert(menu);
    }

}
