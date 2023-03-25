package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.User;
import com.Blanco.Portfolio.repository.RUser;
import com.Blanco.Portfolio.service.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SUserImpl implements SUser {

    @Autowired
    private RUser rUser;
    @Override
    public User createUser(User user) {
        return rUser.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) rUser.findAll();
    }

    @Override
    public User getUser(long id) {
        return rUser.findById(id).get();
    }

    @Override
    public void deleteUser(long id) {
        rUser.deleteById(id);
    }

    @Override
    public User updateUser(User user, long id) {
        User user1 = rUser.findById(id).get();
        user1.setName(user.getName());
        user1.setLastname(user.getLastname());
        user1.setTitle(user.getTitle());
        user1.setAboutMe(user.getAboutMe());
        user1.setProfileImg(user.getProfileImg());
        user1.setBannerImg(user.getBannerImg());
        user1.setJobImg(user.getJobImg());
        user1.setStudyImg(user.getStudyImg());
        return rUser.save(user1);
    }
}