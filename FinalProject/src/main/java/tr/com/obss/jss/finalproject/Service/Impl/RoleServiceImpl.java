package tr.com.obss.jss.finalproject.Service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tr.com.obss.jss.finalproject.DAO.RoleRepository;
import tr.com.obss.jss.finalproject.Exception.RoleNotFoundException;
import tr.com.obss.jss.finalproject.Model.Role;
import tr.com.obss.jss.finalproject.Model.RoleType;
import tr.com.obss.jss.finalproject.Service.RoleService;

import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role findByName(RoleType name) {
        Objects.requireNonNull(name, "role name cannot be null");
        return roleRepository.findByName(name).orElseThrow(RoleNotFoundException::new);
    }
}
