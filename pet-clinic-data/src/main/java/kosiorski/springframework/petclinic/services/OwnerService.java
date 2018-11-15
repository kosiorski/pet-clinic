package kosiorski.springframework.petclinic.services;


import kosiorski.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
