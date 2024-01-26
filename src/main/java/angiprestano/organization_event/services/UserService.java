package angiprestano.organization_event.services;

import angiprestano.organization_event.entities.NormalUser;
import angiprestano.organization_event.exceptions.BadRequestException;
import angiprestano.organization_event.exceptions.NotFoundException;
import angiprestano.organization_event.payloads.UserDTO;
import angiprestano.organization_event.repository.NormalUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private NormalUserDAO normalUserDAO;
    public Page<NormalUser> getUser(int page, int size, String orderBy){
        Pageable pageable= PageRequest.of(page,size, Sort.by(orderBy));
        return normalUserDAO.findAll(pageable);
    }
    public NormalUser findById(UUID id) {
        return normalUserDAO.findById(id).orElseThrow(()-> new NotFoundException(id));
    }
    public NormalUser save(UserDTO body){
        normalUserDAO.findByEmail(body.email()).ifPresent(user -> {
            throw new BadRequestException("L'email " + user.getPassword() + " è già in uso!");
        });
        NormalUser newUser = new NormalUser();
        newUser.getName(body.name());
        newUser.getSurname(body.surname());
        newUser.setEmail(body.email());
        newUser.setPassowrd(body.password());
        return normalUserDAO.save(newUser);
    }
    public NormalUser findByIdAndUpdate(UUID id, NormalUser body){
        NormalUser found=this.findById(id);
        found.getName(body.getName());
        found.setSurname(body.getSurname());
        found.setEmail(body.getEmail());
        return normalUserDAO.save(found);
    }
    public void findByIdAndDelete(UUID id){
        NormalUser found=this.findById(id);
        this.normalUserDAO.delete(found);
    }

    public NormalUser findByEmail(String email)throws NotFoundException {
        return normalUserDAO.findByEmail(email).orElseThrow(()->new NotFoundException("User with email" + email + "it was trovated!"));
    }
}
