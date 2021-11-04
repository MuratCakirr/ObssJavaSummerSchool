package tr.com.obss.jss.finalproject.Service;

import tr.com.obss.jss.finalproject.Model.Role;
import tr.com.obss.jss.finalproject.Model.RoleType;

public interface RoleService {

    Role findByName(RoleType name);
}
