package com.assessment.assescor;

import com.assessment.assescor.helper.CSVHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class CSVService {

    @Autowired
    private UserRepository repository;

    public void save(MultipartFile file){
        try{
            List<User> users = CSVHelper.csvToUsers(file.getInputStream());
            repository.saveAll(users);
        } catch (IOException e) {
            throw new RuntimeException("Fail to store the CSV data " + e.getMessage());
        }
    }

    public ByteArrayInputStream load(){
        List<User> users = (List<User>) repository.findAll();
        ByteArrayInputStream in = (ByteArrayInputStream) CSVHelper.csvToUsers((InputStream) users);
        return in;
    }

    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }

    public Optional<User> getUserById(Long Id){
        return repository.findById(Id);
    }

    public List<User> getUsersByColor(String Color){
        return repository.findBymColor(Color);
    }
}
