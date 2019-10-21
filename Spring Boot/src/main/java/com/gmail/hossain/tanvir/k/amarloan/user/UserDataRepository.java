package com.gmail.hossain.tanvir.k.amarloan.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserDataModel, Integer> {
    public UserDataModel findByPhone(String phone);
}
