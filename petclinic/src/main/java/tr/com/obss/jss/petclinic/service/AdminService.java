package tr.com.obss.jss.petclinic.service;

import tr.com.obss.jss.petclinic.model.Admin;

import java.util.List;

public interface AdminService {

    Admin createNewAdmin(Admin admin);

    List<Admin> searchAdminsByName(String name);

    Admin findById(Long adminId);
}
