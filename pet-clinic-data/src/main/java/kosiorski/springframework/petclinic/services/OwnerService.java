package kosiorski.springframework.petclinic.services;

import kosiorski.springframework.petclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);


}
