package tr.com.obss.jss.petclinic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.jss.petclinic.model.Admin;
import tr.com.obss.jss.petclinic.repository.AdminRepository;
import tr.com.obss.jss.petclinic.service.AdminService;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin createNewAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> searchAdminsByName(String name) {
        return null;
    }

    @Override
    public Admin findById(Long adminId) {
        return null;
    }
}
